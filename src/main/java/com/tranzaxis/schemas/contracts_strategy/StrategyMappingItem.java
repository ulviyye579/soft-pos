
package com.tranzaxis.schemas.contracts_strategy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StrategyMappingItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategyMappingItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kind" type="{http://schemas.tranzaxis.com/contracts-strategy.xsd}StrategyKind"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BaseClassId" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategyMappingItem", propOrder = {
    "kind"
})
public class StrategyMappingItem {

    @XmlElement(name = "Kind", required = true)
    protected String kind;
    @XmlAttribute(name = "BaseClassId", required = true)
    protected String baseClassId;

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
     * Gets the value of the baseClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseClassId() {
        return baseClassId;
    }

    /**
     * Sets the value of the baseClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseClassId(String value) {
        this.baseClassId = value;
    }

}
