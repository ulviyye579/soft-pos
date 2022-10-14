
package com.tranzaxis.schemas.contracts_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CasAccountMapItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CasAccountMapItems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CasAccountMapItem" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CasAccountMapItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CasAccountMapItems", propOrder = {
    "casAccountMapItem"
})
public class CasAccountMapItems {

    @XmlElement(name = "CasAccountMapItem")
    protected List<CasAccountMapItem> casAccountMapItem;

    /**
     * Gets the value of the casAccountMapItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the casAccountMapItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCasAccountMapItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CasAccountMapItem }
     * 
     * 
     */
    public List<CasAccountMapItem> getCasAccountMapItem() {
        if (casAccountMapItem == null) {
            casAccountMapItem = new ArrayList<CasAccountMapItem>();
        }
        return this.casAccountMapItem;
    }

}
