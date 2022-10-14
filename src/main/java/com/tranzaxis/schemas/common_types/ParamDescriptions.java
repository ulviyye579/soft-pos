
package com.tranzaxis.schemas.common_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamDescriptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamDescriptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParamDescription" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="undescribedVisible" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *       &lt;attribute name="undescribedGroup" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Replace" type="{http://schemas.radixware.org/types.xsd}Bool" default="true" /&gt;
 *       &lt;attribute name="InheritanceLevel" type="{http://schemas.radixware.org/types.xsd}Int" default="1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamDescriptions", propOrder = {
    "paramDescription"
})
public class ParamDescriptions {

    @XmlElement(name = "ParamDescription")
    protected List<ParamDescription> paramDescription;
    @XmlAttribute(name = "undescribedVisible")
    protected Boolean undescribedVisible;
    @XmlAttribute(name = "undescribedGroup")
    protected String undescribedGroup;
    @XmlAttribute(name = "Replace")
    protected Boolean replace;
    @XmlAttribute(name = "InheritanceLevel")
    protected Long inheritanceLevel;

    /**
     * Gets the value of the paramDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paramDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParamDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamDescription }
     * 
     * 
     */
    public List<ParamDescription> getParamDescription() {
        if (paramDescription == null) {
            paramDescription = new ArrayList<ParamDescription>();
        }
        return this.paramDescription;
    }

    /**
     * Gets the value of the undescribedVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUndescribedVisible() {
        if (undescribedVisible == null) {
            return false;
        } else {
            return undescribedVisible;
        }
    }

    /**
     * Sets the value of the undescribedVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUndescribedVisible(Boolean value) {
        this.undescribedVisible = value;
    }

    /**
     * Gets the value of the undescribedGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndescribedGroup() {
        return undescribedGroup;
    }

    /**
     * Sets the value of the undescribedGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndescribedGroup(String value) {
        this.undescribedGroup = value;
    }

    /**
     * Gets the value of the replace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReplace() {
        if (replace == null) {
            return true;
        } else {
            return replace;
        }
    }

    /**
     * Sets the value of the replace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplace(Boolean value) {
        this.replace = value;
    }

    /**
     * Gets the value of the inheritanceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getInheritanceLevel() {
        if (inheritanceLevel == null) {
            return  1L;
        } else {
            return inheritanceLevel;
        }
    }

    /**
     * Sets the value of the inheritanceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInheritanceLevel(Long value) {
        this.inheritanceLevel = value;
    }

}
