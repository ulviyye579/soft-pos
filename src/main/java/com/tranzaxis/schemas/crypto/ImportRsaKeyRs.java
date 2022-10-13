
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportRsaKeyRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportRsaKeyRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImportedRsaKey" type="{http://schemas.tranzaxis.com/crypto.xsd}IntTypedRsaKey"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportRsaKeyRs", propOrder = {
    "importedRsaKey"
})
public class ImportRsaKeyRs {

    @XmlElement(name = "ImportedRsaKey", required = true)
    protected IntTypedRsaKey importedRsaKey;

    /**
     * Gets the value of the importedRsaKey property.
     * 
     * @return
     *     possible object is
     *     {@link IntTypedRsaKey }
     *     
     */
    public IntTypedRsaKey getImportedRsaKey() {
        return importedRsaKey;
    }

    /**
     * Sets the value of the importedRsaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTypedRsaKey }
     *     
     */
    public void setImportedRsaKey(IntTypedRsaKey value) {
        this.importedRsaKey = value;
    }

}
