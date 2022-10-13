
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcCsc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcCsc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CalcCscRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcCscRq"/&gt;
 *         &lt;element name="CalcCscRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcCscRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcCsc", propOrder = {
    "calcCscRq",
    "calcCscRs"
})
public class CalcCsc {

    @XmlElement(name = "CalcCscRq")
    protected CalcCscRq calcCscRq;
    @XmlElement(name = "CalcCscRs")
    protected CalcCscRs calcCscRs;

    /**
     * Gets the value of the calcCscRq property.
     * 
     * @return
     *     possible object is
     *     {@link CalcCscRq }
     *     
     */
    public CalcCscRq getCalcCscRq() {
        return calcCscRq;
    }

    /**
     * Sets the value of the calcCscRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcCscRq }
     *     
     */
    public void setCalcCscRq(CalcCscRq value) {
        this.calcCscRq = value;
    }

    /**
     * Gets the value of the calcCscRs property.
     * 
     * @return
     *     possible object is
     *     {@link CalcCscRs }
     *     
     */
    public CalcCscRs getCalcCscRs() {
        return calcCscRs;
    }

    /**
     * Sets the value of the calcCscRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcCscRs }
     *     
     */
    public void setCalcCscRs(CalcCscRs value) {
        this.calcCscRs = value;
    }

}
