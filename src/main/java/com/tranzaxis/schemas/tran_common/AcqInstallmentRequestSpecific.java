
package com.tranzaxis.schemas.tran_common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcqInstallmentRequestSpecific complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcqInstallmentRequestSpecific"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TrancheCnt" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="InitialAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TrancheNumber" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcqInstallmentRequestSpecific")
public class AcqInstallmentRequestSpecific {

    @XmlAttribute(name = "TypeId")
    protected Long typeId;
    @XmlAttribute(name = "TrancheCnt")
    protected Long trancheCnt;
    @XmlAttribute(name = "InitialAmt")
    protected BigDecimal initialAmt;
    @XmlAttribute(name = "ContractId")
    protected Long contractId;
    @XmlAttribute(name = "TrancheNumber")
    protected Long trancheNumber;

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

    /**
     * Gets the value of the trancheCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTrancheCnt() {
        return trancheCnt;
    }

    /**
     * Sets the value of the trancheCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTrancheCnt(Long value) {
        this.trancheCnt = value;
    }

    /**
     * Gets the value of the initialAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialAmt() {
        return initialAmt;
    }

    /**
     * Sets the value of the initialAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialAmt(BigDecimal value) {
        this.initialAmt = value;
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
     * Gets the value of the trancheNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTrancheNumber() {
        return trancheNumber;
    }

    /**
     * Sets the value of the trancheNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTrancheNumber(Long value) {
        this.trancheNumber = value;
    }

}
