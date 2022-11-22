
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * \u0415\u0441\u043b\u0438 \u0430\u0442\u0440\u0438\u0431\u0443\u0442 Filter		List of Enum { File, Dir} 	\u043d\u0435 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d  \u0432\u0441\u0435;
 *                 \u0430\u0442\u0440\u0438\u0431\u0443\u0442 Properties		List of Enum {Attributes, Size, ModifyTime}	\u0443\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u0432\u043e\u0437\u0432\u0440\u0430\u0449\u0430\u0435\u043c\u044b\u0435 \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u0430 \u0444\u0430\u0439\u043b\u043e\u0432
 * 
 * <p>Java class for FileDirReadRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileDirReadRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="DirName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Mask" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AttributeFilter" type="{http://schemas.radixware.org/eas.xsd}FileDirReadAttributesList" /&gt;
 *       &lt;attribute name="SortBy" default="None"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SortOptions" type="{http://schemas.radixware.org/eas.xsd}FileDirReadSortOptionsList" /&gt;
 *       &lt;attribute name="Properties" type="{http://schemas.radixware.org/eas.xsd}FileDirReadPropertiesList" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDirReadRq")
public class FileDirReadRq {

    @XmlAttribute(name = "DirName", required = true)
    protected String dirName;
    @XmlAttribute(name = "Mask")
    protected String mask;
    @XmlAttribute(name = "AttributeFilter")
    protected List<String> attributeFilter;
    @XmlAttribute(name = "SortBy")
    protected String sortBy;
    @XmlAttribute(name = "SortOptions")
    protected List<String> sortOptions;
    @XmlAttribute(name = "Properties")
    protected List<String> properties;

    /**
     * Gets the value of the dirName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirName() {
        return dirName;
    }

    /**
     * Sets the value of the dirName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirName(String value) {
        this.dirName = value;
    }

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * Gets the value of the attributeFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAttributeFilter() {
        if (attributeFilter == null) {
            attributeFilter = new ArrayList<String>();
        }
        return this.attributeFilter;
    }

    /**
     * Gets the value of the sortBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortBy() {
        if (sortBy == null) {
            return "None";
        } else {
            return sortBy;
        }
    }

    /**
     * Sets the value of the sortBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortBy(String value) {
        this.sortBy = value;
    }

    /**
     * Gets the value of the sortOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSortOptions() {
        if (sortOptions == null) {
            sortOptions = new ArrayList<String>();
        }
        return this.sortOptions;
    }

    /**
     * Gets the value of the properties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the properties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProperties() {
        if (properties == null) {
            properties = new ArrayList<String>();
        }
        return this.properties;
    }

}
