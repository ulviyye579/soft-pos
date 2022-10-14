
package com.tranzaxis.schemas.contracts_types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.tariffs_admin.TariffIds;


/**
 * <p>Java class for TariffPlanSnapshot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffPlanSnapshot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TariffPlanGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="BaseTariffPlanGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="StartOperDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="FinishOperDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="InheritedTariffs" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}TariffIds" minOccurs="0"/&gt;
 *         &lt;element name="ExcludedTariffs" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}TariffIds" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="IsPersonal" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="InheritAllTariffs" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffPlanSnapshot", propOrder = {
    "tariffPlanGuid",
    "baseTariffPlanGuid",
    "startTime",
    "startOperDay",
    "finishOperDay",
    "inheritedTariffs",
    "excludedTariffs"
})
public class TariffPlanSnapshot {

    @XmlElement(name = "TariffPlanGuid")
    protected String tariffPlanGuid;
    @XmlElement(name = "BaseTariffPlanGuid")
    protected String baseTariffPlanGuid;
    @XmlElementRef(name = "StartTime", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startTime;
    @XmlElement(name = "StartOperDay")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startOperDay;
    @XmlElementRef(name = "FinishOperDay", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> finishOperDay;
    @XmlElementRef(name = "InheritedTariffs", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<TariffIds> inheritedTariffs;
    @XmlElementRef(name = "ExcludedTariffs", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<TariffIds> excludedTariffs;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "IsPersonal")
    protected Boolean isPersonal;
    @XmlAttribute(name = "InheritAllTariffs")
    protected Boolean inheritAllTariffs;

    /**
     * Gets the value of the tariffPlanGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffPlanGuid() {
        return tariffPlanGuid;
    }

    /**
     * Sets the value of the tariffPlanGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffPlanGuid(String value) {
        this.tariffPlanGuid = value;
    }

    /**
     * Gets the value of the baseTariffPlanGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTariffPlanGuid() {
        return baseTariffPlanGuid;
    }

    /**
     * Sets the value of the baseTariffPlanGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTariffPlanGuid(String value) {
        this.baseTariffPlanGuid = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the startOperDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartOperDay() {
        return startOperDay;
    }

    /**
     * Sets the value of the startOperDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartOperDay(XMLGregorianCalendar value) {
        this.startOperDay = value;
    }

    /**
     * Gets the value of the finishOperDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFinishOperDay() {
        return finishOperDay;
    }

    /**
     * Sets the value of the finishOperDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFinishOperDay(JAXBElement<XMLGregorianCalendar> value) {
        this.finishOperDay = value;
    }

    /**
     * Gets the value of the inheritedTariffs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TariffIds }{@code >}
     *     
     */
    public JAXBElement<TariffIds> getInheritedTariffs() {
        return inheritedTariffs;
    }

    /**
     * Sets the value of the inheritedTariffs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TariffIds }{@code >}
     *     
     */
    public void setInheritedTariffs(JAXBElement<TariffIds> value) {
        this.inheritedTariffs = value;
    }

    /**
     * Gets the value of the excludedTariffs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TariffIds }{@code >}
     *     
     */
    public JAXBElement<TariffIds> getExcludedTariffs() {
        return excludedTariffs;
    }

    /**
     * Sets the value of the excludedTariffs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TariffIds }{@code >}
     *     
     */
    public void setExcludedTariffs(JAXBElement<TariffIds> value) {
        this.excludedTariffs = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the isPersonal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPersonal() {
        return isPersonal;
    }

    /**
     * Sets the value of the isPersonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPersonal(Boolean value) {
        this.isPersonal = value;
    }

    /**
     * Gets the value of the inheritAllTariffs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInheritAllTariffs() {
        return inheritAllTariffs;
    }

    /**
     * Sets the value of the inheritAllTariffs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInheritAllTariffs(Boolean value) {
        this.inheritAllTariffs = value;
    }

}
