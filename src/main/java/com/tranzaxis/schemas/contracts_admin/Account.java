
package com.tranzaxis.schemas.contracts_admin;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.accounting_info.Info;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}CharEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OpenDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="OpenUserName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CloseDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CloseUserName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Balance" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="CreditHold" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="DebitHold" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="ContractAcctState" type="{http://schemas.tranzaxis.com/contracts-admin.xsd}ContractAcctState" minOccurs="0"/&gt;
 *         &lt;element name="ContractAcctStateReason" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ContractAcctStatus" type="{http://schemas.tranzaxis.com/contracts-admin.xsd}ContractAcctStatus" minOccurs="0"/&gt;
 *         &lt;element name="ContractAcctStatusReason" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="KeyDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Info" type="{http://schemas.tranzaxis.com/accounting-info.xsd}Info" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Number" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ExtNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Role"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Classifiers" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="PlanItemGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="PlanItemCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="PlanItemSubCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="PlanItemSyntheticAcctNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AcctRoleInContract" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "status",
    "openDay",
    "openUserName",
    "closeDay",
    "closeUserName",
    "balance",
    "creditHold",
    "debitHold",
    "contractAcctState",
    "contractAcctStateReason",
    "contractAcctStatus",
    "contractAcctStatusReason",
    "keyDay",
    "info",
    "notes"
})
public class Account {

