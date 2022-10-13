
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcArpc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcArpc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CalcArpcRq" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcArpcRq"/&gt;
 *         &lt;element name="CalcArpcRs" type="{http://schemas.tranzaxis.com/crypto.xsd}CalcArpcRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcArpc", propOrder = {
    "calcArpcRq",
    "calcArpcRs"
})
public class CalcArpc {

    @XmlElement(name = "CalcArpcRq")
    protected CalcArpcRq calcArpcRq;
    @XmlElement(name = "CalcArpcRs")
    protected CalcArpcRs calcArpcRs;

    /**
     * Gets the value of the calcArpcRq property.
     * 
     * @return
     *     possible object is
     *     {@link CalcArpcRq }
     *     
     */
    public CalcArpcRq getCalcArpcRq() {
        return calcArpcRq;
    }

    /**
     * Sets the value of the calcArpcRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcArpcRq }
     *     
     */
    public void setCalcArpcRq(CalcArpcRq value) {
        this.calcArpcRq = value;
    }

    /**
     * Gets the value of the calcArpcRs property.
     * 
     * @return
     *     possible object is
     *     {@link CalcArpcRs }
     *     
     */
    public CalcArpcRs getCalcArpcRs() {
        return calcArpcRs;
    }

    /**
     * Sets the value of the calcArpcRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcArpcRs }
     *     
     */
    public void setCalcArpcRs(CalcArpcRs value) {
        this.calcArpcRs = value;
    }

}
