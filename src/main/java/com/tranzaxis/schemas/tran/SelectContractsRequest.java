
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectContractsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectContractsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tran.xsd}SelectSubjectsRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OutLinkedContract" type="{http://schemas.tranzaxis.com/tran.xsd}ContractLinkSelectRq" minOccurs="0"/&gt;
 *         &lt;element name="InLinkedContract" type="{http://schemas.tranzaxis.com/tran.xsd}ContractLinkSelectRq" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ContractClass" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="ContractTypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ContractTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ContractRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectContractsRequest", propOrder = {
    "outLinkedContract",
    "inLinkedContract"
})
@XmlSeeAlso({
    SelectTokensRequest.class,
    SelectTerminalsRequest.class
})
public class SelectContractsRequest
    extends SelectSubjectsRequest
{

    @XmlElement(name = "OutLinkedContract")
    protected ContractLinkSelectRq outLinkedContract;
    @XmlElement(name = "InLinkedContract")
    protected ContractLinkSelectRq inLinkedContract;
    @XmlAttribute(name = "ContractClass")
    protected String contractClass;
    @XmlAttribute(name = "ContractTypeId")
    protected Long contractTypeId;
    @XmlAttribute(name = "ContractTypeRid")
    protected String contractTypeRid;
    @XmlAttribute(name = "ContractId")
    protected Long contractId;
    @XmlAttribute(name = "ContractRid")
    protected String contractRid;

    /**
     * Gets the value of the outLinkedContract property.
     * 
     * @return
     *     possible object is
     *     {@link ContractLinkSelectRq }
     *     
     */
    public ContractLinkSelectRq getOutLinkedContract() {
        return outLinkedContract;
    }

    /**
     * Sets the value of the outLinkedContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractLinkSelectRq }
     *     
     */
    public void setOutLinkedContract(ContractLinkSelectRq value) {
        this.outLinkedContract = value;
    }

    /**
     * Gets the value of the inLinkedContract property.
     * 
     * @return
     *     possible object is
     *     {@link ContractLinkSelectRq }
     *     
     */
    public ContractLinkSelectRq getInLinkedContract() {
        return inLinkedContract;
    }

    /**
     * Sets the value of the inLinkedContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractLinkSelectRq }
     *     
     */
    public void setInLinkedContract(ContractLinkSelectRq value) {
        this.inLinkedContract = value;
    }

    /**
     * Gets the value of the contractClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractClass() {
        return contractClass;
    }

    /**
     * Sets the value of the contractClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractClass(String value) {
        this.contractClass = value;
    }

    /**
     * Gets the value of the contractTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractTypeId() {
        return contractTypeId;
    }

    /**
     * Sets the value of the contractTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractTypeId(Long value) {
        this.contractTypeId = value;
    }

    /**
     * Gets the value of the contractTypeRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractTypeRid() {
        return contractTypeRid;
    }

    /**
     * Sets the value of the contractTypeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractTypeRid(String value) {
        this.contractTypeRid = value;
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

}
