
package com.tranzaxis.schemas.tariffs_admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TariffTableCellDims complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffTableCellDims"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dim" type="{http://schemas.tranzaxis.com/tariffs-admin.xsd}TariffTableCellDim" maxOccurs="6" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffTableCellDims", propOrder = {
    "dim"
})
public class TariffTableCellDims {

    @XmlElement(name = "Dim")
    protected List<TariffTableCellDim> dim;

    /**
     * Gets the value of the dim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffTableCellDim }
     * 
     * 
     */
    public List<TariffTableCellDim> getDim() {
        if (dim == null) {
            dim = new ArrayList<TariffTableCellDim>();
        }
        return this.dim;
    }

}
