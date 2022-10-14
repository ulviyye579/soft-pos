
package com.tranzaxis.schemas.accounting_info;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TariffRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/accounting-info.xsd}TariffMinMax"&gt;
 *       &lt;attribute name="SrcForRate" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="Term" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="CellId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="BaseRate" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="RateCorrections"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Rate" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="CalcPeriodLen" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffRate")
@XmlSeeAlso({
    com.tranzaxis.schemas.accounting_info.TariffInfo.Interest.Day.class,
    com.tranzaxis.schemas.accounting_info.TariffInfo.Rate.class
})
public class TariffRate
    extends TariffMinMax
{

    @XmlAttribute(name = "SrcForRate")
    protected BigDecimal srcForRate;
    @XmlAttribute(name = "Term")
    protected Long term;
    @XmlAttribute(name = "CellId")
    protected Long cellId;
    @XmlAttribute(name = "BaseRate")
    protected BigDecimal baseRate;
    @XmlAttribute(name = "RateCorrections")
    protected List<BigDecimal> rateCorrections;
    @XmlAttribute(name = "Rate")
    protected BigDecimal rate;
    @XmlAttribute(name = "CalcPeriodLen")
    protected BigDecimal calcPeriodLen;

    /**
     * Gets the value of the srcForRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSrcForRate() {
        return srcForRate;
    }

    /**
     * Sets the value of the srcForRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSrcForRate(BigDecimal value) {
        this.srcForRate = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTerm(Long value) {
        this.term = value;
    }

    /**
     * Gets the value of the cellId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCellId(Long value) {
        this.cellId = value;
    }

    /**
     * Gets the value of the baseRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseRate() {
        return baseRate;
    }

    /**
     * Sets the value of the baseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseRate(BigDecimal value) {
        this.baseRate = value;
    }

    /**
     * Gets the value of the rateCorrections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateCorrections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateCorrections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getRateCorrections() {
        if (rateCorrections == null) {
            rateCorrections = new ArrayList<BigDecimal>();
        }
        return this.rateCorrections;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the calcPeriodLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalcPeriodLen() {
        return calcPeriodLen;
    }

    /**
     * Sets the value of the calcPeriodLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalcPeriodLen(BigDecimal value) {
        this.calcPeriodLen = value;
    }

}
