package az.unibank.softpos.utils;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class Configs {
    private String rtpUrl;
    private String initiatorRid;
    private String standardTimeout;
}
