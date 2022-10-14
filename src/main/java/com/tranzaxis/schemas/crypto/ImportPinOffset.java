
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportPinOffset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportPinOffset"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ImportPinOffsetRq" type="{http://schemas.tranzaxis.com/crypto.xsd}ImportPinOffsetRq"/&gt;
 *         &lt;element name="ImportPinOffsetRs" type="{http://schemas.tranzaxis.com/crypto.xsd}ImportPinOffsetRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportPinOffset", propOrder = {
    "importPinOffsetRq",
    "importPinOffsetRs"
})
public class ImportPinOffset {

    @XmlElement(name = "ImportPinOffsetRq")
    protected ImportPinOffsetRq importPinOffsetRq;
    @XmlElement(name = "ImportPinOffsetRs")
    protected ImportPinOffsetRs importPinOffsetRs;

    /**
     * Gets the value of the importPinOffsetRq property.
     * 
     * @return
     *     possible object is
     *     {@link ImportPinOffsetRq }
     *     
     */
    public ImportPinOffsetRq getImportPinOffsetRq() {
        return importPinOffsetRq;
    }

    /**
     * Sets the value of the importPinOffsetRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportPinOffsetRq }
     *     
     */
    public void setImportPinOffsetRq(ImportPinOffsetRq value) {
        this.importPinOffsetRq = value;
    }

    /**
     * Gets the value of the importPinOffsetRs property.
     * 
     * @return
     *     possible object is
     *     {@link ImportPinOffsetRs }
     *     
     */
    public ImportPinOffsetRs getImportPinOffsetRs() {
        return importPinOffsetRs;
    }

    /**
     * Sets the value of the importPinOffsetRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportPinOffsetRs }
     *     
     */
    public void setImportPinOffsetRs(ImportPinOffsetRs value) {
        this.importPinOffsetRs = value;
    }

}
