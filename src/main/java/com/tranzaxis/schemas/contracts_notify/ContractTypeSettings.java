
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
import org.radixware.schemas.common.UserFunc;


/**
 * <p>Java class for ContractTypeSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractTypeSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotifyType" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}NotifyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NotifyOnAppTranFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *         &lt;element name="NotifyOnInvoiceFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *         &lt;element name="NotifyOnContractExpFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *         &lt;element name="NotifyOnContractTranFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *         &lt;element name="NotifyOnTokenExpFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *         &lt;element name="SendOtpFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IsNotifyTypesDefined" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractTypeSettings", propOrder = {
    "notifyType",
    "notifyOnAppTranFunc",
    "notifyOnInvoiceFunc",
    "notifyOnContractExpFunc",
    "notifyOnContractTranFunc",
    "notifyOnTokenExpFunc",
    "sendOtpFunc"
})
public class ContractTypeSettings {

    @XmlElement(name = "NotifyType")
    protected List<NotifyType> notifyType;
    @XmlElementRef(name = "NotifyOnAppTranFunc", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserFunc> notifyOnAppTranFunc;
    @XmlElementRef(name = "NotifyOnInvoiceFunc", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserFunc> notifyOnInvoiceFunc;
    @XmlElementRef(name = "NotifyOnContractExpFunc", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserFunc> notifyOnContractExpFunc;
    @XmlElementRef(name = "NotifyOnContractTranFunc", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserFunc> notifyOnContractTranFunc;
    @XmlElementRef(name = "NotifyOnTokenExpFunc", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserFunc> notifyOnTokenExpFunc;
    @XmlElementRef(name = "SendOtpFunc", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserFunc> sendOtpFunc;
    @XmlAttribute(name = "IsNotifyTypesDefined", required = true)
    protected boolean isNotifyTypesDefined;

    /**
     * Gets the value of the notifyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotifyType }
     * 
     * 
     */
    public List<NotifyType> getNotifyType() {
        if (notifyType == null) {
            notifyType = new ArrayList<NotifyType>();
        }
        return this.notifyType;
    }

    /**
     * Gets the value of the notifyOnAppTranFunc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public JAXBElement<UserFunc> getNotifyOnAppTranFunc() {
        return notifyOnAppTranFunc;
    }

    /**
     * Sets the value of the notifyOnAppTranFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public void setNotifyOnAppTranFunc(JAXBElement<UserFunc> value) {
        this.notifyOnAppTranFunc = value;
    }

    /**
     * Gets the value of the notifyOnInvoiceFunc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public JAXBElement<UserFunc> getNotifyOnInvoiceFunc() {
        return notifyOnInvoiceFunc;
    }

    /**
     * Sets the value of the notifyOnInvoiceFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public void setNotifyOnInvoiceFunc(JAXBElement<UserFunc> value) {
        this.notifyOnInvoiceFunc = value;
    }

    /**
     * Gets the value of the notifyOnContractExpFunc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public JAXBElement<UserFunc> getNotifyOnContractExpFunc() {
        return notifyOnContractExpFunc;
    }

    /**
     * Sets the value of the notifyOnContractExpFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public void setNotifyOnContractExpFunc(JAXBElement<UserFunc> value) {
        this.notifyOnContractExpFunc = value;
    }

    /**
     * Gets the value of the notifyOnContractTranFunc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public JAXBElement<UserFunc> getNotifyOnContractTranFunc() {
        return notifyOnContractTranFunc;
    }

    /**
     * Sets the value of the notifyOnContractTranFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public void setNotifyOnContractTranFunc(JAXBElement<UserFunc> value) {
        this.notifyOnContractTranFunc = value;
    }

    /**
     * Gets the value of the notifyOnTokenExpFunc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public JAXBElement<UserFunc> getNotifyOnTokenExpFunc() {
        return notifyOnTokenExpFunc;
    }

    /**
     * Sets the value of the notifyOnTokenExpFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public void setNotifyOnTokenExpFunc(JAXBElement<UserFunc> value) {
        this.notifyOnTokenExpFunc = value;
    }

    /**
     * Gets the value of the sendOtpFunc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public JAXBElement<UserFunc> getSendOtpFunc() {
        return sendOtpFunc;
    }

    /**
     * Sets the value of the sendOtpFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public void setSendOtpFunc(JAXBElement<UserFunc> value) {
        this.sendOtpFunc = value;
    }

    /**
     * Gets the value of the isNotifyTypesDefined property.
     * 
     */
    public boolean isIsNotifyTypesDefined() {
        return isNotifyTypesDefined;
    }

    /**
     * Sets the value of the isNotifyTypesDefined property.
     * 
     */
    public void setIsNotifyTypesDefined(boolean value) {
        this.isNotifyTypesDefined = value;
    }

}
