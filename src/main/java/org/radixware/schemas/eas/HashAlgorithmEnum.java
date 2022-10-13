
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HashAlgorithmEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HashAlgorithmEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SHA-1"/&gt;
 *     &lt;enumeration value="SHA-256"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HashAlgorithmEnum")
@XmlEnum
public enum HashAlgorithmEnum {

    @XmlEnumValue("SHA-1")
    SHA_1("SHA-1"),
    @XmlEnumValue("SHA-256")
    SHA_256("SHA-256");
    private final String value;

    HashAlgorithmEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HashAlgorithmEnum fromValue(String v) {
        for (HashAlgorithmEnum c: HashAlgorithmEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
