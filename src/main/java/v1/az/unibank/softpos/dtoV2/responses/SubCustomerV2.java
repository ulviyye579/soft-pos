package v1.az.unibank.softpos.dtoV2.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SubCustomerV2 {

    private Long commonContractId;
    private String externalId;
    private String settlementContractId;
}
