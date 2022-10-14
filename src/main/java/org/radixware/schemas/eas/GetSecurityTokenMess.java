
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSecurityTokenMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSecurityTokenMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="GetSecurityTokenRs" type="{http://schemas.radixware.org/eas.xsd}GetSecurityTokenRs"/&gt;
 *         &lt;element name="GetSecurityTokenRq" type="{http://schemas.radixware.org/eas.xsd}GetSecurityTokenRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSecurityTokenMess", propOrder = {
    "getSecurityTokenRs",
    "getSecurityTokenRq"
})
public class GetSecurityTokenMess {

    @XmlElement(name = "GetSecurityTokenRs")
    protected GetSecurityTokenRs getSecurityTokenRs;
    @XmlElement(name = "GetSecurityTokenRq")
    protected GetSecurityTokenRq getSecurityTokenRq;

    /**
     * Gets the value of the getSecurityTokenRs property.
     * 
     * @return
     *     possible object is
     *     {@link GetSecurityTokenRs }
     *     
     */
    public GetSecurityTokenRs getGetSecurityTokenRs() {
        return getSecurityTokenRs;
    }

    /**
     * Sets the value of the getSecurityTokenRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSecurityTokenRs }
     *     
     */
    public void setGetSecurityTokenRs(GetSecurityTokenRs value) {
        this.getSecurityTokenRs = value;
    }

    /**
     * Gets the value of the getSecurityTokenRq property.
     * 
     * @return
     *     possible object is
     *     {@link GetSecurityTokenRq }
     *     
     */
    public GetSecurityTokenRq getGetSecurityTokenRq() {
        return getSecurityTokenRq;
    }

    /**
     * Sets the value of the getSecurityTokenRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSecurityTokenRq }
     *     
     */
    public void setGetSecurityTokenRq(GetSecurityTokenRq value) {
        this.getSecurityTokenRq = value;
    }

}
