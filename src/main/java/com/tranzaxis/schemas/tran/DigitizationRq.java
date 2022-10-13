
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DigitizationRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigitizationRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="DeviceInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Name" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Type" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizationDeviceType" /&gt;
 *                 &lt;attribute name="LangId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="LangCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PhoneNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="BindingIndex" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="BindingRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="BindingStatus" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizedCardDeviceBindingStatus" /&gt;
 *                 &lt;attribute name="OrigType" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizationDeviceType" /&gt;
 *                 &lt;attribute name="OrigRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RiskInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="WpDigitizationRecommendationReasons" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="WpDigitizationRecommendationReason" type="{http://schemas.tranzaxis.com/tran.xsd}DigitizationEligibilityReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="HighValueCustomer" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="ProvisioningScore" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="ProvisioningDecision" type="{http://schemas.tranzaxis.com/tran.xsd}DigitizationProvisioningDecision" /&gt;
 *                 &lt;attribute name="WpDigitizationRecommendation" type="{http://schemas.tranzaxis.com/tran.xsd}DigitizationEligibilityDecision" /&gt;
 *                 &lt;attribute name="WpDigitizationRecommendationVersion" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="WpDeviceScore" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="WpAccountScore" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ActivationTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CloseTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ProvisionTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ActivationCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ActivationCodeExpTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="ActivationMethod" type="{http://schemas.tranzaxis.com/tran.xsd}DigitizationActivationMethod" /&gt;
 *       &lt;attribute name="ActivationMaskedAddress" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ActivationAddressRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="RequestorRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Status" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizedCardStatus" /&gt;
 *       &lt;attribute name="WalletRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="WalletAccountRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="StoragePlace" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizationStoragePlace" /&gt;
 *       &lt;attribute name="StorageType" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizationStorageType" /&gt;
 *       &lt;attribute name="PanSource" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizationPanSource" /&gt;
 *       &lt;attribute name="UsageCardOnFile" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="UsageContactless" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="UsageEcommerce" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="TranTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="UserRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="UserAppType" type="{http://schemas.tranzaxis.com/tran.xsd}DigitizationUserAppType" /&gt;
 *       &lt;attribute name="AuthFactorA" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="AuthFactorB" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="AuthAmount" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="OrigDpan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="OrigRequestorRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="OrigDigitizedCardRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="OrigStoragePlace" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizationStoragePlace" /&gt;
 *       &lt;attribute name="ChVerificationStatus" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizationChVerificationStatus" /&gt;
 *       &lt;attribute name="DesignExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TermsConditions" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TokenAssuranceLevel" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitizationRq", propOrder = {
    "deviceInfo",
    "riskInfo",
    "activationTime",
    "closeTime",
    "provisionTime"
})
public class DigitizationRq {

