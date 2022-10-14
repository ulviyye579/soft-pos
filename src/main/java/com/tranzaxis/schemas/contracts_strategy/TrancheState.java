
package com.tranzaxis.schemas.contracts_strategy;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrancheState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrancheState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PostDay" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
 *         &lt;element name="AuthDay" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
 *         &lt;element name="ExecDate" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
 *         &lt;element name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
 *         &lt;element name="Balance" type="{http://schemas.radixware.org/types.xsd}Num"/&gt;
 *         &lt;element name="DebtCategoryId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Category" type="{http://schemas.tranzaxis.com/contracts-strategy.xsd}TrancheCategory" minOccurs="0"/&gt;
 *         &lt;element name="LastAccrualDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="PaidDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="DoerRolePath" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="OrigRegRole" type="{http://schemas.tranzaxis.com/contracts-strategy.xsd}CRegisterRole" minOccurs="0"/&gt;
 *         &lt;element name="OrigRegCcy" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="OrigRegClassification" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="OrigEpClassification" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="RegClassification" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="StrategyKey" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ClassGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TranId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="EntrySeq" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrancheState", propOrder = {
    "postDay",
    "authDay",
    "execDate",
    "ccy",
    "balance",
    "debtCategoryId",
    "category",
    "lastAccrualDay",
    "paidDay",
    "doerRolePath",
    "origRegRole",
    "origRegCcy",
    "origRegClassification",
    "origEpClassification",
    "regClassification"
})
public class TrancheState {

    @XmlElement(name = "PostDay", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postDay;
    @XmlElement(name = "AuthDay", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authDay;
    @XmlElement(name = "ExecDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar execDate;
    @XmlElement(name = "Ccy")
    protected long ccy;
    @XmlElement(name = "Balance", required = true)
    protected BigDecimal balance;
    @XmlElementRef(name = "DebtCategoryId", namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> debtCategoryId;
    @XmlElementRef(name = "Category", namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> category;
    @XmlElementRef(name = "LastAccrualDay", namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastAccrualDay;
    @XmlElementRef(name = "PaidDay", namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> paidDay;
    @XmlElementRef(name = "DoerRolePath", namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> doerRolePath;
    @XmlElementRef(name = "OrigRegRole", namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origRegRole;
    @XmlElementRef(name = "OrigRegCcy", namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> origRegCcy;
    @XmlElementRef(name = "OrigRegClassification", namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origRegClassification;
    @XmlElementRef(name = "OrigEpClassification", namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origEpClassification;
    @XmlElementRef(name = "RegClassification", namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regClassification;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "StrategyKey")
    protected String strategyKey;
    @XmlAttribute(name = "ClassGuid")
    protected String classGuid;
    @XmlAttribute(name = "TranId")
    protected Long tranId;
    @XmlAttribute(name = "EntrySeq")
    protected Long entrySeq;

    /**
     * Gets the value of the postDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostDay() {
        return postDay;
    }

    /**
     * Sets the value of the postDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostDay(XMLGregorianCalendar value) {
        this.postDay = value;
    }

    /**
     * Gets the value of the authDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthDay() {
        return authDay;
    }

    /**
     * Sets the value of the authDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthDay(XMLGregorianCalendar value) {
        this.authDay = value;
    }

    /**
     * Gets the value of the execDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecDate() {
        return execDate;
    }

    /**
     * Sets the value of the execDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecDate(XMLGregorianCalendar value) {
        this.execDate = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     */
    public long getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     */
    public void setCcy(long value) {
        this.ccy = value;
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
     * Gets the value of the debtCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDebtCategoryId() {
        return debtCategoryId;
    }

    /**
     * Sets the value of the debtCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDebtCategoryId(JAXBElement<Long> value) {
        this.debtCategoryId = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategory(JAXBElement<String> value) {
        this.category = value;
    }

    /**
     * Gets the value of the lastAccrualDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastAccrualDay() {
        return lastAccrualDay;
    }

    /**
     * Sets the value of the lastAccrualDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastAccrualDay(JAXBElement<XMLGregorianCalendar> value) {
        this.lastAccrualDay = value;
    }

    /**
     * Gets the value of the paidDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPaidDay() {
        return paidDay;
    }

    /**
     * Sets the value of the paidDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPaidDay(JAXBElement<XMLGregorianCalendar> value) {
        this.paidDay = value;
    }

    /**
     * Gets the value of the doerRolePath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoerRolePath() {
        return doerRolePath;
    }

    /**
     * Sets the value of the doerRolePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoerRolePath(JAXBElement<String> value) {
        this.doerRolePath = value;
    }

    /**
     * Gets the value of the origRegRole property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigRegRole() {
        return origRegRole;
    }

    /**
     * Sets the value of the origRegRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigRegRole(JAXBElement<String> value) {
        this.origRegRole = value;
    }

    /**
     * Gets the value of the origRegCcy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOrigRegCcy() {
        return origRegCcy;
    }

    /**
     * Sets the value of the origRegCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOrigRegCcy(JAXBElement<Long> value) {
        this.origRegCcy = value;
    }

    /**
     * Gets the value of the origRegClassification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigRegClassification() {
        return origRegClassification;
    }

    /**
     * Sets the value of the origRegClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigRegClassification(JAXBElement<String> value) {
        this.origRegClassification = value;
    }

    /**
     * Gets the value of the origEpClassification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigEpClassification() {
        return origEpClassification;
    }

    /**
     * Sets the value of the origEpClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigEpClassification(JAXBElement<String> value) {
        this.origEpClassification = value;
    }

    /**
     * Gets the value of the regClassification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegClassification() {
        return regClassification;
    }

    /**
     * Sets the value of the regClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegClassification(JAXBElement<String> value) {
        this.regClassification = value;
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
     * Gets the value of the strategyKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrategyKey() {
        return strategyKey;
    }

    /**
     * Sets the value of the strategyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrategyKey(String value) {
        this.strategyKey = value;
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
     * Gets the value of the tranId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTranId() {
        return tranId;
    }

    /**
     * Sets the value of the tranId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTranId(Long value) {
        this.tranId = value;
    }

    /**
     * Gets the value of the entrySeq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntrySeq() {
        return entrySeq;
    }

    /**
     * Sets the value of the entrySeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntrySeq(Long value) {
        this.entrySeq = value;
    }

}
