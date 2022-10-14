
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CreateRs" type="{http://schemas.radixware.org/eas.xsd}CreateRs"/&gt;
 *         &lt;element name="CreateRq" type="{http://schemas.radixware.org/eas.xsd}CreateRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateMess", propOrder = {
    "createRs",
    "createRq"
})
public class CreateMess {

    @XmlElement(name = "CreateRs")
    protected CreateRs createRs;
    @XmlElement(name = "CreateRq")
    protected CreateRq createRq;

    /**
     * Gets the value of the createRs property.
     * 
     * @return
     *     possible object is
     *     {@link CreateRs }
     *     
     */
    public CreateRs getCreateRs() {
        return createRs;
    }

    /**
     * Sets the value of the createRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateRs }
     *     
     */
    public void setCreateRs(CreateRs value) {
        this.createRs = value;
    }

    /**
     * Gets the value of the createRq property.
     * 
     * @return
     *     possible object is
     *     {@link CreateRq }
     *     
     */
    public CreateRq getCreateRq() {
        return createRq;
    }

    /**
     * Sets the value of the createRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateRq }
     *     
     */
    public void setCreateRq(CreateRq value) {
        this.createRq = value;
    }

}
