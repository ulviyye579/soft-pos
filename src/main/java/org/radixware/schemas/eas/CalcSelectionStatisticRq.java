
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcSelectionStatisticRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcSelectionStatisticRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}GroupRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AggregateFunctions" type="{http://schemas.radixware.org/eas.xsd}AggregateFunctions"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcSelectionStatisticRq", propOrder = {
    "aggregateFunctions"
})
public class CalcSelectionStatisticRq
    extends GroupRequest
{

    @XmlElement(name = "AggregateFunctions", required = true)
    protected AggregateFunctions aggregateFunctions;

    /**
     * Gets the value of the aggregateFunctions property.
     * 
     * @return
     *     possible object is
     *     {@link AggregateFunctions }
     *     
     */
    public AggregateFunctions getAggregateFunctions() {
        return aggregateFunctions;
    }

    /**
     * Sets the value of the aggregateFunctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregateFunctions }
     *     
     */
    public void setAggregateFunctions(AggregateFunctions value) {
        this.aggregateFunctions = value;
    }

}
