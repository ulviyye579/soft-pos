
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
 * <p>Java class for HoldActions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HoldActions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Action" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CategoryText" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *                 &lt;attGroup ref="{http://schemas.tranzaxis.com/tran.xsd}AccountAttrs"/&gt;
 *                 &lt;attribute name="HoldId" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="HoldKind" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}HoldKindEnum" /&gt;
 *                 &lt;attribute name="HoldSign" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
 *                       &lt;minInclusive value="-1"/&gt;
 *                       &lt;maxInclusive value="1"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ActionKind" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}HoldActionKindEnum" /&gt;
 *                 &lt;attribute name="AmtDelta" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="OrigAmtDelta" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="OrigCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="CategoryCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
@XmlType(name = "HoldActions", propOrder = {
    "action"
})
public class HoldActions {

    @XmlElement(name = "Action")
    protected List<HoldActions.Action> action;

    /**
     * Gets the value of the action property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoldActions.Action }
     * 
     * 
     */
    public List<HoldActions.Action> getAction() {
        if (action == null) {
            action = new ArrayList<HoldActions.Action>();
        }
        return this.action;
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
     *       &lt;all&gt;
     *         &lt;element name="CategoryText" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *       &lt;attGroup ref="{http://schemas.tranzaxis.com/tran.xsd}AccountAttrs"/&gt;
     *       &lt;attribute name="HoldId" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="HoldKind" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}HoldKindEnum" /&gt;
     *       &lt;attribute name="HoldSign" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
     *             &lt;minInclusive value="-1"/&gt;
     *             &lt;maxInclusive value="1"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ActionKind" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}HoldActionKindEnum" /&gt;
     *       &lt;attribute name="AmtDelta" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="OrigAmtDelta" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="OrigCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="CategoryCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Action {

        @XmlElement(name = "CategoryText")
        protected String categoryText;
        @XmlAttribute(name = "HoldId", required = true)
        protected long holdId;
        @XmlAttribute(name = "HoldKind", required = true)
        protected String holdKind;
        @XmlAttribute(name = "HoldSign", required = true)
        protected int holdSign;
        @XmlAttribute(name = "ActionKind", required = true)
        protected long actionKind;
        @XmlAttribute(name = "AmtDelta", required = true)
        protected BigDecimal amtDelta;
        @XmlAttribute(name = "OrigAmtDelta")
        protected BigDecimal origAmtDelta;
        @XmlAttribute(name = "OrigCcy")
        protected Long origCcy;
        @XmlAttribute(name = "CategoryCode")
        protected String categoryCode;
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
         * Gets the value of the categoryText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategoryText() {
            return categoryText;
        }

        /**
         * Sets the value of the categoryText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategoryText(String value) {
            this.categoryText = value;
        }

        /**
         * Gets the value of the holdId property.
         * 
         */
        public long getHoldId() {
            return holdId;
        }

        /**
         * Sets the value of the holdId property.
         * 
         */
        public void setHoldId(long value) {
            this.holdId = value;
        }

        /**
         * Gets the value of the holdKind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHoldKind() {
            return holdKind;
        }

        /**
         * Sets the value of the holdKind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHoldKind(String value) {
            this.holdKind = value;
        }

        /**
         * Gets the value of the holdSign property.
         * 
         */
        public int getHoldSign() {
            return holdSign;
        }

        /**
         * Sets the value of the holdSign property.
         * 
         */
        public void setHoldSign(int value) {
            this.holdSign = value;
        }

        /**
         * Gets the value of the actionKind property.
         * 
         */
        public long getActionKind() {
            return actionKind;
        }

        /**
         * Sets the value of the actionKind property.
         * 
         */
        public void setActionKind(long value) {
            this.actionKind = value;
        }

        /**
         * Gets the value of the amtDelta property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmtDelta() {
            return amtDelta;
        }

        /**
         * Sets the value of the amtDelta property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmtDelta(BigDecimal value) {
            this.amtDelta = value;
        }

        /**
         * Gets the value of the origAmtDelta property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOrigAmtDelta() {
            return origAmtDelta;
        }

        /**
         * Sets the value of the origAmtDelta property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOrigAmtDelta(BigDecimal value) {
            this.origAmtDelta = value;
        }

        /**
         * Gets the value of the origCcy property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOrigCcy() {
            return origCcy;
        }

        /**
         * Sets the value of the origCcy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOrigCcy(Long value) {
            this.origCcy = value;
        }

        /**
         * Gets the value of the categoryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategoryCode() {
            return categoryCode;
        }

        /**
         * Sets the value of the categoryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategoryCode(String value) {
            this.categoryCode = value;
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
