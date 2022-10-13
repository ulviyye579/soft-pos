
package com.tranzaxis.schemas.contracts_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.common.UserFunc;


/**
 * <p>Java class for CasOperEntryPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CasOperEntryPart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Val1Func" type="{http://schemas.radixware.org/common.xsd}UserFunc"/&gt;
 *         &lt;element name="AdjustAcctFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Signum" use="required" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CPostingSign" /&gt;
 *       &lt;attribute name="ExecutorIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="RegRole" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CRegisterRole" /&gt;
 *       &lt;attribute name="RegRoleIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="AcctRole" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="RegClassificationIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="EpClassificationIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="EpLinksIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="AccountCcyVariant" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CAccountCcyVariant" /&gt;
 *       &lt;attribute name="AcctCcyIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="AcctCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Val1Variant" use="required" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CEntryCcyVariant" /&gt;
 *       &lt;attribute name="Val1MoneyIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Val1AcctRoleName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Val1Negate" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="Val1Round" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="Val2Variant" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CEntryCcyVariant" /&gt;
 *       &lt;attribute name="Val2MoneyIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Val2Negate" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="Val2Round" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="ValStoreVariant" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CEntryValStoreVariant" /&gt;
 *       &lt;attribute name="ValStoreMoneyIdx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CasOperEntryPart", propOrder = {
    "val1Func",
    "adjustAcctFunc"
})
public class CasOperEntryPart {

    @XmlElement(name = "Val1Func", required = true)
    protected UserFunc val1Func;
    @XmlElement(name = "AdjustAcctFunc", required = true)
    protected UserFunc adjustAcctFunc;
    @XmlAttribute(name = "Signum", required = true)
    protected long signum;
    @XmlAttribute(name = "ExecutorIdx")
    protected Long executorIdx;
    @XmlAttribute(name = "RegRole")
    protected String regRole;
    @XmlAttribute(name = "RegRoleIdx")
    protected Long regRoleIdx;
    @XmlAttribute(name = "AcctRole")
    protected String acctRole;
    @XmlAttribute(name = "RegClassificationIdx")
    protected Long regClassificationIdx;
    @XmlAttribute(name = "EpClassificationIdx")
    protected Long epClassificationIdx;
    @XmlAttribute(name = "EpLinksIdx")
    protected Long epLinksIdx;
    @XmlAttribute(name = "AccountCcyVariant")
    protected String accountCcyVariant;
    @XmlAttribute(name = "AcctCcyIdx")
    protected Long acctCcyIdx;
    @XmlAttribute(name = "AcctCcy")
    protected Long acctCcy;
    @XmlAttribute(name = "Val1Variant", required = true)
    protected String val1Variant;
    @XmlAttribute(name = "Val1MoneyIdx")
    protected Long val1MoneyIdx;
    @XmlAttribute(name = "Val1AcctRoleName")
    protected String val1AcctRoleName;
    @XmlAttribute(name = "Val1Negate", required = true)
    protected boolean val1Negate;
    @XmlAttribute(name = "Val1Round", required = true)
    protected boolean val1Round;
    @XmlAttribute(name = "Val2Variant")
    protected String val2Variant;
    @XmlAttribute(name = "Val2MoneyIdx")
    protected Long val2MoneyIdx;
    @XmlAttribute(name = "Val2Negate", required = true)
    protected boolean val2Negate;
    @XmlAttribute(name = "Val2Round", required = true)
    protected boolean val2Round;
    @XmlAttribute(name = "ValStoreVariant")
    protected String valStoreVariant;
    @XmlAttribute(name = "ValStoreMoneyIdx")
    protected Long valStoreMoneyIdx;

    /**
     * Gets the value of the val1Func property.
     * 
     * @return
     *     possible object is
     *     {@link UserFunc }
     *     
     */
    public UserFunc getVal1Func() {
        return val1Func;
    }

    /**
     * Sets the value of the val1Func property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFunc }
     *     
     */
    public void setVal1Func(UserFunc value) {
        this.val1Func = value;
    }

    /**
     * Gets the value of the adjustAcctFunc property.
     * 
     * @return
     *     possible object is
     *     {@link UserFunc }
     *     
     */
    public UserFunc getAdjustAcctFunc() {
        return adjustAcctFunc;
    }

    /**
     * Sets the value of the adjustAcctFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFunc }
     *     
     */
    public void setAdjustAcctFunc(UserFunc value) {
        this.adjustAcctFunc = value;
    }

    /**
     * Gets the value of the signum property.
     * 
     */
    public long getSignum() {
        return signum;
    }

    /**
     * Sets the value of the signum property.
     * 
     */
    public void setSignum(long value) {
        this.signum = value;
    }

    /**
     * Gets the value of the executorIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExecutorIdx() {
        return executorIdx;
    }

    /**
     * Sets the value of the executorIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExecutorIdx(Long value) {
        this.executorIdx = value;
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
     * Gets the value of the regRoleIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegRoleIdx() {
        return regRoleIdx;
    }

    /**
     * Sets the value of the regRoleIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegRoleIdx(Long value) {
        this.regRoleIdx = value;
    }

    /**
     * Gets the value of the acctRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctRole() {
        return acctRole;
    }

    /**
     * Sets the value of the acctRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctRole(String value) {
        this.acctRole = value;
    }

    /**
     * Gets the value of the regClassificationIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegClassificationIdx() {
        return regClassificationIdx;
    }

    /**
     * Sets the value of the regClassificationIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegClassificationIdx(Long value) {
        this.regClassificationIdx = value;
    }

    /**
     * Gets the value of the epClassificationIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEpClassificationIdx() {
        return epClassificationIdx;
    }

    /**
     * Sets the value of the epClassificationIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEpClassificationIdx(Long value) {
        this.epClassificationIdx = value;
    }

    /**
     * Gets the value of the epLinksIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEpLinksIdx() {
        return epLinksIdx;
    }

    /**
     * Sets the value of the epLinksIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEpLinksIdx(Long value) {
        this.epLinksIdx = value;
    }

    /**
     * Gets the value of the accountCcyVariant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCcyVariant() {
        return accountCcyVariant;
    }

    /**
     * Sets the value of the accountCcyVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCcyVariant(String value) {
        this.accountCcyVariant = value;
    }

    /**
     * Gets the value of the acctCcyIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAcctCcyIdx() {
        return acctCcyIdx;
    }

    /**
     * Sets the value of the acctCcyIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAcctCcyIdx(Long value) {
        this.acctCcyIdx = value;
    }

    /**
     * Gets the value of the acctCcy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAcctCcy() {
        return acctCcy;
    }

    /**
     * Sets the value of the acctCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAcctCcy(Long value) {
        this.acctCcy = value;
    }

    /**
     * Gets the value of the val1Variant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVal1Variant() {
        return val1Variant;
    }

    /**
     * Sets the value of the val1Variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVal1Variant(String value) {
        this.val1Variant = value;
    }

    /**
     * Gets the value of the val1MoneyIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVal1MoneyIdx() {
        return val1MoneyIdx;
    }

    /**
     * Sets the value of the val1MoneyIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVal1MoneyIdx(Long value) {
        this.val1MoneyIdx = value;
    }

    /**
     * Gets the value of the val1AcctRoleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVal1AcctRoleName() {
        return val1AcctRoleName;
    }

    /**
     * Sets the value of the val1AcctRoleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVal1AcctRoleName(String value) {
        this.val1AcctRoleName = value;
    }

    /**
     * Gets the value of the val1Negate property.
     * 
     */
    public boolean isVal1Negate() {
        return val1Negate;
    }

    /**
     * Sets the value of the val1Negate property.
     * 
     */
    public void setVal1Negate(boolean value) {
        this.val1Negate = value;
    }

    /**
     * Gets the value of the val1Round property.
     * 
     */
    public boolean isVal1Round() {
        return val1Round;
    }

    /**
     * Sets the value of the val1Round property.
     * 
     */
    public void setVal1Round(boolean value) {
        this.val1Round = value;
    }

    /**
     * Gets the value of the val2Variant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVal2Variant() {
        return val2Variant;
    }

    /**
     * Sets the value of the val2Variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVal2Variant(String value) {
        this.val2Variant = value;
    }

    /**
     * Gets the value of the val2MoneyIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVal2MoneyIdx() {
        return val2MoneyIdx;
    }

    /**
     * Sets the value of the val2MoneyIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVal2MoneyIdx(Long value) {
        this.val2MoneyIdx = value;
    }

    /**
     * Gets the value of the val2Negate property.
     * 
     */
    public boolean isVal2Negate() {
        return val2Negate;
    }

    /**
     * Sets the value of the val2Negate property.
     * 
     */
    public void setVal2Negate(boolean value) {
        this.val2Negate = value;
    }

    /**
     * Gets the value of the val2Round property.
     * 
     */
    public boolean isVal2Round() {
        return val2Round;
    }

    /**
     * Sets the value of the val2Round property.
     * 
     */
    public void setVal2Round(boolean value) {
        this.val2Round = value;
    }

    /**
     * Gets the value of the valStoreVariant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValStoreVariant() {
        return valStoreVariant;
    }

    /**
     * Sets the value of the valStoreVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValStoreVariant(String value) {
        this.valStoreVariant = value;
    }

    /**
     * Gets the value of the valStoreMoneyIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValStoreMoneyIdx() {
        return valStoreMoneyIdx;
    }

    /**
     * Sets the value of the valStoreMoneyIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValStoreMoneyIdx(Long value) {
        this.valStoreMoneyIdx = value;
    }

}
