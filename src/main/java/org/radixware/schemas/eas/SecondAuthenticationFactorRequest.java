
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecondAuthenticationFactorRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondAuthenticationFactorRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Receiver" type="{http://schemas.radixware.org/eas.xsd}SecondAuthenticationFactorReceiver" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TemporarySessionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="expirationPeriodSeconds" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="resendPauseSeconds" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondAuthenticationFactorRequest", propOrder = {
    "receiver",
    "temporarySessionId"
})
public class SecondAuthenticationFactorRequest {

    @XmlElement(name = "Receiver", required = true)
    protected List<SecondAuthenticationFactorReceiver> receiver;
    @XmlElement(name = "TemporarySessionId")
    protected Long temporarySessionId;
    @XmlAttribute(name = "expirationPeriodSeconds", required = true)
    protected int expirationPeriodSeconds;
    @XmlAttribute(name = "resendPauseSeconds", required = true)
    protected int resendPauseSeconds;

    /**
     * Gets the value of the receiver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecondAuthenticationFactorReceiver }
     * 
     * 
     */
    public List<SecondAuthenticationFactorReceiver> getReceiver() {
        if (receiver == null) {
            receiver = new ArrayList<SecondAuthenticationFactorReceiver>();
        }
        return this.receiver;
    }

    /**
     * Gets the value of the temporarySessionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTemporarySessionId() {
        return temporarySessionId;
    }

    /**
     * Sets the value of the temporarySessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTemporarySessionId(Long value) {
        this.temporarySessionId = value;
    }

    /**
     * Gets the value of the expirationPeriodSeconds property.
     * 
     */
    public int getExpirationPeriodSeconds() {
        return expirationPeriodSeconds;
    }

    /**
     * Sets the value of the expirationPeriodSeconds property.
     * 
     */
    public void setExpirationPeriodSeconds(int value) {
        this.expirationPeriodSeconds = value;
    }

    /**
     * Gets the value of the resendPauseSeconds property.
     * 
     */
    public int getResendPauseSeconds() {
        return resendPauseSeconds;
    }

    /**
     * Sets the value of the resendPauseSeconds property.
     * 
     */
    public void setResendPauseSeconds(int value) {
        this.resendPauseSeconds = value;
    }

}
