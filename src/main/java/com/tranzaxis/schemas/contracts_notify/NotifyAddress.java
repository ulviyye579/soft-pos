
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


/**
 * <p>Java class for NotifyAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ChannelKind" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}ChannelKind" minOccurs="0"/&gt;
 *         &lt;element name="DeviceName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="InheritedAddresses" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubscriptionIds" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}IntList" minOccurs="0"/&gt;
 *         &lt;element name="UndoSubscriptionIds" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}IntList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="IsActive" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyAddress", propOrder = {
    "address",
    "channelKind",
    "deviceName",
    "inheritedAddresses",
    "subscriptionIds",
    "undoSubscriptionIds"
})
public class NotifyAddress {

    @XmlElementRef(name = "Address", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address;
    @XmlElement(name = "ChannelKind")
    protected String channelKind;
    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "InheritedAddresses")
    protected List<String> inheritedAddresses;
    @XmlElementRef(name = "SubscriptionIds", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected List<JAXBElement<List<Long>>> subscriptionIds;
    @XmlElementRef(name = "UndoSubscriptionIds", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected List<JAXBElement<List<Long>>> undoSubscriptionIds;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "IsActive")
    protected Boolean isActive;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;
    @XmlAttribute(name = "Rid")
    protected String rid;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress(JAXBElement<String> value) {
        this.address = value;
    }

    /**
     * Gets the value of the channelKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelKind() {
        return channelKind;
    }

    /**
     * Sets the value of the channelKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelKind(String value) {
        this.channelKind = value;
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
     * Gets the value of the inheritedAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inheritedAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInheritedAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInheritedAddresses() {
        if (inheritedAddresses == null) {
            inheritedAddresses = new ArrayList<String>();
        }
        return this.inheritedAddresses;
    }

    /**
     * Gets the value of the subscriptionIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * 
     * 
     */
    public List<JAXBElement<List<Long>>> getSubscriptionIds() {
        if (subscriptionIds == null) {
            subscriptionIds = new ArrayList<JAXBElement<List<Long>>>();
        }
        return this.subscriptionIds;
    }

    /**
     * Gets the value of the undoSubscriptionIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undoSubscriptionIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndoSubscriptionIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * 
     * 
     */
    public List<JAXBElement<List<Long>>> getUndoSubscriptionIds() {
        if (undoSubscriptionIds == null) {
            undoSubscriptionIds = new ArrayList<JAXBElement<List<Long>>>();
        }
        return this.undoSubscriptionIds;
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
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
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
