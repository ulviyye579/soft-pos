
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CloseSessionMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CloseSessionMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CloseSessionRs" type="{http://schemas.radixware.org/eas.xsd}CloseSessionRs"/&gt;
 *         &lt;element name="CloseSessionRq" type="{http://schemas.radixware.org/eas.xsd}CloseSessionRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CloseSessionMess", propOrder = {
    "closeSessionRs",
    "closeSessionRq"
})
public class CloseSessionMess {

    @XmlElement(name = "CloseSessionRs")
    protected CloseSessionRs closeSessionRs;
    @XmlElement(name = "CloseSessionRq")
    protected CloseSessionRq closeSessionRq;

    /**
     * Gets the value of the closeSessionRs property.
     * 
     * @return
     *     possible object is
     *     {@link CloseSessionRs }
     *     
     */
    public CloseSessionRs getCloseSessionRs() {
        return closeSessionRs;
    }

    /**
     * Sets the value of the closeSessionRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloseSessionRs }
     *     
     */
    public void setCloseSessionRs(CloseSessionRs value) {
        this.closeSessionRs = value;
    }

    /**
     * Gets the value of the closeSessionRq property.
     * 
     * @return
     *     possible object is
     *     {@link CloseSessionRq }
     *     
     */
    public CloseSessionRq getCloseSessionRq() {
        return closeSessionRq;
    }

    /**
     * Sets the value of the closeSessionRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloseSessionRq }
     *     
     */
    public void setCloseSessionRq(CloseSessionRq value) {
        this.closeSessionRq = value;
    }

}
