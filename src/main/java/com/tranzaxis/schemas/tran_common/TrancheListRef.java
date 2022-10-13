
package com.tranzaxis.schemas.tran_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrancheListRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrancheListRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Tranche" type="{http://schemas.tranzaxis.com/tran-common.xsd}TrancheRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Tran" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranRef"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrancheListRef", propOrder = {
    "tranche",
    "tran"
})
public class TrancheListRef {

    @XmlElement(name = "Tranche")
    protected List<TrancheRef> tranche;
    @XmlElement(name = "Tran")
    protected TranRef tran;

    /**
     * Gets the value of the tranche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tranche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrancheRef }
     * 
     * 
     */
    public List<TrancheRef> getTranche() {
        if (tranche == null) {
            tranche = new ArrayList<TrancheRef>();
        }
        return this.tranche;
    }

    /**
     * Gets the value of the tran property.
     * 
     * @return
     *     possible object is
     *     {@link TranRef }
     *     
     */
    public TranRef getTran() {
        return tran;
    }

    /**
     * Sets the value of the tran property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranRef }
     *     
     */
    public void setTran(TranRef value) {
        this.tran = value;
    }

}
