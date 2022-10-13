
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileDirReadMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileDirReadMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FileDirReadRs" type="{http://schemas.radixware.org/eas.xsd}FileDirReadRs"/&gt;
 *         &lt;element name="FileDirReadRq" type="{http://schemas.radixware.org/eas.xsd}FileDirReadRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDirReadMess", propOrder = {
    "fileDirReadRs",
    "fileDirReadRq"
})
public class FileDirReadMess {

    @XmlElement(name = "FileDirReadRs")
    protected FileDirReadRs fileDirReadRs;
    @XmlElement(name = "FileDirReadRq")
    protected FileDirReadRq fileDirReadRq;

    /**
     * Gets the value of the fileDirReadRs property.
     * 
     * @return
     *     possible object is
     *     {@link FileDirReadRs }
     *     
     */
    public FileDirReadRs getFileDirReadRs() {
        return fileDirReadRs;
    }

    /**
     * Sets the value of the fileDirReadRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDirReadRs }
     *     
     */
    public void setFileDirReadRs(FileDirReadRs value) {
        this.fileDirReadRs = value;
    }

    /**
     * Gets the value of the fileDirReadRq property.
     * 
     * @return
     *     possible object is
     *     {@link FileDirReadRq }
     *     
     */
    public FileDirReadRq getFileDirReadRq() {
        return fileDirReadRq;
    }

    /**
     * Sets the value of the fileDirReadRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDirReadRq }
     *     
     */
    public void setFileDirReadRq(FileDirReadRq value) {
        this.fileDirReadRq = value;
    }

}
