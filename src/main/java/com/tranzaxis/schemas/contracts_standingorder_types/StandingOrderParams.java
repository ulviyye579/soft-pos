
package com.tranzaxis.schemas.contracts_standingorder_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.tran_common.PaymentTemplateSettings;


/**
 * <p>Java class for StandingOrderParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandingOrderParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="PaymentTemplateSettings" type="{http://schemas.tranzaxis.com/tran-common.xsd}PaymentTemplateSettings" minOccurs="0"/&gt;
 *         &lt;element name="ConditionId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ConditionParams" type="{http://schemas.tranzaxis.com/contracts-standingorder-types.xsd}ConditionParams" minOccurs="0"/&gt;
 *         &lt;element name="AmtAlgoId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="AmtAlgoParams" type="{http://schemas.tranzaxis.com/contracts-standingorder-types.xsd}AmtAlgoParams" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderParams", propOrder = {
    "paymentTemplateSettings",
    "conditionId",
    "conditionParams",
    "amtAlgoId",
    "amtAlgoParams"
})
public class StandingOrderParams {

    @XmlElement(name = "PaymentTemplateSettings")
    protected PaymentTemplateSettings paymentTemplateSettings;
    @XmlElement(name = "ConditionId")
    protected Long conditionId;
    @XmlElement(name = "ConditionParams")
    protected ConditionParams conditionParams;
    @XmlElement(name = "AmtAlgoId")
    protected Long amtAlgoId;
    @XmlElement(name = "AmtAlgoParams")
    protected AmtAlgoParams amtAlgoParams;

    /**
     * Gets the value of the paymentTemplateSettings property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTemplateSettings }
     *     
     */
    public PaymentTemplateSettings getPaymentTemplateSettings() {
        return paymentTemplateSettings;
    }

    /**
     * Sets the value of the paymentTemplateSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTemplateSettings }
     *     
     */
    public void setPaymentTemplateSettings(PaymentTemplateSettings value) {
        this.paymentTemplateSettings = value;
    }

    /**
     * Gets the value of the conditionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConditionId() {
        return conditionId;
    }

    /**
     * Sets the value of the conditionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConditionId(Long value) {
        this.conditionId = value;
    }

    /**
     * Gets the value of the conditionParams property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionParams }
     *     
     */
    public ConditionParams getConditionParams() {
        return conditionParams;
    }

    /**
     * Sets the value of the conditionParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionParams }
     *     
     */
    public void setConditionParams(ConditionParams value) {
        this.conditionParams = value;
    }

    /**
     * Gets the value of the amtAlgoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmtAlgoId() {
        return amtAlgoId;
    }

    /**
     * Sets the value of the amtAlgoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmtAlgoId(Long value) {
        this.amtAlgoId = value;
    }

    /**
     * Gets the value of the amtAlgoParams property.
     * 
     * @return
     *     possible object is
     *     {@link AmtAlgoParams }
     *     
     */
    public AmtAlgoParams getAmtAlgoParams() {
        return amtAlgoParams;
    }

    /**
     * Sets the value of the amtAlgoParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtAlgoParams }
     *     
     */
    public void setAmtAlgoParams(AmtAlgoParams value) {
        this.amtAlgoParams = value;
    }

}
