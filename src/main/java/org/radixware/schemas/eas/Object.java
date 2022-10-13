
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Object complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Object"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *         &lt;element name="Properties" type="{http://schemas.radixware.org/eas.xsd}PropertyList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PID" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
 *       &lt;attribute name="SrcPID" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
 *       &lt;attribute name="ClassId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="RowStyle"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
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
@XmlType(name = "Object", propOrder = {
    "title",
    "properties"
})
@XmlSeeAlso({
    PresentableObject.class,
    org.radixware.schemas.eas.SetParentRq.CurrentData.class,
    org.radixware.schemas.eas.CommandRq.CurrentData.class
})
public class Object {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Properties")
    protected PropertyList properties;
    @XmlAttribute(name = "PID")
    protected String pid;
    @XmlAttribute(name = "SrcPID")
    protected String srcPID;
    @XmlAttribute(name = "ClassId")
    protected String classId;
    @XmlAttribute(name = "RowStyle")
    protected String rowStyle;

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
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyList }
     *     
     */
    public PropertyList getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyList }
     *     
     */
    public void setProperties(PropertyList value) {
        this.properties = value;
    }

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPID() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPID(String value) {
        this.pid = value;
    }

    /**
     * Gets the value of the srcPID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcPID() {
        return srcPID;
    }

    /**
     * Sets the value of the srcPID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcPID(String value) {
        this.srcPID = value;
    }

    /**
     * Gets the value of the classId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassId(String value) {
        this.classId = value;
    }

    /**
     * Gets the value of the rowStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowStyle() {
        return rowStyle;
    }

    /**
     * Sets the value of the rowStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowStyle(String value) {
        this.rowStyle = value;
    }

}
