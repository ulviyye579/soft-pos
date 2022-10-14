
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileSizeMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileSizeMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FileSizeRs" type="{http://schemas.radixware.org/eas.xsd}FileSizeRs"/&gt;
 *         &lt;element name="FileSizeRq" type="{http://schemas.radixware.org/eas.xsd}FileSizeRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileSizeMess", propOrder = {
    "fileSizeRs",
    "fileSizeRq"
})
public class FileSizeMess {

    @XmlElement(name = "FileSizeRs")
    protected FileSizeRs fileSizeRs;
    @XmlElement(name = "FileSizeRq")
    protected FileSizeRq fileSizeRq;

    /**
     * Gets the value of the fileSizeRs property.
     * 
     * @return
     *     possible object is
     *     {@link FileSizeRs }
     *     
     */
    public FileSizeRs getFileSizeRs() {
        return fileSizeRs;
    }

    /**
     * Sets the value of the fileSizeRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSizeRs }
     *     
     */
    public void setFileSizeRs(FileSizeRs value) {
        this.fileSizeRs = value;
    }

    /**
     * Gets the value of the fileSizeRq property.
     * 
     * @return
     *     possible object is
     *     {@link FileSizeRq }
     *     
     */
    public FileSizeRq getFileSizeRq() {
        return fileSizeRq;
    }

    /**
     * Sets the value of the fileSizeRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSizeRq }
     *     
     */
    public void setFileSizeRq(FileSizeRq value) {
        this.fileSizeRq = value;
    }

}
