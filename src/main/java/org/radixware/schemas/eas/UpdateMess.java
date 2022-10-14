
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="UpdateRs" type="{http://schemas.radixware.org/eas.xsd}UpdateRs"/&gt;
 *         &lt;element name="UpdateRq" type="{http://schemas.radixware.org/eas.xsd}UpdateRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateMess", propOrder = {
    "updateRs",
    "updateRq"
})
public class UpdateMess {

    @XmlElement(name = "UpdateRs")
    protected UpdateRs updateRs;
    @XmlElement(name = "UpdateRq")
    protected UpdateRq updateRq;

    /**
     * Gets the value of the updateRs property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateRs }
     *     
     */
    public UpdateRs getUpdateRs() {
        return updateRs;
    }

    /**
     * Sets the value of the updateRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateRs }
     *     
     */
    public void setUpdateRs(UpdateRs value) {
        this.updateRs = value;
    }

    /**
     * Gets the value of the updateRq property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateRq }
     *     
     */
    public UpdateRq getUpdateRq() {
        return updateRq;
    }

    /**
     * Sets the value of the updateRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateRq }
     *     
     */
    public void setUpdateRq(UpdateRq value) {
        this.updateRq = value;
    }

}
