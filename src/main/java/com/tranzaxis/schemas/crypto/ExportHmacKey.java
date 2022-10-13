
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportHmacKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportHmacKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ExportHmacKeyRq" type="{http://schemas.tranzaxis.com/crypto.xsd}ExportHmacKeyRq"/&gt;
 *         &lt;element name="ExportHmacKeyRs" type="{http://schemas.tranzaxis.com/crypto.xsd}ExportHmacKeyRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportHmacKey", propOrder = {
    "exportHmacKeyRq",
    "exportHmacKeyRs"
})
public class ExportHmacKey {

    @XmlElement(name = "ExportHmacKeyRq")
    protected ExportHmacKeyRq exportHmacKeyRq;
    @XmlElement(name = "ExportHmacKeyRs")
    protected ExportHmacKeyRs exportHmacKeyRs;

    /**
     * Gets the value of the exportHmacKeyRq property.
     * 
     * @return
     *     possible object is
     *     {@link ExportHmacKeyRq }
     *     
     */
    public ExportHmacKeyRq getExportHmacKeyRq() {
        return exportHmacKeyRq;
    }

    /**
     * Sets the value of the exportHmacKeyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportHmacKeyRq }
     *     
     */
    public void setExportHmacKeyRq(ExportHmacKeyRq value) {
        this.exportHmacKeyRq = value;
    }

    /**
     * Gets the value of the exportHmacKeyRs property.
     * 
     * @return
     *     possible object is
     *     {@link ExportHmacKeyRs }
     *     
     */
    public ExportHmacKeyRs getExportHmacKeyRs() {
        return exportHmacKeyRs;
    }

    /**
     * Sets the value of the exportHmacKeyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportHmacKeyRs }
     *     
     */
    public void setExportHmacKeyRs(ExportHmacKeyRs value) {
        this.exportHmacKeyRs = value;
    }

}
