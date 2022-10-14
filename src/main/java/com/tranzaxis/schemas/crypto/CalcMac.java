
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcMac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcMac"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CalcMacRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcMacRq"/&gt;
 *         &lt;element name="CalcMacRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcMacRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcMac", propOrder = {
    "calcMacRq",
    "calcMacRs"
})
public class CalcMac {

    @XmlElement(name = "CalcMacRq")
    protected CalcMacRq calcMacRq;
    @XmlElement(name = "CalcMacRs")
    protected CalcMacRs calcMacRs;

    /**
     * Gets the value of the calcMacRq property.
     * 
     * @return
     *     possible object is
     *     {@link CalcMacRq }
     *     
     */
    public CalcMacRq getCalcMacRq() {
        return calcMacRq;
    }

    /**
     * Sets the value of the calcMacRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcMacRq }
     *     
     */
    public void setCalcMacRq(CalcMacRq value) {
        this.calcMacRq = value;
    }

    /**
     * Gets the value of the calcMacRs property.
     * 
     * @return
     *     possible object is
     *     {@link CalcMacRs }
     *     
     */
    public CalcMacRs getCalcMacRs() {
        return calcMacRs;
    }

    /**
     * Sets the value of the calcMacRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcMacRs }
     *     
     */
    public void setCalcMacRs(CalcMacRs value) {
        this.calcMacRs = value;
    }

}
