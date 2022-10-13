
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetParentRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetParentRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Properties" type="{http://schemas.radixware.org/eas.xsd}PropertyList"/&gt;
 *         &lt;element name="ObjectTitle" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *         &lt;element name="DisabledActions" type="{http://schemas.radixware.org/eas.xsd}Actions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetParentRs", propOrder = {
    "properties",
    "objectTitle",
    "disabledActions"
})
public class SetParentRs
    extends Response
{

    @XmlElement(name = "Properties", required = true)
    protected PropertyList properties;
    @XmlElement(name = "ObjectTitle")
    protected String objectTitle;
    @XmlElement(name = "DisabledActions")
    protected Actions disabledActions;

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyList }
     *     
     */
    public PropertyList getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyList }
     *     
     */
    public void setProperties(PropertyList value) {
        this.properties = value;
    }

    /**
     * Gets the value of the objectTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectTitle() {
        return objectTitle;
    }

    /**
     * Sets the value of the objectTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectTitle(String value) {
        this.objectTitle = value;
    }

    /**
     * Gets the value of the disabledActions property.
     * 
     * @return
     *     possible object is
     *     {@link Actions }
     *     
     */
    public Actions getDisabledActions() {
        return disabledActions;
    }

    /**
     * Sets the value of the disabledActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Actions }
     *     
     */
    public void setDisabledActions(Actions value) {
        this.disabledActions = value;
    }

}
