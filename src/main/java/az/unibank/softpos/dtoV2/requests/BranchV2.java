package az.unibank.softpos.dtoV2.requests;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class BranchV2 {
    @ApiModelProperty( example = "ZARA 28MAll")
    private String companyName;
    @ApiModelProperty( example = "123456")
    private String customerId;
    @ApiModelProperty( example = "Rashid B. str. 55")
    private String address;
    @ApiModelProperty( example = "Baku")
    private String city;
}
