
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcPvv complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcPvv"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CalcPvvRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcPvvRq"/&gt;
 *         &lt;element name="CalcPvvRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcPvvRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcPvv", propOrder = {
    "calcPvvRq",
    "calcPvvRs"
})
public class CalcPvv {

    @XmlElement(name = "CalcPvvRq")
    protected CalcPvvRq calcPvvRq;
    @XmlElement(name = "CalcPvvRs")
    protected CalcPvvRs calcPvvRs;

    /**
     * Gets the value of the calcPvvRq property.
     * 
     * @return
     *     possible object is
     *     {@link CalcPvvRq }
     *     
     */
    public CalcPvvRq getCalcPvvRq() {
        return calcPvvRq;
    }

    /**
     * Sets the value of the calcPvvRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcPvvRq }
     *     
     */
    public void setCalcPvvRq(CalcPvvRq value) {
        this.calcPvvRq = value;
    }

    /**
     * Gets the value of the calcPvvRs property.
     * 
     * @return
     *     possible object is
     *     {@link CalcPvvRs }
     *     
     */
    public CalcPvvRs getCalcPvvRs() {
        return calcPvvRs;
    }

    /**
     * Sets the value of the calcPvvRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcPvvRs }
     *     
     */
    public void setCalcPvvRs(CalcPvvRs value) {
        this.calcPvvRs = value;
    }

}
