
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractLinkSpecific complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractLinkSpecific"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="LinkId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Kind"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Contract2Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Contract2Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Status" type="{http://schemas.tranzaxis.com/tran-common.xsd}ContractLinkStatusEnum" /&gt;
 *       &lt;attribute name="Contract1Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Contract2Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Number" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ToDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractLinkSpecific")
public class ContractLinkSpecific {

    @XmlAttribute(name = "LinkId")
    protected Long linkId;
    @XmlAttribute(name = "Kind")
    protected String kind;
    @XmlAttribute(name = "Contract2Id")
    protected Long contract2Id;
    @XmlAttribute(name = "Contract2Rid")
    protected String contract2Rid;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "Contract1Title")
    protected String contract1Title;
    @XmlAttribute(name = "Contract2Title")
    protected String contract2Title;
    @XmlAttribute(name = "Number")
    protected Long number;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;

    /**
     * Gets the value of the linkId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLinkId() {
        return linkId;
    }

    /**
     * Sets the value of the linkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLinkId(Long value) {
        this.linkId = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Gets the value of the contract2Id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContract2Id() {
        return contract2Id;
    }

    /**
     * Sets the value of the contract2Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContract2Id(Long value) {
        this.contract2Id = value;
    }

    /**
     * Gets the value of the contract2Rid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContract2Rid() {
        return contract2Rid;
    }

    /**
     * Sets the value of the contract2Rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContract2Rid(String value) {
        this.contract2Rid = value;
    }

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
     * Gets the value of the contract1Title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContract1Title() {
        return contract1Title;
    }

    /**
     * Sets the value of the contract1Title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContract1Title(String value) {
        this.contract1Title = value;
    }

    /**
     * Gets the value of the contract2Title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContract2Title() {
        return contract2Title;
    }

    /**
     * Sets the value of the contract2Title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContract2Title(String value) {
        this.contract2Title = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumber(Long value) {
        this.number = value;
    }

    /**
     * Gets the value of the toDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isToDelete() {
        if (toDelete == null) {
            return false;
        } else {
            return toDelete;
        }
    }

    /**
     * Sets the value of the toDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToDelete(Boolean value) {
        this.toDelete = value;
    }

}
