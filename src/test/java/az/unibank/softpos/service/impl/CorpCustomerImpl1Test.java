package az.unibank.softpos.service.impl;

import az.unibank.softpos.dto.requests.Branch;
import az.unibank.softpos.dto.requests.Company;
import az.unibank.softpos.dto.requests.POS;
import az.unibank.softpos.dto.responses.*;
import az.unibank.softpos.dtov2.requests.AccountChanges;
import az.unibank.softpos.dtov2.responses.*;
import az.unibank.softpos.dtov2.responses.MiniResponse;
import az.unibank.softpos.exceptions.TransAxisException;
import az.unibank.softpos.methodsv2.Init;
import az.unibank.softpos.utils.Configs;
import az.unibank.softpos.utils.Util;
import com.tranzaxis.schemas.tran.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.xml.bind.JAXBException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
class CorpCustomerImpl1Test {

    CorpCustomerImpl corpCustomerImpl;

    @MockBean
    Util util;

    @MockBean
    Init init;

    @MockBean
    ExtIdGenerator extIdGenerator;
    SoftResponse softResponse;
    SoftResponse badSoftResponse;

    CorpCustomerDetails2 corpCustomerDetails2;
    Company companyAttributes;
    Company companyAttributes2;
    SubCustomer subCustomer;

    BranchResponse branchResponse;

    Branch branch;

    POS pos;

    AccountChanges accountChanges;
    AccountChanges falseAccountChanges;
    TerminalResponse terminalResponse;
    TermStatusResponse termStatusResponse;

    Response response;

    Response failedResponse;
    Configs configs;
    Configs conf;
    Util util2;

    @BeforeEach
    void setUp() {

        configs = new Configs();
        configs.setRtpUrl("http://10.142.0.11:10017");
        configs.setStandardTimeout("10000");
        configs.setInitiatorRid("TEST");

        conf = new Configs();
        conf.setInitiatorRid("123");
        conf.setStandardTimeout("7");
        util2 = new Util(configs);

        corpCustomerImpl = new CorpCustomerImpl(util);
        companyAttributes = Company.builder()
                .companyName("TapToPhone1")
                .innRid("1111111111")
                .build();

        companyAttributes2 = Company.builder()
                .companyName("TapToPhone1")
                .build();
        corpCustomerDetails2 = new CorpCustomerDetails2();
        corpCustomerDetails2.setId("8789144");
        corpCustomerDetails2.setCode("000");
        corpCustomerDetails2.setDescription("Ok");

        pos = POS.builder()
                .address("Rashid B str 55")
                .city("Baku")
                .terminalName("ZARA 28MAll")
                .contractId("17544563")
                .build();

        branch = Branch.builder()
                .address("Rashid B.str")
                .companyName("TapToPhone")
                .city("Baku")
                .mccCode("5732")
                .account("AZ23789542632813440060AZN004")
                .clientID("8788996")
                .build();



        branchResponse =new BranchResponse();
        branchResponse.setExternalId("1212121");
        branchResponse.setResult("Approved");
        branchResponse.setSubCustomerId("12345678");

        accountChanges = AccountChanges.builder()
                .absRid("8786951")
                .accountNumber("AZ23789542632813440060AZN004")
                .contractId("17552161")
                .build();

        falseAccountChanges = AccountChanges.builder()
                .absRid("123")
                .contractId("123")
                .accountNumber("AZ")
                .build();
        response = new Response();
        response.setId(1L);
        response.setResult("Approved");

        failedResponse = new Response();
        failedResponse.setResult("Failed");
        badSoftResponse = new SoftResponse();
        badSoftResponse.setResult(false);

        softResponse = new SoftResponse();
        softResponse.setResult(Boolean.TRUE);

        terminalResponse = new TerminalResponse();
        terminalResponse.setId("");
        terminalResponse.setTermRid("SP100314");
        terminalResponse.setDescription("Approved");

        termStatusResponse = new TermStatusResponse();
        termStatusResponse.setStatus("Active");
        termStatusResponse.setCode("000");
        MiniResponse badResponse = new MiniResponse();
        badResponse.setCode("500");

    }

