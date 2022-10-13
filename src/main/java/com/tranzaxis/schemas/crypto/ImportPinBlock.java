
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportPinBlock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportPinBlock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ImportPinBlockRq" type="{http://schemas.tranzaxis.com/crypto.xsd}ImportPinBlockRq"/&gt;
 *         &lt;element name="ImportPinBlockRs" type="{http://schemas.tranzaxis.com/crypto.xsd}ImportPinBlockRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportPinBlock", propOrder = {
    "importPinBlockRq",
    "importPinBlockRs"
})
public class ImportPinBlock {

    @XmlElement(name = "ImportPinBlockRq")
    protected ImportPinBlockRq importPinBlockRq;
    @XmlElement(name = "ImportPinBlockRs")
    protected ImportPinBlockRs importPinBlockRs;

    /**
     * Gets the value of the importPinBlockRq property.
     * 
     * @return
     *     possible object is
     *     {@link ImportPinBlockRq }
     *     
     */
    public ImportPinBlockRq getImportPinBlockRq() {
        return importPinBlockRq;
    }

    /**
     * Sets the value of the importPinBlockRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportPinBlockRq }
     *     
     */
    public void setImportPinBlockRq(ImportPinBlockRq value) {
        this.importPinBlockRq = value;
    }

    /**
     * Gets the value of the importPinBlockRs property.
     * 
     * @return
     *     possible object is
     *     {@link ImportPinBlockRs }
     *     
     */
    public ImportPinBlockRs getImportPinBlockRs() {
        return importPinBlockRs;
    }

    /**
     * Sets the value of the importPinBlockRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportPinBlockRs }
     *     
     */
    public void setImportPinBlockRs(ImportPinBlockRs value) {
        this.importPinBlockRs = value;
    }

}
