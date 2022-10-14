
package com.tranzaxis.schemas.contracts_notify;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.radixware.schemas.common.UserFunc;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tranzaxis.schemas.contracts_notify package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ContractTypeSettingsNotifyOnAppTranFunc_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "NotifyOnAppTranFunc");
    private final static QName _ContractTypeSettingsNotifyOnInvoiceFunc_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "NotifyOnInvoiceFunc");
    private final static QName _ContractTypeSettingsNotifyOnContractExpFunc_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "NotifyOnContractExpFunc");
    private final static QName _ContractTypeSettingsNotifyOnContractTranFunc_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "NotifyOnContractTranFunc");
    private final static QName _ContractTypeSettingsNotifyOnTokenExpFunc_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "NotifyOnTokenExpFunc");
    private final static QName _ContractTypeSettingsSendOtpFunc_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "SendOtpFunc");
    private final static QName _NotifyTypeMessageUserFunc_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "MessageUserFunc");
    private final static QName _NotifyContractEmails_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "Emails");
    private final static QName _NotifyContractSmsPhones_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "SmsPhones");
    private final static QName _NotifyContractSmsPhonesValue_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "Value");
    private final static QName _NotifySubscriptionTitle_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "Title");
    private final static QName _NotifySubscriptionSmsBegSendTime_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "SmsBegSendTime");
    private final static QName _NotifySubscriptionSmsEndSendTime_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "SmsEndSendTime");
    private final static QName _NotifySubscriptionExpDelay_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "ExpDelay");
    private final static QName _NotifySubscriptionExpDate_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "ExpDate");
    private final static QName _NotifySubscriptionExpRepeatPeriod_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "ExpRepeatPeriod");
    private final static QName _NotifySubscriptionToSms_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "ToSms");
    private final static QName _NotifySubscriptionSmsTranslit_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "SmsTranslit");
    private final static QName _NotifySubscriptionToEmail_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "ToEmail");
    private final static QName _NotifySubscriptionToTwitter_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "ToTwitter");
    private final static QName _NotifySubscriptionLinkedContractId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "LinkedContractId");
    private final static QName _NotifySubscriptionLinkedContractRid_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "LinkedContractRid");
    private final static QName _NotifySubscriptionLinkedContractTokenId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "LinkedContractTokenId");
    private final static QName _NotifySubscriptionLinkedContractTokenExtRid_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "LinkedContractTokenExtRid");
    private final static QName _NotifySubscriptionLinkedContractLoginName_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "LinkedContractLoginName");
    private final static QName _NotifySubscriptionLinkedContractCardPan_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "LinkedContractCardPan");
    private final static QName _NotifySubscriptionAllowedNotifyAddressId_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "AllowedNotifyAddressId");
    private final static QName _NotifySubscriptionAllowedNotifyAddressRid_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "AllowedNotifyAddressRid");
    private final static QName _NotifySubscriptionOneMessage_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "OneMessage");
    private final static QName _NotifyAddressAddress_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "Address");
    private final static QName _NotifyAddressSubscriptionIds_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "SubscriptionIds");
    private final static QName _NotifyAddressUndoSubscriptionIds_QNAME = new QName("http://schemas.tranzaxis.com/contracts-notify.xsd", "UndoSubscriptionIds");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tranzaxis.schemas.contracts_notify
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotifyDeliveryScheme }
     * 
     */
    public NotifyDeliveryScheme createNotifyDeliveryScheme() {
        return new NotifyDeliveryScheme();
    }

    /**
     * Create an instance of {@link NotifyType }
     * 
     */
    public NotifyType createNotifyType() {
        return new NotifyType();
    }

    /**
     * Create an instance of {@link NotifyContract }
     * 
     */
    public NotifyContract createNotifyContract() {
        return new NotifyContract();
    }

    /**
     * Create an instance of {@link NotifyAddress }
     * 
     */
    public NotifyAddress createNotifyAddress() {
        return new NotifyAddress();
    }

    /**
     * Create an instance of {@link NotifySubscription }
     * 
     */
    public NotifySubscription createNotifySubscription() {
        return new NotifySubscription();
    }

    /**
     * Create an instance of {@link NotifyOption }
     * 
     */
    public NotifyOption createNotifyOption() {
        return new NotifyOption();
    }

    /**
     * Create an instance of {@link NotifyMessageTemplate }
     * 
     */
    public NotifyMessageTemplate createNotifyMessageTemplate() {
        return new NotifyMessageTemplate();
    }

    /**
     * Create an instance of {@link NotifyTypes }
     * 
     */
    public NotifyTypes createNotifyTypes() {
        return new NotifyTypes();
    }

    /**
     * Create an instance of {@link ContractTypeSettings }
     * 
     */
    public ContractTypeSettings createContractTypeSettings() {
        return new ContractTypeSettings();
    }

    /**
     * Create an instance of {@link NotifyDeliverySchemeItem }
     * 
     */
    public NotifyDeliverySchemeItem createNotifyDeliverySchemeItem() {
        return new NotifyDeliverySchemeItem();
    }

    /**
     * Create an instance of {@link NotifyDeliveryScheme.NotifyDeliverySchemeItems }
     * 
     */
    public NotifyDeliveryScheme.NotifyDeliverySchemeItems createNotifyDeliverySchemeNotifyDeliverySchemeItems() {
        return new NotifyDeliveryScheme.NotifyDeliverySchemeItems();
    }

    /**
     * Create an instance of {@link NotifyType.MessageTemplates }
     * 
     */
    public NotifyType.MessageTemplates createNotifyTypeMessageTemplates() {
        return new NotifyType.MessageTemplates();
    }

    /**
     * Create an instance of {@link NotifyContract.Emails }
     * 
     */
    public NotifyContract.Emails createNotifyContractEmails() {
        return new NotifyContract.Emails();
    }

    /**
     * Create an instance of {@link NotifyContract.SmsPhones }
     * 
     */
    public NotifyContract.SmsPhones createNotifyContractSmsPhones() {
        return new NotifyContract.SmsPhones();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "NotifyOnAppTranFunc", scope = ContractTypeSettings.class)
    public JAXBElement<UserFunc> createContractTypeSettingsNotifyOnAppTranFunc(UserFunc value) {
        return new JAXBElement<UserFunc>(_ContractTypeSettingsNotifyOnAppTranFunc_QNAME, UserFunc.class, ContractTypeSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "NotifyOnInvoiceFunc", scope = ContractTypeSettings.class)
    public JAXBElement<UserFunc> createContractTypeSettingsNotifyOnInvoiceFunc(UserFunc value) {
        return new JAXBElement<UserFunc>(_ContractTypeSettingsNotifyOnInvoiceFunc_QNAME, UserFunc.class, ContractTypeSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "NotifyOnContractExpFunc", scope = ContractTypeSettings.class)
    public JAXBElement<UserFunc> createContractTypeSettingsNotifyOnContractExpFunc(UserFunc value) {
        return new JAXBElement<UserFunc>(_ContractTypeSettingsNotifyOnContractExpFunc_QNAME, UserFunc.class, ContractTypeSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "NotifyOnContractTranFunc", scope = ContractTypeSettings.class)
    public JAXBElement<UserFunc> createContractTypeSettingsNotifyOnContractTranFunc(UserFunc value) {
        return new JAXBElement<UserFunc>(_ContractTypeSettingsNotifyOnContractTranFunc_QNAME, UserFunc.class, ContractTypeSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "NotifyOnTokenExpFunc", scope = ContractTypeSettings.class)
    public JAXBElement<UserFunc> createContractTypeSettingsNotifyOnTokenExpFunc(UserFunc value) {
        return new JAXBElement<UserFunc>(_ContractTypeSettingsNotifyOnTokenExpFunc_QNAME, UserFunc.class, ContractTypeSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "SendOtpFunc", scope = ContractTypeSettings.class)
    public JAXBElement<UserFunc> createContractTypeSettingsSendOtpFunc(UserFunc value) {
        return new JAXBElement<UserFunc>(_ContractTypeSettingsSendOtpFunc_QNAME, UserFunc.class, ContractTypeSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "MessageUserFunc", scope = NotifyType.class)
    public JAXBElement<UserFunc> createNotifyTypeMessageUserFunc(UserFunc value) {
        return new JAXBElement<UserFunc>(_NotifyTypeMessageUserFunc_QNAME, UserFunc.class, NotifyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyContract.Emails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotifyContract.Emails }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "Emails", scope = NotifyContract.class)
    public JAXBElement<NotifyContract.Emails> createNotifyContractEmails(NotifyContract.Emails value) {
        return new JAXBElement<NotifyContract.Emails>(_NotifyContractEmails_QNAME, NotifyContract.Emails.class, NotifyContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyContract.SmsPhones }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotifyContract.SmsPhones }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "SmsPhones", scope = NotifyContract.class)
    public JAXBElement<NotifyContract.SmsPhones> createNotifyContractSmsPhones(NotifyContract.SmsPhones value) {
        return new JAXBElement<NotifyContract.SmsPhones>(_NotifyContractSmsPhones_QNAME, NotifyContract.SmsPhones.class, NotifyContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "Value", scope = NotifyContract.SmsPhones.class)
    public JAXBElement<List<String>> createNotifyContractSmsPhonesValue(List<String> value) {
        return new JAXBElement<List<String>>(_NotifyContractSmsPhonesValue_QNAME, ((Class) List.class), NotifyContract.SmsPhones.class, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "Value", scope = NotifyContract.Emails.class)
    public JAXBElement<List<String>> createNotifyContractEmailsValue(List<String> value) {
        return new JAXBElement<List<String>>(_NotifyContractSmsPhonesValue_QNAME, ((Class) List.class), NotifyContract.Emails.class, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "Title", scope = NotifySubscription.class)
    public JAXBElement<String> createNotifySubscriptionTitle(String value) {
        return new JAXBElement<String>(_NotifySubscriptionTitle_QNAME, String.class, NotifySubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "Emails", scope = NotifySubscription.class)
    public JAXBElement<List<String>> createNotifySubscriptionEmails(List<String> value) {
        return new JAXBElement<List<String>>(_NotifyContractEmails_QNAME, ((Class) List.class), NotifySubscription.class, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "SmsPhones", scope = NotifySubscription.class)
    public JAXBElement<List<String>> createNotifySubscriptionSmsPhones(List<String> value) {
        return new JAXBElement<List<String>>(_NotifyContractSmsPhones_QNAME, ((Class) List.class), NotifySubscription.class, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "SmsBegSendTime", scope = NotifySubscription.class)
    public JAXBElement<Long> createNotifySubscriptionSmsBegSendTime(Long value) {
        return new JAXBElement<Long>(_NotifySubscriptionSmsBegSendTime_QNAME, Long.class, NotifySubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "SmsEndSendTime", scope = NotifySubscription.class)
    public JAXBElement<Long> createNotifySubscriptionSmsEndSendTime(Long value) {
        return new JAXBElement<Long>(_NotifySubscriptionSmsEndSendTime_QNAME, Long.class, NotifySubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "ExpDelay", scope = NotifySubscription.class)
    public JAXBElement<Long> createNotifySubscriptionExpDelay(Long value) {
        return new JAXBElement<Long>(_NotifySubscriptionExpDelay_QNAME, Long.class, NotifySubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "ExpDate", scope = NotifySubscription.class)
    public JAXBElement<XMLGregorianCalendar> createNotifySubscriptionExpDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NotifySubscriptionExpDate_QNAME, XMLGregorianCalendar.class, NotifySubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "ExpRepeatPeriod", scope = NotifySubscription.class)
    public JAXBElement<Long> createNotifySubscriptionExpRepeatPeriod(Long value) {
        return new JAXBElement<Long>(_NotifySubscriptionExpRepeatPeriod_QNAME, Long.class, NotifySubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "ToSms", scope = NotifySubscription.class)
    public JAXBElement<Boolean> createNotifySubscriptionToSms(Boolean value) {
        return new JAXBElement<Boolean>(_NotifySubscriptionToSms_QNAME, Boolean.class, NotifySubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "SmsTranslit", scope = NotifySubscription.class)
    public JAXBElement<Boolean> createNotifySubscriptionSmsTranslit(Boolean value) {
        return new JAXBElement<Boolean>(_NotifySubscriptionSmsTranslit_QNAME, Boolean.class, NotifySubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "ToEmail", scope = NotifySubscription.class)
    public JAXBElement<Boolean> createNotifySubscriptionToEmail(Boolean value) {
        return new JAXBElement<Boolean>(_NotifySubscriptionToEmail_QNAME, Boolean.class, NotifySubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "ToTwitter", scope = NotifySubscription.class)
    public JAXBElement<Boolean> createNotifySubscriptionToTwitter(Boolean value) {
        return new JAXBElement<Boolean>(_NotifySubscriptionToTwitter_QNAME, Boolean.class, NotifySubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "LinkedContractId", scope = NotifySubscription.class)
    public JAXBElement<Long> createNotifySubscriptionLinkedContractId(Long value) {
        return new JAXBElement<Long>(_NotifySubscriptionLinkedContractId_QNAME, Long.class, NotifySubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "LinkedContractRid", scope = NotifySubscription.class)
    public JAXBElement<String> createNotifySubscriptionLinkedContractRid(String value) {
        return new JAXBElement<String>(_NotifySubscriptionLinkedContractRid_QNAME, String.class, NotifySubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "LinkedContractTokenId", scope = NotifySubscription.class)
    public JAXBElement<Long> createNotifySubscriptionLinkedContractTokenId(Long value) {
        return new JAXBElement<Long>(_NotifySubscriptionLinkedContractTokenId_QNAME, Long.class, NotifySubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "LinkedContractTokenExtRid", scope = NotifySubscription.class)
    public JAXBElement<String> createNotifySubscriptionLinkedContractTokenExtRid(String value) {
        return new JAXBElement<String>(_NotifySubscriptionLinkedContractTokenExtRid_QNAME, String.class, NotifySubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "LinkedContractLoginName", scope = NotifySubscription.class)
    public JAXBElement<String> createNotifySubscriptionLinkedContractLoginName(String value) {
        return new JAXBElement<String>(_NotifySubscriptionLinkedContractLoginName_QNAME, String.class, NotifySubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "LinkedContractCardPan", scope = NotifySubscription.class)
    public JAXBElement<String> createNotifySubscriptionLinkedContractCardPan(String value) {
        return new JAXBElement<String>(_NotifySubscriptionLinkedContractCardPan_QNAME, String.class, NotifySubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "AllowedNotifyAddressId", scope = NotifySubscription.class)
    public JAXBElement<List<Long>> createNotifySubscriptionAllowedNotifyAddressId(List<Long> value) {
        return new JAXBElement<List<Long>>(_NotifySubscriptionAllowedNotifyAddressId_QNAME, ((Class) List.class), NotifySubscription.class, ((List<Long> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "AllowedNotifyAddressRid", scope = NotifySubscription.class)
    public JAXBElement<List<String>> createNotifySubscriptionAllowedNotifyAddressRid(List<String> value) {
        return new JAXBElement<List<String>>(_NotifySubscriptionAllowedNotifyAddressRid_QNAME, ((Class) List.class), NotifySubscription.class, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "OneMessage", scope = NotifySubscription.class)
    public JAXBElement<Boolean> createNotifySubscriptionOneMessage(Boolean value) {
        return new JAXBElement<Boolean>(_NotifySubscriptionOneMessage_QNAME, Boolean.class, NotifySubscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "Address", scope = NotifyAddress.class)
    public JAXBElement<String> createNotifyAddressAddress(String value) {
        return new JAXBElement<String>(_NotifyAddressAddress_QNAME, String.class, NotifyAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "SubscriptionIds", scope = NotifyAddress.class)
    public JAXBElement<List<Long>> createNotifyAddressSubscriptionIds(List<Long> value) {
        return new JAXBElement<List<Long>>(_NotifyAddressSubscriptionIds_QNAME, ((Class) List.class), NotifyAddress.class, ((List<Long> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", name = "UndoSubscriptionIds", scope = NotifyAddress.class)
    public JAXBElement<List<Long>> createNotifyAddressUndoSubscriptionIds(List<Long> value) {
        return new JAXBElement<List<Long>>(_NotifyAddressUndoSubscriptionIds_QNAME, ((Class) List.class), NotifyAddress.class, ((List<Long> ) value));
    }

}
