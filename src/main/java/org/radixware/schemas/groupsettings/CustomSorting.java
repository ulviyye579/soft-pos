
package org.radixware.schemas.groupsettings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.commondef.NamedDefinition;


/**
 * <p>Java class for CustomSorting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomSorting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/commondef.xsd}NamedDefinition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderBy" type="{http://schemas.radixware.org/groupsettings.xsd}SortingItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedColumn" type="{http://schemas.radixware.org/groupsettings.xsd}SortingItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomSorting", propOrder = {
    "orderBy",
    "associatedColumn"
})
public class CustomSorting
    extends NamedDefinition
{

    @XmlElement(name = "OrderBy")
    protected List<SortingItem> orderBy;
    @XmlElement(name = "AssociatedColumn")
    protected SortingItem associatedColumn;

    /**
     * Gets the value of the orderBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortingItem }
     * 
     * 
     */
    public List<SortingItem> getOrderBy() {
        if (orderBy == null) {
            orderBy = new ArrayList<SortingItem>();
        }
        return this.orderBy;
    }

    /**
     * Gets the value of the associatedColumn property.
     * 
     * @return
     *     possible object is
     *     {@link SortingItem }
     *     
     */
    public SortingItem getAssociatedColumn() {
        return associatedColumn;
    }

    /**
     * Sets the value of the associatedColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortingItem }
     *     
     */
    public void setAssociatedColumn(SortingItem value) {
        this.associatedColumn = value;
    }

}
