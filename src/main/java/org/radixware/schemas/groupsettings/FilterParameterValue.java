
package org.radixware.schemas.groupsettings;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterParameterValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterParameterValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValueAsStr" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ParamId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="ValAsStr" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
 *       &lt;attribute name="Type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="EditorPresentationId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterParameterValue", propOrder = {
    "valueAsStr"
})
public class FilterParameterValue {

    @XmlElementRef(name = "ValueAsStr", namespace = "http://schemas.radixware.org/groupsettings.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valueAsStr;
    @XmlAttribute(name = "ParamId", required = true)
    protected String paramId;
    @XmlAttribute(name = "ValAsStr")
    protected String valAsStr;
    @XmlAttribute(name = "Type", required = true)
    protected long type;
    @XmlAttribute(name = "EditorPresentationId")
    protected String editorPresentationId;

    /**
     * Gets the value of the valueAsStr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValueAsStr() {
        return valueAsStr;
    }

    /**
     * Sets the value of the valueAsStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValueAsStr(JAXBElement<String> value) {
        this.valueAsStr = value;
    }

    /**
     * Gets the value of the paramId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamId() {
        return paramId;
    }

    /**
     * Sets the value of the paramId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamId(String value) {
        this.paramId = value;
    }

    /**
     * Gets the value of the valAsStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValAsStr() {
        return valAsStr;
    }

    /**
     * Sets the value of the valAsStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValAsStr(String value) {
        this.valAsStr = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public long getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(long value) {
        this.type = value;
    }

    /**
     * Gets the value of the editorPresentationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditorPresentationId() {
        return editorPresentationId;
    }

    /**
     * Sets the value of the editorPresentationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditorPresentationId(String value) {
        this.editorPresentationId = value;
    }

}
