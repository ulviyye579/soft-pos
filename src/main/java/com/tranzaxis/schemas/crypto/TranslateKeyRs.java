
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TranslateKeyRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranslateKeyRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="KeyCrypto" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranslateKeyRs")
public class TranslateKeyRs {

    @XmlAttribute(name = "KeyCrypto")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] keyCrypto;

    /**
     * Gets the value of the keyCrypto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getKeyCrypto() {
        return keyCrypto;
    }

    /**
     * Sets the value of the keyCrypto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyCrypto(byte[] value) {
        this.keyCrypto = value;
    }

}
