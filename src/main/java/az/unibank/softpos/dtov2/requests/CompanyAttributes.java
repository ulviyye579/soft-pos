package az.unibank.softpos.dtov2.requests;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
public class CompanyAttributes {
    @ApiModelProperty( example = "ZARA")
    private String companyName;

    @ApiModelProperty( example = "1111111111")
    @Size(min = 10, max = 11)
    private String innRid;
}
