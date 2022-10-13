
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepareCreateMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepareCreateMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="PrepareCreateRs" type="{http://schemas.radixware.org/eas.xsd}PrepareCreateRs"/&gt;
 *         &lt;element name="PrepareCreateRq" type="{http://schemas.radixware.org/eas.xsd}PrepareCreateRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepareCreateMess", propOrder = {
    "prepareCreateRs",
    "prepareCreateRq"
})
public class PrepareCreateMess {

    @XmlElement(name = "PrepareCreateRs")
    protected PrepareCreateRs prepareCreateRs;
    @XmlElement(name = "PrepareCreateRq")
    protected PrepareCreateRq prepareCreateRq;

    /**
     * Gets the value of the prepareCreateRs property.
     * 
     * @return
     *     possible object is
     *     {@link PrepareCreateRs }
     *     
     */
    public PrepareCreateRs getPrepareCreateRs() {
        return prepareCreateRs;
    }

    /**
     * Sets the value of the prepareCreateRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepareCreateRs }
     *     
     */
    public void setPrepareCreateRs(PrepareCreateRs value) {
        this.prepareCreateRs = value;
    }

    /**
     * Gets the value of the prepareCreateRq property.
     * 
     * @return
     *     possible object is
     *     {@link PrepareCreateRq }
     *     
     */
    public PrepareCreateRq getPrepareCreateRq() {
        return prepareCreateRq;
    }

    /**
     * Sets the value of the prepareCreateRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepareCreateRq }
     *     
     */
    public void setPrepareCreateRq(PrepareCreateRq value) {
        this.prepareCreateRq = value;
    }

}
