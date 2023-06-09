package az.unibank.softpos.dto.requests;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Branch {
    @ApiModelProperty( example = "ZARA 28MAll")
    private String companyName;
    @ApiModelProperty( example = "123456")
    private String clientID;
    @ApiModelProperty( example = "5732")
    private String mccCode;
    @ApiModelProperty( example = "AZ23789542632813440060AZN004")
    private String account;
    @ApiModelProperty( example = "Rashid B. str. 55")
    private String address;
    @ApiModelProperty( example = "Baku")
    private String city;
}