    @XmlElement(name = "DeviceInfo")
    protected DigitizationRq.DeviceInfo deviceInfo;
    @XmlElement(name = "RiskInfo")
    protected DigitizationRq.RiskInfo riskInfo;
    @XmlElementRef(name = "ActivationTime", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> activationTime;
    @XmlElementRef(name = "CloseTime", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> closeTime;
    @XmlElementRef(name = "ProvisionTime", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> provisionTime;
    @XmlAttribute(name = "Title")
    protected String title;
    @XmlAttribute(name = "ActivationCode")
    protected String activationCode;
    @XmlAttribute(name = "ActivationCodeExpTime")
    protected XMLGregorianCalendar activationCodeExpTime;
    @XmlAttribute(name = "ActivationMethod")
    protected String activationMethod;
    @XmlAttribute(name = "ActivationMaskedAddress")
    protected String activationMaskedAddress;
    @XmlAttribute(name = "ActivationAddressRid")
    protected String activationAddressRid;
    @XmlAttribute(name = "RequestorRid")
    protected String requestorRid;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "WalletRid")
    protected String walletRid;
    @XmlAttribute(name = "WalletAccountRid")
    protected String walletAccountRid;
    @XmlAttribute(name = "StoragePlace")
    protected Long storagePlace;
    @XmlAttribute(name = "StorageType")
    protected Long storageType;
    @XmlAttribute(name = "PanSource")
    protected Long panSource;
    @XmlAttribute(name = "UsageCardOnFile")
    protected Boolean usageCardOnFile;
    @XmlAttribute(name = "UsageContactless")
    protected Boolean usageContactless;
    @XmlAttribute(name = "UsageEcommerce")
    protected Boolean usageEcommerce;
    @XmlAttribute(name = "TranTime")
    protected XMLGregorianCalendar tranTime;
    @XmlAttribute(name = "UserRid")
    protected String userRid;
    @XmlAttribute(name = "UserAppType")
    protected String userAppType;
    @XmlAttribute(name = "AuthFactorA")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] authFactorA;
    @XmlAttribute(name = "AuthFactorB")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] authFactorB;
    @XmlAttribute(name = "AuthAmount")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] authAmount;
    @XmlAttribute(name = "OrigDpan")
    protected String origDpan;
    @XmlAttribute(name = "OrigRequestorRid")
    protected String origRequestorRid;
    @XmlAttribute(name = "OrigDigitizedCardRid")
    protected String origDigitizedCardRid;
    @XmlAttribute(name = "OrigStoragePlace")
    protected Long origStoragePlace;
    @XmlAttribute(name = "ChVerificationStatus")
    protected String chVerificationStatus;
    @XmlAttribute(name = "DesignExtRid")
    protected String designExtRid;
    @XmlAttribute(name = "TermsConditions")
    protected String termsConditions;
    @XmlAttribute(name = "TokenAssuranceLevel")
    protected String tokenAssuranceLevel;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;

    /**
     * Gets the value of the deviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DigitizationRq.DeviceInfo }
     *     
     */
    public DigitizationRq.DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * Sets the value of the deviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitizationRq.DeviceInfo }
     *     
     */
    public void setDeviceInfo(DigitizationRq.DeviceInfo value) {
        this.deviceInfo = value;
    }

    /**
     * Gets the value of the riskInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DigitizationRq.RiskInfo }
     *     
     */
    public DigitizationRq.RiskInfo getRiskInfo() {
        return riskInfo;
    }

    /**
     * Sets the value of the riskInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitizationRq.RiskInfo }
     *     
     */
    public void setRiskInfo(DigitizationRq.RiskInfo value) {
        this.riskInfo = value;
    }

    /**
     * Gets the value of the activationTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActivationTime() {
        return activationTime;
    }

    /**
     * Sets the value of the activationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActivationTime(JAXBElement<XMLGregorianCalendar> value) {
        this.activationTime = value;
    }

    /**
     * Gets the value of the closeTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCloseTime() {
        return closeTime;
    }

    /**
     * Sets the value of the closeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCloseTime(JAXBElement<XMLGregorianCalendar> value) {
        this.closeTime = value;
    }

    /**
     * Gets the value of the provisionTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProvisionTime() {
        return provisionTime;
    }

    /**
     * Sets the value of the provisionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProvisionTime(JAXBElement<XMLGregorianCalendar> value) {
        this.provisionTime = value;
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
     * Gets the value of the activationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationCode() {
        return activationCode;
    }

    /**
     * Sets the value of the activationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationCode(String value) {
        this.activationCode = value;
    }

    /**
     * Gets the value of the activationCodeExpTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivationCodeExpTime() {
        return activationCodeExpTime;
    }

    /**
     * Sets the value of the activationCodeExpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivationCodeExpTime(XMLGregorianCalendar value) {
        this.activationCodeExpTime = value;
    }

    /**
     * Gets the value of the activationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationMethod() {
        return activationMethod;
    }

    /**
     * Sets the value of the activationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationMethod(String value) {
        this.activationMethod = value;
    }

    /**
     * Gets the value of the activationMaskedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationMaskedAddress() {
        return activationMaskedAddress;
    }

    /**
     * Sets the value of the activationMaskedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationMaskedAddress(String value) {
        this.activationMaskedAddress = value;
    }

    /**
     * Gets the value of the activationAddressRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationAddressRid() {
        return activationAddressRid;
    }

    /**
     * Sets the value of the activationAddressRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationAddressRid(String value) {
        this.activationAddressRid = value;
    }

    /**
     * Gets the value of the requestorRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorRid() {
        return requestorRid;
    }

    /**
     * Sets the value of the requestorRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorRid(String value) {
        this.requestorRid = value;
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
     * Gets the value of the walletRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletRid() {
        return walletRid;
    }

    /**
     * Sets the value of the walletRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletRid(String value) {
        this.walletRid = value;
    }

    /**
     * Gets the value of the walletAccountRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletAccountRid() {
        return walletAccountRid;
    }

    /**
     * Sets the value of the walletAccountRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletAccountRid(String value) {
        this.walletAccountRid = value;
    }

    /**
     * Gets the value of the storagePlace property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStoragePlace() {
        return storagePlace;
    }

    /**
     * Sets the value of the storagePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStoragePlace(Long value) {
        this.storagePlace = value;
    }

    /**
     * Gets the value of the storageType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStorageType() {
        return storageType;
    }

    /**
     * Sets the value of the storageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStorageType(Long value) {
        this.storageType = value;
    }

    /**
     * Gets the value of the panSource property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPanSource() {
        return panSource;
    }

    /**
     * Sets the value of the panSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPanSource(Long value) {
        this.panSource = value;
    }

    /**
     * Gets the value of the usageCardOnFile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsageCardOnFile() {
        return usageCardOnFile;
    }

    /**
     * Sets the value of the usageCardOnFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsageCardOnFile(Boolean value) {
        this.usageCardOnFile = value;
    }

    /**
     * Gets the value of the usageContactless property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsageContactless() {
        return usageContactless;
    }

    /**
     * Sets the value of the usageContactless property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsageContactless(Boolean value) {
        this.usageContactless = value;
    }

    /**
     * Gets the value of the usageEcommerce property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsageEcommerce() {
        return usageEcommerce;
    }

    /**
     * Sets the value of the usageEcommerce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsageEcommerce(Boolean value) {
        this.usageEcommerce = value;
    }

    /**
     * Gets the value of the tranTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranTime() {
        return tranTime;
    }

    /**
     * Sets the value of the tranTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranTime(XMLGregorianCalendar value) {
        this.tranTime = value;
    }

    /**
     * Gets the value of the userRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRid() {
        return userRid;
    }

    /**
     * Sets the value of the userRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRid(String value) {
        this.userRid = value;
    }

    /**
     * Gets the value of the userAppType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAppType() {
        return userAppType;
    }

    /**
     * Sets the value of the userAppType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAppType(String value) {
        this.userAppType = value;
    }

    /**
     * Gets the value of the authFactorA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAuthFactorA() {
        return authFactorA;
    }

    /**
     * Sets the value of the authFactorA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthFactorA(byte[] value) {
        this.authFactorA = value;
    }

    /**
     * Gets the value of the authFactorB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAuthFactorB() {
        return authFactorB;
    }

    /**
     * Sets the value of the authFactorB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthFactorB(byte[] value) {
        this.authFactorB = value;
    }

    /**
     * Gets the value of the authAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAuthAmount() {
        return authAmount;
    }

    /**
     * Sets the value of the authAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthAmount(byte[] value) {
        this.authAmount = value;
    }

    /**
     * Gets the value of the origDpan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigDpan() {
        return origDpan;
    }

    /**
     * Sets the value of the origDpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigDpan(String value) {
        this.origDpan = value;
    }

    /**
     * Gets the value of the origRequestorRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigRequestorRid() {
        return origRequestorRid;
    }

    /**
     * Sets the value of the origRequestorRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigRequestorRid(String value) {
        this.origRequestorRid = value;
    }

    /**
     * Gets the value of the origDigitizedCardRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigDigitizedCardRid() {
        return origDigitizedCardRid;
    }

    /**
     * Sets the value of the origDigitizedCardRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigDigitizedCardRid(String value) {
        this.origDigitizedCardRid = value;
    }

    /**
     * Gets the value of the origStoragePlace property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrigStoragePlace() {
        return origStoragePlace;
    }

    /**
     * Sets the value of the origStoragePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrigStoragePlace(Long value) {
        this.origStoragePlace = value;
    }

    /**
     * Gets the value of the chVerificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChVerificationStatus() {
        return chVerificationStatus;
    }

    /**
     * Sets the value of the chVerificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChVerificationStatus(String value) {
        this.chVerificationStatus = value;
    }

    /**
     * Gets the value of the designExtRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignExtRid() {
        return designExtRid;
    }

    /**
     * Sets the value of the designExtRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignExtRid(String value) {
        this.designExtRid = value;
    }

    /**
     * Gets the value of the termsConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsConditions() {
        return termsConditions;
    }

    /**
     * Sets the value of the termsConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsConditions(String value) {
        this.termsConditions = value;
    }

    /**
     * Gets the value of the tokenAssuranceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenAssuranceLevel() {
        return tokenAssuranceLevel;
    }

    /**
     * Sets the value of the tokenAssuranceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenAssuranceLevel(String value) {
        this.tokenAssuranceLevel = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Name" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Type" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizationDeviceType" /&gt;
     *       &lt;attribute name="LangId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="LangCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PhoneNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="BindingIndex" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="BindingRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="BindingStatus" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizedCardDeviceBindingStatus" /&gt;
     *       &lt;attribute name="OrigType" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizationDeviceType" /&gt;
     *       &lt;attribute name="OrigRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DeviceInfo {

        @XmlAttribute(name = "Rid")
        protected String rid;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "Type")
        protected Long type;
        @XmlAttribute(name = "LangId")
        protected Long langId;
        @XmlAttribute(name = "LangCode")
        protected String langCode;
        @XmlAttribute(name = "PhoneNumber")
        protected String phoneNumber;
        @XmlAttribute(name = "BindingIndex")
        protected Long bindingIndex;
        @XmlAttribute(name = "BindingRid")
        protected String bindingRid;
        @XmlAttribute(name = "BindingStatus")
        protected String bindingStatus;
        @XmlAttribute(name = "OrigType")
        protected Long origType;
        @XmlAttribute(name = "OrigRid")
        protected String origRid;

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
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setType(Long value) {
            this.type = value;
        }

        /**
         * Gets the value of the langId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getLangId() {
            return langId;
        }

        /**
         * Sets the value of the langId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setLangId(Long value) {
            this.langId = value;
        }

        /**
         * Gets the value of the langCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLangCode() {
            return langCode;
        }

        /**
         * Sets the value of the langCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLangCode(String value) {
            this.langCode = value;
        }

        /**
         * Gets the value of the phoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Sets the value of the phoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneNumber(String value) {
            this.phoneNumber = value;
        }

        /**
         * Gets the value of the bindingIndex property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getBindingIndex() {
            return bindingIndex;
        }

        /**
         * Sets the value of the bindingIndex property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setBindingIndex(Long value) {
            this.bindingIndex = value;
        }

        /**
         * Gets the value of the bindingRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBindingRid() {
            return bindingRid;
        }

        /**
         * Sets the value of the bindingRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBindingRid(String value) {
            this.bindingRid = value;
        }

        /**
         * Gets the value of the bindingStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBindingStatus() {
            return bindingStatus;
        }

        /**
         * Sets the value of the bindingStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBindingStatus(String value) {
            this.bindingStatus = value;
        }

        /**
         * Gets the value of the origType property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOrigType() {
            return origType;
        }

        /**
         * Sets the value of the origType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOrigType(Long value) {
            this.origType = value;
        }

        /**
         * Gets the value of the origRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigRid() {
            return origRid;
        }

        /**
         * Sets the value of the origRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigRid(String value) {
            this.origRid = value;
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
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="WpDigitizationRecommendationReasons" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="WpDigitizationRecommendationReason" type="{http://schemas.tranzaxis.com/tran.xsd}DigitizationEligibilityReason" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="HighValueCustomer" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="ProvisioningScore" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="ProvisioningDecision" type="{http://schemas.tranzaxis.com/tran.xsd}DigitizationProvisioningDecision" /&gt;
     *       &lt;attribute name="WpDigitizationRecommendation" type="{http://schemas.tranzaxis.com/tran.xsd}DigitizationEligibilityDecision" /&gt;
     *       &lt;attribute name="WpDigitizationRecommendationVersion" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="WpDeviceScore" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="WpAccountScore" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "wpDigitizationRecommendationReasons"
    })
    public static class RiskInfo {

        @XmlElement(name = "WpDigitizationRecommendationReasons")
        protected DigitizationRq.RiskInfo.WpDigitizationRecommendationReasons wpDigitizationRecommendationReasons;
        @XmlAttribute(name = "HighValueCustomer")
        protected Boolean highValueCustomer;
        @XmlAttribute(name = "ProvisioningScore")
        protected Long provisioningScore;
        @XmlAttribute(name = "ProvisioningDecision")
        protected Long provisioningDecision;
        @XmlAttribute(name = "WpDigitizationRecommendation")
        protected Long wpDigitizationRecommendation;
        @XmlAttribute(name = "WpDigitizationRecommendationVersion")
        protected String wpDigitizationRecommendationVersion;
        @XmlAttribute(name = "WpDeviceScore")
        protected String wpDeviceScore;
        @XmlAttribute(name = "WpAccountScore")
        protected String wpAccountScore;

        /**
         * Gets the value of the wpDigitizationRecommendationReasons property.
         * 
         * @return
         *     possible object is
         *     {@link DigitizationRq.RiskInfo.WpDigitizationRecommendationReasons }
         *     
         */
        public DigitizationRq.RiskInfo.WpDigitizationRecommendationReasons getWpDigitizationRecommendationReasons() {
            return wpDigitizationRecommendationReasons;
        }

        /**
         * Sets the value of the wpDigitizationRecommendationReasons property.
         * 
         * @param value
         *     allowed object is
         *     {@link DigitizationRq.RiskInfo.WpDigitizationRecommendationReasons }
         *     
         */
        public void setWpDigitizationRecommendationReasons(DigitizationRq.RiskInfo.WpDigitizationRecommendationReasons value) {
            this.wpDigitizationRecommendationReasons = value;
        }

        /**
         * Gets the value of the highValueCustomer property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHighValueCustomer() {
            return highValueCustomer;
        }

        /**
         * Sets the value of the highValueCustomer property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHighValueCustomer(Boolean value) {
            this.highValueCustomer = value;
        }

        /**
         * Gets the value of the provisioningScore property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getProvisioningScore() {
            return provisioningScore;
        }

        /**
         * Sets the value of the provisioningScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setProvisioningScore(Long value) {
            this.provisioningScore = value;
        }

        /**
         * Gets the value of the provisioningDecision property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getProvisioningDecision() {
            return provisioningDecision;
        }

        /**
         * Sets the value of the provisioningDecision property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setProvisioningDecision(Long value) {
            this.provisioningDecision = value;
        }

        /**
         * Gets the value of the wpDigitizationRecommendation property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getWpDigitizationRecommendation() {
            return wpDigitizationRecommendation;
        }

        /**
         * Sets the value of the wpDigitizationRecommendation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setWpDigitizationRecommendation(Long value) {
            this.wpDigitizationRecommendation = value;
        }

        /**
         * Gets the value of the wpDigitizationRecommendationVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWpDigitizationRecommendationVersion() {
            return wpDigitizationRecommendationVersion;
        }

        /**
         * Sets the value of the wpDigitizationRecommendationVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWpDigitizationRecommendationVersion(String value) {
            this.wpDigitizationRecommendationVersion = value;
        }

        /**
         * Gets the value of the wpDeviceScore property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWpDeviceScore() {
            return wpDeviceScore;
        }

        /**
         * Sets the value of the wpDeviceScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWpDeviceScore(String value) {
            this.wpDeviceScore = value;
        }

        /**
         * Gets the value of the wpAccountScore property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWpAccountScore() {
            return wpAccountScore;
        }

        /**
         * Sets the value of the wpAccountScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWpAccountScore(String value) {
            this.wpAccountScore = value;
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
         *         &lt;element name="WpDigitizationRecommendationReason" type="{http://schemas.tranzaxis.com/tran.xsd}DigitizationEligibilityReason" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "wpDigitizationRecommendationReason"
        })
        public static class WpDigitizationRecommendationReasons {

            @XmlElement(name = "WpDigitizationRecommendationReason", type = Long.class)
            protected List<Long> wpDigitizationRecommendationReason;

            /**
             * Gets the value of the wpDigitizationRecommendationReason property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wpDigitizationRecommendationReason property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWpDigitizationRecommendationReason().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Long }
             * 
             * 
             */
            public List<Long> getWpDigitizationRecommendationReason() {
                if (wpDigitizationRecommendationReason == null) {
                    wpDigitizationRecommendationReason = new ArrayList<Long>();
                }
                return this.wpDigitizationRecommendationReason;
            }

        }

    }

}
