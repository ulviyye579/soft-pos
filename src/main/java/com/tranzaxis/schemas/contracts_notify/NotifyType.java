
package com.tranzaxis.schemas.contracts_notify;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.ParamDescription;
import com.tranzaxis.schemas.common_types.ParamDescriptions;
import org.radixware.schemas.common.ImpExpEntity;
import org.radixware.schemas.common.UserFunc;


/**
 * <p>Java class for NotifyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/common.xsd}ImpExpEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Guid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="OptionEx" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}NotifyOption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Option" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MessageUserFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="MessageTemplateUserParamDesc" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamDescriptions" minOccurs="0"/&gt;
 *         &lt;element name="NotifyDeliveryScheme" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}NotifyDeliveryScheme" minOccurs="0"/&gt;
 *         &lt;element name="MessageTemplates" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MessageTemplate" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}NotifyMessageTemplate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ActivePeriod" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="CheckBalanceKind" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}BalanceKind" minOccurs="0"/&gt;
 *         &lt;element name="OneMessBySubscription" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="OnePerSource" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Seq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="IsActive" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="IsMultiple" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="AutoCreate" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="ExpDelay" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ExpRepeatPeriod" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ToSms" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="ToEmail" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="MessSubject" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="MessSeverity" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}Importance" /&gt;
 *       &lt;attribute name="ToTwitter" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="ToAudit" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="SrcContractTypesIds" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}IntList" /&gt;
 *       &lt;attribute name="SrcContractTypesGuids" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}StrList" /&gt;
 *       &lt;attribute name="SmsBegSendTime" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="SmsEndSendTime" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="SmsTranslit" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyType", propOrder = {
    "guid",
    "title",
    "optionEx",
    "option",
    "messageUserFunc",
    "notes",
    "messageTemplateUserParamDesc",
    "notifyDeliveryScheme",
    "messageTemplates",
    "activePeriod",
    "checkBalanceKind",
    "oneMessBySubscription",
    "onePerSource"
})
public class NotifyType
    extends ImpExpEntity
{

    @XmlElement(name = "Guid")
    protected String guid;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "OptionEx")
    protected List<NotifyOption> optionEx;
    @XmlElement(name = "Option")
    protected List<ParamDescription> option;
    @XmlElementRef(name = "MessageUserFunc", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserFunc> messageUserFunc;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "MessageTemplateUserParamDesc")
    protected ParamDescriptions messageTemplateUserParamDesc;
    @XmlElement(name = "NotifyDeliveryScheme")
    protected NotifyDeliveryScheme notifyDeliveryScheme;
    @XmlElement(name = "MessageTemplates")
    protected NotifyType.MessageTemplates messageTemplates;
    @XmlElement(name = "ActivePeriod")
    protected Long activePeriod;
    @XmlElement(name = "CheckBalanceKind")
    protected Long checkBalanceKind;
    @XmlElement(name = "OneMessBySubscription")
    protected Boolean oneMessBySubscription;
    @XmlElement(name = "OnePerSource")
    protected Boolean onePerSource;
    @XmlAttribute(name = "Id", required = true)
    protected long id;
    @XmlAttribute(name = "Rid")
    protected String rid;
    @XmlAttribute(name = "Seq", required = true)
    protected long seq;
    @XmlAttribute(name = "IsActive", required = true)
    protected boolean isActive;
    @XmlAttribute(name = "IsMultiple", required = true)
    protected boolean isMultiple;
    @XmlAttribute(name = "AutoCreate", required = true)
    protected boolean autoCreate;
    @XmlAttribute(name = "ExpDelay")
    protected Long expDelay;
    @XmlAttribute(name = "ExpRepeatPeriod")
    protected Long expRepeatPeriod;
    @XmlAttribute(name = "ToSms", required = true)
    protected boolean toSms;
    @XmlAttribute(name = "ToEmail", required = true)
    protected boolean toEmail;
    @XmlAttribute(name = "MessSubject")
    protected String messSubject;
    @XmlAttribute(name = "MessSeverity")
    protected Long messSeverity;
    @XmlAttribute(name = "ToTwitter", required = true)
    protected boolean toTwitter;
    @XmlAttribute(name = "ToAudit", required = true)
    protected boolean toAudit;
    @XmlAttribute(name = "SrcContractTypesIds")
    protected List<Long> srcContractTypesIds;
    @XmlAttribute(name = "SrcContractTypesGuids")
    protected List<String> srcContractTypesGuids;
    @XmlAttribute(name = "SmsBegSendTime")
    protected Long smsBegSendTime;
    @XmlAttribute(name = "SmsEndSendTime")
    protected Long smsEndSendTime;
    @XmlAttribute(name = "SmsTranslit", required = true)
    protected boolean smsTranslit;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the optionEx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionEx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionEx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotifyOption }
     * 
     * 
     */
    public List<NotifyOption> getOptionEx() {
        if (optionEx == null) {
            optionEx = new ArrayList<NotifyOption>();
        }
        return this.optionEx;
    }

    /**
     * Gets the value of the option property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the option property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamDescription }
     * 
     * 
     */
    public List<ParamDescription> getOption() {
        if (option == null) {
            option = new ArrayList<ParamDescription>();
        }
        return this.option;
    }

    /**
     * Gets the value of the messageUserFunc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public JAXBElement<UserFunc> getMessageUserFunc() {
        return messageUserFunc;
    }

    /**
     * Sets the value of the messageUserFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public void setMessageUserFunc(JAXBElement<UserFunc> value) {
        this.messageUserFunc = value;
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
     * Gets the value of the messageTemplateUserParamDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ParamDescriptions }
     *     
     */
    public ParamDescriptions getMessageTemplateUserParamDesc() {
        return messageTemplateUserParamDesc;
    }

    /**
     * Sets the value of the messageTemplateUserParamDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamDescriptions }
     *     
     */
    public void setMessageTemplateUserParamDesc(ParamDescriptions value) {
        this.messageTemplateUserParamDesc = value;
    }

    /**
     * Gets the value of the notifyDeliveryScheme property.
     * 
     * @return
     *     possible object is
     *     {@link NotifyDeliveryScheme }
     *     
     */
    public NotifyDeliveryScheme getNotifyDeliveryScheme() {
        return notifyDeliveryScheme;
    }

    /**
     * Sets the value of the notifyDeliveryScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyDeliveryScheme }
     *     
     */
    public void setNotifyDeliveryScheme(NotifyDeliveryScheme value) {
        this.notifyDeliveryScheme = value;
    }

    /**
     * Gets the value of the messageTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link NotifyType.MessageTemplates }
     *     
     */
    public NotifyType.MessageTemplates getMessageTemplates() {
        return messageTemplates;
    }

    /**
     * Sets the value of the messageTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyType.MessageTemplates }
     *     
     */
    public void setMessageTemplates(NotifyType.MessageTemplates value) {
        this.messageTemplates = value;
    }

    /**
     * Gets the value of the activePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActivePeriod() {
        return activePeriod;
    }

    /**
     * Sets the value of the activePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActivePeriod(Long value) {
        this.activePeriod = value;
    }

    /**
     * Gets the value of the checkBalanceKind property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCheckBalanceKind() {
        return checkBalanceKind;
    }

    /**
     * Sets the value of the checkBalanceKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCheckBalanceKind(Long value) {
        this.checkBalanceKind = value;
    }

    /**
     * Gets the value of the oneMessBySubscription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneMessBySubscription() {
        return oneMessBySubscription;
    }

    /**
     * Sets the value of the oneMessBySubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneMessBySubscription(Boolean value) {
        this.oneMessBySubscription = value;
    }

    /**
     * Gets the value of the onePerSource property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnePerSource() {
        return onePerSource;
    }

    /**
     * Sets the value of the onePerSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnePerSource(Boolean value) {
        this.onePerSource = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
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

    /**
     * Gets the value of the seq property.
     * 
     */
    public long getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     */
    public void setSeq(long value) {
        this.seq = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isMultiple property.
     * 
     */
    public boolean isIsMultiple() {
        return isMultiple;
    }

    /**
     * Sets the value of the isMultiple property.
     * 
     */
    public void setIsMultiple(boolean value) {
        this.isMultiple = value;
    }

    /**
     * Gets the value of the autoCreate property.
     * 
     */
    public boolean isAutoCreate() {
        return autoCreate;
    }

    /**
     * Sets the value of the autoCreate property.
     * 
     */
    public void setAutoCreate(boolean value) {
        this.autoCreate = value;
    }

    /**
     * Gets the value of the expDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpDelay() {
        return expDelay;
    }

    /**
     * Sets the value of the expDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpDelay(Long value) {
        this.expDelay = value;
    }

    /**
     * Gets the value of the expRepeatPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpRepeatPeriod() {
        return expRepeatPeriod;
    }

    /**
     * Sets the value of the expRepeatPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpRepeatPeriod(Long value) {
        this.expRepeatPeriod = value;
    }

    /**
     * Gets the value of the toSms property.
     * 
     */
    public boolean isToSms() {
        return toSms;
    }

    /**
     * Sets the value of the toSms property.
     * 
     */
    public void setToSms(boolean value) {
        this.toSms = value;
    }

    /**
     * Gets the value of the toEmail property.
     * 
     */
    public boolean isToEmail() {
        return toEmail;
    }

    /**
     * Sets the value of the toEmail property.
     * 
     */
    public void setToEmail(boolean value) {
        this.toEmail = value;
    }

    /**
     * Gets the value of the messSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessSubject() {
        return messSubject;
    }

    /**
     * Sets the value of the messSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessSubject(String value) {
        this.messSubject = value;
    }

    /**
     * Gets the value of the messSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMessSeverity() {
        return messSeverity;
    }

    /**
     * Sets the value of the messSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMessSeverity(Long value) {
        this.messSeverity = value;
    }

    /**
     * Gets the value of the toTwitter property.
     * 
     */
    public boolean isToTwitter() {
        return toTwitter;
    }

    /**
     * Sets the value of the toTwitter property.
     * 
     */
    public void setToTwitter(boolean value) {
        this.toTwitter = value;
    }

    /**
     * Gets the value of the toAudit property.
     * 
     */
    public boolean isToAudit() {
        return toAudit;
    }

    /**
     * Sets the value of the toAudit property.
     * 
     */
    public void setToAudit(boolean value) {
        this.toAudit = value;
    }

    /**
     * Gets the value of the srcContractTypesIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srcContractTypesIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrcContractTypesIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSrcContractTypesIds() {
        if (srcContractTypesIds == null) {
            srcContractTypesIds = new ArrayList<Long>();
        }
        return this.srcContractTypesIds;
    }

    /**
     * Gets the value of the srcContractTypesGuids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srcContractTypesGuids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrcContractTypesGuids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSrcContractTypesGuids() {
        if (srcContractTypesGuids == null) {
            srcContractTypesGuids = new ArrayList<String>();
        }
        return this.srcContractTypesGuids;
    }

    /**
     * Gets the value of the smsBegSendTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSmsBegSendTime() {
        return smsBegSendTime;
    }

    /**
     * Sets the value of the smsBegSendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSmsBegSendTime(Long value) {
        this.smsBegSendTime = value;
    }

    /**
     * Gets the value of the smsEndSendTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSmsEndSendTime() {
        return smsEndSendTime;
    }

    /**
     * Sets the value of the smsEndSendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSmsEndSendTime(Long value) {
        this.smsEndSendTime = value;
    }

    /**
     * Gets the value of the smsTranslit property.
     * 
     */
    public boolean isSmsTranslit() {
        return smsTranslit;
    }

    /**
     * Sets the value of the smsTranslit property.
     * 
     */
    public void setSmsTranslit(boolean value) {
        this.smsTranslit = value;
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
     *         &lt;element name="MessageTemplate" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}NotifyMessageTemplate" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "messageTemplate"
    })
    public static class MessageTemplates {

        @XmlElement(name = "MessageTemplate")
        protected List<NotifyMessageTemplate> messageTemplate;

        /**
         * Gets the value of the messageTemplate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the messageTemplate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMessageTemplate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NotifyMessageTemplate }
         * 
         * 
         */
        public List<NotifyMessageTemplate> getMessageTemplate() {
            if (messageTemplate == null) {
                messageTemplate = new ArrayList<NotifyMessageTemplate>();
            }
            return this.messageTemplate;
        }

    }

}
