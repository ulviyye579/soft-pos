
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectedObjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedObjects"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Object" type="{http://schemas.radixware.org/eas.xsd}SelectedObject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SelectionMode" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedObjects", propOrder = {
    "object"
})
public class SelectedObjects {

    @XmlElement(name = "Object")
    protected List<SelectedObject> object;
    @XmlAttribute(name = "SelectionMode", required = true)
    protected long selectionMode;

    /**
     * Gets the value of the object property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the object property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectedObject }
     * 
     * 
     */
    public List<SelectedObject> getObject() {
        if (object == null) {
            object = new ArrayList<SelectedObject>();
        }
        return this.object;
    }

    /**
     * Gets the value of the selectionMode property.
     * 
     */
    public long getSelectionMode() {
        return selectionMode;
    }

    /**
     * Sets the value of the selectionMode property.
     * 
     */
    public void setSelectionMode(long value) {
        this.selectionMode = value;
    }

}
