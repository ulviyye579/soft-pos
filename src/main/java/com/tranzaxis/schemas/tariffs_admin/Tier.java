
package com.tranzaxis.schemas.tariffs_admin;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" default="0" /&gt;
 *       &lt;attribute name="AmtLowBound" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="TermLowBound" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="LowVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="Percent" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tier")
public class Tier {

    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;
    @XmlAttribute(name = "AmtLowBound", required = true)
    protected BigDecimal amtLowBound;
    @XmlAttribute(name = "TermLowBound", required = true)
    protected long termLowBound;
    @XmlAttribute(name = "LowVal")
    protected BigDecimal lowVal;
    @XmlAttribute(name = "Percent")
    protected BigDecimal percent;

    /**
     * Gets the value of the toDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isToDelete() {
        if (toDelete == null) {
            return false;
        } else {
            return toDelete;
        }
    }

    /**
     * Sets the value of the toDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToDelete(Boolean value) {
        this.toDelete = value;
    }

    /**
     * Gets the value of the amtLowBound property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtLowBound() {
        return amtLowBound;
    }

    /**
     * Sets the value of the amtLowBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtLowBound(BigDecimal value) {
        this.amtLowBound = value;
    }

    /**
     * Gets the value of the termLowBound property.
     * 
     */
    public long getTermLowBound() {
        return termLowBound;
    }

    /**
     * Sets the value of the termLowBound property.
     * 
     */
    public void setTermLowBound(long value) {
        this.termLowBound = value;
    }

    /**
     * Gets the value of the lowVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowVal() {
        return lowVal;
    }

    /**
     * Sets the value of the lowVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowVal(BigDecimal value) {
        this.lowVal = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

}
