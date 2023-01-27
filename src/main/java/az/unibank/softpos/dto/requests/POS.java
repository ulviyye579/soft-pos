package az.unibank.softpos.dto.requests;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class POS {
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
    @ApiModelProperty (example = "17544563")
    private String contractId;

}
