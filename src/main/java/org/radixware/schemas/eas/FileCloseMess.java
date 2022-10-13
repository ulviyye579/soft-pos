
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileCloseMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileCloseMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FileCloseRs" type="{http://schemas.radixware.org/eas.xsd}FileCloseRs"/&gt;
 *         &lt;element name="FileCloseRq" type="{http://schemas.radixware.org/eas.xsd}FileCloseRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileCloseMess", propOrder = {
    "fileCloseRs",
    "fileCloseRq"
})
public class FileCloseMess {

    @XmlElement(name = "FileCloseRs")
    protected FileCloseRs fileCloseRs;
    @XmlElement(name = "FileCloseRq")
    protected FileCloseRq fileCloseRq;

    /**
     * Gets the value of the fileCloseRs property.
     * 
     * @return
     *     possible object is
     *     {@link FileCloseRs }
     *     
     */
    public FileCloseRs getFileCloseRs() {
        return fileCloseRs;
    }

    /**
     * Sets the value of the fileCloseRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileCloseRs }
     *     
     */
    public void setFileCloseRs(FileCloseRs value) {
        this.fileCloseRs = value;
    }

    /**
     * Gets the value of the fileCloseRq property.
     * 
     * @return
     *     possible object is
     *     {@link FileCloseRq }
     *     
     */
    public FileCloseRq getFileCloseRq() {
        return fileCloseRq;
    }

    /**
     * Sets the value of the fileCloseRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileCloseRq }
     *     
     */
    public void setFileCloseRq(FileCloseRq value) {
        this.fileCloseRq = value;
    }

}
