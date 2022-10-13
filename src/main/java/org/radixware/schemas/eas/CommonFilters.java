
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * \u0421\u043f\u0438\u0441\u043e\u043a \u043e\u0431\u0449\u0438\u0445 \u0444\u0438\u043b\u044c\u0442\u0440\u043e\u0432 \u0434\u043b\u044f \u0432\u044b\u0431\u043e\u0440\u0430 \u0432 \u0441\u0435\u043b\u0435\u043a\u0442\u043e\u0440\u0435 \u043f\u0440\u0438\u0441\u044b\u043b\u0430\u0435\u0442\u0441\u044f \u0432 \u043e\u0442\u0432\u0435\u0442\u0435 SelectRs
 * 
 * <p>Java class for CommonFilters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonFilters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item" type="{http://schemas.radixware.org/eas.xsd}CommonFilter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdateTime" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonFilters", propOrder = {
    "item",
    "lastUpdateTime"
})
public class CommonFilters {

    @XmlElement(name = "Item")
    protected List<CommonFilter> item;
    @XmlElement(name = "LastUpdateTime")
    protected long lastUpdateTime;

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
     * {@link CommonFilter }
     * 
     * 
     */
    public List<CommonFilter> getItem() {
        if (item == null) {
            item = new ArrayList<CommonFilter>();
        }
        return this.item;
    }

    /**
     * Gets the value of the lastUpdateTime property.
     * 
     */
    public long getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     */
    public void setLastUpdateTime(long value) {
        this.lastUpdateTime = value;
    }

}
