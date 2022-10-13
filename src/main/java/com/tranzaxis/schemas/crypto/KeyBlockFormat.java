
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyBlockFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyBlockFormat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Version" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyBlockVersion" /&gt;
 *       &lt;attribute name="ModeOfUse" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyBlockModeOfUse" /&gt;
 *       &lt;attribute name="Exportability" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyBlockExportability" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyBlockFormat")
public class KeyBlockFormat {

    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "ModeOfUse")
    protected KeyBlockModeOfUse modeOfUse;
    @XmlAttribute(name = "Exportability")
    protected KeyBlockExportability exportability;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the modeOfUse property.
     * 
     * @return
     *     possible object is
     *     {@link KeyBlockModeOfUse }
     *     
     */
    public KeyBlockModeOfUse getModeOfUse() {
        return modeOfUse;
    }

    /**
     * Sets the value of the modeOfUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyBlockModeOfUse }
     *     
     */
    public void setModeOfUse(KeyBlockModeOfUse value) {
        this.modeOfUse = value;
    }

    /**
     * Gets the value of the exportability property.
     * 
     * @return
     *     possible object is
     *     {@link KeyBlockExportability }
     *     
     */
    public KeyBlockExportability getExportability() {
        return exportability;
    }

    /**
     * Sets the value of the exportability property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyBlockExportability }
     *     
     */
    public void setExportability(KeyBlockExportability value) {
        this.exportability = value;
    }

}
