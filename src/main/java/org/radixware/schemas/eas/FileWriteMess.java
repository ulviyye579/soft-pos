
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileWriteMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileWriteMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FileWriteRs" type="{http://schemas.radixware.org/eas.xsd}FileWriteRs"/&gt;
 *         &lt;element name="FileWriteRq" type="{http://schemas.radixware.org/eas.xsd}FileWriteRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileWriteMess", propOrder = {
    "fileWriteRs",
    "fileWriteRq"
})
public class FileWriteMess {

    @XmlElement(name = "FileWriteRs")
    protected FileWriteRs fileWriteRs;
    @XmlElement(name = "FileWriteRq")
    protected FileWriteRq fileWriteRq;

    /**
     * Gets the value of the fileWriteRs property.
     * 
     * @return
     *     possible object is
     *     {@link FileWriteRs }
     *     
     */
    public FileWriteRs getFileWriteRs() {
        return fileWriteRs;
    }

    /**
     * Sets the value of the fileWriteRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileWriteRs }
     *     
     */
    public void setFileWriteRs(FileWriteRs value) {
        this.fileWriteRs = value;
    }

    /**
     * Gets the value of the fileWriteRq property.
     * 
     * @return
     *     possible object is
     *     {@link FileWriteRq }
     *     
     */
    public FileWriteRq getFileWriteRq() {
        return fileWriteRq;
    }

    /**
     * Sets the value of the fileWriteRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileWriteRq }
     *     
     */
    public void setFileWriteRq(FileWriteRq value) {
        this.fileWriteRq = value;
    }

}
