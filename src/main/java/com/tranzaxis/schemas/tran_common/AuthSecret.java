
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.tranzaxis.schemas.common_types.AppEncryptedData;


/**
 * <p>Java class for AuthSecret complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthSecret"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PwdHashBlockCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *         &lt;element name="PwdHash2BlockCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *         &lt;element name="PersonACrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *         &lt;element name="PersonQ" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="PersonA" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Password" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Challenge" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="PwdHashBlock"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="PwdHash2Block"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ForgotPassword" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="ResetPassword" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="UsedHashAlgo" type="{http://schemas.tranzaxis.com/tran-common.xsd}DigestMethodEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthSecret", propOrder = {
    "pwdHashBlockCrypt",
    "pwdHash2BlockCrypt",
    "personACrypt",
    "personQ",
    "personA"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.tran_common.Token.Login.Auth.class,
    com.tranzaxis.schemas.tran_common.Token.DeviceApp.Auth.class
})
public class AuthSecret {

    @XmlElement(name = "PwdHashBlockCrypt")
    protected AppEncryptedData pwdHashBlockCrypt;
    @XmlElement(name = "PwdHash2BlockCrypt")
    protected AppEncryptedData pwdHash2BlockCrypt;
    @XmlElement(name = "PersonACrypt")
    protected AppEncryptedData personACrypt;
    @XmlElement(name = "PersonQ")
    protected String personQ;
    @XmlElement(name = "PersonA")
    protected String personA;
    @XmlAttribute(name = "Password")
    protected String password;
    @XmlAttribute(name = "Challenge")
    protected String challenge;
    @XmlAttribute(name = "PwdHashBlock")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] pwdHashBlock;
    @XmlAttribute(name = "PwdHash2Block")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] pwdHash2Block;
    @XmlAttribute(name = "ForgotPassword")
    protected Boolean forgotPassword;
    @XmlAttribute(name = "ResetPassword")
    protected Boolean resetPassword;
    @XmlAttribute(name = "UsedHashAlgo")
    protected String usedHashAlgo;

    /**
     * Gets the value of the pwdHashBlockCrypt property.
     * 
     * @return
     *     possible object is
     *     {@link AppEncryptedData }
     *     
     */
    public AppEncryptedData getPwdHashBlockCrypt() {
        return pwdHashBlockCrypt;
    }

    /**
     * Sets the value of the pwdHashBlockCrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppEncryptedData }
     *     
     */
    public void setPwdHashBlockCrypt(AppEncryptedData value) {
        this.pwdHashBlockCrypt = value;
    }

    /**
     * Gets the value of the pwdHash2BlockCrypt property.
     * 
     * @return
     *     possible object is
     *     {@link AppEncryptedData }
     *     
     */
    public AppEncryptedData getPwdHash2BlockCrypt() {
        return pwdHash2BlockCrypt;
    }

    /**
     * Sets the value of the pwdHash2BlockCrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppEncryptedData }
     *     
     */
    public void setPwdHash2BlockCrypt(AppEncryptedData value) {
        this.pwdHash2BlockCrypt = value;
    }

    /**
     * Gets the value of the personACrypt property.
     * 
     * @return
     *     possible object is
     *     {@link AppEncryptedData }
     *     
     */
    public AppEncryptedData getPersonACrypt() {
        return personACrypt;
    }

    /**
     * Sets the value of the personACrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppEncryptedData }
     *     
     */
    public void setPersonACrypt(AppEncryptedData value) {
        this.personACrypt = value;
    }

    /**
     * Gets the value of the personQ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonQ() {
        return personQ;
    }

    /**
     * Sets the value of the personQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonQ(String value) {
        this.personQ = value;
    }

    /**
     * Gets the value of the personA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonA() {
        return personA;
    }

    /**
     * Sets the value of the personA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonA(String value) {
        this.personA = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the challenge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallenge() {
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
    public void setChallenge(String value) {
        this.challenge = value;
    }

    /**
     * Gets the value of the pwdHashBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getPwdHashBlock() {
        return pwdHashBlock;
    }

    /**
     * Sets the value of the pwdHashBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwdHashBlock(byte[] value) {
        this.pwdHashBlock = value;
    }

    /**
     * Gets the value of the pwdHash2Block property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getPwdHash2Block() {
        return pwdHash2Block;
    }

    /**
     * Sets the value of the pwdHash2Block property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwdHash2Block(byte[] value) {
        this.pwdHash2Block = value;
    }

    /**
     * Gets the value of the forgotPassword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForgotPassword() {
        return forgotPassword;
    }

    /**
     * Sets the value of the forgotPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForgotPassword(Boolean value) {
        this.forgotPassword = value;
    }

    /**
     * Gets the value of the resetPassword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResetPassword() {
        return resetPassword;
    }

    /**
     * Sets the value of the resetPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResetPassword(Boolean value) {
        this.resetPassword = value;
    }

    /**
     * Gets the value of the usedHashAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedHashAlgo() {
        return usedHashAlgo;
    }

    /**
     * Sets the value of the usedHashAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedHashAlgo(String value) {
        this.usedHashAlgo = value;
    }

}
