
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TdsPAResVariant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TdsPAResVariant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoginName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CapSignChallenge" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="HashSalt" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CallbackAddresses" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CallbackAddress" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="ChannelKind" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}ChannelKind" /&gt;
 *                           &lt;attribute name="Address" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Kind" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TdsPAResVariant", propOrder = {
    "loginName",
    "capSignChallenge",
    "hashSalt",
    "callbackAddresses"
})
public class TdsPAResVariant {

    @XmlElement(name = "LoginName")
    protected String loginName;
    @XmlElement(name = "CapSignChallenge")
    protected String capSignChallenge;
    @XmlElement(name = "HashSalt")
    protected String hashSalt;
    @XmlElement(name = "CallbackAddresses")
    protected TdsPAResVariant.CallbackAddresses callbackAddresses;
    @XmlAttribute(name = "Kind", required = true)
    protected String kind;

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the capSignChallenge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapSignChallenge() {
        return capSignChallenge;
    }

    /**
     * Sets the value of the capSignChallenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapSignChallenge(String value) {
        this.capSignChallenge = value;
    }

    /**
     * Gets the value of the hashSalt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashSalt() {
        return hashSalt;
    }

    /**
     * Sets the value of the hashSalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashSalt(String value) {
        this.hashSalt = value;
    }

    /**
     * Gets the value of the callbackAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link TdsPAResVariant.CallbackAddresses }
     *     
     */
    public TdsPAResVariant.CallbackAddresses getCallbackAddresses() {
        return callbackAddresses;
    }

    /**
     * Sets the value of the callbackAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdsPAResVariant.CallbackAddresses }
     *     
     */
    public void setCallbackAddresses(TdsPAResVariant.CallbackAddresses value) {
        this.callbackAddresses = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
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
     *         &lt;element name="CallbackAddress" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="ChannelKind" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}ChannelKind" /&gt;
     *                 &lt;attribute name="Address" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
        "callbackAddress"
    })
    public static class CallbackAddresses {

        @XmlElement(name = "CallbackAddress", required = true)
        protected List<TdsPAResVariant.CallbackAddresses.CallbackAddress> callbackAddress;

        /**
         * Gets the value of the callbackAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the callbackAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCallbackAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TdsPAResVariant.CallbackAddresses.CallbackAddress }
         * 
         * 
         */
        public List<TdsPAResVariant.CallbackAddresses.CallbackAddress> getCallbackAddress() {
            if (callbackAddress == null) {
                callbackAddress = new ArrayList<TdsPAResVariant.CallbackAddresses.CallbackAddress>();
            }
            return this.callbackAddress;
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
         *       &lt;attribute name="ChannelKind" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}ChannelKind" /&gt;
         *       &lt;attribute name="Address" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CallbackAddress {

            @XmlAttribute(name = "ChannelKind", required = true)
            protected String channelKind;
            @XmlAttribute(name = "Address", required = true)
            protected String address;
            @XmlAttribute(name = "Title")
            protected String title;

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
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
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

        }

    }

}
