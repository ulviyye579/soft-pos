
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TimeZone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeZone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LongNameInStdTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LongNameInDlSavingTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShortNameInStdTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShortNameInDlSavingTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OffsetMills" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="DstOffsetMills" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Timestamp" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeZone", propOrder = {
    "id",
    "longNameInStdTime",
    "longNameInDlSavingTime",
    "shortNameInStdTime",
    "shortNameInDlSavingTime"
})
public class TimeZone {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "LongNameInStdTime", required = true)
    protected String longNameInStdTime;
    @XmlElement(name = "LongNameInDlSavingTime", required = true)
    protected String longNameInDlSavingTime;
    @XmlElement(name = "ShortNameInStdTime", required = true)
    protected String shortNameInStdTime;
    @XmlElement(name = "ShortNameInDlSavingTime", required = true)
    protected String shortNameInDlSavingTime;
    @XmlAttribute(name = "OffsetMills", required = true)
    protected int offsetMills;
    @XmlAttribute(name = "DstOffsetMills", required = true)
    protected int dstOffsetMills;
    @XmlAttribute(name = "Timestamp", required = true)
    protected XMLGregorianCalendar timestamp;

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
     * Gets the value of the longNameInStdTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongNameInStdTime() {
        return longNameInStdTime;
    }

    /**
     * Sets the value of the longNameInStdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongNameInStdTime(String value) {
        this.longNameInStdTime = value;
    }

    /**
     * Gets the value of the longNameInDlSavingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongNameInDlSavingTime() {
        return longNameInDlSavingTime;
    }

    /**
     * Sets the value of the longNameInDlSavingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongNameInDlSavingTime(String value) {
        this.longNameInDlSavingTime = value;
    }

    /**
     * Gets the value of the shortNameInStdTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortNameInStdTime() {
        return shortNameInStdTime;
    }

    /**
     * Sets the value of the shortNameInStdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortNameInStdTime(String value) {
        this.shortNameInStdTime = value;
    }

    /**
     * Gets the value of the shortNameInDlSavingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortNameInDlSavingTime() {
        return shortNameInDlSavingTime;
    }

    /**
     * Sets the value of the shortNameInDlSavingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortNameInDlSavingTime(String value) {
        this.shortNameInDlSavingTime = value;
    }

    /**
     * Gets the value of the offsetMills property.
     * 
     */
    public int getOffsetMills() {
        return offsetMills;
    }

    /**
     * Sets the value of the offsetMills property.
     * 
     */
    public void setOffsetMills(int value) {
        this.offsetMills = value;
    }

    /**
     * Gets the value of the dstOffsetMills property.
     * 
     */
    public int getDstOffsetMills() {
        return dstOffsetMills;
    }

    /**
     * Sets the value of the dstOffsetMills property.
     * 
     */
    public void setDstOffsetMills(int value) {
        this.dstOffsetMills = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}
