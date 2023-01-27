package az.unibank.softpos.dtoV2.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class TerminalResponseV2 {

    private String termRid;
    private String absRid;
    private String id;
    private String terminalName;
    private String contractId;
    private String description;
    private String code;
    private String keyValue;
    private String kcv;

}
