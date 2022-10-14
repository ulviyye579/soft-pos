
package org.radixware.schemas.editmask;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EditMaskDateTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditMaskDateTime"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="DateStyle" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="TimeStyle" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Mask" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MinValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditMaskDateTime")
public class EditMaskDateTime {

    @XmlAttribute(name = "DateStyle", required = true)
    protected long dateStyle;
    @XmlAttribute(name = "TimeStyle", required = true)
    protected long timeStyle;
    @XmlAttribute(name = "Mask")
    protected String mask;
    @XmlAttribute(name = "MinValue")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minValue;
    @XmlAttribute(name = "MaxValue")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxValue;

    /**
     * Gets the value of the dateStyle property.
     * 
     */
    public long getDateStyle() {
        return dateStyle;
    }

    /**
     * Sets the value of the dateStyle property.
     * 
     */
    public void setDateStyle(long value) {
        this.dateStyle = value;
    }

    /**
     * Gets the value of the timeStyle property.
     * 
     */
    public long getTimeStyle() {
        return timeStyle;
    }

    /**
     * Sets the value of the timeStyle property.
     * 
     */
    public void setTimeStyle(long value) {
        this.timeStyle = value;
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
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinValue(XMLGregorianCalendar value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxValue(XMLGregorianCalendar value) {
        this.maxValue = value;
    }

}
