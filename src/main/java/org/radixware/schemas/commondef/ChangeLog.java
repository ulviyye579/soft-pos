
package org.radixware.schemas.commondef;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeLog"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeLogItem" type="{http://schemas.radixware.org/commondef.xsd}ChangeLogItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LocalNotes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeLog", propOrder = {
    "changeLogItem",
    "comments",
    "localNotes"
})
public class ChangeLog {

    @XmlElement(name = "ChangeLogItem")
    protected List<ChangeLogItem> changeLogItem;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "LocalNotes")
    protected String localNotes;

    /**
     * Gets the value of the changeLogItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeLogItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeLogItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeLogItem }
     * 
     * 
     */
    public List<ChangeLogItem> getChangeLogItem() {
        if (changeLogItem == null) {
            changeLogItem = new ArrayList<ChangeLogItem>();
        }
        return this.changeLogItem;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the localNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalNotes() {
        return localNotes;
    }

    /**
     * Sets the value of the localNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalNotes(String value) {
        this.localNotes = value;
    }

}
