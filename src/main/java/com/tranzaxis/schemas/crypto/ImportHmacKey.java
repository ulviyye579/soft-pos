
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportHmacKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportHmacKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ImportHmacKeyRq" type="{http://schemas.tranzaxis.com/crypto.xsd}ImportHmacKeyRq"/&gt;
 *         &lt;element name="ImportHmacKeyRs" type="{http://schemas.tranzaxis.com/crypto.xsd}ImportHmacKeyRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportHmacKey", propOrder = {
    "importHmacKeyRq",
    "importHmacKeyRs"
})
public class ImportHmacKey {

    @XmlElement(name = "ImportHmacKeyRq")
    protected ImportHmacKeyRq importHmacKeyRq;
    @XmlElement(name = "ImportHmacKeyRs")
    protected ImportHmacKeyRs importHmacKeyRs;

    /**
     * Gets the value of the importHmacKeyRq property.
     * 
     * @return
     *     possible object is
     *     {@link ImportHmacKeyRq }
     *     
     */
    public ImportHmacKeyRq getImportHmacKeyRq() {
        return importHmacKeyRq;
    }

    /**
     * Sets the value of the importHmacKeyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportHmacKeyRq }
     *     
     */
    public void setImportHmacKeyRq(ImportHmacKeyRq value) {
        this.importHmacKeyRq = value;
    }

    /**
     * Gets the value of the importHmacKeyRs property.
     * 
     * @return
     *     possible object is
     *     {@link ImportHmacKeyRs }
     *     
     */
    public ImportHmacKeyRs getImportHmacKeyRs() {
        return importHmacKeyRs;
    }

    /**
     * Sets the value of the importHmacKeyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportHmacKeyRs }
     *     
     */
    public void setImportHmacKeyRs(ImportHmacKeyRs value) {
        this.importHmacKeyRs = value;
    }

}
