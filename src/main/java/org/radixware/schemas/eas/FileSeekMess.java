
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileSeekMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileSeekMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FileSeekRs" type="{http://schemas.radixware.org/eas.xsd}FileSeekRs"/&gt;
 *         &lt;element name="FileSeekRq" type="{http://schemas.radixware.org/eas.xsd}FileSeekRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileSeekMess", propOrder = {
    "fileSeekRs",
    "fileSeekRq"
})
public class FileSeekMess {

    @XmlElement(name = "FileSeekRs")
    protected FileSeekRs fileSeekRs;
    @XmlElement(name = "FileSeekRq")
    protected FileSeekRq fileSeekRq;

    /**
     * Gets the value of the fileSeekRs property.
     * 
     * @return
     *     possible object is
     *     {@link FileSeekRs }
     *     
     */
    public FileSeekRs getFileSeekRs() {
        return fileSeekRs;
    }

    /**
     * Sets the value of the fileSeekRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSeekRs }
     *     
     */
    public void setFileSeekRs(FileSeekRs value) {
        this.fileSeekRs = value;
    }

    /**
     * Gets the value of the fileSeekRq property.
     * 
     * @return
     *     possible object is
     *     {@link FileSeekRq }
     *     
     */
    public FileSeekRq getFileSeekRq() {
        return fileSeekRq;
    }

    /**
     * Sets the value of the fileSeekRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSeekRq }
     *     
     */
    public void setFileSeekRq(FileSeekRq value) {
        this.fileSeekRq = value;
    }

}
