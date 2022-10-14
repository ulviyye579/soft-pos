
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextlessCommandMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextlessCommandMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ContextlessCommandRq" type="{http://schemas.radixware.org/eas.xsd}ContextlessCommandRq"/&gt;
 *         &lt;element name="ContextlessCommandRs" type="{http://schemas.radixware.org/eas.xsd}ContextlessCommandRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextlessCommandMess", propOrder = {
    "contextlessCommandRq",
    "contextlessCommandRs"
})
public class ContextlessCommandMess {

    @XmlElement(name = "ContextlessCommandRq")
    protected ContextlessCommandRq contextlessCommandRq;
    @XmlElement(name = "ContextlessCommandRs")
    protected ContextlessCommandRs contextlessCommandRs;

    /**
     * Gets the value of the contextlessCommandRq property.
     * 
     * @return
     *     possible object is
     *     {@link ContextlessCommandRq }
     *     
     */
    public ContextlessCommandRq getContextlessCommandRq() {
        return contextlessCommandRq;
    }

    /**
     * Sets the value of the contextlessCommandRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextlessCommandRq }
     *     
     */
    public void setContextlessCommandRq(ContextlessCommandRq value) {
        this.contextlessCommandRq = value;
    }

    /**
     * Gets the value of the contextlessCommandRs property.
     * 
     * @return
     *     possible object is
     *     {@link ContextlessCommandRs }
     *     
     */
    public ContextlessCommandRs getContextlessCommandRs() {
        return contextlessCommandRs;
    }

    /**
     * Sets the value of the contextlessCommandRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextlessCommandRs }
     *     
     */
    public void setContextlessCommandRs(ContextlessCommandRs value) {
        this.contextlessCommandRs = value;
    }

}
