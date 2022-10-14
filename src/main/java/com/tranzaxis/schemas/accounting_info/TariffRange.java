
package com.tranzaxis.schemas.accounting_info;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TariffRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="LowBound" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="UpBound" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="Mult" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="SrcPart" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="ResultPart" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffRange")
public class TariffRange {

    @XmlAttribute(name = "LowBound")
    protected BigDecimal lowBound;
    @XmlAttribute(name = "UpBound")
    protected BigDecimal upBound;
    @XmlAttribute(name = "Mult")
    protected BigDecimal mult;
    @XmlAttribute(name = "SrcPart")
    protected BigDecimal srcPart;
    @XmlAttribute(name = "ResultPart")
    protected BigDecimal resultPart;

    /**
     * Gets the value of the lowBound property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowBound() {
        return lowBound;
    }

    /**
     * Sets the value of the lowBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowBound(BigDecimal value) {
        this.lowBound = value;
    }

    /**
     * Gets the value of the upBound property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpBound() {
        return upBound;
    }

    /**
     * Sets the value of the upBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpBound(BigDecimal value) {
        this.upBound = value;
    }

    /**
     * Gets the value of the mult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMult() {
        return mult;
    }

    /**
     * Sets the value of the mult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMult(BigDecimal value) {
        this.mult = value;
    }

    /**
     * Gets the value of the srcPart property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSrcPart() {
        return srcPart;
    }

    /**
     * Sets the value of the srcPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSrcPart(BigDecimal value) {
        this.srcPart = value;
    }

    /**
     * Gets the value of the resultPart property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResultPart() {
        return resultPart;
    }

    /**
     * Sets the value of the resultPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setResultPart(BigDecimal value) {
        this.resultPart = value;
    }

}
