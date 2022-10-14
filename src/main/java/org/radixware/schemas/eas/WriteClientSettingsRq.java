
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WriteClientSettingsRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WriteClientSettingsRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Settings" type="{http://schemas.radixware.org/eas.xsd}LocalSettings" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WriteClientSettingsRq", propOrder = {
    "settings"
})
public class WriteClientSettingsRq {

    @XmlElement(name = "Settings")
    protected LocalSettings settings;

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link LocalSettings }
     *     
     */
    public LocalSettings getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalSettings }
     *     
     */
    public void setSettings(LocalSettings value) {
        this.settings = value;
    }

}
