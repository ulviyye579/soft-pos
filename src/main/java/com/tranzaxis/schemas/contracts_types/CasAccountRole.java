
package com.tranzaxis.schemas.contracts_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.common.UserFunc;


/**
 * <p>Java class for CasAccountRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CasAccountRole"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Condition" type="{http://schemas.radixware.org/common.xsd}UserFunc"/&gt;
 *         &lt;element name="AcctPlanItemAdjust" type="{http://schemas.radixware.org/common.xsd}UserFunc"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CasAccountMapItems" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CasAccountMapItems" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Role" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="IsOwn" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="RegRole" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CRegisterRole" /&gt;
 *       &lt;attribute name="RegSection" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CRegisterSection" /&gt;
 *       &lt;attribute name="PostingFusionSchemeGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AcctPlanItemGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Residency" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="MaxTermMonth" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="MaxTermDay" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="CorrespIncAcctRole" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AccountingSchemeGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="MaxCreditRiskLevel" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="AcctMapGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CasAccountRole", propOrder = {
    "condition",
    "acctPlanItemAdjust",
    "notes",
    "casAccountMapItems"
})
public class CasAccountRole {

    @XmlElement(name = "Condition", required = true)
    protected UserFunc condition;
    @XmlElement(name = "AcctPlanItemAdjust", required = true)
    protected UserFunc acctPlanItemAdjust;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "CasAccountMapItems")
    protected CasAccountMapItems casAccountMapItems;
    @XmlAttribute(name = "Role", required = true)
    protected String role;
    @XmlAttribute(name = "IsOwn", required = true)
    protected boolean isOwn;
    @XmlAttribute(name = "RegRole")
    protected String regRole;
    @XmlAttribute(name = "RegSection")
    protected String regSection;
    @XmlAttribute(name = "PostingFusionSchemeGuid")
    protected String postingFusionSchemeGuid;
    @XmlAttribute(name = "AcctPlanItemGuid")
    protected String acctPlanItemGuid;
    @XmlAttribute(name = "Residency")
    protected Boolean residency;
    @XmlAttribute(name = "MaxTermMonth")
    protected Long maxTermMonth;
    @XmlAttribute(name = "MaxTermDay")
    protected Long maxTermDay;
    @XmlAttribute(name = "CorrespIncAcctRole")
    protected String correspIncAcctRole;
    @XmlAttribute(name = "AccountingSchemeGuid")
    protected String accountingSchemeGuid;
    @XmlAttribute(name = "MaxCreditRiskLevel")
    protected Long maxCreditRiskLevel;
    @XmlAttribute(name = "AcctMapGuid")
    protected String acctMapGuid;

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link UserFunc }
     *     
     */
    public UserFunc getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFunc }
     *     
     */
    public void setCondition(UserFunc value) {
        this.condition = value;
    }

    /**
     * Gets the value of the acctPlanItemAdjust property.
     * 
     * @return
     *     possible object is
     *     {@link UserFunc }
     *     
     */
    public UserFunc getAcctPlanItemAdjust() {
        return acctPlanItemAdjust;
    }

    /**
     * Sets the value of the acctPlanItemAdjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFunc }
     *     
     */
    public void setAcctPlanItemAdjust(UserFunc value) {
        this.acctPlanItemAdjust = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the casAccountMapItems property.
     * 
     * @return
     *     possible object is
     *     {@link CasAccountMapItems }
     *     
     */
    public CasAccountMapItems getCasAccountMapItems() {
        return casAccountMapItems;
    }

    /**
     * Sets the value of the casAccountMapItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link CasAccountMapItems }
     *     
     */
    public void setCasAccountMapItems(CasAccountMapItems value) {
        this.casAccountMapItems = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the isOwn property.
     * 
     */
    public boolean isIsOwn() {
        return isOwn;
    }

    /**
     * Sets the value of the isOwn property.
     * 
     */
    public void setIsOwn(boolean value) {
        this.isOwn = value;
    }

    /**
     * Gets the value of the regRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegRole() {
        return regRole;
    }

    /**
     * Sets the value of the regRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegRole(String value) {
        this.regRole = value;
    }

    /**
     * Gets the value of the regSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegSection() {
        return regSection;
    }

    /**
     * Sets the value of the regSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegSection(String value) {
        this.regSection = value;
    }

    /**
     * Gets the value of the postingFusionSchemeGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingFusionSchemeGuid() {
        return postingFusionSchemeGuid;
    }

    /**
     * Sets the value of the postingFusionSchemeGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingFusionSchemeGuid(String value) {
        this.postingFusionSchemeGuid = value;
    }

    /**
     * Gets the value of the acctPlanItemGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctPlanItemGuid() {
        return acctPlanItemGuid;
    }

    /**
     * Sets the value of the acctPlanItemGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctPlanItemGuid(String value) {
        this.acctPlanItemGuid = value;
    }

    /**
     * Gets the value of the residency property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResidency() {
        return residency;
    }

    /**
     * Sets the value of the residency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResidency(Boolean value) {
        this.residency = value;
    }

    /**
     * Gets the value of the maxTermMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxTermMonth() {
        return maxTermMonth;
    }

    /**
     * Sets the value of the maxTermMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxTermMonth(Long value) {
        this.maxTermMonth = value;
    }

    /**
     * Gets the value of the maxTermDay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxTermDay() {
        return maxTermDay;
    }

    /**
     * Sets the value of the maxTermDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxTermDay(Long value) {
        this.maxTermDay = value;
    }

    /**
     * Gets the value of the correspIncAcctRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespIncAcctRole() {
        return correspIncAcctRole;
    }

    /**
     * Sets the value of the correspIncAcctRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespIncAcctRole(String value) {
        this.correspIncAcctRole = value;
    }

    /**
     * Gets the value of the accountingSchemeGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingSchemeGuid() {
        return accountingSchemeGuid;
    }

    /**
     * Sets the value of the accountingSchemeGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingSchemeGuid(String value) {
        this.accountingSchemeGuid = value;
    }

    /**
     * Gets the value of the maxCreditRiskLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxCreditRiskLevel() {
        return maxCreditRiskLevel;
    }

    /**
     * Sets the value of the maxCreditRiskLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxCreditRiskLevel(Long value) {
        this.maxCreditRiskLevel = value;
    }

    /**
     * Gets the value of the acctMapGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctMapGuid() {
        return acctMapGuid;
    }

    /**
     * Sets the value of the acctMapGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctMapGuid(String value) {
        this.acctMapGuid = value;
    }

}
