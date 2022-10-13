
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreateSessionRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateSessionRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="User" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *         &lt;element name="AuthType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Platform"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="AppVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="KernelVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RepositoryUri" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DefinitionsVer" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *                 &lt;attribute name="TopLayerUri" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExplorerRoot" type="{http://schemas.radixware.org/eas.xsd}Definition" minOccurs="0"/&gt;
 *         &lt;element name="ReturnAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Language" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Country" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Environment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KrbInitialToken" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/&gt;
 *         &lt;element name="UserCertificatesChain" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}hexBinary" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ParentSessionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ReplacedSessionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
 *         &lt;element name="OsName" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *         &lt;element name="JavaVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JavaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrowserVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecondAuthFactor" type="{http://schemas.radixware.org/eas.xsd}SecondAuthenticationFactorResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="WebDriverEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="LocalSettingsLastChangeTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateSessionRq", propOrder = {
    "user",
    "authType",
    "platform",
    "stationName",
    "explorerRoot",
    "returnAddress",
    "language",
    "country",
    "environment",
    "krbInitialToken",
    "userCertificatesChain",
    "parentSessionId",
    "replacedSessionId",
    "sessionsToTerminate",
    "osName",
    "javaVersion",
    "javaName",
    "browserVersion",
    "secondAuthFactor"
})
public class CreateSessionRq {

