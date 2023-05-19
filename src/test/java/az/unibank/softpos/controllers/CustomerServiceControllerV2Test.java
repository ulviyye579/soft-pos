package az.unibank.softpos.controllers;

import az.unibank.softpos.dtov2.requests.CompanyAttributes;
import az.unibank.softpos.dtov2.responses.CorpCustomerDetails2;
import az.unibank.softpos.service.impl.CorpCustomerImpl2;
import az.unibank.softpos.utils.Util;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@ExtendWith(SpringExtension.class)
@WebMvcTest(CustomerServiceControllerV2.class)
class CustomerServiceControllerV2Test {

    private final static ObjectMapper objectMapper = getObjectMapper();
    @MockBean
    CorpCustomerImpl2 corpCustomerImpl2;
    @MockBean
    Util util;
    CorpCustomerDetails2 responseCustomer;

    CompanyAttributes companyAttributes;
    UserController userController;
    @Autowired
    private MockMvc mockMvc;

    private static ObjectMapper getObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        return objectMapper;
    }

    @BeforeEach
    void setUp() {

        companyAttributes = CompanyAttributes.builder()
                .companyName("ABCD")
                .innRid("1111111111")
                .build();


        responseCustomer = new CorpCustomerDetails2();
        responseCustomer.setId("8789117");
        responseCustomer.setCode("000");
        responseCustomer.setDescription("Ok");

        userController = new UserController(util);
    }
//
//    @Test
//    void createCustomer() throws Exception {
//
//        when(corpCustomerImpl2.createCustomer(companyAttributes,"TEST")).thenReturn(responseCustomer);
//        when(util.getHeader()).thenReturn("Authorization");
//        when(util.getPrefix()).thenReturn("SOFT_POS");
//        when(util.getTimeout()).thenReturn("86400000");
//        when(util.getRequestPassword()).thenReturn("SAJJWTQVVWIMW7EI9SDPZFGEBZ4FMPRLTYNXWTPTWGH4MMRYUORWIIFY33Z2MHD3");
//
//        mockMvc.perform(post("/v2/soft/pos/corporate-customer")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .accept(MediaType.APPLICATION_JSON_VALUE)
//                        .header("Authorization", userController.getJWTToken("pos-creator", "SAJJWTQVVWIMW7EI9SDPZFGEBZ4FMPRLTYNXWTPTWGH4MMRYUORWIIFY33Z2MHD3"))
//                        .content(objectMapper.writeValueAsString(companyAttributes)))
//                .andExpect(status().isOk()).andReturn();
//
//
//    }
//
//
//    @Test
//    void changeAccount() {
//    }
//
//    @Test
//    void changeMccId() {
//    }
}