
package com.tranzaxis.schemas.contracts_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ActualizeMeasuresContractRangeParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActualizeMeasuresContractRangeParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ExecBatchId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ContractTypeId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="BegDay" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="EndDay" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="FromHash" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ToHash" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Rids" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualizeMeasuresContractRangeParams")
public class ActualizeMeasuresContractRangeParams {

    @XmlAttribute(name = "ExecBatchId", required = true)
    protected long execBatchId;
    @XmlAttribute(name = "ContractTypeId", required = true)
    protected long contractTypeId;
    @XmlAttribute(name = "BegDay", required = true)
    protected XMLGregorianCalendar begDay;
    @XmlAttribute(name = "EndDay", required = true)
    protected XMLGregorianCalendar endDay;
    @XmlAttribute(name = "FromHash", required = true)
    protected long fromHash;
    @XmlAttribute(name = "ToHash", required = true)
    protected long toHash;
    @XmlAttribute(name = "Rids", required = true)
    protected List<String> rids;

    /**
     * Gets the value of the execBatchId property.
     * 
     */
    public long getExecBatchId() {
        return execBatchId;
    }

    /**
     * Sets the value of the execBatchId property.
     * 
     */
    public void setExecBatchId(long value) {
        this.execBatchId = value;
    }

    /**
     * Gets the value of the contractTypeId property.
     * 
     */
    public long getContractTypeId() {
        return contractTypeId;
    }

    /**
     * Sets the value of the contractTypeId property.
     * 
     */
    public void setContractTypeId(long value) {
        this.contractTypeId = value;
    }

    /**
     * Gets the value of the begDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBegDay() {
        return begDay;
    }

    /**
     * Sets the value of the begDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBegDay(XMLGregorianCalendar value) {
        this.begDay = value;
    }

    /**
     * Gets the value of the endDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDay() {
        return endDay;
    }

    /**
     * Sets the value of the endDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDay(XMLGregorianCalendar value) {
        this.endDay = value;
    }

    /**
     * Gets the value of the fromHash property.
     * 
     */
    public long getFromHash() {
        return fromHash;
    }

    /**
     * Sets the value of the fromHash property.
     * 
     */
    public void setFromHash(long value) {
        this.fromHash = value;
    }

    /**
     * Gets the value of the toHash property.
     * 
     */
    public long getToHash() {
        return toHash;
    }

    /**
     * Sets the value of the toHash property.
     * 
     */
    public void setToHash(long value) {
        this.toHash = value;
    }

    /**
     * Gets the value of the rids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRids() {
        if (rids == null) {
            rids = new ArrayList<String>();
        }
        return this.rids;
    }

}
