
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for TdsRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TdsRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Extensions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://schemas.radixware.org/types.xsd&gt;Str"&gt;
 *                           &lt;attribute name="name" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="id" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="criticalityIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAResScheme" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Variants" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence minOccurs="0"&gt;
 *                             &lt;element name="Variant" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Item1" type="{http://schemas.tranzaxis.com/tran.xsd}TdsPAResVariant"/&gt;
 *                                       &lt;element name="Item2" type="{http://schemas.tranzaxis.com/tran.xsd}TdsPAResVariant" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Cavv" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Value" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Eci" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Algo" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PersonalQuestions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Question" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CommonQuestions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Kinds" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SetPassword" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="HashAlgo" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}DigestMethodEnum" /&gt;
 *                 &lt;attribute name="HashSalt" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AuthInvoice" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Enrolled" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="CanBeEnrolled" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="TokenId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="IssuerInstName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="IssuerInstRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AuthenticationType" type="{http://schemas.tranzaxis.com/tran.xsd}TdsAuthenticationType" /&gt;
 *       &lt;attribute name="CurrencyDecPlaces" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="AuthenticationMethod" type="{http://schemas.tranzaxis.com/tran.xsd}TranRefineKindEnum" /&gt;
 *       &lt;attribute name="AuthMethod" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AcsChallengeMandated" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="WhitelistStatus" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="PrimaryAuthenticationIsSuccessulForItem" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="RiskScore" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TdsRs", propOrder = {
    "extension",
    "extensions",
    "paResScheme",
    "cavv",
    "personalQuestions",
    "commonQuestions",
    "setPassword",
    "authInvoice"
})
public class TdsRs {

