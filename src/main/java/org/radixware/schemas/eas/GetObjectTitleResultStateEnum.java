
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetObjectTitleResultStateEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetObjectTitleResultStateEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="ObjectNotFound"/&gt;
 *     &lt;enumeration value="AccessDenied"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GetObjectTitleResultStateEnum")
@XmlEnum
public enum GetObjectTitleResultStateEnum {

    OK("OK"),
    @XmlEnumValue("ObjectNotFound")
    OBJECT_NOT_FOUND("ObjectNotFound"),
    @XmlEnumValue("AccessDenied")
    ACCESS_DENIED("AccessDenied"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    GetObjectTitleResultStateEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GetObjectTitleResultStateEnum fromValue(String v) {
        for (GetObjectTitleResultStateEnum c: GetObjectTitleResultStateEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
