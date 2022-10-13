
package org.radixware.schemas.editmask;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditMaskNum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditMaskNum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="MinValue" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="Scale" type="{http://www.w3.org/2001/XMLSchema}long" default="1" /&gt;
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
 *       &lt;attribute name="DecimalDelimeter"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;length value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Precision" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditMaskNum")
public class EditMaskNum {

    @XmlAttribute(name = "MaxValue")
    protected BigDecimal maxValue;
    @XmlAttribute(name = "MinValue")
    protected BigDecimal minValue;
    @XmlAttribute(name = "Scale")
    protected Long scale;
    @XmlAttribute(name = "TriadDelimeterType", required = true)
    protected long triadDelimeterType;
    @XmlAttribute(name = "TriadDelimeter")
    protected String triadDelimeter;
    @XmlAttribute(name = "DecimalDelimeter")
    protected String decimalDelimeter;
    @XmlAttribute(name = "Precision")
    protected Byte precision;

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxValue(BigDecimal value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinValue(BigDecimal value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getScale() {
        if (scale == null) {
            return  1L;
        } else {
            return scale;
        }
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScale(Long value) {
        this.scale = value;
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

    /**
     * Gets the value of the decimalDelimeter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalDelimeter() {
        return decimalDelimeter;
    }

    /**
     * Sets the value of the decimalDelimeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalDelimeter(String value) {
        this.decimalDelimeter = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPrecision(Byte value) {
        this.precision = value;
    }

}
