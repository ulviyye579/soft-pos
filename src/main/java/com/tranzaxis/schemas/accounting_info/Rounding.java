
package com.tranzaxis.schemas.accounting_info;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rounding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rounding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="SrcAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="RndAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="DifAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rounding")
public class Rounding {

    @XmlAttribute(name = "Ccy")
    protected Long ccy;
    @XmlAttribute(name = "SrcAmt")
    protected BigDecimal srcAmt;
    @XmlAttribute(name = "RndAmt")
    protected BigDecimal rndAmt;
    @XmlAttribute(name = "DifAmt")
    protected BigDecimal difAmt;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCcy(Long value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the srcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSrcAmt() {
        return srcAmt;
    }

    /**
     * Sets the value of the srcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSrcAmt(BigDecimal value) {
        this.srcAmt = value;
    }

    /**
     * Gets the value of the rndAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRndAmt() {
        return rndAmt;
    }

    /**
     * Sets the value of the rndAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRndAmt(BigDecimal value) {
        this.rndAmt = value;
    }

    /**
     * Gets the value of the difAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDifAmt() {
        return difAmt;
    }

    /**
     * Sets the value of the difAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDifAmt(BigDecimal value) {
        this.difAmt = value;
    }

}
