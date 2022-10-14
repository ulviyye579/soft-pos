
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="AuthType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PwdToken"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary"&gt;
 *               &lt;minLength value="16"/&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Challenge" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary"&gt;
 *               &lt;minLength value="16"/&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Transaction" type="{http://schemas.radixware.org/eas.xsd}TransactionEnum" minOccurs="0"/&gt;
 *         &lt;element name="SetSavepoint" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="RestoreSavepointId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TraceProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefinitionsVer" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;long"&gt;
 *                 &lt;attribute name="Forced" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LocalSettings" type="{http://schemas.radixware.org/eas.xsd}LocalSettings" minOccurs="0"/&gt;
 *         &lt;element name="SessionVariables" type="{http://schemas.radixware.org/eas.xsd}SessionVariables" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {
    "sessionId",
    "authType",
    "pwdToken",
    "challenge",
    "transaction",
    "setSavepoint",
    "restoreSavepointId",
    "traceProfile",
    "definitionsVer",
    "localSettings",
    "sessionVariables"
})
@XmlSeeAlso({
    LoginRq.class,
    ChangePasswordRq.class,
    GetPasswordRequirementsRq.class,
    CloseSessionRq.class,
    ListVisibleExplorerItemsRq.class,
    ContextlessCommandRq.class,
    ContextRequest.class,
    GetDatabaseInfoRq.class,
    GetCustomAttrsDynamicDataRq.class
})
public abstract class Request {

    @XmlElement(name = "SessionId")
    protected long sessionId;
    @XmlElement(name = "AuthType", required = true)
    protected String authType;
    @XmlElement(name = "PwdToken", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] pwdToken;
    @XmlElement(name = "Challenge", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] challenge;
    @XmlElement(name = "Transaction", defaultValue = "No")
    @XmlSchemaType(name = "string")
    protected TransactionEnum transaction;
    @XmlElement(name = "SetSavepoint")
    protected java.lang.Object setSavepoint;
    @XmlElement(name = "RestoreSavepointId")
    protected String restoreSavepointId;
    @XmlElement(name = "TraceProfile", defaultValue = "None")
    protected String traceProfile;
    @XmlElement(name = "DefinitionsVer")
    protected Request.DefinitionsVer definitionsVer;
    @XmlElement(name = "LocalSettings")
    protected LocalSettings localSettings;
    @XmlElement(name = "SessionVariables")
    protected SessionVariables sessionVariables;

    /**
     * Gets the value of the sessionId property.
     * 
     */
    public long getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     */
    public void setSessionId(long value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the authType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * Sets the value of the authType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthType(String value) {
        this.authType = value;
    }

    /**
     * Gets the value of the pwdToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getPwdToken() {
        return pwdToken;
    }

    /**
     * Sets the value of the pwdToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwdToken(byte[] value) {
        this.pwdToken = value;
    }

    /**
     * Gets the value of the challenge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getChallenge() {
        return challenge;
    }

    /**
     * Sets the value of the challenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallenge(byte[] value) {
        this.challenge = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionEnum }
     *     
     */
    public TransactionEnum getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionEnum }
     *     
     */
    public void setTransaction(TransactionEnum value) {
        this.transaction = value;
    }

    /**
     * Gets the value of the setSavepoint property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Object }
     *     
     */
    public java.lang.Object getSetSavepoint() {
        return setSavepoint;
    }

    /**
     * Sets the value of the setSavepoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Object }
     *     
     */
    public void setSetSavepoint(java.lang.Object value) {
        this.setSavepoint = value;
    }

    /**
     * Gets the value of the restoreSavepointId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestoreSavepointId() {
        return restoreSavepointId;
    }

    /**
     * Sets the value of the restoreSavepointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestoreSavepointId(String value) {
        this.restoreSavepointId = value;
    }

    /**
     * Gets the value of the traceProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceProfile() {
        return traceProfile;
    }

    /**
     * Sets the value of the traceProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceProfile(String value) {
        this.traceProfile = value;
    }

    /**
     * Gets the value of the definitionsVer property.
     * 
     * @return
     *     possible object is
     *     {@link Request.DefinitionsVer }
     *     
     */
    public Request.DefinitionsVer getDefinitionsVer() {
        return definitionsVer;
    }

    /**
     * Sets the value of the definitionsVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request.DefinitionsVer }
     *     
     */
    public void setDefinitionsVer(Request.DefinitionsVer value) {
        this.definitionsVer = value;
    }

    /**
     * Gets the value of the localSettings property.
     * 
     * @return
     *     possible object is
     *     {@link LocalSettings }
     *     
     */
    public LocalSettings getLocalSettings() {
        return localSettings;
    }

    /**
     * Sets the value of the localSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalSettings }
     *     
     */
    public void setLocalSettings(LocalSettings value) {
        this.localSettings = value;
    }

    /**
     * Gets the value of the sessionVariables property.
     * 
     * @return
     *     possible object is
     *     {@link SessionVariables }
     *     
     */
    public SessionVariables getSessionVariables() {
        return sessionVariables;
    }

    /**
     * Sets the value of the sessionVariables property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionVariables }
     *     
     */
    public void setSessionVariables(SessionVariables value) {
        this.sessionVariables = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;long"&gt;
     *       &lt;attribute name="Forced" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class DefinitionsVer {

        @XmlValue
        protected long value;
        @XmlAttribute(name = "Forced")
        protected Boolean forced;

        /**
         * Gets the value of the value property.
         * 
         */
        public long getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(long value) {
            this.value = value;
        }

        /**
         * Gets the value of the forced property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isForced() {
            if (forced == null) {
                return false;
            } else {
                return forced;
            }
        }

        /**
         * Sets the value of the forced property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setForced(Boolean value) {
            this.forced = value;
        }

    }

}
