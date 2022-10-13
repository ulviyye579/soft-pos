
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportPinBlockDukpt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportPinBlockDukpt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ImportPinBlockDukptRq" type="{http://schemas.tranzaxis.com/crypto.xsd}ImportPinBlockDukptRq"/&gt;
 *         &lt;element name="ImportPinBlockDukptRs" type="{http://schemas.tranzaxis.com/crypto.xsd}ImportPinBlockDukptRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportPinBlockDukpt", propOrder = {
    "importPinBlockDukptRq",
    "importPinBlockDukptRs"
})
public class ImportPinBlockDukpt {

    @XmlElement(name = "ImportPinBlockDukptRq")
    protected ImportPinBlockDukptRq importPinBlockDukptRq;
    @XmlElement(name = "ImportPinBlockDukptRs")
    protected ImportPinBlockDukptRs importPinBlockDukptRs;

    /**
     * Gets the value of the importPinBlockDukptRq property.
     * 
     * @return
     *     possible object is
     *     {@link ImportPinBlockDukptRq }
     *     
     */
    public ImportPinBlockDukptRq getImportPinBlockDukptRq() {
        return importPinBlockDukptRq;
    }

    /**
     * Sets the value of the importPinBlockDukptRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportPinBlockDukptRq }
     *     
     */
    public void setImportPinBlockDukptRq(ImportPinBlockDukptRq value) {
        this.importPinBlockDukptRq = value;
    }

    /**
     * Gets the value of the importPinBlockDukptRs property.
     * 
     * @return
     *     possible object is
     *     {@link ImportPinBlockDukptRs }
     *     
     */
    public ImportPinBlockDukptRs getImportPinBlockDukptRs() {
        return importPinBlockDukptRs;
    }

    /**
     * Sets the value of the importPinBlockDukptRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportPinBlockDukptRs }
     *     
     */
    public void setImportPinBlockDukptRs(ImportPinBlockDukptRs value) {
        this.importPinBlockDukptRs = value;
    }

}
