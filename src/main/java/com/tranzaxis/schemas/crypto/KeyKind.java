
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KeyKind"&gt;
 *   &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *     &lt;enumeration value="Adk"/&gt;
 *     &lt;enumeration value="Amk"/&gt;
 *     &lt;enumeration value="Bdk1"/&gt;
 *     &lt;enumeration value="Bdk2"/&gt;
 *     &lt;enumeration value="Cvk"/&gt;
 *     &lt;enumeration value="Csck"/&gt;
 *     &lt;enumeration value="Hmac"/&gt;
 *     &lt;enumeration value="IccAuth"/&gt;
 *     &lt;enumeration value="IccCvc3"/&gt;
 *     &lt;enumeration value="IccDac"/&gt;
 *     &lt;enumeration value="IccDn"/&gt;
 *     &lt;enumeration value="IccEncr"/&gt;
 *     &lt;enumeration value="IccMac"/&gt;
 *     &lt;enumeration value="IccPersoAuth"/&gt;
 *     &lt;enumeration value="IccPersoEncr"/&gt;
 *     &lt;enumeration value="IccPersoMac"/&gt;
 *     &lt;enumeration value="IccRsa"/&gt;
 *     &lt;enumeration value="Iik"/&gt;
 *     &lt;enumeration value="Ipk"/&gt;
 *     &lt;enumeration value="Pvk"/&gt;
 *     &lt;enumeration value="Povk"/&gt;
 *     &lt;enumeration value="Rsa"/&gt;
 *     &lt;enumeration value="RsaEmvIssuer"/&gt;
 *     &lt;enumeration value="RsaPublic"/&gt;
 *     &lt;enumeration value="Tak"/&gt;
 *     &lt;enumeration value="Tek"/&gt;
 *     &lt;enumeration value="Tmk"/&gt;
 *     &lt;enumeration value="Tpk"/&gt;
 *     &lt;enumeration value="UdkAuth"/&gt;
 *     &lt;enumeration value="UdkMac"/&gt;
 *     &lt;enumeration value="UdkCvc3"/&gt;
 *     &lt;enumeration value="UdkDn"/&gt;
 *     &lt;enumeration value="UdkEncr"/&gt;
 *     &lt;enumeration value="Zak"/&gt;
 *     &lt;enumeration value="Zek"/&gt;
 *     &lt;enumeration value="Zmk"/&gt;
 *     &lt;enumeration value="Zpk"/&gt;
 *     &lt;enumeration value="Kewk"/&gt;
 *     &lt;enumeration value="Kek"/&gt;
 *     &lt;enumeration value="IKey"/&gt;
 *     &lt;enumeration value="IccPersoDek"/&gt;
 *     &lt;enumeration value="DataEncRsa"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KeyKind")
@XmlEnum
public enum KeyKind {

    @XmlEnumValue("Adk")
    ADK("Adk"),
    @XmlEnumValue("Amk")
    AMK("Amk"),
    @XmlEnumValue("Bdk1")
    BDK_1("Bdk1"),
    @XmlEnumValue("Bdk2")
    BDK_2("Bdk2"),
    @XmlEnumValue("Cvk")
    CVK("Cvk"),
    @XmlEnumValue("Csck")
    CSCK("Csck"),
    @XmlEnumValue("Hmac")
    HMAC("Hmac"),
    @XmlEnumValue("IccAuth")
    ICC_AUTH("IccAuth"),
    @XmlEnumValue("IccCvc3")
    ICC_CVC_3("IccCvc3"),
    @XmlEnumValue("IccDac")
    ICC_DAC("IccDac"),
    @XmlEnumValue("IccDn")
    ICC_DN("IccDn"),
    @XmlEnumValue("IccEncr")
    ICC_ENCR("IccEncr"),
    @XmlEnumValue("IccMac")
    ICC_MAC("IccMac"),
    @XmlEnumValue("IccPersoAuth")
    ICC_PERSO_AUTH("IccPersoAuth"),
    @XmlEnumValue("IccPersoEncr")
    ICC_PERSO_ENCR("IccPersoEncr"),
    @XmlEnumValue("IccPersoMac")
    ICC_PERSO_MAC("IccPersoMac"),
    @XmlEnumValue("IccRsa")
    ICC_RSA("IccRsa"),
    @XmlEnumValue("Iik")
    IIK("Iik"),
    @XmlEnumValue("Ipk")
    IPK("Ipk"),
    @XmlEnumValue("Pvk")
    PVK("Pvk"),
    @XmlEnumValue("Povk")
    POVK("Povk"),
    @XmlEnumValue("Rsa")
    RSA("Rsa"),
    @XmlEnumValue("RsaEmvIssuer")
    RSA_EMV_ISSUER("RsaEmvIssuer"),
    @XmlEnumValue("RsaPublic")
    RSA_PUBLIC("RsaPublic"),
    @XmlEnumValue("Tak")
    TAK("Tak"),
    @XmlEnumValue("Tek")
    TEK("Tek"),
    @XmlEnumValue("Tmk")
    TMK("Tmk"),
    @XmlEnumValue("Tpk")
    TPK("Tpk"),
    @XmlEnumValue("UdkAuth")
    UDK_AUTH("UdkAuth"),
    @XmlEnumValue("UdkMac")
    UDK_MAC("UdkMac"),
    @XmlEnumValue("UdkCvc3")
    UDK_CVC_3("UdkCvc3"),
    @XmlEnumValue("UdkDn")
    UDK_DN("UdkDn"),
    @XmlEnumValue("UdkEncr")
    UDK_ENCR("UdkEncr"),
    @XmlEnumValue("Zak")
    ZAK("Zak"),
    @XmlEnumValue("Zek")
    ZEK("Zek"),
    @XmlEnumValue("Zmk")
    ZMK("Zmk"),
    @XmlEnumValue("Zpk")
    ZPK("Zpk"),
    @XmlEnumValue("Kewk")
    KEWK("Kewk"),
    @XmlEnumValue("Kek")
    KEK("Kek"),
    @XmlEnumValue("IKey")
    I_KEY("IKey"),
    @XmlEnumValue("IccPersoDek")
    ICC_PERSO_DEK("IccPersoDek"),
    @XmlEnumValue("DataEncRsa")
    DATA_ENC_RSA("DataEncRsa");
    private final String value;

    KeyKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeyKind fromValue(String v) {
        for (KeyKind c: KeyKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
