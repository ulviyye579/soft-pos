
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileSelectMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileSelectMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FileSelectRs" type="{http://schemas.radixware.org/eas.xsd}FileSelectRs"/&gt;
 *         &lt;element name="FileSelectRq" type="{http://schemas.radixware.org/eas.xsd}FileSelectRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileSelectMess", propOrder = {
    "fileSelectRs",
    "fileSelectRq"
})
public class FileSelectMess {

    @XmlElement(name = "FileSelectRs")
    protected FileSelectRs fileSelectRs;
    @XmlElement(name = "FileSelectRq")
    protected FileSelectRq fileSelectRq;

    /**
     * Gets the value of the fileSelectRs property.
     * 
     * @return
     *     possible object is
     *     {@link FileSelectRs }
     *     
     */
    public FileSelectRs getFileSelectRs() {
        return fileSelectRs;
    }

    /**
     * Sets the value of the fileSelectRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSelectRs }
     *     
     */
    public void setFileSelectRs(FileSelectRs value) {
        this.fileSelectRs = value;
    }

    /**
     * Gets the value of the fileSelectRq property.
     * 
     * @return
     *     possible object is
     *     {@link FileSelectRq }
     *     
     */
    public FileSelectRq getFileSelectRq() {
        return fileSelectRq;
    }

    /**
     * Sets the value of the fileSelectRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSelectRq }
     *     
     */
    public void setFileSelectRq(FileSelectRq value) {
        this.fileSelectRq = value;
    }

}
