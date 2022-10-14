
package com.tranzaxis.schemas.tran_common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenUpdateSpecific complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenUpdateSpecific"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnableContactless" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="DisableContactlessWithoutVerification" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="ContactlessAmtLimit" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenUpdateSpecific", propOrder = {
    "enableContactless",
    "disableContactlessWithoutVerification",
    "contactlessAmtLimit"
})
public class TokenUpdateSpecific {

    @XmlElement(name = "EnableContactless")
    protected Boolean enableContactless;
    @XmlElement(name = "DisableContactlessWithoutVerification")
    protected Boolean disableContactlessWithoutVerification;
    @XmlElement(name = "ContactlessAmtLimit")
    protected BigDecimal contactlessAmtLimit;

    /**
     * Gets the value of the enableContactless property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableContactless() {
        return enableContactless;
    }

    /**
     * Sets the value of the enableContactless property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableContactless(Boolean value) {
        this.enableContactless = value;
    }

    /**
     * Gets the value of the disableContactlessWithoutVerification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableContactlessWithoutVerification() {
        return disableContactlessWithoutVerification;
    }

    /**
     * Sets the value of the disableContactlessWithoutVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableContactlessWithoutVerification(Boolean value) {
        this.disableContactlessWithoutVerification = value;
    }

    /**
     * Gets the value of the contactlessAmtLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContactlessAmtLimit() {
        return contactlessAmtLimit;
    }

    /**
     * Sets the value of the contactlessAmtLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContactlessAmtLimit(BigDecimal value) {
        this.contactlessAmtLimit = value;
    }

}
