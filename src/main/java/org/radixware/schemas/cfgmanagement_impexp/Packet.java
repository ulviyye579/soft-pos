
package org.radixware.schemas.cfgmanagement_impexp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Packet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Packet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="SegmentTitle" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="SegmentVendor" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="SegmentDesc" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="DependenciesList" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Item" type="{http://schemas.radixware.org/cfgManagement-impExp.xsd}Item" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="DbUrl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AppVer" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ExpUser" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ExpTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="FileName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="SegmentGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Version" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="PrevVersion" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ParentVersion" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ReleaseTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="AllReleases" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="MinAppVerUri" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="MinAppVer" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Hotfix" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Packet", propOrder = {
    "title",
    "notes",
    "segmentTitle",
    "segmentVendor",
    "segmentDesc",
    "dependenciesList",
    "item"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.tran.Request.Specific.ImportCfgPacket.class,
    com.tranzaxis.schemas.tran.InquiryResponse.CfgPackets.Packet.class
})
public class Packet {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "SegmentTitle")
    protected String segmentTitle;
    @XmlElement(name = "SegmentVendor")
    protected String segmentVendor;
    @XmlElement(name = "SegmentDesc")
    protected String segmentDesc;
    @XmlElement(name = "DependenciesList")
    protected String dependenciesList;
    @XmlElement(name = "Item")
    protected List<Item> item;
    @XmlAttribute(name = "Id", required = true)
    protected long id;
    @XmlAttribute(name = "DbUrl")
    protected String dbUrl;
    @XmlAttribute(name = "AppVer")
    protected String appVer;
    @XmlAttribute(name = "ExpUser")
    protected String expUser;
    @XmlAttribute(name = "ExpTime")
    protected XMLGregorianCalendar expTime;
    @XmlAttribute(name = "FileName")
    protected String fileName;
    @XmlAttribute(name = "SegmentGuid")
    protected String segmentGuid;
    @XmlAttribute(name = "Version")
    protected Long version;
    @XmlAttribute(name = "PrevVersion")
    protected String prevVersion;
    @XmlAttribute(name = "ParentVersion")
    protected String parentVersion;
    @XmlAttribute(name = "ReleaseTime")
    protected XMLGregorianCalendar releaseTime;
    @XmlAttribute(name = "AllReleases")
    protected Boolean allReleases;
    @XmlAttribute(name = "MinAppVerUri")
    protected String minAppVerUri;
    @XmlAttribute(name = "MinAppVer")
    protected String minAppVer;
    @XmlAttribute(name = "Hotfix")
    protected Boolean hotfix;

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
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the segmentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentTitle() {
        return segmentTitle;
    }

    /**
     * Sets the value of the segmentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentTitle(String value) {
        this.segmentTitle = value;
    }

    /**
     * Gets the value of the segmentVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentVendor() {
        return segmentVendor;
    }

    /**
     * Sets the value of the segmentVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentVendor(String value) {
        this.segmentVendor = value;
    }

    /**
     * Gets the value of the segmentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentDesc() {
        return segmentDesc;
    }

    /**
     * Sets the value of the segmentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentDesc(String value) {
        this.segmentDesc = value;
    }

    /**
     * Gets the value of the dependenciesList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependenciesList() {
        return dependenciesList;
    }

    /**
     * Sets the value of the dependenciesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependenciesList(String value) {
        this.dependenciesList = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the dbUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbUrl() {
        return dbUrl;
    }

    /**
     * Sets the value of the dbUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbUrl(String value) {
        this.dbUrl = value;
    }

    /**
     * Gets the value of the appVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppVer() {
        return appVer;
    }

    /**
     * Sets the value of the appVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppVer(String value) {
        this.appVer = value;
    }

    /**
     * Gets the value of the expUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpUser() {
        return expUser;
    }

    /**
     * Sets the value of the expUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpUser(String value) {
        this.expUser = value;
    }

    /**
     * Gets the value of the expTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpTime() {
        return expTime;
    }

    /**
     * Sets the value of the expTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpTime(XMLGregorianCalendar value) {
        this.expTime = value;
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
     * Gets the value of the segmentGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentGuid() {
        return segmentGuid;
    }

    /**
     * Sets the value of the segmentGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentGuid(String value) {
        this.segmentGuid = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersion(Long value) {
        this.version = value;
    }

    /**
     * Gets the value of the prevVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevVersion() {
        return prevVersion;
    }

    /**
     * Sets the value of the prevVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevVersion(String value) {
        this.prevVersion = value;
    }

    /**
     * Gets the value of the parentVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentVersion() {
        return parentVersion;
    }

    /**
     * Sets the value of the parentVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentVersion(String value) {
        this.parentVersion = value;
    }

    /**
     * Gets the value of the releaseTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleaseTime() {
        return releaseTime;
    }

    /**
     * Sets the value of the releaseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseTime(XMLGregorianCalendar value) {
        this.releaseTime = value;
    }

    /**
     * Gets the value of the allReleases property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllReleases() {
        return allReleases;
    }

    /**
     * Sets the value of the allReleases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllReleases(Boolean value) {
        this.allReleases = value;
    }

    /**
     * Gets the value of the minAppVerUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinAppVerUri() {
        return minAppVerUri;
    }

    /**
     * Sets the value of the minAppVerUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinAppVerUri(String value) {
        this.minAppVerUri = value;
    }

    /**
     * Gets the value of the minAppVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinAppVer() {
        return minAppVer;
    }

    /**
     * Sets the value of the minAppVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinAppVer(String value) {
        this.minAppVer = value;
    }

    /**
     * Gets the value of the hotfix property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHotfix() {
        return hotfix;
    }

    /**
     * Sets the value of the hotfix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHotfix(Boolean value) {
        this.hotfix = value;
    }

}
