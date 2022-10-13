
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadManifestMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadManifestMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ReadManifestRs" type="{http://schemas.radixware.org/eas.xsd}ReadManifestRs"/&gt;
 *         &lt;element name="ReadManifestRq" type="{http://schemas.radixware.org/eas.xsd}ReadManifestRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadManifestMess", propOrder = {
    "readManifestRs",
    "readManifestRq"
})
public class ReadManifestMess {

    @XmlElement(name = "ReadManifestRs")
    protected ReadManifestRs readManifestRs;
    @XmlElement(name = "ReadManifestRq")
    protected ReadManifestRq readManifestRq;

    /**
     * Gets the value of the readManifestRs property.
     * 
     * @return
     *     possible object is
     *     {@link ReadManifestRs }
     *     
     */
    public ReadManifestRs getReadManifestRs() {
        return readManifestRs;
    }

    /**
     * Sets the value of the readManifestRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadManifestRs }
     *     
     */
    public void setReadManifestRs(ReadManifestRs value) {
        this.readManifestRs = value;
    }

    /**
     * Gets the value of the readManifestRq property.
     * 
     * @return
     *     possible object is
     *     {@link ReadManifestRq }
     *     
     */
    public ReadManifestRq getReadManifestRq() {
        return readManifestRq;
    }

    /**
     * Sets the value of the readManifestRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadManifestRq }
     *     
     */
    public void setReadManifestRq(ReadManifestRq value) {
        this.readManifestRq = value;
    }

}
