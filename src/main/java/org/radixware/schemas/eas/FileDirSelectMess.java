
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileDirSelectMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileDirSelectMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FileDirSelectRs" type="{http://schemas.radixware.org/eas.xsd}FileDirSelectRs"/&gt;
 *         &lt;element name="FileDirSelectRq" type="{http://schemas.radixware.org/eas.xsd}FileDirSelectRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDirSelectMess", propOrder = {
    "fileDirSelectRs",
    "fileDirSelectRq"
})
public class FileDirSelectMess {

    @XmlElement(name = "FileDirSelectRs")
    protected FileDirSelectRs fileDirSelectRs;
    @XmlElement(name = "FileDirSelectRq")
    protected FileDirSelectRq fileDirSelectRq;

    /**
     * Gets the value of the fileDirSelectRs property.
     * 
     * @return
     *     possible object is
     *     {@link FileDirSelectRs }
     *     
     */
    public FileDirSelectRs getFileDirSelectRs() {
        return fileDirSelectRs;
    }

    /**
     * Sets the value of the fileDirSelectRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDirSelectRs }
     *     
     */
    public void setFileDirSelectRs(FileDirSelectRs value) {
        this.fileDirSelectRs = value;
    }

    /**
     * Gets the value of the fileDirSelectRq property.
     * 
     * @return
     *     possible object is
     *     {@link FileDirSelectRq }
     *     
     */
    public FileDirSelectRq getFileDirSelectRq() {
        return fileDirSelectRq;
    }

    /**
     * Sets the value of the fileDirSelectRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDirSelectRq }
     *     
     */
    public void setFileDirSelectRq(FileDirSelectRq value) {
        this.fileDirSelectRq = value;
    }

}
