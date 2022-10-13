
package com.tranzaxis.schemas.subjects_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CorporationBankProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporationBankProperty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="BicId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Bic" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AccountNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ValidFromDay" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="ValidToDay" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="DebitOrderControlCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AcctAddressType" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}CAcctAddressTypeEnum" /&gt;
 *       &lt;attribute name="Iban" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporationBankProperty")
public class CorporationBankProperty {

    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "BicId")
    protected Long bicId;
    @XmlAttribute(name = "Bic")
    protected String bic;
    @XmlAttribute(name = "AccountNumber")
    protected String accountNumber;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;
    @XmlAttribute(name = "Ccy")
    protected Long ccy;
    @XmlAttribute(name = "ValidFromDay")
    protected XMLGregorianCalendar validFromDay;
    @XmlAttribute(name = "ValidToDay")
    protected XMLGregorianCalendar validToDay;
    @XmlAttribute(name = "DebitOrderControlCode")
    protected String debitOrderControlCode;
    @XmlAttribute(name = "AcctAddressType")
    protected String acctAddressType;
    @XmlAttribute(name = "Iban")
    protected String iban;

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
     * Gets the value of the bicId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBicId() {
        return bicId;
    }

    /**
     * Sets the value of the bicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBicId(Long value) {
        this.bicId = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBic() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBic(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
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
     * Gets the value of the validFromDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFromDay() {
        return validFromDay;
    }

    /**
     * Sets the value of the validFromDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFromDay(XMLGregorianCalendar value) {
        this.validFromDay = value;
    }

    /**
     * Gets the value of the validToDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidToDay() {
        return validToDay;
    }

    /**
     * Sets the value of the validToDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidToDay(XMLGregorianCalendar value) {
        this.validToDay = value;
    }

    /**
     * Gets the value of the debitOrderControlCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitOrderControlCode() {
        return debitOrderControlCode;
    }

    /**
     * Sets the value of the debitOrderControlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitOrderControlCode(String value) {
        this.debitOrderControlCode = value;
    }

    /**
     * Gets the value of the acctAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctAddressType() {
        return acctAddressType;
    }

    /**
     * Sets the value of the acctAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctAddressType(String value) {
        this.acctAddressType = value;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIban() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIban(String value) {
        this.iban = value;
    }

}
