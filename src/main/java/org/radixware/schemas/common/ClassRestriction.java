
package org.radixware.schemas.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassRestriction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassRestriction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuperClass" type="{http://schemas.radixware.org/common.xsd}JavaClass" minOccurs="0"/&gt;
 *         &lt;element name="SkipSuperClass" type="{http://schemas.radixware.org/common.xsd}JavaClass" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ClassTypes"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.radixware.org/common.xsd}ClassType" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Abstract" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="Deprecated" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="Domains"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassRestriction", propOrder = {
    "superClass",
    "skipSuperClass"
})
public class ClassRestriction {

    @XmlElement(name = "SuperClass")
    protected JavaClass superClass;
    @XmlElement(name = "SkipSuperClass")
    protected List<JavaClass> skipSuperClass;
    @XmlAttribute(name = "ClassTypes")
    protected List<Long> classTypes;
    @XmlAttribute(name = "Abstract")
    protected Boolean _abstract;
    @XmlAttribute(name = "Deprecated")
    protected Boolean deprecated;
    @XmlAttribute(name = "Domains")
    protected List<String> domains;

    /**
     * Gets the value of the superClass property.
     * 
     * @return
     *     possible object is
     *     {@link JavaClass }
     *     
     */
    public JavaClass getSuperClass() {
        return superClass;
    }

    /**
     * Sets the value of the superClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JavaClass }
     *     
     */
    public void setSuperClass(JavaClass value) {
        this.superClass = value;
    }

    /**
     * Gets the value of the skipSuperClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skipSuperClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkipSuperClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JavaClass }
     * 
     * 
     */
    public List<JavaClass> getSkipSuperClass() {
        if (skipSuperClass == null) {
            skipSuperClass = new ArrayList<JavaClass>();
        }
        return this.skipSuperClass;
    }

    /**
     * Gets the value of the classTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getClassTypes() {
        if (classTypes == null) {
            classTypes = new ArrayList<Long>();
        }
        return this.classTypes;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbstract(Boolean value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the deprecated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeprecated() {
        return deprecated;
    }

    /**
     * Sets the value of the deprecated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeprecated(Boolean value) {
        this.deprecated = value;
    }

    /**
     * Gets the value of the domains property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domains property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomains().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDomains() {
        if (domains == null) {
            domains = new ArrayList<String>();
        }
        return this.domains;
    }

}
