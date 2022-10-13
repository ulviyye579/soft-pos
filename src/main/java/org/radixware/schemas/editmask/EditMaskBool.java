
package org.radixware.schemas.editmask;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditMaskBool complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditMaskBool"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TrueValue" type="{http://www.w3.org/2001/XMLSchema}string" default="1" /&gt;
 *       &lt;attribute name="FalseValue" type="{http://www.w3.org/2001/XMLSchema}string" default="0" /&gt;
 *       &lt;attribute name="ValueTitleVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="FalseTitleId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="TrueTitleId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="TitleOwnerId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="TrueTitle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FalseTitle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ValueType"&gt;
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
@XmlType(name = "EditMaskBool")
public class EditMaskBool {

    @XmlAttribute(name = "TrueValue")
    protected String trueValue;
    @XmlAttribute(name = "FalseValue")
    protected String falseValue;
    @XmlAttribute(name = "ValueTitleVisible")
    protected Boolean valueTitleVisible;
    @XmlAttribute(name = "FalseTitleId")
    protected String falseTitleId;
    @XmlAttribute(name = "TrueTitleId")
    protected String trueTitleId;
    @XmlAttribute(name = "TitleOwnerId")
    protected String titleOwnerId;
    @XmlAttribute(name = "TrueTitle")
    protected String trueTitle;
    @XmlAttribute(name = "FalseTitle")
    protected String falseTitle;
    @XmlAttribute(name = "ValueType")
    protected Long valueType;

    /**
     * Gets the value of the trueValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueValue() {
        if (trueValue == null) {
            return "1";
        } else {
            return trueValue;
        }
    }

    /**
     * Sets the value of the trueValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueValue(String value) {
        this.trueValue = value;
    }

    /**
     * Gets the value of the falseValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFalseValue() {
        if (falseValue == null) {
            return "0";
        } else {
            return falseValue;
        }
    }

    /**
     * Sets the value of the falseValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFalseValue(String value) {
        this.falseValue = value;
    }

    /**
     * Gets the value of the valueTitleVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isValueTitleVisible() {
        if (valueTitleVisible == null) {
            return false;
        } else {
            return valueTitleVisible;
        }
    }

    /**
     * Sets the value of the valueTitleVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValueTitleVisible(Boolean value) {
        this.valueTitleVisible = value;
    }

    /**
     * Gets the value of the falseTitleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFalseTitleId() {
        return falseTitleId;
    }

    /**
     * Sets the value of the falseTitleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFalseTitleId(String value) {
        this.falseTitleId = value;
    }

    /**
     * Gets the value of the trueTitleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueTitleId() {
        return trueTitleId;
    }

    /**
     * Sets the value of the trueTitleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueTitleId(String value) {
        this.trueTitleId = value;
    }

    /**
     * Gets the value of the titleOwnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleOwnerId() {
        return titleOwnerId;
    }

    /**
     * Sets the value of the titleOwnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleOwnerId(String value) {
        this.titleOwnerId = value;
    }

    /**
     * Gets the value of the trueTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueTitle() {
        return trueTitle;
    }

    /**
     * Sets the value of the trueTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueTitle(String value) {
        this.trueTitle = value;
    }

    /**
     * Gets the value of the falseTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFalseTitle() {
        return falseTitle;
    }

    /**
     * Sets the value of the falseTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFalseTitle(String value) {
        this.falseTitle = value;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueType(Long value) {
        this.valueType = value;
    }

}
