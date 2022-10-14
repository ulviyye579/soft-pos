
package com.tranzaxis.schemas.common_types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListModifyMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListModifyMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Sync"/&gt;
 *     &lt;enumeration value="Change"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ListModifyMode")
@XmlEnum
public enum ListModifyMode {

    @XmlEnumValue("Sync")
    SYNC("Sync"),
    @XmlEnumValue("Change")
    CHANGE("Change");
    private final String value;

    ListModifyMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListModifyMode fromValue(String v) {
        for (ListModifyMode c: ListModifyMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
