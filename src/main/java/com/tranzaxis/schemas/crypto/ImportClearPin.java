
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportClearPin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportClearPin"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ImportClearPinRq" type="{http://schemas.tranzaxis.com/crypto.xsd}ImportClearPinRq"/&gt;
 *         &lt;element name="ImportClearPinRs" type="{http://schemas.tranzaxis.com/crypto.xsd}ImportClearPinRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportClearPin", propOrder = {
    "importClearPinRq",
    "importClearPinRs"
})
public class ImportClearPin {

    @XmlElement(name = "ImportClearPinRq")
    protected ImportClearPinRq importClearPinRq;
    @XmlElement(name = "ImportClearPinRs")
    protected ImportClearPinRs importClearPinRs;

    /**
     * Gets the value of the importClearPinRq property.
     * 
     * @return
     *     possible object is
     *     {@link ImportClearPinRq }
     *     
     */
    public ImportClearPinRq getImportClearPinRq() {
        return importClearPinRq;
    }

    /**
     * Sets the value of the importClearPinRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportClearPinRq }
     *     
     */
    public void setImportClearPinRq(ImportClearPinRq value) {
        this.importClearPinRq = value;
    }

    /**
     * Gets the value of the importClearPinRs property.
     * 
     * @return
     *     possible object is
     *     {@link ImportClearPinRs }
     *     
     */
    public ImportClearPinRs getImportClearPinRs() {
        return importClearPinRs;
    }

    /**
     * Sets the value of the importClearPinRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportClearPinRs }
     *     
     */
    public void setImportClearPinRs(ImportClearPinRs value) {
        this.importClearPinRs = value;
    }

}
