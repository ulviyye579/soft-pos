
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="GenKeyRq" type="{http://schemas.tranzaxis.com/crypto.xsd}GenKeyRq"/&gt;
 *         &lt;element name="GenKeyRs" type="{http://schemas.tranzaxis.com/crypto.xsd}GenKeyRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenKey", propOrder = {
    "genKeyRq",
    "genKeyRs"
})
public class GenKey {

    @XmlElement(name = "GenKeyRq")
    protected GenKeyRq genKeyRq;
    @XmlElement(name = "GenKeyRs")
    protected GenKeyRs genKeyRs;

    /**
     * Gets the value of the genKeyRq property.
     * 
     * @return
     *     possible object is
     *     {@link GenKeyRq }
     *     
     */
    public GenKeyRq getGenKeyRq() {
        return genKeyRq;
    }

    /**
     * Sets the value of the genKeyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenKeyRq }
     *     
     */
    public void setGenKeyRq(GenKeyRq value) {
        this.genKeyRq = value;
    }

    /**
     * Gets the value of the genKeyRs property.
     * 
     * @return
     *     possible object is
     *     {@link GenKeyRs }
     *     
     */
    public GenKeyRs getGenKeyRs() {
        return genKeyRs;
    }

    /**
     * Sets the value of the genKeyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenKeyRs }
     *     
     */
    public void setGenKeyRs(GenKeyRs value) {
        this.genKeyRs = value;
    }

}
