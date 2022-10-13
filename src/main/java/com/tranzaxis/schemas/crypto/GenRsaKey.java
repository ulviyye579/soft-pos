
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenRsaKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenRsaKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="GenRsaKeyRq" type="{http://schemas.tranzaxis.com/crypto.xsd}GenRsaKeyRq"/&gt;
 *         &lt;element name="GenRsaKeyRs" type="{http://schemas.tranzaxis.com/crypto.xsd}GenRsaKeyRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenRsaKey", propOrder = {
    "genRsaKeyRq",
    "genRsaKeyRs"
})
public class GenRsaKey {

    @XmlElement(name = "GenRsaKeyRq")
    protected GenRsaKeyRq genRsaKeyRq;
    @XmlElement(name = "GenRsaKeyRs")
    protected GenRsaKeyRs genRsaKeyRs;

    /**
     * Gets the value of the genRsaKeyRq property.
     * 
     * @return
     *     possible object is
     *     {@link GenRsaKeyRq }
     *     
     */
    public GenRsaKeyRq getGenRsaKeyRq() {
        return genRsaKeyRq;
    }

    /**
     * Sets the value of the genRsaKeyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenRsaKeyRq }
     *     
     */
    public void setGenRsaKeyRq(GenRsaKeyRq value) {
        this.genRsaKeyRq = value;
    }

    /**
     * Gets the value of the genRsaKeyRs property.
     * 
     * @return
     *     possible object is
     *     {@link GenRsaKeyRs }
     *     
     */
    public GenRsaKeyRs getGenRsaKeyRs() {
        return genRsaKeyRs;
    }

    /**
     * Sets the value of the genRsaKeyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenRsaKeyRs }
     *     
     */
    public void setGenRsaKeyRs(GenRsaKeyRs value) {
        this.genRsaKeyRs = value;
    }

}
