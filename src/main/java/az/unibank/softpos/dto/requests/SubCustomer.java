package az.unibank.softpos.dto.requests;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SubCustomer {
    @ApiModelProperty( example = "ZARA 28MAll")
    private String companyName;
    @ApiModelProperty( example = "123456")
    private String clientID;
    @ApiModelProperty( example = "5732")
    private String mccCode;
    @ApiModelProperty( example = "AZ23UBAZ42632813440060AZN004")
    private String account;
    @ApiModelProperty( example = "Rashid Behbudov str. 55")
    private String address;
    @ApiModelProperty( example = "Baku")
    private String city;
}
