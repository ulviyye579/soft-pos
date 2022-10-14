
package com.tranzaxis.schemas.tran;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Postings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Postings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Posting" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://schemas.tranzaxis.com/tran.xsd}AccountAttrs"/&gt;
 *                 &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="Sign" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
 *                       &lt;minInclusive value="-1"/&gt;
 *                       &lt;maxInclusive value="1"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="PrimaryEntrySeq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="PrimaryEntryPartSeq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="FinOperKind" type="{http://schemas.tranzaxis.com/tran.xsd}FinOperKindEnum" /&gt;
 *                 &lt;attribute name="RegRole" type="{http://schemas.tranzaxis.com/tran.xsd}RegisterRoleEnum" /&gt;
 *                 &lt;attribute name="Classification" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ClassificationForGl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="GlCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
@XmlType(name = "Postings", propOrder = {
    "posting"
})
public class Postings {

    @XmlElement(name = "Posting")
    protected List<Postings.Posting> posting;

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
     * {@link Postings.Posting }
     * 
     * 
     */
    public List<Postings.Posting> getPosting() {
        if (posting == null) {
            posting = new ArrayList<Postings.Posting>();
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
     *       &lt;attGroup ref="{http://schemas.tranzaxis.com/tran.xsd}AccountAttrs"/&gt;
     *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="Sign" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
     *             &lt;minInclusive value="-1"/&gt;
     *             &lt;maxInclusive value="1"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="PrimaryEntrySeq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="PrimaryEntryPartSeq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="FinOperKind" type="{http://schemas.tranzaxis.com/tran.xsd}FinOperKindEnum" /&gt;
     *       &lt;attribute name="RegRole" type="{http://schemas.tranzaxis.com/tran.xsd}RegisterRoleEnum" /&gt;
     *       &lt;attribute name="Classification" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ClassificationForGl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="GlCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
        @XmlAttribute(name = "Sign", required = true)
        protected int sign;
        @XmlAttribute(name = "Amt", required = true)
        protected BigDecimal amt;
        @XmlAttribute(name = "PrimaryEntrySeq", required = true)
        protected long primaryEntrySeq;
        @XmlAttribute(name = "PrimaryEntryPartSeq", required = true)
        protected long primaryEntryPartSeq;
        @XmlAttribute(name = "FinOperKind")
        protected String finOperKind;
        @XmlAttribute(name = "RegRole")
        protected String regRole;
        @XmlAttribute(name = "Classification")
        protected String classification;
        @XmlAttribute(name = "ClassificationForGl")
        protected String classificationForGl;
        @XmlAttribute(name = "GlCode")
        protected String glCode;
        @XmlAttribute(name = "AccountId", required = true)
        protected long accountId;
        @XmlAttribute(name = "AccountNumber", required = true)
        protected String accountNumber;
        @XmlAttribute(name = "AccountExtNumber")
        protected String accountExtNumber;
        @XmlAttribute(name = "AccountCcy", required = true)
        protected long accountCcy;
        @XmlAttribute(name = "AccountContractId")
        protected Long accountContractId;
        @XmlAttribute(name = "AccountContractRid")
        protected String accountContractRid;
        @XmlAttribute(name = "AccountClientId")
        protected Long accountClientId;
        @XmlAttribute(name = "AccountClientRid")
        protected String accountClientRid;
        @XmlAttribute(name = "AccountTerminalId")
        protected Long accountTerminalId;
        @XmlAttribute(name = "AccountTerminalRid")
        protected String accountTerminalRid;
        @XmlAttribute(name = "AccountPlanGuid", required = true)
        protected String accountPlanGuid;
        @XmlAttribute(name = "AccountPlanCode", required = true)
        protected String accountPlanCode;
        @XmlAttribute(name = "AccountPlanSubCode")
        protected String accountPlanSubCode;
        @XmlAttribute(name = "AccountPlanSyntheticAcctNumber")
        protected String accountPlanSyntheticAcctNumber;
        @XmlAttribute(name = "AccountBranchId")
        protected Long accountBranchId;
        @XmlAttribute(name = "AccountBranchName")
        protected String accountBranchName;
        @XmlAttribute(name = "AccountBranchCode")
        protected Long accountBranchCode;
        @XmlAttribute(name = "AccountClassificationInContract")
        protected String accountClassificationInContract;

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
         * Gets the value of the primaryEntrySeq property.
         * 
         */
        public long getPrimaryEntrySeq() {
            return primaryEntrySeq;
        }

        /**
         * Sets the value of the primaryEntrySeq property.
         * 
         */
        public void setPrimaryEntrySeq(long value) {
            this.primaryEntrySeq = value;
        }

        /**
         * Gets the value of the primaryEntryPartSeq property.
         * 
         */
        public long getPrimaryEntryPartSeq() {
            return primaryEntryPartSeq;
        }

        /**
         * Sets the value of the primaryEntryPartSeq property.
         * 
         */
        public void setPrimaryEntryPartSeq(long value) {
            this.primaryEntryPartSeq = value;
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
         * Gets the value of the regRole property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegRole() {
            return regRole;
        }

        /**
         * Sets the value of the regRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegRole(String value) {
            this.regRole = value;
        }

        /**
         * Gets the value of the classification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassification() {
            return classification;
        }

        /**
         * Sets the value of the classification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassification(String value) {
            this.classification = value;
        }

        /**
         * Gets the value of the classificationForGl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassificationForGl() {
            return classificationForGl;
        }

        /**
         * Sets the value of the classificationForGl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassificationForGl(String value) {
            this.classificationForGl = value;
        }

        /**
         * Gets the value of the glCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGlCode() {
            return glCode;
        }

        /**
         * Sets the value of the glCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGlCode(String value) {
            this.glCode = value;
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
         * Gets the value of the accountNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountNumber() {
            return accountNumber;
        }

        /**
         * Sets the value of the accountNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountNumber(String value) {
            this.accountNumber = value;
        }

        /**
         * Gets the value of the accountExtNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountExtNumber() {
            return accountExtNumber;
        }

        /**
         * Sets the value of the accountExtNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountExtNumber(String value) {
            this.accountExtNumber = value;
        }

        /**
         * Gets the value of the accountCcy property.
         * 
         */
        public long getAccountCcy() {
            return accountCcy;
        }

        /**
         * Sets the value of the accountCcy property.
         * 
         */
        public void setAccountCcy(long value) {
            this.accountCcy = value;
        }

        /**
         * Gets the value of the accountContractId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAccountContractId() {
            return accountContractId;
        }

        /**
         * Sets the value of the accountContractId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAccountContractId(Long value) {
            this.accountContractId = value;
        }

        /**
         * Gets the value of the accountContractRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountContractRid() {
            return accountContractRid;
        }

        /**
         * Sets the value of the accountContractRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountContractRid(String value) {
            this.accountContractRid = value;
        }

        /**
         * Gets the value of the accountClientId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAccountClientId() {
            return accountClientId;
        }

        /**
         * Sets the value of the accountClientId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAccountClientId(Long value) {
            this.accountClientId = value;
        }

        /**
         * Gets the value of the accountClientRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountClientRid() {
            return accountClientRid;
        }

        /**
         * Sets the value of the accountClientRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountClientRid(String value) {
            this.accountClientRid = value;
        }

        /**
         * Gets the value of the accountTerminalId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAccountTerminalId() {
            return accountTerminalId;
        }

        /**
         * Sets the value of the accountTerminalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAccountTerminalId(Long value) {
            this.accountTerminalId = value;
        }

        /**
         * Gets the value of the accountTerminalRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountTerminalRid() {
            return accountTerminalRid;
        }

        /**
         * Sets the value of the accountTerminalRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountTerminalRid(String value) {
            this.accountTerminalRid = value;
        }

        /**
         * Gets the value of the accountPlanGuid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountPlanGuid() {
            return accountPlanGuid;
        }

        /**
         * Sets the value of the accountPlanGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountPlanGuid(String value) {
            this.accountPlanGuid = value;
        }

        /**
         * Gets the value of the accountPlanCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountPlanCode() {
            return accountPlanCode;
        }

        /**
         * Sets the value of the accountPlanCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountPlanCode(String value) {
            this.accountPlanCode = value;
        }

        /**
         * Gets the value of the accountPlanSubCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountPlanSubCode() {
            return accountPlanSubCode;
        }

        /**
         * Sets the value of the accountPlanSubCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountPlanSubCode(String value) {
            this.accountPlanSubCode = value;
        }

        /**
         * Gets the value of the accountPlanSyntheticAcctNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountPlanSyntheticAcctNumber() {
            return accountPlanSyntheticAcctNumber;
        }

        /**
         * Sets the value of the accountPlanSyntheticAcctNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountPlanSyntheticAcctNumber(String value) {
            this.accountPlanSyntheticAcctNumber = value;
        }

        /**
         * Gets the value of the accountBranchId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAccountBranchId() {
            return accountBranchId;
        }

        /**
         * Sets the value of the accountBranchId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAccountBranchId(Long value) {
            this.accountBranchId = value;
        }

        /**
         * Gets the value of the accountBranchName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountBranchName() {
            return accountBranchName;
        }

        /**
         * Sets the value of the accountBranchName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountBranchName(String value) {
            this.accountBranchName = value;
        }

        /**
         * Gets the value of the accountBranchCode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAccountBranchCode() {
            return accountBranchCode;
        }

        /**
         * Sets the value of the accountBranchCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAccountBranchCode(Long value) {
            this.accountBranchCode = value;
        }

        /**
         * Gets the value of the accountClassificationInContract property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountClassificationInContract() {
            return accountClassificationInContract;
        }

        /**
         * Sets the value of the accountClassificationInContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountClassificationInContract(String value) {
            this.accountClassificationInContract = value;
        }

    }

}
