
package org.radixware.schemas.cfgmanagement_impexp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Snapshot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Snapshot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ApplyScript" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Record" type="{http://schemas.radixware.org/cfgManagement-impExp.xsd}SnapshotRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SrcEnv" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="SrcTimestamp" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="SrcAppVer" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Snapshot", propOrder = {
    "notes",
    "applyScript",
    "record"
})
public class Snapshot {

    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "ApplyScript")
    protected String applyScript;
    @XmlElement(name = "Record")
    protected List<SnapshotRecord> record;
    @XmlAttribute(name = "SrcEnv", required = true)
    protected String srcEnv;
    @XmlAttribute(name = "SrcTimestamp", required = true)
    protected XMLGregorianCalendar srcTimestamp;
    @XmlAttribute(name = "Title")
    protected String title;
    @XmlAttribute(name = "SrcAppVer")
    protected String srcAppVer;

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
     * Gets the value of the applyScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyScript() {
        return applyScript;
    }

    /**
     * Sets the value of the applyScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyScript(String value) {
        this.applyScript = value;
    }

    /**
     * Gets the value of the record property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the record property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SnapshotRecord }
     * 
     * 
     */
    public List<SnapshotRecord> getRecord() {
        if (record == null) {
            record = new ArrayList<SnapshotRecord>();
        }
        return this.record;
    }

    /**
     * Gets the value of the srcEnv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcEnv() {
        return srcEnv;
    }

    /**
     * Sets the value of the srcEnv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcEnv(String value) {
        this.srcEnv = value;
    }

    /**
     * Gets the value of the srcTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSrcTimestamp() {
        return srcTimestamp;
    }

    /**
     * Sets the value of the srcTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSrcTimestamp(XMLGregorianCalendar value) {
        this.srcTimestamp = value;
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
     * Gets the value of the srcAppVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcAppVer() {
        return srcAppVer;
    }

    /**
     * Sets the value of the srcAppVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcAppVer(String value) {
        this.srcAppVer = value;
    }

}
