
package com.tranzaxis.schemas.contracts_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.xscml.Sqml;


/**
 * <p>Java class for BalancingTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalancingTask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectCondition" type="{http://schemas.radixware.org/xscml.xsd}Sqml" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BalancingPhase" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalancingTask", propOrder = {
    "selectCondition"
})
public class BalancingTask {

    @XmlElement(name = "SelectCondition")
    protected Sqml selectCondition;
    @XmlAttribute(name = "BalancingPhase", required = true)
    protected String balancingPhase;

    /**
     * Gets the value of the selectCondition property.
     * 
     * @return
     *     possible object is
     *     {@link Sqml }
     *     
     */
    public Sqml getSelectCondition() {
        return selectCondition;
    }

    /**
     * Sets the value of the selectCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sqml }
     *     
     */
    public void setSelectCondition(Sqml value) {
        this.selectCondition = value;
    }

    /**
     * Gets the value of the balancingPhase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalancingPhase() {
        return balancingPhase;
    }

    /**
     * Sets the value of the balancingPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalancingPhase(String value) {
        this.balancingPhase = value;
    }

}