    @XmlElement(name = "Extension")
    protected Object extension;
    @XmlElement(name = "Extensions")
    protected TdsRs.Extensions extensions;
    @XmlElement(name = "PAResScheme")
    protected TdsRs.PAResScheme paResScheme;
    @XmlElement(name = "Cavv")
    protected TdsRs.Cavv cavv;
    @XmlElement(name = "PersonalQuestions")
    protected TdsRs.PersonalQuestions personalQuestions;
    @XmlElement(name = "CommonQuestions")
    protected TdsRs.CommonQuestions commonQuestions;
    @XmlElement(name = "SetPassword")
    protected TdsRs.SetPassword setPassword;
    @XmlElement(name = "AuthInvoice")
    protected TdsRs.AuthInvoice authInvoice;
    @XmlAttribute(name = "Enrolled")
    protected Boolean enrolled;
    @XmlAttribute(name = "CanBeEnrolled")
    protected Boolean canBeEnrolled;
    @XmlAttribute(name = "TokenId")
    protected Long tokenId;
    @XmlAttribute(name = "IssuerInstName")
    protected String issuerInstName;
    @XmlAttribute(name = "IssuerInstRid")
    protected String issuerInstRid;
    @XmlAttribute(name = "AuthenticationType")
    protected String authenticationType;
    @XmlAttribute(name = "CurrencyDecPlaces")
    protected Long currencyDecPlaces;
    @XmlAttribute(name = "AuthenticationMethod")
    protected String authenticationMethod;
    @XmlAttribute(name = "AuthMethod")
    protected String authMethod;
    @XmlAttribute(name = "AcsChallengeMandated")
    protected String acsChallengeMandated;
    @XmlAttribute(name = "WhitelistStatus")
    protected Boolean whitelistStatus;
    @XmlAttribute(name = "PrimaryAuthenticationIsSuccessulForItem")
    protected String primaryAuthenticationIsSuccessulForItem;
    @XmlAttribute(name = "RiskScore")
    protected Long riskScore;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link TdsRs.Extensions }
     *     
     */
    public TdsRs.Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdsRs.Extensions }
     *     
     */
    public void setExtensions(TdsRs.Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the paResScheme property.
     * 
     * @return
     *     possible object is
     *     {@link TdsRs.PAResScheme }
     *     
     */
    public TdsRs.PAResScheme getPAResScheme() {
        return paResScheme;
    }

    /**
     * Sets the value of the paResScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdsRs.PAResScheme }
     *     
     */
    public void setPAResScheme(TdsRs.PAResScheme value) {
        this.paResScheme = value;
    }

    /**
     * Gets the value of the cavv property.
     * 
     * @return
     *     possible object is
     *     {@link TdsRs.Cavv }
     *     
     */
    public TdsRs.Cavv getCavv() {
        return cavv;
    }

    /**
     * Sets the value of the cavv property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdsRs.Cavv }
     *     
     */
    public void setCavv(TdsRs.Cavv value) {
        this.cavv = value;
    }

    /**
     * Gets the value of the personalQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link TdsRs.PersonalQuestions }
     *     
     */
    public TdsRs.PersonalQuestions getPersonalQuestions() {
        return personalQuestions;
    }

    /**
     * Sets the value of the personalQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdsRs.PersonalQuestions }
     *     
     */
    public void setPersonalQuestions(TdsRs.PersonalQuestions value) {
        this.personalQuestions = value;
    }

    /**
     * Gets the value of the commonQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link TdsRs.CommonQuestions }
     *     
     */
    public TdsRs.CommonQuestions getCommonQuestions() {
        return commonQuestions;
    }

    /**
     * Sets the value of the commonQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdsRs.CommonQuestions }
     *     
     */
    public void setCommonQuestions(TdsRs.CommonQuestions value) {
        this.commonQuestions = value;
    }

    /**
     * Gets the value of the setPassword property.
     * 
     * @return
     *     possible object is
     *     {@link TdsRs.SetPassword }
     *     
     */
    public TdsRs.SetPassword getSetPassword() {
        return setPassword;
    }

    /**
     * Sets the value of the setPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdsRs.SetPassword }
     *     
     */
    public void setSetPassword(TdsRs.SetPassword value) {
        this.setPassword = value;
    }

    /**
     * Gets the value of the authInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link TdsRs.AuthInvoice }
     *     
     */
    public TdsRs.AuthInvoice getAuthInvoice() {
        return authInvoice;
    }

    /**
     * Sets the value of the authInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdsRs.AuthInvoice }
     *     
     */
    public void setAuthInvoice(TdsRs.AuthInvoice value) {
        this.authInvoice = value;
    }

    /**
     * Gets the value of the enrolled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnrolled() {
        return enrolled;
    }

    /**
     * Sets the value of the enrolled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnrolled(Boolean value) {
        this.enrolled = value;
    }

    /**
     * Gets the value of the canBeEnrolled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBeEnrolled() {
        return canBeEnrolled;
    }

    /**
     * Sets the value of the canBeEnrolled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBeEnrolled(Boolean value) {
        this.canBeEnrolled = value;
    }

    /**
     * Gets the value of the tokenId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTokenId() {
        return tokenId;
    }

    /**
     * Sets the value of the tokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTokenId(Long value) {
        this.tokenId = value;
    }

    /**
     * Gets the value of the issuerInstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerInstName() {
        return issuerInstName;
    }

    /**
     * Sets the value of the issuerInstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerInstName(String value) {
        this.issuerInstName = value;
    }

    /**
     * Gets the value of the issuerInstRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerInstRid() {
        return issuerInstRid;
    }

    /**
     * Sets the value of the issuerInstRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerInstRid(String value) {
        this.issuerInstRid = value;
    }

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationType(String value) {
        this.authenticationType = value;
    }

    /**
     * Gets the value of the currencyDecPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrencyDecPlaces() {
        return currencyDecPlaces;
    }

    /**
     * Sets the value of the currencyDecPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrencyDecPlaces(Long value) {
        this.currencyDecPlaces = value;
    }

    /**
     * Gets the value of the authenticationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationMethod() {
        return authenticationMethod;
    }

    /**
     * Sets the value of the authenticationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationMethod(String value) {
        this.authenticationMethod = value;
    }

    /**
     * Gets the value of the authMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthMethod() {
        return authMethod;
    }

    /**
     * Sets the value of the authMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthMethod(String value) {
        this.authMethod = value;
    }

    /**
     * Gets the value of the acsChallengeMandated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsChallengeMandated() {
        return acsChallengeMandated;
    }

    /**
     * Sets the value of the acsChallengeMandated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsChallengeMandated(String value) {
        this.acsChallengeMandated = value;
    }

    /**
     * Gets the value of the whitelistStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWhitelistStatus() {
        return whitelistStatus;
    }

    /**
     * Sets the value of the whitelistStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWhitelistStatus(Boolean value) {
        this.whitelistStatus = value;
    }

    /**
     * Gets the value of the primaryAuthenticationIsSuccessulForItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAuthenticationIsSuccessulForItem() {
        return primaryAuthenticationIsSuccessulForItem;
    }

    /**
     * Sets the value of the primaryAuthenticationIsSuccessulForItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAuthenticationIsSuccessulForItem(String value) {
        this.primaryAuthenticationIsSuccessulForItem = value;
    }

    /**
     * Gets the value of the riskScore property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRiskScore() {
        return riskScore;
    }

    /**
     * Sets the value of the riskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRiskScore(Long value) {
        this.riskScore = value;
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
     *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AuthInvoice {

        @XmlAttribute(name = "Id")
        protected Long id;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setId(Long value) {
            this.id = value;
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
     *       &lt;attribute name="Value" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Eci" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Algo" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Cavv {

        @XmlAttribute(name = "Value", required = true)
        protected String value;
        @XmlAttribute(name = "Eci", required = true)
        protected String eci;
        @XmlAttribute(name = "Algo", required = true)
        protected long algo;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the eci property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEci() {
            return eci;
        }

        /**
         * Sets the value of the eci property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEci(String value) {
            this.eci = value;
        }

        /**
         * Gets the value of the algo property.
         * 
         */
        public long getAlgo() {
            return algo;
        }

        /**
         * Sets the value of the algo property.
         * 
         */
        public void setAlgo(long value) {
            this.algo = value;
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
     *       &lt;attribute name="Kinds" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CommonQuestions {

        @XmlAttribute(name = "Kinds", required = true)
        protected String kinds;

        /**
         * Gets the value of the kinds property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKinds() {
            return kinds;
        }

        /**
         * Sets the value of the kinds property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKinds(String value) {
            this.kinds = value;
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
     *         &lt;element name="Extension" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://schemas.radixware.org/types.xsd&gt;Str"&gt;
     *                 &lt;attribute name="name" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="id" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="criticalityIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
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
        "extension"
    })
    public static class Extensions {

        @XmlElement(name = "Extension")
        protected List<TdsRs.Extensions.Extension> extension;

        /**
         * Gets the value of the extension property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extension property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtension().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TdsRs.Extensions.Extension }
         * 
         * 
         */
        public List<TdsRs.Extensions.Extension> getExtension() {
            if (extension == null) {
                extension = new ArrayList<TdsRs.Extensions.Extension>();
            }
            return this.extension;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://schemas.radixware.org/types.xsd&gt;Str"&gt;
         *       &lt;attribute name="name" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="id" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="criticalityIndicator" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
        public static class Extension {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "criticalityIndicator")
            protected String criticalityIndicator;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the criticalityIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCriticalityIndicator() {
                return criticalityIndicator;
            }

            /**
             * Sets the value of the criticalityIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCriticalityIndicator(String value) {
                this.criticalityIndicator = value;
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
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="Variants" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence minOccurs="0"&gt;
     *                   &lt;element name="Variant" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Item1" type="{http://schemas.tranzaxis.com/tran.xsd}TdsPAResVariant"/&gt;
     *                             &lt;element name="Item2" type="{http://schemas.tranzaxis.com/tran.xsd}TdsPAResVariant" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "variants"
    })
    public static class PAResScheme {

        @XmlElement(name = "Variants")
        protected TdsRs.PAResScheme.Variants variants;
        @XmlAttribute(name = "Id", required = true)
        protected String id;

        /**
         * Gets the value of the variants property.
         * 
         * @return
         *     possible object is
         *     {@link TdsRs.PAResScheme.Variants }
         *     
         */
        public TdsRs.PAResScheme.Variants getVariants() {
            return variants;
        }

        /**
         * Sets the value of the variants property.
         * 
         * @param value
         *     allowed object is
         *     {@link TdsRs.PAResScheme.Variants }
         *     
         */
        public void setVariants(TdsRs.PAResScheme.Variants value) {
            this.variants = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
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
         *       &lt;sequence minOccurs="0"&gt;
         *         &lt;element name="Variant" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Item1" type="{http://schemas.tranzaxis.com/tran.xsd}TdsPAResVariant"/&gt;
         *                   &lt;element name="Item2" type="{http://schemas.tranzaxis.com/tran.xsd}TdsPAResVariant" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *               &lt;/restriction&gt;
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
            "variant"
        })
        public static class Variants {

            @XmlElement(name = "Variant")
            protected List<TdsRs.PAResScheme.Variants.Variant> variant;

            /**
             * Gets the value of the variant property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the variant property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVariant().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TdsRs.PAResScheme.Variants.Variant }
             * 
             * 
             */
            public List<TdsRs.PAResScheme.Variants.Variant> getVariant() {
                if (variant == null) {
                    variant = new ArrayList<TdsRs.PAResScheme.Variants.Variant>();
                }
                return this.variant;
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
             *         &lt;element name="Item1" type="{http://schemas.tranzaxis.com/tran.xsd}TdsPAResVariant"/&gt;
             *         &lt;element name="Item2" type="{http://schemas.tranzaxis.com/tran.xsd}TdsPAResVariant" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item1",
                "item2"
            })
            public static class Variant {

                @XmlElement(name = "Item1", required = true)
                protected TdsPAResVariant item1;
                @XmlElement(name = "Item2")
                protected TdsPAResVariant item2;
                @XmlAttribute(name = "Id", required = true)
                protected String id;

                /**
                 * Gets the value of the item1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TdsPAResVariant }
                 *     
                 */
                public TdsPAResVariant getItem1() {
                    return item1;
                }

                /**
                 * Sets the value of the item1 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TdsPAResVariant }
                 *     
                 */
                public void setItem1(TdsPAResVariant value) {
                    this.item1 = value;
                }

                /**
                 * Gets the value of the item2 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TdsPAResVariant }
                 *     
                 */
                public TdsPAResVariant getItem2() {
                    return item2;
                }

                /**
                 * Sets the value of the item2 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TdsPAResVariant }
                 *     
                 */
                public void setItem2(TdsPAResVariant value) {
                    this.item2 = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
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
     *         &lt;element name="Question" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "question"
    })
    public static class PersonalQuestions {

        @XmlElement(name = "Question")
        protected List<String> question;

        /**
         * Gets the value of the question property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the question property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQuestion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getQuestion() {
            if (question == null) {
                question = new ArrayList<String>();
            }
            return this.question;
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
     *       &lt;attribute name="HashAlgo" use="required" type="{http://schemas.tranzaxis.com/tran-common.xsd}DigestMethodEnum" /&gt;
     *       &lt;attribute name="HashSalt" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SetPassword {

        @XmlAttribute(name = "HashAlgo", required = true)
        protected String hashAlgo;
        @XmlAttribute(name = "HashSalt", required = true)
        protected String hashSalt;

        /**
         * Gets the value of the hashAlgo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHashAlgo() {
            return hashAlgo;
        }

        /**
         * Sets the value of the hashAlgo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHashAlgo(String value) {
            this.hashAlgo = value;
        }

        /**
         * Gets the value of the hashSalt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHashSalt() {
            return hashSalt;
        }

        /**
         * Sets the value of the hashSalt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHashSalt(String value) {
            this.hashSalt = value;
        }

    }

}
