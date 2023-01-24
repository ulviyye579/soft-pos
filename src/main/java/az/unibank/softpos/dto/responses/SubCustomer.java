package az.unibank.softpos.dto.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SubCustomer {

    private Long commonContractId;
    private String externalId;
    private String settlementContractId;
}
