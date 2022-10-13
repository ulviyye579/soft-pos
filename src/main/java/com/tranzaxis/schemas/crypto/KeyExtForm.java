
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyExtForm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KeyExtForm"&gt;
 *   &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *     &lt;enumeration value="X9"/&gt;
 *     &lt;enumeration value="Clear"/&gt;
 *     &lt;enumeration value="Giske"/&gt;
 *     &lt;enumeration value="TR31"/&gt;
 *     &lt;enumeration value="CRT"/&gt;
 *     &lt;enumeration value="SFM"/&gt;
 *     &lt;enumeration value="ThalesKeyBlock"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KeyExtForm")
@XmlEnum
public enum KeyExtForm {

    @XmlEnumValue("X9")
    X_9("X9"),
    @XmlEnumValue("Clear")
    CLEAR("Clear"),
    @XmlEnumValue("Giske")
    GISKE("Giske"),
    @XmlEnumValue("TR31")
    TR_31("TR31"),
    CRT("CRT"),
    SFM("SFM"),
    @XmlEnumValue("ThalesKeyBlock")
    THALES_KEY_BLOCK("ThalesKeyBlock");
    private final String value;

    KeyExtForm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeyExtForm fromValue(String v) {
        for (KeyExtForm c: KeyExtForm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
