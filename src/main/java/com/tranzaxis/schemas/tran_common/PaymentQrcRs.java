
package com.tranzaxis.schemas.tran_common;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentQrcRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentQrcRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Info" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Val" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="Merchant" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="LegalTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="StreetAddress" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Mcc" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="AgentRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Network" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="NspkIps"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="QrcType" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Error" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Code" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Description" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Status" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="InvoiceRidByTrx" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Description" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Amt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="RidCheckVal" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
@XmlType(name = "PaymentQrcRs", propOrder = {
    "info"
})
public class PaymentQrcRs {

    @XmlElement(name = "Info")
    protected List<PaymentQrcRs.Info> info;

    /**
     * Gets the value of the info property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the info property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentQrcRs.Info }
     * 
     * 
     */
    public List<PaymentQrcRs.Info> getInfo() {
        if (info == null) {
            info = new ArrayList<PaymentQrcRs.Info>();
        }
        return this.info;
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
     *         &lt;element name="Val" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="Merchant" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="LegalTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="StreetAddress" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Mcc" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="AgentRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Error" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Code" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Description" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Status" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="InvoiceRidByTrx" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Description" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Amt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="RidCheckVal" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "val",
        "merchant",
        "network",
        "error"
    })
    public static class Info {

        @XmlElement(name = "Val")
        protected String val;
        @XmlElement(name = "Merchant")
        protected PaymentQrcRs.Info.Merchant merchant;
        @XmlElement(name = "Network")
        protected PaymentQrcRs.Info.Network network;
        @XmlElement(name = "Error")
        protected PaymentQrcRs.Info.Error error;
        @XmlAttribute(name = "Rid")
        protected String rid;
        @XmlAttribute(name = "Status")
        protected String status;
        @XmlAttribute(name = "InvoiceRidByTrx")
        protected String invoiceRidByTrx;
        @XmlAttribute(name = "Description")
        protected String description;
        @XmlAttribute(name = "Amt")
        protected BigDecimal amt;
        @XmlAttribute(name = "Ccy")
        protected Long ccy;
        @XmlAttribute(name = "RidCheckVal")
        protected String ridCheckVal;

        /**
         * Gets the value of the val property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVal() {
            return val;
        }

        /**
         * Sets the value of the val property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVal(String value) {
            this.val = value;
        }

        /**
         * Gets the value of the merchant property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentQrcRs.Info.Merchant }
         *     
         */
        public PaymentQrcRs.Info.Merchant getMerchant() {
            return merchant;
        }

        /**
         * Sets the value of the merchant property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentQrcRs.Info.Merchant }
         *     
         */
        public void setMerchant(PaymentQrcRs.Info.Merchant value) {
            this.merchant = value;
        }

        /**
         * Gets the value of the network property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentQrcRs.Info.Network }
         *     
         */
        public PaymentQrcRs.Info.Network getNetwork() {
            return network;
        }

        /**
         * Sets the value of the network property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentQrcRs.Info.Network }
         *     
         */
        public void setNetwork(PaymentQrcRs.Info.Network value) {
            this.network = value;
        }

        /**
         * Gets the value of the error property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentQrcRs.Info.Error }
         *     
         */
        public PaymentQrcRs.Info.Error getError() {
            return error;
        }

        /**
         * Sets the value of the error property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentQrcRs.Info.Error }
         *     
         */
        public void setError(PaymentQrcRs.Info.Error value) {
            this.error = value;
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
         * Gets the value of the invoiceRidByTrx property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvoiceRidByTrx() {
            return invoiceRidByTrx;
        }

        /**
         * Sets the value of the invoiceRidByTrx property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvoiceRidByTrx(String value) {
            this.invoiceRidByTrx = value;
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
         * Gets the value of the amt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmt() {
            return amt;
        }

        /**
         * Sets the value of the amt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmt(BigDecimal value) {
            this.amt = value;
        }

        /**
         * Gets the value of the ccy property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getCcy() {
            return ccy;
        }

        /**
         * Sets the value of the ccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setCcy(Long value) {
            this.ccy = value;
        }

        /**
         * Gets the value of the ridCheckVal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRidCheckVal() {
            return ridCheckVal;
        }

        /**
         * Sets the value of the ridCheckVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRidCheckVal(String value) {
            this.ridCheckVal = value;
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
         *       &lt;attribute name="Code" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Description" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Error {

            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "Description")
            protected String description;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
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
         *       &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="LegalTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="StreetAddress" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Mcc" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="AgentRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Merchant {

            @XmlAttribute(name = "Title")
            protected String title;
            @XmlAttribute(name = "LegalTitle")
            protected String legalTitle;
            @XmlAttribute(name = "StreetAddress")
            protected String streetAddress;
            @XmlAttribute(name = "Mcc")
            protected Long mcc;
            @XmlAttribute(name = "AgentRid")
            protected String agentRid;

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
             * Gets the value of the legalTitle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLegalTitle() {
                return legalTitle;
            }

            /**
             * Sets the value of the legalTitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLegalTitle(String value) {
                this.legalTitle = value;
            }

            /**
             * Gets the value of the streetAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStreetAddress() {
                return streetAddress;
            }

            /**
             * Sets the value of the streetAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStreetAddress(String value) {
                this.streetAddress = value;
            }

            /**
             * Gets the value of the mcc property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getMcc() {
                return mcc;
            }

            /**
             * Sets the value of the mcc property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setMcc(Long value) {
                this.mcc = value;
            }

            /**
             * Gets the value of the agentRid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgentRid() {
                return agentRid;
            }

            /**
             * Sets the value of the agentRid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgentRid(String value) {
                this.agentRid = value;
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
         *       &lt;choice&gt;
         *         &lt;element name="NspkIps"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="QrcType" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
            protected PaymentQrcRs.Info.Network.NspkIps nspkIps;

            /**
             * Gets the value of the nspkIps property.
             * 
             * @return
             *     possible object is
             *     {@link PaymentQrcRs.Info.Network.NspkIps }
             *     
             */
            public PaymentQrcRs.Info.Network.NspkIps getNspkIps() {
                return nspkIps;
            }

            /**
             * Sets the value of the nspkIps property.
             * 
             * @param value
             *     allowed object is
             *     {@link PaymentQrcRs.Info.Network.NspkIps }
             *     
             */
            public void setNspkIps(PaymentQrcRs.Info.Network.NspkIps value) {
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

            }

        }

    }

}
