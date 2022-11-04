package az.unibank.softpos.controllers;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import az.unibank.softpos.dto.User;
import az.unibank.softpos.utils.Util;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final Util util;

    @PostMapping("user")
    public ResponseEntity<User> login(@RequestParam("user") String username, @RequestParam("password") String password) {

        if (!util.getUser().equals(username)) {
           return ResponseEntity.status(400).build();
        }
        String token = getJWTToken(username, password);
        User user = new User();
        user.setUser(username);
        user.setToken(token);
        return ResponseEntity.ok(user);

    }

    private String getJWTToken(String username, String password) {
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");

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
                .signWith(SignatureAlgorithm.HS512,
                        password.getBytes()).compact();

        return "SOFT_POS_" + token;
    }
}