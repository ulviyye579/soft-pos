
package com.tranzaxis.schemas.subjects_admin;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Mode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Sync"/&gt;
 *     &lt;enumeration value="Change"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Mode")
@XmlEnum
public enum Mode {

    @XmlEnumValue("Sync")
    SYNC("Sync"),
    @XmlEnumValue("Change")
    CHANGE("Change");
    private final String value;

    Mode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Mode fromValue(String v) {
        for (Mode c: Mode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
