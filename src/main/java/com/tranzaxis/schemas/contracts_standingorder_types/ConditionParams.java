
package com.tranzaxis.schemas.contracts_standingorder_types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="OperKind" type="{http://schemas.tranzaxis.com/contracts-standingorder-types.xsd}CompareOperKindEnum" /&gt;
 *       &lt;attribute name="ThresholdAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="CcyId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionParams")
public class ConditionParams {

    @XmlAttribute(name = "OperKind")
    protected String operKind;
    @XmlAttribute(name = "ThresholdAmt")
    protected BigDecimal thresholdAmt;
    @XmlAttribute(name = "CcyId")
    protected Long ccyId;

    /**
     * Gets the value of the operKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperKind() {
        return operKind;
    }

    /**
     * Sets the value of the operKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperKind(String value) {
        this.operKind = value;
    }

    /**
     * Gets the value of the thresholdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThresholdAmt() {
        return thresholdAmt;
    }

    /**
     * Sets the value of the thresholdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThresholdAmt(BigDecimal value) {
        this.thresholdAmt = value;
    }

    /**
     * Gets the value of the ccyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCcyId() {
        return ccyId;
    }

    /**
     * Sets the value of the ccyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCcyId(Long value) {
        this.ccyId = value;
    }

}
