
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcPinOffset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcPinOffset"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CalcPinOffsetRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcPinOffsetRq"/&gt;
 *         &lt;element name="CalcPinOffsetRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcPinOffsetRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcPinOffset", propOrder = {
    "calcPinOffsetRq",
    "calcPinOffsetRs"
})
public class CalcPinOffset {

    @XmlElement(name = "CalcPinOffsetRq")
    protected CalcPinOffsetRq calcPinOffsetRq;
    @XmlElement(name = "CalcPinOffsetRs")
    protected CalcPinOffsetRs calcPinOffsetRs;

    /**
     * Gets the value of the calcPinOffsetRq property.
     * 
     * @return
     *     possible object is
     *     {@link CalcPinOffsetRq }
     *     
     */
    public CalcPinOffsetRq getCalcPinOffsetRq() {
        return calcPinOffsetRq;
    }

    /**
     * Sets the value of the calcPinOffsetRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcPinOffsetRq }
     *     
     */
    public void setCalcPinOffsetRq(CalcPinOffsetRq value) {
        this.calcPinOffsetRq = value;
    }

    /**
     * Gets the value of the calcPinOffsetRs property.
     * 
     * @return
     *     possible object is
     *     {@link CalcPinOffsetRs }
     *     
     */
    public CalcPinOffsetRs getCalcPinOffsetRs() {
        return calcPinOffsetRs;
    }

    /**
     * Sets the value of the calcPinOffsetRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcPinOffsetRs }
     *     
     */
    public void setCalcPinOffsetRs(CalcPinOffsetRs value) {
        this.calcPinOffsetRs = value;
    }

}
