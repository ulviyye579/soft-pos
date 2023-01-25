package v1.az.unibank.softpos.dtoV2.responses;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class SoftResponseV2 {

    private String id;
    private Boolean result;
    private String message;
}

