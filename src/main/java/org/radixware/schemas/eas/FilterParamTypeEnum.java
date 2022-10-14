
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterParamTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FilterParamTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Num"/&gt;
 *     &lt;enumeration value="Int"/&gt;
 *     &lt;enumeration value="Bool"/&gt;
 *     &lt;enumeration value="Str"/&gt;
 *     &lt;enumeration value="Memo"/&gt;
 *     &lt;enumeration value="Blob"/&gt;
 *     &lt;enumeration value="ParentTitle"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FilterParamTypeEnum")
@XmlEnum
public enum FilterParamTypeEnum {

    @XmlEnumValue("Num")
    NUM("Num"),
    @XmlEnumValue("Int")
    INT("Int"),
    @XmlEnumValue("Bool")
    BOOL("Bool"),
    @XmlEnumValue("Str")
    STR("Str"),
    @XmlEnumValue("Memo")
    MEMO("Memo"),
    @XmlEnumValue("Blob")
    BLOB("Blob"),
    @XmlEnumValue("ParentTitle")
    PARENT_TITLE("ParentTitle"),
    @XmlEnumValue("Date")
    DATE("Date");
    private final String value;

    FilterParamTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FilterParamTypeEnum fromValue(String v) {
        for (FilterParamTypeEnum c: FilterParamTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
