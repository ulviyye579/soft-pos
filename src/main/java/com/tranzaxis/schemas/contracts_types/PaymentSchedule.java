
package com.tranzaxis.schemas.contracts_types;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.accounting_info.TariffExplanation;


/**
 * \u0420\u0430\u0441\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u043f\u043b\u0430\u0442\u0435\u0436\u0435\u0439 \u043f\u043e \u043a\u043e\u043d\u0442\u0440\u0430\u043a\u0442\u0443: \u0433\u0440\u0430\u0444\u0438\u043a \u043f\u043e\u0433\u0430\u0448\u0435\u043d\u0438\u044f, \u0440\u0430\u0441\u0447\u0435\u0442 \u041f\u0421\u041a
 * 
 * <p>Java class for PaymentSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentSchedule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Flow" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Explan" type="{http://schemas.tranzaxis.com/accounting-info.xsd}TariffExplanation" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/contracts-types.xsd}ContractPaymentScheduleFlowKind" /&gt;
 *                           &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="PaidAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="UnpaidAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Day" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="StartDay" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSchedule", propOrder = {
    "item"
})
public class PaymentSchedule {

    @XmlElement(name = "Item")
    protected List<PaymentSchedule.Item> item;
    @XmlAttribute(name = "StartDay")
    protected XMLGregorianCalendar startDay;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentSchedule.Item }
     * 
     * 
     */
    public List<PaymentSchedule.Item> getItem() {
        if (item == null) {
            item = new ArrayList<PaymentSchedule.Item>();
        }
        return this.item;
    }

    /**
     * Gets the value of the startDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDay() {
        return startDay;
    }

    /**
     * Sets the value of the startDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDay(XMLGregorianCalendar value) {
        this.startDay = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Flow" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Explan" type="{http://schemas.tranzaxis.com/accounting-info.xsd}TariffExplanation" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/contracts-types.xsd}ContractPaymentScheduleFlowKind" /&gt;
     *                 &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="PaidAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="UnpaidAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Day" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flow"
    })
    public static class Item {

        @XmlElement(name = "Flow")
        protected List<PaymentSchedule.Item.Flow> flow;
        @XmlAttribute(name = "Day", required = true)
        protected XMLGregorianCalendar day;

        /**
         * Gets the value of the flow property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flow property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentSchedule.Item.Flow }
         * 
         * 
         */
        public List<PaymentSchedule.Item.Flow> getFlow() {
            if (flow == null) {
                flow = new ArrayList<PaymentSchedule.Item.Flow>();
            }
            return this.flow;
        }

        /**
         * Gets the value of the day property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDay() {
            return day;
        }

        /**
         * Sets the value of the day property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDay(XMLGregorianCalendar value) {
            this.day = value;
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
         *       &lt;sequence&gt;
         *         &lt;element name="Explan" type="{http://schemas.tranzaxis.com/accounting-info.xsd}TariffExplanation" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/contracts-types.xsd}ContractPaymentScheduleFlowKind" /&gt;
         *       &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="PaidAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="UnpaidAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Ccy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "explan"
        })
        public static class Flow {

            @XmlElementRef(name = "Explan", namespace = "http://schemas.tranzaxis.com/contracts-types.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<TariffExplanation> explan;
            @XmlAttribute(name = "Kind", required = true)
            protected String kind;
            @XmlAttribute(name = "Amt", required = true)
            protected BigDecimal amt;
            @XmlAttribute(name = "PaidAmt")
            protected BigDecimal paidAmt;
            @XmlAttribute(name = "UnpaidAmt")
            protected BigDecimal unpaidAmt;
            @XmlAttribute(name = "Notes")
            protected String notes;
            @XmlAttribute(name = "Ccy")
            protected Long ccy;

            /**
             * Gets the value of the explan property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link TariffExplanation }{@code >}
             *     
             */
            public JAXBElement<TariffExplanation> getExplan() {
                return explan;
            }

            /**
             * Sets the value of the explan property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link TariffExplanation }{@code >}
             *     
             */
            public void setExplan(JAXBElement<TariffExplanation> value) {
                this.explan = value;
            }

            /**
             * Gets the value of the kind property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKind() {
                return kind;
            }

            /**
             * Sets the value of the kind property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKind(String value) {
                this.kind = value;
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
             * Gets the value of the paidAmt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPaidAmt() {
                return paidAmt;
            }

            /**
             * Sets the value of the paidAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPaidAmt(BigDecimal value) {
                this.paidAmt = value;
            }

            /**
             * Gets the value of the unpaidAmt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnpaidAmt() {
                return unpaidAmt;
            }

            /**
             * Sets the value of the unpaidAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnpaidAmt(BigDecimal value) {
                this.unpaidAmt = value;
            }

            /**
             * Gets the value of the notes property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNotes() {
                return notes;
            }

            /**
             * Sets the value of the notes property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNotes(String value) {
                this.notes = value;
            }

            /**
             * Gets the value of the ccy property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getCcy() {
                return ccy;
            }

            /**
             * Sets the value of the ccy property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setCcy(Long value) {
                this.ccy = value;
            }

        }

    }

}
