
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaddingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaddingMethod"&gt;
 *   &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="PKCS1"/&gt;
 *     &lt;enumeration value="OAEP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaddingMethod")
@XmlEnum
public enum PaddingMethod {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("PKCS1")
    PKCS_1("PKCS1"),
    OAEP("OAEP");
    private final String value;

    PaddingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaddingMethod fromValue(String v) {
        for (PaddingMethod c: PaddingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