    @XmlElement(name = "Status")
    protected String status;
    @XmlElementRef(name = "OpenDay", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> openDay;
    @XmlElementRef(name = "OpenUserName", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> openUserName;
    @XmlElementRef(name = "CloseDay", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> closeDay;
    @XmlElementRef(name = "CloseUserName", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> closeUserName;
    @XmlElement(name = "Balance")
    protected BigDecimal balance;
    @XmlElement(name = "CreditHold")
    protected BigDecimal creditHold;
    @XmlElement(name = "DebitHold")
    protected BigDecimal debitHold;
    @XmlElementRef(name = "ContractAcctState", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractAcctState;
    @XmlElementRef(name = "ContractAcctStateReason", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractAcctStateReason;
    @XmlElementRef(name = "ContractAcctStatus", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractAcctStatus;
    @XmlElementRef(name = "ContractAcctStatusReason", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractAcctStatusReason;
    @XmlElementRef(name = "KeyDay", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> keyDay;
    @XmlElementRef(name = "Info", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Info> info;
    @XmlElementRef(name = "Notes", namespace = "http://schemas.tranzaxis.com/contracts-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "Number")
    protected String number;
    @XmlAttribute(name = "ExtNumber")
    protected String extNumber;
    @XmlAttribute(name = "Ccy")
    protected Long ccy;
    @XmlAttribute(name = "Role")
    protected String role;
    @XmlAttribute(name = "Classifiers")
    protected String classifiers;
    @XmlAttribute(name = "PlanItemGuid")
    protected String planItemGuid;
    @XmlAttribute(name = "PlanItemCode")
    protected String planItemCode;
    @XmlAttribute(name = "PlanItemSubCode")
    protected String planItemSubCode;
    @XmlAttribute(name = "PlanItemSyntheticAcctNumber")
    protected String planItemSyntheticAcctNumber;
    @XmlAttribute(name = "AcctRoleInContract")
    protected String acctRoleInContract;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the openDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOpenDay() {
        return openDay;
    }

    /**
     * Sets the value of the openDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOpenDay(JAXBElement<XMLGregorianCalendar> value) {
        this.openDay = value;
    }

    /**
     * Gets the value of the openUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpenUserName() {
        return openUserName;
    }

    /**
     * Sets the value of the openUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpenUserName(JAXBElement<String> value) {
        this.openUserName = value;
    }

    /**
     * Gets the value of the closeDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCloseDay() {
        return closeDay;
    }

    /**
     * Sets the value of the closeDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCloseDay(JAXBElement<XMLGregorianCalendar> value) {
        this.closeDay = value;
    }

    /**
     * Gets the value of the closeUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCloseUserName() {
        return closeUserName;
    }

    /**
     * Sets the value of the closeUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCloseUserName(JAXBElement<String> value) {
        this.closeUserName = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the creditHold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditHold() {
        return creditHold;
    }

    /**
     * Sets the value of the creditHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditHold(BigDecimal value) {
        this.creditHold = value;
    }

    /**
     * Gets the value of the debitHold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebitHold() {
        return debitHold;
    }

    /**
     * Sets the value of the debitHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebitHold(BigDecimal value) {
        this.debitHold = value;
    }

    /**
     * Gets the value of the contractAcctState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractAcctState() {
        return contractAcctState;
    }

    /**
     * Sets the value of the contractAcctState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractAcctState(JAXBElement<String> value) {
        this.contractAcctState = value;
    }

    /**
     * Gets the value of the contractAcctStateReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractAcctStateReason() {
        return contractAcctStateReason;
    }

    /**
     * Sets the value of the contractAcctStateReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractAcctStateReason(JAXBElement<String> value) {
        this.contractAcctStateReason = value;
    }

    /**
     * Gets the value of the contractAcctStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractAcctStatus() {
        return contractAcctStatus;
    }

    /**
     * Sets the value of the contractAcctStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractAcctStatus(JAXBElement<String> value) {
        this.contractAcctStatus = value;
    }

    /**
     * Gets the value of the contractAcctStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractAcctStatusReason() {
        return contractAcctStatusReason;
    }

    /**
     * Sets the value of the contractAcctStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractAcctStatusReason(JAXBElement<String> value) {
        this.contractAcctStatusReason = value;
    }

    /**
     * Gets the value of the keyDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getKeyDay() {
        return keyDay;
    }

    /**
     * Sets the value of the keyDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setKeyDay(JAXBElement<XMLGregorianCalendar> value) {
        this.keyDay = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Info }{@code >}
     *     
     */
    public JAXBElement<Info> getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Info }{@code >}
     *     
     */
    public void setInfo(JAXBElement<Info> value) {
        this.info = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotes(JAXBElement<String> value) {
        this.notes = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the extNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtNumber() {
        return extNumber;
    }

    /**
     * Sets the value of the extNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtNumber(String value) {
        this.extNumber = value;
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
     * Gets the value of the classifiers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassifiers() {
        return classifiers;
    }

    /**
     * Sets the value of the classifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassifiers(String value) {
        this.classifiers = value;
    }

    /**
     * Gets the value of the planItemGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanItemGuid() {
        return planItemGuid;
    }

    /**
     * Sets the value of the planItemGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanItemGuid(String value) {
        this.planItemGuid = value;
    }

    /**
     * Gets the value of the planItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanItemCode() {
        return planItemCode;
    }

    /**
     * Sets the value of the planItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanItemCode(String value) {
        this.planItemCode = value;
    }

    /**
     * Gets the value of the planItemSubCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanItemSubCode() {
        return planItemSubCode;
    }

    /**
     * Sets the value of the planItemSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanItemSubCode(String value) {
        this.planItemSubCode = value;
    }

    /**
     * Gets the value of the planItemSyntheticAcctNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanItemSyntheticAcctNumber() {
        return planItemSyntheticAcctNumber;
    }

    /**
     * Sets the value of the planItemSyntheticAcctNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanItemSyntheticAcctNumber(String value) {
        this.planItemSyntheticAcctNumber = value;
    }

    /**
     * Gets the value of the acctRoleInContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctRoleInContract() {
        return acctRoleInContract;
    }

    /**
     * Sets the value of the acctRoleInContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctRoleInContract(String value) {
        this.acctRoleInContract = value;
    }

    /**
     * Gets the value of the toDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToDelete() {
        return toDelete;
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

}
