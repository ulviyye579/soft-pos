
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecondAuthenticationFactorReceiver complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondAuthenticationFactorReceiver"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaskedDestination" type="{http://schemas.radixware.org/types.xsd}Str"/&gt;
 *         &lt;element name="ChannelType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondAuthenticationFactorReceiver", propOrder = {
    "maskedDestination",
    "channelType"
})
public class SecondAuthenticationFactorReceiver {

    @XmlElement(name = "MaskedDestination", required = true)
    protected String maskedDestination;
    @XmlElement(name = "ChannelType", required = true)
    protected String channelType;

    /**
     * Gets the value of the maskedDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedDestination() {
        return maskedDestination;
    }

    /**
     * Sets the value of the maskedDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedDestination(String value) {
        this.maskedDestination = value;
    }

    /**
     * Gets the value of the channelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelType(String value) {
        this.channelType = value;
    }

}
