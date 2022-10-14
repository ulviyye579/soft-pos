
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectContractsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectContractsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Contract" type="{http://schemas.tranzaxis.com/tran.xsd}ContractSelectInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="HasMore" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectContractsResponse", propOrder = {
    "contract"
})
public class SelectContractsResponse {

    @XmlElement(name = "Contract")
    protected List<ContractSelectInfo> contract;
    @XmlAttribute(name = "HasMore")
    protected Boolean hasMore;

    /**
     * Gets the value of the contract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractSelectInfo }
     * 
     * 
     */
    public List<ContractSelectInfo> getContract() {
        if (contract == null) {
            contract = new ArrayList<ContractSelectInfo>();
        }
        return this.contract;
    }

    /**
     * Gets the value of the hasMore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasMore() {
        if (hasMore == null) {
            return false;
        } else {
            return hasMore;
        }
    }

    /**
     * Sets the value of the hasMore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMore(Boolean value) {
        this.hasMore = value;
    }

}
