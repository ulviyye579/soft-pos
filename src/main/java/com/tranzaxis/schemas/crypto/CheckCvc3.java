
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckCvc3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckCvc3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CheckCvc3Rq" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckCvc3Rq"/&gt;
 *         &lt;element name="CheckCvc3Rs" type="{http://schemas.tranzaxis.com/crypto.xsd}CheckCvc3Rs"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckCvc3", propOrder = {
    "checkCvc3Rq",
    "checkCvc3Rs"
})
public class CheckCvc3 {

    @XmlElement(name = "CheckCvc3Rq")
    protected CheckCvc3Rq checkCvc3Rq;
    @XmlElement(name = "CheckCvc3Rs")
    protected CheckCvc3Rs checkCvc3Rs;

    /**
     * Gets the value of the checkCvc3Rq property.
     * 
     * @return
     *     possible object is
     *     {@link CheckCvc3Rq }
     *     
     */
    public CheckCvc3Rq getCheckCvc3Rq() {
        return checkCvc3Rq;
    }

    /**
     * Sets the value of the checkCvc3Rq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckCvc3Rq }
     *     
     */
    public void setCheckCvc3Rq(CheckCvc3Rq value) {
        this.checkCvc3Rq = value;
    }

    /**
     * Gets the value of the checkCvc3Rs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckCvc3Rs }
     *     
     */
    public CheckCvc3Rs getCheckCvc3Rs() {
        return checkCvc3Rs;
    }

    /**
     * Sets the value of the checkCvc3Rs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckCvc3Rs }
     *     
     */
    public void setCheckCvc3Rs(CheckCvc3Rs value) {
        this.checkCvc3Rs = value;
    }

}
