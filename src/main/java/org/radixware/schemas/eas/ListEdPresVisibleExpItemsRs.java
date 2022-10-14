
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListEdPresVisibleExpItemsRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListEdPresVisibleExpItemsRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VisibleExplorerItems" type="{http://schemas.radixware.org/eas.xsd}ExplorerItemList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListEdPresVisibleExpItemsRs", propOrder = {
    "visibleExplorerItems"
})
public class ListEdPresVisibleExpItemsRs
    extends Response
{

    @XmlElement(name = "VisibleExplorerItems", required = true)
    protected ExplorerItemList visibleExplorerItems;

    /**
     * Gets the value of the visibleExplorerItems property.
     * 
     * @return
     *     possible object is
     *     {@link ExplorerItemList }
     *     
     */
    public ExplorerItemList getVisibleExplorerItems() {
        return visibleExplorerItems;
    }

    /**
     * Sets the value of the visibleExplorerItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExplorerItemList }
     *     
     */
    public void setVisibleExplorerItems(ExplorerItemList value) {
        this.visibleExplorerItems = value;
    }

}
