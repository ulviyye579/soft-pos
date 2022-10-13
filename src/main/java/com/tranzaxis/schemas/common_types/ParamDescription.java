
package com.tranzaxis.schemas.common_types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InputFormat" type="{http://schemas.tranzaxis.com/common-types.xsd}InputFormat" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="InitialValue" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Group" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Struct" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamDescriptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Rid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Seq" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="IsHidden" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="InheritanceSeq" type="{http://schemas.radixware.org/types.xsd}Str" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamDescription", propOrder = {
    "inputFormat",
    "description",
    "title",
    "value",
    "initialValue",
    "group",
    "struct"
})
public class ParamDescription {

    @XmlElement(name = "InputFormat")
    protected InputFormat inputFormat;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElementRef(name = "Value", namespace = "http://schemas.tranzaxis.com/common-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> value;
    @XmlElementRef(name = "InitialValue", namespace = "http://schemas.tranzaxis.com/common-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> initialValue;
    @XmlElement(name = "Group")
    protected String group;
    @XmlElement(name = "Struct")
    protected ParamDescriptions struct;
    @XmlAttribute(name = "Rid", required = true)
    protected String rid;
    @XmlAttribute(name = "Seq")
    protected Long seq;
    @XmlAttribute(name = "IsHidden")
    protected Boolean isHidden;
    @XmlAttribute(name = "InheritanceSeq")
    protected String inheritanceSeq;

    /**
     * Gets the value of the inputFormat property.
     * 
     * @return
     *     possible object is
     *     {@link InputFormat }
     *     
     */
    public InputFormat getInputFormat() {
        return inputFormat;
    }

    /**
     * Sets the value of the inputFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputFormat }
     *     
     */
    public void setInputFormat(InputFormat value) {
        this.inputFormat = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValue(JAXBElement<String> value) {
        this.value = value;
    }

    /**
     * Gets the value of the initialValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInitialValue() {
        return initialValue;
    }

    /**
     * Sets the value of the initialValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInitialValue(JAXBElement<String> value) {
        this.initialValue = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the struct property.
     * 
     * @return
     *     possible object is
     *     {@link ParamDescriptions }
     *     
     */
    public ParamDescriptions getStruct() {
        return struct;
    }

    /**
     * Sets the value of the struct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamDescriptions }
     *     
     */
    public void setStruct(ParamDescriptions value) {
        this.struct = value;
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
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeq(Long value) {
        this.seq = value;
    }

    /**
     * Gets the value of the isHidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Sets the value of the isHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHidden(Boolean value) {
        this.isHidden = value;
    }

    /**
     * Gets the value of the inheritanceSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInheritanceSeq() {
        if (inheritanceSeq == null) {
            return "0";
        } else {
            return inheritanceSeq;
        }
    }

    /**
     * Sets the value of the inheritanceSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInheritanceSeq(String value) {
        this.inheritanceSeq = value;
    }

}
