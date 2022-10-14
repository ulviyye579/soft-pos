
package com.tranzaxis.schemas.tariffs_admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TariffIds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffIds"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tariff" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}TariffId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffIds", propOrder = {
    "tariff"
})
public class TariffIds {

    @XmlElement(name = "Tariff")
    protected List<TariffId> tariff;

    /**
     * Gets the value of the tariff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffId }
     * 
     * 
     */
    public List<TariffId> getTariff() {
        if (tariff == null) {
            tariff = new ArrayList<TariffId>();
        }
        return this.tariff;
    }

}
