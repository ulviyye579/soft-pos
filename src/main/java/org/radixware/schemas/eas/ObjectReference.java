
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *           &lt;element name="BrokenRef" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="TableId" type="{http://schemas.radixware.org/types.xsd}Id"/&gt;
 *           &lt;element name="ClassId" type="{http://schemas.radixware.org/types.xsd}Id"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PID" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
 *       &lt;attribute name="AllowedActionsBitMask" type="{http://www.w3.org/2001/XMLSchema}int" default="15" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectReference", propOrder = {
    "title",
    "brokenRef",
    "tableId",
    "classId"
})
@XmlSeeAlso({
    org.radixware.schemas.eas.ParentModelInfo.EntityObjectInfo.class
})
public class ObjectReference {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "BrokenRef")
    protected String brokenRef;
    @XmlElement(name = "TableId")
    protected String tableId;
    @XmlElement(name = "ClassId")
    protected String classId;
    @XmlAttribute(name = "PID")
    protected String pid;
    @XmlAttribute(name = "AllowedActionsBitMask")
    protected Integer allowedActionsBitMask;

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
     * Gets the value of the brokenRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokenRef() {
        return brokenRef;
    }

    /**
     * Sets the value of the brokenRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokenRef(String value) {
        this.brokenRef = value;
    }

    /**
     * Gets the value of the tableId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableId() {
        return tableId;
    }

    /**
     * Sets the value of the tableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableId(String value) {
        this.tableId = value;
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
     * Gets the value of the allowedActionsBitMask property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getAllowedActionsBitMask() {
        if (allowedActionsBitMask == null) {
            return  15;
        } else {
            return allowedActionsBitMask;
        }
    }

    /**
     * Sets the value of the allowedActionsBitMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAllowedActionsBitMask(Integer value) {
        this.allowedActionsBitMask = value;
    }

}
