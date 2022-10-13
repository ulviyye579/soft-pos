
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportRsaKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportRsaKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ExportRsaKeyRq" type="{http://schemas.tranzaxis.com/crypto.xsd}ExportRsaKeyRq"/&gt;
 *         &lt;element name="ExportRsaKeyRs" type="{http://schemas.tranzaxis.com/crypto.xsd}ExportRsaKeyRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportRsaKey", propOrder = {
    "exportRsaKeyRq",
    "exportRsaKeyRs"
})
public class ExportRsaKey {

    @XmlElement(name = "ExportRsaKeyRq")
    protected ExportRsaKeyRq exportRsaKeyRq;
    @XmlElement(name = "ExportRsaKeyRs")
    protected ExportRsaKeyRs exportRsaKeyRs;

    /**
     * Gets the value of the exportRsaKeyRq property.
     * 
     * @return
     *     possible object is
     *     {@link ExportRsaKeyRq }
     *     
     */
    public ExportRsaKeyRq getExportRsaKeyRq() {
        return exportRsaKeyRq;
    }

    /**
     * Sets the value of the exportRsaKeyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportRsaKeyRq }
     *     
     */
    public void setExportRsaKeyRq(ExportRsaKeyRq value) {
        this.exportRsaKeyRq = value;
    }

    /**
     * Gets the value of the exportRsaKeyRs property.
     * 
     * @return
     *     possible object is
     *     {@link ExportRsaKeyRs }
     *     
     */
    public ExportRsaKeyRs getExportRsaKeyRs() {
        return exportRsaKeyRs;
    }

    /**
     * Sets the value of the exportRsaKeyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportRsaKeyRs }
     *     
     */
    public void setExportRsaKeyRs(ExportRsaKeyRs value) {
        this.exportRsaKeyRs = value;
    }

}
