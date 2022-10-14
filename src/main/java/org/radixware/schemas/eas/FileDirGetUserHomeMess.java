
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileDirGetUserHomeMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileDirGetUserHomeMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FileDirGetUserHomeRs" type="{http://schemas.radixware.org/eas.xsd}FileDirGetUserHomeRs"/&gt;
 *         &lt;element name="FileDirGetUserHomeRq" type="{http://schemas.radixware.org/eas.xsd}FileDirGetUserHomeRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDirGetUserHomeMess", propOrder = {
    "fileDirGetUserHomeRs",
    "fileDirGetUserHomeRq"
})
public class FileDirGetUserHomeMess {

    @XmlElement(name = "FileDirGetUserHomeRs")
    protected FileDirGetUserHomeRs fileDirGetUserHomeRs;
    @XmlElement(name = "FileDirGetUserHomeRq")
    protected FileDirGetUserHomeRq fileDirGetUserHomeRq;

    /**
     * Gets the value of the fileDirGetUserHomeRs property.
     * 
     * @return
     *     possible object is
     *     {@link FileDirGetUserHomeRs }
     *     
     */
    public FileDirGetUserHomeRs getFileDirGetUserHomeRs() {
        return fileDirGetUserHomeRs;
    }

    /**
     * Sets the value of the fileDirGetUserHomeRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDirGetUserHomeRs }
     *     
     */
    public void setFileDirGetUserHomeRs(FileDirGetUserHomeRs value) {
        this.fileDirGetUserHomeRs = value;
    }

    /**
     * Gets the value of the fileDirGetUserHomeRq property.
     * 
     * @return
     *     possible object is
     *     {@link FileDirGetUserHomeRq }
     *     
     */
    public FileDirGetUserHomeRq getFileDirGetUserHomeRq() {
        return fileDirGetUserHomeRq;
    }

    /**
     * Sets the value of the fileDirGetUserHomeRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDirGetUserHomeRq }
     *     
     */
    public void setFileDirGetUserHomeRq(FileDirGetUserHomeRq value) {
        this.fileDirGetUserHomeRq = value;
    }

}
