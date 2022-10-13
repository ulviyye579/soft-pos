
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.AppEncryptedData;


/**
 * <p>Java class for TdsRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TdsRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Extensions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://schemas.radixware.org/types.xsd&gt;Str"&gt;
 *                           &lt;attribute name="name" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="id" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="criticalityIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CardPwdHash" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="PersonalQAs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="QA" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Question" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *                             &lt;element name="Answer" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *                             &lt;element name="AnswerCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CommonQAs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BirthDate" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="Cvv2" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="CardExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *                   &lt;element name="DocNumber" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="Zip" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CardPwdHashCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *         &lt;element name="CardholderInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MobilePhones" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="MobilePhone" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WorkPhones" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="WorkPhone" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Emails" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Email" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MailAddress" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="CityTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="CountryId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="StreetTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="AddressInCity" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Zip" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="RegionRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="HomeAddress" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="CityTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="CountryId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="StreetTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="AddressInCity" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Zip" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Phone" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="RecipientName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TranDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MerchantRiskIndicator" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="DeliveryEmailAddress" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="DeliveryTimeframe" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="GiftCardAmount" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="GiftCardCount" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="GiftCardCurr" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="PreOrderDate" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="PreOrderPurchaseInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="ReorderItemsInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="ShipIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TdsRequestorPriorAuthenticationInfo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="TdsReqPriorAuthMethod" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="TdsReqPriorAuthTimestamp" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="TdsReqPriorRef" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="TdsReqPriorAuthData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="TdsReqAppUrl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="TdsServerTranId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SdkTranId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SdkReferenceNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="BrowserAcceptHeaders" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="BrowserIpAddress" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="BrowserJavaEnabled" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="BrowserJavascriptEnabled" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="BrowserLanguage" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="BrowserColorDepth" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="BrowserScreenHeight" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="BrowserScreenWidth" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="BrowserTimeZone" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="BrowserUserAgent" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="DeviceInfo" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="DeviceRenderingOptions" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AcctType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="AcctAgeIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AcctOpenDate" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="AcctChangeIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="AcctChangeDate" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="PwdChangeIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="ChAccReqId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AcctId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AcctPwdChangeDate" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="AcctShipAddressUsageIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="AcctShipAddressUsage" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="AcctTransactionsLastDay" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="AcctTransactionsLastYear" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="AcctProvisionAttemptsLastDay" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="AcctPurchaseCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="AcctSuspiciousActivity" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="AcctShipNameIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="PaymentAcctAgeIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="PaymentAcctAge" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="EmvPaymentTokenIndicator" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="EmvPaymentTokenSource" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="InstalmentPaymentData" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="TdsReqInitIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="TdsReqAuthIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="TdsReqAuthMethod" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="TdsReqAuthMethodIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="TdsReqChallengeIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="TdsRequestorDecReqInd" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="TdsRequestorDecMaxTime" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="MessageCategory" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="CardHolderIpAddress" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="MessageVersion" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="DsUrl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="DsReferenceNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AuthInvoice" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="RidByPayer" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CallbackUrl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TdsRq", propOrder = {
    "extension",
    "extensions",
    "cardPwdHash",
    "personalQAs",
    "commonQAs",
    "cardPwdHashCrypt",
    "cardholderInfo",
    "tranDetails",
    "authInvoice"
})
public class TdsRq {

    @XmlElement(name = "Extension")
    protected Object extension;
    @XmlElement(name = "Extensions")
    protected TdsRq.Extensions extensions;
    @XmlElement(name = "CardPwdHash")
    protected String cardPwdHash;
    @XmlElement(name = "PersonalQAs")
    protected TdsRq.PersonalQAs personalQAs;
    @XmlElement(name = "CommonQAs")
    protected TdsRq.CommonQAs commonQAs;
    @XmlElement(name = "CardPwdHashCrypt")
    protected AppEncryptedData cardPwdHashCrypt;
    @XmlElement(name = "CardholderInfo")
    protected TdsRq.CardholderInfo cardholderInfo;
    @XmlElement(name = "TranDetails")
    protected TdsRq.TranDetails tranDetails;
    @XmlElement(name = "AuthInvoice")
    protected TdsRq.AuthInvoice authInvoice;
    @XmlAttribute(name = "Version")
    protected String version;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link TdsRq.Extensions }
     *     
     */
    public TdsRq.Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdsRq.Extensions }
     *     
     */
    public void setExtensions(TdsRq.Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the cardPwdHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPwdHash() {
        return cardPwdHash;
    }

    /**
     * Sets the value of the cardPwdHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPwdHash(String value) {
        this.cardPwdHash = value;
    }

    /**
     * Gets the value of the personalQAs property.
     * 
     * @return
     *     possible object is
     *     {@link TdsRq.PersonalQAs }
     *     
     */
    public TdsRq.PersonalQAs getPersonalQAs() {
        return personalQAs;
    }

    /**
     * Sets the value of the personalQAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdsRq.PersonalQAs }
     *     
     */
    public void setPersonalQAs(TdsRq.PersonalQAs value) {
        this.personalQAs = value;
    }

    /**
     * Gets the value of the commonQAs property.
     * 
     * @return
     *     possible object is
     *     {@link TdsRq.CommonQAs }
     *     
     */
    public TdsRq.CommonQAs getCommonQAs() {
        return commonQAs;
    }

    /**
     * Sets the value of the commonQAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdsRq.CommonQAs }
     *     
     */
    public void setCommonQAs(TdsRq.CommonQAs value) {
        this.commonQAs = value;
    }

    /**
     * Gets the value of the cardPwdHashCrypt property.
     * 
     * @return
     *     possible object is
     *     {@link AppEncryptedData }
     *     
     */
    public AppEncryptedData getCardPwdHashCrypt() {
        return cardPwdHashCrypt;
    }

    /**
     * Sets the value of the cardPwdHashCrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppEncryptedData }
     *     
     */
    public void setCardPwdHashCrypt(AppEncryptedData value) {
        this.cardPwdHashCrypt = value;
    }

    /**
     * Gets the value of the cardholderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TdsRq.CardholderInfo }
     *     
     */
    public TdsRq.CardholderInfo getCardholderInfo() {
        return cardholderInfo;
    }

    /**
     * Sets the value of the cardholderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdsRq.CardholderInfo }
     *     
     */
    public void setCardholderInfo(TdsRq.CardholderInfo value) {
        this.cardholderInfo = value;
    }

    /**
     * Gets the value of the tranDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TdsRq.TranDetails }
     *     
     */
    public TdsRq.TranDetails getTranDetails() {
        return tranDetails;
    }

    /**
     * Sets the value of the tranDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdsRq.TranDetails }
     *     
     */
    public void setTranDetails(TdsRq.TranDetails value) {
        this.tranDetails = value;
    }

    /**
     * Gets the value of the authInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link TdsRq.AuthInvoice }
     *     
     */
    public TdsRq.AuthInvoice getAuthInvoice() {
        return authInvoice;
    }

    /**
     * Sets the value of the authInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdsRq.AuthInvoice }
     *     
     */
    public void setAuthInvoice(TdsRq.AuthInvoice value) {
        this.authInvoice = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="RidByPayer" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CallbackUrl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AuthInvoice {

        @XmlAttribute(name = "Id")
        protected Long id;
        @XmlAttribute(name = "RidByPayer")
        protected String ridByPayer;
        @XmlAttribute(name = "CallbackUrl")
        protected String callbackUrl;

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
         * Gets the value of the ridByPayer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRidByPayer() {
            return ridByPayer;
        }

        /**
         * Sets the value of the ridByPayer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRidByPayer(String value) {
            this.ridByPayer = value;
        }

        /**
         * Gets the value of the callbackUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallbackUrl() {
            return callbackUrl;
        }

        /**
         * Sets the value of the callbackUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallbackUrl(String value) {
            this.callbackUrl = value;
        }

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
     *         &lt;element name="MobilePhones" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="MobilePhone" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="WorkPhones" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="WorkPhone" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Emails" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Email" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MailAddress" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="CityTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="CountryId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="StreetTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="AddressInCity" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Zip" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="RegionRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="HomeAddress" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="CityTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="CountryId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="StreetTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="AddressInCity" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Zip" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Phone" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="RecipientName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "mobilePhones",
        "workPhones",
        "emails",
        "mailAddress",
        "homeAddress"
    })
    public static class CardholderInfo {

        @XmlElement(name = "MobilePhones")
        protected TdsRq.CardholderInfo.MobilePhones mobilePhones;
        @XmlElement(name = "WorkPhones")
        protected TdsRq.CardholderInfo.WorkPhones workPhones;
        @XmlElement(name = "Emails")
        protected TdsRq.CardholderInfo.Emails emails;
        @XmlElement(name = "MailAddress")
        protected TdsRq.CardholderInfo.MailAddress mailAddress;
        @XmlElement(name = "HomeAddress")
        protected TdsRq.CardholderInfo.HomeAddress homeAddress;

        /**
         * Gets the value of the mobilePhones property.
         * 
         * @return
         *     possible object is
         *     {@link TdsRq.CardholderInfo.MobilePhones }
         *     
         */
        public TdsRq.CardholderInfo.MobilePhones getMobilePhones() {
            return mobilePhones;
        }

        /**
         * Sets the value of the mobilePhones property.
         * 
         * @param value
         *     allowed object is
         *     {@link TdsRq.CardholderInfo.MobilePhones }
         *     
         */
        public void setMobilePhones(TdsRq.CardholderInfo.MobilePhones value) {
            this.mobilePhones = value;
        }

        /**
         * Gets the value of the workPhones property.
         * 
         * @return
         *     possible object is
         *     {@link TdsRq.CardholderInfo.WorkPhones }
         *     
         */
        public TdsRq.CardholderInfo.WorkPhones getWorkPhones() {
            return workPhones;
        }

        /**
         * Sets the value of the workPhones property.
         * 
         * @param value
         *     allowed object is
         *     {@link TdsRq.CardholderInfo.WorkPhones }
         *     
         */
        public void setWorkPhones(TdsRq.CardholderInfo.WorkPhones value) {
            this.workPhones = value;
        }

        /**
         * Gets the value of the emails property.
         * 
         * @return
         *     possible object is
         *     {@link TdsRq.CardholderInfo.Emails }
         *     
         */
        public TdsRq.CardholderInfo.Emails getEmails() {
            return emails;
        }

        /**
         * Sets the value of the emails property.
         * 
         * @param value
         *     allowed object is
         *     {@link TdsRq.CardholderInfo.Emails }
         *     
         */
        public void setEmails(TdsRq.CardholderInfo.Emails value) {
            this.emails = value;
        }

        /**
         * Gets the value of the mailAddress property.
         * 
         * @return
         *     possible object is
         *     {@link TdsRq.CardholderInfo.MailAddress }
         *     
         */
        public TdsRq.CardholderInfo.MailAddress getMailAddress() {
            return mailAddress;
        }

        /**
         * Sets the value of the mailAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link TdsRq.CardholderInfo.MailAddress }
         *     
         */
        public void setMailAddress(TdsRq.CardholderInfo.MailAddress value) {
            this.mailAddress = value;
        }

        /**
         * Gets the value of the homeAddress property.
         * 
         * @return
         *     possible object is
         *     {@link TdsRq.CardholderInfo.HomeAddress }
         *     
         */
        public TdsRq.CardholderInfo.HomeAddress getHomeAddress() {
            return homeAddress;
        }

        /**
         * Sets the value of the homeAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link TdsRq.CardholderInfo.HomeAddress }
         *     
         */
        public void setHomeAddress(TdsRq.CardholderInfo.HomeAddress value) {
            this.homeAddress = value;
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
         *         &lt;element name="Email" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "email"
        })
        public static class Emails {

            @XmlElement(name = "Email")
            protected List<String> email;

            /**
             * Gets the value of the email property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the email property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEmail().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getEmail() {
                if (email == null) {
                    email = new ArrayList<String>();
                }
                return this.email;
            }

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
         *       &lt;attribute name="CityTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="CountryId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="StreetTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="AddressInCity" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Zip" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Phone" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="RecipientName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class HomeAddress {

            @XmlAttribute(name = "CityTitle")
            protected String cityTitle;
            @XmlAttribute(name = "CountryId")
            protected String countryId;
            @XmlAttribute(name = "StreetTitle")
            protected String streetTitle;
            @XmlAttribute(name = "AddressInCity")
            protected String addressInCity;
            @XmlAttribute(name = "Zip")
            protected String zip;
            @XmlAttribute(name = "Phone")
            protected String phone;
            @XmlAttribute(name = "RecipientName")
            protected String recipientName;

            /**
             * Gets the value of the cityTitle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCityTitle() {
                return cityTitle;
            }

            /**
             * Sets the value of the cityTitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCityTitle(String value) {
                this.cityTitle = value;
            }

            /**
             * Gets the value of the countryId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryId() {
                return countryId;
            }

            /**
             * Sets the value of the countryId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryId(String value) {
                this.countryId = value;
            }

            /**
             * Gets the value of the streetTitle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStreetTitle() {
                return streetTitle;
            }

            /**
             * Sets the value of the streetTitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStreetTitle(String value) {
                this.streetTitle = value;
            }

            /**
             * Gets the value of the addressInCity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressInCity() {
                return addressInCity;
            }

            /**
             * Sets the value of the addressInCity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressInCity(String value) {
                this.addressInCity = value;
            }

            /**
             * Gets the value of the zip property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZip() {
                return zip;
            }

            /**
             * Sets the value of the zip property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZip(String value) {
                this.zip = value;
            }

            /**
             * Gets the value of the phone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhone() {
                return phone;
            }

            /**
             * Sets the value of the phone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhone(String value) {
                this.phone = value;
            }

            /**
             * Gets the value of the recipientName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecipientName() {
                return recipientName;
            }

            /**
             * Sets the value of the recipientName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRecipientName(String value) {
                this.recipientName = value;
            }

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
         *       &lt;attribute name="CityTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="CountryId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="StreetTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="AddressInCity" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Zip" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="RegionRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MailAddress {

            @XmlAttribute(name = "CityTitle")
            protected String cityTitle;
            @XmlAttribute(name = "CountryId")
            protected String countryId;
            @XmlAttribute(name = "StreetTitle")
            protected String streetTitle;
            @XmlAttribute(name = "AddressInCity")
            protected String addressInCity;
            @XmlAttribute(name = "Zip")
            protected String zip;
            @XmlAttribute(name = "RegionRid")
            protected String regionRid;

            /**
             * Gets the value of the cityTitle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCityTitle() {
                return cityTitle;
            }

            /**
             * Sets the value of the cityTitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCityTitle(String value) {
                this.cityTitle = value;
            }

            /**
             * Gets the value of the countryId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryId() {
                return countryId;
            }

            /**
             * Sets the value of the countryId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryId(String value) {
                this.countryId = value;
            }

            /**
             * Gets the value of the streetTitle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStreetTitle() {
                return streetTitle;
            }

            /**
             * Sets the value of the streetTitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStreetTitle(String value) {
                this.streetTitle = value;
            }

            /**
             * Gets the value of the addressInCity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressInCity() {
                return addressInCity;
            }

            /**
             * Sets the value of the addressInCity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressInCity(String value) {
                this.addressInCity = value;
            }

            /**
             * Gets the value of the zip property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZip() {
                return zip;
            }

            /**
             * Sets the value of the zip property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZip(String value) {
                this.zip = value;
            }

            /**
             * Gets the value of the regionRid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegionRid() {
                return regionRid;
            }

            /**
             * Sets the value of the regionRid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegionRid(String value) {
                this.regionRid = value;
            }

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
         *         &lt;element name="MobilePhone" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "mobilePhone"
        })
        public static class MobilePhones {

            @XmlElement(name = "MobilePhone")
            protected List<String> mobilePhone;

            /**
             * Gets the value of the mobilePhone property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mobilePhone property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMobilePhone().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getMobilePhone() {
                if (mobilePhone == null) {
                    mobilePhone = new ArrayList<String>();
                }
                return this.mobilePhone;
            }

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
         *         &lt;element name="WorkPhone" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "workPhone"
        })
        public static class WorkPhones {

            @XmlElement(name = "WorkPhone")
            protected List<String> workPhone;

            /**
             * Gets the value of the workPhone property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the workPhone property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWorkPhone().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getWorkPhone() {
                if (workPhone == null) {
                    workPhone = new ArrayList<String>();
                }
                return this.workPhone;
            }

        }

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
     *         &lt;element name="BirthDate" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="Cvv2" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="CardExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
     *         &lt;element name="DocNumber" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="Zip" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
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
        "birthDate",
        "cvv2",
        "cardExpDate",
        "docNumber",
        "zip"
    })
    public static class CommonQAs {

        @XmlElement(name = "BirthDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar birthDate;
        @XmlElement(name = "Cvv2")
        protected String cvv2;
        @XmlElement(name = "CardExpDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cardExpDate;
        @XmlElement(name = "DocNumber")
        protected String docNumber;
        @XmlElement(name = "Zip")
        protected String zip;

        /**
         * Gets the value of the birthDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBirthDate() {
            return birthDate;
        }

        /**
         * Sets the value of the birthDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBirthDate(XMLGregorianCalendar value) {
            this.birthDate = value;
        }

        /**
         * Gets the value of the cvv2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvv2() {
            return cvv2;
        }

        /**
         * Sets the value of the cvv2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvv2(String value) {
            this.cvv2 = value;
        }

        /**
         * Gets the value of the cardExpDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCardExpDate() {
            return cardExpDate;
        }

        /**
         * Sets the value of the cardExpDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCardExpDate(XMLGregorianCalendar value) {
            this.cardExpDate = value;
        }

        /**
         * Gets the value of the docNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocNumber() {
            return docNumber;
        }

        /**
         * Sets the value of the docNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocNumber(String value) {
            this.docNumber = value;
        }

        /**
         * Gets the value of the zip property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZip() {
            return zip;
        }

        /**
         * Sets the value of the zip property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZip(String value) {
            this.zip = value;
        }

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
     *         &lt;element name="Extension" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://schemas.radixware.org/types.xsd&gt;Str"&gt;
     *                 &lt;attribute name="name" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="id" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="criticalityIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "extension"
    })
    public static class Extensions {

        @XmlElement(name = "Extension")
        protected List<TdsRq.Extensions.Extension> extension;

        /**
         * Gets the value of the extension property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extension property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtension().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TdsRq.Extensions.Extension }
         * 
         * 
         */
        public List<TdsRq.Extensions.Extension> getExtension() {
            if (extension == null) {
                extension = new ArrayList<TdsRq.Extensions.Extension>();
            }
            return this.extension;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://schemas.radixware.org/types.xsd&gt;Str"&gt;
         *       &lt;attribute name="name" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="id" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="criticalityIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Extension {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "criticalityIndicator")
            protected String criticalityIndicator;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the criticalityIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCriticalityIndicator() {
                return criticalityIndicator;
            }

            /**
             * Sets the value of the criticalityIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCriticalityIndicator(String value) {
                this.criticalityIndicator = value;
            }

        }

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
     *         &lt;element name="QA" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Question" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
     *                   &lt;element name="Answer" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
     *                   &lt;element name="AnswerCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "qa"
    })
    public static class PersonalQAs {

        @XmlElement(name = "QA")
        protected List<TdsRq.PersonalQAs.QA> qa;

        /**
         * Gets the value of the qa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the qa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TdsRq.PersonalQAs.QA }
         * 
         * 
         */
        public List<TdsRq.PersonalQAs.QA> getQA() {
            if (qa == null) {
                qa = new ArrayList<TdsRq.PersonalQAs.QA>();
            }
            return this.qa;
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
         *         &lt;element name="Question" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
         *         &lt;element name="Answer" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
         *         &lt;element name="AnswerCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
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
            "question",
            "answer",
            "answerCrypt"
        })
        public static class QA {

            @XmlElement(name = "Question", required = true)
            protected String question;
            @XmlElement(name = "Answer", required = true)
            protected String answer;
            @XmlElement(name = "AnswerCrypt")
            protected AppEncryptedData answerCrypt;

            /**
             * Gets the value of the question property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuestion() {
                return question;
            }

            /**
             * Sets the value of the question property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuestion(String value) {
                this.question = value;
            }

            /**
             * Gets the value of the answer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnswer() {
                return answer;
            }

            /**
             * Sets the value of the answer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAnswer(String value) {
                this.answer = value;
            }

            /**
             * Gets the value of the answerCrypt property.
             * 
             * @return
             *     possible object is
             *     {@link AppEncryptedData }
             *     
             */
            public AppEncryptedData getAnswerCrypt() {
                return answerCrypt;
            }

            /**
             * Sets the value of the answerCrypt property.
             * 
             * @param value
             *     allowed object is
             *     {@link AppEncryptedData }
             *     
             */
            public void setAnswerCrypt(AppEncryptedData value) {
                this.answerCrypt = value;
            }

        }

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
     *         &lt;element name="MerchantRiskIndicator" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="DeliveryEmailAddress" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="DeliveryTimeframe" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="GiftCardAmount" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="GiftCardCount" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="GiftCardCurr" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="PreOrderDate" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="PreOrderPurchaseInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="ReorderItemsInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="ShipIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TdsRequestorPriorAuthenticationInfo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="TdsReqPriorAuthMethod" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="TdsReqPriorAuthTimestamp" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="TdsReqPriorRef" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="TdsReqPriorAuthData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="TdsReqAppUrl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="TdsServerTranId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SdkTranId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SdkReferenceNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="BrowserAcceptHeaders" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="BrowserIpAddress" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="BrowserJavaEnabled" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="BrowserJavascriptEnabled" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="BrowserLanguage" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="BrowserColorDepth" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="BrowserScreenHeight" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="BrowserScreenWidth" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="BrowserTimeZone" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="BrowserUserAgent" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="DeviceInfo" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="DeviceRenderingOptions" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AcctType" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="AcctAgeIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AcctOpenDate" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="AcctChangeIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="AcctChangeDate" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="PwdChangeIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="ChAccReqId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AcctId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AcctPwdChangeDate" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="AcctShipAddressUsageIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="AcctShipAddressUsage" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="AcctTransactionsLastDay" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="AcctTransactionsLastYear" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="AcctProvisionAttemptsLastDay" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="AcctPurchaseCount" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="AcctSuspiciousActivity" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="AcctShipNameIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="PaymentAcctAgeIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="PaymentAcctAge" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="EmvPaymentTokenIndicator" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="EmvPaymentTokenSource" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="InstalmentPaymentData" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="TdsReqInitIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="TdsReqAuthIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="TdsReqAuthMethod" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="TdsReqAuthMethodIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="TdsReqChallengeIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="TdsRequestorDecReqInd" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="TdsRequestorDecMaxTime" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="MessageCategory" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="CardHolderIpAddress" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="MessageVersion" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="DsUrl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="DsReferenceNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "merchantRiskIndicator",
        "tdsRequestorPriorAuthenticationInfo"
    })
    public static class TranDetails {

        @XmlElement(name = "MerchantRiskIndicator")
        protected TdsRq.TranDetails.MerchantRiskIndicator merchantRiskIndicator;
        @XmlElement(name = "TdsRequestorPriorAuthenticationInfo")
        protected TdsRq.TranDetails.TdsRequestorPriorAuthenticationInfo tdsRequestorPriorAuthenticationInfo;
        @XmlAttribute(name = "TdsServerTranId")
        protected String tdsServerTranId;
        @XmlAttribute(name = "SdkTranId")
        protected String sdkTranId;
        @XmlAttribute(name = "SdkReferenceNumber")
        protected String sdkReferenceNumber;
        @XmlAttribute(name = "BrowserAcceptHeaders")
        protected String browserAcceptHeaders;
        @XmlAttribute(name = "BrowserIpAddress")
        protected String browserIpAddress;
        @XmlAttribute(name = "BrowserJavaEnabled")
        protected Boolean browserJavaEnabled;
        @XmlAttribute(name = "BrowserJavascriptEnabled")
        protected Boolean browserJavascriptEnabled;
        @XmlAttribute(name = "BrowserLanguage")
        protected String browserLanguage;
        @XmlAttribute(name = "BrowserColorDepth")
        protected String browserColorDepth;
        @XmlAttribute(name = "BrowserScreenHeight")
        protected String browserScreenHeight;
        @XmlAttribute(name = "BrowserScreenWidth")
        protected String browserScreenWidth;
        @XmlAttribute(name = "BrowserTimeZone")
        protected String browserTimeZone;
        @XmlAttribute(name = "BrowserUserAgent")
        protected String browserUserAgent;
        @XmlAttribute(name = "DeviceInfo")
        protected String deviceInfo;
        @XmlAttribute(name = "DeviceRenderingOptions")
        protected String deviceRenderingOptions;
        @XmlAttribute(name = "AcctType")
        protected Long acctType;
        @XmlAttribute(name = "AcctAgeIndicator")
        protected String acctAgeIndicator;
        @XmlAttribute(name = "AcctOpenDate")
        protected Long acctOpenDate;
        @XmlAttribute(name = "AcctChangeIndicator")
        protected Long acctChangeIndicator;
        @XmlAttribute(name = "AcctChangeDate")
        protected Long acctChangeDate;
        @XmlAttribute(name = "PwdChangeIndicator")
        protected Long pwdChangeIndicator;
        @XmlAttribute(name = "ChAccReqId")
        protected String chAccReqId;
        @XmlAttribute(name = "AcctId")
        protected String acctId;
        @XmlAttribute(name = "AcctPwdChangeDate")
        protected Long acctPwdChangeDate;
        @XmlAttribute(name = "AcctShipAddressUsageIndicator")
        protected Long acctShipAddressUsageIndicator;
        @XmlAttribute(name = "AcctShipAddressUsage")
        protected Long acctShipAddressUsage;
        @XmlAttribute(name = "AcctTransactionsLastDay")
        protected Long acctTransactionsLastDay;
        @XmlAttribute(name = "AcctTransactionsLastYear")
        protected Long acctTransactionsLastYear;
        @XmlAttribute(name = "AcctProvisionAttemptsLastDay")
        protected Long acctProvisionAttemptsLastDay;
        @XmlAttribute(name = "AcctPurchaseCount")
        protected Long acctPurchaseCount;
        @XmlAttribute(name = "AcctSuspiciousActivity")
        protected Long acctSuspiciousActivity;
        @XmlAttribute(name = "AcctShipNameIndicator")
        protected Long acctShipNameIndicator;
        @XmlAttribute(name = "PaymentAcctAgeIndicator")
        protected Long paymentAcctAgeIndicator;
        @XmlAttribute(name = "PaymentAcctAge")
        protected String paymentAcctAge;
        @XmlAttribute(name = "EmvPaymentTokenIndicator")
        protected Boolean emvPaymentTokenIndicator;
        @XmlAttribute(name = "EmvPaymentTokenSource")
        protected Long emvPaymentTokenSource;
        @XmlAttribute(name = "InstalmentPaymentData")
        protected Long instalmentPaymentData;
        @XmlAttribute(name = "TdsReqInitIndicator")
        protected Long tdsReqInitIndicator;
        @XmlAttribute(name = "TdsReqAuthIndicator")
        protected Long tdsReqAuthIndicator;
        @XmlAttribute(name = "TdsReqAuthMethod")
        protected Long tdsReqAuthMethod;
        @XmlAttribute(name = "TdsReqAuthMethodIndicator")
        protected Long tdsReqAuthMethodIndicator;
        @XmlAttribute(name = "TdsReqChallengeIndicator")
        protected Long tdsReqChallengeIndicator;
        @XmlAttribute(name = "TdsRequestorDecReqInd")
        protected Boolean tdsRequestorDecReqInd;
        @XmlAttribute(name = "TdsRequestorDecMaxTime")
        protected Long tdsRequestorDecMaxTime;
        @XmlAttribute(name = "MessageCategory")
        protected Long messageCategory;
        @XmlAttribute(name = "CardHolderIpAddress")
        protected String cardHolderIpAddress;
        @XmlAttribute(name = "MessageVersion")
        protected String messageVersion;
        @XmlAttribute(name = "DsUrl")
        protected String dsUrl;
        @XmlAttribute(name = "DsReferenceNumber")
        protected String dsReferenceNumber;

        /**
         * Gets the value of the merchantRiskIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link TdsRq.TranDetails.MerchantRiskIndicator }
         *     
         */
        public TdsRq.TranDetails.MerchantRiskIndicator getMerchantRiskIndicator() {
            return merchantRiskIndicator;
        }

        /**
         * Sets the value of the merchantRiskIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link TdsRq.TranDetails.MerchantRiskIndicator }
         *     
         */
        public void setMerchantRiskIndicator(TdsRq.TranDetails.MerchantRiskIndicator value) {
            this.merchantRiskIndicator = value;
        }

        /**
         * Gets the value of the tdsRequestorPriorAuthenticationInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TdsRq.TranDetails.TdsRequestorPriorAuthenticationInfo }
         *     
         */
        public TdsRq.TranDetails.TdsRequestorPriorAuthenticationInfo getTdsRequestorPriorAuthenticationInfo() {
            return tdsRequestorPriorAuthenticationInfo;
        }

        /**
         * Sets the value of the tdsRequestorPriorAuthenticationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TdsRq.TranDetails.TdsRequestorPriorAuthenticationInfo }
         *     
         */
        public void setTdsRequestorPriorAuthenticationInfo(TdsRq.TranDetails.TdsRequestorPriorAuthenticationInfo value) {
            this.tdsRequestorPriorAuthenticationInfo = value;
        }

        /**
         * Gets the value of the tdsServerTranId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTdsServerTranId() {
            return tdsServerTranId;
        }

        /**
         * Sets the value of the tdsServerTranId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTdsServerTranId(String value) {
            this.tdsServerTranId = value;
        }

        /**
         * Gets the value of the sdkTranId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSdkTranId() {
            return sdkTranId;
        }

        /**
         * Sets the value of the sdkTranId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSdkTranId(String value) {
            this.sdkTranId = value;
        }

        /**
         * Gets the value of the sdkReferenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSdkReferenceNumber() {
            return sdkReferenceNumber;
        }

        /**
         * Sets the value of the sdkReferenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSdkReferenceNumber(String value) {
            this.sdkReferenceNumber = value;
        }

        /**
         * Gets the value of the browserAcceptHeaders property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrowserAcceptHeaders() {
            return browserAcceptHeaders;
        }

        /**
         * Sets the value of the browserAcceptHeaders property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrowserAcceptHeaders(String value) {
            this.browserAcceptHeaders = value;
        }

        /**
         * Gets the value of the browserIpAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrowserIpAddress() {
            return browserIpAddress;
        }

        /**
         * Sets the value of the browserIpAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrowserIpAddress(String value) {
            this.browserIpAddress = value;
        }

        /**
         * Gets the value of the browserJavaEnabled property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBrowserJavaEnabled() {
            return browserJavaEnabled;
        }

        /**
         * Sets the value of the browserJavaEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBrowserJavaEnabled(Boolean value) {
            this.browserJavaEnabled = value;
        }

        /**
         * Gets the value of the browserJavascriptEnabled property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBrowserJavascriptEnabled() {
            return browserJavascriptEnabled;
        }

        /**
         * Sets the value of the browserJavascriptEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBrowserJavascriptEnabled(Boolean value) {
            this.browserJavascriptEnabled = value;
        }

        /**
         * Gets the value of the browserLanguage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrowserLanguage() {
            return browserLanguage;
        }

        /**
         * Sets the value of the browserLanguage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrowserLanguage(String value) {
            this.browserLanguage = value;
        }

        /**
         * Gets the value of the browserColorDepth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrowserColorDepth() {
            return browserColorDepth;
        }

        /**
         * Sets the value of the browserColorDepth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrowserColorDepth(String value) {
            this.browserColorDepth = value;
        }

        /**
         * Gets the value of the browserScreenHeight property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrowserScreenHeight() {
            return browserScreenHeight;
        }

        /**
         * Sets the value of the browserScreenHeight property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrowserScreenHeight(String value) {
            this.browserScreenHeight = value;
        }

        /**
         * Gets the value of the browserScreenWidth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrowserScreenWidth() {
            return browserScreenWidth;
        }

        /**
         * Sets the value of the browserScreenWidth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrowserScreenWidth(String value) {
            this.browserScreenWidth = value;
        }

        /**
         * Gets the value of the browserTimeZone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrowserTimeZone() {
            return browserTimeZone;
        }

        /**
         * Sets the value of the browserTimeZone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrowserTimeZone(String value) {
            this.browserTimeZone = value;
        }

        /**
         * Gets the value of the browserUserAgent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrowserUserAgent() {
            return browserUserAgent;
        }

        /**
         * Sets the value of the browserUserAgent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrowserUserAgent(String value) {
            this.browserUserAgent = value;
        }

        /**
         * Gets the value of the deviceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeviceInfo() {
            return deviceInfo;
        }

        /**
         * Sets the value of the deviceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeviceInfo(String value) {
            this.deviceInfo = value;
        }

        /**
         * Gets the value of the deviceRenderingOptions property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeviceRenderingOptions() {
            return deviceRenderingOptions;
        }

        /**
         * Sets the value of the deviceRenderingOptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeviceRenderingOptions(String value) {
            this.deviceRenderingOptions = value;
        }

        /**
         * Gets the value of the acctType property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAcctType() {
            return acctType;
        }

        /**
         * Sets the value of the acctType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAcctType(Long value) {
            this.acctType = value;
        }

        /**
         * Gets the value of the acctAgeIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctAgeIndicator() {
            return acctAgeIndicator;
        }

        /**
         * Sets the value of the acctAgeIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctAgeIndicator(String value) {
            this.acctAgeIndicator = value;
        }

        /**
         * Gets the value of the acctOpenDate property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAcctOpenDate() {
            return acctOpenDate;
        }

        /**
         * Sets the value of the acctOpenDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAcctOpenDate(Long value) {
            this.acctOpenDate = value;
        }

        /**
         * Gets the value of the acctChangeIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAcctChangeIndicator() {
            return acctChangeIndicator;
        }

        /**
         * Sets the value of the acctChangeIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAcctChangeIndicator(Long value) {
            this.acctChangeIndicator = value;
        }

        /**
         * Gets the value of the acctChangeDate property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAcctChangeDate() {
            return acctChangeDate;
        }

        /**
         * Sets the value of the acctChangeDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAcctChangeDate(Long value) {
            this.acctChangeDate = value;
        }

        /**
         * Gets the value of the pwdChangeIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPwdChangeIndicator() {
            return pwdChangeIndicator;
        }

        /**
         * Sets the value of the pwdChangeIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPwdChangeIndicator(Long value) {
            this.pwdChangeIndicator = value;
        }

        /**
         * Gets the value of the chAccReqId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChAccReqId() {
            return chAccReqId;
        }

        /**
         * Sets the value of the chAccReqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChAccReqId(String value) {
            this.chAccReqId = value;
        }

        /**
         * Gets the value of the acctId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctId() {
            return acctId;
        }

        /**
         * Sets the value of the acctId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctId(String value) {
            this.acctId = value;
        }

        /**
         * Gets the value of the acctPwdChangeDate property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAcctPwdChangeDate() {
            return acctPwdChangeDate;
        }

        /**
         * Sets the value of the acctPwdChangeDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAcctPwdChangeDate(Long value) {
            this.acctPwdChangeDate = value;
        }

        /**
         * Gets the value of the acctShipAddressUsageIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAcctShipAddressUsageIndicator() {
            return acctShipAddressUsageIndicator;
        }

        /**
         * Sets the value of the acctShipAddressUsageIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAcctShipAddressUsageIndicator(Long value) {
            this.acctShipAddressUsageIndicator = value;
        }

        /**
         * Gets the value of the acctShipAddressUsage property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAcctShipAddressUsage() {
            return acctShipAddressUsage;
        }

        /**
         * Sets the value of the acctShipAddressUsage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAcctShipAddressUsage(Long value) {
            this.acctShipAddressUsage = value;
        }

        /**
         * Gets the value of the acctTransactionsLastDay property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAcctTransactionsLastDay() {
            return acctTransactionsLastDay;
        }

        /**
         * Sets the value of the acctTransactionsLastDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAcctTransactionsLastDay(Long value) {
            this.acctTransactionsLastDay = value;
        }

        /**
         * Gets the value of the acctTransactionsLastYear property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAcctTransactionsLastYear() {
            return acctTransactionsLastYear;
        }

        /**
         * Sets the value of the acctTransactionsLastYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAcctTransactionsLastYear(Long value) {
            this.acctTransactionsLastYear = value;
        }

        /**
         * Gets the value of the acctProvisionAttemptsLastDay property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAcctProvisionAttemptsLastDay() {
            return acctProvisionAttemptsLastDay;
        }

        /**
         * Sets the value of the acctProvisionAttemptsLastDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAcctProvisionAttemptsLastDay(Long value) {
            this.acctProvisionAttemptsLastDay = value;
        }

        /**
         * Gets the value of the acctPurchaseCount property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAcctPurchaseCount() {
            return acctPurchaseCount;
        }

        /**
         * Sets the value of the acctPurchaseCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAcctPurchaseCount(Long value) {
            this.acctPurchaseCount = value;
        }

        /**
         * Gets the value of the acctSuspiciousActivity property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAcctSuspiciousActivity() {
            return acctSuspiciousActivity;
        }

        /**
         * Sets the value of the acctSuspiciousActivity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAcctSuspiciousActivity(Long value) {
            this.acctSuspiciousActivity = value;
        }

        /**
         * Gets the value of the acctShipNameIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAcctShipNameIndicator() {
            return acctShipNameIndicator;
        }

        /**
         * Sets the value of the acctShipNameIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAcctShipNameIndicator(Long value) {
            this.acctShipNameIndicator = value;
        }

        /**
         * Gets the value of the paymentAcctAgeIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPaymentAcctAgeIndicator() {
            return paymentAcctAgeIndicator;
        }

        /**
         * Sets the value of the paymentAcctAgeIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPaymentAcctAgeIndicator(Long value) {
            this.paymentAcctAgeIndicator = value;
        }

        /**
         * Gets the value of the paymentAcctAge property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentAcctAge() {
            return paymentAcctAge;
        }

        /**
         * Sets the value of the paymentAcctAge property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentAcctAge(String value) {
            this.paymentAcctAge = value;
        }

        /**
         * Gets the value of the emvPaymentTokenIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEmvPaymentTokenIndicator() {
            return emvPaymentTokenIndicator;
        }

        /**
         * Sets the value of the emvPaymentTokenIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEmvPaymentTokenIndicator(Boolean value) {
            this.emvPaymentTokenIndicator = value;
        }

        /**
         * Gets the value of the emvPaymentTokenSource property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getEmvPaymentTokenSource() {
            return emvPaymentTokenSource;
        }

        /**
         * Sets the value of the emvPaymentTokenSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setEmvPaymentTokenSource(Long value) {
            this.emvPaymentTokenSource = value;
        }

        /**
         * Gets the value of the instalmentPaymentData property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getInstalmentPaymentData() {
            return instalmentPaymentData;
        }

        /**
         * Sets the value of the instalmentPaymentData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setInstalmentPaymentData(Long value) {
            this.instalmentPaymentData = value;
        }

        /**
         * Gets the value of the tdsReqInitIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTdsReqInitIndicator() {
            return tdsReqInitIndicator;
        }

        /**
         * Sets the value of the tdsReqInitIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTdsReqInitIndicator(Long value) {
            this.tdsReqInitIndicator = value;
        }

        /**
         * Gets the value of the tdsReqAuthIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTdsReqAuthIndicator() {
            return tdsReqAuthIndicator;
        }

        /**
         * Sets the value of the tdsReqAuthIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTdsReqAuthIndicator(Long value) {
            this.tdsReqAuthIndicator = value;
        }

        /**
         * Gets the value of the tdsReqAuthMethod property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTdsReqAuthMethod() {
            return tdsReqAuthMethod;
        }

        /**
         * Sets the value of the tdsReqAuthMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTdsReqAuthMethod(Long value) {
            this.tdsReqAuthMethod = value;
        }

        /**
         * Gets the value of the tdsReqAuthMethodIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTdsReqAuthMethodIndicator() {
            return tdsReqAuthMethodIndicator;
        }

        /**
         * Sets the value of the tdsReqAuthMethodIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTdsReqAuthMethodIndicator(Long value) {
            this.tdsReqAuthMethodIndicator = value;
        }

        /**
         * Gets the value of the tdsReqChallengeIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTdsReqChallengeIndicator() {
            return tdsReqChallengeIndicator;
        }

        /**
         * Sets the value of the tdsReqChallengeIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTdsReqChallengeIndicator(Long value) {
            this.tdsReqChallengeIndicator = value;
        }

        /**
         * Gets the value of the tdsRequestorDecReqInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTdsRequestorDecReqInd() {
            return tdsRequestorDecReqInd;
        }

        /**
         * Sets the value of the tdsRequestorDecReqInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTdsRequestorDecReqInd(Boolean value) {
            this.tdsRequestorDecReqInd = value;
        }

        /**
         * Gets the value of the tdsRequestorDecMaxTime property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTdsRequestorDecMaxTime() {
            return tdsRequestorDecMaxTime;
        }

        /**
         * Sets the value of the tdsRequestorDecMaxTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTdsRequestorDecMaxTime(Long value) {
            this.tdsRequestorDecMaxTime = value;
        }

        /**
         * Gets the value of the messageCategory property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMessageCategory() {
            return messageCategory;
        }

        /**
         * Sets the value of the messageCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMessageCategory(Long value) {
            this.messageCategory = value;
        }

        /**
         * Gets the value of the cardHolderIpAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardHolderIpAddress() {
            return cardHolderIpAddress;
        }

        /**
         * Sets the value of the cardHolderIpAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardHolderIpAddress(String value) {
            this.cardHolderIpAddress = value;
        }

        /**
         * Gets the value of the messageVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessageVersion() {
            return messageVersion;
        }

        /**
         * Sets the value of the messageVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessageVersion(String value) {
            this.messageVersion = value;
        }

        /**
         * Gets the value of the dsUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDsUrl() {
            return dsUrl;
        }

        /**
         * Sets the value of the dsUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDsUrl(String value) {
            this.dsUrl = value;
        }

        /**
         * Gets the value of the dsReferenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDsReferenceNumber() {
            return dsReferenceNumber;
        }

        /**
         * Sets the value of the dsReferenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDsReferenceNumber(String value) {
            this.dsReferenceNumber = value;
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
         *       &lt;attribute name="DeliveryEmailAddress" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="DeliveryTimeframe" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="GiftCardAmount" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="GiftCardCount" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="GiftCardCurr" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="PreOrderDate" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="PreOrderPurchaseInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="ReorderItemsInd" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="ShipIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MerchantRiskIndicator {

            @XmlAttribute(name = "DeliveryEmailAddress")
            protected String deliveryEmailAddress;
            @XmlAttribute(name = "DeliveryTimeframe")
            protected String deliveryTimeframe;
            @XmlAttribute(name = "GiftCardAmount")
            protected String giftCardAmount;
            @XmlAttribute(name = "GiftCardCount")
            protected String giftCardCount;
            @XmlAttribute(name = "GiftCardCurr")
            protected String giftCardCurr;
            @XmlAttribute(name = "PreOrderDate")
            protected String preOrderDate;
            @XmlAttribute(name = "PreOrderPurchaseInd")
            protected String preOrderPurchaseInd;
            @XmlAttribute(name = "ReorderItemsInd")
            protected String reorderItemsInd;
            @XmlAttribute(name = "ShipIndicator")
            protected String shipIndicator;

            /**
             * Gets the value of the deliveryEmailAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeliveryEmailAddress() {
                return deliveryEmailAddress;
            }

            /**
             * Sets the value of the deliveryEmailAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeliveryEmailAddress(String value) {
                this.deliveryEmailAddress = value;
            }

            /**
             * Gets the value of the deliveryTimeframe property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeliveryTimeframe() {
                return deliveryTimeframe;
            }

            /**
             * Sets the value of the deliveryTimeframe property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeliveryTimeframe(String value) {
                this.deliveryTimeframe = value;
            }

            /**
             * Gets the value of the giftCardAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGiftCardAmount() {
                return giftCardAmount;
            }

            /**
             * Sets the value of the giftCardAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGiftCardAmount(String value) {
                this.giftCardAmount = value;
            }

            /**
             * Gets the value of the giftCardCount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGiftCardCount() {
                return giftCardCount;
            }

            /**
             * Sets the value of the giftCardCount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGiftCardCount(String value) {
                this.giftCardCount = value;
            }

            /**
             * Gets the value of the giftCardCurr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGiftCardCurr() {
                return giftCardCurr;
            }

            /**
             * Sets the value of the giftCardCurr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGiftCardCurr(String value) {
                this.giftCardCurr = value;
            }

            /**
             * Gets the value of the preOrderDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreOrderDate() {
                return preOrderDate;
            }

            /**
             * Sets the value of the preOrderDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreOrderDate(String value) {
                this.preOrderDate = value;
            }

            /**
             * Gets the value of the preOrderPurchaseInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreOrderPurchaseInd() {
                return preOrderPurchaseInd;
            }

            /**
             * Sets the value of the preOrderPurchaseInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreOrderPurchaseInd(String value) {
                this.preOrderPurchaseInd = value;
            }

            /**
             * Gets the value of the reorderItemsInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReorderItemsInd() {
                return reorderItemsInd;
            }

            /**
             * Sets the value of the reorderItemsInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReorderItemsInd(String value) {
                this.reorderItemsInd = value;
            }

            /**
             * Gets the value of the shipIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShipIndicator() {
                return shipIndicator;
            }

            /**
             * Sets the value of the shipIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShipIndicator(String value) {
                this.shipIndicator = value;
            }

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
         *       &lt;attribute name="TdsReqPriorAuthMethod" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="TdsReqPriorAuthTimestamp" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="TdsReqPriorRef" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="TdsReqPriorAuthData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="TdsReqAppUrl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TdsRequestorPriorAuthenticationInfo {

            @XmlAttribute(name = "TdsReqPriorAuthMethod")
            protected String tdsReqPriorAuthMethod;
            @XmlAttribute(name = "TdsReqPriorAuthTimestamp")
            protected String tdsReqPriorAuthTimestamp;
            @XmlAttribute(name = "TdsReqPriorRef")
            protected String tdsReqPriorRef;
            @XmlAttribute(name = "TdsReqPriorAuthData")
            protected String tdsReqPriorAuthData;
            @XmlAttribute(name = "TdsReqAppUrl")
            protected String tdsReqAppUrl;

            /**
             * Gets the value of the tdsReqPriorAuthMethod property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTdsReqPriorAuthMethod() {
                return tdsReqPriorAuthMethod;
            }

            /**
             * Sets the value of the tdsReqPriorAuthMethod property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTdsReqPriorAuthMethod(String value) {
                this.tdsReqPriorAuthMethod = value;
            }

            /**
             * Gets the value of the tdsReqPriorAuthTimestamp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTdsReqPriorAuthTimestamp() {
                return tdsReqPriorAuthTimestamp;
            }

            /**
             * Sets the value of the tdsReqPriorAuthTimestamp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTdsReqPriorAuthTimestamp(String value) {
                this.tdsReqPriorAuthTimestamp = value;
            }

            /**
             * Gets the value of the tdsReqPriorRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTdsReqPriorRef() {
                return tdsReqPriorRef;
            }

            /**
             * Sets the value of the tdsReqPriorRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTdsReqPriorRef(String value) {
                this.tdsReqPriorRef = value;
            }

            /**
             * Gets the value of the tdsReqPriorAuthData property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTdsReqPriorAuthData() {
                return tdsReqPriorAuthData;
            }

            /**
             * Sets the value of the tdsReqPriorAuthData property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTdsReqPriorAuthData(String value) {
                this.tdsReqPriorAuthData = value;
            }

            /**
             * Gets the value of the tdsReqAppUrl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTdsReqAppUrl() {
                return tdsReqAppUrl;
            }

            /**
             * Sets the value of the tdsReqAppUrl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTdsReqAppUrl(String value) {
                this.tdsReqAppUrl = value;
            }

        }

    }

}
