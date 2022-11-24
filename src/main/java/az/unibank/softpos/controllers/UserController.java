package az.unibank.softpos.controllers;

import az.unibank.softpos.dto.User;
import az.unibank.softpos.dto.UserToken;
import az.unibank.softpos.security.JWTAuthorizationFilter;
import az.unibank.softpos.utils.Util;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Key;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequiredArgsConstructor

public class UserController {
    private final Util util;

    @PostMapping("user")
    public ResponseEntity<User> login(@RequestParam("user") String username, @RequestParam("password") String password) throws Exception {

        if (!util.getUser().equals(username)) {
            return ResponseEntity.status(400).build();
        }
        try {
            String token = getJWTToken(username, password);
            User user = new User();
            user.setUser(username);
            user.setToken(token);
            return ResponseEntity.ok(user);
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error(ex.getLocalizedMessage());
        }
        return null;
    }

    private Key getSigningKey(String password) {
        byte[] keyBytes = password.getBytes();
        return Keys.hmacShaKeyFor(keyBytes);
    }

    private String getJWTToken(String username, String password) throws Exception {
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
            ex.printStackTrace();
            log.error(ex.getLocalizedMessage());
        }

        return null;
    }

    @GetMapping(value = "user/check/token", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserToken> checkToken(HttpServletRequest request) {
        UserToken userToken = new UserToken();
        JWTAuthorizationFilter jwtAuthorizationFilter = new JWTAuthorizationFilter(util);
        Claims claims = jwtAuthorizationFilter.validateToken(request);
        if (claims.get("authorities") != null) {
            userToken.setResult(true);
        }
        return ResponseEntity.ok(userToken);
    }
}