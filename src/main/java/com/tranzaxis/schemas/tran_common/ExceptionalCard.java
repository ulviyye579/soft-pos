
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.exceptionalcard.SpecificInfo;


/**
 * <p>Java class for ExceptionalCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExceptionalCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Network" type="{http://schemas.tranzaxis.com/exceptionalCard.xsd}SpecificInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Status"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NetworkStatus" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="LocalUsage" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="Pickup" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *       &lt;attribute name="PurgeDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="SuspectedContext" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionalCard", propOrder = {
    "network"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.tran.Request.Specific.ExceptionalCard.class
})
public class ExceptionalCard {

    @XmlElement(name = "Network")
    protected SpecificInfo network;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "NetworkStatus")
    protected String networkStatus;
    @XmlAttribute(name = "LocalUsage")
    protected Boolean localUsage;
    @XmlAttribute(name = "Pickup")
    protected Boolean pickup;
    @XmlAttribute(name = "PurgeDate")
    protected XMLGregorianCalendar purgeDate;
    @XmlAttribute(name = "SuspectedContext")
    protected String suspectedContext;

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificInfo }
     *     
     */
    public SpecificInfo getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificInfo }
     *     
     */
    public void setNetwork(SpecificInfo value) {
        this.network = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the networkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkStatus() {
        return networkStatus;
    }

    /**
     * Sets the value of the networkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkStatus(String value) {
        this.networkStatus = value;
    }

    /**
     * Gets the value of the localUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalUsage() {
        return localUsage;
    }

    /**
     * Sets the value of the localUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalUsage(Boolean value) {
        this.localUsage = value;
    }

    /**
     * Gets the value of the pickup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPickup() {
        if (pickup == null) {
            return false;
        } else {
            return pickup;
        }
    }

    /**
     * Sets the value of the pickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickup(Boolean value) {
        this.pickup = value;
    }

    /**
     * Gets the value of the purgeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurgeDate() {
        return purgeDate;
    }

    /**
     * Sets the value of the purgeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurgeDate(XMLGregorianCalendar value) {
        this.purgeDate = value;
    }

    /**
     * Gets the value of the suspectedContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspectedContext() {
        return suspectedContext;
    }

    /**
     * Sets the value of the suspectedContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspectedContext(String value) {
        this.suspectedContext = value;
    }

}
