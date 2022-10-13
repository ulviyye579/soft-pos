
package com.tranzaxis.schemas.accounting_info;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Conversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conversion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="FromCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="FromAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="ToCcy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ToAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="RateGroupId" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="RateDay" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="RateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conversion")
public class Conversion {

    @XmlAttribute(name = "FromCcy")
    protected Long fromCcy;
    @XmlAttribute(name = "FromAmt")
    protected BigDecimal fromAmt;
    @XmlAttribute(name = "ToCcy", required = true)
    protected long toCcy;
    @XmlAttribute(name = "ToAmt", required = true)
    protected BigDecimal toAmt;
    @XmlAttribute(name = "RateGroupId")
    protected BigDecimal rateGroupId;
    @XmlAttribute(name = "RateDay")
    protected XMLGregorianCalendar rateDay;
    @XmlAttribute(name = "RateTime")
    protected XMLGregorianCalendar rateTime;

    /**
     * Gets the value of the fromCcy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFromCcy() {
        return fromCcy;
    }

    /**
     * Sets the value of the fromCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFromCcy(Long value) {
        this.fromCcy = value;
    }

    /**
     * Gets the value of the fromAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFromAmt() {
        return fromAmt;
    }

    /**
     * Sets the value of the fromAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFromAmt(BigDecimal value) {
        this.fromAmt = value;
    }

    /**
     * Gets the value of the toCcy property.
     * 
     */
    public long getToCcy() {
        return toCcy;
    }

    /**
     * Sets the value of the toCcy property.
     * 
     */
    public void setToCcy(long value) {
        this.toCcy = value;
    }

    /**
     * Gets the value of the toAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToAmt() {
        return toAmt;
    }

    /**
     * Sets the value of the toAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToAmt(BigDecimal value) {
        this.toAmt = value;
    }

    /**
     * Gets the value of the rateGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateGroupId() {
        return rateGroupId;
    }

    /**
     * Sets the value of the rateGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRateGroupId(BigDecimal value) {
        this.rateGroupId = value;
    }

    /**
     * Gets the value of the rateDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRateDay() {
        return rateDay;
    }

    /**
     * Sets the value of the rateDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRateDay(XMLGregorianCalendar value) {
        this.rateDay = value;
    }

    /**
     * Gets the value of the rateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRateTime() {
        return rateTime;
    }

    /**
     * Sets the value of the rateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRateTime(XMLGregorianCalendar value) {
        this.rateTime = value;
    }

}
