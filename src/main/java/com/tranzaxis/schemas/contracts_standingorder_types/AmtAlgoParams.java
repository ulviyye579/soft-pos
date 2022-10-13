
package com.tranzaxis.schemas.contracts_standingorder_types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmtAlgoParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmtAlgoParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ConstAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="CcyId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Percent" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="MinAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="SkipBelowMin" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="MaxAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="ThresholdAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmtAlgoParams")
public class AmtAlgoParams {

    @XmlAttribute(name = "ConstAmt")
    protected BigDecimal constAmt;
    @XmlAttribute(name = "CcyId")
    protected Long ccyId;
    @XmlAttribute(name = "Percent")
    protected Long percent;
    @XmlAttribute(name = "MinAmt")
    protected BigDecimal minAmt;
    @XmlAttribute(name = "SkipBelowMin")
    protected Boolean skipBelowMin;
    @XmlAttribute(name = "MaxAmt")
    protected BigDecimal maxAmt;
    @XmlAttribute(name = "ThresholdAmt")
    protected BigDecimal thresholdAmt;

    /**
     * Gets the value of the constAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConstAmt() {
        return constAmt;
    }

    /**
     * Sets the value of the constAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConstAmt(BigDecimal value) {
        this.constAmt = value;
    }

    /**
     * Gets the value of the ccyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCcyId() {
        return ccyId;
    }

    /**
     * Sets the value of the ccyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCcyId(Long value) {
        this.ccyId = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPercent(Long value) {
        this.percent = value;
    }

    /**
     * Gets the value of the minAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAmt() {
        return minAmt;
    }

    /**
     * Sets the value of the minAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAmt(BigDecimal value) {
        this.minAmt = value;
    }

    /**
     * Gets the value of the skipBelowMin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipBelowMin() {
        return skipBelowMin;
    }

    /**
     * Sets the value of the skipBelowMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipBelowMin(Boolean value) {
        this.skipBelowMin = value;
    }

    /**
     * Gets the value of the maxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmt() {
        return maxAmt;
    }

    /**
     * Sets the value of the maxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAmt(BigDecimal value) {
        this.maxAmt = value;
    }

    /**
     * Gets the value of the thresholdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThresholdAmt() {
        return thresholdAmt;
    }

    /**
     * Sets the value of the thresholdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThresholdAmt(BigDecimal value) {
        this.thresholdAmt = value;
    }

}
