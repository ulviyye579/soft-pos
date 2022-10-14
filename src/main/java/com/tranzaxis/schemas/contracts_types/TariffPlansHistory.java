
package com.tranzaxis.schemas.contracts_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TariffPlansHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffPlansHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TariffPlan" type="{http://schemas.tranzaxis.com/contracts-types.xsd}TariffPlanSnapshot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffPlansHistory", propOrder = {
    "tariffPlan"
})
public class TariffPlansHistory {

    @XmlElement(name = "TariffPlan")
    protected List<TariffPlanSnapshot> tariffPlan;

    /**
     * Gets the value of the tariffPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffPlanSnapshot }
     * 
     * 
     */
    public List<TariffPlanSnapshot> getTariffPlan() {
        if (tariffPlan == null) {
            tariffPlan = new ArrayList<TariffPlanSnapshot>();
        }
        return this.tariffPlan;
    }

}
