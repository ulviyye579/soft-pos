
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrancheRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrancheRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Id" type="{http://schemas.radixware.org/types.xsd}Int"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Tran" type="{http://schemas.tranzaxis.com/tran-common.xsd}TranRef"/&gt;
 *           &lt;element name="Entry" type="{http://schemas.tranzaxis.com/tran-common.xsd}EntryRef"/&gt;
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
@XmlType(name = "TrancheRef", propOrder = {
    "id",
    "tran",
    "entry"
})
public class TrancheRef {

    @XmlElement(name = "Id")
    protected Long id;
    @XmlElement(name = "Tran")
    protected TranRef tran;
    @XmlElement(name = "Entry")
    protected EntryRef entry;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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

    /**
     * Gets the value of the entry property.
     * 
     * @return
     *     possible object is
     *     {@link EntryRef }
     *     
     */
    public EntryRef getEntry() {
        return entry;
    }

    /**
     * Sets the value of the entry property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryRef }
     *     
     */
    public void setEntry(EntryRef value) {
        this.entry = value;
    }

}
