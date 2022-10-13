
package com.tranzaxis.schemas.tran_common;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstallmentRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstallmentRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractTitle" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="RepaymentDstTranches" type="{http://schemas.tranzaxis.com/tran-common.xsd}TrancheListRef"/&gt;
 *         &lt;element name="Plan" type="{http://schemas.tranzaxis.com/tran-common.xsd}InstallmentPlan" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AskPlans" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="Kind" type="{http://schemas.tranzaxis.com/tran-common.xsd}CInstallmentKind" /&gt;
 *       &lt;attribute name="TrancheNumber" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="RepaymentDstTrancheId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="RepaymentDstTrancheIds"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SrcTrancheId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Term" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ContractTypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="InitialAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="AutoRepayment" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallmentRq", propOrder = {
    "contractTitle",
    "repaymentDstTranches",
    "plan"
})
public class InstallmentRq {

    @XmlElementRef(name = "ContractTitle", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractTitle;
    @XmlElement(name = "RepaymentDstTranches", required = true)
    protected TrancheListRef repaymentDstTranches;
    @XmlElement(name = "Plan")
    protected InstallmentPlan plan;
    @XmlAttribute(name = "AskPlans")
    @XmlSchemaType(name = "anySimpleType")
    protected String askPlans;
    @XmlAttribute(name = "Kind")
    protected String kind;
    @XmlAttribute(name = "TrancheNumber")
    protected Long trancheNumber;
    @XmlAttribute(name = "RepaymentDstTrancheId")
    protected Long repaymentDstTrancheId;
    @XmlAttribute(name = "RepaymentDstTrancheIds")
    protected List<Long> repaymentDstTrancheIds;
    @XmlAttribute(name = "SrcTrancheId")
    protected Long srcTrancheId;
    @XmlAttribute(name = "Term")
    protected Long term;
    @XmlAttribute(name = "ContractTypeId")
    protected Long contractTypeId;
    @XmlAttribute(name = "InitialAmt")
    protected BigDecimal initialAmt;
    @XmlAttribute(name = "ContractId")
    protected Long contractId;
    @XmlAttribute(name = "AutoRepayment")
    protected Boolean autoRepayment;

    /**
     * Gets the value of the contractTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractTitle() {
        return contractTitle;
    }

    /**
     * Sets the value of the contractTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractTitle(JAXBElement<String> value) {
        this.contractTitle = value;
    }

    /**
     * Gets the value of the repaymentDstTranches property.
     * 
     * @return
     *     possible object is
     *     {@link TrancheListRef }
     *     
     */
    public TrancheListRef getRepaymentDstTranches() {
        return repaymentDstTranches;
    }

    /**
     * Sets the value of the repaymentDstTranches property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrancheListRef }
     *     
     */
    public void setRepaymentDstTranches(TrancheListRef value) {
        this.repaymentDstTranches = value;
    }

    /**
     * Gets the value of the plan property.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentPlan }
     *     
     */
    public InstallmentPlan getPlan() {
        return plan;
    }

    /**
     * Sets the value of the plan property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentPlan }
     *     
     */
    public void setPlan(InstallmentPlan value) {
        this.plan = value;
    }

    /**
     * Gets the value of the askPlans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAskPlans() {
        return askPlans;
    }

    /**
     * Sets the value of the askPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAskPlans(String value) {
        this.askPlans = value;
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
     * Gets the value of the trancheNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTrancheNumber() {
        return trancheNumber;
    }

    /**
     * Sets the value of the trancheNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTrancheNumber(Long value) {
        this.trancheNumber = value;
    }

    /**
     * Gets the value of the repaymentDstTrancheId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepaymentDstTrancheId() {
        return repaymentDstTrancheId;
    }

    /**
     * Sets the value of the repaymentDstTrancheId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepaymentDstTrancheId(Long value) {
        this.repaymentDstTrancheId = value;
    }

    /**
     * Gets the value of the repaymentDstTrancheIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repaymentDstTrancheIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepaymentDstTrancheIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getRepaymentDstTrancheIds() {
        if (repaymentDstTrancheIds == null) {
            repaymentDstTrancheIds = new ArrayList<Long>();
        }
        return this.repaymentDstTrancheIds;
    }

    /**
     * Gets the value of the srcTrancheId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSrcTrancheId() {
        return srcTrancheId;
    }

    /**
     * Sets the value of the srcTrancheId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSrcTrancheId(Long value) {
        this.srcTrancheId = value;
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
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractId(Long value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the autoRepayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoRepayment() {
        return autoRepayment;
    }

    /**
     * Sets the value of the autoRepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoRepayment(Boolean value) {
        this.autoRepayment = value;
    }

}
