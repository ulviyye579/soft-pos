
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportKeyUnderTr34 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportKeyUnderTr34"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ExportKeyUnderTr34Rq" type="{http://schemas.tranzaxis.com/crypto.xsd}ExportKeyUnderTr34Rq"/&gt;
 *         &lt;element name="ExportKeyUnderTr34Rs" type="{http://schemas.tranzaxis.com/crypto.xsd}ExportKeyUnderTr34Rs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportKeyUnderTr34", propOrder = {
    "exportKeyUnderTr34Rq",
    "exportKeyUnderTr34Rs"
})
public class ExportKeyUnderTr34 {

    @XmlElement(name = "ExportKeyUnderTr34Rq")
    protected ExportKeyUnderTr34Rq exportKeyUnderTr34Rq;
    @XmlElement(name = "ExportKeyUnderTr34Rs")
    protected ExportKeyUnderTr34Rs exportKeyUnderTr34Rs;

    /**
     * Gets the value of the exportKeyUnderTr34Rq property.
     * 
     * @return
     *     possible object is
     *     {@link ExportKeyUnderTr34Rq }
     *     
     */
    public ExportKeyUnderTr34Rq getExportKeyUnderTr34Rq() {
        return exportKeyUnderTr34Rq;
    }

    /**
     * Sets the value of the exportKeyUnderTr34Rq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportKeyUnderTr34Rq }
     *     
     */
    public void setExportKeyUnderTr34Rq(ExportKeyUnderTr34Rq value) {
        this.exportKeyUnderTr34Rq = value;
    }

    /**
     * Gets the value of the exportKeyUnderTr34Rs property.
     * 
     * @return
     *     possible object is
     *     {@link ExportKeyUnderTr34Rs }
     *     
     */
    public ExportKeyUnderTr34Rs getExportKeyUnderTr34Rs() {
        return exportKeyUnderTr34Rs;
    }

    /**
     * Sets the value of the exportKeyUnderTr34Rs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportKeyUnderTr34Rs }
     *     
     */
    public void setExportKeyUnderTr34Rs(ExportKeyUnderTr34Rs value) {
        this.exportKeyUnderTr34Rs = value;
    }

}
