package az.unibank.softpos.methods;

import az.unibank.softpos.dto.responses.KeyValues;
import az.unibank.softpos.exceptions.TransAxisException;
import az.unibank.softpos.methodsv2.Init;
import az.unibank.softpos.utils.Configs;
import az.unibank.softpos.utils.Util;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.xml.bind.JAXBException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class KeyGeneratorV2Test {
    KeyGenerator keyGenerator;
    @MockBean
    Util util;

    @MockBean
    Init init;

    KeyValues keyValues;
    Configs configs;

    @BeforeEach
    void setUp() {

        keyGenerator = new KeyGenerator(util);

        configs = new Configs();
        configs.setRtpUrl("http://10.142.0.11:10017");
        configs.setStandardTimeout("10000");
        configs.setInitiatorRid("TEST");
        keyValues = new KeyValues();
        keyValues.setKeyVal("123456");
    }

    @Test
    void testGenerateKeyShouldBeSuccess() throws JAXBException, TransAxisException {
        when(util.getTxParams(anyString())).thenReturn(this.configs);
        KeyValues result = keyGenerator.generateKey(configs.getInitiatorRid());
        assertThat(result.getKeyId()).isNotNull();
        assertThat(result.getKeyId()).isNotEmpty();
    }

}