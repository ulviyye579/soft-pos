
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetObjectTitlesMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetObjectTitlesMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="GetObjectTitlesRs" type="{http://schemas.radixware.org/eas.xsd}GetObjectTitlesRs"/&gt;
 *         &lt;element name="GetObjectTitlesRq" type="{http://schemas.radixware.org/eas.xsd}GetObjectTitlesRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetObjectTitlesMess", propOrder = {
    "getObjectTitlesRs",
    "getObjectTitlesRq"
})
public class GetObjectTitlesMess {

    @XmlElement(name = "GetObjectTitlesRs")
    protected GetObjectTitlesRs getObjectTitlesRs;
    @XmlElement(name = "GetObjectTitlesRq")
    protected GetObjectTitlesRq getObjectTitlesRq;

    /**
     * Gets the value of the getObjectTitlesRs property.
     * 
     * @return
     *     possible object is
     *     {@link GetObjectTitlesRs }
     *     
     */
    public GetObjectTitlesRs getGetObjectTitlesRs() {
        return getObjectTitlesRs;
    }

    /**
     * Sets the value of the getObjectTitlesRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetObjectTitlesRs }
     *     
     */
    public void setGetObjectTitlesRs(GetObjectTitlesRs value) {
        this.getObjectTitlesRs = value;
    }

    /**
     * Gets the value of the getObjectTitlesRq property.
     * 
     * @return
     *     possible object is
     *     {@link GetObjectTitlesRq }
     *     
     */
    public GetObjectTitlesRq getGetObjectTitlesRq() {
        return getObjectTitlesRq;
    }

    /**
     * Sets the value of the getObjectTitlesRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetObjectTitlesRq }
     *     
     */
    public void setGetObjectTitlesRq(GetObjectTitlesRq value) {
        this.getObjectTitlesRq = value;
    }

}
