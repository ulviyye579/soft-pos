
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileDeleteMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileDeleteMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FileDeleteRs" type="{http://schemas.radixware.org/eas.xsd}FileDeleteRs"/&gt;
 *         &lt;element name="FileDeleteRq" type="{http://schemas.radixware.org/eas.xsd}FileDeleteRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDeleteMess", propOrder = {
    "fileDeleteRs",
    "fileDeleteRq"
})
public class FileDeleteMess {

    @XmlElement(name = "FileDeleteRs")
    protected FileDeleteRs fileDeleteRs;
    @XmlElement(name = "FileDeleteRq")
    protected FileDeleteRq fileDeleteRq;

    /**
     * Gets the value of the fileDeleteRs property.
     * 
     * @return
     *     possible object is
     *     {@link FileDeleteRs }
     *     
     */
    public FileDeleteRs getFileDeleteRs() {
        return fileDeleteRs;
    }

    /**
     * Sets the value of the fileDeleteRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDeleteRs }
     *     
     */
    public void setFileDeleteRs(FileDeleteRs value) {
        this.fileDeleteRs = value;
    }

    /**
     * Gets the value of the fileDeleteRq property.
     * 
     * @return
     *     possible object is
     *     {@link FileDeleteRq }
     *     
     */
    public FileDeleteRq getFileDeleteRq() {
        return fileDeleteRq;
    }

    /**
     * Sets the value of the fileDeleteRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDeleteRq }
     *     
     */
    public void setFileDeleteRq(FileDeleteRq value) {
        this.fileDeleteRq = value;
    }

}
