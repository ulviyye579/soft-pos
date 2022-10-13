package az.unibank.softpos.utils;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Sanan Garibli
 */

@Slf4j
@Getter
@Setter
@Component
public class Util {

    @Value("${application.endpointDefault}")
    private String endpointDefault;

    @Value("${application.initiatorRidDefault}")
    private String initiatorRidDefault;


    public static String maskPan(String data) {
        return data.replaceAll("(Pan=\"\\d{6})\\d*(\\d{4})[Pan=\"]", "$1******$2\"");

    }


    public static String getDateTime() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
        return formatter.format(date);
    }


    public static String toXml(Writer writer, Object jaxbAnnotedObj, JAXBContext jaxbContext) throws JAXBException {
        Marshaller marshaller = jaxbContext.createMarshaller();
        if (log.isTraceEnabled()) {
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        }
        marshaller.marshal(jaxbAnnotedObj, writer);
        return writer.toString();
    }

    public Map<String, String> getTxParams(String httpHeaders) {
        Map<String, String> txParamsHashMap = new HashMap<>();
        try {
            log.trace("requestor-inst-rid : " + httpHeaders);
            txParamsHashMap.put(Constants.RTP_URL, endpointDefault);
            txParamsHashMap.put(Constants.INITIATOR_RID, initiatorRidDefault);
            log.trace("RTP parameters : " + txParamsHashMap);
        } catch (Exception ex) {
            txParamsHashMap.put(Constants.RTP_URL, endpointDefault);
            txParamsHashMap.put(Constants.INITIATOR_RID, initiatorRidDefault);
        }
        return txParamsHashMap;
    }

}
