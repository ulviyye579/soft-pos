package v1.az.unibank.softpos.dto.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class KeyValues {

    private String keyId;
    private String keyVal;
    private String kcv;
}
