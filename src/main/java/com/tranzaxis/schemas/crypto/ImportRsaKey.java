
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportRsaKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportRsaKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ImportRsaKeyRq" type="{http://schemas.tranzaxis.com/crypto.xsd}ImportRsaKeyRq"/&gt;
 *         &lt;element name="ImportRsaKeyRs" type="{http://schemas.tranzaxis.com/crypto.xsd}ImportRsaKeyRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportRsaKey", propOrder = {
    "importRsaKeyRq",
    "importRsaKeyRs"
})
public class ImportRsaKey {

    @XmlElement(name = "ImportRsaKeyRq")
    protected ImportRsaKeyRq importRsaKeyRq;
    @XmlElement(name = "ImportRsaKeyRs")
    protected ImportRsaKeyRs importRsaKeyRs;

    /**
     * Gets the value of the importRsaKeyRq property.
     * 
     * @return
     *     possible object is
     *     {@link ImportRsaKeyRq }
     *     
     */
    public ImportRsaKeyRq getImportRsaKeyRq() {
        return importRsaKeyRq;
    }

    /**
     * Sets the value of the importRsaKeyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportRsaKeyRq }
     *     
     */
    public void setImportRsaKeyRq(ImportRsaKeyRq value) {
        this.importRsaKeyRq = value;
    }

    /**
     * Gets the value of the importRsaKeyRs property.
     * 
     * @return
     *     possible object is
     *     {@link ImportRsaKeyRs }
     *     
     */
    public ImportRsaKeyRs getImportRsaKeyRs() {
        return importRsaKeyRs;
    }

    /**
     * Sets the value of the importRsaKeyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportRsaKeyRs }
     *     
     */
    public void setImportRsaKeyRs(ImportRsaKeyRs value) {
        this.importRsaKeyRs = value;
    }

}
