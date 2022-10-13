
package com.tranzaxis.schemas.rc_admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RcMoratoriums complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RcMoratoriums"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RcMoratorium" type="{http://schemas.tranzaxis.com/rc-admin.xsd}RcMoratorium" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RcMoratoriums", propOrder = {
    "rcMoratorium"
})
public class RcMoratoriums {

    @XmlElement(name = "RcMoratorium")
    protected List<RcMoratorium> rcMoratorium;

    /**
     * Gets the value of the rcMoratorium property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcMoratorium property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcMoratorium().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RcMoratorium }
     * 
     * 
     */
    public List<RcMoratorium> getRcMoratorium() {
        if (rcMoratorium == null) {
            rcMoratorium = new ArrayList<RcMoratorium>();
        }
        return this.rcMoratorium;
    }

}
