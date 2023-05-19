package az.unibank.softpos.service.impl;

import az.unibank.softpos.dtov2.requests.AccountChanges;
import az.unibank.softpos.dtov2.requests.BranchV2;
import az.unibank.softpos.dtov2.requests.CompanyAttributes;
import az.unibank.softpos.dtov2.requests.POSV2;
import az.unibank.softpos.dtov2.responses.*;
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
class CorpCustomerImpl2Test {

    CorpCustomerImpl2 corpCustomerImpl2;

    @MockBean
    Util util;

    @MockBean
    Init init;

    @MockBean
    ExtIdGeneratorV2 extIdGenerator;
    SoftResponseV2 softResponseV2;
    SoftResponseV2 badSoftResponse;
    CorpCustomerDetails2 corpCustomerDetails2;
    CompanyAttributes companyAttributes;
    CompanyAttributes companyAttributes2;
    SubCustomerV2 subCustomerV2;

    BranchResponse branchResponse;

    BranchV2 branchV2;
    BranchV2 branch;
    POSV2 posv2;

    AccountChanges accountChanges;
    AccountChanges falseAccountChanges;
    TerminalResponseV2 terminalResponseV2;

    TermStatusResponseV2 termStatusResponseV2;
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

        corpCustomerImpl2 = new CorpCustomerImpl2(util);
        companyAttributes = CompanyAttributes.builder()
                .companyName("TapToPhone1")
                .innRid("1111111111")
                .build();

        companyAttributes2 = CompanyAttributes.builder()
                .companyName("TapToPhone1")
                .build();
        corpCustomerDetails2 = new CorpCustomerDetails2();
        corpCustomerDetails2.setId("8789144");
        corpCustomerDetails2.setCode("000");
        corpCustomerDetails2.setDescription("Ok");

        posv2 = POSV2.builder()
                .account("AZ23789542632813440060AZN004")
                .address("Rashid B str 55")
                .subCustomerId("8789144")
                .mccCode("5732")
                .city("Baku")
                .terminalName("POS78945")
                .build();

        branchV2 = BranchV2.builder()
                .customerId("8788506")
                .address("Rashid B.str")
                .companyName("TapToPhone")
                .city("Baku")
                .build();

        branch = BranchV2.builder()
                .customerId("123")
                .build();

        branchResponse =new BranchResponse();
        branchResponse.setExternalId("1212121");
        branchResponse.setResult("Approved");
        branchResponse.setSubCustomerId("12345678");

        subCustomerV2 =new SubCustomerV2();
        subCustomerV2.setSubCustomerId("123456U");
        subCustomerV2.setCommonContractId(1322L);
        subCustomerV2.setSettlementContractId("1324");

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
        badSoftResponse = new SoftResponseV2();
        badSoftResponse.setResult(false);

        softResponseV2 = new SoftResponseV2();
        softResponseV2.setResult(Boolean.TRUE);
        softResponseV2.setId("000");
        softResponseV2.setMessage("Approved");

        terminalResponseV2 = new TerminalResponseV2();
        terminalResponseV2.setId("");
        terminalResponseV2.setTermRid("SP100314");
        terminalResponseV2.setAbsRid("8789146");
        terminalResponseV2.setDescription("Approved");
        terminalResponseV2.setCode("000");
        terminalResponseV2.setTerminalName("POS");
        terminalResponseV2.setContractId("123456");

