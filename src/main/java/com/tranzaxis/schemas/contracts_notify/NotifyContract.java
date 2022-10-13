
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
 * <p>Java class for NotifyContract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyContract"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotifySubscription" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}NotifySubscription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NotifyAddress" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}NotifyAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Emails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Value" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}StrList" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SmsPhones" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Value" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}StrList" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="InstId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyContract", propOrder = {
    "notifySubscription",
    "notifyAddress",
    "emails",
    "smsPhones"
})
public class NotifyContract {

    @XmlElement(name = "NotifySubscription")
    protected List<NotifySubscription> notifySubscription;
    @XmlElement(name = "NotifyAddress")
    protected List<NotifyAddress> notifyAddress;
    @XmlElementRef(name = "Emails", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NotifyContract.Emails> emails;
    @XmlElementRef(name = "SmsPhones", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NotifyContract.SmsPhones> smsPhones;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "Rid")
    protected String rid;
    @XmlAttribute(name = "InstId")
    protected Long instId;

    /**
     * Gets the value of the notifySubscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifySubscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifySubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotifySubscription }
     * 
     * 
     */
    public List<NotifySubscription> getNotifySubscription() {
        if (notifySubscription == null) {
            notifySubscription = new ArrayList<NotifySubscription>();
        }
        return this.notifySubscription;
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
     * Gets the value of the emails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NotifyContract.Emails }{@code >}
     *     
     */
    public JAXBElement<NotifyContract.Emails> getEmails() {
        return emails;
    }

    /**
     * Sets the value of the emails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NotifyContract.Emails }{@code >}
     *     
     */
    public void setEmails(JAXBElement<NotifyContract.Emails> value) {
        this.emails = value;
    }

    /**
     * Gets the value of the smsPhones property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NotifyContract.SmsPhones }{@code >}
     *     
     */
    public JAXBElement<NotifyContract.SmsPhones> getSmsPhones() {
        return smsPhones;
    }

    /**
     * Sets the value of the smsPhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NotifyContract.SmsPhones }{@code >}
     *     
     */
    public void setSmsPhones(JAXBElement<NotifyContract.SmsPhones> value) {
        this.smsPhones = value;
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

    /**
     * Gets the value of the instId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInstId() {
        return instId;
    }

    /**
     * Sets the value of the instId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInstId(Long value) {
        this.instId = value;
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
     *         &lt;element name="Value" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}StrList" minOccurs="0"/&gt;
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
        "value"
    })
    public static class Emails {

        @XmlElementRef(name = "Value", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
        protected List<JAXBElement<List<String>>> value;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
         * 
         * 
         */
        public List<JAXBElement<List<String>>> getValue() {
            if (value == null) {
                value = new ArrayList<JAXBElement<List<String>>>();
            }
            return this.value;
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
     *         &lt;element name="Value" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}StrList" minOccurs="0"/&gt;
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
        "value"
    })
    public static class SmsPhones {

        @XmlElementRef(name = "Value", namespace = "http://schemas.tranzaxis.com/contracts-notify.xsd", type = JAXBElement.class, required = false)
        protected List<JAXBElement<List<String>>> value;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
         * 
         * 
         */
        public List<JAXBElement<List<String>>> getValue() {
            if (value == null) {
                value = new ArrayList<JAXBElement<List<String>>>();
            }
            return this.value;
        }

    }

}
