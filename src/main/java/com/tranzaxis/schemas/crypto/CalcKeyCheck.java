
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcKeyCheck complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcKeyCheck"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CalcKeyCheckRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcKeyCheckRq"/&gt;
 *         &lt;element name="CalcKeyCheckRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcKeyCheckRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcKeyCheck", propOrder = {
    "calcKeyCheckRq",
    "calcKeyCheckRs"
})
public class CalcKeyCheck {

    @XmlElement(name = "CalcKeyCheckRq")
    protected CalcKeyCheckRq calcKeyCheckRq;
    @XmlElement(name = "CalcKeyCheckRs")
    protected CalcKeyCheckRs calcKeyCheckRs;

    /**
     * Gets the value of the calcKeyCheckRq property.
     * 
     * @return
     *     possible object is
     *     {@link CalcKeyCheckRq }
     *     
     */
    public CalcKeyCheckRq getCalcKeyCheckRq() {
        return calcKeyCheckRq;
    }

    /**
     * Sets the value of the calcKeyCheckRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcKeyCheckRq }
     *     
     */
    public void setCalcKeyCheckRq(CalcKeyCheckRq value) {
        this.calcKeyCheckRq = value;
    }

    /**
     * Gets the value of the calcKeyCheckRs property.
     * 
     * @return
     *     possible object is
     *     {@link CalcKeyCheckRs }
     *     
     */
    public CalcKeyCheckRs getCalcKeyCheckRs() {
        return calcKeyCheckRs;
    }

    /**
     * Sets the value of the calcKeyCheckRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcKeyCheckRs }
     *     
     */
    public void setCalcKeyCheckRs(CalcKeyCheckRs value) {
        this.calcKeyCheckRs = value;
    }

}
