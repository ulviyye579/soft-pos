
package org.radixware.schemas.editmask;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditMaskDictionary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditMaskDictionary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DictionaryRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ParentDictionaryPid" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="UseDropDownList" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditMaskDictionary", propOrder = {
    "dictionaryRid",
    "parentDictionaryPid"
})
public class EditMaskDictionary {

    @XmlElement(name = "DictionaryRid")
    protected String dictionaryRid;
    @XmlElement(name = "ParentDictionaryPid", required = true)
    protected String parentDictionaryPid;
    @XmlAttribute(name = "UseDropDownList")
    protected Boolean useDropDownList;

    /**
     * Gets the value of the dictionaryRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictionaryRid() {
        return dictionaryRid;
    }

    /**
     * Sets the value of the dictionaryRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictionaryRid(String value) {
        this.dictionaryRid = value;
    }

    /**
     * Gets the value of the parentDictionaryPid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentDictionaryPid() {
        return parentDictionaryPid;
    }

    /**
     * Sets the value of the parentDictionaryPid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentDictionaryPid(String value) {
        this.parentDictionaryPid = value;
    }

    /**
     * Gets the value of the useDropDownList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUseDropDownList() {
        if (useDropDownList == null) {
            return false;
        } else {
            return useDropDownList;
        }
    }

    /**
     * Sets the value of the useDropDownList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDropDownList(Boolean value) {
        this.useDropDownList = value;
    }

}
