
package com.tranzaxis.schemas.contracts_payee_admin;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.ParamValues;
import com.tranzaxis.schemas.tran_common.Surcharges;


/**
 * <p>Java class for PaymentBill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentBill"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReasonCode" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ReasonText" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="Surcharges" type="{http://schemas.tranzaxis.com/tran-common.xsd}Surcharges" minOccurs="0"/&gt;
 *         &lt;element name="PayedAmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="UserAttrs" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *         &lt;element name="PaymentParams" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *         &lt;element name="RegTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="DueDate" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExpTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="PayedTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="StatusTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastTryTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Items" type="{http://schemas.tranzaxis.com/contracts-payee-admin.xsd}BillItems" minOccurs="0"/&gt;
 *         &lt;element name="Payers" type="{http://schemas.tranzaxis.com/contracts-payee-admin.xsd}BillPayers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="InstId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ContractRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="PaymentRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentBill", propOrder = {
    "status",
    "reasonCode",
    "reasonText",
    "amt",
    "taxAmt",
    "surcharges",
    "payedAmt",
    "ccy",
    "title",
    "description",
    "userAttrs",
    "paymentParams",
    "regTime",
    "dueDate",
    "expTime",
    "payedTime",
    "statusTime",
    "lastTryTime",
    "items",
    "payers"
})
public class PaymentBill {

    @XmlElement(name = "Status")
    protected String status;
    @XmlElementRef(name = "ReasonCode", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reasonCode;
    @XmlElementRef(name = "ReasonText", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reasonText;
    @XmlElement(name = "Amt")
    protected BigDecimal amt;
    @XmlElement(name = "TaxAmt")
    protected BigDecimal taxAmt;
    @XmlElement(name = "Surcharges")
    protected Surcharges surcharges;
    @XmlElement(name = "PayedAmt")
    protected BigDecimal payedAmt;
    @XmlElement(name = "Ccy")
    protected Long ccy;
    @XmlElementRef(name = "Title", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "Description", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "UserAttrs")
    protected ParamValues userAttrs;
    @XmlElement(name = "PaymentParams")
    protected ParamValues paymentParams;
    @XmlElement(name = "RegTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regTime;
    @XmlElementRef(name = "DueDate", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dueDate;
    @XmlElementRef(name = "ExpTime", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expTime;
    @XmlElementRef(name = "PayedTime", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> payedTime;
    @XmlElementRef(name = "StatusTime", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> statusTime;
    @XmlElementRef(name = "LastTryTime", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastTryTime;
    @XmlElement(name = "Items")
    protected BillItems items;
    @XmlElement(name = "Payers")
    protected BillPayers payers;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "ContractId")
    protected Long contractId;
    @XmlAttribute(name = "InstId")
    protected Long instId;
    @XmlAttribute(name = "ContractRid")
    protected String contractRid;
    @XmlAttribute(name = "Rid")
    protected String rid;
    @XmlAttribute(name = "PaymentRid")
    protected String paymentRid;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReasonCode(JAXBElement<String> value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the reasonText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReasonText() {
        return reasonText;
    }

    /**
     * Sets the value of the reasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReasonText(JAXBElement<String> value) {
        this.reasonText = value;
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
     * Gets the value of the taxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmt() {
        return taxAmt;
    }

    /**
     * Sets the value of the taxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmt(BigDecimal value) {
        this.taxAmt = value;
    }

    /**
     * Gets the value of the surcharges property.
     * 
     * @return
     *     possible object is
     *     {@link Surcharges }
     *     
     */
    public Surcharges getSurcharges() {
        return surcharges;
    }

    /**
     * Sets the value of the surcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Surcharges }
     *     
     */
    public void setSurcharges(Surcharges value) {
        this.surcharges = value;
    }

    /**
     * Gets the value of the payedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayedAmt() {
        return payedAmt;
    }

    /**
     * Sets the value of the payedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayedAmt(BigDecimal value) {
        this.payedAmt = value;
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

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the userAttrs property.
     * 
     * @return
     *     possible object is
     *     {@link ParamValues }
     *     
     */
    public ParamValues getUserAttrs() {
        return userAttrs;
    }

    /**
     * Sets the value of the userAttrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamValues }
     *     
     */
    public void setUserAttrs(ParamValues value) {
        this.userAttrs = value;
    }

    /**
     * Gets the value of the paymentParams property.
     * 
     * @return
     *     possible object is
     *     {@link ParamValues }
     *     
     */
    public ParamValues getPaymentParams() {
        return paymentParams;
    }

    /**
     * Sets the value of the paymentParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamValues }
     *     
     */
    public void setPaymentParams(ParamValues value) {
        this.paymentParams = value;
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
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDueDate(JAXBElement<XMLGregorianCalendar> value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the expTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpTime() {
        return expTime;
    }

    /**
     * Sets the value of the expTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpTime(JAXBElement<XMLGregorianCalendar> value) {
        this.expTime = value;
    }

    /**
     * Gets the value of the payedTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPayedTime() {
        return payedTime;
    }

    /**
     * Sets the value of the payedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPayedTime(JAXBElement<XMLGregorianCalendar> value) {
        this.payedTime = value;
    }

    /**
     * Gets the value of the statusTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStatusTime() {
        return statusTime;
    }

    /**
     * Sets the value of the statusTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStatusTime(JAXBElement<XMLGregorianCalendar> value) {
        this.statusTime = value;
    }

    /**
     * Gets the value of the lastTryTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastTryTime() {
        return lastTryTime;
    }

    /**
     * Sets the value of the lastTryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastTryTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastTryTime = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link BillItems }
     *     
     */
    public BillItems getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillItems }
     *     
     */
    public void setItems(BillItems value) {
        this.items = value;
    }

    /**
     * Gets the value of the payers property.
     * 
     * @return
     *     possible object is
     *     {@link BillPayers }
     *     
     */
    public BillPayers getPayers() {
        return payers;
    }

    /**
     * Sets the value of the payers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPayers }
     *     
     */
    public void setPayers(BillPayers value) {
        this.payers = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractId(Long value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the instId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInstId() {
        return instId;
    }

    /**
     * Sets the value of the instId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInstId(Long value) {
        this.instId = value;
    }

    /**
     * Gets the value of the contractRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractRid() {
        return contractRid;
    }

    /**
     * Sets the value of the contractRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractRid(String value) {
        this.contractRid = value;
    }

    /**
     * Gets the value of the rid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRid() {
        return rid;
    }

    /**
     * Sets the value of the rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRid(String value) {
        this.rid = value;
    }

    /**
     * Gets the value of the paymentRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRid() {
        return paymentRid;
    }

    /**
     * Sets the value of the paymentRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRid(String value) {
        this.paymentRid = value;
    }

}
