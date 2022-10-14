
package com.tranzaxis.schemas.tokens_admin;

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
import com.tranzaxis.schemas.common_types.ParamValues;
import org.radixware.schemas.common.UserProps;


/**
 * <p>Java class for TokenPackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenPackage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LifePhaseId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="LifePhaseRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CardDesignId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ContractId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ContractRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CreateTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreateUserName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryBranchId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryBranchCode" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryBranchName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="DepartmentId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="TokenCount" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TokenProductId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TransformedFromPackageId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TransformedToPackageId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="UserAttrs" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *         &lt;element name="UserProps" type="{http://schemas.radixware.org/common.xsd}UserProps" minOccurs="0"/&gt;
 *         &lt;element name="Bin" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}TerminalBin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TerminalId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="InstId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="BranchId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="BranchCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="BranchName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TypeRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenPackage", propOrder = {
    "lifePhaseId",
    "lifePhaseRid",
    "cardDesignId",
    "contractId",
    "contractRid",
    "createTime",
    "createUserName",
    "deliveryBranchId",
    "deliveryBranchCode",
    "deliveryBranchName",
    "departmentId",
    "notes",
    "tokenCount",
    "tokenProductId",
    "transformedFromPackageId",
    "transformedToPackageId",
    "userAttrs",
    "userProps",
    "bin",
    "terminalId"
})
public class TokenPackage {

    @XmlElementRef(name = "LifePhaseId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lifePhaseId;
    @XmlElement(name = "LifePhaseRid")
    protected String lifePhaseRid;
    @XmlElementRef(name = "CardDesignId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> cardDesignId;
    @XmlElementRef(name = "ContractId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> contractId;
    @XmlElement(name = "ContractRid")
    protected String contractRid;
    @XmlElementRef(name = "CreateTime", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createTime;
    @XmlElementRef(name = "CreateUserName", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createUserName;
    @XmlElementRef(name = "DeliveryBranchId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> deliveryBranchId;
    @XmlElementRef(name = "DeliveryBranchCode", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> deliveryBranchCode;
    @XmlElementRef(name = "DeliveryBranchName", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryBranchName;
    @XmlElementRef(name = "DepartmentId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> departmentId;
    @XmlElementRef(name = "Notes", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElementRef(name = "TokenCount", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> tokenCount;
    @XmlElementRef(name = "TokenProductId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> tokenProductId;
    @XmlElementRef(name = "TransformedFromPackageId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> transformedFromPackageId;
    @XmlElementRef(name = "TransformedToPackageId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> transformedToPackageId;
    @XmlElement(name = "UserAttrs")
    protected ParamValues userAttrs;
    @XmlElementRef(name = "UserProps", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserProps> userProps;
    @XmlElement(name = "Bin")
    protected List<TerminalBin> bin;
    @XmlElementRef(name = "TerminalId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> terminalId;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "Rid")
    protected String rid;
    @XmlAttribute(name = "InstId")
    protected Long instId;
    @XmlAttribute(name = "BranchId")
    protected Long branchId;
    @XmlAttribute(name = "BranchCode")
    protected Long branchCode;
    @XmlAttribute(name = "BranchName")
    protected String branchName;
    @XmlAttribute(name = "TypeId")
    protected Long typeId;
    @XmlAttribute(name = "TypeRid")
    protected String typeRid;

    /**
     * Gets the value of the lifePhaseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLifePhaseId() {
        return lifePhaseId;
    }

    /**
     * Sets the value of the lifePhaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLifePhaseId(JAXBElement<Long> value) {
        this.lifePhaseId = value;
    }

    /**
     * Gets the value of the lifePhaseRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifePhaseRid() {
        return lifePhaseRid;
    }

    /**
     * Sets the value of the lifePhaseRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifePhaseRid(String value) {
        this.lifePhaseRid = value;
    }

    /**
     * Gets the value of the cardDesignId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCardDesignId() {
        return cardDesignId;
    }

    /**
     * Sets the value of the cardDesignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCardDesignId(JAXBElement<Long> value) {
        this.cardDesignId = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setContractId(JAXBElement<Long> value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the contractRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractRid() {
        return contractRid;
    }

    /**
     * Sets the value of the contractRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractRid(String value) {
        this.contractRid = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the createUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreateUserName() {
        return createUserName;
    }

    /**
     * Sets the value of the createUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreateUserName(JAXBElement<String> value) {
        this.createUserName = value;
    }

    /**
     * Gets the value of the deliveryBranchId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDeliveryBranchId() {
        return deliveryBranchId;
    }

    /**
     * Sets the value of the deliveryBranchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDeliveryBranchId(JAXBElement<Long> value) {
        this.deliveryBranchId = value;
    }

    /**
     * Gets the value of the deliveryBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDeliveryBranchCode() {
        return deliveryBranchCode;
    }

    /**
     * Sets the value of the deliveryBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDeliveryBranchCode(JAXBElement<Long> value) {
        this.deliveryBranchCode = value;
    }

    /**
     * Gets the value of the deliveryBranchName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryBranchName() {
        return deliveryBranchName;
    }

    /**
     * Sets the value of the deliveryBranchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryBranchName(JAXBElement<String> value) {
        this.deliveryBranchName = value;
    }

    /**
     * Gets the value of the departmentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDepartmentId() {
        return departmentId;
    }

    /**
     * Sets the value of the departmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDepartmentId(JAXBElement<Long> value) {
        this.departmentId = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotes(JAXBElement<String> value) {
        this.notes = value;
    }

    /**
     * Gets the value of the tokenCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTokenCount() {
        return tokenCount;
    }

    /**
     * Sets the value of the tokenCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTokenCount(JAXBElement<Long> value) {
        this.tokenCount = value;
    }

    /**
     * Gets the value of the tokenProductId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTokenProductId() {
        return tokenProductId;
    }

    /**
     * Sets the value of the tokenProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTokenProductId(JAXBElement<Long> value) {
        this.tokenProductId = value;
    }

    /**
     * Gets the value of the transformedFromPackageId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTransformedFromPackageId() {
        return transformedFromPackageId;
    }

    /**
     * Sets the value of the transformedFromPackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTransformedFromPackageId(JAXBElement<Long> value) {
        this.transformedFromPackageId = value;
    }

    /**
     * Gets the value of the transformedToPackageId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTransformedToPackageId() {
        return transformedToPackageId;
    }

    /**
     * Sets the value of the transformedToPackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTransformedToPackageId(JAXBElement<Long> value) {
        this.transformedToPackageId = value;
    }

    /**
     * Gets the value of the userAttrs property.
     * 
     * @return
     *     possible object is
     *     {@link ParamValues }
     *     
     */
    public ParamValues getUserAttrs() {
        return userAttrs;
    }

    /**
     * Sets the value of the userAttrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamValues }
     *     
     */
    public void setUserAttrs(ParamValues value) {
        this.userAttrs = value;
    }

    /**
     * Gets the value of the userProps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserProps }{@code >}
     *     
     */
    public JAXBElement<UserProps> getUserProps() {
        return userProps;
    }

    /**
     * Sets the value of the userProps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserProps }{@code >}
     *     
     */
    public void setUserProps(JAXBElement<UserProps> value) {
        this.userProps = value;
    }

    /**
     * Gets the value of the bin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminalBin }
     * 
     * 
     */
    public List<TerminalBin> getBin() {
        if (bin == null) {
            bin = new ArrayList<TerminalBin>();
        }
        return this.bin;
    }

    /**
     * Gets the value of the terminalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTerminalId(JAXBElement<Long> value) {
        this.terminalId = value;
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
     * Gets the value of the instId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInstId() {
        return instId;
    }

    /**
     * Sets the value of the instId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInstId(Long value) {
        this.instId = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBranchId(Long value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBranchCode(Long value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
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

}
