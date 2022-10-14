
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InquiryCardEtuStatusSpecific complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryCardEtuStatusSpecific"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtCardId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="SettleContractId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="MerchantRid" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *         &lt;element name="SubMerchantRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Pan" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *         &lt;element name="Expiration" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="NewPan" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="NewExpiration" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Response" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResponseDesc" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquiryCardEtuStatusSpecific", propOrder = {
    "extCardId",
    "settleContractId",
    "merchantRid",
    "subMerchantRid",
    "pan",
    "expiration",
    "newPan",
    "newExpiration",
    "response",
    "responseDesc"
})
public class InquiryCardEtuStatusSpecific {

    @XmlElement(name = "ExtCardId")
    protected Long extCardId;
    @XmlElement(name = "SettleContractId")
    protected Long settleContractId;
    @XmlElement(name = "MerchantRid", required = true)
    protected String merchantRid;
    @XmlElement(name = "SubMerchantRid")
    protected String subMerchantRid;
    @XmlElement(name = "Pan", required = true)
    protected String pan;
    @XmlElement(name = "Expiration")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiration;
    @XmlElement(name = "NewPan")
    protected String newPan;
    @XmlElement(name = "NewExpiration")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar newExpiration;
    @XmlElement(name = "Response")
    protected String response;
    @XmlElement(name = "ResponseDesc")
    protected String responseDesc;

    /**
     * Gets the value of the extCardId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExtCardId() {
        return extCardId;
    }

    /**
     * Sets the value of the extCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExtCardId(Long value) {
        this.extCardId = value;
    }

    /**
     * Gets the value of the settleContractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSettleContractId() {
        return settleContractId;
    }

    /**
     * Sets the value of the settleContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSettleContractId(Long value) {
        this.settleContractId = value;
    }

    /**
     * Gets the value of the merchantRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantRid() {
        return merchantRid;
    }

    /**
     * Sets the value of the merchantRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantRid(String value) {
        this.merchantRid = value;
    }

    /**
     * Gets the value of the subMerchantRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubMerchantRid() {
        return subMerchantRid;
    }

    /**
     * Sets the value of the subMerchantRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubMerchantRid(String value) {
        this.subMerchantRid = value;
    }

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPan() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPan(String value) {
        this.pan = value;
    }

    /**
     * Gets the value of the expiration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiration(XMLGregorianCalendar value) {
        this.expiration = value;
    }

    /**
     * Gets the value of the newPan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPan() {
        return newPan;
    }

    /**
     * Sets the value of the newPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPan(String value) {
        this.newPan = value;
    }

    /**
     * Gets the value of the newExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewExpiration() {
        return newExpiration;
    }

    /**
     * Sets the value of the newExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewExpiration(XMLGregorianCalendar value) {
        this.newExpiration = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponse(String value) {
        this.response = value;
    }

    /**
     * Gets the value of the responseDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDesc() {
        return responseDesc;
    }

    /**
     * Sets the value of the responseDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDesc(String value) {
        this.responseDesc = value;
    }

}
