package az.unibank.softpos.dtov2.requests;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountChanges {
    @ApiModelProperty( example = "8786951")
    private String absRid;
    @ApiModelProperty( example = "17552161")
    private String contractId;
    @ApiModelProperty( example = "AZ23789542632813440060AZN004")
    private String accountNumber;

}