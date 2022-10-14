
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateSessionMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateSessionMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CreateSessionRs" type="{http://schemas.radixware.org/eas.xsd}CreateSessionRs"/&gt;
 *         &lt;element name="CreateSessionRq" type="{http://schemas.radixware.org/eas.xsd}CreateSessionRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateSessionMess", propOrder = {
    "createSessionRs",
    "createSessionRq"
})
public class CreateSessionMess {

    @XmlElement(name = "CreateSessionRs")
    protected CreateSessionRs createSessionRs;
    @XmlElement(name = "CreateSessionRq")
    protected CreateSessionRq createSessionRq;

    /**
     * Gets the value of the createSessionRs property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSessionRs }
     *     
     */
    public CreateSessionRs getCreateSessionRs() {
        return createSessionRs;
    }

    /**
     * Sets the value of the createSessionRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSessionRs }
     *     
     */
    public void setCreateSessionRs(CreateSessionRs value) {
        this.createSessionRs = value;
    }

    /**
     * Gets the value of the createSessionRq property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSessionRq }
     *     
     */
    public CreateSessionRq getCreateSessionRq() {
        return createSessionRq;
    }

    /**
     * Sets the value of the createSessionRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSessionRq }
     *     
     */
    public void setCreateSessionRq(CreateSessionRq value) {
        this.createSessionRq = value;
    }

}
