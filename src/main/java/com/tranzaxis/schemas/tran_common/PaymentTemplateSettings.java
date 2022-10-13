
package com.tranzaxis.schemas.tran_common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.AppEncryptedData;


/**
 * <p>Java class for PaymentTemplateSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTemplateSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Payee" type="{http://schemas.tranzaxis.com/tran-common.xsd}Payee" minOccurs="0"/&gt;
 *         &lt;element name="Params" type="{http://schemas.tranzaxis.com/tran-common.xsd}PaymentParams" minOccurs="0"/&gt;
 *         &lt;element name="DefaultVal" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Card" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PanCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Pan"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *                                 &lt;minLength value="6"/&gt;
 *                                 &lt;maxLength value="19"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="ExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                           &lt;attribute name="IsoAccountType"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="CardFromTemplateTran" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Amt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="CcyAc" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AsStr" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="InstId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="ContractRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ValidateParams" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTemplateSettings", propOrder = {
    "title",
    "payee",
    "params",
    "defaultVal"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.tran.Request.Specific.PaymentTemplate.class
})
public class PaymentTemplateSettings {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Payee")
    protected Payee payee;
    @XmlElement(name = "Params")
    protected PaymentParams params;
    @XmlElement(name = "DefaultVal")
    protected PaymentTemplateSettings.DefaultVal defaultVal;
    @XmlAttribute(name = "ValidateParams")
    protected Boolean validateParams;

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
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link Payee }
     *     
     */
    public Payee getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payee }
     *     
     */
    public void setPayee(Payee value) {
        this.payee = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentParams }
     *     
     */
    public PaymentParams getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentParams }
     *     
     */
    public void setParams(PaymentParams value) {
        this.params = value;
    }

    /**
     * Gets the value of the defaultVal property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTemplateSettings.DefaultVal }
     *     
     */
    public PaymentTemplateSettings.DefaultVal getDefaultVal() {
        return defaultVal;
    }

    /**
     * Sets the value of the defaultVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTemplateSettings.DefaultVal }
     *     
     */
    public void setDefaultVal(PaymentTemplateSettings.DefaultVal value) {
        this.defaultVal = value;
    }

    /**
     * Gets the value of the validateParams property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isValidateParams() {
        if (validateParams == null) {
            return false;
        } else {
            return validateParams;
        }
    }

    /**
     * Sets the value of the validateParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidateParams(Boolean value) {
        this.validateParams = value;
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
     *         &lt;element name="Card" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PanCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Pan"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
     *                       &lt;minLength value="6"/&gt;
     *                       &lt;maxLength value="19"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="ExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *                 &lt;attribute name="IsoAccountType"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="CardFromTemplateTran" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Amt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="CcyAc" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AsStr" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="InstId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="ContractRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "card"
    })
    public static class DefaultVal {

        @XmlElement(name = "Card")
        protected PaymentTemplateSettings.DefaultVal.Card card;
        @XmlAttribute(name = "Amt")
        protected BigDecimal amt;
        @XmlAttribute(name = "Ccy")
        protected Long ccy;
        @XmlAttribute(name = "CcyAc")
        protected String ccyAc;
        @XmlAttribute(name = "AsStr")
        protected String asStr;
        @XmlAttribute(name = "ContractId")
        protected Long contractId;
        @XmlAttribute(name = "InstId")
        protected Long instId;
        @XmlAttribute(name = "ContractRid")
        protected String contractRid;

        /**
         * Gets the value of the card property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentTemplateSettings.DefaultVal.Card }
         *     
         */
        public PaymentTemplateSettings.DefaultVal.Card getCard() {
            return card;
        }

        /**
         * Sets the value of the card property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentTemplateSettings.DefaultVal.Card }
         *     
         */
        public void setCard(PaymentTemplateSettings.DefaultVal.Card value) {
            this.card = value;
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
         * Gets the value of the ccyAc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcyAc() {
            return ccyAc;
        }

        /**
         * Sets the value of the ccyAc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcyAc(String value) {
            this.ccyAc = value;
        }

        /**
         * Gets the value of the asStr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAsStr() {
            return asStr;
        }

        /**
         * Sets the value of the asStr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAsStr(String value) {
            this.asStr = value;
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
         * Gets the value of the contractRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractRid() {
            return contractRid;
        }

        /**
         * Sets the value of the contractRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContractRid(String value) {
            this.contractRid = value;
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
         *         &lt;element name="PanCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Pan"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
         *             &lt;minLength value="6"/&gt;
         *             &lt;maxLength value="19"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="ExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *       &lt;attribute name="IsoAccountType"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="CardFromTemplateTran" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "panCrypt"
        })
        public static class Card {

            @XmlElement(name = "PanCrypt")
            protected AppEncryptedData panCrypt;
            @XmlAttribute(name = "Id")
            protected Long id;
            @XmlAttribute(name = "Pan")
            protected String pan;
            @XmlAttribute(name = "ExpDate")
            protected XMLGregorianCalendar expDate;
            @XmlAttribute(name = "IsoAccountType")
            protected Long isoAccountType;
            @XmlAttribute(name = "CardFromTemplateTran")
            protected Boolean cardFromTemplateTran;

            /**
             * Gets the value of the panCrypt property.
             * 
             * @return
             *     possible object is
             *     {@link AppEncryptedData }
             *     
             */
            public AppEncryptedData getPanCrypt() {
                return panCrypt;
            }

            /**
             * Sets the value of the panCrypt property.
             * 
             * @param value
             *     allowed object is
             *     {@link AppEncryptedData }
             *     
             */
            public void setPanCrypt(AppEncryptedData value) {
                this.panCrypt = value;
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
             * Gets the value of the pan property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPan() {
                return pan;
            }

            /**
             * Sets the value of the pan property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPan(String value) {
                this.pan = value;
            }

            /**
             * Gets the value of the expDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getExpDate() {
                return expDate;
            }

            /**
             * Sets the value of the expDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setExpDate(XMLGregorianCalendar value) {
                this.expDate = value;
            }

            /**
             * Gets the value of the isoAccountType property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getIsoAccountType() {
                return isoAccountType;
            }

            /**
             * Sets the value of the isoAccountType property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setIsoAccountType(Long value) {
                this.isoAccountType = value;
            }

            /**
             * Gets the value of the cardFromTemplateTran property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isCardFromTemplateTran() {
                if (cardFromTemplateTran == null) {
                    return false;
                } else {
                    return cardFromTemplateTran;
                }
            }

            /**
             * Sets the value of the cardFromTemplateTran property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCardFromTemplateTran(Boolean value) {
                this.cardFromTemplateTran = value;
            }

        }

    }

}
