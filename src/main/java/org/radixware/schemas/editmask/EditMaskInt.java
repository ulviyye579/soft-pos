
package org.radixware.schemas.editmask;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditMaskInt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditMaskInt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="NumberBase" type="{http://www.w3.org/2001/XMLSchema}byte" default="10" /&gt;
 *       &lt;attribute name="MinLength" type="{http://www.w3.org/2001/XMLSchema}byte" default="0" /&gt;
 *       &lt;attribute name="PadChar" default="0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;length value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="MinValue" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="StepSize" type="{http://www.w3.org/2001/XMLSchema}long" default="1" /&gt;
 *       &lt;attribute name="TriadDelimeterType" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="TriadDelimeter"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;length value="1"/&gt;
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
@XmlType(name = "EditMaskInt")
public class EditMaskInt {

    @XmlAttribute(name = "NumberBase")
    protected Byte numberBase;
    @XmlAttribute(name = "MinLength")
    protected Byte minLength;
    @XmlAttribute(name = "PadChar")
    protected String padChar;
    @XmlAttribute(name = "MinValue")
    protected Long minValue;
    @XmlAttribute(name = "MaxValue")
    protected Long maxValue;
    @XmlAttribute(name = "StepSize")
    protected Long stepSize;
    @XmlAttribute(name = "TriadDelimeterType", required = true)
    protected long triadDelimeterType;
    @XmlAttribute(name = "TriadDelimeter")
    protected String triadDelimeter;

    /**
     * Gets the value of the numberBase property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public byte getNumberBase() {
        if (numberBase == null) {
            return ((byte) 10);
        } else {
            return numberBase;
        }
    }

    /**
     * Sets the value of the numberBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setNumberBase(Byte value) {
        this.numberBase = value;
    }

    /**
     * Gets the value of the minLength property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public byte getMinLength() {
        if (minLength == null) {
            return ((byte) 0);
        } else {
            return minLength;
        }
    }

    /**
     * Sets the value of the minLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setMinLength(Byte value) {
        this.minLength = value;
    }

    /**
     * Gets the value of the padChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadChar() {
        if (padChar == null) {
            return "0";
        } else {
            return padChar;
        }
    }

    /**
     * Sets the value of the padChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadChar(String value) {
        this.padChar = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinValue(Long value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxValue(Long value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the stepSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getStepSize() {
        if (stepSize == null) {
            return  1L;
        } else {
            return stepSize;
        }
    }

    /**
     * Sets the value of the stepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStepSize(Long value) {
        this.stepSize = value;
    }

    /**
     * Gets the value of the triadDelimeterType property.
     * 
     */
    public long getTriadDelimeterType() {
        return triadDelimeterType;
    }

    /**
     * Sets the value of the triadDelimeterType property.
     * 
     */
    public void setTriadDelimeterType(long value) {
        this.triadDelimeterType = value;
    }

    /**
     * Gets the value of the triadDelimeter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriadDelimeter() {
        return triadDelimeter;
    }

    /**
     * Sets the value of the triadDelimeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriadDelimeter(String value) {
        this.triadDelimeter = value;
    }

}
