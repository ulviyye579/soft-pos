
package org.radixware.schemas.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.xscml.TypeDeclaration;


/**
 * <p>Java class for MethodInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReturnType" type="{http://schemas.radixware.org/xscml.xsd}TypeDeclaration" minOccurs="0"/&gt;
 *         &lt;element name="Parameter" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Type" type="{http://schemas.radixware.org/xscml.xsd}TypeDeclaration" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Name" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                 &lt;attribute name="ClassName" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Title" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Static" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="Access" use="required" type="{http://schemas.radixware.org/common.xsd}Access" /&gt;
 *       &lt;attribute name="DeclaringClassName" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ReturnClassName" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodInfo", propOrder = {
    "returnType",
    "parameter"
})
public class MethodInfo {

    @XmlElement(name = "ReturnType")
    protected TypeDeclaration returnType;
    @XmlElement(name = "Parameter")
    protected List<MethodInfo.Parameter> parameter;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Title", required = true)
    protected String title;
    @XmlAttribute(name = "Static", required = true)
    protected boolean _static;
    @XmlAttribute(name = "Access", required = true)
    protected long access;
    @XmlAttribute(name = "DeclaringClassName", required = true)
    protected String declaringClassName;
    @XmlAttribute(name = "ReturnClassName", required = true)
    protected String returnClassName;

    /**
     * Gets the value of the returnType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDeclaration }
     *     
     */
    public TypeDeclaration getReturnType() {
        return returnType;
    }

    /**
     * Sets the value of the returnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDeclaration }
     *     
     */
    public void setReturnType(TypeDeclaration value) {
        this.returnType = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MethodInfo.Parameter }
     * 
     * 
     */
    public List<MethodInfo.Parameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<MethodInfo.Parameter>();
        }
        return this.parameter;
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
     * Gets the value of the static property.
     * 
     */
    public boolean isStatic() {
        return _static;
    }

    /**
     * Sets the value of the static property.
     * 
     */
    public void setStatic(boolean value) {
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

    /**
     * Gets the value of the declaringClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclaringClassName() {
        return declaringClassName;
    }

    /**
     * Sets the value of the declaringClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclaringClassName(String value) {
        this.declaringClassName = value;
    }

    /**
     * Gets the value of the returnClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnClassName() {
        return returnClassName;
    }

    /**
     * Sets the value of the returnClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnClassName(String value) {
        this.returnClassName = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Type" type="{http://schemas.radixware.org/xscml.xsd}TypeDeclaration" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Name" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *       &lt;attribute name="ClassName" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "type"
    })
    public static class Parameter {

        @XmlElement(name = "Type")
        protected TypeDeclaration type;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "Id")
        protected String id;
        @XmlAttribute(name = "ClassName", required = true)
        protected String className;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link TypeDeclaration }
         *     
         */
        public TypeDeclaration getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeDeclaration }
         *     
         */
        public void setType(TypeDeclaration value) {
            this.type = value;
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
         * Gets the value of the className property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassName() {
            return className;
        }

        /**
         * Sets the value of the className property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassName(String value) {
            this.className = value;
        }

    }

}
