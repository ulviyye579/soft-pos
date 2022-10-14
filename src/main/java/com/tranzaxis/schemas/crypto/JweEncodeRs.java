
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JweEncodeRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JweEncodeRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="EncryptedMessage" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JweEncodeRs")
public class JweEncodeRs {

    @XmlAttribute(name = "EncryptedMessage", required = true)
    protected String encryptedMessage;

    /**
     * Gets the value of the encryptedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedMessage() {
        return encryptedMessage;
    }

    /**
     * Sets the value of the encryptedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedMessage(String value) {
        this.encryptedMessage = value;
    }

}
