
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DigestMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DigestMethod"&gt;
 *   &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="MD5"/&gt;
 *     &lt;enumeration value="SHA1"/&gt;
 *     &lt;enumeration value="SHA224"/&gt;
 *     &lt;enumeration value="SHA256"/&gt;
 *     &lt;enumeration value="SHA384"/&gt;
 *     &lt;enumeration value="SHA512"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DigestMethod")
@XmlEnum
public enum DigestMethod {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("MD5")
    MD_5("MD5"),
    @XmlEnumValue("SHA1")
    SHA_1("SHA1"),
    @XmlEnumValue("SHA224")
    SHA_224("SHA224"),
    @XmlEnumValue("SHA256")
    SHA_256("SHA256"),
    @XmlEnumValue("SHA384")
    SHA_384("SHA384"),
    @XmlEnumValue("SHA512")
    SHA_512("SHA512");
    private final String value;

    DigestMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DigestMethod fromValue(String v) {
        for (DigestMethod c: DigestMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
