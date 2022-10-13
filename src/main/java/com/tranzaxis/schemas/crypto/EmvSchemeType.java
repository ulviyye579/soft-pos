
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmvSchemeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmvSchemeType"&gt;
 *   &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *     &lt;enumeration value="Visa"/&gt;
 *     &lt;enumeration value="Mc"/&gt;
 *     &lt;enumeration value="UnionPay"/&gt;
 *     &lt;enumeration value="Ccd"/&gt;
 *     &lt;enumeration value="AmEx"/&gt;
 *     &lt;enumeration value="Jcb"/&gt;
 *     &lt;enumeration value="Nsiccs"/&gt;
 *     &lt;enumeration value="Vccs"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmvSchemeType")
@XmlEnum
public enum EmvSchemeType {

    @XmlEnumValue("Visa")
    VISA("Visa"),
    @XmlEnumValue("Mc")
    MC("Mc"),
    @XmlEnumValue("UnionPay")
    UNION_PAY("UnionPay"),
    @XmlEnumValue("Ccd")
    CCD("Ccd"),
    @XmlEnumValue("AmEx")
    AM_EX("AmEx"),
    @XmlEnumValue("Jcb")
    JCB("Jcb"),
    @XmlEnumValue("Nsiccs")
    NSICCS("Nsiccs"),
    @XmlEnumValue("Vccs")
    VCCS("Vccs");
    private final String value;

    EmvSchemeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmvSchemeType fromValue(String v) {
        for (EmvSchemeType c: EmvSchemeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
