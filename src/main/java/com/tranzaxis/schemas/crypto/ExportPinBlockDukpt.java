
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportPinBlockDukpt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportPinBlockDukpt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ExportPinBlockDukptRq" type="{http://schemas.tranzaxis.com/crypto.xsd}ExportPinBlockDukptRq"/&gt;
 *         &lt;element name="ExportPinBlockDukptRs" type="{http://schemas.tranzaxis.com/crypto.xsd}ExportPinBlockDukptRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportPinBlockDukpt", propOrder = {
    "exportPinBlockDukptRq",
    "exportPinBlockDukptRs"
})
public class ExportPinBlockDukpt {

    @XmlElement(name = "ExportPinBlockDukptRq")
    protected ExportPinBlockDukptRq exportPinBlockDukptRq;
    @XmlElement(name = "ExportPinBlockDukptRs")
    protected ExportPinBlockDukptRs exportPinBlockDukptRs;

    /**
     * Gets the value of the exportPinBlockDukptRq property.
     * 
     * @return
     *     possible object is
     *     {@link ExportPinBlockDukptRq }
     *     
     */
    public ExportPinBlockDukptRq getExportPinBlockDukptRq() {
        return exportPinBlockDukptRq;
    }

    /**
     * Sets the value of the exportPinBlockDukptRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportPinBlockDukptRq }
     *     
     */
    public void setExportPinBlockDukptRq(ExportPinBlockDukptRq value) {
        this.exportPinBlockDukptRq = value;
    }

    /**
     * Gets the value of the exportPinBlockDukptRs property.
     * 
     * @return
     *     possible object is
     *     {@link ExportPinBlockDukptRs }
     *     
     */
    public ExportPinBlockDukptRs getExportPinBlockDukptRs() {
        return exportPinBlockDukptRs;
    }

    /**
     * Sets the value of the exportPinBlockDukptRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportPinBlockDukptRs }
     *     
     */
    public void setExportPinBlockDukptRs(ExportPinBlockDukptRs value) {
        this.exportPinBlockDukptRs = value;
    }

}
