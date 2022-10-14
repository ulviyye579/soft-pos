
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomAttrsDynamicDataMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomAttrsDynamicDataMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="GetCustomAttrsDynamicDataRs" type="{http://schemas.radixware.org/eas.xsd}GetCustomAttrsDynamicDataRs"/&gt;
 *         &lt;element name="GetCustomAttrsDynamicDataRq" type="{http://schemas.radixware.org/eas.xsd}GetCustomAttrsDynamicDataRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomAttrsDynamicDataMess", propOrder = {
    "getCustomAttrsDynamicDataRs",
    "getCustomAttrsDynamicDataRq"
})
public class GetCustomAttrsDynamicDataMess {

    @XmlElement(name = "GetCustomAttrsDynamicDataRs")
    protected GetCustomAttrsDynamicDataRs getCustomAttrsDynamicDataRs;
    @XmlElement(name = "GetCustomAttrsDynamicDataRq")
    protected GetCustomAttrsDynamicDataRq getCustomAttrsDynamicDataRq;

    /**
     * Gets the value of the getCustomAttrsDynamicDataRs property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomAttrsDynamicDataRs }
     *     
     */
    public GetCustomAttrsDynamicDataRs getGetCustomAttrsDynamicDataRs() {
        return getCustomAttrsDynamicDataRs;
    }

    /**
     * Sets the value of the getCustomAttrsDynamicDataRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomAttrsDynamicDataRs }
     *     
     */
    public void setGetCustomAttrsDynamicDataRs(GetCustomAttrsDynamicDataRs value) {
        this.getCustomAttrsDynamicDataRs = value;
    }

    /**
     * Gets the value of the getCustomAttrsDynamicDataRq property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomAttrsDynamicDataRq }
     *     
     */
    public GetCustomAttrsDynamicDataRq getGetCustomAttrsDynamicDataRq() {
        return getCustomAttrsDynamicDataRq;
    }

    /**
     * Sets the value of the getCustomAttrsDynamicDataRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomAttrsDynamicDataRq }
     *     
     */
    public void setGetCustomAttrsDynamicDataRq(GetCustomAttrsDynamicDataRq value) {
        this.getCustomAttrsDynamicDataRq = value;
    }

}
