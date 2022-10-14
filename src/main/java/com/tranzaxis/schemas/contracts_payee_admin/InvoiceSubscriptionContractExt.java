
package com.tranzaxis.schemas.contracts_payee_admin;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceSubscriptionContractExt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceSubscriptionContractExt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="PayerId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="PayeeId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="PayerRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="PayeeRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="MaxAutoAmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="AutoDayOfMonth" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMode" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="RechargeBalanceThreshold" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceSubscriptionContractExt", propOrder = {
    "typeRid",
    "payerId",
    "payeeId",
    "payerRid",
    "payeeRid",
    "consumerRid",
    "maxAutoAmt",
    "autoDayOfMonth",
    "paymentMode",
    "rechargeBalanceThreshold"
})
public class InvoiceSubscriptionContractExt {

    @XmlElement(name = "TypeRid")
    protected String typeRid;
    @XmlElement(name = "PayerId")
    protected Long payerId;
    @XmlElement(name = "PayeeId")
    protected Long payeeId;
    @XmlElement(name = "PayerRid")
    protected String payerRid;
    @XmlElement(name = "PayeeRid")
    protected String payeeRid;
    @XmlElement(name = "ConsumerRid")
    protected String consumerRid;
    @XmlElement(name = "MaxAutoAmt")
    protected BigDecimal maxAutoAmt;
    @XmlElement(name = "AutoDayOfMonth")
    protected Long autoDayOfMonth;
    @XmlElement(name = "PaymentMode")
    protected String paymentMode;
    @XmlElement(name = "RechargeBalanceThreshold")
    protected BigDecimal rechargeBalanceThreshold;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "Rid")
    protected String rid;
    @XmlAttribute(name = "TypeId")
    protected Long typeId;

    /**
     * Gets the value of the typeRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeRid() {
        return typeRid;
    }

    /**
     * Sets the value of the typeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeRid(String value) {
        this.typeRid = value;
    }

    /**
     * Gets the value of the payerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayerId() {
        return payerId;
    }

    /**
     * Sets the value of the payerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayerId(Long value) {
        this.payerId = value;
    }

    /**
     * Gets the value of the payeeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayeeId() {
        return payeeId;
    }

    /**
     * Sets the value of the payeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayeeId(Long value) {
        this.payeeId = value;
    }

    /**
     * Gets the value of the payerRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerRid() {
        return payerRid;
    }

    /**
     * Sets the value of the payerRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerRid(String value) {
        this.payerRid = value;
    }

    /**
     * Gets the value of the payeeRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeRid() {
        return payeeRid;
    }

    /**
     * Sets the value of the payeeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeRid(String value) {
        this.payeeRid = value;
    }

    /**
     * Gets the value of the consumerRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerRid() {
        return consumerRid;
    }

    /**
     * Sets the value of the consumerRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerRid(String value) {
        this.consumerRid = value;
    }

    /**
     * Gets the value of the maxAutoAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAutoAmt() {
        return maxAutoAmt;
    }

    /**
     * Sets the value of the maxAutoAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAutoAmt(BigDecimal value) {
        this.maxAutoAmt = value;
    }

    /**
     * Gets the value of the autoDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAutoDayOfMonth() {
        return autoDayOfMonth;
    }

    /**
     * Sets the value of the autoDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAutoDayOfMonth(Long value) {
        this.autoDayOfMonth = value;
    }

    /**
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMode(String value) {
        this.paymentMode = value;
    }

    /**
     * Gets the value of the rechargeBalanceThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRechargeBalanceThreshold() {
        return rechargeBalanceThreshold;
    }

    /**
     * Sets the value of the rechargeBalanceThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRechargeBalanceThreshold(BigDecimal value) {
        this.rechargeBalanceThreshold = value;
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

}
