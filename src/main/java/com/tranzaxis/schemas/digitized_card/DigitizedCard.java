
package com.tranzaxis.schemas.digitized_card;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DigitizedCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigitizedCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MainCardId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ActivationTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CloseTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="DeviceLangId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="DeviceName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="DevicePhoneNumber" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="DeviceRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="DeviceType" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizationDeviceType" minOccurs="0"/&gt;
 *         &lt;element name="Dpan" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Relinkable" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="PanSource" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizationPanSource" minOccurs="0"/&gt;
 *         &lt;element name="ProfileId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ProfileRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ProvisionTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="RequestorRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizedCardStatus" minOccurs="0"/&gt;
 *         &lt;element name="StoragePlace" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizationStoragePlace" minOccurs="0"/&gt;
 *         &lt;element name="StorageType" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizationStorageType" minOccurs="0"/&gt;
 *         &lt;element name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="UsageCardOnFile" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="UsageContactless" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="UsageEcommerce" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="WalletAccountRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="WalletRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ChVerificationStatus" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizationChVerificationStatus" minOccurs="0"/&gt;
 *         &lt;element name="LastChVerificationStatusChangeTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="BindingDevice" type="{http://schemas.tranzaxis.com/digitized-card.xsd}BindingDeviceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitizedCard", propOrder = {
    "mainCardId",
    "title",
    "activationTime",
    "closeTime",
    "deviceLangId",
    "deviceName",
    "devicePhoneNumber",
    "deviceRid",
    "deviceType",
    "dpan",
    "relinkable",
    "notes",
    "panSource",
    "profileId",
    "profileRid",
    "provisionTime",
    "requestorRid",
    "status",
    "storagePlace",
    "storageType",
    "rid",
    "usageCardOnFile",
    "usageContactless",
    "usageEcommerce",
    "walletAccountRid",
    "walletRid",
    "chVerificationStatus",
    "lastChVerificationStatusChangeTime",
    "bindingDevice"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.tokens_admin.Card.DigitizedCards.DigitizedCard.class,
    com.tranzaxis.schemas.tran_common.CustInfoRs.Item.Attribute.DigitizedCards.DigitizedCard.class
})
public class DigitizedCard {

    @XmlElement(name = "MainCardId")
    protected Long mainCardId;
    @XmlElementRef(name = "Title", namespace = "http://schemas.tranzaxis.com/digitized-card.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "ActivationTime", namespace = "http://schemas.tranzaxis.com/digitized-card.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> activationTime;
    @XmlElementRef(name = "CloseTime", namespace = "http://schemas.tranzaxis.com/digitized-card.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> closeTime;
    @XmlElement(name = "DeviceLangId")
    protected Long deviceLangId;
    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "DevicePhoneNumber")
    protected String devicePhoneNumber;
    @XmlElement(name = "DeviceRid")
    protected String deviceRid;
    @XmlElement(name = "DeviceType")
    protected Long deviceType;
    @XmlElement(name = "Dpan")
    protected String dpan;
    @XmlElement(name = "Relinkable")
    protected Boolean relinkable;
    @XmlElementRef(name = "Notes", namespace = "http://schemas.tranzaxis.com/digitized-card.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElement(name = "PanSource")
    protected Long panSource;
    @XmlElement(name = "ProfileId")
    protected Long profileId;
    @XmlElement(name = "ProfileRid")
    protected String profileRid;
    @XmlElementRef(name = "ProvisionTime", namespace = "http://schemas.tranzaxis.com/digitized-card.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> provisionTime;
    @XmlElement(name = "RequestorRid")
    protected String requestorRid;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "StoragePlace")
    protected Long storagePlace;
    @XmlElement(name = "StorageType")
    protected Long storageType;
    @XmlElement(name = "Rid")
    protected String rid;
    @XmlElement(name = "UsageCardOnFile")
    protected Boolean usageCardOnFile;
    @XmlElement(name = "UsageContactless")
    protected Boolean usageContactless;
    @XmlElement(name = "UsageEcommerce")
    protected Boolean usageEcommerce;
    @XmlElement(name = "WalletAccountRid")
    protected String walletAccountRid;
    @XmlElement(name = "WalletRid")
    protected String walletRid;
    @XmlElementRef(name = "ChVerificationStatus", namespace = "http://schemas.tranzaxis.com/digitized-card.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chVerificationStatus;
    @XmlElementRef(name = "LastChVerificationStatusChangeTime", namespace = "http://schemas.tranzaxis.com/digitized-card.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastChVerificationStatusChangeTime;
    @XmlElement(name = "BindingDevice")
    protected List<BindingDeviceType> bindingDevice;
    @XmlAttribute(name = "Id")
    protected Long id;

    /**
     * Gets the value of the mainCardId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMainCardId() {
        return mainCardId;
    }

    /**
     * Sets the value of the mainCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMainCardId(Long value) {
        this.mainCardId = value;
    }

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
     * Gets the value of the deviceLangId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeviceLangId() {
        return deviceLangId;
    }

    /**
     * Sets the value of the deviceLangId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeviceLangId(Long value) {
        this.deviceLangId = value;
    }

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the devicePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevicePhoneNumber() {
        return devicePhoneNumber;
    }

    /**
     * Sets the value of the devicePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevicePhoneNumber(String value) {
        this.devicePhoneNumber = value;
    }

    /**
     * Gets the value of the deviceRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceRid() {
        return deviceRid;
    }

    /**
     * Sets the value of the deviceRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceRid(String value) {
        this.deviceRid = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeviceType(Long value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the dpan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDpan() {
        return dpan;
    }

    /**
     * Sets the value of the dpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDpan(String value) {
        this.dpan = value;
    }

    /**
     * Gets the value of the relinkable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelinkable() {
        return relinkable;
    }

    /**
     * Sets the value of the relinkable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelinkable(Boolean value) {
        this.relinkable = value;
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
     * Gets the value of the profileId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProfileId(Long value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the profileRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileRid() {
        return profileRid;
    }

    /**
     * Sets the value of the profileRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileRid(String value) {
        this.profileRid = value;
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
     * Gets the value of the chVerificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChVerificationStatus() {
        return chVerificationStatus;
    }

    /**
     * Sets the value of the chVerificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChVerificationStatus(JAXBElement<String> value) {
        this.chVerificationStatus = value;
    }

    /**
     * Gets the value of the lastChVerificationStatusChangeTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastChVerificationStatusChangeTime() {
        return lastChVerificationStatusChangeTime;
    }

    /**
     * Sets the value of the lastChVerificationStatusChangeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastChVerificationStatusChangeTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastChVerificationStatusChangeTime = value;
    }

    /**
     * Gets the value of the bindingDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bindingDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBindingDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BindingDeviceType }
     * 
     * 
     */
    public List<BindingDeviceType> getBindingDevice() {
        if (bindingDevice == null) {
            bindingDevice = new ArrayList<BindingDeviceType>();
        }
        return this.bindingDevice;
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

}
