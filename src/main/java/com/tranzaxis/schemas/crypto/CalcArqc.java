
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcArqc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcArqc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CalcArqcRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcArqcRq"/&gt;
 *         &lt;element name="CalcArqcRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcArqcRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcArqc", propOrder = {
    "calcArqcRq",
    "calcArqcRs"
})
public class CalcArqc {

    @XmlElement(name = "CalcArqcRq")
    protected CalcArqcRq calcArqcRq;
    @XmlElement(name = "CalcArqcRs")
    protected CalcArqcRs calcArqcRs;

    /**
     * Gets the value of the calcArqcRq property.
     * 
     * @return
     *     possible object is
     *     {@link CalcArqcRq }
     *     
     */
    public CalcArqcRq getCalcArqcRq() {
        return calcArqcRq;
    }

    /**
     * Sets the value of the calcArqcRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcArqcRq }
     *     
     */
    public void setCalcArqcRq(CalcArqcRq value) {
        this.calcArqcRq = value;
    }

    /**
     * Gets the value of the calcArqcRs property.
     * 
     * @return
     *     possible object is
     *     {@link CalcArqcRs }
     *     
     */
    public CalcArqcRs getCalcArqcRs() {
        return calcArqcRs;
    }

    /**
     * Sets the value of the calcArqcRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcArqcRs }
     *     
     */
    public void setCalcArqcRs(CalcArqcRs value) {
        this.calcArqcRs = value;
    }

}
