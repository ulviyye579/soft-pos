
package com.tranzaxis.schemas.common_types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Val" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *           &lt;element name="XmlVal" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *           &lt;element name="Params" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *           &lt;element name="ArrParams" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;extension base="{http://schemas.tranzaxis.com/common-types.xsd}ArrParams"&gt;
 *                 &lt;/extension&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Rid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamValue", propOrder = {
    "val",
    "xmlVal",
    "params",
    "arrParams",
    "title"
})
public class ParamValue {

    @XmlElementRef(name = "Val", namespace = "http://schemas.tranzaxis.com/common-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> val;
    @XmlElementRef(name = "XmlVal", namespace = "http://schemas.tranzaxis.com/common-types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> xmlVal;
    @XmlElement(name = "Params")
    protected ParamValues params;
    @XmlElement(name = "ArrParams")
    protected ParamValue.ArrParams arrParams;
    @XmlElement(name = "Title")
    protected String title;
    @XmlAttribute(name = "Rid", required = true)
    protected String rid;

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVal(JAXBElement<String> value) {
        this.val = value;
    }

    /**
     * Gets the value of the xmlVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getXmlVal() {
        return xmlVal;
    }

    /**
     * Sets the value of the xmlVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setXmlVal(JAXBElement<Object> value) {
        this.xmlVal = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link ParamValues }
     *     
     */
    public ParamValues getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamValues }
     *     
     */
    public void setParams(ParamValues value) {
        this.params = value;
    }

    /**
     * Gets the value of the arrParams property.
     * 
     * @return
     *     possible object is
     *     {@link ParamValue.ArrParams }
     *     
     */
    public ParamValue.ArrParams getArrParams() {
        return arrParams;
    }

    /**
     * Sets the value of the arrParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamValue.ArrParams }
     *     
     */
    public void setArrParams(ParamValue.ArrParams value) {
        this.arrParams = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://schemas.tranzaxis.com/common-types.xsd}ArrParams"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ArrParams
        extends com.tranzaxis.schemas.common_types.ArrParams
    {


    }

}
