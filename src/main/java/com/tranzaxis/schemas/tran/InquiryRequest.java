
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InquiryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="Batches"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Ids"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="TypeIds"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="States"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.tranzaxis.com/tran.xsd}BatchState" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="CreatedFrom" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="CreatedTo" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tasks"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Ids"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Rids"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Metrics"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Ids" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CfgPackets"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ContentForPacketId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EventLog"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ContextType" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ContextId" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="RecCount" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="MinSeverity" type="{http://schemas.tranzaxis.com/tran.xsd}EventSeverityEnum" /&gt;
 *                 &lt;attribute name="FromTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                 &lt;attribute name="ToTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Invoices"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Invoice" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Guid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="RidByTrx" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="RidByPayer" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="RidByPayee" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Verbose" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="InitiatorRid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquiryRequest", propOrder = {
    "batches",
    "tasks",
    "metrics",
    "cfgPackets",
    "eventLog",
    "invoices"
})
public class InquiryRequest {

    @XmlElement(name = "Batches")
    protected InquiryRequest.Batches batches;
    @XmlElement(name = "Tasks")
    protected InquiryRequest.Tasks tasks;
    @XmlElement(name = "Metrics")
    protected InquiryRequest.Metrics metrics;
    @XmlElement(name = "CfgPackets")
    protected InquiryRequest.CfgPackets cfgPackets;
    @XmlElement(name = "EventLog")
    protected InquiryRequest.EventLog eventLog;
    @XmlElement(name = "Invoices")
    protected InquiryRequest.Invoices invoices;
    @XmlAttribute(name = "InitiatorRid", required = true)
    protected String initiatorRid;

    /**
     * Gets the value of the batches property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryRequest.Batches }
     *     
     */
    public InquiryRequest.Batches getBatches() {
        return batches;
    }

    /**
     * Sets the value of the batches property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryRequest.Batches }
     *     
     */
    public void setBatches(InquiryRequest.Batches value) {
        this.batches = value;
    }

