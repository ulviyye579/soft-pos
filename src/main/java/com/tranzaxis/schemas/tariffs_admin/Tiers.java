
package com.tranzaxis.schemas.tariffs_admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.ListModifyMode;


/**
 * <p>Java class for Tiers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tiers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tier" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}Tier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/common-types.xsd}ListModifyMode" default="Change" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tiers", propOrder = {
    "tier"
})
public class Tiers {

    @XmlElement(name = "Tier")
    protected List<Tier> tier;
    @XmlAttribute(name = "Mode")
    protected ListModifyMode mode;

    /**
     * Gets the value of the tier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tier }
     * 
     * 
     */
    public List<Tier> getTier() {
        if (tier == null) {
            tier = new ArrayList<Tier>();
        }
        return this.tier;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link ListModifyMode }
     *     
     */
    public ListModifyMode getMode() {
        if (mode == null) {
            return ListModifyMode.CHANGE;
        } else {
            return mode;
        }
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListModifyMode }
     *     
     */
    public void setMode(ListModifyMode value) {
        this.mode = value;
    }

}
