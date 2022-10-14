
package com.tranzaxis.schemas.contracts_types;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ChargePostControlQueue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargePostControlQueue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Period" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="FromDay" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="ToDay" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                 &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="HoldId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargePostControlQueue", propOrder = {
    "period"
})
public class ChargePostControlQueue {

    @XmlElement(name = "Period")
    protected List<ChargePostControlQueue.Period> period;

    /**
     * Gets the value of the period property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the period property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargePostControlQueue.Period }
     * 
     * 
     */
    public List<ChargePostControlQueue.Period> getPeriod() {
        if (period == null) {
            period = new ArrayList<ChargePostControlQueue.Period>();
        }
        return this.period;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="FromDay" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="ToDay" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *       &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="HoldId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Period {

        @XmlAttribute(name = "FromDay", required = true)
        protected XMLGregorianCalendar fromDay;
        @XmlAttribute(name = "ToDay", required = true)
        protected XMLGregorianCalendar toDay;
        @XmlAttribute(name = "Amt", required = true)
        protected BigDecimal amt;
        @XmlAttribute(name = "Ccy", required = true)
        protected long ccy;
        @XmlAttribute(name = "HoldId")
        protected Long holdId;

        /**
         * Gets the value of the fromDay property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFromDay() {
            return fromDay;
        }

        /**
         * Sets the value of the fromDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFromDay(XMLGregorianCalendar value) {
            this.fromDay = value;
        }

        /**
         * Gets the value of the toDay property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getToDay() {
            return toDay;
        }

        /**
         * Sets the value of the toDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setToDay(XMLGregorianCalendar value) {
            this.toDay = value;
        }

        /**
         * Gets the value of the amt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmt() {
            return amt;
        }

        /**
         * Sets the value of the amt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmt(BigDecimal value) {
            this.amt = value;
        }

        /**
         * Gets the value of the ccy property.
         * 
         */
        public long getCcy() {
            return ccy;
        }

        /**
         * Sets the value of the ccy property.
         * 
         */
        public void setCcy(long value) {
            this.ccy = value;
        }

        /**
         * Gets the value of the holdId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getHoldId() {
            return holdId;
        }

        /**
         * Sets the value of the holdId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setHoldId(Long value) {
            this.holdId = value;
        }

    }

}
