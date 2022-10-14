
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTlsPublicKeysMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTlsPublicKeysMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="GetTlsPublicKeysRs" type="{http://schemas.radixware.org/eas.xsd}GetTlsPublicKeysRs"/&gt;
 *         &lt;element name="GetTlsPublicKeysRq" type="{http://schemas.radixware.org/eas.xsd}GetTlsPublicKeysRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTlsPublicKeysMess", propOrder = {
    "getTlsPublicKeysRs",
    "getTlsPublicKeysRq"
})
public class GetTlsPublicKeysMess {

    @XmlElement(name = "GetTlsPublicKeysRs")
    protected GetTlsPublicKeysRs getTlsPublicKeysRs;
    @XmlElement(name = "GetTlsPublicKeysRq")
    protected GetTlsPublicKeysRq getTlsPublicKeysRq;

    /**
     * Gets the value of the getTlsPublicKeysRs property.
     * 
     * @return
     *     possible object is
     *     {@link GetTlsPublicKeysRs }
     *     
     */
    public GetTlsPublicKeysRs getGetTlsPublicKeysRs() {
        return getTlsPublicKeysRs;
    }

    /**
     * Sets the value of the getTlsPublicKeysRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTlsPublicKeysRs }
     *     
     */
    public void setGetTlsPublicKeysRs(GetTlsPublicKeysRs value) {
        this.getTlsPublicKeysRs = value;
    }

    /**
     * Gets the value of the getTlsPublicKeysRq property.
     * 
     * @return
     *     possible object is
     *     {@link GetTlsPublicKeysRq }
     *     
     */
    public GetTlsPublicKeysRq getGetTlsPublicKeysRq() {
        return getTlsPublicKeysRq;
    }

    /**
     * Sets the value of the getTlsPublicKeysRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTlsPublicKeysRq }
     *     
     */
    public void setGetTlsPublicKeysRq(GetTlsPublicKeysRq value) {
        this.getTlsPublicKeysRq = value;
    }

}
