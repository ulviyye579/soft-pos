
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyIntForm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KeyIntForm"&gt;
 *   &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *     &lt;enumeration value="Id"/&gt;
 *     &lt;enumeration value="Crypto"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KeyIntForm")
@XmlEnum
public enum KeyIntForm {

    @XmlEnumValue("Id")
    ID("Id"),
    @XmlEnumValue("Crypto")
    CRYPTO("Crypto");
    private final String value;

    KeyIntForm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeyIntForm fromValue(String v) {
        for (KeyIntForm c: KeyIntForm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
