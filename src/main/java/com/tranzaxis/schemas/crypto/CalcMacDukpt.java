
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcMacDukpt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcMacDukpt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CalcMacDukptRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcMacDukptRq"/&gt;
 *         &lt;element name="CalcMacDukptRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcMacDukptRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcMacDukpt", propOrder = {
    "calcMacDukptRq",
    "calcMacDukptRs"
})
public class CalcMacDukpt {

    @XmlElement(name = "CalcMacDukptRq")
    protected CalcMacDukptRq calcMacDukptRq;
    @XmlElement(name = "CalcMacDukptRs")
    protected CalcMacDukptRs calcMacDukptRs;

    /**
     * Gets the value of the calcMacDukptRq property.
     * 
     * @return
     *     possible object is
     *     {@link CalcMacDukptRq }
     *     
     */
    public CalcMacDukptRq getCalcMacDukptRq() {
        return calcMacDukptRq;
    }

    /**
     * Sets the value of the calcMacDukptRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcMacDukptRq }
     *     
     */
    public void setCalcMacDukptRq(CalcMacDukptRq value) {
        this.calcMacDukptRq = value;
    }

    /**
     * Gets the value of the calcMacDukptRs property.
     * 
     * @return
     *     possible object is
     *     {@link CalcMacDukptRs }
     *     
     */
    public CalcMacDukptRs getCalcMacDukptRs() {
        return calcMacDukptRs;
    }

    /**
     * Sets the value of the calcMacDukptRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcMacDukptRs }
     *     
     */
    public void setCalcMacDukptRs(CalcMacDukptRs value) {
        this.calcMacDukptRs = value;
    }

}
