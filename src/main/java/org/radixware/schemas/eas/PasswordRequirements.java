
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PasswordRequirements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PasswordRequirements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BlackList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MinLen" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="AlphabeticCharsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="AlphabeticCharsInMixedCaseRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="NumericCharsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="SpecialCharsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="PwdMustDifferFromName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="HashAlgorithm" type="{http://schemas.radixware.org/eas.xsd}HashAlgorithmEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PasswordRequirements", propOrder = {
    "blackList"
})
public class PasswordRequirements {

    @XmlElement(name = "BlackList")
    protected PasswordRequirements.BlackList blackList;
    @XmlAttribute(name = "MinLen")
    protected Integer minLen;
    @XmlAttribute(name = "AlphabeticCharsRequired")
    protected Boolean alphabeticCharsRequired;
    @XmlAttribute(name = "AlphabeticCharsInMixedCaseRequired")
    protected Boolean alphabeticCharsInMixedCaseRequired;
    @XmlAttribute(name = "NumericCharsRequired")
    protected Boolean numericCharsRequired;
    @XmlAttribute(name = "SpecialCharsRequired")
    protected Boolean specialCharsRequired;
    @XmlAttribute(name = "PwdMustDifferFromName")
    protected Boolean pwdMustDifferFromName;
    @XmlAttribute(name = "HashAlgorithm")
    protected HashAlgorithmEnum hashAlgorithm;

    /**
     * Gets the value of the blackList property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordRequirements.BlackList }
     *     
     */
    public PasswordRequirements.BlackList getBlackList() {
        return blackList;
    }

    /**
     * Sets the value of the blackList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordRequirements.BlackList }
     *     
     */
    public void setBlackList(PasswordRequirements.BlackList value) {
        this.blackList = value;
    }

    /**
     * Gets the value of the minLen property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinLen() {
        return minLen;
    }

    /**
     * Sets the value of the minLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinLen(Integer value) {
        this.minLen = value;
    }

    /**
     * Gets the value of the alphabeticCharsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAlphabeticCharsRequired() {
        if (alphabeticCharsRequired == null) {
            return false;
        } else {
            return alphabeticCharsRequired;
        }
    }

    /**
     * Sets the value of the alphabeticCharsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlphabeticCharsRequired(Boolean value) {
        this.alphabeticCharsRequired = value;
    }

    /**
     * Gets the value of the alphabeticCharsInMixedCaseRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAlphabeticCharsInMixedCaseRequired() {
        if (alphabeticCharsInMixedCaseRequired == null) {
            return false;
        } else {
            return alphabeticCharsInMixedCaseRequired;
        }
    }

    /**
     * Sets the value of the alphabeticCharsInMixedCaseRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlphabeticCharsInMixedCaseRequired(Boolean value) {
        this.alphabeticCharsInMixedCaseRequired = value;
    }

    /**
     * Gets the value of the numericCharsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNumericCharsRequired() {
        if (numericCharsRequired == null) {
            return false;
        } else {
            return numericCharsRequired;
        }
    }

    /**
     * Sets the value of the numericCharsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumericCharsRequired(Boolean value) {
        this.numericCharsRequired = value;
    }

    /**
     * Gets the value of the specialCharsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSpecialCharsRequired() {
        if (specialCharsRequired == null) {
            return false;
        } else {
            return specialCharsRequired;
        }
    }

    /**
     * Sets the value of the specialCharsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialCharsRequired(Boolean value) {
        this.specialCharsRequired = value;
    }

    /**
     * Gets the value of the pwdMustDifferFromName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPwdMustDifferFromName() {
        if (pwdMustDifferFromName == null) {
            return false;
        } else {
            return pwdMustDifferFromName;
        }
    }

    /**
     * Sets the value of the pwdMustDifferFromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPwdMustDifferFromName(Boolean value) {
        this.pwdMustDifferFromName = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    public static class BlackList {

        @XmlElement(name = "Item")
        protected List<String> item;

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
        public List<String> getItem() {
            if (item == null) {
                item = new ArrayList<String>();
            }
            return this.item;
        }

    }

}
