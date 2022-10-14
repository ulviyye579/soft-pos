
package org.radixware.schemas.xscml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocResource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}MmlTagItem"&gt;
 *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ModuleName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LayerUri" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Language"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
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
@XmlType(name = "DocResource")
public class DocResource
    extends MmlTagItem
{

    @XmlAttribute(name = "Title")
    protected String title;
    @XmlAttribute(name = "FileName")
    protected String fileName;
    @XmlAttribute(name = "ModuleName")
    protected String moduleName;
    @XmlAttribute(name = "LayerUri")
    protected String layerUri;
    @XmlAttribute(name = "Language")
    protected String language;

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
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the moduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * Sets the value of the moduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleName(String value) {
        this.moduleName = value;
    }

    /**
     * Gets the value of the layerUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayerUri() {
        return layerUri;
    }

    /**
     * Sets the value of the layerUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayerUri(String value) {
        this.layerUri = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
