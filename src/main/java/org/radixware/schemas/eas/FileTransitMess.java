
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileTransitMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileTransitMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FileTransitRs" type="{http://schemas.radixware.org/eas.xsd}FileTransitRs"/&gt;
 *         &lt;element name="FileTransitRq" type="{http://schemas.radixware.org/eas.xsd}FileTransitRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileTransitMess", propOrder = {
    "fileTransitRs",
    "fileTransitRq"
})
public class FileTransitMess {

    @XmlElement(name = "FileTransitRs")
    protected FileTransitRs fileTransitRs;
    @XmlElement(name = "FileTransitRq")
    protected FileTransitRq fileTransitRq;

    /**
     * Gets the value of the fileTransitRs property.
     * 
     * @return
     *     possible object is
     *     {@link FileTransitRs }
     *     
     */
    public FileTransitRs getFileTransitRs() {
        return fileTransitRs;
    }

    /**
     * Sets the value of the fileTransitRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileTransitRs }
     *     
     */
    public void setFileTransitRs(FileTransitRs value) {
        this.fileTransitRs = value;
    }

    /**
     * Gets the value of the fileTransitRq property.
     * 
     * @return
     *     possible object is
     *     {@link FileTransitRq }
     *     
     */
    public FileTransitRq getFileTransitRq() {
        return fileTransitRq;
    }

    /**
     * Sets the value of the fileTransitRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileTransitRq }
     *     
     */
    public void setFileTransitRq(FileTransitRq value) {
        this.fileTransitRq = value;
    }

}
