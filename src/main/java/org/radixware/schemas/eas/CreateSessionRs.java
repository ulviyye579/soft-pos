
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
import org.radixware.schemas.types.MapStrStr;


/**
 * <p>Java class for CreateSessionRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateSessionRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SecondAuthFactorRequest" type="{http://schemas.radixware.org/eas.xsd}SecondAuthenticationFactorRequest"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *           &lt;element name="EncryptedSessionId" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/&gt;
 *           &lt;element name="Challenge"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary"&gt;
 *                 &lt;minLength value="16"/&gt;
 *                 &lt;maxLength value="16"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="EncKey" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/&gt;
 *           &lt;element name="SrvEncPublicKey" type="{http://www.w3.org/2001/XMLSchema}hexBinary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="EncryptedCheckServerCertPolicy" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/&gt;
 *           &lt;element name="HashAlgorithm" type="{http://schemas.radixware.org/eas.xsd}HashAlgorithmEnum" minOccurs="0"/&gt;
 *           &lt;element name="User" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *           &lt;element name="UserDefVer" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *           &lt;element name="ExplorerRoots"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://schemas.radixware.org/eas.xsd}Definition"&gt;
 *                             &lt;all&gt;
 *                               &lt;element name="Hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                               &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                               &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                               &lt;element name="VisibleExplorerItems" minOccurs="0"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Item" type="{http://schemas.radixware.org/eas.xsd}Definition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/all&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ServerResources"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://schemas.radixware.org/eas.xsd}Definition"&gt;
 *                             &lt;all&gt;
 *                               &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;/all&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ContextlessCommands"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Item" type="{http://schemas.radixware.org/eas.xsd}Definition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ScpName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="ServerTimeZone" type="{http://schemas.radixware.org/eas.xsd}TimeZone"/&gt;
 *           &lt;element name="ProductInstallationOptions" type="{http://schemas.radixware.org/types.xsd}MapStrStr"/&gt;
 *           &lt;element name="PasswordRequirements" type="{http://schemas.radixware.org/eas.xsd}PasswordRequirements" minOccurs="0"/&gt;
 *           &lt;element name="Warnings" type="{http://schemas.radixware.org/eas.xsd}Warnings" minOccurs="0"/&gt;
 *           &lt;element name="LocalSettings" type="{http://schemas.radixware.org/eas.xsd}LocalSettings" minOccurs="0"/&gt;
 *           &lt;element name="DatabaseInfo" type="{http://schemas.radixware.org/eas.xsd}GetDatabaseInfoRs" minOccurs="0"/&gt;
 *           &lt;element name="ServerRepositoryURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="ShouldChangePassword" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="CanChangePassword" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="CanLoginWithPassword" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateSessionRs", propOrder = {
    "secondAuthFactorRequest",
    "sessionId",
    "encryptedSessionId",
    "challenge",
    "encKey",
    "srvEncPublicKey",
    "encryptedCheckServerCertPolicy",
    "hashAlgorithm",
    "user",
    "userDefVer",
    "explorerRoots",
    "serverResources",
    "contextlessCommands",
    "scpName",
    "serverTimeZone",
    "productInstallationOptions",
    "passwordRequirements",
    "warnings",
    "localSettings",
    "databaseInfo",
    "serverRepositoryURI"
})
public class CreateSessionRs {

    @XmlElement(name = "SecondAuthFactorRequest")
    protected SecondAuthenticationFactorRequest secondAuthFactorRequest;
    @XmlElement(name = "SessionId")
    protected Long sessionId;
    @XmlElement(name = "EncryptedSessionId", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] encryptedSessionId;
    @XmlElement(name = "Challenge", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] challenge;
    @XmlElement(name = "EncKey", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] encKey;
    @XmlElement(name = "SrvEncPublicKey", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected List<byte[]> srvEncPublicKey;
    @XmlElement(name = "EncryptedCheckServerCertPolicy", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] encryptedCheckServerCertPolicy;
    @XmlElement(name = "HashAlgorithm")
    @XmlSchemaType(name = "string")
    protected HashAlgorithmEnum hashAlgorithm;
    @XmlElement(name = "User")
    protected String user;
    @XmlElement(name = "UserDefVer")
    protected Long userDefVer;
    @XmlElement(name = "ExplorerRoots")
    protected CreateSessionRs.ExplorerRoots explorerRoots;
    @XmlElement(name = "ServerResources")
    protected CreateSessionRs.ServerResources serverResources;
    @XmlElement(name = "ContextlessCommands")
    protected CreateSessionRs.ContextlessCommands contextlessCommands;
    @XmlElement(name = "ScpName")
    protected String scpName;
    @XmlElement(name = "ServerTimeZone")
    protected TimeZone serverTimeZone;
    @XmlElement(name = "ProductInstallationOptions")
    protected MapStrStr productInstallationOptions;
    @XmlElement(name = "PasswordRequirements")
    protected PasswordRequirements passwordRequirements;
    @XmlElement(name = "Warnings")
    protected Warnings warnings;
    @XmlElement(name = "LocalSettings")
    protected LocalSettings localSettings;
    @XmlElement(name = "DatabaseInfo")
    protected GetDatabaseInfoRs databaseInfo;
    @XmlElement(name = "ServerRepositoryURI")
    protected String serverRepositoryURI;
    @XmlAttribute(name = "ShouldChangePassword")
    protected Boolean shouldChangePassword;
    @XmlAttribute(name = "CanChangePassword")
    protected Boolean canChangePassword;
    @XmlAttribute(name = "CanLoginWithPassword")
    protected Boolean canLoginWithPassword;

    /**
     * Gets the value of the secondAuthFactorRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SecondAuthenticationFactorRequest }
     *     
     */
    public SecondAuthenticationFactorRequest getSecondAuthFactorRequest() {
        return secondAuthFactorRequest;
    }

    /**
     * Sets the value of the secondAuthFactorRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondAuthenticationFactorRequest }
     *     
     */
    public void setSecondAuthFactorRequest(SecondAuthenticationFactorRequest value) {
        this.secondAuthFactorRequest = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSessionId(Long value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the encryptedSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getEncryptedSessionId() {
        return encryptedSessionId;
    }

    /**
     * Sets the value of the encryptedSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedSessionId(byte[] value) {
        this.encryptedSessionId = value;
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
     * Gets the value of the encKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getEncKey() {
        return encKey;
    }

    /**
     * Sets the value of the encKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncKey(byte[] value) {
        this.encKey = value;
    }

    /**
     * Gets the value of the srvEncPublicKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srvEncPublicKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrvEncPublicKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<byte[]> getSrvEncPublicKey() {
        if (srvEncPublicKey == null) {
            srvEncPublicKey = new ArrayList<byte[]>();
        }
        return this.srvEncPublicKey;
    }

    /**
     * Gets the value of the encryptedCheckServerCertPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getEncryptedCheckServerCertPolicy() {
        return encryptedCheckServerCertPolicy;
    }

    /**
     * Sets the value of the encryptedCheckServerCertPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedCheckServerCertPolicy(byte[] value) {
        this.encryptedCheckServerCertPolicy = value;
    }

    /**
     * Gets the value of the hashAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link HashAlgorithmEnum }
     *     
     */
    public HashAlgorithmEnum getHashAlgorithm() {
        return hashAlgorithm;
    }

    /**
     * Sets the value of the hashAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link HashAlgorithmEnum }
     *     
     */
    public void setHashAlgorithm(HashAlgorithmEnum value) {
        this.hashAlgorithm = value;
    }

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
     * Gets the value of the userDefVer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserDefVer() {
        return userDefVer;
    }

    /**
     * Sets the value of the userDefVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserDefVer(Long value) {
        this.userDefVer = value;
    }

    /**
     * Gets the value of the explorerRoots property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSessionRs.ExplorerRoots }
     *     
     */
    public CreateSessionRs.ExplorerRoots getExplorerRoots() {
        return explorerRoots;
    }

    /**
     * Sets the value of the explorerRoots property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSessionRs.ExplorerRoots }
     *     
     */
    public void setExplorerRoots(CreateSessionRs.ExplorerRoots value) {
        this.explorerRoots = value;
    }

    /**
     * Gets the value of the serverResources property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSessionRs.ServerResources }
     *     
     */
    public CreateSessionRs.ServerResources getServerResources() {
        return serverResources;
    }

    /**
     * Sets the value of the serverResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSessionRs.ServerResources }
     *     
     */
    public void setServerResources(CreateSessionRs.ServerResources value) {
        this.serverResources = value;
    }

    /**
     * Gets the value of the contextlessCommands property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSessionRs.ContextlessCommands }
     *     
     */
    public CreateSessionRs.ContextlessCommands getContextlessCommands() {
        return contextlessCommands;
    }

    /**
     * Sets the value of the contextlessCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSessionRs.ContextlessCommands }
     *     
     */
    public void setContextlessCommands(CreateSessionRs.ContextlessCommands value) {
        this.contextlessCommands = value;
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
     * Gets the value of the serverTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZone }
     *     
     */
    public TimeZone getServerTimeZone() {
        return serverTimeZone;
    }

    /**
     * Sets the value of the serverTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZone }
     *     
     */
    public void setServerTimeZone(TimeZone value) {
        this.serverTimeZone = value;
    }

    /**
     * Gets the value of the productInstallationOptions property.
     * 
     * @return
     *     possible object is
     *     {@link MapStrStr }
     *     
     */
    public MapStrStr getProductInstallationOptions() {
        return productInstallationOptions;
    }

    /**
     * Sets the value of the productInstallationOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapStrStr }
     *     
     */
    public void setProductInstallationOptions(MapStrStr value) {
        this.productInstallationOptions = value;
    }

    /**
     * Gets the value of the passwordRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordRequirements }
     *     
     */
    public PasswordRequirements getPasswordRequirements() {
        return passwordRequirements;
    }

    /**
     * Sets the value of the passwordRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordRequirements }
     *     
     */
    public void setPasswordRequirements(PasswordRequirements value) {
        this.passwordRequirements = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link Warnings }
     *     
     */
    public Warnings getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Warnings }
     *     
     */
    public void setWarnings(Warnings value) {
        this.warnings = value;
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
     * Gets the value of the databaseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GetDatabaseInfoRs }
     *     
     */
    public GetDatabaseInfoRs getDatabaseInfo() {
        return databaseInfo;
    }

    /**
     * Sets the value of the databaseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDatabaseInfoRs }
     *     
     */
    public void setDatabaseInfo(GetDatabaseInfoRs value) {
        this.databaseInfo = value;
    }

    /**
     * Gets the value of the serverRepositoryURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerRepositoryURI() {
        return serverRepositoryURI;
    }

    /**
     * Sets the value of the serverRepositoryURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerRepositoryURI(String value) {
        this.serverRepositoryURI = value;
    }

    /**
     * Gets the value of the shouldChangePassword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShouldChangePassword() {
        if (shouldChangePassword == null) {
            return false;
        } else {
            return shouldChangePassword;
        }
    }

    /**
     * Sets the value of the shouldChangePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldChangePassword(Boolean value) {
        this.shouldChangePassword = value;
    }

    /**
     * Gets the value of the canChangePassword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCanChangePassword() {
        if (canChangePassword == null) {
            return true;
        } else {
            return canChangePassword;
        }
    }

    /**
     * Sets the value of the canChangePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanChangePassword(Boolean value) {
        this.canChangePassword = value;
    }

    /**
     * Gets the value of the canLoginWithPassword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCanLoginWithPassword() {
        if (canLoginWithPassword == null) {
            return true;
        } else {
            return canLoginWithPassword;
        }
    }

    /**
     * Sets the value of the canLoginWithPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanLoginWithPassword(Boolean value) {
        this.canLoginWithPassword = value;
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
     *         &lt;element name="Item" type="{http://schemas.radixware.org/eas.xsd}Definition" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    public static class ContextlessCommands {

        @XmlElement(name = "Item")
        protected List<Definition> item;

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
         * {@link Definition }
         * 
         * 
         */
        public List<Definition> getItem() {
            if (item == null) {
                item = new ArrayList<Definition>();
            }
            return this.item;
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
     *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://schemas.radixware.org/eas.xsd}Definition"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="Hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="VisibleExplorerItems" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Item" type="{http://schemas.radixware.org/eas.xsd}Definition" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class ExplorerRoots {

        @XmlElement(name = "Item")
        protected List<CreateSessionRs.ExplorerRoots.Item> item;

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
         * {@link CreateSessionRs.ExplorerRoots.Item }
         * 
         * 
         */
        public List<CreateSessionRs.ExplorerRoots.Item> getItem() {
            if (item == null) {
                item = new ArrayList<CreateSessionRs.ExplorerRoots.Item>();
            }
            return this.item;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Definition"&gt;
         *       &lt;all&gt;
         *         &lt;element name="Hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="VisibleExplorerItems" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Item" type="{http://schemas.radixware.org/eas.xsd}Definition" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/all&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "hidden",
            "title",
            "description",
            "visibleExplorerItems"
        })
        public static class Item
            extends Definition
        {

            @XmlElement(name = "Hidden")
            protected Boolean hidden;
            @XmlElement(name = "Title", required = true)
            protected String title;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "VisibleExplorerItems")
            protected CreateSessionRs.ExplorerRoots.Item.VisibleExplorerItems visibleExplorerItems;

            /**
             * Gets the value of the hidden property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isHidden() {
                return hidden;
            }

            /**
             * Sets the value of the hidden property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setHidden(Boolean value) {
                this.hidden = value;
            }

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the visibleExplorerItems property.
             * 
             * @return
             *     possible object is
             *     {@link CreateSessionRs.ExplorerRoots.Item.VisibleExplorerItems }
             *     
             */
            public CreateSessionRs.ExplorerRoots.Item.VisibleExplorerItems getVisibleExplorerItems() {
                return visibleExplorerItems;
            }

            /**
             * Sets the value of the visibleExplorerItems property.
             * 
             * @param value
             *     allowed object is
             *     {@link CreateSessionRs.ExplorerRoots.Item.VisibleExplorerItems }
             *     
             */
            public void setVisibleExplorerItems(CreateSessionRs.ExplorerRoots.Item.VisibleExplorerItems value) {
                this.visibleExplorerItems = value;
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
             *         &lt;element name="Item" type="{http://schemas.radixware.org/eas.xsd}Definition" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            public static class VisibleExplorerItems {

                @XmlElement(name = "Item")
                protected List<Definition> item;

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
                 * {@link Definition }
                 * 
                 * 
                 */
                public List<Definition> getItem() {
                    if (item == null) {
                        item = new ArrayList<Definition>();
                    }
                    return this.item;
                }

            }

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
     *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://schemas.radixware.org/eas.xsd}Definition"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class ServerResources {

        @XmlElement(name = "Item")
        protected List<CreateSessionRs.ServerResources.Item> item;

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
         * {@link CreateSessionRs.ServerResources.Item }
         * 
         * 
         */
        public List<CreateSessionRs.ServerResources.Item> getItem() {
            if (item == null) {
                item = new ArrayList<CreateSessionRs.ServerResources.Item>();
            }
            return this.item;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Definition"&gt;
         *       &lt;all&gt;
         *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/all&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "title"
        })
        public static class Item
            extends Definition
        {

            @XmlElement(name = "Title", required = true)
            protected String title;

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

        }

    }

}
