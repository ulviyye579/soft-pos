
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecryptDukpt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecryptDukpt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="DecryptDukptRq" type="{http://schemas.tranzaxis.com/crypto.xsd}DecryptDukptRq"/&gt;
 *         &lt;element name="DecryptDukptRs" type="{http://schemas.tranzaxis.com/crypto.xsd}DecryptDukptRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecryptDukpt", propOrder = {
    "decryptDukptRq",
    "decryptDukptRs"
})
public class DecryptDukpt {

    @XmlElement(name = "DecryptDukptRq")
    protected DecryptDukptRq decryptDukptRq;
    @XmlElement(name = "DecryptDukptRs")
    protected DecryptDukptRs decryptDukptRs;

    /**
     * Gets the value of the decryptDukptRq property.
     * 
     * @return
     *     possible object is
     *     {@link DecryptDukptRq }
     *     
     */
    public DecryptDukptRq getDecryptDukptRq() {
        return decryptDukptRq;
    }

    /**
     * Sets the value of the decryptDukptRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecryptDukptRq }
     *     
     */
    public void setDecryptDukptRq(DecryptDukptRq value) {
        this.decryptDukptRq = value;
    }

    /**
     * Gets the value of the decryptDukptRs property.
     * 
     * @return
     *     possible object is
     *     {@link DecryptDukptRs }
     *     
     */
    public DecryptDukptRs getDecryptDukptRs() {
        return decryptDukptRs;
    }

    /**
     * Sets the value of the decryptDukptRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecryptDukptRs }
     *     
     */
    public void setDecryptDukptRs(DecryptDukptRs value) {
        this.decryptDukptRs = value;
    }

}
