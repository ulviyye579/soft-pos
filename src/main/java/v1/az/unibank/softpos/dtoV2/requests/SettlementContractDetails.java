package v1.az.unibank.softpos.dtoV2.requests;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data

public class SettlementContractDetails {

    @ApiModelProperty( example = "123456")
    private Long departmentId;

    @ApiModelProperty( example = "AZ23UBAZ42632813440060AZN004")
    private String accountNum;

    @ApiModelProperty (example = "1745589")
    private Long contractId;

    @ApiModelProperty (example = "1234")
    private Long id;

}
