
package com.tranzaxis.schemas.common_types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.common.UserFunc;


/**
 * <p>Java class for BusinessPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessPeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddDays" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="AddMonths" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="AddBusinessDays" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="AdjustHoliday" type="{http://schemas.tranzaxis.com/common-types.xsd}AdjustHolidayVariant" minOccurs="0"/&gt;
 *         &lt;element name="Direction" type="{http://schemas.tranzaxis.com/common-types.xsd}Direction" minOccurs="0"/&gt;
 *         &lt;element name="HolidayCalendarGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="SetDayOfMonth" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="SetDayOfMonthMode" type="{http://schemas.tranzaxis.com/common-types.xsd}OffsetDir" minOccurs="0"/&gt;
 *         &lt;element name="SetDayOfWeek" type="{http://schemas.tranzaxis.com/common-types.xsd}DayOfWeek" minOccurs="0"/&gt;
 *         &lt;element name="CalcFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessPeriod", propOrder = {
    "addDays",
    "addMonths",
    "addBusinessDays",
    "adjustHoliday",
    "direction",
    "holidayCalendarGuid",
    "setDayOfMonth",
    "setDayOfMonthMode",
    "setDayOfWeek",
    "calcFunc"
})
@XmlSeeAlso({
    InheritableBusinessPeriod.class
})
public class BusinessPeriod {

    @XmlElementRef(name = "AddDays", namespace = "http://schemas.tranzaxis.com/common-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> addDays;
    @XmlElementRef(name = "AddMonths", namespace = "http://schemas.tranzaxis.com/common-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> addMonths;
    @XmlElementRef(name = "AddBusinessDays", namespace = "http://schemas.tranzaxis.com/common-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> addBusinessDays;
    @XmlElement(name = "AdjustHoliday")
    protected String adjustHoliday;
    @XmlElement(name = "Direction")
    protected String direction;
    @XmlElementRef(name = "HolidayCalendarGuid", namespace = "http://schemas.tranzaxis.com/common-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> holidayCalendarGuid;
    @XmlElementRef(name = "SetDayOfMonth", namespace = "http://schemas.tranzaxis.com/common-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> setDayOfMonth;
    @XmlElementRef(name = "SetDayOfMonthMode", namespace = "http://schemas.tranzaxis.com/common-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> setDayOfMonthMode;
    @XmlElementRef(name = "SetDayOfWeek", namespace = "http://schemas.tranzaxis.com/common-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> setDayOfWeek;
    @XmlElementRef(name = "CalcFunc", namespace = "http://schemas.tranzaxis.com/common-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserFunc> calcFunc;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;

    /**
     * Gets the value of the addDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAddDays() {
        return addDays;
    }

    /**
     * Sets the value of the addDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAddDays(JAXBElement<Long> value) {
        this.addDays = value;
    }

    /**
     * Gets the value of the addMonths property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAddMonths() {
        return addMonths;
    }

    /**
     * Sets the value of the addMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAddMonths(JAXBElement<Long> value) {
        this.addMonths = value;
    }

    /**
     * Gets the value of the addBusinessDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAddBusinessDays() {
        return addBusinessDays;
    }

    /**
     * Sets the value of the addBusinessDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAddBusinessDays(JAXBElement<Long> value) {
        this.addBusinessDays = value;
    }

    /**
     * Gets the value of the adjustHoliday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustHoliday() {
        return adjustHoliday;
    }

    /**
     * Sets the value of the adjustHoliday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustHoliday(String value) {
        this.adjustHoliday = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the holidayCalendarGuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHolidayCalendarGuid() {
        return holidayCalendarGuid;
    }

    /**
     * Sets the value of the holidayCalendarGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHolidayCalendarGuid(JAXBElement<String> value) {
        this.holidayCalendarGuid = value;
    }

    /**
     * Gets the value of the setDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSetDayOfMonth() {
        return setDayOfMonth;
    }

    /**
     * Sets the value of the setDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSetDayOfMonth(JAXBElement<Long> value) {
        this.setDayOfMonth = value;
    }

    /**
     * Gets the value of the setDayOfMonthMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSetDayOfMonthMode() {
        return setDayOfMonthMode;
    }

    /**
     * Sets the value of the setDayOfMonthMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSetDayOfMonthMode(JAXBElement<Long> value) {
        this.setDayOfMonthMode = value;
    }

    /**
     * Gets the value of the setDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSetDayOfWeek() {
        return setDayOfWeek;
    }

    /**
     * Sets the value of the setDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSetDayOfWeek(JAXBElement<Long> value) {
        this.setDayOfWeek = value;
    }

    /**
     * Gets the value of the calcFunc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public JAXBElement<UserFunc> getCalcFunc() {
        return calcFunc;
    }

    /**
     * Sets the value of the calcFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public void setCalcFunc(JAXBElement<UserFunc> value) {
        this.calcFunc = value;
    }

    /**
     * Gets the value of the toDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToDelete() {
        return toDelete;
    }

    /**
     * Sets the value of the toDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToDelete(Boolean value) {
        this.toDelete = value;
    }

}
