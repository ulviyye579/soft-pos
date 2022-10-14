
package com.tranzaxis.schemas.contracts_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * deprecated
 * 
 * <p>Java class for TranPlanExecuteParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranPlanExecuteParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Day" type="{http://schemas.radixware.org/types.xsd}DateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PlanId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranPlanExecuteParams", propOrder = {
    "day"
})
public class TranPlanExecuteParams {

    @XmlElement(name = "Day")
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> day;
    @XmlAttribute(name = "PlanId", required = true)
    protected long planId;

    /**
     * Gets the value of the day property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the day property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getDay() {
        if (day == null) {
            day = new ArrayList<XMLGregorianCalendar>();
        }
        return this.day;
    }

    /**
     * Gets the value of the planId property.
     * 
     */
    public long getPlanId() {
        return planId;
    }

    /**
     * Sets the value of the planId property.
     * 
     */
    public void setPlanId(long value) {
        this.planId = value;
    }

}
