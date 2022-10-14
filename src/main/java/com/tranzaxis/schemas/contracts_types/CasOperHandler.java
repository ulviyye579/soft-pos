
package com.tranzaxis.schemas.contracts_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.common.UserFunc;


/**
 * <p>Java class for CasOperHandler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CasOperHandler"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Condition" type="{http://schemas.radixware.org/common.xsd}UserFunc"/&gt;
 *         &lt;element name="ConditionIdx" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="EntryPart" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CasOperEntryPart" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="EntryQualifierText" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ClassGuid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="EntryQualifierCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="IsBeforeExt" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *       &lt;attribute name="EntryKindVariant" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CEntryKindVariant" /&gt;
 *       &lt;attribute name="EntryKind" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CEntryKind" /&gt;
 *       &lt;attribute name="EntryKindIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TariffIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="EntryInfoIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="RegRole" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CRegisterRole" /&gt;
 *       &lt;attribute name="TransferEntryKind" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CEntryKind" /&gt;
 *       &lt;attribute name="CorrespondAcctMapGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ToCloseEmptyAcct" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="ValMoneyIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="InvertConditionParam" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *       &lt;attribute name="DebtAcctRoles"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="DebtAcctClassificationIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="RepaymentSrcIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="RepaymentEntryKindIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="RepaymentEntryKind" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CEntryKind" /&gt;
 *       &lt;attribute name="RepaymentAcctRole" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="RepaymentCorrAcctRole" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="RepaymentSrcClassificationIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TechCorrAcctRole" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="IncAcctRoleName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ResEntryKindIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="BadDebtEntryKindIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="DebtRegRole" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CRegisterRole" /&gt;
 *       &lt;attribute name="DebtRegRoleIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="DebtRegSectionIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="DebtRegSection" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CRegisterSection" /&gt;
 *       &lt;attribute name="ExpenseAcctRoleName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ExpAcctRoleName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ResAcctRoleName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="OverpayAcctRole" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="OverpayResiterIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="OverpayRegisterRole" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CRegisterRole" /&gt;
 *       &lt;attribute name="OverpayRegSectionIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="OverpayRegSection" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CRegisterSection" /&gt;
 *       &lt;attribute name="OverpayRegClsIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="CorrExecutorIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="PartialAccrual" type="{http://schemas.radixware.org/types.xsd}Char" /&gt;
 *       &lt;attribute name="OwnFundsAcctRoleName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="OwnFundsRegRole" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CRegisterRole" /&gt;
 *       &lt;attribute name="OwnFundsRegIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="OwnFundsRegSectionIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="OwnFundsRegSection" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CRegisterSection" /&gt;
 *       &lt;attribute name="OwnFundsRegClsIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="OwnFundsAmtIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="EntryCategorySources"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Signum" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CPostingSign" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CasOperHandler", propOrder = {
    "condition",
    "conditionIdx",
    "entryPart",
    "notes",
    "entryQualifierText"
})
public class CasOperHandler {

    @XmlElement(name = "Condition", required = true)
    protected UserFunc condition;
    @XmlElementRef(name = "ConditionIdx", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> conditionIdx;
    @XmlElement(name = "EntryPart", required = true)
    protected List<CasOperEntryPart> entryPart;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "EntryQualifierText")
    protected String entryQualifierText;
    @XmlAttribute(name = "ClassGuid", required = true)
    protected String classGuid;
    @XmlAttribute(name = "EntryQualifierCode")
    protected String entryQualifierCode;
    @XmlAttribute(name = "IsBeforeExt")
    protected Boolean isBeforeExt;
    @XmlAttribute(name = "EntryKindVariant")
    protected String entryKindVariant;
    @XmlAttribute(name = "EntryKind")
    protected String entryKind;
    @XmlAttribute(name = "EntryKindIdx")
    protected Long entryKindIdx;
    @XmlAttribute(name = "TariffIdx")
    protected Long tariffIdx;
    @XmlAttribute(name = "EntryInfoIdx")
    protected Long entryInfoIdx;
    @XmlAttribute(name = "RegRole")
    protected String regRole;
    @XmlAttribute(name = "TransferEntryKind")
    protected String transferEntryKind;
    @XmlAttribute(name = "CorrespondAcctMapGuid")
    protected String correspondAcctMapGuid;
    @XmlAttribute(name = "ToCloseEmptyAcct", required = true)
    protected boolean toCloseEmptyAcct;
    @XmlAttribute(name = "ValMoneyIdx")
    protected Long valMoneyIdx;
    @XmlAttribute(name = "InvertConditionParam")
    protected Boolean invertConditionParam;
    @XmlAttribute(name = "DebtAcctRoles")
    protected List<String> debtAcctRoles;
    @XmlAttribute(name = "DebtAcctClassificationIdx")
    protected Long debtAcctClassificationIdx;
    @XmlAttribute(name = "RepaymentSrcIdx")
    protected Long repaymentSrcIdx;
    @XmlAttribute(name = "RepaymentEntryKindIdx")
    protected Long repaymentEntryKindIdx;
    @XmlAttribute(name = "RepaymentEntryKind")
    protected String repaymentEntryKind;
    @XmlAttribute(name = "RepaymentAcctRole")
    protected String repaymentAcctRole;
    @XmlAttribute(name = "RepaymentCorrAcctRole")
    protected String repaymentCorrAcctRole;
    @XmlAttribute(name = "RepaymentSrcClassificationIdx")
    protected Long repaymentSrcClassificationIdx;
    @XmlAttribute(name = "TechCorrAcctRole")
    protected String techCorrAcctRole;
    @XmlAttribute(name = "IncAcctRoleName")
    protected String incAcctRoleName;
    @XmlAttribute(name = "ResEntryKindIdx")
    protected Long resEntryKindIdx;
    @XmlAttribute(name = "BadDebtEntryKindIdx")
    protected Long badDebtEntryKindIdx;
    @XmlAttribute(name = "DebtRegRole")
    protected String debtRegRole;
    @XmlAttribute(name = "DebtRegRoleIdx")
    protected Long debtRegRoleIdx;
    @XmlAttribute(name = "DebtRegSectionIdx")
    protected Long debtRegSectionIdx;
    @XmlAttribute(name = "DebtRegSection")
    protected String debtRegSection;
    @XmlAttribute(name = "ExpenseAcctRoleName")
    protected String expenseAcctRoleName;
    @XmlAttribute(name = "ExpAcctRoleName")
    protected String expAcctRoleName;
    @XmlAttribute(name = "ResAcctRoleName")
    protected String resAcctRoleName;
    @XmlAttribute(name = "OverpayAcctRole")
    protected String overpayAcctRole;
    @XmlAttribute(name = "OverpayResiterIdx")
    protected Long overpayResiterIdx;
    @XmlAttribute(name = "OverpayRegisterRole")
    protected String overpayRegisterRole;
    @XmlAttribute(name = "OverpayRegSectionIdx")
    protected Long overpayRegSectionIdx;
    @XmlAttribute(name = "OverpayRegSection")
    protected String overpayRegSection;
    @XmlAttribute(name = "OverpayRegClsIdx")
    protected Long overpayRegClsIdx;
    @XmlAttribute(name = "CorrExecutorIdx")
    protected Long corrExecutorIdx;
    @XmlAttribute(name = "PartialAccrual")
    protected String partialAccrual;
    @XmlAttribute(name = "OwnFundsAcctRoleName")
    protected String ownFundsAcctRoleName;
    @XmlAttribute(name = "OwnFundsRegRole")
    protected String ownFundsRegRole;
    @XmlAttribute(name = "OwnFundsRegIdx")
    protected Long ownFundsRegIdx;
    @XmlAttribute(name = "OwnFundsRegSectionIdx")
    protected Long ownFundsRegSectionIdx;
    @XmlAttribute(name = "OwnFundsRegSection")
    protected String ownFundsRegSection;
    @XmlAttribute(name = "OwnFundsRegClsIdx")
    protected Long ownFundsRegClsIdx;
    @XmlAttribute(name = "OwnFundsAmtIdx")
    protected Long ownFundsAmtIdx;
    @XmlAttribute(name = "EntryCategorySources")
    protected List<String> entryCategorySources;
    @XmlAttribute(name = "Signum")
    protected Long signum;

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
     * Gets the value of the conditionIdx property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getConditionIdx() {
        return conditionIdx;
    }

    /**
     * Sets the value of the conditionIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setConditionIdx(JAXBElement<Long> value) {
        this.conditionIdx = value;
    }

    /**
     * Gets the value of the entryPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entryPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CasOperEntryPart }
     * 
     * 
     */
    public List<CasOperEntryPart> getEntryPart() {
        if (entryPart == null) {
            entryPart = new ArrayList<CasOperEntryPart>();
        }
        return this.entryPart;
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
     * Gets the value of the entryQualifierText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryQualifierText() {
        return entryQualifierText;
    }

    /**
     * Sets the value of the entryQualifierText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryQualifierText(String value) {
        this.entryQualifierText = value;
    }

    /**
     * Gets the value of the classGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassGuid() {
        return classGuid;
    }

    /**
     * Sets the value of the classGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassGuid(String value) {
        this.classGuid = value;
    }

    /**
     * Gets the value of the entryQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryQualifierCode() {
        return entryQualifierCode;
    }

    /**
     * Sets the value of the entryQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryQualifierCode(String value) {
        this.entryQualifierCode = value;
    }

    /**
     * Gets the value of the isBeforeExt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsBeforeExt() {
        if (isBeforeExt == null) {
            return false;
        } else {
            return isBeforeExt;
        }
    }

    /**
     * Sets the value of the isBeforeExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBeforeExt(Boolean value) {
        this.isBeforeExt = value;
    }

    /**
     * Gets the value of the entryKindVariant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryKindVariant() {
        return entryKindVariant;
    }

    /**
     * Sets the value of the entryKindVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryKindVariant(String value) {
        this.entryKindVariant = value;
    }

    /**
     * Gets the value of the entryKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryKind() {
        return entryKind;
    }

    /**
     * Sets the value of the entryKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryKind(String value) {
        this.entryKind = value;
    }

    /**
     * Gets the value of the entryKindIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntryKindIdx() {
        return entryKindIdx;
    }

    /**
     * Sets the value of the entryKindIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntryKindIdx(Long value) {
        this.entryKindIdx = value;
    }

    /**
     * Gets the value of the tariffIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTariffIdx() {
        return tariffIdx;
    }

    /**
     * Sets the value of the tariffIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTariffIdx(Long value) {
        this.tariffIdx = value;
    }

    /**
     * Gets the value of the entryInfoIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntryInfoIdx() {
        return entryInfoIdx;
    }

    /**
     * Sets the value of the entryInfoIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntryInfoIdx(Long value) {
        this.entryInfoIdx = value;
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
     * Gets the value of the transferEntryKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferEntryKind() {
        return transferEntryKind;
    }

    /**
     * Sets the value of the transferEntryKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferEntryKind(String value) {
        this.transferEntryKind = value;
    }

    /**
     * Gets the value of the correspondAcctMapGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondAcctMapGuid() {
        return correspondAcctMapGuid;
    }

    /**
     * Sets the value of the correspondAcctMapGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondAcctMapGuid(String value) {
        this.correspondAcctMapGuid = value;
    }

    /**
     * Gets the value of the toCloseEmptyAcct property.
     * 
     */
    public boolean isToCloseEmptyAcct() {
        return toCloseEmptyAcct;
    }

    /**
     * Sets the value of the toCloseEmptyAcct property.
     * 
     */
    public void setToCloseEmptyAcct(boolean value) {
        this.toCloseEmptyAcct = value;
    }

    /**
     * Gets the value of the valMoneyIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValMoneyIdx() {
        return valMoneyIdx;
    }

    /**
     * Sets the value of the valMoneyIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValMoneyIdx(Long value) {
        this.valMoneyIdx = value;
    }

    /**
     * Gets the value of the invertConditionParam property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInvertConditionParam() {
        if (invertConditionParam == null) {
            return false;
        } else {
            return invertConditionParam;
        }
    }

    /**
     * Sets the value of the invertConditionParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvertConditionParam(Boolean value) {
        this.invertConditionParam = value;
    }

    /**
     * Gets the value of the debtAcctRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debtAcctRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDebtAcctRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDebtAcctRoles() {
        if (debtAcctRoles == null) {
            debtAcctRoles = new ArrayList<String>();
        }
        return this.debtAcctRoles;
    }

    /**
     * Gets the value of the debtAcctClassificationIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDebtAcctClassificationIdx() {
        return debtAcctClassificationIdx;
    }

    /**
     * Sets the value of the debtAcctClassificationIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDebtAcctClassificationIdx(Long value) {
        this.debtAcctClassificationIdx = value;
    }

    /**
     * Gets the value of the repaymentSrcIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepaymentSrcIdx() {
        return repaymentSrcIdx;
    }

    /**
     * Sets the value of the repaymentSrcIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepaymentSrcIdx(Long value) {
        this.repaymentSrcIdx = value;
    }

    /**
     * Gets the value of the repaymentEntryKindIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepaymentEntryKindIdx() {
        return repaymentEntryKindIdx;
    }

    /**
     * Sets the value of the repaymentEntryKindIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepaymentEntryKindIdx(Long value) {
        this.repaymentEntryKindIdx = value;
    }

    /**
     * Gets the value of the repaymentEntryKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepaymentEntryKind() {
        return repaymentEntryKind;
    }

    /**
     * Sets the value of the repaymentEntryKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepaymentEntryKind(String value) {
        this.repaymentEntryKind = value;
    }

    /**
     * Gets the value of the repaymentAcctRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepaymentAcctRole() {
        return repaymentAcctRole;
    }

    /**
     * Sets the value of the repaymentAcctRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepaymentAcctRole(String value) {
        this.repaymentAcctRole = value;
    }

    /**
     * Gets the value of the repaymentCorrAcctRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepaymentCorrAcctRole() {
        return repaymentCorrAcctRole;
    }

    /**
     * Sets the value of the repaymentCorrAcctRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepaymentCorrAcctRole(String value) {
        this.repaymentCorrAcctRole = value;
    }

    /**
     * Gets the value of the repaymentSrcClassificationIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepaymentSrcClassificationIdx() {
        return repaymentSrcClassificationIdx;
    }

    /**
     * Sets the value of the repaymentSrcClassificationIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepaymentSrcClassificationIdx(Long value) {
        this.repaymentSrcClassificationIdx = value;
    }

    /**
     * Gets the value of the techCorrAcctRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechCorrAcctRole() {
        return techCorrAcctRole;
    }

    /**
     * Sets the value of the techCorrAcctRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechCorrAcctRole(String value) {
        this.techCorrAcctRole = value;
    }

    /**
     * Gets the value of the incAcctRoleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncAcctRoleName() {
        return incAcctRoleName;
    }

    /**
     * Sets the value of the incAcctRoleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncAcctRoleName(String value) {
        this.incAcctRoleName = value;
    }

    /**
     * Gets the value of the resEntryKindIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResEntryKindIdx() {
        return resEntryKindIdx;
    }

    /**
     * Sets the value of the resEntryKindIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResEntryKindIdx(Long value) {
        this.resEntryKindIdx = value;
    }

    /**
     * Gets the value of the badDebtEntryKindIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBadDebtEntryKindIdx() {
        return badDebtEntryKindIdx;
    }

    /**
     * Sets the value of the badDebtEntryKindIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBadDebtEntryKindIdx(Long value) {
        this.badDebtEntryKindIdx = value;
    }

    /**
     * Gets the value of the debtRegRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtRegRole() {
        return debtRegRole;
    }

    /**
     * Sets the value of the debtRegRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtRegRole(String value) {
        this.debtRegRole = value;
    }

    /**
     * Gets the value of the debtRegRoleIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDebtRegRoleIdx() {
        return debtRegRoleIdx;
    }

    /**
     * Sets the value of the debtRegRoleIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDebtRegRoleIdx(Long value) {
        this.debtRegRoleIdx = value;
    }

    /**
     * Gets the value of the debtRegSectionIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDebtRegSectionIdx() {
        return debtRegSectionIdx;
    }

    /**
     * Sets the value of the debtRegSectionIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDebtRegSectionIdx(Long value) {
        this.debtRegSectionIdx = value;
    }

    /**
     * Gets the value of the debtRegSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtRegSection() {
        return debtRegSection;
    }

    /**
     * Sets the value of the debtRegSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtRegSection(String value) {
        this.debtRegSection = value;
    }

    /**
     * Gets the value of the expenseAcctRoleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpenseAcctRoleName() {
        return expenseAcctRoleName;
    }

    /**
     * Sets the value of the expenseAcctRoleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpenseAcctRoleName(String value) {
        this.expenseAcctRoleName = value;
    }

    /**
     * Gets the value of the expAcctRoleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpAcctRoleName() {
        return expAcctRoleName;
    }

    /**
     * Sets the value of the expAcctRoleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpAcctRoleName(String value) {
        this.expAcctRoleName = value;
    }

    /**
     * Gets the value of the resAcctRoleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResAcctRoleName() {
        return resAcctRoleName;
    }

    /**
     * Sets the value of the resAcctRoleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResAcctRoleName(String value) {
        this.resAcctRoleName = value;
    }

    /**
     * Gets the value of the overpayAcctRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverpayAcctRole() {
        return overpayAcctRole;
    }

    /**
     * Sets the value of the overpayAcctRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverpayAcctRole(String value) {
        this.overpayAcctRole = value;
    }

    /**
     * Gets the value of the overpayResiterIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOverpayResiterIdx() {
        return overpayResiterIdx;
    }

    /**
     * Sets the value of the overpayResiterIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOverpayResiterIdx(Long value) {
        this.overpayResiterIdx = value;
    }

    /**
     * Gets the value of the overpayRegisterRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverpayRegisterRole() {
        return overpayRegisterRole;
    }

    /**
     * Sets the value of the overpayRegisterRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverpayRegisterRole(String value) {
        this.overpayRegisterRole = value;
    }

    /**
     * Gets the value of the overpayRegSectionIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOverpayRegSectionIdx() {
        return overpayRegSectionIdx;
    }

    /**
     * Sets the value of the overpayRegSectionIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOverpayRegSectionIdx(Long value) {
        this.overpayRegSectionIdx = value;
    }

    /**
     * Gets the value of the overpayRegSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverpayRegSection() {
        return overpayRegSection;
    }

    /**
     * Sets the value of the overpayRegSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverpayRegSection(String value) {
        this.overpayRegSection = value;
    }

    /**
     * Gets the value of the overpayRegClsIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOverpayRegClsIdx() {
        return overpayRegClsIdx;
    }

    /**
     * Sets the value of the overpayRegClsIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOverpayRegClsIdx(Long value) {
        this.overpayRegClsIdx = value;
    }

    /**
     * Gets the value of the corrExecutorIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCorrExecutorIdx() {
        return corrExecutorIdx;
    }

    /**
     * Sets the value of the corrExecutorIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCorrExecutorIdx(Long value) {
        this.corrExecutorIdx = value;
    }

    /**
     * Gets the value of the partialAccrual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialAccrual() {
        return partialAccrual;
    }

    /**
     * Sets the value of the partialAccrual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialAccrual(String value) {
        this.partialAccrual = value;
    }

    /**
     * Gets the value of the ownFundsAcctRoleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnFundsAcctRoleName() {
        return ownFundsAcctRoleName;
    }

    /**
     * Sets the value of the ownFundsAcctRoleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnFundsAcctRoleName(String value) {
        this.ownFundsAcctRoleName = value;
    }

    /**
     * Gets the value of the ownFundsRegRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnFundsRegRole() {
        return ownFundsRegRole;
    }

    /**
     * Sets the value of the ownFundsRegRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnFundsRegRole(String value) {
        this.ownFundsRegRole = value;
    }

    /**
     * Gets the value of the ownFundsRegIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOwnFundsRegIdx() {
        return ownFundsRegIdx;
    }

    /**
     * Sets the value of the ownFundsRegIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOwnFundsRegIdx(Long value) {
        this.ownFundsRegIdx = value;
    }

    /**
     * Gets the value of the ownFundsRegSectionIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOwnFundsRegSectionIdx() {
        return ownFundsRegSectionIdx;
    }

    /**
     * Sets the value of the ownFundsRegSectionIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOwnFundsRegSectionIdx(Long value) {
        this.ownFundsRegSectionIdx = value;
    }

    /**
     * Gets the value of the ownFundsRegSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnFundsRegSection() {
        return ownFundsRegSection;
    }

    /**
     * Sets the value of the ownFundsRegSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnFundsRegSection(String value) {
        this.ownFundsRegSection = value;
    }

    /**
     * Gets the value of the ownFundsRegClsIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOwnFundsRegClsIdx() {
        return ownFundsRegClsIdx;
    }

    /**
     * Sets the value of the ownFundsRegClsIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOwnFundsRegClsIdx(Long value) {
        this.ownFundsRegClsIdx = value;
    }

    /**
     * Gets the value of the ownFundsAmtIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOwnFundsAmtIdx() {
        return ownFundsAmtIdx;
    }

    /**
     * Sets the value of the ownFundsAmtIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOwnFundsAmtIdx(Long value) {
        this.ownFundsAmtIdx = value;
    }

    /**
     * Gets the value of the entryCategorySources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entryCategorySources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryCategorySources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEntryCategorySources() {
        if (entryCategorySources == null) {
            entryCategorySources = new ArrayList<String>();
        }
        return this.entryCategorySources;
    }

    /**
     * Gets the value of the signum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSignum() {
        return signum;
    }

    /**
     * Sets the value of the signum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSignum(Long value) {
        this.signum = value;
    }

}
