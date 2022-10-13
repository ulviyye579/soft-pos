
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionRestorePolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SessionRestorePolicy"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SavedPasswordCanBeUsed"/&gt;
 *     &lt;enumeration value="PasswordMustBeEntered"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SessionRestorePolicy")
@XmlEnum
public enum SessionRestorePolicy {

    @XmlEnumValue("SavedPasswordCanBeUsed")
    SAVED_PASSWORD_CAN_BE_USED("SavedPasswordCanBeUsed"),
    @XmlEnumValue("PasswordMustBeEntered")
    PASSWORD_MUST_BE_ENTERED("PasswordMustBeEntered");
    private final String value;

    SessionRestorePolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SessionRestorePolicy fromValue(String v) {
        for (SessionRestorePolicy c: SessionRestorePolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
