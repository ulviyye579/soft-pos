
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.BusinessPeriod;
import com.tranzaxis.schemas.common_types.ContactAddress;


/**
 * <p>Java class for ContractStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractStatement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChannelId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ChannelRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="ValidFrom" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ValidTo" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryAddress" type="{http://schemas.tranzaxis.com/common-types.xsd}ContactAddress" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryAddressTypeId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryAddressTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LanguageCode" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CommunicationLocale" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Offset" type="{http://schemas.tranzaxis.com/common-types.xsd}BusinessPeriod" minOccurs="0"/&gt;
 *         &lt;element name="CalendarId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="CalendarRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="KeyDayKind" type="{http://schemas.tranzaxis.com/tran-common.xsd}CKeyDayKind" minOccurs="0"/&gt;
 *         &lt;element name="Inherit" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractStatement", propOrder = {
    "channelId",
    "channelRid",
    "active",
    "validFrom",
    "validTo",
    "deliveryAddress",
    "deliveryAddressTypeId",
    "deliveryAddressTypeRid",
    "languageCode",
    "communicationLocale",
    "offset",
    "calendarId",
    "calendarRid",
    "keyDayKind",
    "inherit"
})
public class ContractStatement {

    @XmlElementRef(name = "ChannelId", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> channelId;
    @XmlElementRef(name = "ChannelRid", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> channelRid;
    @XmlElementRef(name = "Active", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> active;
    @XmlElementRef(name = "ValidFrom", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> validFrom;
    @XmlElementRef(name = "ValidTo", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> validTo;
    @XmlElementRef(name = "DeliveryAddress", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ContactAddress> deliveryAddress;
    @XmlElementRef(name = "DeliveryAddressTypeId", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> deliveryAddressTypeId;
    @XmlElementRef(name = "DeliveryAddressTypeRid", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryAddressTypeRid;
    @XmlElementRef(name = "LanguageCode", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> languageCode;
    @XmlElementRef(name = "CommunicationLocale", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> communicationLocale;
    @XmlElementRef(name = "Offset", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BusinessPeriod> offset;
    @XmlElementRef(name = "CalendarId", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> calendarId;
    @XmlElementRef(name = "CalendarRid", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calendarRid;
    @XmlElementRef(name = "KeyDayKind", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> keyDayKind;
    @XmlElementRef(name = "Inherit", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> inherit;
    @XmlAttribute(name = "ContractId")
    protected Long contractId;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "Rid")
    protected String rid;

    /**
     * Gets the value of the channelId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setChannelId(JAXBElement<Long> value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the channelRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChannelRid() {
        return channelRid;
    }

    /**
     * Sets the value of the channelRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChannelRid(JAXBElement<String> value) {
        this.channelRid = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setActive(JAXBElement<Boolean> value) {
        this.active = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setValidFrom(JAXBElement<XMLGregorianCalendar> value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setValidTo(JAXBElement<XMLGregorianCalendar> value) {
        this.validTo = value;
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     *     
     */
    public JAXBElement<ContactAddress> getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactAddress }{@code >}
     *     
     */
    public void setDeliveryAddress(JAXBElement<ContactAddress> value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the deliveryAddressTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDeliveryAddressTypeId() {
        return deliveryAddressTypeId;
    }

    /**
     * Sets the value of the deliveryAddressTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDeliveryAddressTypeId(JAXBElement<Long> value) {
        this.deliveryAddressTypeId = value;
    }

    /**
     * Gets the value of the deliveryAddressTypeRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryAddressTypeRid() {
        return deliveryAddressTypeRid;
    }

    /**
     * Sets the value of the deliveryAddressTypeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryAddressTypeRid(JAXBElement<String> value) {
        this.deliveryAddressTypeRid = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguageCode(JAXBElement<String> value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the communicationLocale property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommunicationLocale() {
        return communicationLocale;
    }

    /**
     * Sets the value of the communicationLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommunicationLocale(JAXBElement<String> value) {
        this.communicationLocale = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BusinessPeriod }{@code >}
     *     
     */
    public JAXBElement<BusinessPeriod> getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BusinessPeriod }{@code >}
     *     
     */
    public void setOffset(JAXBElement<BusinessPeriod> value) {
        this.offset = value;
    }

    /**
     * Gets the value of the calendarId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCalendarId() {
        return calendarId;
    }

    /**
     * Sets the value of the calendarId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCalendarId(JAXBElement<Long> value) {
        this.calendarId = value;
    }

    /**
     * Gets the value of the calendarRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalendarRid() {
        return calendarRid;
    }

    /**
     * Sets the value of the calendarRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalendarRid(JAXBElement<String> value) {
        this.calendarRid = value;
    }

    /**
     * Gets the value of the keyDayKind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeyDayKind() {
        return keyDayKind;
    }

    /**
     * Sets the value of the keyDayKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeyDayKind(JAXBElement<String> value) {
        this.keyDayKind = value;
    }

    /**
     * Gets the value of the inherit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInherit() {
        return inherit;
    }

    /**
     * Sets the value of the inherit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInherit(JAXBElement<Boolean> value) {
        this.inherit = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractId(Long value) {
        this.contractId = value;
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
