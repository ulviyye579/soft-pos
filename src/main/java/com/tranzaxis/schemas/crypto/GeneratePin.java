
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneratePin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneratePin"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="GeneratePinRq" type="{http://schemas.tranzaxis.com/crypto.xsd}GeneratePinRq"/&gt;
 *         &lt;element name="GeneratePinRs" type="{http://schemas.tranzaxis.com/crypto.xsd}GeneratePinRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneratePin", propOrder = {
    "generatePinRq",
    "generatePinRs"
})
public class GeneratePin {

    @XmlElement(name = "GeneratePinRq")
    protected GeneratePinRq generatePinRq;
    @XmlElement(name = "GeneratePinRs")
    protected GeneratePinRs generatePinRs;

    /**
     * Gets the value of the generatePinRq property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratePinRq }
     *     
     */
    public GeneratePinRq getGeneratePinRq() {
        return generatePinRq;
    }

    /**
     * Sets the value of the generatePinRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratePinRq }
     *     
     */
    public void setGeneratePinRq(GeneratePinRq value) {
        this.generatePinRq = value;
    }

    /**
     * Gets the value of the generatePinRs property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratePinRs }
     *     
     */
    public GeneratePinRs getGeneratePinRs() {
        return generatePinRs;
    }

    /**
     * Sets the value of the generatePinRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratePinRs }
     *     
     */
    public void setGeneratePinRs(GeneratePinRs value) {
        this.generatePinRs = value;
    }

}
