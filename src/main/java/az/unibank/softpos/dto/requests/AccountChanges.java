package az.unibank.softpos.dto.requests;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AccountChanges {
    @ApiModelProperty( example = "8786951")
    private String id;
    @ApiModelProperty( example = "17552161")
    private String contractId;
    @ApiModelProperty( example = "AZ23789542632813440060AZN004")
    private String accountNumber;

}