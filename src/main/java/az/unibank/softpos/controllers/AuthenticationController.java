//package az.unibank.softpos.controllers;
//
//import az.unibank.softpos.dto.Credentials;
//import az.unibank.softpos.dto.TokenResponse;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.UUID;
//
//@RestController
//@RequestMapping("/soft/pos")
//@RequiredArgsConstructor
//public class AuthenticationController {
//
//    @PostMapping(value = "authentication",
//            produces = {MediaType.APPLICATION_JSON_VALUE})
////    public TokenResponse authenticateUser(@PathVariable("username") String username,
////                                          @PathVariable("password") String password) {
////        TokenResponse tokenResponse = new TokenResponse();
////        try {
////
////            // Authenticate the user using the credentials provided
////            authenticate(username, password);
////
////            // Issue a token for the user
////            String token = issueToken(username);
////
////            tokenResponse.setUser(username);
////            tokenResponse.setToken(token);
////            return tokenResponse;
////        } catch (Exception ex) {
////            tokenResponse.setUser("Username or password is incorrect");
////            tokenResponse.setToken("Token not found");
////            return tokenResponse;
////        }
////    }
//
//    public TokenResponse authenticateUser(Credentials credentials) {
//        TokenResponse tokenResponse = new TokenResponse();
//        try {
//
//            // Authenticate the user using the credentials provided
//            String username = credentials.getUsername();
//            String password = credentials.getPassword();
//            authenticate(username,password);
//
//            // Issue a token for the user
//            String token = issueToken(username);
//
//            tokenResponse.setAuthenticated(Boolean.TRUE.toString());
//            tokenResponse.setToken(token);
//            return tokenResponse;
//        } catch (Exception ex) {
//            tokenResponse.setAuthenticated(Boolean.FALSE.toString());
//            tokenResponse.setToken("Token not found. Username or password is incorrect");
//            return tokenResponse;
//        }
//    }
//
//    private void authenticate(String username, String password) throws Exception {
//        // Authenticate against a database, LDAP, file or whatever
//        // Throw an Exception if the credentials are invalid
//    }
//
//    private String issueToken(String username) {
//        String uuid = UUID.randomUUID().toString();
//        // The issued token must be associated to a user
//        return uuid;
//    }
//}
