
package com.tranzaxis.schemas.fraudreport;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FraudReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FraudReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FraudTranId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NetworkId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="NetworkType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NetworkReason" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="StatusDesc" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="RespTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="SenderInstBin" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Network" type="{http://schemas.tranzaxis.com/fraudReport.xsd}SpecificInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudReport", propOrder = {
    "fraudTranId",
    "status",
    "networkId",
    "networkType",
    "networkReason",
    "statusDesc",
    "description",
    "respTime",
    "senderInstBin",
    "id",
    "network"
})
public class FraudReport {

    @XmlElement(name = "FraudTranId")
    protected Long fraudTranId;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElementRef(name = "NetworkId", namespace = "http://schemas.tranzaxis.com/fraudReport.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> networkId;
    @XmlElementRef(name = "NetworkType", namespace = "http://schemas.tranzaxis.com/fraudReport.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkType;
    @XmlElementRef(name = "NetworkReason", namespace = "http://schemas.tranzaxis.com/fraudReport.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkReason;
    @XmlElementRef(name = "StatusDesc", namespace = "http://schemas.tranzaxis.com/fraudReport.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusDesc;
    @XmlElementRef(name = "Description", namespace = "http://schemas.tranzaxis.com/fraudReport.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "RespTime", namespace = "http://schemas.tranzaxis.com/fraudReport.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> respTime;
    @XmlElementRef(name = "SenderInstBin", namespace = "http://schemas.tranzaxis.com/fraudReport.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderInstBin;
    @XmlElementRef(name = "Id", namespace = "http://schemas.tranzaxis.com/fraudReport.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> id;
    @XmlElement(name = "Network")
    protected SpecificInfo network;

    /**
     * Gets the value of the fraudTranId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFraudTranId() {
        return fraudTranId;
    }

    /**
     * Sets the value of the fraudTranId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFraudTranId(Long value) {
        this.fraudTranId = value;
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

    /**
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNetworkId(JAXBElement<Long> value) {
        this.networkId = value;
    }

    /**
     * Gets the value of the networkType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkType() {
        return networkType;
    }

    /**
     * Sets the value of the networkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkType(JAXBElement<String> value) {
        this.networkType = value;
    }

    /**
     * Gets the value of the networkReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkReason() {
        return networkReason;
    }

    /**
     * Sets the value of the networkReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkReason(JAXBElement<String> value) {
        this.networkReason = value;
    }

    /**
     * Gets the value of the statusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusDesc(JAXBElement<String> value) {
        this.statusDesc = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the respTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRespTime() {
        return respTime;
    }

    /**
     * Sets the value of the respTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRespTime(JAXBElement<XMLGregorianCalendar> value) {
        this.respTime = value;
    }

    /**
     * Gets the value of the senderInstBin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderInstBin() {
        return senderInstBin;
    }

    /**
     * Sets the value of the senderInstBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderInstBin(JAXBElement<String> value) {
        this.senderInstBin = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setId(JAXBElement<Long> value) {
        this.id = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificInfo }
     *     
     */
    public SpecificInfo getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificInfo }
     *     
     */
    public void setNetwork(SpecificInfo value) {
        this.network = value;
    }

}
