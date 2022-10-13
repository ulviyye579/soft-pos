
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUserDownloadsDirMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserDownloadsDirMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="GetUserDownloadsDirRs" type="{http://schemas.radixware.org/eas.xsd}GetUserDownloadsDirRs"/&gt;
 *         &lt;element name="GetUserDownloadsDirRq" type="{http://schemas.radixware.org/eas.xsd}GetUserDownloadsDirRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserDownloadsDirMess", propOrder = {
    "getUserDownloadsDirRs",
    "getUserDownloadsDirRq"
})
public class GetUserDownloadsDirMess {

    @XmlElement(name = "GetUserDownloadsDirRs")
    protected GetUserDownloadsDirRs getUserDownloadsDirRs;
    @XmlElement(name = "GetUserDownloadsDirRq")
    protected GetUserDownloadsDirRq getUserDownloadsDirRq;

    /**
     * Gets the value of the getUserDownloadsDirRs property.
     * 
     * @return
     *     possible object is
     *     {@link GetUserDownloadsDirRs }
     *     
     */
    public GetUserDownloadsDirRs getGetUserDownloadsDirRs() {
        return getUserDownloadsDirRs;
    }

    /**
     * Sets the value of the getUserDownloadsDirRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserDownloadsDirRs }
     *     
     */
    public void setGetUserDownloadsDirRs(GetUserDownloadsDirRs value) {
        this.getUserDownloadsDirRs = value;
    }

    /**
     * Gets the value of the getUserDownloadsDirRq property.
     * 
     * @return
     *     possible object is
     *     {@link GetUserDownloadsDirRq }
     *     
     */
    public GetUserDownloadsDirRq getGetUserDownloadsDirRq() {
        return getUserDownloadsDirRq;
    }

    /**
     * Sets the value of the getUserDownloadsDirRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserDownloadsDirRq }
     *     
     */
    public void setGetUserDownloadsDirRq(GetUserDownloadsDirRq value) {
        this.getUserDownloadsDirRq = value;
    }

}
