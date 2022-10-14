package az.unibank.softpos.dto.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Getter
@Setter
@NoArgsConstructor
@XmlRootElement(name = "Response")
@XmlType(propOrder = {"id", "code", "description", "externalId"})
public class Company {
        private String id;
        private String code;
        private String description;
        private String externalId;
    }