        termStatusResponseV2 = new TermStatusResponseV2();
        termStatusResponseV2.setStatus("Active");
        termStatusResponseV2.setCode("000");
        termStatusResponseV2.setTerminalName("POS");
        termStatusResponseV2.setTerminalRid("POST1234");
        MiniResponse badResponse = new MiniResponse();
        badResponse.setCode("500");

    }

    @Test
    void testCreateCustomerShouldBeSuccess() throws TransAxisException {

        when(util.getTxParams(anyString())).thenReturn(this.configs);
        CorpCustomerDetails2 result = corpCustomerImpl2.createCustomer(companyAttributes, configs.getInitiatorRid());
        assertThat(result.getCode()).isEqualTo(corpCustomerDetails2.getCode());
    }

    @Test
    void testCreateCustomerShouldBeFailed() throws TransAxisException {

        when(util.getTxParams(anyString())).thenReturn(this.configs);
        CorpCustomerDetails2 result = corpCustomerImpl2.createCustomer(companyAttributes2,configs.getInitiatorRid());
        assertThat(result.getCode()).isEqualTo("001");
    }

    @Test
    void testCreateCustomerShouldBeException() {
        assertThrows(TransAxisException.class, () ->  corpCustomerImpl2.createCustomer(companyAttributes,  "TEST"));
    }

    @Test
    void testSubCustomerShouldBeSuccess() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);
        BranchResponse result = corpCustomerImpl2.createSubCustomer(branchV2,configs.getInitiatorRid());
        assertThat(result.getResult()).isEqualTo(branchResponse.getResult());
    }
    @Test
    void testSubCustomerShouldBeFailed() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);
        when(extIdGenerator.setExternalId(anyLong(), anyString())).thenReturn(null);
        BranchResponse result = corpCustomerImpl2.createSubCustomer(branchV2,configs.getInitiatorRid());
        assertThat(result.getExternalId()).isNotEqualTo(branchResponse.getResult());
    }

    @Test
    void testSubCustomerShouldBeException() {
        when(util.getTxParams(anyString())).thenReturn(this.conf);
        assertThrows(TransAxisException.class, () ->  corpCustomerImpl2.createSubCustomer(branchV2,  configs.getInitiatorRid()));
    }

    @Test
    void testCreateSubObjectShouldBeSuccess() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);
        SubCustomerV2 result = corpCustomerImpl2.createSubObject(posv2,configs.getInitiatorRid());
        assertThat(result.getSubCustomerId()).isNotNull();
        assertThat(result.getSubCustomerId()).isNotEmpty();
    }

    @Test
    void testCreateSubObjectShouldBeException() throws TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.conf);
        when(init.callSOAP(anyString(),anyString())).thenReturn(failedResponse);
        assertThrows(TransAxisException.class, () ->  corpCustomerImpl2.createSubObject(posv2,"TEST"));
    }

    @Test
    void testGenerateSettlementContractRequestShouldBeSuccess() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);

        Response result = corpCustomerImpl2.generateSettlementContractRequest( "8789280",posv2,configs.getInitiatorRid());

        assertThat(result.getResult()).isEqualTo(response.getResult());
    }

    @Test
    void testGenerateRtpRequestForCommonContractShouldBeSuccess() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);

        Long result = corpCustomerImpl2.generateRtpRequestForCommonContract( "8789280","1756203",configs.getInitiatorRid());

        assertThat(result).isNotNull();
    }


    @Test
    void testCreateTerminalShouldBeSuccess() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);

        TerminalResponseV2 result = corpCustomerImpl2.createTerminal(posv2,configs.getInitiatorRid());

        assertThat(result.getDescription()).isEqualTo(terminalResponseV2.getDescription());

    }

    @Test
    void testGetStatusTerminal() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);

        TermStatusResponseV2 result = corpCustomerImpl2.getStatusTerminal(28425L,configs.getInitiatorRid());

        assertThat(result.getCode()).isEqualTo(termStatusResponseV2.getCode());
    }

    @Test
    void testChangeMccShouldBeSuccess() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);

        SoftResponseV2 result = corpCustomerImpl2.changeMcc("8788925", configs.getInitiatorRid(), "5732");

        assertThat(result.getResult()).isEqualTo(softResponseV2.getResult());
    }

    @Test
    void testChangeMccShouldBeFailed() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);
        when(init.callSOAP(anyString(),anyString())).thenReturn(failedResponse);

        SoftResponseV2 result = corpCustomerImpl2.changeMcc("123", "TEST", "5732");

        assertThat(result.getResult()).isEqualTo(badSoftResponse.getResult());
    }


    @Test
    void testChangeAccountNumberShouldBeSuccess() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);

        SoftResponseV2 result = corpCustomerImpl2.changeAccountNumber( accountChanges,configs.getInitiatorRid());

        assertThat(result.getResult()).isEqualTo(softResponseV2.getResult());

    }

    @Test
    void testChangeAccountNumberShouldBeFailed() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);
        when(init.callSOAP(anyString(),anyString())).thenReturn(failedResponse);

        SoftResponseV2 result = corpCustomerImpl2.changeAccountNumber(falseAccountChanges, "TEST");

        assertThat(result.getResult()).isEqualTo(badSoftResponse.getResult());
    }

}