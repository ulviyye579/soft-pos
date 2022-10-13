
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentSpecific complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentSpecific"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Params" type="{http://schemas.tranzaxis.com/tran-common.xsd}PaymentParams" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TemplateRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="BillRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="BillId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="InvoiceId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="BillStatus" type="{http://schemas.tranzaxis.com/tran-common.xsd}ContractBillStatusEnum" /&gt;
 *       &lt;attribute name="VoucherDenomRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ReturnAllParams" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSpecific", propOrder = {
    "params"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.tran.Request.Specific.Payment.class
})
public class PaymentSpecific {

    @XmlElement(name = "Params")
    protected PaymentParams params;
    @XmlAttribute(name = "TemplateRid")
    protected String templateRid;
    @XmlAttribute(name = "BillRid")
    protected String billRid;
    @XmlAttribute(name = "BillId")
    protected Long billId;
    @XmlAttribute(name = "InvoiceId")
    protected Long invoiceId;
    @XmlAttribute(name = "BillStatus")
    protected String billStatus;
    @XmlAttribute(name = "VoucherDenomRid")
    protected String voucherDenomRid;
    @XmlAttribute(name = "ReturnAllParams")
    protected Boolean returnAllParams;

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentParams }
     *     
     */
    public PaymentParams getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentParams }
     *     
     */
    public void setParams(PaymentParams value) {
        this.params = value;
    }

    /**
     * Gets the value of the templateRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateRid() {
        return templateRid;
    }

    /**
     * Sets the value of the templateRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateRid(String value) {
        this.templateRid = value;
    }

    /**
     * Gets the value of the billRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillRid() {
        return billRid;
    }

    /**
     * Sets the value of the billRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillRid(String value) {
        this.billRid = value;
    }

    /**
     * Gets the value of the billId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillId() {
        return billId;
    }

    /**
     * Sets the value of the billId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillId(Long value) {
        this.billId = value;
    }

    /**
     * Gets the value of the invoiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvoiceId(Long value) {
        this.invoiceId = value;
    }

    /**
     * Gets the value of the billStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillStatus() {
        return billStatus;
    }

    /**
     * Sets the value of the billStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillStatus(String value) {
        this.billStatus = value;
    }

    /**
     * Gets the value of the voucherDenomRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherDenomRid() {
        return voucherDenomRid;
    }

    /**
     * Sets the value of the voucherDenomRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherDenomRid(String value) {
        this.voucherDenomRid = value;
    }

    /**
     * Gets the value of the returnAllParams property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnAllParams() {
        if (returnAllParams == null) {
            return false;
        } else {
            return returnAllParams;
        }
    }

    /**
     * Sets the value of the returnAllParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnAllParams(Boolean value) {
        this.returnAllParams = value;
    }

}
