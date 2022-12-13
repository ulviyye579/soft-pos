package az.unibank.softpos.dto.requests;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CorpCustomer {
    @ApiModelProperty( example = "ZARA")
    private String companyName;
    @ApiModelProperty( example = "111111111")
    private String innRid;
}
