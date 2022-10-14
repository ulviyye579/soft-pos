
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedObjectsDeletePolicyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LinkedObjectsDeletePolicyEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PERMIT_DELETE_SUBOBJECT"/&gt;
 *     &lt;enumeration value="PERMIT_CLEAR_REFERENCE"/&gt;
 *     &lt;enumeration value="PERMIT_ALL"/&gt;
 *     &lt;enumeration value="SKIP_ALL"/&gt;
 *     &lt;enumeration value="SKIP_WHEN_DELETE"/&gt;
 *     &lt;enumeration value="SKIP_WHEN_CLEAR_REFERENCE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LinkedObjectsDeletePolicyEnum")
@XmlEnum
public enum LinkedObjectsDeletePolicyEnum {

    PERMIT_DELETE_SUBOBJECT,
    PERMIT_CLEAR_REFERENCE,
    PERMIT_ALL,
    SKIP_ALL,
    SKIP_WHEN_DELETE,
    SKIP_WHEN_CLEAR_REFERENCE;

    public String value() {
        return name();
    }

    public static LinkedObjectsDeletePolicyEnum fromValue(String v) {
        return valueOf(v);
    }

}
