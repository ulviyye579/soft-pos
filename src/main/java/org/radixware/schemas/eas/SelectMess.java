
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SelectRs" type="{http://schemas.radixware.org/eas.xsd}SelectRs"/&gt;
 *         &lt;element name="SelectRq" type="{http://schemas.radixware.org/eas.xsd}SelectRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectMess", propOrder = {
    "selectRs",
    "selectRq"
})
public class SelectMess {

    @XmlElement(name = "SelectRs")
    protected SelectRs selectRs;
    @XmlElement(name = "SelectRq")
    protected SelectRq selectRq;

    /**
     * Gets the value of the selectRs property.
     * 
     * @return
     *     possible object is
     *     {@link SelectRs }
     *     
     */
    public SelectRs getSelectRs() {
        return selectRs;
    }

    /**
     * Sets the value of the selectRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectRs }
     *     
     */
    public void setSelectRs(SelectRs value) {
        this.selectRs = value;
    }

    /**
     * Gets the value of the selectRq property.
     * 
     * @return
     *     possible object is
     *     {@link SelectRq }
     *     
     */
    public SelectRq getSelectRq() {
        return selectRq;
    }

    /**
     * Sets the value of the selectRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectRq }
     *     
     */
    public void setSelectRq(SelectRq value) {
        this.selectRq = value;
    }

}
