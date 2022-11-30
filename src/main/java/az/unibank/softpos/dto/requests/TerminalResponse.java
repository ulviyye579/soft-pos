package az.unibank.softpos.dto.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class TerminalResponse {

    private String termRid;
    private String id;
    private String terminalName;
    private String description;
    private String code;
    private String keyValue;
    private String keyType;
    private String kcv;  //    key checkvalue

}
