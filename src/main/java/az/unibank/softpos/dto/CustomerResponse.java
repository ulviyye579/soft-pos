package az.unibank.softpos.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomerResponse {

    private String merchantId;
    private String contractId;
    private String result;
    private String externalId;
}
