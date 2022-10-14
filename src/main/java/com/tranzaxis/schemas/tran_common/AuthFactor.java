
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthFactor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthFactor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonQuestion" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="HashSalt" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="HashAlgo" type="{http://schemas.tranzaxis.com/tran-common.xsd}DigestMethodEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Kind" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
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
@XmlType(name = "AuthFactor", propOrder = {
    "personQuestion",
    "hashSalt",
    "hashAlgo"
})
public class AuthFactor {

    @XmlElement(name = "PersonQuestion")
    protected String personQuestion;
    @XmlElement(name = "HashSalt")
    protected String hashSalt;
    @XmlElement(name = "HashAlgo")
    protected String hashAlgo;
    @XmlAttribute(name = "Kind", required = true)
    protected String kind;

    /**
     * Gets the value of the personQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonQuestion() {
        return personQuestion;
    }

    /**
     * Sets the value of the personQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonQuestion(String value) {
        this.personQuestion = value;
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
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

}
