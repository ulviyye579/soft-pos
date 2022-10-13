
package com.tranzaxis.schemas.contracts_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CasAccountMapItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CasAccountMapItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="InstName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="BranchName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ContractTypeGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AcctPlanItemGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CasAccountMapItem", propOrder = {
    "ccy"
})
public class CasAccountMapItem {

    @XmlElement(name = "Ccy")
    protected long ccy;
    @XmlAttribute(name = "InstName")
    protected String instName;
    @XmlAttribute(name = "BranchName")
    protected String branchName;
    @XmlAttribute(name = "ContractTypeGuid")
    protected String contractTypeGuid;
    @XmlAttribute(name = "AcctPlanItemGuid")
    protected String acctPlanItemGuid;

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
     * Gets the value of the instName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstName() {
        return instName;
    }

    /**
     * Sets the value of the instName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstName(String value) {
        this.instName = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the contractTypeGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractTypeGuid() {
        return contractTypeGuid;
    }

    /**
     * Sets the value of the contractTypeGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractTypeGuid(String value) {
        this.contractTypeGuid = value;
    }

    /**
     * Gets the value of the acctPlanItemGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctPlanItemGuid() {
        return acctPlanItemGuid;
    }

    /**
     * Sets the value of the acctPlanItemGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctPlanItemGuid(String value) {
        this.acctPlanItemGuid = value;
    }

}
