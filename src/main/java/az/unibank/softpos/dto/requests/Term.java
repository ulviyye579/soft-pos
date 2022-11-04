package az.unibank.softpos.dto.requests;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Term {
    @ApiModelProperty( example = "ZARA 28MAll")
    private String terminalName;
    @ApiModelProperty( example = "123456")
    private String clientID;
    @ApiModelProperty( example = "Rashid Behbudov str. 55")
    private String address;
    @ApiModelProperty( example = "Baku")
    private String city;
    @ApiModelProperty (example = "17544563")
    private Long contractId;

}
