package v1.az.unibank.softpos.dto.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SubCustomer {

    private String merchantId;
    private String contractId;
    private String result;
    private String externalId;
}
