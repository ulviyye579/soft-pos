
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WriteClientSettingsMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WriteClientSettingsMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="WriteClientSettingsRq" type="{http://schemas.radixware.org/eas.xsd}WriteClientSettingsRq"/&gt;
 *         &lt;element name="WriteClientSettingsRs" type="{http://schemas.radixware.org/eas.xsd}WriteClientSettingsRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WriteClientSettingsMess", propOrder = {
    "writeClientSettingsRq",
    "writeClientSettingsRs"
})
public class WriteClientSettingsMess {

    @XmlElement(name = "WriteClientSettingsRq")
    protected WriteClientSettingsRq writeClientSettingsRq;
    @XmlElement(name = "WriteClientSettingsRs")
    protected WriteClientSettingsRs writeClientSettingsRs;

    /**
     * Gets the value of the writeClientSettingsRq property.
     * 
     * @return
     *     possible object is
     *     {@link WriteClientSettingsRq }
     *     
     */
    public WriteClientSettingsRq getWriteClientSettingsRq() {
        return writeClientSettingsRq;
    }

    /**
     * Sets the value of the writeClientSettingsRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteClientSettingsRq }
     *     
     */
    public void setWriteClientSettingsRq(WriteClientSettingsRq value) {
        this.writeClientSettingsRq = value;
    }

    /**
     * Gets the value of the writeClientSettingsRs property.
     * 
     * @return
     *     possible object is
     *     {@link WriteClientSettingsRs }
     *     
     */
    public WriteClientSettingsRs getWriteClientSettingsRs() {
        return writeClientSettingsRs;
    }

    /**
     * Sets the value of the writeClientSettingsRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteClientSettingsRs }
     *     
     */
    public void setWriteClientSettingsRs(WriteClientSettingsRs value) {
        this.writeClientSettingsRs = value;
    }

}
