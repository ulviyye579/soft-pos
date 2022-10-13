
package org.radixware.schemas.editmask;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditMaskStr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditMaskStr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ValidatorType" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MinValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Precision" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="CaseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="Mask" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsPassword" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="NoBlankCharacter" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="MaxLength" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="KeepSeparators" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="AllowEmptyString" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditMaskStr")
public class EditMaskStr {

    @XmlAttribute(name = "ValidatorType")
    protected Integer validatorType;
    @XmlAttribute(name = "MaxValue")
    protected String maxValue;
    @XmlAttribute(name = "MinValue")
    protected String minValue;
    @XmlAttribute(name = "Precision")
    protected Integer precision;
    @XmlAttribute(name = "CaseSensitive")
    protected Boolean caseSensitive;
    @XmlAttribute(name = "Mask")
    protected String mask;
    @XmlAttribute(name = "IsPassword")
    protected Boolean isPassword;
    @XmlAttribute(name = "NoBlankCharacter")
    protected Boolean noBlankCharacter;
    @XmlAttribute(name = "MaxLength")
    protected Integer maxLength;
    @XmlAttribute(name = "KeepSeparators")
    protected Boolean keepSeparators;
    @XmlAttribute(name = "AllowEmptyString")
    protected Boolean allowEmptyString;

    /**
     * Gets the value of the validatorType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValidatorType() {
        return validatorType;
    }

    /**
     * Sets the value of the validatorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValidatorType(Integer value) {
        this.validatorType = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxValue(String value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinValue(String value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrecision(Integer value) {
        this.precision = value;
    }

    /**
     * Gets the value of the caseSensitive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCaseSensitive() {
        if (caseSensitive == null) {
            return true;
        } else {
            return caseSensitive;
        }
    }

    /**
     * Sets the value of the caseSensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaseSensitive(Boolean value) {
        this.caseSensitive = value;
    }

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * Gets the value of the isPassword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsPassword() {
        if (isPassword == null) {
            return false;
        } else {
            return isPassword;
        }
    }

    /**
     * Sets the value of the isPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPassword(Boolean value) {
        this.isPassword = value;
    }

    /**
     * Gets the value of the noBlankCharacter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNoBlankCharacter() {
        if (noBlankCharacter == null) {
            return false;
        } else {
            return noBlankCharacter;
        }
    }

    /**
     * Sets the value of the noBlankCharacter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoBlankCharacter(Boolean value) {
        this.noBlankCharacter = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxLength() {
        if (maxLength == null) {
            return  0;
        } else {
            return maxLength;
        }
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLength(Integer value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the keepSeparators property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isKeepSeparators() {
        if (keepSeparators == null) {
            return true;
        } else {
            return keepSeparators;
        }
    }

    /**
     * Sets the value of the keepSeparators property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepSeparators(Boolean value) {
        this.keepSeparators = value;
    }

    /**
     * Gets the value of the allowEmptyString property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowEmptyString() {
        if (allowEmptyString == null) {
            return true;
        } else {
            return allowEmptyString;
        }
    }

    /**
     * Sets the value of the allowEmptyString property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowEmptyString(Boolean value) {
        this.allowEmptyString = value;
    }

}
