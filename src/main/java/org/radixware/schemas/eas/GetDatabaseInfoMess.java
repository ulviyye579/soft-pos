
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDatabaseInfoMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDatabaseInfoMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="GetDatabaseInfoRs" type="{http://schemas.radixware.org/eas.xsd}GetDatabaseInfoRs"/&gt;
 *         &lt;element name="GetDatabaseInfoRq" type="{http://schemas.radixware.org/eas.xsd}GetDatabaseInfoRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDatabaseInfoMess", propOrder = {
    "getDatabaseInfoRs",
    "getDatabaseInfoRq"
})
public class GetDatabaseInfoMess {

    @XmlElement(name = "GetDatabaseInfoRs")
    protected GetDatabaseInfoRs getDatabaseInfoRs;
    @XmlElement(name = "GetDatabaseInfoRq")
    protected GetDatabaseInfoRq getDatabaseInfoRq;

    /**
     * Gets the value of the getDatabaseInfoRs property.
     * 
     * @return
     *     possible object is
     *     {@link GetDatabaseInfoRs }
     *     
     */
    public GetDatabaseInfoRs getGetDatabaseInfoRs() {
        return getDatabaseInfoRs;
    }

    /**
     * Sets the value of the getDatabaseInfoRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDatabaseInfoRs }
     *     
     */
    public void setGetDatabaseInfoRs(GetDatabaseInfoRs value) {
        this.getDatabaseInfoRs = value;
    }

    /**
     * Gets the value of the getDatabaseInfoRq property.
     * 
     * @return
     *     possible object is
     *     {@link GetDatabaseInfoRq }
     *     
     */
    public GetDatabaseInfoRq getGetDatabaseInfoRq() {
        return getDatabaseInfoRq;
    }

    /**
     * Sets the value of the getDatabaseInfoRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDatabaseInfoRq }
     *     
     */
    public void setGetDatabaseInfoRq(GetDatabaseInfoRq value) {
        this.getDatabaseInfoRq = value;
    }

}
