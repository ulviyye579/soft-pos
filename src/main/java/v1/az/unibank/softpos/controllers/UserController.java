package v1.az.unibank.softpos.controllers;

import v1.az.unibank.softpos.dto.JwtToken;
import v1.az.unibank.softpos.dto.responses.User;
import v1.az.unibank.softpos.dto.responses.UserToken;
import v1.az.unibank.softpos.utils.Util;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.*;

import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final Util util;

    @PostMapping({"/v1.1", "/v1.2"})
    public ResponseEntity<User> login(@RequestParam("user") String username, @RequestParam("password") String password) {

        if (!util.getUser().equals(username)) {
            return ResponseEntity.status(400).build();
        }
        try {
            String token = getJWTToken(username, password);
            User user = new User();
            user.setUsername(username);
            user.setToken(token);
            return ResponseEntity.ok(user);
        } catch (Exception ex) {
            log.error(ex.getLocalizedMessage());
        }
        return null;
    }

    private Key getSigningKey(String password) {
        byte[] keyBytes = password.getBytes();
        return Keys.hmacShaKeyFor(keyBytes);
    }

    private String getJWTToken(String username, String password) {
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");
        try {
            String token = Jwts
                    .builder()
                    .setId("soft-pos")
                    .setSubject(username)
                    .claim("authorities",
                            grantedAuthorities.stream()
                                    .map(GrantedAuthority::getAuthority)
                                    .collect(Collectors.toList()))
                    .setIssuedAt(new Date(System.currentTimeMillis()))
                    .setExpiration(new Date(System.currentTimeMillis() + util.getTimeout()))
                    .signWith(getSigningKey(password), SignatureAlgorithm.HS256).compact();

            return "SOFT_POS_" + token;
        } catch (Exception ex) {
            log.error(ex.getLocalizedMessage());
        }

        return null;
    }

    @GetMapping({"/v1.1/check/token/{token}", "/v1.2/check/token/{token}"})
//    @GetMapping(value = "/check/token/{token}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserToken> checkTokenV2(@PathVariable String token) {
        UserToken userToken = new UserToken();
        try {
            String[] tokenParts = token.split("\\.");
            String jsonString = new String(Base64.getDecoder().decode(tokenParts[1].getBytes()));
            JwtToken jwtToken = util.unmarshal(jsonString);
            log.trace(jwtToken.toString());
            long expiry = Long.valueOf(jwtToken.getExp()) * 1000L;

            long dateNow = new Date().getTime();
            if (expiry > dateNow)
                userToken.setResult(true);
            return ResponseEntity.ok(userToken);
        } catch (Exception exception) {
            userToken.setResult(false);
            return ResponseEntity.ok(userToken);
        }
    }
}