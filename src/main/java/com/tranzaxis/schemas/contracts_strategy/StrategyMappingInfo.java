
package com.tranzaxis.schemas.contracts_strategy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StrategyMappingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategyMappingInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StrategyMappingItem" type="{http://schemas.tranzaxis.com/contracts-strategy.xsd}StrategyMappingItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategyMappingInfo", propOrder = {
    "strategyMappingItem"
})
public class StrategyMappingInfo {

    @XmlElement(name = "StrategyMappingItem")
    protected List<StrategyMappingItem> strategyMappingItem;

    /**
     * Gets the value of the strategyMappingItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strategyMappingItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrategyMappingItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrategyMappingItem }
     * 
     * 
     */
    public List<StrategyMappingItem> getStrategyMappingItem() {
        if (strategyMappingItem == null) {
            strategyMappingItem = new ArrayList<StrategyMappingItem>();
        }
        return this.strategyMappingItem;
    }

}
