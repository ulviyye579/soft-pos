
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RklTr34GenerateAndEncryptKeyRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RklTr34GenerateAndEncryptKeyRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Key" type="{http://schemas.tranzaxis.com/crypto.xsd}IntKey"/&gt;
 *         &lt;element name="ExportedKey" type="{http://schemas.tranzaxis.com/crypto.xsd}ExportKeyUnderTr34Result"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RklTr34GenerateAndEncryptKeyRs", propOrder = {
    "key",
    "exportedKey"
})
public class RklTr34GenerateAndEncryptKeyRs {

    @XmlElement(name = "Key", required = true)
    protected IntKey key;
    @XmlElement(name = "ExportedKey", required = true)
    protected ExportKeyUnderTr34Result exportedKey;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link IntKey }
     *     
     */
    public IntKey getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntKey }
     *     
     */
    public void setKey(IntKey value) {
        this.key = value;
    }

    /**
     * Gets the value of the exportedKey property.
     * 
     * @return
     *     possible object is
     *     {@link ExportKeyUnderTr34Result }
     *     
     */
    public ExportKeyUnderTr34Result getExportedKey() {
        return exportedKey;
    }

    /**
     * Sets the value of the exportedKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportKeyUnderTr34Result }
     *     
     */
    public void setExportedKey(ExportKeyUnderTr34Result value) {
        this.exportedKey = value;
    }

}
