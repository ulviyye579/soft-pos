
package com.tranzaxis.schemas.contracts_notify;

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
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.AppEncryptedData;
import com.tranzaxis.schemas.common_types.ParamValue;


/**
 * <p>Java class for NotifySubscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifySubscription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ParamValue" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}NotifySubscriptionStatus" minOccurs="0"/&gt;
 *         &lt;element name="Emails" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}StrList" minOccurs="0"/&gt;
 *         &lt;element name="SmsPhones" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}StrList" minOccurs="0"/&gt;
 *         &lt;element name="SmsBegSendTime" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="SmsEndSendTime" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ExpDelay" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExpRepeatPeriod" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ToSms" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="SmsTranslit" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="ToEmail" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="ToTwitter" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="LinkedContractId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="LinkedContractRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LinkedContractTokenId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="LinkedContractTokenExtRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LinkedContractLoginName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LinkedContractCardPan" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LinkedContractCardPanCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *         &lt;element name="LinkedContractCardMbr" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="LinkedContractCardExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="AllowedNotifyAddressId" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}IntList" minOccurs="0"/&gt;
 *         &lt;element name="AllowedChannelKind" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}ChannelKind" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NotifyAddress" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}NotifyAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AllowedNotifyAddressRid" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}StrList" minOccurs="0"/&gt;
 *         &lt;element name="OneMessage" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="AllMyContracts" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="NotifyTypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="NotifyTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="NotifyTypeClassId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifySubscription", propOrder = {
    "title",
    "paramValue",
    "status",
    "emails",
    "smsPhones",
    "smsBegSendTime",
    "smsEndSendTime",
    "expDelay",
    "expDate",
    "expRepeatPeriod",
    "toSms",
    "smsTranslit",
    "toEmail",
    "toTwitter",
    "linkedContractId",
    "linkedContractRid",
    "linkedContractTokenId",
    "linkedContractTokenExtRid",
    "linkedContractLoginName",
    "linkedContractCardPan",
    "linkedContractCardPanCrypt",
    "linkedContractCardMbr",
    "linkedContractCardExpDate",
    "allowedNotifyAddressId",
    "allowedChannelKind",
    "notifyAddress",
    "allowedNotifyAddressRid",
    "oneMessage"
})
public class NotifySubscription {

    @XmlElementRef(name = "Title", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElement(name = "ParamValue")
    protected List<ParamValue> paramValue;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElementRef(name = "Emails", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected List<JAXBElement<List<String>>> emails;
    @XmlElementRef(name = "SmsPhones", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected List<JAXBElement<List<String>>> smsPhones;
    @XmlElementRef(name = "SmsBegSendTime", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> smsBegSendTime;
    @XmlElementRef(name = "SmsEndSendTime", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> smsEndSendTime;
    @XmlElementRef(name = "ExpDelay", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> expDelay;
    @XmlElementRef(name = "ExpDate", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expDate;
    @XmlElementRef(name = "ExpRepeatPeriod", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> expRepeatPeriod;
    @XmlElementRef(name = "ToSms", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> toSms;
    @XmlElementRef(name = "SmsTranslit", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> smsTranslit;
    @XmlElementRef(name = "ToEmail", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> toEmail;
    @XmlElementRef(name = "ToTwitter", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> toTwitter;
    @XmlElementRef(name = "LinkedContractId", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> linkedContractId;
    @XmlElementRef(name = "LinkedContractRid", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> linkedContractRid;
    @XmlElementRef(name = "LinkedContractTokenId", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> linkedContractTokenId;
    @XmlElementRef(name = "LinkedContractTokenExtRid", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> linkedContractTokenExtRid;
    @XmlElementRef(name = "LinkedContractLoginName", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> linkedContractLoginName;
    @XmlElementRef(name = "LinkedContractCardPan", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> linkedContractCardPan;
    @XmlElement(name = "LinkedContractCardPanCrypt")
    protected AppEncryptedData linkedContractCardPanCrypt;
    @XmlElement(name = "LinkedContractCardMbr")
    protected Long linkedContractCardMbr;
    @XmlElement(name = "LinkedContractCardExpDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar linkedContractCardExpDate;
    @XmlElementRef(name = "AllowedNotifyAddressId", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected List<JAXBElement<List<Long>>> allowedNotifyAddressId;
    @XmlElement(name = "AllowedChannelKind", nillable = true)
    protected List<String> allowedChannelKind;
    @XmlElement(name = "NotifyAddress")
    protected List<NotifyAddress> notifyAddress;
    @XmlElementRef(name = "AllowedNotifyAddressRid", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected List<JAXBElement<List<String>>> allowedNotifyAddressRid;
    @XmlElementRef(name = "OneMessage", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> oneMessage;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;
    @XmlAttribute(name = "AllMyContracts")
    protected Boolean allMyContracts;
    @XmlAttribute(name = "NotifyTypeId")
    protected Long notifyTypeId;
    @XmlAttribute(name = "NotifyTypeRid")
    protected String notifyTypeRid;
    @XmlAttribute(name = "NotifyTypeClassId")
    protected String notifyTypeClassId;
    @XmlAttribute(name = "Rid")
    protected String rid;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the paramValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paramValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParamValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamValue }
     * 
     * 
     */
    public List<ParamValue> getParamValue() {
        if (paramValue == null) {
            paramValue = new ArrayList<ParamValue>();
        }
        return this.paramValue;
    }

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
     * Gets the value of the emails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * 
     */
    public List<JAXBElement<List<String>>> getEmails() {
        if (emails == null) {
            emails = new ArrayList<JAXBElement<List<String>>>();
        }
        return this.emails;
    }

    /**
     * Gets the value of the smsPhones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smsPhones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmsPhones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * 
     */
    public List<JAXBElement<List<String>>> getSmsPhones() {
        if (smsPhones == null) {
            smsPhones = new ArrayList<JAXBElement<List<String>>>();
        }
        return this.smsPhones;
    }

    /**
     * Gets the value of the smsBegSendTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSmsBegSendTime() {
        return smsBegSendTime;
    }

    /**
     * Sets the value of the smsBegSendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSmsBegSendTime(JAXBElement<Long> value) {
        this.smsBegSendTime = value;
    }

    /**
     * Gets the value of the smsEndSendTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSmsEndSendTime() {
        return smsEndSendTime;
    }

    /**
     * Sets the value of the smsEndSendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSmsEndSendTime(JAXBElement<Long> value) {
        this.smsEndSendTime = value;
    }

    /**
     * Gets the value of the expDelay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getExpDelay() {
        return expDelay;
    }

    /**
     * Sets the value of the expDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setExpDelay(JAXBElement<Long> value) {
        this.expDelay = value;
    }

    /**
     * Gets the value of the expDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpDate() {
        return expDate;
    }

    /**
     * Sets the value of the expDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expDate = value;
    }

    /**
     * Gets the value of the expRepeatPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getExpRepeatPeriod() {
        return expRepeatPeriod;
    }

    /**
     * Sets the value of the expRepeatPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setExpRepeatPeriod(JAXBElement<Long> value) {
        this.expRepeatPeriod = value;
    }

    /**
     * Gets the value of the toSms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getToSms() {
        return toSms;
    }

    /**
     * Sets the value of the toSms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setToSms(JAXBElement<Boolean> value) {
        this.toSms = value;
    }

    /**
     * Gets the value of the smsTranslit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSmsTranslit() {
        return smsTranslit;
    }

    /**
     * Sets the value of the smsTranslit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSmsTranslit(JAXBElement<Boolean> value) {
        this.smsTranslit = value;
    }

    /**
     * Gets the value of the toEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getToEmail() {
        return toEmail;
    }

    /**
     * Sets the value of the toEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setToEmail(JAXBElement<Boolean> value) {
        this.toEmail = value;
    }

    /**
     * Gets the value of the toTwitter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getToTwitter() {
        return toTwitter;
    }

    /**
     * Sets the value of the toTwitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setToTwitter(JAXBElement<Boolean> value) {
        this.toTwitter = value;
    }

    /**
     * Gets the value of the linkedContractId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLinkedContractId() {
        return linkedContractId;
    }

    /**
     * Sets the value of the linkedContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLinkedContractId(JAXBElement<Long> value) {
        this.linkedContractId = value;
    }

    /**
     * Gets the value of the linkedContractRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLinkedContractRid() {
        return linkedContractRid;
    }

    /**
     * Sets the value of the linkedContractRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLinkedContractRid(JAXBElement<String> value) {
        this.linkedContractRid = value;
    }

    /**
     * Gets the value of the linkedContractTokenId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLinkedContractTokenId() {
        return linkedContractTokenId;
    }

    /**
     * Sets the value of the linkedContractTokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLinkedContractTokenId(JAXBElement<Long> value) {
        this.linkedContractTokenId = value;
    }

    /**
     * Gets the value of the linkedContractTokenExtRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLinkedContractTokenExtRid() {
        return linkedContractTokenExtRid;
    }

    /**
     * Sets the value of the linkedContractTokenExtRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLinkedContractTokenExtRid(JAXBElement<String> value) {
        this.linkedContractTokenExtRid = value;
    }

    /**
     * Gets the value of the linkedContractLoginName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLinkedContractLoginName() {
        return linkedContractLoginName;
    }

    /**
     * Sets the value of the linkedContractLoginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLinkedContractLoginName(JAXBElement<String> value) {
        this.linkedContractLoginName = value;
    }

    /**
     * Gets the value of the linkedContractCardPan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLinkedContractCardPan() {
        return linkedContractCardPan;
    }

    /**
     * Sets the value of the linkedContractCardPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLinkedContractCardPan(JAXBElement<String> value) {
        this.linkedContractCardPan = value;
    }

    /**
     * Gets the value of the linkedContractCardPanCrypt property.
     * 
     * @return
     *     possible object is
     *     {@link AppEncryptedData }
     *     
     */
    public AppEncryptedData getLinkedContractCardPanCrypt() {
        return linkedContractCardPanCrypt;
    }

    /**
     * Sets the value of the linkedContractCardPanCrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppEncryptedData }
     *     
     */
    public void setLinkedContractCardPanCrypt(AppEncryptedData value) {
        this.linkedContractCardPanCrypt = value;
    }

    /**
     * Gets the value of the linkedContractCardMbr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLinkedContractCardMbr() {
        return linkedContractCardMbr;
    }

    /**
     * Sets the value of the linkedContractCardMbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLinkedContractCardMbr(Long value) {
        this.linkedContractCardMbr = value;
    }

    /**
     * Gets the value of the linkedContractCardExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLinkedContractCardExpDate() {
        return linkedContractCardExpDate;
    }

    /**
     * Sets the value of the linkedContractCardExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLinkedContractCardExpDate(XMLGregorianCalendar value) {
        this.linkedContractCardExpDate = value;
    }

    /**
     * Gets the value of the allowedNotifyAddressId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedNotifyAddressId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedNotifyAddressId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * 
     * 
     */
    public List<JAXBElement<List<Long>>> getAllowedNotifyAddressId() {
        if (allowedNotifyAddressId == null) {
            allowedNotifyAddressId = new ArrayList<JAXBElement<List<Long>>>();
        }
        return this.allowedNotifyAddressId;
    }

    /**
     * Gets the value of the allowedChannelKind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedChannelKind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedChannelKind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAllowedChannelKind() {
        if (allowedChannelKind == null) {
            allowedChannelKind = new ArrayList<String>();
        }
        return this.allowedChannelKind;
    }

    /**
     * Gets the value of the notifyAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifyAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotifyAddress }
     * 
     * 
     */
    public List<NotifyAddress> getNotifyAddress() {
        if (notifyAddress == null) {
            notifyAddress = new ArrayList<NotifyAddress>();
        }
        return this.notifyAddress;
    }

    /**
     * Gets the value of the allowedNotifyAddressRid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedNotifyAddressRid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedNotifyAddressRid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * 
     */
    public List<JAXBElement<List<String>>> getAllowedNotifyAddressRid() {
        if (allowedNotifyAddressRid == null) {
            allowedNotifyAddressRid = new ArrayList<JAXBElement<List<String>>>();
        }
        return this.allowedNotifyAddressRid;
    }

    /**
     * Gets the value of the oneMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOneMessage() {
        return oneMessage;
    }

    /**
     * Sets the value of the oneMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOneMessage(JAXBElement<Boolean> value) {
        this.oneMessage = value;
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
     * Gets the value of the allMyContracts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllMyContracts() {
        return allMyContracts;
    }

    /**
     * Sets the value of the allMyContracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllMyContracts(Boolean value) {
        this.allMyContracts = value;
    }

    /**
     * Gets the value of the notifyTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNotifyTypeId() {
        return notifyTypeId;
    }

    /**
     * Sets the value of the notifyTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNotifyTypeId(Long value) {
        this.notifyTypeId = value;
    }

    /**
     * Gets the value of the notifyTypeRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyTypeRid() {
        return notifyTypeRid;
    }

    /**
     * Sets the value of the notifyTypeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyTypeRid(String value) {
        this.notifyTypeRid = value;
    }

    /**
     * Gets the value of the notifyTypeClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyTypeClassId() {
        return notifyTypeClassId;
    }

    /**
     * Sets the value of the notifyTypeClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyTypeClassId(String value) {
        this.notifyTypeClassId = value;
    }

    /**
     * Gets the value of the rid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRid() {
        return rid;
    }

    /**
     * Sets the value of the rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRid(String value) {
        this.rid = value;
    }

}
