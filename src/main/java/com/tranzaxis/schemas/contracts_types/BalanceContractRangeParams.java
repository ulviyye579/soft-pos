
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
 * <p>Java class for BalanceContractRangeParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceContractRangeParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Task" type="{http://schemas.tranzaxis.com/contracts-types.xsd}BalancingTask" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PrepareBatchId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ExecBatchId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ContractTypeId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TranDay" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="BalancingDay" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
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
@XmlType(name = "BalanceContractRangeParams", propOrder = {
    "task"
})
public class BalanceContractRangeParams {

    @XmlElement(name = "Task", required = true)
    protected List<BalancingTask> task;
    @XmlAttribute(name = "PrepareBatchId", required = true)
    protected long prepareBatchId;
    @XmlAttribute(name = "ExecBatchId", required = true)
    protected long execBatchId;
    @XmlAttribute(name = "ContractTypeId", required = true)
    protected long contractTypeId;
    @XmlAttribute(name = "TranDay", required = true)
    protected XMLGregorianCalendar tranDay;
    @XmlAttribute(name = "BalancingDay", required = true)
    protected XMLGregorianCalendar balancingDay;
    @XmlAttribute(name = "FromHash", required = true)
    protected long fromHash;
    @XmlAttribute(name = "ToHash", required = true)
    protected long toHash;

    /**
     * Gets the value of the task property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the task property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalancingTask }
     * 
     * 
     */
    public List<BalancingTask> getTask() {
        if (task == null) {
            task = new ArrayList<BalancingTask>();
        }
        return this.task;
    }

    /**
     * Gets the value of the prepareBatchId property.
     * 
     */
    public long getPrepareBatchId() {
        return prepareBatchId;
    }

    /**
     * Sets the value of the prepareBatchId property.
     * 
     */
    public void setPrepareBatchId(long value) {
        this.prepareBatchId = value;
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
     * Gets the value of the tranDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranDay() {
        return tranDay;
    }

    /**
     * Sets the value of the tranDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranDay(XMLGregorianCalendar value) {
        this.tranDay = value;
    }

    /**
     * Gets the value of the balancingDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBalancingDay() {
        return balancingDay;
    }

    /**
     * Sets the value of the balancingDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBalancingDay(XMLGregorianCalendar value) {
        this.balancingDay = value;
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
