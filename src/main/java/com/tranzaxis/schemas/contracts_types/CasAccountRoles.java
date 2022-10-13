
package com.tranzaxis.schemas.contracts_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CasAccountRoles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CasAccountRoles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CasAccountRole" type="{http://schemas.tranzaxis.com/contracts-types.xsd}CasAccountRole" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CasAccountRoles", propOrder = {
    "casAccountRole"
})
public class CasAccountRoles {

    @XmlElement(name = "CasAccountRole")
    protected List<CasAccountRole> casAccountRole;

    /**
     * Gets the value of the casAccountRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the casAccountRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCasAccountRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CasAccountRole }
     * 
     * 
     */
    public List<CasAccountRole> getCasAccountRole() {
        if (casAccountRole == null) {
            casAccountRole = new ArrayList<CasAccountRole>();
        }
        return this.casAccountRole;
    }

}
