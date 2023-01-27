package az.unibank.softpos.dto.responses;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class SoftResponse {

    private String id;
    private Boolean result;
    private String message;
}

