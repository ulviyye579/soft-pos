
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="DeleteRs" type="{http://schemas.radixware.org/eas.xsd}DeleteRs"/&gt;
 *         &lt;element name="DeleteRq" type="{http://schemas.radixware.org/eas.xsd}DeleteRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteMess", propOrder = {
    "deleteRs",
    "deleteRq"
})
public class DeleteMess {

    @XmlElement(name = "DeleteRs")
    protected DeleteRs deleteRs;
    @XmlElement(name = "DeleteRq")
    protected DeleteRq deleteRq;

    /**
     * Gets the value of the deleteRs property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteRs }
     *     
     */
    public DeleteRs getDeleteRs() {
        return deleteRs;
    }

    /**
     * Sets the value of the deleteRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteRs }
     *     
     */
    public void setDeleteRs(DeleteRs value) {
        this.deleteRs = value;
    }

    /**
     * Gets the value of the deleteRq property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteRq }
     *     
     */
    public DeleteRq getDeleteRq() {
        return deleteRq;
    }

    /**
     * Sets the value of the deleteRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteRq }
     *     
     */
    public void setDeleteRq(DeleteRq value) {
        this.deleteRq = value;
    }

}
