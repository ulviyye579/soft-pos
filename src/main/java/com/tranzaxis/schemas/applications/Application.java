
package com.tranzaxis.schemas.applications;

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
import com.tranzaxis.schemas.common_types.Attachments;
import com.tranzaxis.schemas.common_types.ParamValues;


/**
 * <p>Java class for Application complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Application"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Key" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="ContextContractId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ContextTokenId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TypeTitle" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="TypeDescription" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="FinishTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Attrs" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *         &lt;element name="Attachments" type="{http://schemas.tranzaxis.com/common-types.xsd}Attachments" minOccurs="0"/&gt;
 *         &lt;element name="Messages" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Message" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Text" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Time" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *                           &lt;attribute name="FromCustomer" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="VisibleForCustomer" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="HasBeenRead" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="Importance" type="{http://schemas.tranzaxis.com/applications.xsd}Importance" /&gt;
 *                           &lt;attribute name="UserName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
 *                           &lt;attribute name="SkipReadingCounter" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContextContract" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContextToken" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="UseTokenAsContext" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TypeRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ClientId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ClientRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Guid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Status" type="{http://schemas.tranzaxis.com/applications.xsd}AppStatus" /&gt;
 *       &lt;attribute name="SrcStatus" type="{http://schemas.tranzaxis.com/applications.xsd}AppStatus" /&gt;
 *       &lt;attribute name="DestStatus" type="{http://schemas.tranzaxis.com/applications.xsd}AppStatus" /&gt;
 *       &lt;attribute name="PhaseId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="PhaseRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="SrcPhaseId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="SrcPhaseRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="DestPhaseId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="DestPhaseRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="CreateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="LastProcessTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Application", propOrder = {
    "rid",
    "key",
    "title",
    "comment",
    "contextContractId",
    "contextTokenId",
    "typeTitle",
    "typeDescription",
    "finishTime",
    "data",
    "attrs",
    "attachments",
    "messages",
    "contextContract",
    "contextToken"
})
public class Application {

    @XmlElementRef(name = "Rid", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rid;
    @XmlElementRef(name = "Key", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> key;
    @XmlElementRef(name = "Title", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "Comment", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "ContextContractId", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> contextContractId;
    @XmlElementRef(name = "ContextTokenId", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> contextTokenId;
    @XmlElement(name = "TypeTitle")
    protected String typeTitle;
    @XmlElementRef(name = "TypeDescription", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeDescription;
    @XmlElementRef(name = "FinishTime", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> finishTime;
    @XmlElement(name = "Data")
    protected Object data;
    @XmlElement(name = "Attrs")
    protected ParamValues attrs;
    @XmlElement(name = "Attachments")
    protected Attachments attachments;
    @XmlElement(name = "Messages")
    protected Application.Messages messages;
    @XmlElement(name = "ContextContract")
    protected Application.ContextContract contextContract;
    @XmlElement(name = "ContextToken")
    protected Application.ContextToken contextToken;
    @XmlAttribute(name = "TypeId")
    protected Long typeId;
    @XmlAttribute(name = "TypeRid")
    protected String typeRid;
    @XmlAttribute(name = "ClientId")
    protected Long clientId;
    @XmlAttribute(name = "ClientRid")
    protected String clientRid;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "Guid")
    protected String guid;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "SrcStatus")
    protected String srcStatus;
    @XmlAttribute(name = "DestStatus")
    protected String destStatus;
    @XmlAttribute(name = "PhaseId")
    protected Long phaseId;
    @XmlAttribute(name = "PhaseRid")
    protected String phaseRid;
    @XmlAttribute(name = "SrcPhaseId")
    protected Long srcPhaseId;
    @XmlAttribute(name = "SrcPhaseRid")
    protected String srcPhaseRid;
    @XmlAttribute(name = "DestPhaseId")
    protected Long destPhaseId;
    @XmlAttribute(name = "DestPhaseRid")
    protected String destPhaseRid;
    @XmlAttribute(name = "CreateTime")
    protected XMLGregorianCalendar createTime;
    @XmlAttribute(name = "LastProcessTime")
    protected XMLGregorianCalendar lastProcessTime;

    /**
     * Gets the value of the rid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRid() {
        return rid;
    }

    /**
     * Sets the value of the rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRid(JAXBElement<String> value) {
        this.rid = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKey(JAXBElement<String> value) {
        this.key = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = value;
    }

    /**
     * Gets the value of the contextContractId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getContextContractId() {
        return contextContractId;
    }

    /**
     * Sets the value of the contextContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setContextContractId(JAXBElement<Long> value) {
        this.contextContractId = value;
    }

    /**
     * Gets the value of the contextTokenId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getContextTokenId() {
        return contextTokenId;
    }

    /**
     * Sets the value of the contextTokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setContextTokenId(JAXBElement<Long> value) {
        this.contextTokenId = value;
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
     * Gets the value of the typeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeDescription() {
        return typeDescription;
    }

    /**
     * Sets the value of the typeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeDescription(JAXBElement<String> value) {
        this.typeDescription = value;
    }

    /**
     * Gets the value of the finishTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFinishTime() {
        return finishTime;
    }

    /**
     * Sets the value of the finishTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFinishTime(JAXBElement<XMLGregorianCalendar> value) {
        this.finishTime = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setData(Object value) {
        this.data = value;
    }

    /**
     * Gets the value of the attrs property.
     * 
     * @return
     *     possible object is
     *     {@link ParamValues }
     *     
     */
    public ParamValues getAttrs() {
        return attrs;
    }

    /**
     * Sets the value of the attrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamValues }
     *     
     */
    public void setAttrs(ParamValues value) {
        this.attrs = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link Attachments }
     *     
     */
    public Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachments }
     *     
     */
    public void setAttachments(Attachments value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link Application.Messages }
     *     
     */
    public Application.Messages getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Application.Messages }
     *     
     */
    public void setMessages(Application.Messages value) {
        this.messages = value;
    }

    /**
     * Gets the value of the contextContract property.
     * 
     * @return
     *     possible object is
     *     {@link Application.ContextContract }
     *     
     */
    public Application.ContextContract getContextContract() {
        return contextContract;
    }

    /**
     * Sets the value of the contextContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Application.ContextContract }
     *     
     */
    public void setContextContract(Application.ContextContract value) {
        this.contextContract = value;
    }

    /**
     * Gets the value of the contextToken property.
     * 
     * @return
     *     possible object is
     *     {@link Application.ContextToken }
     *     
     */
    public Application.ContextToken getContextToken() {
        return contextToken;
    }

    /**
     * Sets the value of the contextToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Application.ContextToken }
     *     
     */
    public void setContextToken(Application.ContextToken value) {
        this.contextToken = value;
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
     * Gets the value of the typeRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeRid() {
        return typeRid;
    }

    /**
     * Sets the value of the typeRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeRid(String value) {
        this.typeRid = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientId(Long value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the clientRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientRid() {
        return clientRid;
    }

    /**
     * Sets the value of the clientRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientRid(String value) {
        this.clientRid = value;
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
     * Gets the value of the srcStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcStatus() {
        return srcStatus;
    }

    /**
     * Sets the value of the srcStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcStatus(String value) {
        this.srcStatus = value;
    }

    /**
     * Gets the value of the destStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestStatus() {
        return destStatus;
    }

    /**
     * Sets the value of the destStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestStatus(String value) {
        this.destStatus = value;
    }

    /**
     * Gets the value of the phaseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPhaseId() {
        return phaseId;
    }

    /**
     * Sets the value of the phaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPhaseId(Long value) {
        this.phaseId = value;
    }

    /**
     * Gets the value of the phaseRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhaseRid() {
        return phaseRid;
    }

    /**
     * Sets the value of the phaseRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhaseRid(String value) {
        this.phaseRid = value;
    }

    /**
     * Gets the value of the srcPhaseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSrcPhaseId() {
        return srcPhaseId;
    }

    /**
     * Sets the value of the srcPhaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSrcPhaseId(Long value) {
        this.srcPhaseId = value;
    }

    /**
     * Gets the value of the srcPhaseRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcPhaseRid() {
        return srcPhaseRid;
    }

    /**
     * Sets the value of the srcPhaseRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcPhaseRid(String value) {
        this.srcPhaseRid = value;
    }

    /**
     * Gets the value of the destPhaseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestPhaseId() {
        return destPhaseId;
    }

    /**
     * Sets the value of the destPhaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestPhaseId(Long value) {
        this.destPhaseId = value;
    }

    /**
     * Gets the value of the destPhaseRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestPhaseRid() {
        return destPhaseRid;
    }

    /**
     * Sets the value of the destPhaseRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestPhaseRid(String value) {
        this.destPhaseRid = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the lastProcessTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastProcessTime() {
        return lastProcessTime;
    }

    /**
     * Sets the value of the lastProcessTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastProcessTime(XMLGregorianCalendar value) {
        this.lastProcessTime = value;
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
     *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ContextContract {

        @XmlAttribute(name = "Rid")
        protected String rid;
        @XmlAttribute(name = "ExtRid")
        protected String extRid;

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
         * Gets the value of the extRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtRid() {
            return extRid;
        }

        /**
         * Sets the value of the extRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtRid(String value) {
            this.extRid = value;
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
     *       &lt;attribute name="ExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="UseTokenAsContext" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ContextToken {

        @XmlAttribute(name = "ExtRid")
        protected String extRid;
        @XmlAttribute(name = "UseTokenAsContext")
        protected Boolean useTokenAsContext;

        /**
         * Gets the value of the extRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtRid() {
            return extRid;
        }

        /**
         * Sets the value of the extRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtRid(String value) {
            this.extRid = value;
        }

        /**
         * Gets the value of the useTokenAsContext property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isUseTokenAsContext() {
            return useTokenAsContext;
        }

        /**
         * Sets the value of the useTokenAsContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUseTokenAsContext(Boolean value) {
            this.useTokenAsContext = value;
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
     *         &lt;element name="Message" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Text" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Time" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
     *                 &lt;attribute name="FromCustomer" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="VisibleForCustomer" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="HasBeenRead" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="Importance" type="{http://schemas.tranzaxis.com/applications.xsd}Importance" /&gt;
     *                 &lt;attribute name="UserName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
     *                 &lt;attribute name="SkipReadingCounter" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
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
        "message"
    })
    public static class Messages {

        @XmlElement(name = "Message")
        protected List<Application.Messages.Message> message;

        /**
         * Gets the value of the message property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the message property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Application.Messages.Message }
         * 
         * 
         */
        public List<Application.Messages.Message> getMessage() {
            if (message == null) {
                message = new ArrayList<Application.Messages.Message>();
            }
            return this.message;
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
         *         &lt;element name="Text" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Time" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
         *       &lt;attribute name="FromCustomer" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="VisibleForCustomer" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="HasBeenRead" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="Importance" type="{http://schemas.tranzaxis.com/applications.xsd}Importance" /&gt;
         *       &lt;attribute name="UserName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" default="false" /&gt;
         *       &lt;attribute name="SkipReadingCounter" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "text"
        })
        public static class Message {

            @XmlElement(name = "Text")
            protected String text;
            @XmlAttribute(name = "Id")
            protected Long id;
            @XmlAttribute(name = "Time")
            protected XMLGregorianCalendar time;
            @XmlAttribute(name = "FromCustomer")
            protected Boolean fromCustomer;
            @XmlAttribute(name = "VisibleForCustomer")
            protected Boolean visibleForCustomer;
            @XmlAttribute(name = "HasBeenRead")
            protected Boolean hasBeenRead;
            @XmlAttribute(name = "Importance")
            protected Long importance;
            @XmlAttribute(name = "UserName")
            protected String userName;
            @XmlAttribute(name = "ToDelete")
            protected Boolean toDelete;
            @XmlAttribute(name = "SkipReadingCounter")
            protected Long skipReadingCounter;

            /**
             * Gets the value of the text property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return text;
            }

            /**
             * Sets the value of the text property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.text = value;
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
             * Gets the value of the fromCustomer property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFromCustomer() {
                return fromCustomer;
            }

            /**
             * Sets the value of the fromCustomer property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFromCustomer(Boolean value) {
                this.fromCustomer = value;
            }

            /**
             * Gets the value of the visibleForCustomer property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isVisibleForCustomer() {
                return visibleForCustomer;
            }

            /**
             * Sets the value of the visibleForCustomer property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setVisibleForCustomer(Boolean value) {
                this.visibleForCustomer = value;
            }

            /**
             * Gets the value of the hasBeenRead property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isHasBeenRead() {
                return hasBeenRead;
            }

            /**
             * Sets the value of the hasBeenRead property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setHasBeenRead(Boolean value) {
                this.hasBeenRead = value;
            }

            /**
             * Gets the value of the importance property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getImportance() {
                return importance;
            }

            /**
             * Sets the value of the importance property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setImportance(Long value) {
                this.importance = value;
            }

            /**
             * Gets the value of the userName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUserName() {
                return userName;
            }

            /**
             * Sets the value of the userName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUserName(String value) {
                this.userName = value;
            }

            /**
             * Gets the value of the toDelete property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isToDelete() {
                if (toDelete == null) {
                    return false;
                } else {
                    return toDelete;
                }
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

            /**
             * Gets the value of the skipReadingCounter property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getSkipReadingCounter() {
                return skipReadingCounter;
            }

            /**
             * Sets the value of the skipReadingCounter property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setSkipReadingCounter(Long value) {
                this.skipReadingCounter = value;
            }

        }

    }

}
