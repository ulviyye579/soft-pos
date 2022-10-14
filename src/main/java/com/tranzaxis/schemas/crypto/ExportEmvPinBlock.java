
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportEmvPinBlock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportEmvPinBlock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ExportEmvPinBlockRq" type="{http://schemas.tranzaxis.com/crypto.xsd}ExportEmvPinBlockRq"/&gt;
 *         &lt;element name="ExportEmvPinBlockRs" type="{http://schemas.tranzaxis.com/crypto.xsd}ExportEmvPinBlockRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportEmvPinBlock", propOrder = {
    "exportEmvPinBlockRq",
    "exportEmvPinBlockRs"
})
public class ExportEmvPinBlock {

    @XmlElement(name = "ExportEmvPinBlockRq")
    protected ExportEmvPinBlockRq exportEmvPinBlockRq;
    @XmlElement(name = "ExportEmvPinBlockRs")
    protected ExportEmvPinBlockRs exportEmvPinBlockRs;

    /**
     * Gets the value of the exportEmvPinBlockRq property.
     * 
     * @return
     *     possible object is
     *     {@link ExportEmvPinBlockRq }
     *     
     */
    public ExportEmvPinBlockRq getExportEmvPinBlockRq() {
        return exportEmvPinBlockRq;
    }

    /**
     * Sets the value of the exportEmvPinBlockRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportEmvPinBlockRq }
     *     
     */
    public void setExportEmvPinBlockRq(ExportEmvPinBlockRq value) {
        this.exportEmvPinBlockRq = value;
    }

    /**
     * Gets the value of the exportEmvPinBlockRs property.
     * 
     * @return
     *     possible object is
     *     {@link ExportEmvPinBlockRs }
     *     
     */
    public ExportEmvPinBlockRs getExportEmvPinBlockRs() {
        return exportEmvPinBlockRs;
    }

    /**
     * Sets the value of the exportEmvPinBlockRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportEmvPinBlockRs }
     *     
     */
    public void setExportEmvPinBlockRs(ExportEmvPinBlockRs value) {
        this.exportEmvPinBlockRs = value;
    }

}
