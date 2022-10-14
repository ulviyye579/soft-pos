
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyBlockExportability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KeyBlockExportability"&gt;
 *   &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KeyBlockExportability")
@XmlEnum
public enum KeyBlockExportability {

    S,
    E,
    N;

    public String value() {
        return name();
    }

    public static KeyBlockExportability fromValue(String v) {
        return valueOf(v);
    }

}
