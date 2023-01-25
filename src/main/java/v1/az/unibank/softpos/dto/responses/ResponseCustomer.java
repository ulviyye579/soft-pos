package v1.az.unibank.softpos.dto.responses;

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
public class ResponseCustomer {
        private String id;
        private String code;
        private String description;
        private String externalId;
    }

