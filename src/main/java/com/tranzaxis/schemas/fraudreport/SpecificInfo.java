
package com.tranzaxis.schemas.fraudreport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SpecificInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Nspk"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="FraudCertainty" type="{http://schemas.tranzaxis.com/fraudReport.xsd}FraudNspkCertainty" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Visa"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ChPostalCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ChLastName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ChFirstName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ChMiddleInitial" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ChAddress1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ChAddress2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ChCity" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ChState" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ChPhone" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ChSocialSecurityNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CardMailedFromPostalCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CardValidFrom" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="CardMailedDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="CardMailedCity" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CardMailedState" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="MarketSegmentCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="LocatorNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CaseNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ArrestCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="IssuerGeneratedAuthorization" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AccountSequenceNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="FraudInvestigativeStatus" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="EnableDuplicate" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="FraudCvvInd"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MasterCard"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="FraudChargebackInd"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="FraudCounterfeitInd"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="FraudCvvInd"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="AcctClosedInd"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="AcctDeviceType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="CardType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="EnableDuplicate" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="DateFraudReported" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
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
@XmlType(name = "SpecificInfo", propOrder = {
    "nspk",
    "visa",
    "masterCard"
})
public class SpecificInfo {

    @XmlElement(name = "Nspk")
    protected SpecificInfo.Nspk nspk;
    @XmlElement(name = "Visa")
    protected SpecificInfo.Visa visa;
    @XmlElement(name = "MasterCard")
    protected SpecificInfo.MasterCard masterCard;

    /**
     * Gets the value of the nspk property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificInfo.Nspk }
     *     
     */
    public SpecificInfo.Nspk getNspk() {
        return nspk;
    }

    /**
     * Sets the value of the nspk property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificInfo.Nspk }
     *     
     */
    public void setNspk(SpecificInfo.Nspk value) {
        this.nspk = value;
    }

    /**
     * Gets the value of the visa property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificInfo.Visa }
     *     
     */
    public SpecificInfo.Visa getVisa() {
        return visa;
    }

    /**
     * Sets the value of the visa property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificInfo.Visa }
     *     
     */
    public void setVisa(SpecificInfo.Visa value) {
        this.visa = value;
    }

    /**
     * Gets the value of the masterCard property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificInfo.MasterCard }
     *     
     */
    public SpecificInfo.MasterCard getMasterCard() {
        return masterCard;
    }

    /**
     * Sets the value of the masterCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificInfo.MasterCard }
     *     
     */
    public void setMasterCard(SpecificInfo.MasterCard value) {
        this.masterCard = value;
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
     *       &lt;attribute name="FraudChargebackInd"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="FraudCounterfeitInd"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="FraudCvvInd"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="AcctClosedInd"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="AcctDeviceType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="CardType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="EnableDuplicate" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="DateFraudReported" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MasterCard {

        @XmlAttribute(name = "FraudChargebackInd")
        protected String fraudChargebackInd;
        @XmlAttribute(name = "FraudCounterfeitInd")
        protected String fraudCounterfeitInd;
        @XmlAttribute(name = "FraudCvvInd")
        protected String fraudCvvInd;
        @XmlAttribute(name = "AcctClosedInd")
        protected String acctClosedInd;
        @XmlAttribute(name = "AcctDeviceType")
        protected String acctDeviceType;
        @XmlAttribute(name = "CardType")
        protected String cardType;
        @XmlAttribute(name = "EnableDuplicate")
        protected Boolean enableDuplicate;
        @XmlAttribute(name = "DateFraudReported")
        protected XMLGregorianCalendar dateFraudReported;

        /**
         * Gets the value of the fraudChargebackInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFraudChargebackInd() {
            return fraudChargebackInd;
        }

        /**
         * Sets the value of the fraudChargebackInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFraudChargebackInd(String value) {
            this.fraudChargebackInd = value;
        }

        /**
         * Gets the value of the fraudCounterfeitInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFraudCounterfeitInd() {
            return fraudCounterfeitInd;
        }

        /**
         * Sets the value of the fraudCounterfeitInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFraudCounterfeitInd(String value) {
            this.fraudCounterfeitInd = value;
        }

        /**
         * Gets the value of the fraudCvvInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFraudCvvInd() {
            return fraudCvvInd;
        }

        /**
         * Sets the value of the fraudCvvInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFraudCvvInd(String value) {
            this.fraudCvvInd = value;
        }

        /**
         * Gets the value of the acctClosedInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctClosedInd() {
            return acctClosedInd;
        }

        /**
         * Sets the value of the acctClosedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctClosedInd(String value) {
            this.acctClosedInd = value;
        }

        /**
         * Gets the value of the acctDeviceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctDeviceType() {
            return acctDeviceType;
        }

        /**
         * Sets the value of the acctDeviceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctDeviceType(String value) {
            this.acctDeviceType = value;
        }

        /**
         * Gets the value of the cardType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardType() {
            return cardType;
        }

        /**
         * Sets the value of the cardType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardType(String value) {
            this.cardType = value;
        }

        /**
         * Gets the value of the enableDuplicate property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEnableDuplicate() {
            return enableDuplicate;
        }

        /**
         * Sets the value of the enableDuplicate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEnableDuplicate(Boolean value) {
            this.enableDuplicate = value;
        }

        /**
         * Gets the value of the dateFraudReported property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateFraudReported() {
            return dateFraudReported;
        }

        /**
         * Sets the value of the dateFraudReported property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateFraudReported(XMLGregorianCalendar value) {
            this.dateFraudReported = value;
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
     *       &lt;attribute name="FraudCertainty" type="{http://schemas.tranzaxis.com/fraudReport.xsd}FraudNspkCertainty" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Nspk {

        @XmlAttribute(name = "FraudCertainty")
        protected Long fraudCertainty;

        /**
         * Gets the value of the fraudCertainty property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getFraudCertainty() {
            return fraudCertainty;
        }

        /**
         * Sets the value of the fraudCertainty property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setFraudCertainty(Long value) {
            this.fraudCertainty = value;
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
     *       &lt;attribute name="ChPostalCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ChLastName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ChFirstName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ChMiddleInitial" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ChAddress1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ChAddress2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ChCity" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ChState" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ChPhone" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ChSocialSecurityNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CardMailedFromPostalCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CardValidFrom" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="CardMailedDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="CardMailedCity" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CardMailedState" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="MarketSegmentCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="LocatorNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CaseNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ArrestCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="IssuerGeneratedAuthorization" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AccountSequenceNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="FraudInvestigativeStatus" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="EnableDuplicate" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="FraudCvvInd"&gt;
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
    @XmlType(name = "")
    public static class Visa {

        @XmlAttribute(name = "ChPostalCode")
        protected String chPostalCode;
        @XmlAttribute(name = "ChLastName")
        protected String chLastName;
        @XmlAttribute(name = "ChFirstName")
        protected String chFirstName;
        @XmlAttribute(name = "ChMiddleInitial")
        protected String chMiddleInitial;
        @XmlAttribute(name = "ChAddress1")
        protected String chAddress1;
        @XmlAttribute(name = "ChAddress2")
        protected String chAddress2;
        @XmlAttribute(name = "ChCity")
        protected String chCity;
        @XmlAttribute(name = "ChState")
        protected String chState;
        @XmlAttribute(name = "ChPhone")
        protected String chPhone;
        @XmlAttribute(name = "ChSocialSecurityNumber")
        protected String chSocialSecurityNumber;
        @XmlAttribute(name = "CardMailedFromPostalCode")
        protected String cardMailedFromPostalCode;
        @XmlAttribute(name = "CardValidFrom")
        protected XMLGregorianCalendar cardValidFrom;
        @XmlAttribute(name = "CardMailedDate")
        protected XMLGregorianCalendar cardMailedDate;
        @XmlAttribute(name = "CardMailedCity")
        protected String cardMailedCity;
        @XmlAttribute(name = "CardMailedState")
        protected String cardMailedState;
        @XmlAttribute(name = "MarketSegmentCode")
        protected String marketSegmentCode;
        @XmlAttribute(name = "LocatorNumber")
        protected String locatorNumber;
        @XmlAttribute(name = "CaseNumber")
        protected String caseNumber;
        @XmlAttribute(name = "ArrestCode")
        protected String arrestCode;
        @XmlAttribute(name = "IssuerGeneratedAuthorization")
        protected String issuerGeneratedAuthorization;
        @XmlAttribute(name = "AccountSequenceNumber")
        protected String accountSequenceNumber;
        @XmlAttribute(name = "FraudInvestigativeStatus")
        protected String fraudInvestigativeStatus;
        @XmlAttribute(name = "EnableDuplicate")
        protected Boolean enableDuplicate;
        @XmlAttribute(name = "FraudCvvInd")
        protected String fraudCvvInd;

        /**
         * Gets the value of the chPostalCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChPostalCode() {
            return chPostalCode;
        }

        /**
         * Sets the value of the chPostalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChPostalCode(String value) {
            this.chPostalCode = value;
        }

        /**
         * Gets the value of the chLastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChLastName() {
            return chLastName;
        }

        /**
         * Sets the value of the chLastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChLastName(String value) {
            this.chLastName = value;
        }

        /**
         * Gets the value of the chFirstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChFirstName() {
            return chFirstName;
        }

        /**
         * Sets the value of the chFirstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChFirstName(String value) {
            this.chFirstName = value;
        }

        /**
         * Gets the value of the chMiddleInitial property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChMiddleInitial() {
            return chMiddleInitial;
        }

        /**
         * Sets the value of the chMiddleInitial property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChMiddleInitial(String value) {
            this.chMiddleInitial = value;
        }

        /**
         * Gets the value of the chAddress1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChAddress1() {
            return chAddress1;
        }

        /**
         * Sets the value of the chAddress1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChAddress1(String value) {
            this.chAddress1 = value;
        }

        /**
         * Gets the value of the chAddress2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChAddress2() {
            return chAddress2;
        }

        /**
         * Sets the value of the chAddress2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChAddress2(String value) {
            this.chAddress2 = value;
        }

        /**
         * Gets the value of the chCity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChCity() {
            return chCity;
        }

        /**
         * Sets the value of the chCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChCity(String value) {
            this.chCity = value;
        }

        /**
         * Gets the value of the chState property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChState() {
            return chState;
        }

        /**
         * Sets the value of the chState property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChState(String value) {
            this.chState = value;
        }

        /**
         * Gets the value of the chPhone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChPhone() {
            return chPhone;
        }

        /**
         * Sets the value of the chPhone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChPhone(String value) {
            this.chPhone = value;
        }

        /**
         * Gets the value of the chSocialSecurityNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChSocialSecurityNumber() {
            return chSocialSecurityNumber;
        }

        /**
         * Sets the value of the chSocialSecurityNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChSocialSecurityNumber(String value) {
            this.chSocialSecurityNumber = value;
        }

        /**
         * Gets the value of the cardMailedFromPostalCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardMailedFromPostalCode() {
            return cardMailedFromPostalCode;
        }

        /**
         * Sets the value of the cardMailedFromPostalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardMailedFromPostalCode(String value) {
            this.cardMailedFromPostalCode = value;
        }

        /**
         * Gets the value of the cardValidFrom property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCardValidFrom() {
            return cardValidFrom;
        }

        /**
         * Sets the value of the cardValidFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCardValidFrom(XMLGregorianCalendar value) {
            this.cardValidFrom = value;
        }

        /**
         * Gets the value of the cardMailedDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCardMailedDate() {
            return cardMailedDate;
        }

        /**
         * Sets the value of the cardMailedDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCardMailedDate(XMLGregorianCalendar value) {
            this.cardMailedDate = value;
        }

        /**
         * Gets the value of the cardMailedCity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardMailedCity() {
            return cardMailedCity;
        }

        /**
         * Sets the value of the cardMailedCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardMailedCity(String value) {
            this.cardMailedCity = value;
        }

        /**
         * Gets the value of the cardMailedState property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardMailedState() {
            return cardMailedState;
        }

        /**
         * Sets the value of the cardMailedState property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardMailedState(String value) {
            this.cardMailedState = value;
        }

        /**
         * Gets the value of the marketSegmentCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMarketSegmentCode() {
            return marketSegmentCode;
        }

        /**
         * Sets the value of the marketSegmentCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMarketSegmentCode(String value) {
            this.marketSegmentCode = value;
        }

        /**
         * Gets the value of the locatorNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocatorNumber() {
            return locatorNumber;
        }

        /**
         * Sets the value of the locatorNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocatorNumber(String value) {
            this.locatorNumber = value;
        }

        /**
         * Gets the value of the caseNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaseNumber() {
            return caseNumber;
        }

        /**
         * Sets the value of the caseNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaseNumber(String value) {
            this.caseNumber = value;
        }

        /**
         * Gets the value of the arrestCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArrestCode() {
            return arrestCode;
        }

        /**
         * Sets the value of the arrestCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArrestCode(String value) {
            this.arrestCode = value;
        }

        /**
         * Gets the value of the issuerGeneratedAuthorization property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIssuerGeneratedAuthorization() {
            return issuerGeneratedAuthorization;
        }

        /**
         * Sets the value of the issuerGeneratedAuthorization property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssuerGeneratedAuthorization(String value) {
            this.issuerGeneratedAuthorization = value;
        }

        /**
         * Gets the value of the accountSequenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountSequenceNumber() {
            return accountSequenceNumber;
        }

        /**
         * Sets the value of the accountSequenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountSequenceNumber(String value) {
            this.accountSequenceNumber = value;
        }

        /**
         * Gets the value of the fraudInvestigativeStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFraudInvestigativeStatus() {
            return fraudInvestigativeStatus;
        }

        /**
         * Sets the value of the fraudInvestigativeStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFraudInvestigativeStatus(String value) {
            this.fraudInvestigativeStatus = value;
        }

        /**
         * Gets the value of the enableDuplicate property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEnableDuplicate() {
            return enableDuplicate;
        }

        /**
         * Sets the value of the enableDuplicate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEnableDuplicate(Boolean value) {
            this.enableDuplicate = value;
        }

        /**
         * Gets the value of the fraudCvvInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFraudCvvInd() {
            return fraudCvvInd;
        }

        /**
         * Sets the value of the fraudCvvInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFraudCvvInd(String value) {
            this.fraudCvvInd = value;
        }

    }

}
