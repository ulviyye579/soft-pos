
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ExportKeyRq" type="{http://schemas.tranzaxis.com/crypto.xsd}ExportKeyRq"/&gt;
 *         &lt;element name="ExportKeyRs" type="{http://schemas.tranzaxis.com/crypto.xsd}ExportKeyRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportKey", propOrder = {
    "exportKeyRq",
    "exportKeyRs"
})
public class ExportKey {

    @XmlElement(name = "ExportKeyRq")
    protected ExportKeyRq exportKeyRq;
    @XmlElement(name = "ExportKeyRs")
    protected ExportKeyRs exportKeyRs;

    /**
     * Gets the value of the exportKeyRq property.
     * 
     * @return
     *     possible object is
     *     {@link ExportKeyRq }
     *     
     */
    public ExportKeyRq getExportKeyRq() {
        return exportKeyRq;
    }

    /**
     * Sets the value of the exportKeyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportKeyRq }
     *     
     */
    public void setExportKeyRq(ExportKeyRq value) {
        this.exportKeyRq = value;
    }

    /**
     * Gets the value of the exportKeyRs property.
     * 
     * @return
     *     possible object is
     *     {@link ExportKeyRs }
     *     
     */
    public ExportKeyRs getExportKeyRs() {
        return exportKeyRs;
    }

    /**
     * Sets the value of the exportKeyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportKeyRs }
     *     
     */
    public void setExportKeyRs(ExportKeyRs value) {
        this.exportKeyRs = value;
    }

}
