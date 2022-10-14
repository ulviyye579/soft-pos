
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ReadRs" type="{http://schemas.radixware.org/eas.xsd}ReadRs"/&gt;
 *         &lt;element name="ReadRq" type="{http://schemas.radixware.org/eas.xsd}ReadRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadMess", propOrder = {
    "readRs",
    "readRq"
})
public class ReadMess {

    @XmlElement(name = "ReadRs")
    protected ReadRs readRs;
    @XmlElement(name = "ReadRq")
    protected ReadRq readRq;

    /**
     * Gets the value of the readRs property.
     * 
     * @return
     *     possible object is
     *     {@link ReadRs }
     *     
     */
    public ReadRs getReadRs() {
        return readRs;
    }

    /**
     * Sets the value of the readRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadRs }
     *     
     */
    public void setReadRs(ReadRs value) {
        this.readRs = value;
    }

    /**
     * Gets the value of the readRq property.
     * 
     * @return
     *     possible object is
     *     {@link ReadRq }
     *     
     */
    public ReadRq getReadRq() {
        return readRq;
    }

    /**
     * Sets the value of the readRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadRq }
     *     
     */
    public void setReadRq(ReadRq value) {
        this.readRq = value;
    }

}
