
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListInstantiatableClassesMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListInstantiatableClassesMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ListInstantiatableClassesRs" type="{http://schemas.radixware.org/eas.xsd}ListInstantiatableClassesRs"/&gt;
 *         &lt;element name="ListInstantiatableClassesRq" type="{http://schemas.radixware.org/eas.xsd}ListInstantiatableClassesRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListInstantiatableClassesMess", propOrder = {
    "listInstantiatableClassesRs",
    "listInstantiatableClassesRq"
})
public class ListInstantiatableClassesMess {

    @XmlElement(name = "ListInstantiatableClassesRs")
    protected ListInstantiatableClassesRs listInstantiatableClassesRs;
    @XmlElement(name = "ListInstantiatableClassesRq")
    protected ListInstantiatableClassesRq listInstantiatableClassesRq;

    /**
     * Gets the value of the listInstantiatableClassesRs property.
     * 
     * @return
     *     possible object is
     *     {@link ListInstantiatableClassesRs }
     *     
     */
    public ListInstantiatableClassesRs getListInstantiatableClassesRs() {
        return listInstantiatableClassesRs;
    }

    /**
     * Sets the value of the listInstantiatableClassesRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListInstantiatableClassesRs }
     *     
     */
    public void setListInstantiatableClassesRs(ListInstantiatableClassesRs value) {
        this.listInstantiatableClassesRs = value;
    }

    /**
     * Gets the value of the listInstantiatableClassesRq property.
     * 
     * @return
     *     possible object is
     *     {@link ListInstantiatableClassesRq }
     *     
     */
    public ListInstantiatableClassesRq getListInstantiatableClassesRq() {
        return listInstantiatableClassesRq;
    }

    /**
     * Sets the value of the listInstantiatableClassesRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListInstantiatableClassesRq }
     *     
     */
    public void setListInstantiatableClassesRq(ListInstantiatableClassesRq value) {
        this.listInstantiatableClassesRq = value;
    }

}
