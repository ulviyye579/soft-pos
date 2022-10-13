
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PinBlockFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PinBlockFormat"&gt;
 *   &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *     &lt;enumeration value="Ansi"/&gt;
 *     &lt;enumeration value="Plus"/&gt;
 *     &lt;enumeration value="Docutel"/&gt;
 *     &lt;enumeration value="Diebold"/&gt;
 *     &lt;enumeration value="Iso1"/&gt;
 *     &lt;enumeration value="Iso2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PinBlockFormat")
@XmlEnum
public enum PinBlockFormat {

    @XmlEnumValue("Ansi")
    ANSI("Ansi"),
    @XmlEnumValue("Plus")
    PLUS("Plus"),
    @XmlEnumValue("Docutel")
    DOCUTEL("Docutel"),
    @XmlEnumValue("Diebold")
    DIEBOLD("Diebold"),
    @XmlEnumValue("Iso1")
    ISO_1("Iso1"),
    @XmlEnumValue("Iso2")
    ISO_2("Iso2");
    private final String value;

    PinBlockFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PinBlockFormat fromValue(String v) {
        for (PinBlockFormat c: PinBlockFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
