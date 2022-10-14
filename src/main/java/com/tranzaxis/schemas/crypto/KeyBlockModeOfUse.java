
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyBlockModeOfUse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KeyBlockModeOfUse"&gt;
 *   &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KeyBlockModeOfUse")
@XmlEnum
public enum KeyBlockModeOfUse {

    N,
    B,
    E,
    D,
    C,
    G,
    V,
    S,
    X;

    public String value() {
        return name();
    }

    public static KeyBlockModeOfUse fromValue(String v) {
        return valueOf(v);
    }

}
