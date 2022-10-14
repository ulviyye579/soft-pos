
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
 * <p>Java class for ResultSpecific complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultSpecific"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LimitViolation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="CurVal" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="MaxVal" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Correction" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CustInfo" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="StrData" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                   &lt;element name="XmlData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="AddAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="SubAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SuggestedLogins" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Login" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ConfirmCcyConversion" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="AcctDebitAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="AcctDebitCcy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="AcctCreditAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="AcctCreditCcy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="EntryDebitAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="EntryDebitCcy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="EntryCreditAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="EntryCreditCcy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InternalReject" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="RejectTranId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="Reason" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ReasonDesc" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DuplicatedTranId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="DuplicatedTranResult" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranResultEnum" /&gt;
 *       &lt;attribute name="NeedChangePassword" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="Cvv2TriesLeft" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="PinTriesLeft" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="IPinTriesLeft" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="PwdTriesLeft" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="CallbackTriesLeft" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="PersonQaTriesLeft" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="CapTriesLeft" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="DeclinerInstRole"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="RequiredAuth"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}AuthKindEnum" /&gt;
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
@XmlType(name = "ResultSpecific", propOrder = {
    "description",
    "limitViolation",
    "correction",
    "suggestedLogins",
    "confirmCcyConversion",
    "internalReject"
})
public class ResultSpecific {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "LimitViolation")
    protected ResultSpecific.LimitViolation limitViolation;
    @XmlElement(name = "Correction")
    protected ResultSpecific.Correction correction;
    @XmlElement(name = "SuggestedLogins")
    protected ResultSpecific.SuggestedLogins suggestedLogins;
    @XmlElement(name = "ConfirmCcyConversion")
    protected ResultSpecific.ConfirmCcyConversion confirmCcyConversion;
    @XmlElement(name = "InternalReject")
    protected ResultSpecific.InternalReject internalReject;
    @XmlAttribute(name = "DuplicatedTranId")
    protected Long duplicatedTranId;
    @XmlAttribute(name = "DuplicatedTranResult")
    protected String duplicatedTranResult;
    @XmlAttribute(name = "NeedChangePassword")
    protected Boolean needChangePassword;
    @XmlAttribute(name = "Cvv2TriesLeft")
    protected Long cvv2TriesLeft;
    @XmlAttribute(name = "PinTriesLeft")
    protected Long pinTriesLeft;
    @XmlAttribute(name = "IPinTriesLeft")
    protected Long iPinTriesLeft;
    @XmlAttribute(name = "PwdTriesLeft")
    protected Long pwdTriesLeft;
    @XmlAttribute(name = "CallbackTriesLeft")
    protected Long callbackTriesLeft;
    @XmlAttribute(name = "PersonQaTriesLeft")
    protected Long personQaTriesLeft;
    @XmlAttribute(name = "CapTriesLeft")
    protected Long capTriesLeft;
    @XmlAttribute(name = "DeclinerInstRole")
    protected String declinerInstRole;
    @XmlAttribute(name = "RequiredAuth")
    protected List<String> requiredAuth;

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
     * Gets the value of the limitViolation property.
     * 
     * @return
     *     possible object is
     *     {@link ResultSpecific.LimitViolation }
     *     
     */
    public ResultSpecific.LimitViolation getLimitViolation() {
        return limitViolation;
    }

    /**
     * Sets the value of the limitViolation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultSpecific.LimitViolation }
     *     
     */
    public void setLimitViolation(ResultSpecific.LimitViolation value) {
        this.limitViolation = value;
    }

    /**
     * Gets the value of the correction property.
     * 
     * @return
     *     possible object is
     *     {@link ResultSpecific.Correction }
     *     
     */
    public ResultSpecific.Correction getCorrection() {
        return correction;
    }

    /**
     * Sets the value of the correction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultSpecific.Correction }
     *     
     */
    public void setCorrection(ResultSpecific.Correction value) {
        this.correction = value;
    }

    /**
     * Gets the value of the suggestedLogins property.
     * 
     * @return
     *     possible object is
     *     {@link ResultSpecific.SuggestedLogins }
     *     
     */
    public ResultSpecific.SuggestedLogins getSuggestedLogins() {
        return suggestedLogins;
    }

    /**
     * Sets the value of the suggestedLogins property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultSpecific.SuggestedLogins }
     *     
     */
    public void setSuggestedLogins(ResultSpecific.SuggestedLogins value) {
        this.suggestedLogins = value;
    }

    /**
     * Gets the value of the confirmCcyConversion property.
     * 
     * @return
     *     possible object is
     *     {@link ResultSpecific.ConfirmCcyConversion }
     *     
     */
    public ResultSpecific.ConfirmCcyConversion getConfirmCcyConversion() {
        return confirmCcyConversion;
    }

    /**
     * Sets the value of the confirmCcyConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultSpecific.ConfirmCcyConversion }
     *     
     */
    public void setConfirmCcyConversion(ResultSpecific.ConfirmCcyConversion value) {
        this.confirmCcyConversion = value;
    }

    /**
     * Gets the value of the internalReject property.
     * 
     * @return
     *     possible object is
     *     {@link ResultSpecific.InternalReject }
     *     
     */
    public ResultSpecific.InternalReject getInternalReject() {
        return internalReject;
    }

    /**
     * Sets the value of the internalReject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultSpecific.InternalReject }
     *     
     */
    public void setInternalReject(ResultSpecific.InternalReject value) {
        this.internalReject = value;
    }

    /**
     * Gets the value of the duplicatedTranId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDuplicatedTranId() {
        return duplicatedTranId;
    }

    /**
     * Sets the value of the duplicatedTranId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDuplicatedTranId(Long value) {
        this.duplicatedTranId = value;
    }

    /**
     * Gets the value of the duplicatedTranResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicatedTranResult() {
        return duplicatedTranResult;
    }

    /**
     * Sets the value of the duplicatedTranResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicatedTranResult(String value) {
        this.duplicatedTranResult = value;
    }

    /**
     * Gets the value of the needChangePassword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedChangePassword() {
        return needChangePassword;
    }

    /**
     * Sets the value of the needChangePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedChangePassword(Boolean value) {
        this.needChangePassword = value;
    }

    /**
     * Gets the value of the cvv2TriesLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCvv2TriesLeft() {
        return cvv2TriesLeft;
    }

    /**
     * Sets the value of the cvv2TriesLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCvv2TriesLeft(Long value) {
        this.cvv2TriesLeft = value;
    }

    /**
     * Gets the value of the pinTriesLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPinTriesLeft() {
        return pinTriesLeft;
    }

    /**
     * Sets the value of the pinTriesLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPinTriesLeft(Long value) {
        this.pinTriesLeft = value;
    }

    /**
     * Gets the value of the iPinTriesLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIPinTriesLeft() {
        return iPinTriesLeft;
    }

    /**
     * Sets the value of the iPinTriesLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIPinTriesLeft(Long value) {
        this.iPinTriesLeft = value;
    }

    /**
     * Gets the value of the pwdTriesLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPwdTriesLeft() {
        return pwdTriesLeft;
    }

    /**
     * Sets the value of the pwdTriesLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPwdTriesLeft(Long value) {
        this.pwdTriesLeft = value;
    }

    /**
     * Gets the value of the callbackTriesLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCallbackTriesLeft() {
        return callbackTriesLeft;
    }

    /**
     * Sets the value of the callbackTriesLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCallbackTriesLeft(Long value) {
        this.callbackTriesLeft = value;
    }

    /**
     * Gets the value of the personQaTriesLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonQaTriesLeft() {
        return personQaTriesLeft;
    }

    /**
     * Sets the value of the personQaTriesLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonQaTriesLeft(Long value) {
        this.personQaTriesLeft = value;
    }

    /**
     * Gets the value of the capTriesLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapTriesLeft() {
        return capTriesLeft;
    }

    /**
     * Sets the value of the capTriesLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapTriesLeft(Long value) {
        this.capTriesLeft = value;
    }

    /**
     * Gets the value of the declinerInstRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclinerInstRole() {
        return declinerInstRole;
    }

    /**
     * Sets the value of the declinerInstRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclinerInstRole(String value) {
        this.declinerInstRole = value;
    }

    /**
     * Gets the value of the requiredAuth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredAuth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredAuth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequiredAuth() {
        if (requiredAuth == null) {
            requiredAuth = new ArrayList<String>();
        }
        return this.requiredAuth;
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
     *       &lt;attribute name="AcctDebitAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="AcctDebitCcy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="AcctCreditAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="AcctCreditCcy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="EntryDebitAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="EntryDebitCcy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="EntryCreditAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="EntryCreditCcy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ConfirmCcyConversion {

        @XmlAttribute(name = "AcctDebitAmt", required = true)
        protected BigDecimal acctDebitAmt;
        @XmlAttribute(name = "AcctDebitCcy", required = true)
        protected long acctDebitCcy;
        @XmlAttribute(name = "AcctCreditAmt", required = true)
        protected BigDecimal acctCreditAmt;
        @XmlAttribute(name = "AcctCreditCcy", required = true)
        protected long acctCreditCcy;
        @XmlAttribute(name = "EntryDebitAmt", required = true)
        protected BigDecimal entryDebitAmt;
        @XmlAttribute(name = "EntryDebitCcy", required = true)
        protected long entryDebitCcy;
        @XmlAttribute(name = "EntryCreditAmt", required = true)
        protected BigDecimal entryCreditAmt;
        @XmlAttribute(name = "EntryCreditCcy", required = true)
        protected long entryCreditCcy;

        /**
         * Gets the value of the acctDebitAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAcctDebitAmt() {
            return acctDebitAmt;
        }

        /**
         * Sets the value of the acctDebitAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAcctDebitAmt(BigDecimal value) {
            this.acctDebitAmt = value;
        }

        /**
         * Gets the value of the acctDebitCcy property.
         * 
         */
        public long getAcctDebitCcy() {
            return acctDebitCcy;
        }

        /**
         * Sets the value of the acctDebitCcy property.
         * 
         */
        public void setAcctDebitCcy(long value) {
            this.acctDebitCcy = value;
        }

        /**
         * Gets the value of the acctCreditAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAcctCreditAmt() {
            return acctCreditAmt;
        }

        /**
         * Sets the value of the acctCreditAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAcctCreditAmt(BigDecimal value) {
            this.acctCreditAmt = value;
        }

        /**
         * Gets the value of the acctCreditCcy property.
         * 
         */
        public long getAcctCreditCcy() {
            return acctCreditCcy;
        }

        /**
         * Sets the value of the acctCreditCcy property.
         * 
         */
        public void setAcctCreditCcy(long value) {
            this.acctCreditCcy = value;
        }

        /**
         * Gets the value of the entryDebitAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEntryDebitAmt() {
            return entryDebitAmt;
        }

        /**
         * Sets the value of the entryDebitAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEntryDebitAmt(BigDecimal value) {
            this.entryDebitAmt = value;
        }

        /**
         * Gets the value of the entryDebitCcy property.
         * 
         */
        public long getEntryDebitCcy() {
            return entryDebitCcy;
        }

        /**
         * Sets the value of the entryDebitCcy property.
         * 
         */
        public void setEntryDebitCcy(long value) {
            this.entryDebitCcy = value;
        }

        /**
         * Gets the value of the entryCreditAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEntryCreditAmt() {
            return entryCreditAmt;
        }

        /**
         * Sets the value of the entryCreditAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEntryCreditAmt(BigDecimal value) {
            this.entryCreditAmt = value;
        }

        /**
         * Gets the value of the entryCreditCcy property.
         * 
         */
        public long getEntryCreditCcy() {
            return entryCreditCcy;
        }

        /**
         * Sets the value of the entryCreditCcy property.
         * 
         */
        public void setEntryCreditCcy(long value) {
            this.entryCreditCcy = value;
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
     *         &lt;element name="CustInfo" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="StrData" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *         &lt;element name="XmlData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="AddAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="SubAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "custInfo",
        "strData",
        "xmlData"
    })
    public static class Correction {

        @XmlElement(name = "CustInfo")
        protected String custInfo;
        @XmlElement(name = "StrData")
        protected String strData;
        @XmlElement(name = "XmlData")
        protected Object xmlData;
        @XmlAttribute(name = "AddAmt")
        protected BigDecimal addAmt;
        @XmlAttribute(name = "SubAmt")
        protected BigDecimal subAmt;

        /**
         * Gets the value of the custInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustInfo() {
            return custInfo;
        }

        /**
         * Sets the value of the custInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustInfo(String value) {
            this.custInfo = value;
        }

        /**
         * Gets the value of the strData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStrData() {
            return strData;
        }

        /**
         * Sets the value of the strData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStrData(String value) {
            this.strData = value;
        }

        /**
         * Gets the value of the xmlData property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getXmlData() {
            return xmlData;
        }

        /**
         * Sets the value of the xmlData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setXmlData(Object value) {
            this.xmlData = value;
        }

        /**
         * Gets the value of the addAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAddAmt() {
            return addAmt;
        }

        /**
         * Sets the value of the addAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAddAmt(BigDecimal value) {
            this.addAmt = value;
        }

        /**
         * Gets the value of the subAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSubAmt() {
            return subAmt;
        }

        /**
         * Sets the value of the subAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSubAmt(BigDecimal value) {
            this.subAmt = value;
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
     *       &lt;attribute name="RejectTranId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="Reason" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ReasonDesc" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class InternalReject {

        @XmlAttribute(name = "RejectTranId", required = true)
        protected long rejectTranId;
        @XmlAttribute(name = "Reason")
        protected String reason;
        @XmlAttribute(name = "ReasonDesc")
        protected String reasonDesc;

        /**
         * Gets the value of the rejectTranId property.
         * 
         */
        public long getRejectTranId() {
            return rejectTranId;
        }

        /**
         * Sets the value of the rejectTranId property.
         * 
         */
        public void setRejectTranId(long value) {
            this.rejectTranId = value;
        }

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReason(String value) {
            this.reason = value;
        }

        /**
         * Gets the value of the reasonDesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReasonDesc() {
            return reasonDesc;
        }

        /**
         * Sets the value of the reasonDesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReasonDesc(String value) {
            this.reasonDesc = value;
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
     *       &lt;attribute name="CurVal" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="MaxVal" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LimitViolation {

        @XmlAttribute(name = "CurVal", required = true)
        protected BigDecimal curVal;
        @XmlAttribute(name = "MaxVal", required = true)
        protected BigDecimal maxVal;
        @XmlAttribute(name = "Ccy")
        protected Long ccy;

        /**
         * Gets the value of the curVal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCurVal() {
            return curVal;
        }

        /**
         * Sets the value of the curVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCurVal(BigDecimal value) {
            this.curVal = value;
        }

        /**
         * Gets the value of the maxVal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaxVal() {
            return maxVal;
        }

        /**
         * Sets the value of the maxVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaxVal(BigDecimal value) {
            this.maxVal = value;
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
     *         &lt;element name="Login" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded"/&gt;
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
        "login"
    })
    public static class SuggestedLogins {

        @XmlElement(name = "Login", required = true)
        protected List<String> login;

        /**
         * Gets the value of the login property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the login property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLogin().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLogin() {
            if (login == null) {
                login = new ArrayList<String>();
            }
            return this.login;
        }

    }

}
