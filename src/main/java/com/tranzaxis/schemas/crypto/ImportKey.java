
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ImportKeyRq" type="{http://schemas.tranzaxis.com/crypto.xsd}ImportKeyRq"/&gt;
 *         &lt;element name="ImportKeyRs" type="{http://schemas.tranzaxis.com/crypto.xsd}ImportKeyRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportKey", propOrder = {
    "importKeyRq",
    "importKeyRs"
})
public class ImportKey {

    @XmlElement(name = "ImportKeyRq")
    protected ImportKeyRq importKeyRq;
    @XmlElement(name = "ImportKeyRs")
    protected ImportKeyRs importKeyRs;

    /**
     * Gets the value of the importKeyRq property.
     * 
     * @return
     *     possible object is
     *     {@link ImportKeyRq }
     *     
     */
    public ImportKeyRq getImportKeyRq() {
        return importKeyRq;
    }

    /**
     * Sets the value of the importKeyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportKeyRq }
     *     
     */
    public void setImportKeyRq(ImportKeyRq value) {
        this.importKeyRq = value;
    }

    /**
     * Gets the value of the importKeyRs property.
     * 
     * @return
     *     possible object is
     *     {@link ImportKeyRs }
     *     
     */
    public ImportKeyRs getImportKeyRs() {
        return importKeyRs;
    }

    /**
     * Sets the value of the importKeyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportKeyRs }
     *     
     */
    public void setImportKeyRs(ImportKeyRs value) {
        this.importKeyRs = value;
    }

}
