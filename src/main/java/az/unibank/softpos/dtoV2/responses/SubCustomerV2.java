package az.unibank.softpos.dtoV2.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SubCustomerV2 {

    private Long commonContractId;
    private String subCustomerId;
    private String settlementContractId;
}
