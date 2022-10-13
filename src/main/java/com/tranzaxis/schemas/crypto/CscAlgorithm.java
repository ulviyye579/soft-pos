
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CscAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CscAlgorithm"&gt;
 *   &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *     &lt;enumeration value="V1"/&gt;
 *     &lt;enumeration value="V2"/&gt;
 *     &lt;enumeration value="AEVV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CscAlgorithm")
@XmlEnum
public enum CscAlgorithm {

    @XmlEnumValue("V1")
    V_1("V1"),
    @XmlEnumValue("V2")
    V_2("V2"),
    AEVV("AEVV");
    private final String value;

    CscAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CscAlgorithm fromValue(String v) {
        for (CscAlgorithm c: CscAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
