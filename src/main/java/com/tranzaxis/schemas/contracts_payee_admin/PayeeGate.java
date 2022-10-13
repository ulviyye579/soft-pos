
package com.tranzaxis.schemas.contracts_payee_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayeeGate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayeeGate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Seq" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Phase1InterfaceId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Phase2InterfaceId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="OnlinePhases" type="{http://schemas.tranzaxis.com/contracts-payee-admin.xsd}PaymentOnlinePhase" minOccurs="0"/&gt;
 *         &lt;element name="InteractionKind" type="{http://schemas.tranzaxis.com/contracts-payee-admin.xsd}InteractionKind" minOccurs="0"/&gt;
 *         &lt;element name="SettlementContractId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="SettlementContractRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayeeGate", propOrder = {
    "title",
    "rid",
    "seq",
    "phase1InterfaceId",
    "phase2InterfaceId",
    "onlinePhases",
    "interactionKind",
    "settlementContractId",
    "settlementContractRid"
})
public class PayeeGate {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Rid")
    protected String rid;
    @XmlElement(name = "Seq")
    protected Long seq;
    @XmlElement(name = "Phase1InterfaceId")
    protected Long phase1InterfaceId;
    @XmlElementRef(name = "Phase2InterfaceId", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> phase2InterfaceId;
    @XmlElementRef(name = "OnlinePhases", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> onlinePhases;
    @XmlElementRef(name = "InteractionKind", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interactionKind;
    @XmlElement(name = "SettlementContractId")
    protected Long settlementContractId;
    @XmlElement(name = "SettlementContractRid")
    protected String settlementContractRid;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;

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
     * Gets the value of the rid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRid() {
        return rid;
    }

    /**
     * Sets the value of the rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRid(String value) {
        this.rid = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeq(Long value) {
        this.seq = value;
    }

    /**
     * Gets the value of the phase1InterfaceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPhase1InterfaceId() {
        return phase1InterfaceId;
    }

    /**
     * Sets the value of the phase1InterfaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPhase1InterfaceId(Long value) {
        this.phase1InterfaceId = value;
    }

    /**
     * Gets the value of the phase2InterfaceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPhase2InterfaceId() {
        return phase2InterfaceId;
    }

    /**
     * Sets the value of the phase2InterfaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPhase2InterfaceId(JAXBElement<Long> value) {
        this.phase2InterfaceId = value;
    }

    /**
     * Gets the value of the onlinePhases property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOnlinePhases() {
        return onlinePhases;
    }

    /**
     * Sets the value of the onlinePhases property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOnlinePhases(JAXBElement<String> value) {
        this.onlinePhases = value;
    }

    /**
     * Gets the value of the interactionKind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInteractionKind() {
        return interactionKind;
    }

    /**
     * Sets the value of the interactionKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInteractionKind(JAXBElement<String> value) {
        this.interactionKind = value;
    }

    /**
     * Gets the value of the settlementContractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSettlementContractId() {
        return settlementContractId;
    }

    /**
     * Sets the value of the settlementContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSettlementContractId(Long value) {
        this.settlementContractId = value;
    }

    /**
     * Gets the value of the settlementContractRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementContractRid() {
        return settlementContractRid;
    }

    /**
     * Sets the value of the settlementContractRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementContractRid(String value) {
        this.settlementContractRid = value;
    }

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
     * Gets the value of the toDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToDelete() {
        return toDelete;
    }

    /**
     * Sets the value of the toDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToDelete(Boolean value) {
        this.toDelete = value;
    }

}
