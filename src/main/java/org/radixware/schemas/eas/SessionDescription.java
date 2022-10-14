
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SessionDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Environment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="EncryptedId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CreationTime" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="IdleSeconds" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionDescription", propOrder = {
    "stationName",
    "environment"
})
public class SessionDescription {

    @XmlElement(name = "StationName", required = true)
    protected String stationName;
    @XmlElement(name = "Environment")
    protected String environment;
    @XmlAttribute(name = "EncryptedId", required = true)
    protected String encryptedId;
    @XmlAttribute(name = "CreationTime", required = true)
    protected XMLGregorianCalendar creationTime;
    @XmlAttribute(name = "IdleSeconds", required = true)
    protected int idleSeconds;

    /**
     * Gets the value of the stationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * Sets the value of the stationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationName(String value) {
        this.stationName = value;
    }

    /**
     * Gets the value of the environment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Sets the value of the environment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironment(String value) {
        this.environment = value;
    }

    /**
     * Gets the value of the encryptedId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedId() {
        return encryptedId;
    }

    /**
     * Sets the value of the encryptedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedId(String value) {
        this.encryptedId = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the idleSeconds property.
     * 
     */
    public int getIdleSeconds() {
        return idleSeconds;
    }

    /**
     * Sets the value of the idleSeconds property.
     * 
     */
    public void setIdleSeconds(int value) {
        this.idleSeconds = value;
    }

}
