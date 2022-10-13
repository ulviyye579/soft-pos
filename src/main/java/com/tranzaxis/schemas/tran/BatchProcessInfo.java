
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchProcessInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchProcessInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TypeTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TotalJobCount" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TotalProcessedJobCount" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="State" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}BatchState" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchProcessInfo")
public class BatchProcessInfo {

    @XmlAttribute(name = "Id", required = true)
    protected long id;
    @XmlAttribute(name = "TypeId")
    protected Long typeId;
    @XmlAttribute(name = "TypeTitle")
    protected String typeTitle;
    @XmlAttribute(name = "TotalJobCount", required = true)
    protected long totalJobCount;
    @XmlAttribute(name = "TotalProcessedJobCount", required = true)
    protected long totalProcessedJobCount;
    @XmlAttribute(name = "State", required = true)
    protected String state;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeId(Long value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the typeTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeTitle() {
        return typeTitle;
    }

    /**
     * Sets the value of the typeTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeTitle(String value) {
        this.typeTitle = value;
    }

    /**
     * Gets the value of the totalJobCount property.
     * 
     */
    public long getTotalJobCount() {
        return totalJobCount;
    }

    /**
     * Sets the value of the totalJobCount property.
     * 
     */
    public void setTotalJobCount(long value) {
        this.totalJobCount = value;
    }

    /**
     * Gets the value of the totalProcessedJobCount property.
     * 
     */
    public long getTotalProcessedJobCount() {
        return totalProcessedJobCount;
    }

    /**
     * Sets the value of the totalProcessedJobCount property.
     * 
     */
    public void setTotalProcessedJobCount(long value) {
        this.totalProcessedJobCount = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

}
