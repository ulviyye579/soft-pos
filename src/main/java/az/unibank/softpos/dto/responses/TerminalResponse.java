package az.unibank.softpos.dto.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class TerminalResponse {

    private String termRid;
    private String ridForAbs;
    private String id;
    private String terminalName;
    private String contractId;
    private String description;
    private String code;
    private String keyValue;
    private String kcv;

}
