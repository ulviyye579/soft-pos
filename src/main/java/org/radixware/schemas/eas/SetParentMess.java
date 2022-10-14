
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetParentMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetParentMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SetParentRs" type="{http://schemas.radixware.org/eas.xsd}SetParentRs"/&gt;
 *         &lt;element name="SetParentRq" type="{http://schemas.radixware.org/eas.xsd}SetParentRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetParentMess", propOrder = {
    "setParentRs",
    "setParentRq"
})
public class SetParentMess {

    @XmlElement(name = "SetParentRs")
    protected SetParentRs setParentRs;
    @XmlElement(name = "SetParentRq")
    protected SetParentRq setParentRq;

    /**
     * Gets the value of the setParentRs property.
     * 
     * @return
     *     possible object is
     *     {@link SetParentRs }
     *     
     */
    public SetParentRs getSetParentRs() {
        return setParentRs;
    }

    /**
     * Sets the value of the setParentRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetParentRs }
     *     
     */
    public void setSetParentRs(SetParentRs value) {
        this.setParentRs = value;
    }

    /**
     * Gets the value of the setParentRq property.
     * 
     * @return
     *     possible object is
     *     {@link SetParentRq }
     *     
     */
    public SetParentRq getSetParentRq() {
        return setParentRq;
    }

    /**
     * Sets the value of the setParentRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetParentRq }
     *     
     */
    public void setSetParentRq(SetParentRq value) {
        this.setParentRq = value;
    }

}
