
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcEmvMac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcEmvMac"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CalcEmvMacRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcEmvMacRq"/&gt;
 *         &lt;element name="CalcEmvMacRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcEmvMacRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcEmvMac", propOrder = {
    "calcEmvMacRq",
    "calcEmvMacRs"
})
public class CalcEmvMac {

    @XmlElement(name = "CalcEmvMacRq")
    protected CalcEmvMacRq calcEmvMacRq;
    @XmlElement(name = "CalcEmvMacRs")
    protected CalcEmvMacRs calcEmvMacRs;

    /**
     * Gets the value of the calcEmvMacRq property.
     * 
     * @return
     *     possible object is
     *     {@link CalcEmvMacRq }
     *     
     */
    public CalcEmvMacRq getCalcEmvMacRq() {
        return calcEmvMacRq;
    }

    /**
     * Sets the value of the calcEmvMacRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcEmvMacRq }
     *     
     */
    public void setCalcEmvMacRq(CalcEmvMacRq value) {
        this.calcEmvMacRq = value;
    }

    /**
     * Gets the value of the calcEmvMacRs property.
     * 
     * @return
     *     possible object is
     *     {@link CalcEmvMacRs }
     *     
     */
    public CalcEmvMacRs getCalcEmvMacRs() {
        return calcEmvMacRs;
    }

    /**
     * Sets the value of the calcEmvMacRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcEmvMacRs }
     *     
     */
    public void setCalcEmvMacRs(CalcEmvMacRs value) {
        this.calcEmvMacRs = value;
    }

}
