
package com.tranzaxis.schemas.tran_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentQrcRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentQrcRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Network" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="NspkIps"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="QrcType" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="TemplateVersion" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="AgentId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="MemberId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="LegalId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Account" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="MerchantId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Description" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ExpTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="InquiryKind"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Rids"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
@XmlType(name = "PaymentQrcRq", propOrder = {
    "network"
})
public class PaymentQrcRq {

    @XmlElement(name = "Network")
    protected PaymentQrcRq.Network network;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "ExpTime")
    protected XMLGregorianCalendar expTime;
    @XmlAttribute(name = "InquiryKind")
    protected String inquiryKind;
    @XmlAttribute(name = "Rids")
    protected List<String> rids;

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentQrcRq.Network }
     *     
     */
    public PaymentQrcRq.Network getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentQrcRq.Network }
     *     
     */
    public void setNetwork(PaymentQrcRq.Network value) {
        this.network = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the expTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpTime() {
        return expTime;
    }

    /**
     * Sets the value of the expTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpTime(XMLGregorianCalendar value) {
        this.expTime = value;
    }

    /**
     * Gets the value of the inquiryKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryKind() {
        return inquiryKind;
    }

    /**
     * Sets the value of the inquiryKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiryKind(String value) {
        this.inquiryKind = value;
    }

    /**
     * Gets the value of the rids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRids() {
        if (rids == null) {
            rids = new ArrayList<String>();
        }
        return this.rids;
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
     *       &lt;choice&gt;
     *         &lt;element name="NspkIps"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="QrcType" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="TemplateVersion" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="AgentId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="MemberId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="LegalId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Account" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="MerchantId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nspkIps"
    })
    public static class Network {

        @XmlElement(name = "NspkIps")
        protected PaymentQrcRq.Network.NspkIps nspkIps;

        /**
         * Gets the value of the nspkIps property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentQrcRq.Network.NspkIps }
         *     
         */
        public PaymentQrcRq.Network.NspkIps getNspkIps() {
            return nspkIps;
        }

        /**
         * Sets the value of the nspkIps property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentQrcRq.Network.NspkIps }
         *     
         */
        public void setNspkIps(PaymentQrcRq.Network.NspkIps value) {
            this.nspkIps = value;
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
         *       &lt;attribute name="QrcType" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="TemplateVersion" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="AgentId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="MemberId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="LegalId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Account" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="MerchantId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NspkIps {

            @XmlAttribute(name = "QrcType")
            protected String qrcType;
            @XmlAttribute(name = "TemplateVersion")
            protected String templateVersion;
            @XmlAttribute(name = "AgentId")
            protected String agentId;
            @XmlAttribute(name = "MemberId")
            protected String memberId;
            @XmlAttribute(name = "LegalId")
            protected String legalId;
            @XmlAttribute(name = "Account")
            protected String account;
            @XmlAttribute(name = "MerchantId")
            protected String merchantId;

            /**
             * Gets the value of the qrcType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQrcType() {
                return qrcType;
            }

            /**
             * Sets the value of the qrcType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQrcType(String value) {
                this.qrcType = value;
            }

            /**
             * Gets the value of the templateVersion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTemplateVersion() {
                return templateVersion;
            }

            /**
             * Sets the value of the templateVersion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTemplateVersion(String value) {
                this.templateVersion = value;
            }

            /**
             * Gets the value of the agentId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgentId() {
                return agentId;
            }

            /**
             * Sets the value of the agentId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgentId(String value) {
                this.agentId = value;
            }

            /**
             * Gets the value of the memberId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberId() {
                return memberId;
            }

            /**
             * Sets the value of the memberId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberId(String value) {
                this.memberId = value;
            }

            /**
             * Gets the value of the legalId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLegalId() {
                return legalId;
            }

            /**
             * Sets the value of the legalId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLegalId(String value) {
                this.legalId = value;
            }

            /**
             * Gets the value of the account property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccount() {
                return account;
            }

            /**
             * Sets the value of the account property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccount(String value) {
                this.account = value;
            }

            /**
             * Gets the value of the merchantId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMerchantId() {
                return merchantId;
            }

            /**
             * Sets the value of the merchantId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMerchantId(String value) {
                this.merchantId = value;
            }

        }

    }

}
