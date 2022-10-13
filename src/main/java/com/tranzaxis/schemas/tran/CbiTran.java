
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbiTran complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CbiTran"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CbiRequest" type="{http://schemas.tranzaxis.com/tran.xsd}CbiRequest"/&gt;
 *         &lt;element name="CbiResponse" type="{http://schemas.tranzaxis.com/tran.xsd}CbiResponse"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CbiTran", propOrder = {
    "cbiRequest",
    "cbiResponse"
})
public class CbiTran {

    @XmlElement(name = "CbiRequest")
    protected CbiRequest cbiRequest;
    @XmlElement(name = "CbiResponse")
    protected CbiResponse cbiResponse;

    /**
     * Gets the value of the cbiRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CbiRequest }
     *     
     */
    public CbiRequest getCbiRequest() {
        return cbiRequest;
    }

    /**
     * Sets the value of the cbiRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbiRequest }
     *     
     */
    public void setCbiRequest(CbiRequest value) {
        this.cbiRequest = value;
    }

    /**
     * Gets the value of the cbiResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CbiResponse }
     *     
     */
    public CbiResponse getCbiResponse() {
        return cbiResponse;
    }

    /**
     * Sets the value of the cbiResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbiResponse }
     *     
     */
    public void setCbiResponse(CbiResponse value) {
        this.cbiResponse = value;
    }

}
