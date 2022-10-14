
package org.radixware.schemas.editmask;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditMaskEnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditMaskEnum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="OrderBy"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Correction"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="CorrectionItems"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="MaxItemsInDDList" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
 *       &lt;attribute name="EnumId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditMaskEnum")
public class EditMaskEnum {

    @XmlAttribute(name = "OrderBy")
    protected String orderBy;
    @XmlAttribute(name = "Correction")
    protected String correction;
    @XmlAttribute(name = "CorrectionItems")
    protected List<String> correctionItems;
    @XmlAttribute(name = "MaxItemsInDDList")
    protected Integer maxItemsInDDList;
    @XmlAttribute(name = "EnumId")
    protected String enumId;

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBy(String value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the correction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrection() {
        return correction;
    }

    /**
     * Sets the value of the correction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrection(String value) {
        this.correction = value;
    }

    /**
     * Gets the value of the correctionItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correctionItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrectionItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCorrectionItems() {
        if (correctionItems == null) {
            correctionItems = new ArrayList<String>();
        }
        return this.correctionItems;
    }

    /**
     * Gets the value of the maxItemsInDDList property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxItemsInDDList() {
        if (maxItemsInDDList == null) {
            return -1;
        } else {
            return maxItemsInDDList;
        }
    }

    /**
     * Sets the value of the maxItemsInDDList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxItemsInDDList(Integer value) {
        this.maxItemsInDDList = value;
    }

    /**
     * Gets the value of the enumId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnumId() {
        return enumId;
    }

    /**
     * Sets the value of the enumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnumId(String value) {
        this.enumId = value;
    }

}
