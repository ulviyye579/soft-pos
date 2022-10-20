package az.unibank.softpos.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Getter
@Setter
@NoArgsConstructor
public class TerminalDetails {

    private  String terminalRid;
    private String status;
    private String code;
    private String terminalName;
}
