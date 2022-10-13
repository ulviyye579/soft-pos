
package org.radixware.schemas.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.commondef.ChangeLog;
import org.radixware.schemas.xscml.TypeDeclaration;


/**
 * <p>Java class for UserReportHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserReportHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContextParamType" type="{http://schemas.radixware.org/xscml.xsd}TypeDeclaration" minOccurs="0"/&gt;
 *         &lt;element name="ChangeLog" type="{http://schemas.radixware.org/commondef.xsd}ChangeLog" minOccurs="0"/&gt;
 *         &lt;element name="Definition" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="LastRuntimeId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="CurrentVersion" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="CurrentOrder" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="FormatVersion" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserReportHeader", propOrder = {
    "name",
    "description",
    "contextParamType",
    "changeLog",
    "definition"
})
public class UserReportHeader {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ContextParamType")
    protected TypeDeclaration contextParamType;
    @XmlElement(name = "ChangeLog")
    protected ChangeLog changeLog;
    @XmlElement(name = "Definition")
    protected Object definition;
    @XmlAttribute(name = "Id")
    protected String id;
    @XmlAttribute(name = "LastRuntimeId")
    protected String lastRuntimeId;
    @XmlAttribute(name = "CurrentVersion")
    protected Long currentVersion;
    @XmlAttribute(name = "CurrentOrder")
    protected Long currentOrder;
    @XmlAttribute(name = "FormatVersion")
    protected Long formatVersion;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the contextParamType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDeclaration }
     *     
     */
    public TypeDeclaration getContextParamType() {
        return contextParamType;
    }

    /**
     * Sets the value of the contextParamType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDeclaration }
     *     
     */
    public void setContextParamType(TypeDeclaration value) {
        this.contextParamType = value;
    }

    /**
     * Gets the value of the changeLog property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeLog }
     *     
     */
    public ChangeLog getChangeLog() {
        return changeLog;
    }

    /**
     * Sets the value of the changeLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeLog }
     *     
     */
    public void setChangeLog(ChangeLog value) {
        this.changeLog = value;
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
     * Gets the value of the lastRuntimeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRuntimeId() {
        return lastRuntimeId;
    }

    /**
     * Sets the value of the lastRuntimeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRuntimeId(String value) {
        this.lastRuntimeId = value;
    }

    /**
     * Gets the value of the currentVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentVersion() {
        return currentVersion;
    }

    /**
     * Sets the value of the currentVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentVersion(Long value) {
        this.currentVersion = value;
    }

    /**
     * Gets the value of the currentOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentOrder() {
        return currentOrder;
    }

    /**
     * Sets the value of the currentOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentOrder(Long value) {
        this.currentOrder = value;
    }

    /**
     * Gets the value of the formatVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFormatVersion() {
        return formatVersion;
    }

    /**
     * Sets the value of the formatVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFormatVersion(Long value) {
        this.formatVersion = value;
    }

}
