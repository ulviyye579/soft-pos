
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyProviderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KeyProviderType"&gt;
 *   &lt;restriction base="{http://schemas.radixware.org/types.xsd}CharEnum"&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KeyProviderType")
@XmlEnum
public enum KeyProviderType {

    C,
    A;

    public String value() {
        return name();
    }

    public static KeyProviderType fromValue(String v) {
        return valueOf(v);
    }

}
