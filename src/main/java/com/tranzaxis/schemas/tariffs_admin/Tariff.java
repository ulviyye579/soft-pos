
package com.tranzaxis.schemas.tariffs_admin;

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
 * <p>Java class for Tariff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tariff"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tariffs-admin.xsd}TariffId"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="StartDay" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Ver" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}TariffVer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Kind" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}CTariffKind" /&gt;
 *       &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="IsOverride" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="CopyFrom" default="Cur"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *             &lt;enumeration value="Cur"/&gt;
 *             &lt;enumeration value="Last"/&gt;
 *             &lt;enumeration value="Base"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tariff", propOrder = {
    "title",
    "description",
    "startDay",
    "ver"
})
public class Tariff
    extends TariffId
{

    @XmlElement(name = "Title")
    protected String title;
    @XmlElementRef(name = "Description", namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "StartDay", namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDay;
    @XmlElement(name = "Ver")
    protected List<TariffVer> ver;
    @XmlAttribute(name = "Kind")
    protected String kind;
    @XmlAttribute(name = "Ccy")
    protected Long ccy;
    @XmlAttribute(name = "IsOverride")
    protected Boolean isOverride;
    @XmlAttribute(name = "CopyFrom")
    protected String copyFrom;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the startDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDay() {
        return startDay;
    }

    /**
     * Sets the value of the startDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDay(JAXBElement<XMLGregorianCalendar> value) {
        this.startDay = value;
    }

    /**
     * Gets the value of the ver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffVer }
     * 
     * 
     */
    public List<TariffVer> getVer() {
        if (ver == null) {
            ver = new ArrayList<TariffVer>();
        }
        return this.ver;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCcy(Long value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the isOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOverride() {
        return isOverride;
    }

    /**
     * Sets the value of the isOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOverride(Boolean value) {
        this.isOverride = value;
    }

    /**
     * Gets the value of the copyFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyFrom() {
        if (copyFrom == null) {
            return "Cur";
        } else {
            return copyFrom;
        }
    }

    /**
     * Sets the value of the copyFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyFrom(String value) {
        this.copyFrom = value;
    }

}
