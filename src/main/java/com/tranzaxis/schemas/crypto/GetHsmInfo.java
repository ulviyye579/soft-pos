
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetHsmInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHsmInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="GetHsmInfoRq" type="{http://schemas.tranzaxis.com/crypto.xsd}GetHsmInfoRq"/&gt;
 *         &lt;element name="GetHsmInfoRs" type="{http://schemas.tranzaxis.com/crypto.xsd}GetHsmInfoRs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHsmInfo", propOrder = {
    "getHsmInfoRq",
    "getHsmInfoRs"
})
public class GetHsmInfo {

    @XmlElement(name = "GetHsmInfoRq")
    protected GetHsmInfoRq getHsmInfoRq;
    @XmlElement(name = "GetHsmInfoRs")
    protected GetHsmInfoRs getHsmInfoRs;

    /**
     * Gets the value of the getHsmInfoRq property.
     * 
     * @return
     *     possible object is
     *     {@link GetHsmInfoRq }
     *     
     */
    public GetHsmInfoRq getGetHsmInfoRq() {
        return getHsmInfoRq;
    }

    /**
     * Sets the value of the getHsmInfoRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetHsmInfoRq }
     *     
     */
    public void setGetHsmInfoRq(GetHsmInfoRq value) {
        this.getHsmInfoRq = value;
    }

    /**
     * Gets the value of the getHsmInfoRs property.
     * 
     * @return
     *     possible object is
     *     {@link GetHsmInfoRs }
     *     
     */
    public GetHsmInfoRs getGetHsmInfoRs() {
        return getHsmInfoRs;
    }

    /**
     * Sets the value of the getHsmInfoRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetHsmInfoRs }
     *     
     */
    public void setGetHsmInfoRs(GetHsmInfoRs value) {
        this.getHsmInfoRs = value;
    }

}
