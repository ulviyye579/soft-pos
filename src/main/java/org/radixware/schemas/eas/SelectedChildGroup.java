
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectedChildGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedChildGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectorPresentation" type="{http://schemas.radixware.org/eas.xsd}Presentation"/&gt;
 *         &lt;element name="Selection" type="{http://schemas.radixware.org/eas.xsd}SelectedObjects"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="GroupIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedChildGroup", propOrder = {
    "selectorPresentation",
    "selection"
})
public class SelectedChildGroup {

    @XmlElement(name = "SelectorPresentation", required = true)
    protected Presentation selectorPresentation;
    @XmlElement(name = "Selection", required = true)
    protected SelectedObjects selection;
    @XmlAttribute(name = "GroupIndex", required = true)
    protected int groupIndex;

    /**
     * Gets the value of the selectorPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link Presentation }
     *     
     */
    public Presentation getSelectorPresentation() {
        return selectorPresentation;
    }

    /**
     * Sets the value of the selectorPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Presentation }
     *     
     */
    public void setSelectorPresentation(Presentation value) {
        this.selectorPresentation = value;
    }

    /**
     * Gets the value of the selection property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedObjects }
     *     
     */
    public SelectedObjects getSelection() {
        return selection;
    }

    /**
     * Sets the value of the selection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedObjects }
     *     
     */
    public void setSelection(SelectedObjects value) {
        this.selection = value;
    }

    /**
     * Gets the value of the groupIndex property.
     * 
     */
    public int getGroupIndex() {
        return groupIndex;
    }

    /**
     * Sets the value of the groupIndex property.
     * 
     */
    public void setGroupIndex(int value) {
        this.groupIndex = value;
    }

}
