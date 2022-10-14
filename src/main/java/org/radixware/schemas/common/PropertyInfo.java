
package org.radixware.schemas.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Name" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Nature" use="required" type="{http://schemas.radixware.org/common.xsd}PropNature" /&gt;
 *       &lt;attribute name="ValType" use="required" type="{http://schemas.radixware.org/common.xsd}ValType" /&gt;
 *       &lt;attribute name="Static" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="Access" use="required" type="{http://schemas.radixware.org/common.xsd}Access" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyInfo")
public class PropertyInfo {

    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Nature", required = true)
    protected long nature;
    @XmlAttribute(name = "ValType", required = true)
    protected long valType;
    @XmlAttribute(name = "Static")
    protected Boolean _static;
    @XmlAttribute(name = "Access", required = true)
    protected long access;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nature property.
     * 
     */
    public long getNature() {
        return nature;
    }

    /**
     * Sets the value of the nature property.
     * 
     */
    public void setNature(long value) {
        this.nature = value;
    }

    /**
     * Gets the value of the valType property.
     * 
     */
    public long getValType() {
        return valType;
    }

    /**
     * Sets the value of the valType property.
     * 
     */
    public void setValType(long value) {
        this.valType = value;
    }

    /**
     * Gets the value of the static property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatic() {
        return _static;
    }

    /**
     * Sets the value of the static property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatic(Boolean value) {
        this._static = value;
    }

    /**
     * Gets the value of the access property.
     * 
     */
    public long getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     */
    public void setAccess(long value) {
        this.access = value;
    }

}
