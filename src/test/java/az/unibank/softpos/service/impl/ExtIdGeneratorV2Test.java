package az.unibank.softpos.service.impl;

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
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class ExtIdGeneratorV2Test {


    ExtIdGeneratorV2 extIdGeneratorV2;
    ExtIdGenerator extIdGenerator;
    @MockBean
    Util util;

    @MockBean
    Init init;

    Response response;

    Response failedResponse;
    Configs configs;
    Util util2;
    @BeforeEach
    void setUp() {
        extIdGeneratorV2 = new ExtIdGeneratorV2(util);
        extIdGenerator = new ExtIdGenerator(util);
        configs = new Configs();
        configs.setRtpUrl("http://10.142.0.11:10017");
        configs.setStandardTimeout("10000");
        configs.setInitiatorRid("TEST");

        util2 = new Util(configs);

        response = new Response();
        response.setId(1L);
        response.setResult("Approved");

        failedResponse = new Response();
        failedResponse.setResult("Failed");
    }

    @Test
    void testSetExtIdGeneratorShouldBeSuccess() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);
        String result = extIdGeneratorV2.setExternalId(8788996L,configs.getInitiatorRid());
        assertThat(result).isEqualTo("UP8788996");
    }

    @Test
    void testSetExtIdGeneratorShouldBeFailed() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);
        when(init.callSOAP(anyString(),anyString())).thenReturn(failedResponse);
        String result = extIdGeneratorV2.setExternalId(123L,configs.getInitiatorRid());
        assertThat(result).isNull();
    }

    @Test
    void testGetTerminalRid() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);
        String result = extIdGeneratorV2.getTerminalRid(configs.getInitiatorRid());
        assertThat(result).isNotNull();
        assertThat(result).isNotEmpty();
    }


    @Test
    void testSetExtIdGeneratorV1ShouldBeSuccess() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);
        String result = extIdGenerator.setExternalId(8788996L,configs.getInitiatorRid());
        assertThat(result).isEqualTo("UP8788996");
    }

    @Test
    void testSetExtIdGeneratorV1ShouldBeFailed() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);
        when(init.callSOAP(anyString(),anyString())).thenReturn(failedResponse);
        String result = extIdGenerator.setExternalId(123L,configs.getInitiatorRid());
        assertThat(result).isNull();
    }

    @Test
    void testGetTerminalRidV1() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);
        String result = extIdGenerator.getTerminalRid(configs.getInitiatorRid());
        assertThat(result).isNotNull();
        assertThat(result).isNotEmpty();
    }

}