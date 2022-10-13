
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.InputFormat;


/**
 * <p>Java class for RefineRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefineRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InputFormat" type="{http://schemas.tranzaxis.com/common-types.xsd}InputFormat" minOccurs="0"/&gt;
 *         &lt;element name="XmlData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Kind" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="CustInfo" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="IntData" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Default" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefineRq", propOrder = {
    "inputFormat",
    "xmlData"
})
public class RefineRq {

    @XmlElement(name = "InputFormat")
    protected InputFormat inputFormat;
    @XmlElement(name = "XmlData")
    protected Object xmlData;
    @XmlAttribute(name = "Kind", required = true)
    protected String kind;
    @XmlAttribute(name = "Id")
    protected String id;
    @XmlAttribute(name = "Title")
    protected String title;
    @XmlAttribute(name = "CustInfo")
    protected String custInfo;
    @XmlAttribute(name = "IntData")
    protected String intData;
    @XmlAttribute(name = "Default")
    protected String _default;

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
     * Gets the value of the xmlData property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getXmlData() {
        return xmlData;
    }

    /**
     * Sets the value of the xmlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setXmlData(Object value) {
        this.xmlData = value;
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
     * Gets the value of the custInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustInfo() {
        return custInfo;
    }

    /**
     * Sets the value of the custInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustInfo(String value) {
        this.custInfo = value;
    }

    /**
     * Gets the value of the intData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntData() {
        return intData;
    }

    /**
     * Sets the value of the intData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntData(String value) {
        this.intData = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault(String value) {
        this._default = value;
    }

}
