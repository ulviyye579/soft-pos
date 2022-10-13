
package com.tranzaxis.schemas.contracts_strategy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Strategy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Strategy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="StrategyTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="CreateInstanceSettings" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="DeleteInstanceSettings" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="Seq" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Ext" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Key" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Attached" type="{http://schemas.radixware.org/types.xsd}Bool" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Strategy", propOrder = {
    "typeId",
    "strategyTypeRid",
    "active",
    "contractId",
    "createInstanceSettings",
    "deleteInstanceSettings",
    "seq",
    "ext"
})
public class Strategy {

    @XmlElementRef(name = "TypeId", namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> typeId;
    @XmlElementRef(name = "StrategyTypeRid", namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strategyTypeRid;
    @XmlElementRef(name = "Active", namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> active;
    @XmlElementRef(name = "ContractId", namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> contractId;
    @XmlElementRef(name = "CreateInstanceSettings", namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> createInstanceSettings;
    @XmlElementRef(name = "DeleteInstanceSettings", namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> deleteInstanceSettings;
    @XmlElementRef(name = "Seq", namespace = "http://schemas.tranzaxis.com/contracts-strategy.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> seq;
    @XmlElement(name = "Ext")
    protected Object ext;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "Attached")
    protected Boolean attached;

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTypeId(JAXBElement<Long> value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the strategyTypeRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrategyTypeRid() {
        return strategyTypeRid;
    }

    /**
     * Sets the value of the strategyTypeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrategyTypeRid(JAXBElement<String> value) {
        this.strategyTypeRid = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setActive(JAXBElement<Boolean> value) {
        this.active = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setContractId(JAXBElement<Long> value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the createInstanceSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCreateInstanceSettings() {
        return createInstanceSettings;
    }

    /**
     * Sets the value of the createInstanceSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCreateInstanceSettings(JAXBElement<Boolean> value) {
        this.createInstanceSettings = value;
    }

    /**
     * Gets the value of the deleteInstanceSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDeleteInstanceSettings() {
        return deleteInstanceSettings;
    }

    /**
     * Sets the value of the deleteInstanceSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDeleteInstanceSettings(JAXBElement<Boolean> value) {
        this.deleteInstanceSettings = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSeq(JAXBElement<Long> value) {
        this.seq = value;
    }

    /**
     * Gets the value of the ext property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExt() {
        return ext;
    }

    /**
     * Sets the value of the ext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExt(Object value) {
        this.ext = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the attached property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAttached() {
        if (attached == null) {
            return true;
        } else {
            return attached;
        }
    }

    /**
     * Sets the value of the attached property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttached(Boolean value) {
        this.attached = value;
    }

}
