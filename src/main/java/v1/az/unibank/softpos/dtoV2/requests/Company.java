package v1.az.unibank.softpos.dtoV2.requests;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class Company {
    @ApiModelProperty( example = "ZARA")
    private String companyName;

    @ApiModelProperty( example = "1111111111")
    @Size(min = 10, max = 11)
    private String innRid;
}
