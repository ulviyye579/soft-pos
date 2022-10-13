
package com.tranzaxis.schemas.contracts_strategy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StrategyTypeItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategyTypeItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Data" type="{http://schemas.tranzaxis.com/contracts-strategy.xsd}StrategyTypeData"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/contracts-strategy.xsd}StrategyKind" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategyTypeItem", propOrder = {
    "data"
})
public class StrategyTypeItem {

    @XmlElement(name = "Data", required = true)
    protected StrategyTypeData data;
    @XmlAttribute(name = "Kind", required = true)
    protected String kind;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyTypeData }
     *     
     */
    public StrategyTypeData getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyTypeData }
     *     
     */
    public void setData(StrategyTypeData value) {
        this.data = value;
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

}
