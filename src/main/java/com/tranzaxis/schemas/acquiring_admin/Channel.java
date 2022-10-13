
package com.tranzaxis.schemas.acquiring_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.ObjectId;


/**
 * <p>Java class for Channel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Channel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Unit" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectId" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Create" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="MaxSessions" type="{http://schemas.radixware.org/types.xsd}Int" default="2" /&gt;
 *       &lt;attribute name="Use" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *       &lt;attribute name="Status" type="{http://schemas.tranzaxis.com/acquiring-admin.xsd}ActivityStatus" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Channel", propOrder = {
    "unit",
    "address",
    "title"
})
public class Channel {

    @XmlElement(name = "Unit")
    protected ObjectId unit;
    @XmlElementRef(name = "Address", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address;
    @XmlElementRef(name = "Title", namespace = "http://schemas.tranzaxis.com/acquiring-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlAttribute(name = "Create")
    protected Boolean create;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "Rid")
    protected String rid;
    @XmlAttribute(name = "MaxSessions")
    protected Long maxSessions;
    @XmlAttribute(name = "Use")
    protected Boolean use;
    @XmlAttribute(name = "Status")
    protected String status;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectId }
     *     
     */
    public ObjectId getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectId }
     *     
     */
    public void setUnit(ObjectId value) {
        this.unit = value;
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
     * Gets the value of the create property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCreate() {
        if (create == null) {
            return false;
        } else {
            return create;
        }
    }

    /**
     * Sets the value of the create property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreate(Boolean value) {
        this.create = value;
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
     * Gets the value of the rid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRid() {
        return rid;
    }

    /**
     * Sets the value of the rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRid(String value) {
        this.rid = value;
    }

    /**
     * Gets the value of the maxSessions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getMaxSessions() {
        if (maxSessions == null) {
            return  2L;
        } else {
            return maxSessions;
        }
    }

    /**
     * Sets the value of the maxSessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxSessions(Long value) {
        this.maxSessions = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUse() {
        if (use == null) {
            return false;
        } else {
            return use;
        }
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUse(Boolean value) {
        this.use = value;
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

}
