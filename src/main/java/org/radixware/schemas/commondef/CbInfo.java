
package org.radixware.schemas.commondef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CbInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DecoderClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DecoderMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DefinitionXmlClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ExtInfo" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CbInfo", propOrder = {
    "decoderClass",
    "decoderMethod",
    "definitionXmlClass",
    "definition",
    "extInfo"
})
public class CbInfo {

    @XmlElement(name = "DecoderClass", required = true)
    protected String decoderClass;
    @XmlElement(name = "DecoderMethod", required = true)
    protected String decoderMethod;
    @XmlElement(name = "DefinitionXmlClass", required = true)
    protected String definitionXmlClass;
    @XmlElement(name = "Definition", required = true)
    protected Object definition;
    @XmlElement(name = "ExtInfo", required = true)
    protected Object extInfo;

    /**
     * Gets the value of the decoderClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecoderClass() {
        return decoderClass;
    }

    /**
     * Sets the value of the decoderClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecoderClass(String value) {
        this.decoderClass = value;
    }

    /**
     * Gets the value of the decoderMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecoderMethod() {
        return decoderMethod;
    }

    /**
     * Sets the value of the decoderMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecoderMethod(String value) {
        this.decoderMethod = value;
    }

    /**
     * Gets the value of the definitionXmlClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinitionXmlClass() {
        return definitionXmlClass;
    }

    /**
     * Sets the value of the definitionXmlClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinitionXmlClass(String value) {
        this.definitionXmlClass = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDefinition(Object value) {
        this.definition = value;
    }

    /**
     * Gets the value of the extInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtInfo() {
        return extInfo;
    }

    /**
     * Sets the value of the extInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtInfo(Object value) {
        this.extInfo = value;
    }

}
