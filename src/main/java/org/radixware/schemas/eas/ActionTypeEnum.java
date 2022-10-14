
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Update"/&gt;
 *     &lt;enumeration value="Delete"/&gt;
 *     &lt;enumeration value="DeleteAll"/&gt;
 *     &lt;enumeration value="Create"/&gt;
 *     &lt;enumeration value="Command"/&gt;
 *     &lt;enumeration value="View"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionTypeEnum")
@XmlEnum
public enum ActionTypeEnum {

    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("DeleteAll")
    DELETE_ALL("DeleteAll"),
    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Command")
    COMMAND("Command"),
    @XmlEnumValue("View")
    VIEW("View");
    private final String value;

    ActionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionTypeEnum fromValue(String v) {
        for (ActionTypeEnum c: ActionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
