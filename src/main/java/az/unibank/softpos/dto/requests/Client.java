package az.unibank.softpos.dto.requests;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Client {
    @ApiModelProperty( example = "123456")
    private String customerId;
    @ApiModelProperty( example = "123477")
    private String clientId;
}
