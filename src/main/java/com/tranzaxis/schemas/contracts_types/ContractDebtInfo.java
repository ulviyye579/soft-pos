
package com.tranzaxis.schemas.contracts_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.radixware.schemas.common.MoneyValue;


/**
 * <p>Java class for ContractDebtInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractDebtInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comment" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Deposit" type="{http://schemas.tranzaxis.com/contracts-types.xsd}MoneySet" minOccurs="0"/&gt;
 *         &lt;element name="DepositTotal" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *         &lt;element name="LoanPrincipal" type="{http://schemas.tranzaxis.com/contracts-types.xsd}MoneySet" minOccurs="0"/&gt;
 *         &lt;element name="LoanPrincipalTotal" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *         &lt;element name="LoanInterests" type="{http://schemas.tranzaxis.com/contracts-types.xsd}MoneySet" minOccurs="0"/&gt;
 *         &lt;element name="LoanInterestTotal" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *         &lt;element name="OverdueCharges" type="{http://schemas.tranzaxis.com/contracts-types.xsd}MoneySet" minOccurs="0"/&gt;
 *         &lt;element name="OverdueChargeTotal" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *         &lt;element name="OverlimitChargeTotal" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *         &lt;element name="OwnFunds" type="{http://schemas.tranzaxis.com/contracts-types.xsd}MoneySet" minOccurs="0"/&gt;
 *         &lt;element name="OwnFundsTotal" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *         &lt;element name="OwnFundsInterests" type="{http://schemas.tranzaxis.com/contracts-types.xsd}MoneySet" minOccurs="0"/&gt;
 *         &lt;element name="OwnFundsInterestTotal" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCharges" type="{http://schemas.tranzaxis.com/contracts-types.xsd}MoneySet" minOccurs="0"/&gt;
 *         &lt;element name="ServiceChargeTotal" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *         &lt;element name="EarlyRepaymentCharge" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *         &lt;element name="Totals" type="{http://schemas.tranzaxis.com/contracts-types.xsd}MoneySet" minOccurs="0"/&gt;
 *         &lt;element name="TotalDebt" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *         &lt;element name="OverdueLoans" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OverdueLoan" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Kind" type="{http://schemas.tranzaxis.com/contracts-types.xsd}ContractDebtKind" minOccurs="0"/&gt;
 *                             &lt;element name="Money" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OverdueLoanTotal" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *         &lt;element name="TechOvers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TechOver" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Kind" type="{http://schemas.tranzaxis.com/contracts-types.xsd}ContractDebtKind" minOccurs="0"/&gt;
 *                             &lt;element name="Money" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TechOverTotal" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *         &lt;element name="OverdueDebts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OverdueDebt" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Kind" type="{http://schemas.tranzaxis.com/contracts-types.xsd}ContractDebtKind" minOccurs="0"/&gt;
 *                             &lt;element name="Money" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OverdueDebtTotal" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CalcDay" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractDebtInfo", propOrder = {
    "comment",
    "deposit",
    "depositTotal",
    "loanPrincipal",
    "loanPrincipalTotal",
    "loanInterests",
    "loanInterestTotal",
    "overdueCharges",
    "overdueChargeTotal",
    "overlimitChargeTotal",
    "ownFunds",
    "ownFundsTotal",
    "ownFundsInterests",
    "ownFundsInterestTotal",
    "serviceCharges",
    "serviceChargeTotal",
    "earlyRepaymentCharge",
    "totals",
    "totalDebt",
    "overdueLoans",
    "overdueLoanTotal",
    "techOvers",
    "techOverTotal",
    "overdueDebts",
    "overdueDebtTotal"
})
public class ContractDebtInfo {

    @XmlElementRef(name = "Comment", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "Deposit", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneySet> deposit;
    @XmlElementRef(name = "DepositTotal", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneyValue> depositTotal;
    @XmlElementRef(name = "LoanPrincipal", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneySet> loanPrincipal;
    @XmlElementRef(name = "LoanPrincipalTotal", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneyValue> loanPrincipalTotal;
    @XmlElementRef(name = "LoanInterests", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneySet> loanInterests;
    @XmlElementRef(name = "LoanInterestTotal", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneyValue> loanInterestTotal;
    @XmlElementRef(name = "OverdueCharges", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneySet> overdueCharges;
    @XmlElementRef(name = "OverdueChargeTotal", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneyValue> overdueChargeTotal;
    @XmlElementRef(name = "OverlimitChargeTotal", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneyValue> overlimitChargeTotal;
    @XmlElementRef(name = "OwnFunds", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneySet> ownFunds;
    @XmlElementRef(name = "OwnFundsTotal", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneyValue> ownFundsTotal;
    @XmlElementRef(name = "OwnFundsInterests", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneySet> ownFundsInterests;
    @XmlElementRef(name = "OwnFundsInterestTotal", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneyValue> ownFundsInterestTotal;
    @XmlElementRef(name = "ServiceCharges", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneySet> serviceCharges;
    @XmlElementRef(name = "ServiceChargeTotal", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneyValue> serviceChargeTotal;
    @XmlElementRef(name = "EarlyRepaymentCharge", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneyValue> earlyRepaymentCharge;
    @XmlElementRef(name = "Totals", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneySet> totals;
    @XmlElementRef(name = "TotalDebt", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneyValue> totalDebt;
    @XmlElement(name = "OverdueLoans")
    protected ContractDebtInfo.OverdueLoans overdueLoans;
    @XmlElementRef(name = "OverdueLoanTotal", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneyValue> overdueLoanTotal;
    @XmlElement(name = "TechOvers")
    protected ContractDebtInfo.TechOvers techOvers;
    @XmlElementRef(name = "TechOverTotal", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneyValue> techOverTotal;
    @XmlElement(name = "OverdueDebts")
    protected ContractDebtInfo.OverdueDebts overdueDebts;
    @XmlElementRef(name = "OverdueDebtTotal", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MoneyValue> overdueDebtTotal;
    @XmlAttribute(name = "CalcDay")
    protected XMLGregorianCalendar calcDay;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = value;
    }

    /**
     * Gets the value of the deposit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     *     
     */
    public JAXBElement<MoneySet> getDeposit() {
        return deposit;
    }

    /**
     * Sets the value of the deposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     *     
     */
    public void setDeposit(JAXBElement<MoneySet> value) {
        this.deposit = value;
    }

    /**
     * Gets the value of the depositTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public JAXBElement<MoneyValue> getDepositTotal() {
        return depositTotal;
    }

    /**
     * Sets the value of the depositTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public void setDepositTotal(JAXBElement<MoneyValue> value) {
        this.depositTotal = value;
    }

    /**
     * Gets the value of the loanPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     *     
     */
    public JAXBElement<MoneySet> getLoanPrincipal() {
        return loanPrincipal;
    }

    /**
     * Sets the value of the loanPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     *     
     */
    public void setLoanPrincipal(JAXBElement<MoneySet> value) {
        this.loanPrincipal = value;
    }

    /**
     * Gets the value of the loanPrincipalTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public JAXBElement<MoneyValue> getLoanPrincipalTotal() {
        return loanPrincipalTotal;
    }

    /**
     * Sets the value of the loanPrincipalTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public void setLoanPrincipalTotal(JAXBElement<MoneyValue> value) {
        this.loanPrincipalTotal = value;
    }

    /**
     * Gets the value of the loanInterests property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     *     
     */
    public JAXBElement<MoneySet> getLoanInterests() {
        return loanInterests;
    }

    /**
     * Sets the value of the loanInterests property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     *     
     */
    public void setLoanInterests(JAXBElement<MoneySet> value) {
        this.loanInterests = value;
    }

    /**
     * Gets the value of the loanInterestTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public JAXBElement<MoneyValue> getLoanInterestTotal() {
        return loanInterestTotal;
    }

    /**
     * Sets the value of the loanInterestTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public void setLoanInterestTotal(JAXBElement<MoneyValue> value) {
        this.loanInterestTotal = value;
    }

    /**
     * Gets the value of the overdueCharges property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     *     
     */
    public JAXBElement<MoneySet> getOverdueCharges() {
        return overdueCharges;
    }

    /**
     * Sets the value of the overdueCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     *     
     */
    public void setOverdueCharges(JAXBElement<MoneySet> value) {
        this.overdueCharges = value;
    }

    /**
     * Gets the value of the overdueChargeTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public JAXBElement<MoneyValue> getOverdueChargeTotal() {
        return overdueChargeTotal;
    }

    /**
     * Sets the value of the overdueChargeTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public void setOverdueChargeTotal(JAXBElement<MoneyValue> value) {
        this.overdueChargeTotal = value;
    }

    /**
     * Gets the value of the overlimitChargeTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public JAXBElement<MoneyValue> getOverlimitChargeTotal() {
        return overlimitChargeTotal;
    }

    /**
     * Sets the value of the overlimitChargeTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public void setOverlimitChargeTotal(JAXBElement<MoneyValue> value) {
        this.overlimitChargeTotal = value;
    }

    /**
     * Gets the value of the ownFunds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     *     
     */
    public JAXBElement<MoneySet> getOwnFunds() {
        return ownFunds;
    }

    /**
     * Sets the value of the ownFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     *     
     */
    public void setOwnFunds(JAXBElement<MoneySet> value) {
        this.ownFunds = value;
    }

    /**
     * Gets the value of the ownFundsTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public JAXBElement<MoneyValue> getOwnFundsTotal() {
        return ownFundsTotal;
    }

    /**
     * Sets the value of the ownFundsTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public void setOwnFundsTotal(JAXBElement<MoneyValue> value) {
        this.ownFundsTotal = value;
    }

    /**
     * Gets the value of the ownFundsInterests property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     *     
     */
    public JAXBElement<MoneySet> getOwnFundsInterests() {
        return ownFundsInterests;
    }

    /**
     * Sets the value of the ownFundsInterests property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     *     
     */
    public void setOwnFundsInterests(JAXBElement<MoneySet> value) {
        this.ownFundsInterests = value;
    }

    /**
     * Gets the value of the ownFundsInterestTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public JAXBElement<MoneyValue> getOwnFundsInterestTotal() {
        return ownFundsInterestTotal;
    }

    /**
     * Sets the value of the ownFundsInterestTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public void setOwnFundsInterestTotal(JAXBElement<MoneyValue> value) {
        this.ownFundsInterestTotal = value;
    }

    /**
     * Gets the value of the serviceCharges property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     *     
     */
    public JAXBElement<MoneySet> getServiceCharges() {
        return serviceCharges;
    }

    /**
     * Sets the value of the serviceCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     *     
     */
    public void setServiceCharges(JAXBElement<MoneySet> value) {
        this.serviceCharges = value;
    }

    /**
     * Gets the value of the serviceChargeTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public JAXBElement<MoneyValue> getServiceChargeTotal() {
        return serviceChargeTotal;
    }

    /**
     * Sets the value of the serviceChargeTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public void setServiceChargeTotal(JAXBElement<MoneyValue> value) {
        this.serviceChargeTotal = value;
    }

    /**
     * Gets the value of the earlyRepaymentCharge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public JAXBElement<MoneyValue> getEarlyRepaymentCharge() {
        return earlyRepaymentCharge;
    }

    /**
     * Sets the value of the earlyRepaymentCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public void setEarlyRepaymentCharge(JAXBElement<MoneyValue> value) {
        this.earlyRepaymentCharge = value;
    }

    /**
     * Gets the value of the totals property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     *     
     */
    public JAXBElement<MoneySet> getTotals() {
        return totals;
    }

    /**
     * Sets the value of the totals property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneySet }{@code >}
     *     
     */
    public void setTotals(JAXBElement<MoneySet> value) {
        this.totals = value;
    }

    /**
     * Gets the value of the totalDebt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public JAXBElement<MoneyValue> getTotalDebt() {
        return totalDebt;
    }

    /**
     * Sets the value of the totalDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public void setTotalDebt(JAXBElement<MoneyValue> value) {
        this.totalDebt = value;
    }

    /**
     * Gets the value of the overdueLoans property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDebtInfo.OverdueLoans }
     *     
     */
    public ContractDebtInfo.OverdueLoans getOverdueLoans() {
        return overdueLoans;
    }

    /**
     * Sets the value of the overdueLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDebtInfo.OverdueLoans }
     *     
     */
    public void setOverdueLoans(ContractDebtInfo.OverdueLoans value) {
        this.overdueLoans = value;
    }

    /**
     * Gets the value of the overdueLoanTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public JAXBElement<MoneyValue> getOverdueLoanTotal() {
        return overdueLoanTotal;
    }

    /**
     * Sets the value of the overdueLoanTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public void setOverdueLoanTotal(JAXBElement<MoneyValue> value) {
        this.overdueLoanTotal = value;
    }

    /**
     * Gets the value of the techOvers property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDebtInfo.TechOvers }
     *     
     */
    public ContractDebtInfo.TechOvers getTechOvers() {
        return techOvers;
    }

    /**
     * Sets the value of the techOvers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDebtInfo.TechOvers }
     *     
     */
    public void setTechOvers(ContractDebtInfo.TechOvers value) {
        this.techOvers = value;
    }

    /**
     * Gets the value of the techOverTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public JAXBElement<MoneyValue> getTechOverTotal() {
        return techOverTotal;
    }

    /**
     * Sets the value of the techOverTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public void setTechOverTotal(JAXBElement<MoneyValue> value) {
        this.techOverTotal = value;
    }

    /**
     * Gets the value of the overdueDebts property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDebtInfo.OverdueDebts }
     *     
     */
    public ContractDebtInfo.OverdueDebts getOverdueDebts() {
        return overdueDebts;
    }

    /**
     * Sets the value of the overdueDebts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDebtInfo.OverdueDebts }
     *     
     */
    public void setOverdueDebts(ContractDebtInfo.OverdueDebts value) {
        this.overdueDebts = value;
    }

    /**
     * Gets the value of the overdueDebtTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public JAXBElement<MoneyValue> getOverdueDebtTotal() {
        return overdueDebtTotal;
    }

    /**
     * Sets the value of the overdueDebtTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
     *     
     */
    public void setOverdueDebtTotal(JAXBElement<MoneyValue> value) {
        this.overdueDebtTotal = value;
    }

    /**
     * Gets the value of the calcDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalcDay() {
        return calcDay;
    }

    /**
     * Sets the value of the calcDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalcDay(XMLGregorianCalendar value) {
        this.calcDay = value;
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
     *         &lt;element name="OverdueDebt" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Kind" type="{http://schemas.tranzaxis.com/contracts-types.xsd}ContractDebtKind" minOccurs="0"/&gt;
     *                   &lt;element name="Money" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "overdueDebt"
    })
    public static class OverdueDebts {

        @XmlElement(name = "OverdueDebt")
        protected List<ContractDebtInfo.OverdueDebts.OverdueDebt> overdueDebt;

        /**
         * Gets the value of the overdueDebt property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the overdueDebt property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOverdueDebt().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContractDebtInfo.OverdueDebts.OverdueDebt }
         * 
         * 
         */
        public List<ContractDebtInfo.OverdueDebts.OverdueDebt> getOverdueDebt() {
            if (overdueDebt == null) {
                overdueDebt = new ArrayList<ContractDebtInfo.OverdueDebts.OverdueDebt>();
            }
            return this.overdueDebt;
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
         *         &lt;element name="Kind" type="{http://schemas.tranzaxis.com/contracts-types.xsd}ContractDebtKind" minOccurs="0"/&gt;
         *         &lt;element name="Money" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
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
            "kind",
            "money"
        })
        public static class OverdueDebt {

            @XmlElementRef(name = "Kind", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<String> kind;
            @XmlElementRef(name = "Money", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<MoneyValue> money;

            /**
             * Gets the value of the kind property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getKind() {
                return kind;
            }

            /**
             * Sets the value of the kind property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setKind(JAXBElement<String> value) {
                this.kind = value;
            }

            /**
             * Gets the value of the money property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
             *     
             */
            public JAXBElement<MoneyValue> getMoney() {
                return money;
            }

            /**
             * Sets the value of the money property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
             *     
             */
            public void setMoney(JAXBElement<MoneyValue> value) {
                this.money = value;
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
     *         &lt;element name="OverdueLoan" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Kind" type="{http://schemas.tranzaxis.com/contracts-types.xsd}ContractDebtKind" minOccurs="0"/&gt;
     *                   &lt;element name="Money" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "overdueLoan"
    })
    public static class OverdueLoans {

        @XmlElement(name = "OverdueLoan")
        protected List<ContractDebtInfo.OverdueLoans.OverdueLoan> overdueLoan;

        /**
         * Gets the value of the overdueLoan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the overdueLoan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOverdueLoan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContractDebtInfo.OverdueLoans.OverdueLoan }
         * 
         * 
         */
        public List<ContractDebtInfo.OverdueLoans.OverdueLoan> getOverdueLoan() {
            if (overdueLoan == null) {
                overdueLoan = new ArrayList<ContractDebtInfo.OverdueLoans.OverdueLoan>();
            }
            return this.overdueLoan;
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
         *         &lt;element name="Kind" type="{http://schemas.tranzaxis.com/contracts-types.xsd}ContractDebtKind" minOccurs="0"/&gt;
         *         &lt;element name="Money" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
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
            "kind",
            "money"
        })
        public static class OverdueLoan {

            @XmlElementRef(name = "Kind", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<String> kind;
            @XmlElementRef(name = "Money", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<MoneyValue> money;

            /**
             * Gets the value of the kind property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getKind() {
                return kind;
            }

            /**
             * Sets the value of the kind property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setKind(JAXBElement<String> value) {
                this.kind = value;
            }

            /**
             * Gets the value of the money property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
             *     
             */
            public JAXBElement<MoneyValue> getMoney() {
                return money;
            }

            /**
             * Sets the value of the money property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
             *     
             */
            public void setMoney(JAXBElement<MoneyValue> value) {
                this.money = value;
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
     *         &lt;element name="TechOver" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Kind" type="{http://schemas.tranzaxis.com/contracts-types.xsd}ContractDebtKind" minOccurs="0"/&gt;
     *                   &lt;element name="Money" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "techOver"
    })
    public static class TechOvers {

        @XmlElement(name = "TechOver")
        protected List<ContractDebtInfo.TechOvers.TechOver> techOver;

        /**
         * Gets the value of the techOver property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the techOver property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTechOver().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContractDebtInfo.TechOvers.TechOver }
         * 
         * 
         */
        public List<ContractDebtInfo.TechOvers.TechOver> getTechOver() {
            if (techOver == null) {
                techOver = new ArrayList<ContractDebtInfo.TechOvers.TechOver>();
            }
            return this.techOver;
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
         *         &lt;element name="Kind" type="{http://schemas.tranzaxis.com/contracts-types.xsd}ContractDebtKind" minOccurs="0"/&gt;
         *         &lt;element name="Money" type="{http://schemas.radixware.org/common.xsd}MoneyValue" minOccurs="0"/&gt;
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
            "kind",
            "money"
        })
        public static class TechOver {

            @XmlElementRef(name = "Kind", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<String> kind;
            @XmlElementRef(name = "Money", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<MoneyValue> money;

            /**
             * Gets the value of the kind property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getKind() {
                return kind;
            }

            /**
             * Sets the value of the kind property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setKind(JAXBElement<String> value) {
                this.kind = value;
            }

            /**
             * Gets the value of the money property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
             *     
             */
            public JAXBElement<MoneyValue> getMoney() {
                return money;
            }

            /**
             * Sets the value of the money property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link MoneyValue }{@code >}
             *     
             */
            public void setMoney(JAXBElement<MoneyValue> value) {
                this.money = value;
            }

        }

    }

}
