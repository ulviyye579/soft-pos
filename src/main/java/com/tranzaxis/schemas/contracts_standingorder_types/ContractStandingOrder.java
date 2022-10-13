
package com.tranzaxis.schemas.contracts_standingorder_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContractStandingOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractStandingOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Params" type="{http://schemas.tranzaxis.com/contracts-standingorder-types.xsd}StandingOrderParams" minOccurs="0"/&gt;
 *         &lt;element name="EndDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ChargedContractId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="PrevOrderId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="NextOrderId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="RetryDuration" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="RetryDays" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ScheduledDay" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="LastExecNumber" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TypeRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="MainContractRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="MainContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="BegDay" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="Status"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ExecPeriodKind"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ExecDayOffset" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="CalendarDays"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="AbortOnNextSchDay" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractStandingOrder", propOrder = {
    "params",
    "endDay",
    "title",
    "chargedContractId",
    "prevOrderId",
    "nextOrderId",
    "address",
    "retryDuration",
    "retryDays"
})
public class ContractStandingOrder {

    @XmlElement(name = "Params")
    protected StandingOrderParams params;
    @XmlElementRef(name = "EndDay", namespace = "http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDay;
    @XmlElementRef(name = "Title", namespace = "http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "ChargedContractId", namespace = "http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> chargedContractId;
    @XmlElementRef(name = "PrevOrderId", namespace = "http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> prevOrderId;
    @XmlElementRef(name = "NextOrderId", namespace = "http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> nextOrderId;
    @XmlElementRef(name = "Address", namespace = "http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address;
    @XmlElementRef(name = "RetryDuration", namespace = "http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> retryDuration;
    @XmlElementRef(name = "RetryDays", namespace = "http://schemas.tranzaxis.com/contracts-standingorder-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> retryDays;
    @XmlAttribute(name = "ContractId")
    protected Long contractId;
    @XmlAttribute(name = "ScheduledDay")
    protected XMLGregorianCalendar scheduledDay;
    @XmlAttribute(name = "LastExecNumber")
    protected Long lastExecNumber;
    @XmlAttribute(name = "TypeRid")
    protected String typeRid;
    @XmlAttribute(name = "TypeId")
    protected Long typeId;
    @XmlAttribute(name = "MainContractRid")
    protected String mainContractRid;
    @XmlAttribute(name = "MainContractId")
    protected Long mainContractId;
    @XmlAttribute(name = "BegDay")
    protected XMLGregorianCalendar begDay;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "ExecPeriodKind")
    protected String execPeriodKind;
    @XmlAttribute(name = "ExecDayOffset")
    protected Long execDayOffset;
    @XmlAttribute(name = "CalendarDays")
    protected List<XMLGregorianCalendar> calendarDays;
    @XmlAttribute(name = "AbortOnNextSchDay")
    protected Boolean abortOnNextSchDay;

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderParams }
     *     
     */
    public StandingOrderParams getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderParams }
     *     
     */
    public void setParams(StandingOrderParams value) {
        this.params = value;
    }

    /**
     * Gets the value of the endDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDay() {
        return endDay;
    }

    /**
     * Sets the value of the endDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDay(JAXBElement<XMLGregorianCalendar> value) {
        this.endDay = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the chargedContractId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getChargedContractId() {
        return chargedContractId;
    }

    /**
     * Sets the value of the chargedContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setChargedContractId(JAXBElement<Long> value) {
        this.chargedContractId = value;
    }

    /**
     * Gets the value of the prevOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrevOrderId() {
        return prevOrderId;
    }

    /**
     * Sets the value of the prevOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrevOrderId(JAXBElement<Long> value) {
        this.prevOrderId = value;
    }

    /**
     * Gets the value of the nextOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNextOrderId() {
        return nextOrderId;
    }

    /**
     * Sets the value of the nextOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNextOrderId(JAXBElement<Long> value) {
        this.nextOrderId = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress(JAXBElement<String> value) {
        this.address = value;
    }

    /**
     * Gets the value of the retryDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRetryDuration() {
        return retryDuration;
    }

    /**
     * Sets the value of the retryDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRetryDuration(JAXBElement<Long> value) {
        this.retryDuration = value;
    }

    /**
     * Gets the value of the retryDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRetryDays() {
        return retryDays;
    }

    /**
     * Sets the value of the retryDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRetryDays(JAXBElement<Long> value) {
        this.retryDays = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractId(Long value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the scheduledDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDay() {
        return scheduledDay;
    }

    /**
     * Sets the value of the scheduledDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDay(XMLGregorianCalendar value) {
        this.scheduledDay = value;
    }

    /**
     * Gets the value of the lastExecNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastExecNumber() {
        return lastExecNumber;
    }

    /**
     * Sets the value of the lastExecNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastExecNumber(Long value) {
        this.lastExecNumber = value;
    }

    /**
     * Gets the value of the typeRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeRid() {
        return typeRid;
    }

    /**
     * Sets the value of the typeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeRid(String value) {
        this.typeRid = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeId(Long value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the mainContractRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainContractRid() {
        return mainContractRid;
    }

    /**
     * Sets the value of the mainContractRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainContractRid(String value) {
        this.mainContractRid = value;
    }

    /**
     * Gets the value of the mainContractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMainContractId() {
        return mainContractId;
    }

    /**
     * Sets the value of the mainContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMainContractId(Long value) {
        this.mainContractId = value;
    }

    /**
     * Gets the value of the begDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBegDay() {
        return begDay;
    }

    /**
     * Sets the value of the begDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBegDay(XMLGregorianCalendar value) {
        this.begDay = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the execPeriodKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecPeriodKind() {
        return execPeriodKind;
    }

    /**
     * Sets the value of the execPeriodKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecPeriodKind(String value) {
        this.execPeriodKind = value;
    }

    /**
     * Gets the value of the execDayOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExecDayOffset() {
        return execDayOffset;
    }

    /**
     * Sets the value of the execDayOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExecDayOffset(Long value) {
        this.execDayOffset = value;
    }

    /**
     * Gets the value of the calendarDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calendarDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalendarDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getCalendarDays() {
        if (calendarDays == null) {
            calendarDays = new ArrayList<XMLGregorianCalendar>();
        }
        return this.calendarDays;
    }

    /**
     * Gets the value of the abortOnNextSchDay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAbortOnNextSchDay() {
        return abortOnNextSchDay;
    }

    /**
     * Sets the value of the abortOnNextSchDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbortOnNextSchDay(Boolean value) {
        this.abortOnNextSchDay = value;
    }

}
