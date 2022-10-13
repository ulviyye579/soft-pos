
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcCvv complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcCvv"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CalcCvvRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcCvvRq"/&gt;
 *         &lt;element name="CalcCvvRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcCvvRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcCvv", propOrder = {
    "calcCvvRq",
    "calcCvvRs"
})
public class CalcCvv {

    @XmlElement(name = "CalcCvvRq")
    protected CalcCvvRq calcCvvRq;
    @XmlElement(name = "CalcCvvRs")
    protected CalcCvvRs calcCvvRs;

    /**
     * Gets the value of the calcCvvRq property.
     * 
     * @return
     *     possible object is
     *     {@link CalcCvvRq }
     *     
     */
    public CalcCvvRq getCalcCvvRq() {
        return calcCvvRq;
    }

    /**
     * Sets the value of the calcCvvRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcCvvRq }
     *     
     */
    public void setCalcCvvRq(CalcCvvRq value) {
        this.calcCvvRq = value;
    }

    /**
     * Gets the value of the calcCvvRs property.
     * 
     * @return
     *     possible object is
     *     {@link CalcCvvRs }
     *     
     */
    public CalcCvvRs getCalcCvvRs() {
        return calcCvvRs;
    }

    /**
     * Sets the value of the calcCvvRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcCvvRs }
     *     
     */
    public void setCalcCvvRs(CalcCvvRs value) {
        this.calcCvvRs = value;
    }

}
