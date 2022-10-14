
package com.tranzaxis.schemas.contracts_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContractStatementDeliveryParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractStatementDeliveryParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatementTypeIds" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ExecBatchId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="BatchCreateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="LastBatchTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="ReplacementChannelId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ChannelId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ChannelClassGuid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="InstId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="FromHash" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ToHash" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractStatementDeliveryParams", propOrder = {
    "statementTypeIds"
})
public class ContractStatementDeliveryParams {

    @XmlElement(name = "StatementTypeIds")
    protected List<String> statementTypeIds;
    @XmlAttribute(name = "ExecBatchId", required = true)
    protected long execBatchId;
    @XmlAttribute(name = "BatchCreateTime")
    protected XMLGregorianCalendar batchCreateTime;
    @XmlAttribute(name = "LastBatchTime")
    protected XMLGregorianCalendar lastBatchTime;
    @XmlAttribute(name = "ReplacementChannelId")
    protected Long replacementChannelId;
    @XmlAttribute(name = "ChannelId", required = true)
    protected long channelId;
    @XmlAttribute(name = "ChannelClassGuid", required = true)
    protected String channelClassGuid;
    @XmlAttribute(name = "InstId", required = true)
    protected long instId;
    @XmlAttribute(name = "FromHash", required = true)
    protected long fromHash;
    @XmlAttribute(name = "ToHash", required = true)
    protected long toHash;

    /**
     * Gets the value of the statementTypeIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementTypeIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementTypeIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatementTypeIds() {
        if (statementTypeIds == null) {
            statementTypeIds = new ArrayList<String>();
        }
        return this.statementTypeIds;
    }

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
     * Gets the value of the batchCreateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBatchCreateTime() {
        return batchCreateTime;
    }

    /**
     * Sets the value of the batchCreateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBatchCreateTime(XMLGregorianCalendar value) {
        this.batchCreateTime = value;
    }

    /**
     * Gets the value of the lastBatchTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastBatchTime() {
        return lastBatchTime;
    }

    /**
     * Sets the value of the lastBatchTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastBatchTime(XMLGregorianCalendar value) {
        this.lastBatchTime = value;
    }

    /**
     * Gets the value of the replacementChannelId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReplacementChannelId() {
        return replacementChannelId;
    }

    /**
     * Sets the value of the replacementChannelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReplacementChannelId(Long value) {
        this.replacementChannelId = value;
    }

    /**
     * Gets the value of the channelId property.
     * 
     */
    public long getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     */
    public void setChannelId(long value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the channelClassGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelClassGuid() {
        return channelClassGuid;
    }

    /**
     * Sets the value of the channelClassGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelClassGuid(String value) {
        this.channelClassGuid = value;
    }

    /**
     * Gets the value of the instId property.
     * 
     */
    public long getInstId() {
        return instId;
    }

    /**
     * Sets the value of the instId property.
     * 
     */
    public void setInstId(long value) {
        this.instId = value;
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

}
