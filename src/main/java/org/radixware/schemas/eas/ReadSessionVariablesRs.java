
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadSessionVariablesRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadSessionVariablesRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Variables" type="{http://schemas.radixware.org/eas.xsd}SessionVariables" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadSessionVariablesRs", propOrder = {
    "variables"
})
public class ReadSessionVariablesRs {

    @XmlElement(name = "Variables")
    protected SessionVariables variables;

    /**
     * Gets the value of the variables property.
     * 
     * @return
     *     possible object is
     *     {@link SessionVariables }
     *     
     */
    public SessionVariables getVariables() {
        return variables;
    }

    /**
     * Sets the value of the variables property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionVariables }
     *     
     */
    public void setVariables(SessionVariables value) {
        this.variables = value;
    }

}
