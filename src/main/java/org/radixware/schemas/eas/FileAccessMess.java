
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileAccessMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileAccessMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FileAccessRs" type="{http://schemas.radixware.org/eas.xsd}FileAccessRs"/&gt;
 *         &lt;element name="FileAccessRq" type="{http://schemas.radixware.org/eas.xsd}FileAccessRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileAccessMess", propOrder = {
    "fileAccessRs",
    "fileAccessRq"
})
public class FileAccessMess {

    @XmlElement(name = "FileAccessRs")
    protected FileAccessRs fileAccessRs;
    @XmlElement(name = "FileAccessRq")
    protected FileAccessRq fileAccessRq;

    /**
     * Gets the value of the fileAccessRs property.
     * 
     * @return
     *     possible object is
     *     {@link FileAccessRs }
     *     
     */
    public FileAccessRs getFileAccessRs() {
        return fileAccessRs;
    }

    /**
     * Sets the value of the fileAccessRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileAccessRs }
     *     
     */
    public void setFileAccessRs(FileAccessRs value) {
        this.fileAccessRs = value;
    }

    /**
     * Gets the value of the fileAccessRq property.
     * 
     * @return
     *     possible object is
     *     {@link FileAccessRq }
     *     
     */
    public FileAccessRq getFileAccessRq() {
        return fileAccessRq;
    }

    /**
     * Sets the value of the fileAccessRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileAccessRq }
     *     
     */
    public void setFileAccessRq(FileAccessRq value) {
        this.fileAccessRq = value;
    }

}
