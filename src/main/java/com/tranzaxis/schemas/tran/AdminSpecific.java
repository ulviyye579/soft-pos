
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.acquiring_admin.Terminal;
import com.tranzaxis.schemas.admin_admin.User;
import com.tranzaxis.schemas.contracts_admin.Contract;
import com.tranzaxis.schemas.contracts_payee_admin.PayeeConsumer;
import com.tranzaxis.schemas.contracts_payee_admin.PaymentBill;
import com.tranzaxis.schemas.contracts_payee_admin.PaymentVoucher;
import com.tranzaxis.schemas.interfacing_admin.Interface;
import com.tranzaxis.schemas.invoicing.AdminInvoice;
import com.tranzaxis.schemas.issue_admin.IssueInfo;
import com.tranzaxis.schemas.subjects_admin.ExtCard;
import com.tranzaxis.schemas.subjects_admin.Subject;
import com.tranzaxis.schemas.tokens_admin.Token;
import com.tranzaxis.schemas.tokens_admin.TokenPackage;


/**
 * <p>Java class for AdminSpecific complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdminSpecific"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="Token" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}Token"/&gt;
 *         &lt;element name="TokenPackage" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}TokenPackage"/&gt;
 *         &lt;element name="Contract" type="{http://schemas.tranzaxis.com/contracts-admin.xsd}Contract"/&gt;
 *         &lt;element name="Subject" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Subject"/&gt;
 *         &lt;element name="Voucher" type="{http://schemas.tranzaxis.com/contracts-payee-admin.xsd}PaymentVoucher"/&gt;
 *         &lt;element name="Bill" type="{http://schemas.tranzaxis.com/contracts-payee-admin.xsd}PaymentBill"/&gt;
 *         &lt;element name="PayeeConsumer" type="{http://schemas.tranzaxis.com/contracts-payee-admin.xsd}PayeeConsumer"/&gt;
 *         &lt;element name="Terminal" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}Terminal"/&gt;
 *         &lt;element name="Interface" type="{http://schemas.tranzaxis.com/interfacing-admin.xsd}Interface"/&gt;
 *         &lt;element name="ExtCard" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}ExtCard"/&gt;
 *         &lt;element name="Invoice" type="{http://schemas.tranzaxis.com/invoicing.xsd}AdminInvoice"/&gt;
 *         &lt;element name="Issue" type="{http://schemas.tranzaxis.com/issue-admin.xsd}IssueInfo" minOccurs="0"/&gt;
 *         &lt;element name="User" type="{http://schemas.tranzaxis.com/admin-admin.xsd}User"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdminSpecific", propOrder = {
    "token",
    "tokenPackage",
    "contract",
    "subject",
    "voucher",
    "bill",
    "payeeConsumer",
    "terminal",
    "_interface",
    "extCard",
    "invoice",
    "issue",
    "user"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.tran.Request.Specific.Admin.class
})
public class AdminSpecific {

    @XmlElement(name = "Token")
    protected Token token;
    @XmlElement(name = "TokenPackage")
    protected TokenPackage tokenPackage;
    @XmlElement(name = "Contract")
    protected Contract contract;
    @XmlElement(name = "Subject")
    protected Subject subject;
    @XmlElement(name = "Voucher")
    protected PaymentVoucher voucher;
    @XmlElement(name = "Bill")
    protected PaymentBill bill;
    @XmlElement(name = "PayeeConsumer")
    protected PayeeConsumer payeeConsumer;
    @XmlElement(name = "Terminal")
    protected Terminal terminal;
    @XmlElement(name = "Interface")
    protected Interface _interface;
    @XmlElement(name = "ExtCard")
    protected ExtCard extCard;
    @XmlElement(name = "Invoice")
    protected AdminInvoice invoice;
    @XmlElement(name = "Issue")
    protected IssueInfo issue;
    @XmlElement(name = "User")
    protected User user;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link Token }
     *     
     */
    public Token getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token }
     *     
     */
    public void setToken(Token value) {
        this.token = value;
    }

    /**
     * Gets the value of the tokenPackage property.
     * 
     * @return
     *     possible object is
     *     {@link TokenPackage }
     *     
     */
    public TokenPackage getTokenPackage() {
        return tokenPackage;
    }

    /**
     * Sets the value of the tokenPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenPackage }
     *     
     */
    public void setTokenPackage(TokenPackage value) {
        this.tokenPackage = value;
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
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link Subject }
     *     
     */
    public Subject getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subject }
     *     
     */
    public void setSubject(Subject value) {
        this.subject = value;
    }

    /**
     * Gets the value of the voucher property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentVoucher }
     *     
     */
    public PaymentVoucher getVoucher() {
        return voucher;
    }

    /**
     * Sets the value of the voucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentVoucher }
     *     
     */
    public void setVoucher(PaymentVoucher value) {
        this.voucher = value;
    }

    /**
     * Gets the value of the bill property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentBill }
     *     
     */
    public PaymentBill getBill() {
        return bill;
    }

    /**
     * Sets the value of the bill property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentBill }
     *     
     */
    public void setBill(PaymentBill value) {
        this.bill = value;
    }

    /**
     * Gets the value of the payeeConsumer property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeConsumer }
     *     
     */
    public PayeeConsumer getPayeeConsumer() {
        return payeeConsumer;
    }

    /**
     * Sets the value of the payeeConsumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeConsumer }
     *     
     */
    public void setPayeeConsumer(PayeeConsumer value) {
        this.payeeConsumer = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setTerminal(Terminal value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link Interface }
     *     
     */
    public Interface getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interface }
     *     
     */
    public void setInterface(Interface value) {
        this._interface = value;
    }

    /**
     * Gets the value of the extCard property.
     * 
     * @return
     *     possible object is
     *     {@link ExtCard }
     *     
     */
    public ExtCard getExtCard() {
        return extCard;
    }

    /**
     * Sets the value of the extCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtCard }
     *     
     */
    public void setExtCard(ExtCard value) {
        this.extCard = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link AdminInvoice }
     *     
     */
    public AdminInvoice getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminInvoice }
     *     
     */
    public void setInvoice(AdminInvoice value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link IssueInfo }
     *     
     */
    public IssueInfo getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueInfo }
     *     
     */
    public void setIssue(IssueInfo value) {
        this.issue = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

}
