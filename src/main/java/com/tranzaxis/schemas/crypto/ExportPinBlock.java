
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportPinBlock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportPinBlock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ExportPinBlockRq" type="{http://schemas.tranzaxis.com/crypto.xsd}ExportPinBlockRq"/&gt;
 *         &lt;element name="ExportPinBlockRs" type="{http://schemas.tranzaxis.com/crypto.xsd}ExportPinBlockRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportPinBlock", propOrder = {
    "exportPinBlockRq",
    "exportPinBlockRs"
})
public class ExportPinBlock {

    @XmlElement(name = "ExportPinBlockRq")
    protected ExportPinBlockRq exportPinBlockRq;
    @XmlElement(name = "ExportPinBlockRs")
    protected ExportPinBlockRs exportPinBlockRs;

    /**
     * Gets the value of the exportPinBlockRq property.
     * 
     * @return
     *     possible object is
     *     {@link ExportPinBlockRq }
     *     
     */
    public ExportPinBlockRq getExportPinBlockRq() {
        return exportPinBlockRq;
    }

    /**
     * Sets the value of the exportPinBlockRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportPinBlockRq }
     *     
     */
    public void setExportPinBlockRq(ExportPinBlockRq value) {
        this.exportPinBlockRq = value;
    }

    /**
     * Gets the value of the exportPinBlockRs property.
     * 
     * @return
     *     possible object is
     *     {@link ExportPinBlockRs }
     *     
     */
    public ExportPinBlockRs getExportPinBlockRs() {
        return exportPinBlockRs;
    }

    /**
     * Sets the value of the exportPinBlockRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportPinBlockRs }
     *     
     */
    public void setExportPinBlockRs(ExportPinBlockRs value) {
        this.exportPinBlockRs = value;
    }

}
