
package com.tranzaxis.schemas.common_types;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Tranche complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tranche"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
 *         &lt;element name="Number" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
 *         &lt;element name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
 *         &lt;element name="Balance" type="{http://schemas.radixware.org/types.xsd}Num"/&gt;
 *         &lt;element name="DebtCategoryId" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
 *         &lt;element name="AuthDay" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
 *         &lt;element name="ExecDay" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
 *         &lt;element name="PaidDay" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
 *         &lt;element name="PostDay" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
 *         &lt;element name="LastAccrualDay" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
 *         &lt;element name="TransactionId" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
 *         &lt;element name="EntrySeq" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
 *         &lt;element name="TrancheDeltas" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TrancheDelta" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://schemas.tranzaxis.com/common-types.xsd}TrancheDelta"&gt;
 *                         &lt;/extension&gt;
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
@XmlType(name = "Tranche", propOrder = {
    "id",
    "number",
    "ccy",
    "balance",
    "debtCategoryId",
    "authDay",
    "execDay",
    "paidDay",
    "postDay",
    "lastAccrualDay",
    "transactionId",
    "entrySeq",
    "trancheDeltas"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.common_types.Tranches.Tranche.class
})
public class Tranche {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "Number")
    protected long number;
    @XmlElement(name = "Ccy")
    protected long ccy;
    @XmlElement(name = "Balance", required = true)
    protected BigDecimal balance;
    @XmlElement(name = "DebtCategoryId")
    protected long debtCategoryId;
    @XmlElement(name = "AuthDay", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authDay;
    @XmlElement(name = "ExecDay", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar execDay;
    @XmlElement(name = "PaidDay", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paidDay;
    @XmlElement(name = "PostDay", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postDay;
    @XmlElement(name = "LastAccrualDay", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAccrualDay;
    @XmlElement(name = "TransactionId")
    protected long transactionId;
    @XmlElement(name = "EntrySeq")
    protected long entrySeq;
    @XmlElement(name = "TrancheDeltas")
    protected Tranche.TrancheDeltas trancheDeltas;

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
     * Gets the value of the number property.
     * 
     */
    public long getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(long value) {
        this.number = value;
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

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the debtCategoryId property.
     * 
     */
    public long getDebtCategoryId() {
        return debtCategoryId;
    }

    /**
     * Sets the value of the debtCategoryId property.
     * 
     */
    public void setDebtCategoryId(long value) {
        this.debtCategoryId = value;
    }

    /**
     * Gets the value of the authDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthDay() {
        return authDay;
    }

    /**
     * Sets the value of the authDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthDay(XMLGregorianCalendar value) {
        this.authDay = value;
    }

    /**
     * Gets the value of the execDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecDay() {
        return execDay;
    }

    /**
     * Sets the value of the execDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecDay(XMLGregorianCalendar value) {
        this.execDay = value;
    }

    /**
     * Gets the value of the paidDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaidDay() {
        return paidDay;
    }

    /**
     * Sets the value of the paidDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaidDay(XMLGregorianCalendar value) {
        this.paidDay = value;
    }

    /**
     * Gets the value of the postDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostDay() {
        return postDay;
    }

    /**
     * Sets the value of the postDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostDay(XMLGregorianCalendar value) {
        this.postDay = value;
    }

    /**
     * Gets the value of the lastAccrualDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAccrualDay() {
        return lastAccrualDay;
    }

    /**
     * Sets the value of the lastAccrualDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAccrualDay(XMLGregorianCalendar value) {
        this.lastAccrualDay = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     */
    public long getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     */
    public void setTransactionId(long value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the entrySeq property.
     * 
     */
    public long getEntrySeq() {
        return entrySeq;
    }

    /**
     * Sets the value of the entrySeq property.
     * 
     */
    public void setEntrySeq(long value) {
        this.entrySeq = value;
    }

    /**
     * Gets the value of the trancheDeltas property.
     * 
     * @return
     *     possible object is
     *     {@link Tranche.TrancheDeltas }
     *     
     */
    public Tranche.TrancheDeltas getTrancheDeltas() {
        return trancheDeltas;
    }

    /**
     * Sets the value of the trancheDeltas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tranche.TrancheDeltas }
     *     
     */
    public void setTrancheDeltas(Tranche.TrancheDeltas value) {
        this.trancheDeltas = value;
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
     *         &lt;element name="TrancheDelta" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://schemas.tranzaxis.com/common-types.xsd}TrancheDelta"&gt;
     *               &lt;/extension&gt;
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
        "trancheDelta"
    })
    public static class TrancheDeltas {

        @XmlElement(name = "TrancheDelta")
        protected List<Tranche.TrancheDeltas.TrancheDelta> trancheDelta;

        /**
         * Gets the value of the trancheDelta property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trancheDelta property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrancheDelta().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Tranche.TrancheDeltas.TrancheDelta }
         * 
         * 
         */
        public List<Tranche.TrancheDeltas.TrancheDelta> getTrancheDelta() {
            if (trancheDelta == null) {
                trancheDelta = new ArrayList<Tranche.TrancheDeltas.TrancheDelta>();
            }
            return this.trancheDelta;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.tranzaxis.com/common-types.xsd}TrancheDelta"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TrancheDelta
            extends com.tranzaxis.schemas.common_types.TrancheDelta
        {


        }

    }

}
