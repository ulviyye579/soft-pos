package az.unibank.softpos.utils;

import az.unibank.softpos.dto.JwtToken;
import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Ulviyya Musayeva
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

    @Value("${request.user}")
    private String user;

    @Value("${request.timeout}")
    private String timeout;

    @Value("${request.header}")
    private String header;
    @Value("${request.prefix}")
    private String prefix;
    @Value("${request.password}")
    private String requestPassword;

    private final Configs configs;

    public Util(Configs configs) {
        this.configs = configs;
    }

    public static String getDateTime() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
        return formatter.format(date);
    }


//    public Map<String, String> getTxParams(String httpHeaders) {
//        Map<String, String> txParamsHashMap = new HashMap<>();
//        try {
//            log.trace("requestor-inst-rid : " + httpHeaders);
//            txParamsHashMap.put(Constants.RTP_URL, endpointDefault);
//            txParamsHashMap.put(Constants.INITIATOR_RID, initiatorRidDefault);
//            log.trace("RTP parameters : " + txParamsHashMap);
//        } catch (Exception ex) {
//            txParamsHashMap.put(Constants.RTP_URL, endpointDefault);
//            txParamsHashMap.put(Constants.INITIATOR_RID, initiatorRidDefault);
//        }
//        return txParamsHashMap;
//    }

    public Configs getTxParams(String httpHeaders) {
        try {
            configs.setRtpUrl(endpointDefault);
            configs.setInitiatorRid(initiatorRidDefault);
            configs.setStandardTimeout(timeout);

            return configs;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

        public JwtToken unmarshal(String jsonString){
    Gson g = new Gson();
    return g.fromJson(jsonString, JwtToken.class);
}
}
