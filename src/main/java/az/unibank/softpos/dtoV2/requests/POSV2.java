package az.unibank.softpos.dtoV2.requests;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class POSV2 {
    @NotEmpty
    @ApiModelProperty( example = "ZARA 28MAll")
    private String terminalName;

    @NotEmpty
    @ApiModelProperty( example = "Rashid B. str. 55")
    private String address;

    @NotEmpty
    @ApiModelProperty( example = "Baku")
    private String city;

    @NotEmpty
    @ApiModelProperty( example = "123456")
    private String subCustomerId;

    @ApiModelProperty( example = "5732")
    private String mccCode;

    @ApiModelProperty( example = "AZ23789542632813440060AZN004")
    private String account;
}
