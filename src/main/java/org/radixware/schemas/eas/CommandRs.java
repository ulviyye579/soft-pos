
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommandRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommandRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}ContextlessCommandRs"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="CurrentData" type="{http://schemas.radixware.org/eas.xsd}Object" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommandRs", propOrder = {
    "currentData"
})
public class CommandRs
    extends ContextlessCommandRs
{

    @XmlElement(name = "CurrentData")
    protected Object currentData;

    /**
     * Gets the value of the currentData property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCurrentData() {
        return currentData;
    }

    /**
     * Sets the value of the currentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCurrentData(Object value) {
        this.currentData = value;
    }

}
