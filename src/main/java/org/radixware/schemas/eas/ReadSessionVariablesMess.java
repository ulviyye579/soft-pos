
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadSessionVariablesMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadSessionVariablesMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ReadSessionVariablesRq" type="{http://schemas.radixware.org/eas.xsd}ReadSessionVariablesRq"/&gt;
 *         &lt;element name="ReadSessionVariablesRs" type="{http://schemas.radixware.org/eas.xsd}ReadSessionVariablesRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadSessionVariablesMess", propOrder = {
    "readSessionVariablesRq",
    "readSessionVariablesRs"
})
public class ReadSessionVariablesMess {

    @XmlElement(name = "ReadSessionVariablesRq")
    protected ReadSessionVariablesRq readSessionVariablesRq;
    @XmlElement(name = "ReadSessionVariablesRs")
    protected ReadSessionVariablesRs readSessionVariablesRs;

    /**
     * Gets the value of the readSessionVariablesRq property.
     * 
     * @return
     *     possible object is
     *     {@link ReadSessionVariablesRq }
     *     
     */
    public ReadSessionVariablesRq getReadSessionVariablesRq() {
        return readSessionVariablesRq;
    }

    /**
     * Sets the value of the readSessionVariablesRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadSessionVariablesRq }
     *     
     */
    public void setReadSessionVariablesRq(ReadSessionVariablesRq value) {
        this.readSessionVariablesRq = value;
    }

    /**
     * Gets the value of the readSessionVariablesRs property.
     * 
     * @return
     *     possible object is
     *     {@link ReadSessionVariablesRs }
     *     
     */
    public ReadSessionVariablesRs getReadSessionVariablesRs() {
        return readSessionVariablesRs;
    }

    /**
     * Sets the value of the readSessionVariablesRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadSessionVariablesRs }
     *     
     */
    public void setReadSessionVariablesRs(ReadSessionVariablesRs value) {
        this.readSessionVariablesRs = value;
    }

}
