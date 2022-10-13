
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * \u0426\u0435\u043f\u043e\u0447\u043a\u0430 \u0444\u043e\u0440\u043c
 * 
 * <p>Java class for Form complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Form"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Definition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Properties" type="{http://schemas.radixware.org/eas.xsd}PropertyList" minOccurs="0"/&gt;
 *         &lt;element name="PrevForm" type="{http://schemas.radixware.org/eas.xsd}Form" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Form", propOrder = {
    "properties",
    "prevForm"
})
public class Form
    extends Definition
{

    @XmlElement(name = "Properties")
    protected PropertyList properties;
    @XmlElement(name = "PrevForm")
    protected Form prevForm;

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
     * Gets the value of the prevForm property.
     * 
     * @return
     *     possible object is
     *     {@link Form }
     *     
     */
    public Form getPrevForm() {
        return prevForm;
    }

    /**
     * Sets the value of the prevForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Form }
     *     
     */
    public void setPrevForm(Form value) {
        this.prevForm = value;
    }

}
