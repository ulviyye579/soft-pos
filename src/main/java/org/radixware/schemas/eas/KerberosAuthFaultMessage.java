
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KerberosAuthFaultMessage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KerberosAuthFaultMessage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RenewCredentialsRequired"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KerberosAuthFaultMessage")
@XmlEnum
public enum KerberosAuthFaultMessage {

    @XmlEnumValue("RenewCredentialsRequired")
    RENEW_CREDENTIALS_REQUIRED("RenewCredentialsRequired");
    private final String value;

    KerberosAuthFaultMessage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KerberosAuthFaultMessage fromValue(String v) {
        for (KerberosAuthFaultMessage c: KerberosAuthFaultMessage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
