
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LoginRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SignedChallenge" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/&gt;
 *         &lt;element name="SessionsToTerminate"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EncryptedSessionId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BrowserVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginRq", propOrder = {
    "signedChallenge",
    "sessionsToTerminate",
    "browserVersion"
})
public class LoginRq
    extends Request
{

    @XmlElement(name = "SignedChallenge", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] signedChallenge;
    @XmlElement(name = "SessionsToTerminate", required = true)
    protected LoginRq.SessionsToTerminate sessionsToTerminate;
    @XmlElement(name = "BrowserVersion")
    protected String browserVersion;

    /**
     * Gets the value of the signedChallenge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSignedChallenge() {
        return signedChallenge;
    }

    /**
     * Sets the value of the signedChallenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedChallenge(byte[] value) {
        this.signedChallenge = value;
    }

    /**
     * Gets the value of the sessionsToTerminate property.
     * 
     * @return
     *     possible object is
     *     {@link LoginRq.SessionsToTerminate }
     *     
     */
    public LoginRq.SessionsToTerminate getSessionsToTerminate() {
        return sessionsToTerminate;
    }

    /**
     * Sets the value of the sessionsToTerminate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginRq.SessionsToTerminate }
     *     
     */
    public void setSessionsToTerminate(LoginRq.SessionsToTerminate value) {
        this.sessionsToTerminate = value;
    }

    /**
     * Gets the value of the browserVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowserVersion() {
        return browserVersion;
    }

    /**
     * Sets the value of the browserVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowserVersion(String value) {
        this.browserVersion = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="EncryptedSessionId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "encryptedSessionId"
    })
    public static class SessionsToTerminate {

        @XmlElement(name = "EncryptedSessionId")
        protected List<String> encryptedSessionId;

        /**
         * Gets the value of the encryptedSessionId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the encryptedSessionId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEncryptedSessionId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEncryptedSessionId() {
            if (encryptedSessionId == null) {
                encryptedSessionId = new ArrayList<String>();
            }
            return this.encryptedSessionId;
        }

    }

}