    @Test
    void testCreateCustomerShouldBeSuccess() throws TransAxisException {

        when(util.getTxParams(anyString())).thenReturn(this.configs);
        ResponseCustomer result = corpCustomerImpl.createCustomer(companyAttributes, configs.getInitiatorRid());
        assertThat(result.getCode()).isEqualTo(corpCustomerDetails2.getCode());
    }

    @Test
    void testCreateCustomerShouldBeFailed() throws TransAxisException {

        when(util.getTxParams(anyString())).thenReturn(this.configs);
        ResponseCustomer result = corpCustomerImpl.createCustomer(companyAttributes2,configs.getInitiatorRid());
        assertThat(result.getCode()).isEqualTo("001");
    }

    @Test
    void testCreateCustomerShouldBeException() {
        assertThrows(TransAxisException.class, () ->  corpCustomerImpl.createCustomer(companyAttributes,  "TEST"));
    }

    @Test
    void testSubCustomerShouldBeSuccess() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);
        SubCustomer result = corpCustomerImpl.createSubCustomer(branch, configs.getInitiatorRid());
        assertThat(result.getResult()).isEqualTo(branchResponse.getResult());
    }
    @Test
    void testSubCustomerShouldBeFailed() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);
        when(extIdGenerator.setExternalId(anyLong(), anyString())).thenReturn(null);
        SubCustomer result = corpCustomerImpl.createSubCustomer(branch, configs.getInitiatorRid());
        assertThat(result.getExternalId()).isNotEqualTo(branchResponse.getResult());
    }

    @Test
    void testSubCustomerShouldBeException() {
        when(util.getTxParams(anyString())).thenReturn(this.conf);
        assertThrows(TransAxisException.class, () ->  corpCustomerImpl.createSubCustomer(branch,  configs.getInitiatorRid()));
    }

    @Test
    void testGenerateSettlementContractRequestShouldBeSuccess() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);

        String result = corpCustomerImpl.generateSettlementContractRequest("8789280", branch, configs.getInitiatorRid());

        assertThat(result).isNotNull();
        assertThat(result).isNotEmpty();
    }

    @Test
    void testGenerateRtpRequestForCommonContractShouldBeSuccess() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);

        Long result = corpCustomerImpl.generateRtpRequestForCommonContract( "8789280","1756203",configs.getInitiatorRid());

        assertThat(result).isNotNull();
    }


    @Test
    void testCreateTerminalShouldBeSuccess() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);

        TerminalResponse result = corpCustomerImpl.createTerminal(pos, configs.getInitiatorRid());

        assertThat(result.getDescription()).isEqualTo(terminalResponse.getDescription());

    }

    @Test
    void testGetStatusTerminal() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);

        TermStatusResponse result = corpCustomerImpl.getStatusTerminal(28425L, configs.getInitiatorRid());

        assertThat(result.getCode()).isEqualTo(termStatusResponse.getCode());
    }


    @Test
    void testChangeMccShouldBeSuccess() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);

        SoftResponse result = corpCustomerImpl.changeMcc("8788925", configs.getInitiatorRid(), "5732");

        assertThat(result.getResult()).isEqualTo(softResponse.getResult());
    }

    @Test
    void testChangeMccShouldBeFailed() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);
        when(init.callSOAP(anyString(),anyString())).thenReturn(failedResponse);

        SoftResponse result = corpCustomerImpl.changeMcc("123", "TEST", "5732");

        assertThat(result.getResult()).isEqualTo(badSoftResponse.getResult());
    }


    @Test
    void testDeleteTerminalShouldBeSuccess() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);
        SoftResponse result = corpCustomerImpl.deleteTerminal("28428", configs.getInitiatorRid());
        assertThat(result.getResult()).isNotNull();
    }

    @Test
    void testChangeStatusTerminalShouldBeSuccess() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);
        SoftResponse result = corpCustomerImpl.changeStatusTerminal("28428", configs.getInitiatorRid(),"C");
        assertThat(result.getResult()).isEqualTo(softResponse.getResult());
    }

}