package az.unibank.softpos.dto.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TermStatusResponse {

    private  String terminalRid;
    private String status;
    private String code;
    private String terminalName;
}
