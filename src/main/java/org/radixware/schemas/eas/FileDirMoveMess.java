
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileDirMoveMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileDirMoveMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FileDirMoveRs" type="{http://schemas.radixware.org/eas.xsd}FileDirMoveRs"/&gt;
 *         &lt;element name="FileDirMoveRq" type="{http://schemas.radixware.org/eas.xsd}FileDirMoveRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDirMoveMess", propOrder = {
    "fileDirMoveRs",
    "fileDirMoveRq"
})
public class FileDirMoveMess {

    @XmlElement(name = "FileDirMoveRs")
    protected FileDirMoveRs fileDirMoveRs;
    @XmlElement(name = "FileDirMoveRq")
    protected FileDirMoveRq fileDirMoveRq;

    /**
     * Gets the value of the fileDirMoveRs property.
     * 
     * @return
     *     possible object is
     *     {@link FileDirMoveRs }
     *     
     */
    public FileDirMoveRs getFileDirMoveRs() {
        return fileDirMoveRs;
    }

    /**
     * Sets the value of the fileDirMoveRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDirMoveRs }
     *     
     */
    public void setFileDirMoveRs(FileDirMoveRs value) {
        this.fileDirMoveRs = value;
    }

    /**
     * Gets the value of the fileDirMoveRq property.
     * 
     * @return
     *     possible object is
     *     {@link FileDirMoveRq }
     *     
     */
    public FileDirMoveRq getFileDirMoveRq() {
        return fileDirMoveRq;
    }

    /**
     * Sets the value of the fileDirMoveRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDirMoveRq }
     *     
     */
    public void setFileDirMoveRq(FileDirMoveRq value) {
        this.fileDirMoveRq = value;
    }

}
