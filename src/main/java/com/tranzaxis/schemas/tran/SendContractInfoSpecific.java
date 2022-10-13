
package com.tranzaxis.schemas.tran;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.ContactAddress;
import com.tranzaxis.schemas.contracts_admin.Contract;
import com.tranzaxis.schemas.subjects_admin.Subject;


/**
 * <p>Java class for SendContractInfoSpecific complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendContractInfoSpecific"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Template" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Statement" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FromDay" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
 *                   &lt;element name="ToDay" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
 *                   &lt;element name="TrancheTableId" type="{http://schemas.radixware.org/types.xsd}Id"/&gt;
 *                   &lt;element name="TranchePid" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *                   &lt;element name="DeliveryAddress" type="{http://schemas.tranzaxis.com/common-types.xsd}ContactAddress" minOccurs="0"/&gt;
 *                   &lt;element name="ReportMessage" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="TypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="StatementTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ChannelId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="ChannelRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AttachmentPageId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="AttachmentTypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="AttachmentTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="SubscriptionId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="SubscriptionRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="AttachmentPageIds"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Day" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Contract" type="{http://schemas.tranzaxis.com/contracts-admin.xsd}Contract" minOccurs="0"/&gt;
 *         &lt;element name="Customer" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Subject" minOccurs="0"/&gt;
 *         &lt;element name="Merchant" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Subject" minOccurs="0"/&gt;
 *         &lt;element name="Postings" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Posting" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="AccountId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="RegisterRole" type="{http://schemas.tranzaxis.com/tran.xsd}RegisterRoleEnum" /&gt;
 *                           &lt;attribute name="EntryKind" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}EntryKindEnum" /&gt;
 *                           &lt;attribute name="EntryCategoryCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="FinOperKind" type="{http://schemas.tranzaxis.com/tran.xsd}FinOperKindEnum" /&gt;
 *                           &lt;attribute name="TranKind" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranKindEnum" /&gt;
 *                           &lt;attribute name="TranLifePhase" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}TranLifePhase" /&gt;
 *                           &lt;attribute name="IsTranReversal" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *                           &lt;attribute name="TranCategoryCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="OperDay" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                           &lt;attribute name="RegTime" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                           &lt;attribute name="Sign" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
 *                                 &lt;minInclusive value="-1"/&gt;
 *                                 &lt;maxInclusive value="1"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
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
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendContractInfoSpecific", propOrder = {
    "template",
    "statement",
    "day",
    "contract",
    "customer",
    "merchant",
    "postings"
})
public class SendContractInfoSpecific {

    @XmlElement(name = "Template")
    protected String template;
    @XmlElement(name = "Statement")
    protected SendContractInfoSpecific.Statement statement;
    @XmlElement(name = "Day")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar day;
    @XmlElement(name = "Contract")
    protected Contract contract;
    @XmlElement(name = "Customer")
    protected Subject customer;
    @XmlElement(name = "Merchant")
    protected Subject merchant;
    @XmlElement(name = "Postings")
    protected SendContractInfoSpecific.Postings postings;

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplate(String value) {
        this.template = value;
    }

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link SendContractInfoSpecific.Statement }
     *     
     */
    public SendContractInfoSpecific.Statement getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendContractInfoSpecific.Statement }
     *     
     */
    public void setStatement(SendContractInfoSpecific.Statement value) {
        this.statement = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDay(XMLGregorianCalendar value) {
        this.day = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link Contract }
     *     
     */
    public Contract getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contract }
     *     
     */
    public void setContract(Contract value) {
        this.contract = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Subject }
     *     
     */
    public Subject getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subject }
     *     
     */
    public void setCustomer(Subject value) {
        this.customer = value;
    }

    /**
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link Subject }
     *     
     */
    public Subject getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subject }
     *     
     */
    public void setMerchant(Subject value) {
        this.merchant = value;
    }

    /**
     * Gets the value of the postings property.
     * 
     * @return
     *     possible object is
     *     {@link SendContractInfoSpecific.Postings }
     *     
     */
    public SendContractInfoSpecific.Postings getPostings() {
        return postings;
    }

    /**
     * Sets the value of the postings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendContractInfoSpecific.Postings }
     *     
     */
    public void setPostings(SendContractInfoSpecific.Postings value) {
        this.postings = value;
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
     *         &lt;element name="Posting" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="AccountId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="RegisterRole" type="{http://schemas.tranzaxis.com/tran.xsd}RegisterRoleEnum" /&gt;
     *                 &lt;attribute name="EntryKind" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}EntryKindEnum" /&gt;
     *                 &lt;attribute name="EntryCategoryCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="FinOperKind" type="{http://schemas.tranzaxis.com/tran.xsd}FinOperKindEnum" /&gt;
     *                 &lt;attribute name="TranKind" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranKindEnum" /&gt;
     *                 &lt;attribute name="TranLifePhase" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}TranLifePhase" /&gt;
     *                 &lt;attribute name="IsTranReversal" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
     *                 &lt;attribute name="TranCategoryCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="OperDay" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *                 &lt;attribute name="RegTime" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *                 &lt;attribute name="Sign" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
     *                       &lt;minInclusive value="-1"/&gt;
     *                       &lt;maxInclusive value="1"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
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
        "posting"
    })
    public static class Postings {

        @XmlElement(name = "Posting")
        protected List<SendContractInfoSpecific.Postings.Posting> posting;

        /**
         * Gets the value of the posting property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the posting property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPosting().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SendContractInfoSpecific.Postings.Posting }
         * 
         * 
         */
        public List<SendContractInfoSpecific.Postings.Posting> getPosting() {
            if (posting == null) {
                posting = new ArrayList<SendContractInfoSpecific.Postings.Posting>();
            }
            return this.posting;
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
         *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="AccountId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="RegisterRole" type="{http://schemas.tranzaxis.com/tran.xsd}RegisterRoleEnum" /&gt;
         *       &lt;attribute name="EntryKind" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}EntryKindEnum" /&gt;
         *       &lt;attribute name="EntryCategoryCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="FinOperKind" type="{http://schemas.tranzaxis.com/tran.xsd}FinOperKindEnum" /&gt;
         *       &lt;attribute name="TranKind" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranKindEnum" /&gt;
         *       &lt;attribute name="TranLifePhase" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}TranLifePhase" /&gt;
         *       &lt;attribute name="IsTranReversal" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
         *       &lt;attribute name="TranCategoryCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="OperDay" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *       &lt;attribute name="RegTime" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *       &lt;attribute name="Sign" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
         *             &lt;minInclusive value="-1"/&gt;
         *             &lt;maxInclusive value="1"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Posting {

            @XmlAttribute(name = "Id", required = true)
            protected long id;
            @XmlAttribute(name = "AccountId", required = true)
            protected long accountId;
            @XmlAttribute(name = "RegisterRole")
            protected String registerRole;
            @XmlAttribute(name = "EntryKind", required = true)
            protected String entryKind;
            @XmlAttribute(name = "EntryCategoryCode")
            protected String entryCategoryCode;
            @XmlAttribute(name = "FinOperKind")
            protected String finOperKind;
            @XmlAttribute(name = "TranKind", required = true)
            protected String tranKind;
            @XmlAttribute(name = "TranLifePhase", required = true)
            protected String tranLifePhase;
            @XmlAttribute(name = "IsTranReversal")
            protected Boolean isTranReversal;
            @XmlAttribute(name = "TranCategoryCode")
            protected String tranCategoryCode;
            @XmlAttribute(name = "OperDay", required = true)
            protected XMLGregorianCalendar operDay;
            @XmlAttribute(name = "RegTime", required = true)
            protected XMLGregorianCalendar regTime;
            @XmlAttribute(name = "Sign", required = true)
            protected int sign;
            @XmlAttribute(name = "Amt", required = true)
            protected BigDecimal amt;
            @XmlAttribute(name = "Ccy", required = true)
            protected long ccy;

            /**
             * Gets the value of the id property.
             * 
             */
            public long getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             */
            public void setId(long value) {
                this.id = value;
            }

            /**
             * Gets the value of the accountId property.
             * 
             */
            public long getAccountId() {
                return accountId;
            }

            /**
             * Sets the value of the accountId property.
             * 
             */
            public void setAccountId(long value) {
                this.accountId = value;
            }

            /**
             * Gets the value of the registerRole property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegisterRole() {
                return registerRole;
            }

            /**
             * Sets the value of the registerRole property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegisterRole(String value) {
                this.registerRole = value;
            }

            /**
             * Gets the value of the entryKind property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEntryKind() {
                return entryKind;
            }

            /**
             * Sets the value of the entryKind property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEntryKind(String value) {
                this.entryKind = value;
            }

            /**
             * Gets the value of the entryCategoryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEntryCategoryCode() {
                return entryCategoryCode;
            }

            /**
             * Sets the value of the entryCategoryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEntryCategoryCode(String value) {
                this.entryCategoryCode = value;
            }

            /**
             * Gets the value of the finOperKind property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFinOperKind() {
                return finOperKind;
            }

            /**
             * Sets the value of the finOperKind property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFinOperKind(String value) {
                this.finOperKind = value;
            }

            /**
             * Gets the value of the tranKind property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTranKind() {
                return tranKind;
            }

            /**
             * Sets the value of the tranKind property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTranKind(String value) {
                this.tranKind = value;
            }

            /**
             * Gets the value of the tranLifePhase property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTranLifePhase() {
                return tranLifePhase;
            }

            /**
             * Sets the value of the tranLifePhase property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTranLifePhase(String value) {
                this.tranLifePhase = value;
            }

            /**
             * Gets the value of the isTranReversal property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isIsTranReversal() {
                if (isTranReversal == null) {
                    return false;
                } else {
                    return isTranReversal;
                }
            }

            /**
             * Sets the value of the isTranReversal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsTranReversal(Boolean value) {
                this.isTranReversal = value;
            }

            /**
             * Gets the value of the tranCategoryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTranCategoryCode() {
                return tranCategoryCode;
            }

            /**
             * Sets the value of the tranCategoryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTranCategoryCode(String value) {
                this.tranCategoryCode = value;
            }

            /**
             * Gets the value of the operDay property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getOperDay() {
                return operDay;
            }

            /**
             * Sets the value of the operDay property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setOperDay(XMLGregorianCalendar value) {
                this.operDay = value;
            }

            /**
             * Gets the value of the regTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getRegTime() {
                return regTime;
            }

            /**
             * Sets the value of the regTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setRegTime(XMLGregorianCalendar value) {
                this.regTime = value;
            }

            /**
             * Gets the value of the sign property.
             * 
             */
            public int getSign() {
                return sign;
            }

            /**
             * Sets the value of the sign property.
             * 
             */
            public void setSign(int value) {
                this.sign = value;
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
             */
            public long getCcy() {
                return ccy;
            }

            /**
             * Sets the value of the ccy property.
             * 
             */
            public void setCcy(long value) {
                this.ccy = value;
            }

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
     *         &lt;element name="FromDay" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
     *         &lt;element name="ToDay" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
     *         &lt;element name="TrancheTableId" type="{http://schemas.radixware.org/types.xsd}Id"/&gt;
     *         &lt;element name="TranchePid" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
     *         &lt;element name="DeliveryAddress" type="{http://schemas.tranzaxis.com/common-types.xsd}ContactAddress" minOccurs="0"/&gt;
     *         &lt;element name="ReportMessage" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="TypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="StatementTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ChannelId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="ChannelRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AttachmentPageId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="AttachmentTypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="AttachmentTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="SubscriptionId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="SubscriptionRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="AttachmentPageIds"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
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
    @XmlType(name = "", propOrder = {
        "fromDay",
        "toDay",
        "trancheTableId",
        "tranchePid",
        "deliveryAddress",
        "reportMessage"
    })
    public static class Statement {

        @XmlElement(name = "FromDay", required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fromDay;
        @XmlElement(name = "ToDay", required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar toDay;
        @XmlElement(name = "TrancheTableId", required = true, nillable = true)
        protected String trancheTableId;
        @XmlElement(name = "TranchePid", required = true, nillable = true)
        protected String tranchePid;
        @XmlElementRef(name = "DeliveryAddress", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<ContactAddress> deliveryAddress;
        @XmlElementRef(name = "ReportMessage", namespace = "http://schemas.tranzaxis.com/tran.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> reportMessage;
        @XmlAttribute(name = "TypeId")
        protected Long typeId;
        @XmlAttribute(name = "StatementTypeRid")
        protected String statementTypeRid;
        @XmlAttribute(name = "ChannelId")
        protected Long channelId;
        @XmlAttribute(name = "ChannelRid")
        protected String channelRid;
        @XmlAttribute(name = "AttachmentPageId")
        protected Long attachmentPageId;
        @XmlAttribute(name = "AttachmentTypeId")
        protected Long attachmentTypeId;
        @XmlAttribute(name = "AttachmentTypeRid")
        protected String attachmentTypeRid;
        @XmlAttribute(name = "SubscriptionId")
        protected Long subscriptionId;
        @XmlAttribute(name = "SubscriptionRid")
        protected String subscriptionRid;
        @XmlAttribute(name = "AttachmentPageIds")
        protected List<Long> attachmentPageIds;

        /**
         * Gets the value of the fromDay property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFromDay() {
            return fromDay;
        }

        /**
         * Sets the value of the fromDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFromDay(XMLGregorianCalendar value) {
            this.fromDay = value;
        }

        /**
         * Gets the value of the toDay property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getToDay() {
            return toDay;
        }

        /**
         * Sets the value of the toDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setToDay(XMLGregorianCalendar value) {
            this.toDay = value;
        }

        /**
         * Gets the value of the trancheTableId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrancheTableId() {
            return trancheTableId;
        }

        /**
         * Sets the value of the trancheTableId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrancheTableId(String value) {
            this.trancheTableId = value;
        }

        /**
         * Gets the value of the tranchePid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTranchePid() {
            return tranchePid;
        }

        /**
         * Sets the value of the tranchePid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTranchePid(String value) {
            this.tranchePid = value;
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
         * Gets the value of the reportMessage property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getReportMessage() {
            return reportMessage;
        }

        /**
         * Sets the value of the reportMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setReportMessage(JAXBElement<String> value) {
            this.reportMessage = value;
        }

        /**
         * Gets the value of the typeId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTypeId() {
            return typeId;
        }

        /**
         * Sets the value of the typeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTypeId(Long value) {
            this.typeId = value;
        }

        /**
         * Gets the value of the statementTypeRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatementTypeRid() {
            return statementTypeRid;
        }

        /**
         * Sets the value of the statementTypeRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatementTypeRid(String value) {
            this.statementTypeRid = value;
        }

        /**
         * Gets the value of the channelId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getChannelId() {
            return channelId;
        }

        /**
         * Sets the value of the channelId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setChannelId(Long value) {
            this.channelId = value;
        }

        /**
         * Gets the value of the channelRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChannelRid() {
            return channelRid;
        }

        /**
         * Sets the value of the channelRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChannelRid(String value) {
            this.channelRid = value;
        }

        /**
         * Gets the value of the attachmentPageId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAttachmentPageId() {
            return attachmentPageId;
        }

        /**
         * Sets the value of the attachmentPageId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAttachmentPageId(Long value) {
            this.attachmentPageId = value;
        }

        /**
         * Gets the value of the attachmentTypeId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAttachmentTypeId() {
            return attachmentTypeId;
        }

        /**
         * Sets the value of the attachmentTypeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAttachmentTypeId(Long value) {
            this.attachmentTypeId = value;
        }

        /**
         * Gets the value of the attachmentTypeRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttachmentTypeRid() {
            return attachmentTypeRid;
        }

        /**
         * Sets the value of the attachmentTypeRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttachmentTypeRid(String value) {
            this.attachmentTypeRid = value;
        }

        /**
         * Gets the value of the subscriptionId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getSubscriptionId() {
            return subscriptionId;
        }

        /**
         * Sets the value of the subscriptionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setSubscriptionId(Long value) {
            this.subscriptionId = value;
        }

        /**
         * Gets the value of the subscriptionRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubscriptionRid() {
            return subscriptionRid;
        }

        /**
         * Sets the value of the subscriptionRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubscriptionRid(String value) {
            this.subscriptionRid = value;
        }

        /**
         * Gets the value of the attachmentPageIds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attachmentPageIds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttachmentPageIds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getAttachmentPageIds() {
            if (attachmentPageIds == null) {
                attachmentPageIds = new ArrayList<Long>();
            }
            return this.attachmentPageIds;
        }

    }

}
