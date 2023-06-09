package az.unibank.softpos.dto.requests;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Size;

@Data
@Builder
public class Company {
    @ApiModelProperty( example = "ZARA")
    private String companyName;

    @ApiModelProperty( example = "1111111111")
    @Size(min = 10, max = 11)
    private String innRid;
}