    /**
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryRequest.Tasks }
     *     
     */
    public InquiryRequest.Tasks getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryRequest.Tasks }
     *     
     */
    public void setTasks(InquiryRequest.Tasks value) {
        this.tasks = value;
    }

    /**
     * Gets the value of the metrics property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryRequest.Metrics }
     *     
     */
    public InquiryRequest.Metrics getMetrics() {
        return metrics;
    }

    /**
     * Sets the value of the metrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryRequest.Metrics }
     *     
     */
    public void setMetrics(InquiryRequest.Metrics value) {
        this.metrics = value;
    }

    /**
     * Gets the value of the cfgPackets property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryRequest.CfgPackets }
     *     
     */
    public InquiryRequest.CfgPackets getCfgPackets() {
        return cfgPackets;
    }

    /**
     * Sets the value of the cfgPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryRequest.CfgPackets }
     *     
     */
    public void setCfgPackets(InquiryRequest.CfgPackets value) {
        this.cfgPackets = value;
    }

    /**
     * Gets the value of the eventLog property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryRequest.EventLog }
     *     
     */
    public InquiryRequest.EventLog getEventLog() {
        return eventLog;
    }

    /**
     * Sets the value of the eventLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryRequest.EventLog }
     *     
     */
    public void setEventLog(InquiryRequest.EventLog value) {
        this.eventLog = value;
    }

    /**
     * Gets the value of the invoices property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryRequest.Invoices }
     *     
     */
    public InquiryRequest.Invoices getInvoices() {
        return invoices;
    }

    /**
     * Sets the value of the invoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryRequest.Invoices }
     *     
     */
    public void setInvoices(InquiryRequest.Invoices value) {
        this.invoices = value;
    }

    /**
     * Gets the value of the initiatorRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatorRid() {
        return initiatorRid;
    }

    /**
     * Sets the value of the initiatorRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatorRid(String value) {
        this.initiatorRid = value;
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
     *       &lt;attribute name="Ids"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="TypeIds"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="States"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.tranzaxis.com/tran.xsd}BatchState" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="CreatedFrom" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="CreatedTo" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Batches {

        @XmlAttribute(name = "Ids")
        protected List<Long> ids;
        @XmlAttribute(name = "TypeIds")
        protected List<Long> typeIds;
        @XmlAttribute(name = "States")
        protected List<String> states;
        @XmlAttribute(name = "CreatedFrom")
        protected XMLGregorianCalendar createdFrom;
        @XmlAttribute(name = "CreatedTo")
        protected XMLGregorianCalendar createdTo;

        /**
         * Gets the value of the ids property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ids property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getIds() {
            if (ids == null) {
                ids = new ArrayList<Long>();
            }
            return this.ids;
        }

        /**
         * Gets the value of the typeIds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the typeIds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTypeIds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getTypeIds() {
            if (typeIds == null) {
                typeIds = new ArrayList<Long>();
            }
            return this.typeIds;
        }

        /**
         * Gets the value of the states property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the states property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStates().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStates() {
            if (states == null) {
                states = new ArrayList<String>();
            }
            return this.states;
        }

        /**
         * Gets the value of the createdFrom property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreatedFrom() {
            return createdFrom;
        }

        /**
         * Sets the value of the createdFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreatedFrom(XMLGregorianCalendar value) {
            this.createdFrom = value;
        }

        /**
         * Gets the value of the createdTo property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreatedTo() {
            return createdTo;
        }

        /**
         * Sets the value of the createdTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreatedTo(XMLGregorianCalendar value) {
            this.createdTo = value;
        }

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
     *       &lt;attribute name="ContentForPacketId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CfgPackets {

        @XmlAttribute(name = "ContentForPacketId")
        protected Long contentForPacketId;

        /**
         * Gets the value of the contentForPacketId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getContentForPacketId() {
            return contentForPacketId;
        }

        /**
         * Sets the value of the contentForPacketId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setContentForPacketId(Long value) {
            this.contentForPacketId = value;
        }

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
     *       &lt;attribute name="ContextType" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ContextId" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="RecCount" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="MinSeverity" type="{http://schemas.tranzaxis.com/tran.xsd}EventSeverityEnum" /&gt;
     *       &lt;attribute name="FromTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *       &lt;attribute name="ToTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EventLog {

        @XmlAttribute(name = "ContextType", required = true)
        protected String contextType;
        @XmlAttribute(name = "ContextId", required = true)
        protected String contextId;
        @XmlAttribute(name = "RecCount", required = true)
        protected long recCount;
        @XmlAttribute(name = "MinSeverity")
        protected Long minSeverity;
        @XmlAttribute(name = "FromTime")
        protected XMLGregorianCalendar fromTime;
        @XmlAttribute(name = "ToTime")
        protected XMLGregorianCalendar toTime;

        /**
         * Gets the value of the contextType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContextType() {
            return contextType;
        }

        /**
         * Sets the value of the contextType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContextType(String value) {
            this.contextType = value;
        }

        /**
         * Gets the value of the contextId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContextId() {
            return contextId;
        }

        /**
         * Sets the value of the contextId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContextId(String value) {
            this.contextId = value;
        }

        /**
         * Gets the value of the recCount property.
         * 
         */
        public long getRecCount() {
            return recCount;
        }

        /**
         * Sets the value of the recCount property.
         * 
         */
        public void setRecCount(long value) {
            this.recCount = value;
        }

        /**
         * Gets the value of the minSeverity property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getMinSeverity() {
            return minSeverity;
        }

        /**
         * Sets the value of the minSeverity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setMinSeverity(Long value) {
            this.minSeverity = value;
        }

        /**
         * Gets the value of the fromTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFromTime() {
            return fromTime;
        }

        /**
         * Sets the value of the fromTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFromTime(XMLGregorianCalendar value) {
            this.fromTime = value;
        }

        /**
         * Gets the value of the toTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getToTime() {
            return toTime;
        }

        /**
         * Sets the value of the toTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setToTime(XMLGregorianCalendar value) {
            this.toTime = value;
        }

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
     *         &lt;element name="Invoice" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Guid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="RidByTrx" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="RidByPayer" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="RidByPayee" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Verbose" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
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
    @XmlType(name = "", propOrder = {
        "invoice"
    })
    public static class Invoices {

        @XmlElement(name = "Invoice")
        protected List<InquiryRequest.Invoices.Invoice> invoice;

        /**
         * Gets the value of the invoice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the invoice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInvoice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InquiryRequest.Invoices.Invoice }
         * 
         * 
         */
        public List<InquiryRequest.Invoices.Invoice> getInvoice() {
            if (invoice == null) {
                invoice = new ArrayList<InquiryRequest.Invoices.Invoice>();
            }
            return this.invoice;
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
         *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Guid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="RidByTrx" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="RidByPayer" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="RidByPayee" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Verbose" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Invoice {

            @XmlAttribute(name = "Id")
            protected Long id;
            @XmlAttribute(name = "Guid")
            protected String guid;
            @XmlAttribute(name = "RidByTrx")
            protected String ridByTrx;
            @XmlAttribute(name = "RidByPayer")
            protected String ridByPayer;
            @XmlAttribute(name = "RidByPayee")
            protected String ridByPayee;
            @XmlAttribute(name = "Verbose")
            protected Boolean verbose;

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
             * Gets the value of the guid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGuid() {
                return guid;
            }

            /**
             * Sets the value of the guid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGuid(String value) {
                this.guid = value;
            }

            /**
             * Gets the value of the ridByTrx property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRidByTrx() {
                return ridByTrx;
            }

            /**
             * Sets the value of the ridByTrx property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRidByTrx(String value) {
                this.ridByTrx = value;
            }

            /**
             * Gets the value of the ridByPayer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRidByPayer() {
                return ridByPayer;
            }

            /**
             * Sets the value of the ridByPayer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRidByPayer(String value) {
                this.ridByPayer = value;
            }

            /**
             * Gets the value of the ridByPayee property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRidByPayee() {
                return ridByPayee;
            }

            /**
             * Sets the value of the ridByPayee property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRidByPayee(String value) {
                this.ridByPayee = value;
            }

            /**
             * Gets the value of the verbose property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isVerbose() {
                return verbose;
            }

            /**
             * Sets the value of the verbose property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setVerbose(Boolean value) {
                this.verbose = value;
            }

        }

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
     *       &lt;attribute name="Ids" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
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
    @XmlType(name = "")
    public static class Metrics {

        @XmlAttribute(name = "Ids", required = true)
        protected List<Long> ids;

        /**
         * Gets the value of the ids property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ids property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getIds() {
            if (ids == null) {
                ids = new ArrayList<Long>();
            }
            return this.ids;
        }

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
     *       &lt;attribute name="Ids"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Rids"&gt;
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
    @XmlType(name = "")
    public static class Tasks {

        @XmlAttribute(name = "Ids")
        protected List<Long> ids;
        @XmlAttribute(name = "Rids")
        protected List<String> rids;

        /**
         * Gets the value of the ids property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ids property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getIds() {
            if (ids == null) {
                ids = new ArrayList<Long>();
            }
            return this.ids;
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

}
