
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileDirCreateMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileDirCreateMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FileDirCreateRs" type="{http://schemas.radixware.org/eas.xsd}FileDirCreateRs"/&gt;
 *         &lt;element name="FileDirCreateRq" type="{http://schemas.radixware.org/eas.xsd}FileDirCreateRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDirCreateMess", propOrder = {
    "fileDirCreateRs",
    "fileDirCreateRq"
})
public class FileDirCreateMess {

    @XmlElement(name = "FileDirCreateRs")
    protected FileDirCreateRs fileDirCreateRs;
    @XmlElement(name = "FileDirCreateRq")
    protected FileDirCreateRq fileDirCreateRq;

    /**
     * Gets the value of the fileDirCreateRs property.
     * 
     * @return
     *     possible object is
     *     {@link FileDirCreateRs }
     *     
     */
    public FileDirCreateRs getFileDirCreateRs() {
        return fileDirCreateRs;
    }

    /**
     * Sets the value of the fileDirCreateRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDirCreateRs }
     *     
     */
    public void setFileDirCreateRs(FileDirCreateRs value) {
        this.fileDirCreateRs = value;
    }

    /**
     * Gets the value of the fileDirCreateRq property.
     * 
     * @return
     *     possible object is
     *     {@link FileDirCreateRq }
     *     
     */
    public FileDirCreateRq getFileDirCreateRq() {
        return fileDirCreateRq;
    }

    /**
     * Sets the value of the fileDirCreateRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDirCreateRq }
     *     
     */
    public void setFileDirCreateRq(FileDirCreateRq value) {
        this.fileDirCreateRq = value;
    }

}
