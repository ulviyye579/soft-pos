
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcHmac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcHmac"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CalcHmacRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcHmacRq"/&gt;
 *         &lt;element name="CalcHmacRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcHmacRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcHmac", propOrder = {
    "calcHmacRq",
    "calcHmacRs"
})
public class CalcHmac {

    @XmlElement(name = "CalcHmacRq")
    protected CalcHmacRq calcHmacRq;
    @XmlElement(name = "CalcHmacRs")
    protected CalcHmacRs calcHmacRs;

    /**
     * Gets the value of the calcHmacRq property.
     * 
     * @return
     *     possible object is
     *     {@link CalcHmacRq }
     *     
     */
    public CalcHmacRq getCalcHmacRq() {
        return calcHmacRq;
    }

    /**
     * Sets the value of the calcHmacRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcHmacRq }
     *     
     */
    public void setCalcHmacRq(CalcHmacRq value) {
        this.calcHmacRq = value;
    }

    /**
     * Gets the value of the calcHmacRs property.
     * 
     * @return
     *     possible object is
     *     {@link CalcHmacRs }
     *     
     */
    public CalcHmacRs getCalcHmacRs() {
        return calcHmacRs;
    }

    /**
     * Sets the value of the calcHmacRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcHmacRs }
     *     
     */
    public void setCalcHmacRs(CalcHmacRs value) {
        this.calcHmacRs = value;
    }

}
