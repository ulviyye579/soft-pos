
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileDirDeleteMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileDirDeleteMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FileDirDeleteRs" type="{http://schemas.radixware.org/eas.xsd}FileDirDeleteRs"/&gt;
 *         &lt;element name="FileDirDeleteRq" type="{http://schemas.radixware.org/eas.xsd}FileDirDeleteRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDirDeleteMess", propOrder = {
    "fileDirDeleteRs",
    "fileDirDeleteRq"
})
public class FileDirDeleteMess {

    @XmlElement(name = "FileDirDeleteRs")
    protected FileDirDeleteRs fileDirDeleteRs;
    @XmlElement(name = "FileDirDeleteRq")
    protected FileDirDeleteRq fileDirDeleteRq;

    /**
     * Gets the value of the fileDirDeleteRs property.
     * 
     * @return
     *     possible object is
     *     {@link FileDirDeleteRs }
     *     
     */
    public FileDirDeleteRs getFileDirDeleteRs() {
        return fileDirDeleteRs;
    }

    /**
     * Sets the value of the fileDirDeleteRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDirDeleteRs }
     *     
     */
    public void setFileDirDeleteRs(FileDirDeleteRs value) {
        this.fileDirDeleteRs = value;
    }

    /**
     * Gets the value of the fileDirDeleteRq property.
     * 
     * @return
     *     possible object is
     *     {@link FileDirDeleteRq }
     *     
     */
    public FileDirDeleteRq getFileDirDeleteRq() {
        return fileDirDeleteRq;
    }

    /**
     * Sets the value of the fileDirDeleteRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDirDeleteRq }
     *     
     */
    public void setFileDirDeleteRq(FileDirDeleteRq value) {
        this.fileDirDeleteRq = value;
    }

}
