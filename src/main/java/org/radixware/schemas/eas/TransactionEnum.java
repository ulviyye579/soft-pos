
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="No"/&gt;
 *     &lt;enumeration value="AutoCommit"/&gt;
 *     &lt;enumeration value="Start"/&gt;
 *     &lt;enumeration value="Commit"/&gt;
 *     &lt;enumeration value="Continue"/&gt;
 *     &lt;enumeration value="Rollback"/&gt;
 *     &lt;enumeration value="Finish"/&gt;
 *     &lt;enumeration value="CommitFinish"/&gt;
 *     &lt;enumeration value="RollbackFinish"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionEnum")
@XmlEnum
public enum TransactionEnum {

    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("AutoCommit")
    AUTO_COMMIT("AutoCommit"),
    @XmlEnumValue("Start")
    START("Start"),
    @XmlEnumValue("Commit")
    COMMIT("Commit"),
    @XmlEnumValue("Continue")
    CONTINUE("Continue"),
    @XmlEnumValue("Rollback")
    ROLLBACK("Rollback"),
    @XmlEnumValue("Finish")
    FINISH("Finish"),
    @XmlEnumValue("CommitFinish")
    COMMIT_FINISH("CommitFinish"),
    @XmlEnumValue("RollbackFinish")
    ROLLBACK_FINISH("RollbackFinish");
    private final String value;

    TransactionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionEnum fromValue(String v) {
        for (TransactionEnum c: TransactionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
