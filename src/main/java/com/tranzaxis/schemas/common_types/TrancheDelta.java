
package com.tranzaxis.schemas.common_types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrancheDelta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrancheDelta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
 *         &lt;element name="Amt" type="{http://schemas.radixware.org/types.xsd}Num"/&gt;
 *         &lt;element name="AuthDay" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
 *         &lt;element name="ExecDay" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
 *         &lt;element name="PostDay" type="{http://schemas.radixware.org/types.xsd}DateTime"/&gt;
 *         &lt;element name="IsRepayment" type="{http://schemas.radixware.org/types.xsd}Bool"/&gt;
 *         &lt;element name="TransactionId" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
 *         &lt;element name="EntrySeq" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrancheDelta", propOrder = {
    "id",
    "amt",
    "authDay",
    "execDay",
    "postDay",
    "isRepayment",
    "transactionId",
    "entrySeq"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.common_types.Tranche.TrancheDeltas.TrancheDelta.class
})
public class TrancheDelta {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "AuthDay", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authDay;
    @XmlElement(name = "ExecDay", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar execDay;
    @XmlElement(name = "PostDay", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postDay;
    @XmlElement(name = "IsRepayment", defaultValue = "false")
    protected boolean isRepayment;
    @XmlElement(name = "TransactionId")
    protected long transactionId;
    @XmlElement(name = "EntrySeq")
    protected long entrySeq;

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
     * Gets the value of the isRepayment property.
     * 
     */
    public boolean isIsRepayment() {
        return isRepayment;
    }

    /**
     * Sets the value of the isRepayment property.
     * 
     */
    public void setIsRepayment(boolean value) {
        this.isRepayment = value;
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

}
