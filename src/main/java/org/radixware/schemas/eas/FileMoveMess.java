
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileMoveMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileMoveMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FileMoveRs" type="{http://schemas.radixware.org/eas.xsd}FileMoveRs"/&gt;
 *         &lt;element name="FileMoveRq" type="{http://schemas.radixware.org/eas.xsd}FileMoveRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileMoveMess", propOrder = {
    "fileMoveRs",
    "fileMoveRq"
})
public class FileMoveMess {

    @XmlElement(name = "FileMoveRs")
    protected FileMoveRs fileMoveRs;
    @XmlElement(name = "FileMoveRq")
    protected FileMoveRq fileMoveRq;

    /**
     * Gets the value of the fileMoveRs property.
     * 
     * @return
     *     possible object is
     *     {@link FileMoveRs }
     *     
     */
    public FileMoveRs getFileMoveRs() {
        return fileMoveRs;
    }

    /**
     * Sets the value of the fileMoveRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileMoveRs }
     *     
     */
    public void setFileMoveRs(FileMoveRs value) {
        this.fileMoveRs = value;
    }

    /**
     * Gets the value of the fileMoveRq property.
     * 
     * @return
     *     possible object is
     *     {@link FileMoveRq }
     *     
     */
    public FileMoveRq getFileMoveRq() {
        return fileMoveRq;
    }

    /**
     * Sets the value of the fileMoveRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileMoveRq }
     *     
     */
    public void setFileMoveRq(FileMoveRq value) {
        this.fileMoveRq = value;
    }

}
