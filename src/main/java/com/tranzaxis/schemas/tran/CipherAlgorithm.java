
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CipherAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CipherAlgorithm"&gt;
 *   &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *     &lt;enumeration value="DES"/&gt;
 *     &lt;enumeration value="AES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CipherAlgorithm")
@XmlEnum
public enum CipherAlgorithm {

    DES,
    AES;

    public String value() {
        return name();
    }

    public static CipherAlgorithm fromValue(String v) {
        return valueOf(v);
    }

}