    @XmlElement(name = "User")
    protected String user;
    @XmlElement(name = "AuthType", required = true)
    protected String authType;
    @XmlElement(name = "Platform", required = true)
    protected CreateSessionRq.Platform platform;
    @XmlElement(name = "StationName", required = true)
    protected String stationName;
    @XmlElement(name = "ExplorerRoot")
    protected Definition explorerRoot;
    @XmlElement(name = "ReturnAddress")
    protected String returnAddress;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Environment")
    protected String environment;
    @XmlElement(name = "KrbInitialToken", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] krbInitialToken;
    @XmlElement(name = "UserCertificatesChain")
    protected CreateSessionRq.UserCertificatesChain userCertificatesChain;
    @XmlElement(name = "ParentSessionId")
    protected Long parentSessionId;
    @XmlElement(name = "ReplacedSessionId")
    protected Long replacedSessionId;
    @XmlElement(name = "SessionsToTerminate", required = true)
    protected CreateSessionRq.SessionsToTerminate sessionsToTerminate;
    @XmlElement(name = "OsName")
    protected String osName;
    @XmlElement(name = "JavaVersion")
    protected String javaVersion;
    @XmlElement(name = "JavaName")
    protected String javaName;
    @XmlElement(name = "BrowserVersion")
    protected String browserVersion;
    @XmlElement(name = "SecondAuthFactor")
    protected SecondAuthenticationFactorResponse secondAuthFactor;
    @XmlAttribute(name = "WebDriverEnabled")
    protected Boolean webDriverEnabled;
    @XmlAttribute(name = "LocalSettingsLastChangeTime")
    protected XMLGregorianCalendar localSettingsLastChangeTime;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
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
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSessionRq.Platform }
     *     
     */
    public CreateSessionRq.Platform getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSessionRq.Platform }
     *     
     */
    public void setPlatform(CreateSessionRq.Platform value) {
        this.platform = value;
    }

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
     * Gets the value of the explorerRoot property.
     * 
     * @return
     *     possible object is
     *     {@link Definition }
     *     
     */
    public Definition getExplorerRoot() {
        return explorerRoot;
    }

    /**
     * Sets the value of the explorerRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Definition }
     *     
     */
    public void setExplorerRoot(Definition value) {
        this.explorerRoot = value;
    }

    /**
     * Gets the value of the returnAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAddress() {
        return returnAddress;
    }

    /**
     * Sets the value of the returnAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAddress(String value) {
        this.returnAddress = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
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
     * Gets the value of the krbInitialToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getKrbInitialToken() {
        return krbInitialToken;
    }

    /**
     * Sets the value of the krbInitialToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKrbInitialToken(byte[] value) {
        this.krbInitialToken = value;
    }

    /**
     * Gets the value of the userCertificatesChain property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSessionRq.UserCertificatesChain }
     *     
     */
    public CreateSessionRq.UserCertificatesChain getUserCertificatesChain() {
        return userCertificatesChain;
    }

    /**
     * Sets the value of the userCertificatesChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSessionRq.UserCertificatesChain }
     *     
     */
    public void setUserCertificatesChain(CreateSessionRq.UserCertificatesChain value) {
        this.userCertificatesChain = value;
    }

    /**
     * Gets the value of the parentSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentSessionId() {
        return parentSessionId;
    }

    /**
     * Sets the value of the parentSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentSessionId(Long value) {
        this.parentSessionId = value;
    }

    /**
     * Gets the value of the replacedSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReplacedSessionId() {
        return replacedSessionId;
    }

    /**
     * Sets the value of the replacedSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReplacedSessionId(Long value) {
        this.replacedSessionId = value;
    }

    /**
     * Gets the value of the sessionsToTerminate property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSessionRq.SessionsToTerminate }
     *     
     */
    public CreateSessionRq.SessionsToTerminate getSessionsToTerminate() {
        return sessionsToTerminate;
    }

    /**
     * Sets the value of the sessionsToTerminate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSessionRq.SessionsToTerminate }
     *     
     */
    public void setSessionsToTerminate(CreateSessionRq.SessionsToTerminate value) {
        this.sessionsToTerminate = value;
    }

    /**
     * Gets the value of the osName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsName() {
        return osName;
    }

    /**
     * Sets the value of the osName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsName(String value) {
        this.osName = value;
    }

    /**
     * Gets the value of the javaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJavaVersion() {
        return javaVersion;
    }

    /**
     * Sets the value of the javaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJavaVersion(String value) {
        this.javaVersion = value;
    }

    /**
     * Gets the value of the javaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJavaName() {
        return javaName;
    }

    /**
     * Sets the value of the javaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJavaName(String value) {
        this.javaName = value;
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
     * Gets the value of the secondAuthFactor property.
     * 
     * @return
     *     possible object is
     *     {@link SecondAuthenticationFactorResponse }
     *     
     */
    public SecondAuthenticationFactorResponse getSecondAuthFactor() {
        return secondAuthFactor;
    }

    /**
     * Sets the value of the secondAuthFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondAuthenticationFactorResponse }
     *     
     */
    public void setSecondAuthFactor(SecondAuthenticationFactorResponse value) {
        this.secondAuthFactor = value;
    }

    /**
     * Gets the value of the webDriverEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWebDriverEnabled() {
        if (webDriverEnabled == null) {
            return false;
        } else {
            return webDriverEnabled;
        }
    }

    /**
     * Sets the value of the webDriverEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWebDriverEnabled(Boolean value) {
        this.webDriverEnabled = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="AppVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="KernelVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RepositoryUri" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DefinitionsVer" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
     *       &lt;attribute name="TopLayerUri" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Platform {

        @XmlAttribute(name = "AppVersion", required = true)
        protected String appVersion;
        @XmlAttribute(name = "KernelVersion", required = true)
        protected String kernelVersion;
        @XmlAttribute(name = "RepositoryUri", required = true)
        protected String repositoryUri;
        @XmlAttribute(name = "DefinitionsVer", required = true)
        protected long definitionsVer;
        @XmlAttribute(name = "TopLayerUri", required = true)
        protected String topLayerUri;

        /**
         * Gets the value of the appVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppVersion() {
            return appVersion;
        }

        /**
         * Sets the value of the appVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAppVersion(String value) {
            this.appVersion = value;
        }

        /**
         * Gets the value of the kernelVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKernelVersion() {
            return kernelVersion;
        }

        /**
         * Sets the value of the kernelVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKernelVersion(String value) {
            this.kernelVersion = value;
        }

        /**
         * Gets the value of the repositoryUri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRepositoryUri() {
            return repositoryUri;
        }

        /**
         * Sets the value of the repositoryUri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRepositoryUri(String value) {
            this.repositoryUri = value;
        }

        /**
         * Gets the value of the definitionsVer property.
         * 
         */
        public long getDefinitionsVer() {
            return definitionsVer;
        }

        /**
         * Sets the value of the definitionsVer property.
         * 
         */
        public void setDefinitionsVer(long value) {
            this.definitionsVer = value;
        }

        /**
         * Gets the value of the topLayerUri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTopLayerUri() {
            return topLayerUri;
        }

        /**
         * Sets the value of the topLayerUri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTopLayerUri(String value) {
            this.topLayerUri = value;
        }

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
     *         &lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}hexBinary" maxOccurs="unbounded"/&gt;
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
        "item"
    })
    public static class UserCertificatesChain {

        @XmlElement(name = "Item", required = true, type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        @XmlSchemaType(name = "hexBinary")
        protected List<byte[]> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<byte[]> getItem() {
            if (item == null) {
                item = new ArrayList<byte[]>();
            }
            return this.item;
        }

    }

}
