
package com.tranzaxis.schemas.tran_common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstallmentPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstallmentPlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TranchesNumber" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="InterestRate" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="Fee" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="Apr" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="FirstTrancheAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="SubsequentTranchesAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="TotalAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallmentPlan")
public class InstallmentPlan {

    @XmlAttribute(name = "TranchesNumber")
    protected Long tranchesNumber;
    @XmlAttribute(name = "InterestRate")
    protected BigDecimal interestRate;
    @XmlAttribute(name = "Fee")
    protected BigDecimal fee;
    @XmlAttribute(name = "Apr")
    protected BigDecimal apr;
    @XmlAttribute(name = "FirstTrancheAmt")
    protected BigDecimal firstTrancheAmt;
    @XmlAttribute(name = "SubsequentTranchesAmt")
    protected BigDecimal subsequentTranchesAmt;
    @XmlAttribute(name = "TotalAmt")
    protected BigDecimal totalAmt;

    /**
     * Gets the value of the tranchesNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTranchesNumber() {
        return tranchesNumber;
    }

    /**
     * Sets the value of the tranchesNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTranchesNumber(Long value) {
        this.tranchesNumber = value;
    }

    /**
     * Gets the value of the interestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the value of the interestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestRate(BigDecimal value) {
        this.interestRate = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFee(BigDecimal value) {
        this.fee = value;
    }

    /**
     * Gets the value of the apr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApr() {
        return apr;
    }

    /**
     * Sets the value of the apr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApr(BigDecimal value) {
        this.apr = value;
    }

    /**
     * Gets the value of the firstTrancheAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstTrancheAmt() {
        return firstTrancheAmt;
    }

    /**
     * Sets the value of the firstTrancheAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstTrancheAmt(BigDecimal value) {
        this.firstTrancheAmt = value;
    }

    /**
     * Gets the value of the subsequentTranchesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubsequentTranchesAmt() {
        return subsequentTranchesAmt;
    }

    /**
     * Sets the value of the subsequentTranchesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubsequentTranchesAmt(BigDecimal value) {
        this.subsequentTranchesAmt = value;
    }

    /**
     * Gets the value of the totalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    /**
     * Sets the value of the totalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmt(BigDecimal value) {
        this.totalAmt = value;
    }

}
