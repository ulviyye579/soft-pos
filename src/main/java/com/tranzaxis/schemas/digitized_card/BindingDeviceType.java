
package com.tranzaxis.schemas.digitized_card;

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
 * <p>Java class for BindingDeviceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BindingDeviceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BindingRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="BindingStatus" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizedCardDeviceBindingStatus" minOccurs="0"/&gt;
 *         &lt;element name="DeviceType" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizationDeviceType" minOccurs="0"/&gt;
 *         &lt;element name="DeviceLangId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="DeviceRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="DeviceNumber" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="DeviceName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="UserRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="UserAppType" type="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizationUserAppType" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CreateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActivateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CloseTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BindingDeviceType", propOrder = {
    "bindingRid",
    "bindingStatus",
    "deviceType",
    "deviceLangId",
    "deviceRid",
    "deviceNumber",
    "deviceName",
    "userRid",
    "userAppType",
    "notes",
    "createTime",
    "activateTime",
    "closeTime"
})
public class BindingDeviceType {

    @XmlElement(name = "BindingRid")
    protected String bindingRid;
    @XmlElement(name = "BindingStatus")
    protected String bindingStatus;
    @XmlElement(name = "DeviceType")
    protected Long deviceType;
    @XmlElement(name = "DeviceLangId")
    protected Long deviceLangId;
    @XmlElement(name = "DeviceRid")
    protected String deviceRid;
    @XmlElement(name = "DeviceNumber")
    protected String deviceNumber;
    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "UserRid")
    protected String userRid;
    @XmlElement(name = "UserAppType")
    protected String userAppType;
    @XmlElementRef(name = "Notes", namespace = "http://schemas.tranzaxis.com/digitized-card.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElement(name = "CreateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "ActivateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activateTime;
    @XmlElement(name = "CloseTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closeTime;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;

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
     * Gets the value of the deviceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceNumber() {
        return deviceNumber;
    }

    /**
     * Sets the value of the deviceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceNumber(String value) {
        this.deviceNumber = value;
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
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the activateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivateTime() {
        return activateTime;
    }

    /**
     * Sets the value of the activateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivateTime(XMLGregorianCalendar value) {
        this.activateTime = value;
    }

    /**
     * Gets the value of the closeTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseTime() {
        return closeTime;
    }

    /**
     * Sets the value of the closeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseTime(XMLGregorianCalendar value) {
        this.closeTime = value;
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

}
