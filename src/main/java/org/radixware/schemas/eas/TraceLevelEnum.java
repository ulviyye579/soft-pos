
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TraceLevelEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TraceLevelEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Alarm"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="Event"/&gt;
 *     &lt;enumeration value="Debug"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TraceLevelEnum")
@XmlEnum
public enum TraceLevelEnum {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Alarm")
    ALARM("Alarm"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Event")
    EVENT("Event"),
    @XmlEnumValue("Debug")
    DEBUG("Debug");
    private final String value;

    TraceLevelEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TraceLevelEnum fromValue(String v) {
        for (TraceLevelEnum c: TraceLevelEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
