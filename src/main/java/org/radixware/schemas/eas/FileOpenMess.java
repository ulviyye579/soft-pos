
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileOpenMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileOpenMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FileOpenRs" type="{http://schemas.radixware.org/eas.xsd}FileOpenRs"/&gt;
 *         &lt;element name="FileOpenRq" type="{http://schemas.radixware.org/eas.xsd}FileOpenRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileOpenMess", propOrder = {
    "fileOpenRs",
    "fileOpenRq"
})
public class FileOpenMess {

    @XmlElement(name = "FileOpenRs")
    protected FileOpenRs fileOpenRs;
    @XmlElement(name = "FileOpenRq")
    protected FileOpenRq fileOpenRq;

    /**
     * Gets the value of the fileOpenRs property.
     * 
     * @return
     *     possible object is
     *     {@link FileOpenRs }
     *     
     */
    public FileOpenRs getFileOpenRs() {
        return fileOpenRs;
    }

    /**
     * Sets the value of the fileOpenRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileOpenRs }
     *     
     */
    public void setFileOpenRs(FileOpenRs value) {
        this.fileOpenRs = value;
    }

    /**
     * Gets the value of the fileOpenRq property.
     * 
     * @return
     *     possible object is
     *     {@link FileOpenRq }
     *     
     */
    public FileOpenRq getFileOpenRq() {
        return fileOpenRq;
    }

    /**
     * Sets the value of the fileOpenRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileOpenRq }
     *     
     */
    public void setFileOpenRq(FileOpenRq value) {
        this.fileOpenRq = value;
    }

}
