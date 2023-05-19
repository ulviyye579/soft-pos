package az.unibank.softpos.dtov2.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TermStatusResponseV2 {

    private String terminalRid;
    private String status;
    private String code;
    private String terminalName;
}
