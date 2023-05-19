package az.unibank.softpos.controllers;

import az.unibank.softpos.dto.responses.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    MockMvc mockMvc;
    @MockBean
    UserController userController;
    User user;

    @BeforeEach
    void setUp(){
        user=new User();
        user.setToken("1234567891012123");
        user.setUsername("user");
    }

    @Test
    void login() {
    }

    @Test
    void getJWTToken() {
    }

    @Test
    void checkTokenV2() {
    }
}