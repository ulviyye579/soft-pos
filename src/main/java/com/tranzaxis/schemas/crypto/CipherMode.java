
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CipherMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CipherMode"&gt;
 *   &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *     &lt;enumeration value="CBC"/&gt;
 *     &lt;enumeration value="ECB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CipherMode")
@XmlEnum
public enum CipherMode {

    CBC,
    ECB;

    public String value() {
        return name();
    }

    public static CipherMode fromValue(String v) {
        return valueOf(v);
    }

}
