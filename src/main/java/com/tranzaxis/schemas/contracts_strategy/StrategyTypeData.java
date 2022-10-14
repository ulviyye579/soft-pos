
package com.tranzaxis.schemas.contracts_strategy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StrategyTypeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategyTypeData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChildTypes" type="{http://schemas.tranzaxis.com/contracts-strategy.xsd}StrategyTypeList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="StrategyTypeRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategyTypeData", propOrder = {
    "childTypes"
})
public class StrategyTypeData {

    @XmlElement(name = "ChildTypes")
    protected StrategyTypeList childTypes;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "StrategyTypeRid")
    protected String strategyTypeRid;

    /**
     * Gets the value of the childTypes property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyTypeList }
     *     
     */
    public StrategyTypeList getChildTypes() {
        return childTypes;
    }

    /**
     * Sets the value of the childTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyTypeList }
     *     
     */
    public void setChildTypes(StrategyTypeList value) {
        this.childTypes = value;
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
     * Gets the value of the strategyTypeRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrategyTypeRid() {
        return strategyTypeRid;
    }

    /**
     * Sets the value of the strategyTypeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrategyTypeRid(String value) {
        this.strategyTypeRid = value;
    }

}
