
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileCopyMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileCopyMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FileCopyRs" type="{http://schemas.radixware.org/eas.xsd}FileCopyRs"/&gt;
 *         &lt;element name="FileCopyRq" type="{http://schemas.radixware.org/eas.xsd}FileCopyRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileCopyMess", propOrder = {
    "fileCopyRs",
    "fileCopyRq"
})
public class FileCopyMess {

    @XmlElement(name = "FileCopyRs")
    protected FileCopyRs fileCopyRs;
    @XmlElement(name = "FileCopyRq")
    protected FileCopyRq fileCopyRq;

    /**
     * Gets the value of the fileCopyRs property.
     * 
     * @return
     *     possible object is
     *     {@link FileCopyRs }
     *     
     */
    public FileCopyRs getFileCopyRs() {
        return fileCopyRs;
    }

    /**
     * Sets the value of the fileCopyRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileCopyRs }
     *     
     */
    public void setFileCopyRs(FileCopyRs value) {
        this.fileCopyRs = value;
    }

    /**
     * Gets the value of the fileCopyRq property.
     * 
     * @return
     *     possible object is
     *     {@link FileCopyRq }
     *     
     */
    public FileCopyRq getFileCopyRq() {
        return fileCopyRq;
    }

    /**
     * Sets the value of the fileCopyRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileCopyRq }
     *     
     */
    public void setFileCopyRq(FileCopyRq value) {
        this.fileCopyRq = value;
    }

}
