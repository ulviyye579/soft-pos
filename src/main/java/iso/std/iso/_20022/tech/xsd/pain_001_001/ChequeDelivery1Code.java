
package iso.std.iso._20022.tech.xsd.pain_001_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChequeDelivery1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChequeDelivery1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MLDB"/&gt;
 *     &lt;enumeration value="MLCD"/&gt;
 *     &lt;enumeration value="MLFA"/&gt;
 *     &lt;enumeration value="CRDB"/&gt;
 *     &lt;enumeration value="CRCD"/&gt;
 *     &lt;enumeration value="CRFA"/&gt;
 *     &lt;enumeration value="PUDB"/&gt;
 *     &lt;enumeration value="PUCD"/&gt;
 *     &lt;enumeration value="PUFA"/&gt;
 *     &lt;enumeration value="RGDB"/&gt;
 *     &lt;enumeration value="RGCD"/&gt;
 *     &lt;enumeration value="RGFA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChequeDelivery1Code")
@XmlEnum
public enum ChequeDelivery1Code {

    MLDB,
    MLCD,
    MLFA,
    CRDB,
    CRCD,
    CRFA,
    PUDB,
    PUCD,
    PUFA,
    RGDB,
    RGCD,
    RGFA;

    public String value() {
        return name();
    }

    public static ChequeDelivery1Code fromValue(String v) {
        return valueOf(v);
    }

}
