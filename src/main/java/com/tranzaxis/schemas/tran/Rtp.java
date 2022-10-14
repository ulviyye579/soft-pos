
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tran" type="{http://schemas.tranzaxis.com/tran.xsd}Tran" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SeqNo" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="LastExtractedDay" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="LastExtractedTranId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tran"
})
@XmlRootElement(name = "Rtp")
public class Rtp {

    @XmlElement(name = "Tran", required = true)
    protected List<Tran> tran;
    @XmlAttribute(name = "SeqNo")
    protected Long seqNo;
    @XmlAttribute(name = "LastExtractedDay")
    protected XMLGregorianCalendar lastExtractedDay;
    @XmlAttribute(name = "LastExtractedTranId")
    protected Long lastExtractedTranId;

    /**
     * Gets the value of the tran property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tran property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTran().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tran }
     * 
     * 
     */
    public List<Tran> getTran() {
        if (tran == null) {
            tran = new ArrayList<Tran>();
        }
        return this.tran;
    }

    /**
     * Gets the value of the seqNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeqNo() {
        return seqNo;
    }

    /**
     * Sets the value of the seqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeqNo(Long value) {
        this.seqNo = value;
    }

    /**
     * Gets the value of the lastExtractedDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastExtractedDay() {
        return lastExtractedDay;
    }

    /**
     * Sets the value of the lastExtractedDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastExtractedDay(XMLGregorianCalendar value) {
        this.lastExtractedDay = value;
    }

    /**
     * Gets the value of the lastExtractedTranId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastExtractedTranId() {
        return lastExtractedTranId;
    }

    /**
     * Sets the value of the lastExtractedTranId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastExtractedTranId(Long value) {
        this.lastExtractedTranId = value;
    }

}
