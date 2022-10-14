
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Challenge"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary"&gt;
 *               &lt;minLength value="16"/&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SecurityToken" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary"&gt;
 *               &lt;minLength value="16"/&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Trace" type="{http://schemas.radixware.org/eas.xsd}Trace" minOccurs="0"/&gt;
 *         &lt;element name="ScpName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SavepointId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SessionVariables" type="{http://schemas.radixware.org/eas.xsd}SessionVariables" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LocalSettingsLastChangeTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "challenge",
    "securityToken",
    "trace",
    "scpName",
    "savepointId",
    "sessionVariables"
})
@XmlSeeAlso({
    LoginRs.class,
    ChangePasswordRs.class,
    GetPasswordRequirementsRs.class,
    SelectRs.class,
    ListVisibleExplorerItemsRs.class,
    ListEdPresVisibleExpItemsRs.class,
    SetParentRs.class,
    ListInstantiatableClassesRs.class,
    PrepareCreateRs.class,
    CreateRs.class,
    DeleteRs.class,
    ReadRs.class,
    ContextlessCommandRs.class,
    GetObjectTitlesRs.class,
    CalcSelectionStatisticRs.class,
    GetDatabaseInfoRs.class,
    GetCustomAttrsDynamicDataRs.class
})
public abstract class Response {

    @XmlElement(name = "Challenge", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] challenge;
    @XmlElement(name = "SecurityToken", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] securityToken;
    @XmlElement(name = "Trace")
    protected Trace trace;
    @XmlElement(name = "ScpName")
    protected String scpName;
    @XmlElement(name = "SavepointId")
    protected String savepointId;
    @XmlElement(name = "SessionVariables")
    protected SessionVariables sessionVariables;
    @XmlAttribute(name = "LocalSettingsLastChangeTime")
    protected XMLGregorianCalendar localSettingsLastChangeTime;

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
     * Gets the value of the securityToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSecurityToken() {
        return securityToken;
    }

    /**
     * Sets the value of the securityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityToken(byte[] value) {
        this.securityToken = value;
    }

    /**
     * Gets the value of the trace property.
     * 
     * @return
     *     possible object is
     *     {@link Trace }
     *     
     */
    public Trace getTrace() {
        return trace;
    }

    /**
     * Sets the value of the trace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trace }
     *     
     */
    public void setTrace(Trace value) {
        this.trace = value;
    }

    /**
     * Gets the value of the scpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScpName() {
        return scpName;
    }

    /**
     * Sets the value of the scpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScpName(String value) {
        this.scpName = value;
    }

    /**
     * Gets the value of the savepointId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavepointId() {
        return savepointId;
    }

    /**
     * Sets the value of the savepointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavepointId(String value) {
        this.savepointId = value;
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
     * Gets the value of the localSettingsLastChangeTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalSettingsLastChangeTime() {
        return localSettingsLastChangeTime;
    }

    /**
     * Sets the value of the localSettingsLastChangeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalSettingsLastChangeTime(XMLGregorianCalendar value) {
        this.localSettingsLastChangeTime = value;
    }

}
