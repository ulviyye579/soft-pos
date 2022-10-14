
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileReadMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileReadMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FileReadRs" type="{http://schemas.radixware.org/eas.xsd}FileReadRs"/&gt;
 *         &lt;element name="FileReadRq" type="{http://schemas.radixware.org/eas.xsd}FileReadRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileReadMess", propOrder = {
    "fileReadRs",
    "fileReadRq"
})
public class FileReadMess {

    @XmlElement(name = "FileReadRs")
    protected FileReadRs fileReadRs;
    @XmlElement(name = "FileReadRq")
    protected FileReadRq fileReadRq;

    /**
     * Gets the value of the fileReadRs property.
     * 
     * @return
     *     possible object is
     *     {@link FileReadRs }
     *     
     */
    public FileReadRs getFileReadRs() {
        return fileReadRs;
    }

    /**
     * Sets the value of the fileReadRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileReadRs }
     *     
     */
    public void setFileReadRs(FileReadRs value) {
        this.fileReadRs = value;
    }

    /**
     * Gets the value of the fileReadRq property.
     * 
     * @return
     *     possible object is
     *     {@link FileReadRq }
     *     
     */
    public FileReadRq getFileReadRq() {
        return fileReadRq;
    }

    /**
     * Sets the value of the fileReadRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileReadRq }
     *     
     */
    public void setFileReadRq(FileReadRq value) {
        this.fileReadRq = value;
    }

}
