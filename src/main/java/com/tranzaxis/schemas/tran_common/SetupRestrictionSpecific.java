
package com.tranzaxis.schemas.tran_common;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SetupRestrictionSpecific complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetupRestrictionSpecific"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BegTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="TmpOffBegTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="TmpOffEndTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="TmpMaxVal" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="TmpMaxStartTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="TmpMaxFinishTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RestrictionGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="RestrictionRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="InUse" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="MaxVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetupRestrictionSpecific", propOrder = {
    "begTime",
    "endTime",
    "tmpOffBegTime",
    "tmpOffEndTime",
    "tmpMaxVal",
    "tmpMaxStartTime",
    "tmpMaxFinishTime"
})
public class SetupRestrictionSpecific {

    @XmlElementRef(name = "BegTime", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> begTime;
    @XmlElementRef(name = "EndTime", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endTime;
    @XmlElementRef(name = "TmpOffBegTime", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> tmpOffBegTime;
    @XmlElementRef(name = "TmpOffEndTime", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> tmpOffEndTime;
    @XmlElementRef(name = "TmpMaxVal", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> tmpMaxVal;
    @XmlElementRef(name = "TmpMaxStartTime", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> tmpMaxStartTime;
    @XmlElementRef(name = "TmpMaxFinishTime", namespace = "http://schemas.tranzaxis.com/tran-common.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> tmpMaxFinishTime;
    @XmlAttribute(name = "RestrictionGuid")
    protected String restrictionGuid;
    @XmlAttribute(name = "RestrictionRid")
    protected String restrictionRid;
    @XmlAttribute(name = "InUse")
    protected Boolean inUse;
    @XmlAttribute(name = "MaxVal")
    protected BigDecimal maxVal;

    /**
     * Gets the value of the begTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBegTime() {
        return begTime;
    }

    /**
     * Sets the value of the begTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBegTime(JAXBElement<XMLGregorianCalendar> value) {
        this.begTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndTime(JAXBElement<XMLGregorianCalendar> value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the tmpOffBegTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTmpOffBegTime() {
        return tmpOffBegTime;
    }

    /**
     * Sets the value of the tmpOffBegTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTmpOffBegTime(JAXBElement<XMLGregorianCalendar> value) {
        this.tmpOffBegTime = value;
    }

    /**
     * Gets the value of the tmpOffEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTmpOffEndTime() {
        return tmpOffEndTime;
    }

    /**
     * Sets the value of the tmpOffEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTmpOffEndTime(JAXBElement<XMLGregorianCalendar> value) {
        this.tmpOffEndTime = value;
    }

    /**
     * Gets the value of the tmpMaxVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTmpMaxVal() {
        return tmpMaxVal;
    }

    /**
     * Sets the value of the tmpMaxVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTmpMaxVal(JAXBElement<BigDecimal> value) {
        this.tmpMaxVal = value;
    }

    /**
     * Gets the value of the tmpMaxStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTmpMaxStartTime() {
        return tmpMaxStartTime;
    }

    /**
     * Sets the value of the tmpMaxStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTmpMaxStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.tmpMaxStartTime = value;
    }

    /**
     * Gets the value of the tmpMaxFinishTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTmpMaxFinishTime() {
        return tmpMaxFinishTime;
    }

    /**
     * Sets the value of the tmpMaxFinishTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTmpMaxFinishTime(JAXBElement<XMLGregorianCalendar> value) {
        this.tmpMaxFinishTime = value;
    }

    /**
     * Gets the value of the restrictionGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionGuid() {
        return restrictionGuid;
    }

    /**
     * Sets the value of the restrictionGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionGuid(String value) {
        this.restrictionGuid = value;
    }

    /**
     * Gets the value of the restrictionRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionRid() {
        return restrictionRid;
    }

    /**
     * Sets the value of the restrictionRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionRid(String value) {
        this.restrictionRid = value;
    }

    /**
     * Gets the value of the inUse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInUse() {
        return inUse;
    }

    /**
     * Sets the value of the inUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInUse(Boolean value) {
        this.inUse = value;
    }

    /**
     * Gets the value of the maxVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxVal() {
        return maxVal;
    }

    /**
     * Sets the value of the maxVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxVal(BigDecimal value) {
        this.maxVal = value;
    }

}
