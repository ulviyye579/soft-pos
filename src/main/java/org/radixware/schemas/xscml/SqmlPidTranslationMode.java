
package org.radixware.schemas.xscml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SqmlPidTranslationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SqmlPidTranslationMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AsStr"/&gt;
 *     &lt;enumeration value="PrimaryKeyProps"/&gt;
 *     &lt;enumeration value="SecondaryKeyProps"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SqmlPidTranslationMode")
@XmlEnum
public enum SqmlPidTranslationMode {

    @XmlEnumValue("AsStr")
    AS_STR("AsStr"),
    @XmlEnumValue("PrimaryKeyProps")
    PRIMARY_KEY_PROPS("PrimaryKeyProps"),
    @XmlEnumValue("SecondaryKeyProps")
    SECONDARY_KEY_PROPS("SecondaryKeyProps");
    private final String value;

    SqmlPidTranslationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SqmlPidTranslationMode fromValue(String v) {
        for (SqmlPidTranslationMode c: SqmlPidTranslationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
