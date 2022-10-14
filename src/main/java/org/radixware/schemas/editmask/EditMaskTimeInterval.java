
package org.radixware.schemas.editmask;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditMaskTimeInterval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditMaskTimeInterval"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Scale" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="MILLIS"/&gt;
 *             &lt;enumeration value="SECOND"/&gt;
 *             &lt;enumeration value="MINUTE"/&gt;
 *             &lt;enumeration value="HOUR"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Mask" type="{http://www.w3.org/2001/XMLSchema}string" default="d hh:mm::ss" /&gt;
 *       &lt;attribute name="MinValue" type="{http://www.w3.org/2001/XMLSchema}long" default="0" /&gt;
 *       &lt;attribute name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditMaskTimeInterval")
public class EditMaskTimeInterval {

    @XmlAttribute(name = "Scale", required = true)
    protected String scale;
    @XmlAttribute(name = "Mask")
    protected String mask;
    @XmlAttribute(name = "MinValue")
    protected Long minValue;
    @XmlAttribute(name = "MaxValue")
    protected Long maxValue;

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScale(String value) {
        this.scale = value;
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
        if (mask == null) {
            return "d hh:mm::ss";
        } else {
            return mask;
        }
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
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getMinValue() {
        if (minValue == null) {
            return  0L;
        } else {
            return minValue;
        }
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

}
