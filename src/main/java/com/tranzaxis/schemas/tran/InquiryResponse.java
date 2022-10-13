
package com.tranzaxis.schemas.tran;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.invoicing.AdminInvoice;


/**
 * <p>Java class for InquiryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Batches"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Batch" type="{http://schemas.tranzaxis.com/tran.xsd}BatchProcessInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tasks"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Task" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Status"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Metrics"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Metric" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="TypeId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="InstanceId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="UnitId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="ServiceUri" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="NetChannelId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="BegTime" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                           &lt;attribute name="EndTime" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                           &lt;attribute name="BegVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="EndVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="MinVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="MaxVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="AvgVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CfgPackets"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Packet" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://schemas.radixware.org/cfgManagement-impExp.xsd}Packet"&gt;
 *                           &lt;attribute name="SrcPacketId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="ApplyTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EventLog"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Rec" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Message" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Time" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                           &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Severity" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}EventSeverityEnum" /&gt;
 *                           &lt;attribute name="SourceComponent" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Code" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Invoices"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Invoice" type="{http://schemas.tranzaxis.com/invoicing.xsd}AdminInvoice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquiryResponse", propOrder = {
    "batches",
    "tasks",
    "metrics",
    "cfgPackets",
    "eventLog",
    "invoices"
})
public class InquiryResponse {

    @XmlElement(name = "Batches")
    protected InquiryResponse.Batches batches;
    @XmlElement(name = "Tasks")
    protected InquiryResponse.Tasks tasks;
    @XmlElement(name = "Metrics")
    protected InquiryResponse.Metrics metrics;
    @XmlElement(name = "CfgPackets")
    protected InquiryResponse.CfgPackets cfgPackets;
    @XmlElement(name = "EventLog")
    protected InquiryResponse.EventLog eventLog;
    @XmlElement(name = "Invoices")
    protected InquiryResponse.Invoices invoices;

    /**
     * Gets the value of the batches property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryResponse.Batches }
     *     
     */
    public InquiryResponse.Batches getBatches() {
        return batches;
    }

    /**
     * Sets the value of the batches property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryResponse.Batches }
     *     
     */
    public void setBatches(InquiryResponse.Batches value) {
        this.batches = value;
    }

    /**
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryResponse.Tasks }
     *     
     */
    public InquiryResponse.Tasks getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryResponse.Tasks }
     *     
     */
    public void setTasks(InquiryResponse.Tasks value) {
        this.tasks = value;
    }

    /**
     * Gets the value of the metrics property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryResponse.Metrics }
     *     
     */
    public InquiryResponse.Metrics getMetrics() {
        return metrics;
    }

    /**
     * Sets the value of the metrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryResponse.Metrics }
     *     
     */
    public void setMetrics(InquiryResponse.Metrics value) {
        this.metrics = value;
    }

    /**
     * Gets the value of the cfgPackets property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryResponse.CfgPackets }
     *     
     */
    public InquiryResponse.CfgPackets getCfgPackets() {
        return cfgPackets;
    }

    /**
     * Sets the value of the cfgPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryResponse.CfgPackets }
     *     
     */
    public void setCfgPackets(InquiryResponse.CfgPackets value) {
        this.cfgPackets = value;
    }

    /**
     * Gets the value of the eventLog property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryResponse.EventLog }
     *     
     */
    public InquiryResponse.EventLog getEventLog() {
        return eventLog;
    }

    /**
     * Sets the value of the eventLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryResponse.EventLog }
     *     
     */
    public void setEventLog(InquiryResponse.EventLog value) {
        this.eventLog = value;
    }

    /**
     * Gets the value of the invoices property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryResponse.Invoices }
     *     
     */
    public InquiryResponse.Invoices getInvoices() {
        return invoices;
    }

    /**
     * Sets the value of the invoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryResponse.Invoices }
     *     
     */
    public void setInvoices(InquiryResponse.Invoices value) {
        this.invoices = value;
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
     *         &lt;element name="Batch" type="{http://schemas.tranzaxis.com/tran.xsd}BatchProcessInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "batch"
    })
    public static class Batches {

        @XmlElement(name = "Batch")
        protected List<BatchProcessInfo> batch;

        /**
         * Gets the value of the batch property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the batch property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBatch().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BatchProcessInfo }
         * 
         * 
         */
        public List<BatchProcessInfo> getBatch() {
            if (batch == null) {
                batch = new ArrayList<BatchProcessInfo>();
            }
            return this.batch;
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
     *         &lt;element name="Packet" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://schemas.radixware.org/cfgManagement-impExp.xsd}Packet"&gt;
     *                 &lt;attribute name="SrcPacketId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="ApplyTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *               &lt;/extension&gt;
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
        "packet"
    })
    public static class CfgPackets {

        @XmlElement(name = "Packet")
        protected List<InquiryResponse.CfgPackets.Packet> packet;

        /**
         * Gets the value of the packet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the packet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPacket().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InquiryResponse.CfgPackets.Packet }
         * 
         * 
         */
        public List<InquiryResponse.CfgPackets.Packet> getPacket() {
            if (packet == null) {
                packet = new ArrayList<InquiryResponse.CfgPackets.Packet>();
            }
            return this.packet;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.radixware.org/cfgManagement-impExp.xsd}Packet"&gt;
         *       &lt;attribute name="SrcPacketId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="ApplyTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Packet
            extends org.radixware.schemas.cfgmanagement_impexp.Packet
        {

            @XmlAttribute(name = "SrcPacketId")
            protected Long srcPacketId;
            @XmlAttribute(name = "ApplyTime")
            protected XMLGregorianCalendar applyTime;

            /**
             * Gets the value of the srcPacketId property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getSrcPacketId() {
                return srcPacketId;
            }

            /**
             * Sets the value of the srcPacketId property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setSrcPacketId(Long value) {
                this.srcPacketId = value;
            }

            /**
             * Gets the value of the applyTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getApplyTime() {
                return applyTime;
            }

            /**
             * Sets the value of the applyTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setApplyTime(XMLGregorianCalendar value) {
                this.applyTime = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Rec" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Message" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Time" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *                 &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Severity" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}EventSeverityEnum" /&gt;
     *                 &lt;attribute name="SourceComponent" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Code" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
        "rec"
    })
    public static class EventLog {

        @XmlElement(name = "Rec", nillable = true)
        protected List<InquiryResponse.EventLog.Rec> rec;

        /**
         * Gets the value of the rec property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rec property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRec().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InquiryResponse.EventLog.Rec }
         * 
         * 
         */
        public List<InquiryResponse.EventLog.Rec> getRec() {
            if (rec == null) {
                rec = new ArrayList<InquiryResponse.EventLog.Rec>();
            }
            return this.rec;
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
         *         &lt;element name="Message" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Time" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Severity" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}EventSeverityEnum" /&gt;
         *       &lt;attribute name="SourceComponent" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Code" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "message"
        })
        public static class Rec {

            @XmlElement(name = "Message")
            protected String message;
            @XmlAttribute(name = "Time", required = true)
            protected XMLGregorianCalendar time;
            @XmlAttribute(name = "Id", required = true)
            protected long id;
            @XmlAttribute(name = "Severity", required = true)
            protected long severity;
            @XmlAttribute(name = "SourceComponent", required = true)
            protected String sourceComponent;
            @XmlAttribute(name = "Code")
            protected String code;

            /**
             * Gets the value of the message property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMessage() {
                return message;
            }

            /**
             * Sets the value of the message property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMessage(String value) {
                this.message = value;
            }

            /**
             * Gets the value of the time property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTime() {
                return time;
            }

            /**
             * Sets the value of the time property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTime(XMLGregorianCalendar value) {
                this.time = value;
            }

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
             * Gets the value of the severity property.
             * 
             */
            public long getSeverity() {
                return severity;
            }

            /**
             * Sets the value of the severity property.
             * 
             */
            public void setSeverity(long value) {
                this.severity = value;
            }

            /**
             * Gets the value of the sourceComponent property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSourceComponent() {
                return sourceComponent;
            }

            /**
             * Sets the value of the sourceComponent property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSourceComponent(String value) {
                this.sourceComponent = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Invoice" type="{http://schemas.tranzaxis.com/invoicing.xsd}AdminInvoice" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        protected List<AdminInvoice> invoice;

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
         * {@link AdminInvoice }
         * 
         * 
         */
        public List<AdminInvoice> getInvoice() {
            if (invoice == null) {
                invoice = new ArrayList<AdminInvoice>();
            }
            return this.invoice;
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
     *         &lt;element name="Metric" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="TypeId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="InstanceId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="UnitId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="ServiceUri" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="NetChannelId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="BegTime" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *                 &lt;attribute name="EndTime" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *                 &lt;attribute name="BegVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="EndVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="MinVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="MaxVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="AvgVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
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
        "metric"
    })
    public static class Metrics {

        @XmlElement(name = "Metric", required = true)
        protected List<InquiryResponse.Metrics.Metric> metric;

        /**
         * Gets the value of the metric property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the metric property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMetric().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InquiryResponse.Metrics.Metric }
         * 
         * 
         */
        public List<InquiryResponse.Metrics.Metric> getMetric() {
            if (metric == null) {
                metric = new ArrayList<InquiryResponse.Metrics.Metric>();
            }
            return this.metric;
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
         *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="TypeId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="InstanceId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="UnitId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="ServiceUri" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="NetChannelId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="BegTime" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *       &lt;attribute name="EndTime" use="required" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *       &lt;attribute name="BegVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="EndVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="MinVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="MaxVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="AvgVal" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Metric {

            @XmlAttribute(name = "Id", required = true)
            protected long id;
            @XmlAttribute(name = "TypeId", required = true)
            protected long typeId;
            @XmlAttribute(name = "Title")
            protected String title;
            @XmlAttribute(name = "InstanceId")
            protected Long instanceId;
            @XmlAttribute(name = "UnitId")
            protected Long unitId;
            @XmlAttribute(name = "ServiceUri")
            protected String serviceUri;
            @XmlAttribute(name = "NetChannelId")
            protected Long netChannelId;
            @XmlAttribute(name = "BegTime", required = true)
            protected XMLGregorianCalendar begTime;
            @XmlAttribute(name = "EndTime", required = true)
            protected XMLGregorianCalendar endTime;
            @XmlAttribute(name = "BegVal")
            protected BigDecimal begVal;
            @XmlAttribute(name = "EndVal")
            protected BigDecimal endVal;
            @XmlAttribute(name = "MinVal")
            protected BigDecimal minVal;
            @XmlAttribute(name = "MaxVal")
            protected BigDecimal maxVal;
            @XmlAttribute(name = "AvgVal")
            protected BigDecimal avgVal;

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
             */
            public long getTypeId() {
                return typeId;
            }

            /**
             * Sets the value of the typeId property.
             * 
             */
            public void setTypeId(long value) {
                this.typeId = value;
            }

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Gets the value of the instanceId property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getInstanceId() {
                return instanceId;
            }

            /**
             * Sets the value of the instanceId property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setInstanceId(Long value) {
                this.instanceId = value;
            }

            /**
             * Gets the value of the unitId property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getUnitId() {
                return unitId;
            }

            /**
             * Sets the value of the unitId property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setUnitId(Long value) {
                this.unitId = value;
            }

            /**
             * Gets the value of the serviceUri property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceUri() {
                return serviceUri;
            }

            /**
             * Sets the value of the serviceUri property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceUri(String value) {
                this.serviceUri = value;
            }

            /**
             * Gets the value of the netChannelId property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getNetChannelId() {
                return netChannelId;
            }

            /**
             * Sets the value of the netChannelId property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setNetChannelId(Long value) {
                this.netChannelId = value;
            }

            /**
             * Gets the value of the begTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getBegTime() {
                return begTime;
            }

            /**
             * Sets the value of the begTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setBegTime(XMLGregorianCalendar value) {
                this.begTime = value;
            }

            /**
             * Gets the value of the endTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEndTime() {
                return endTime;
            }

            /**
             * Sets the value of the endTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEndTime(XMLGregorianCalendar value) {
                this.endTime = value;
            }

            /**
             * Gets the value of the begVal property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBegVal() {
                return begVal;
            }

            /**
             * Sets the value of the begVal property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBegVal(BigDecimal value) {
                this.begVal = value;
            }

            /**
             * Gets the value of the endVal property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getEndVal() {
                return endVal;
            }

            /**
             * Sets the value of the endVal property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setEndVal(BigDecimal value) {
                this.endVal = value;
            }

            /**
             * Gets the value of the minVal property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMinVal() {
                return minVal;
            }

            /**
             * Sets the value of the minVal property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMinVal(BigDecimal value) {
                this.minVal = value;
            }

            /**
             * Gets the value of the maxVal property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMaxVal() {
                return maxVal;
            }

            /**
             * Sets the value of the maxVal property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMaxVal(BigDecimal value) {
                this.maxVal = value;
            }

            /**
             * Gets the value of the avgVal property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAvgVal() {
                return avgVal;
            }

            /**
             * Sets the value of the avgVal property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAvgVal(BigDecimal value) {
                this.avgVal = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Task" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Status"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
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
        "task"
    })
    public static class Tasks {

        @XmlElement(name = "Task", required = true)
        protected List<InquiryResponse.Tasks.Task> task;

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
         * {@link InquiryResponse.Tasks.Task }
         * 
         * 
         */
        public List<InquiryResponse.Tasks.Task> getTask() {
            if (task == null) {
                task = new ArrayList<InquiryResponse.Tasks.Task>();
            }
            return this.task;
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
         *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Status"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *           &lt;/restriction&gt;
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
        public static class Task {

            @XmlAttribute(name = "Id", required = true)
            protected long id;
            @XmlAttribute(name = "Status")
            protected String status;

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
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

        }

    }

}
