
package com.tranzaxis.schemas.contracts_strategy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StrategyTypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategyTypeList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StrategyType" type="{http://schemas.tranzaxis.com/contracts-strategy.xsd}StrategyTypeItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategyTypeList", propOrder = {
    "strategyType"
})
public class StrategyTypeList {

    @XmlElement(name = "StrategyType")
    protected List<StrategyTypeItem> strategyType;

    /**
     * Gets the value of the strategyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strategyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrategyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrategyTypeItem }
     * 
     * 
     */
    public List<StrategyTypeItem> getStrategyType() {
        if (strategyType == null) {
            strategyType = new ArrayList<StrategyTypeItem>();
        }
        return this.strategyType;
    }

}
