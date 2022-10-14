
package com.tranzaxis.schemas.tran_common;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.contracts_types.PaymentSchedule;


/**
 * <p>Java class for InstallmentRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstallmentRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Schedule" type="{http://schemas.tranzaxis.com/contracts-types.xsd}PaymentSchedule" minOccurs="0"/&gt;
 *         &lt;element name="Plans" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Plan" type="{http://schemas.tranzaxis.com/tran-common.xsd}InstallmentPlan" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Allowed" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="Mandated" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="Kind" type="{http://schemas.tranzaxis.com/tran-common.xsd}CInstallmentKind" /&gt;
 *       &lt;attribute name="RegularPaymentAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="PrincipalAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="GrantAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="GrantChargeAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="InitialAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="InterestRate" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="InterestAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="FeeAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="TotalRepayAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Term" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ContractTypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TariffPlanGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallmentRs", propOrder = {
    "schedule",
    "plans"
})
public class InstallmentRs {

    @XmlElement(name = "Schedule")
    protected PaymentSchedule schedule;
    @XmlElement(name = "Plans")
    protected InstallmentRs.Plans plans;
    @XmlAttribute(name = "Allowed")
    protected Boolean allowed;
    @XmlAttribute(name = "Mandated")
    protected Boolean mandated;
    @XmlAttribute(name = "Kind")
    protected String kind;
    @XmlAttribute(name = "RegularPaymentAmt")
    protected BigDecimal regularPaymentAmt;
    @XmlAttribute(name = "PrincipalAmt")
    protected BigDecimal principalAmt;
    @XmlAttribute(name = "GrantAmt")
    protected BigDecimal grantAmt;
    @XmlAttribute(name = "GrantChargeAmt")
    protected BigDecimal grantChargeAmt;
    @XmlAttribute(name = "InitialAmt")
    protected BigDecimal initialAmt;
    @XmlAttribute(name = "InterestRate")
    protected BigDecimal interestRate;
    @XmlAttribute(name = "InterestAmt")
    protected BigDecimal interestAmt;
    @XmlAttribute(name = "FeeAmt")
    protected BigDecimal feeAmt;
    @XmlAttribute(name = "TotalRepayAmt")
    protected BigDecimal totalRepayAmt;
    @XmlAttribute(name = "Ccy")
    protected Long ccy;
    @XmlAttribute(name = "Term")
    protected Long term;
    @XmlAttribute(name = "ContractTypeId")
    protected Long contractTypeId;
    @XmlAttribute(name = "TariffPlanGuid")
    protected String tariffPlanGuid;

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentSchedule }
     *     
     */
    public PaymentSchedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentSchedule }
     *     
     */
    public void setSchedule(PaymentSchedule value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the plans property.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentRs.Plans }
     *     
     */
    public InstallmentRs.Plans getPlans() {
        return plans;
    }

    /**
     * Sets the value of the plans property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentRs.Plans }
     *     
     */
    public void setPlans(InstallmentRs.Plans value) {
        this.plans = value;
    }

    /**
     * Gets the value of the allowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowed() {
        return allowed;
    }

    /**
     * Sets the value of the allowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowed(Boolean value) {
        this.allowed = value;
    }

    /**
     * Gets the value of the mandated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandated() {
        return mandated;
    }

    /**
     * Sets the value of the mandated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandated(Boolean value) {
        this.mandated = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Gets the value of the regularPaymentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegularPaymentAmt() {
        return regularPaymentAmt;
    }

    /**
     * Sets the value of the regularPaymentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegularPaymentAmt(BigDecimal value) {
        this.regularPaymentAmt = value;
    }

    /**
     * Gets the value of the principalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrincipalAmt() {
        return principalAmt;
    }

    /**
     * Sets the value of the principalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrincipalAmt(BigDecimal value) {
        this.principalAmt = value;
    }

    /**
     * Gets the value of the grantAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrantAmt() {
        return grantAmt;
    }

    /**
     * Sets the value of the grantAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrantAmt(BigDecimal value) {
        this.grantAmt = value;
    }

    /**
     * Gets the value of the grantChargeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrantChargeAmt() {
        return grantChargeAmt;
    }

    /**
     * Sets the value of the grantChargeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrantChargeAmt(BigDecimal value) {
        this.grantChargeAmt = value;
    }

    /**
     * Gets the value of the initialAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialAmt() {
        return initialAmt;
    }

    /**
     * Sets the value of the initialAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialAmt(BigDecimal value) {
        this.initialAmt = value;
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
     * Gets the value of the interestAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestAmt() {
        return interestAmt;
    }

    /**
     * Sets the value of the interestAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestAmt(BigDecimal value) {
        this.interestAmt = value;
    }

    /**
     * Gets the value of the feeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeAmt() {
        return feeAmt;
    }

    /**
     * Sets the value of the feeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeAmt(BigDecimal value) {
        this.feeAmt = value;
    }

    /**
     * Gets the value of the totalRepayAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalRepayAmt() {
        return totalRepayAmt;
    }

    /**
     * Sets the value of the totalRepayAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalRepayAmt(BigDecimal value) {
        this.totalRepayAmt = value;
    }

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
     * Gets the value of the contractTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractTypeId() {
        return contractTypeId;
    }

    /**
     * Sets the value of the contractTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractTypeId(Long value) {
        this.contractTypeId = value;
    }

    /**
     * Gets the value of the tariffPlanGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffPlanGuid() {
        return tariffPlanGuid;
    }

    /**
     * Sets the value of the tariffPlanGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffPlanGuid(String value) {
        this.tariffPlanGuid = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Plan" type="{http://schemas.tranzaxis.com/tran-common.xsd}InstallmentPlan" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "plan"
    })
    public static class Plans {

        @XmlElement(name = "Plan")
        protected List<InstallmentPlan> plan;

        /**
         * Gets the value of the plan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InstallmentPlan }
         * 
         * 
         */
        public List<InstallmentPlan> getPlan() {
            if (plan == null) {
                plan = new ArrayList<InstallmentPlan>();
            }
            return this.plan;
        }

    }

}
