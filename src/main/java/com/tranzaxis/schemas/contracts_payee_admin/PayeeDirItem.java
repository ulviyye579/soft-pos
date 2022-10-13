
package com.tranzaxis.schemas.contracts_payee_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.ArrStr;
import com.tranzaxis.schemas.common_types.Lexeme;
import org.radixware.schemas.common.UserFunc;


/**
 * <p>Java class for PayeeDirItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayeeDirItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://schemas.tranzaxis.com/common-types.xsd}Lexeme" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.tranzaxis.com/common-types.xsd}Lexeme" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="Seq" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="LogoFileGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="LogoImage" type="{http://schemas.radixware.org/types.xsd}BinBase64" minOccurs="0"/&gt;
 *         &lt;element name="TopicId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TermTypes" type="{http://schemas.tranzaxis.com/contracts-payee-admin.xsd}TermTypes" minOccurs="0"/&gt;
 *         &lt;element name="BranchIds" type="{http://schemas.tranzaxis.com/contracts-payee-admin.xsd}ArrInt" minOccurs="0"/&gt;
 *         &lt;element name="BranchCodes" type="{http://schemas.tranzaxis.com/contracts-payee-admin.xsd}ArrInt" minOccurs="0"/&gt;
 *         &lt;element name="BranchNames" type="{http://schemas.tranzaxis.com/common-types.xsd}ArrStr" minOccurs="0"/&gt;
 *         &lt;element name="Condition" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
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
@XmlType(name = "PayeeDirItem", propOrder = {
    "description",
    "title",
    "isActive",
    "seq",
    "logoFileGuid",
    "logoImage",
    "topicId",
    "termTypes",
    "branchIds",
    "branchCodes",
    "branchNames",
    "condition"
})
public class PayeeDirItem {

    @XmlElementRef(name = "Description", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Lexeme> description;
    @XmlElement(name = "Title")
    protected Lexeme title;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "Seq")
    protected Long seq;
    @XmlElement(name = "LogoFileGuid")
    protected String logoFileGuid;
    @XmlElementRef(name = "LogoImage", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> logoImage;
    @XmlElementRef(name = "TopicId", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> topicId;
    @XmlElementRef(name = "TermTypes", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<TermTypes> termTypes;
    @XmlElementRef(name = "BranchIds", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrInt> branchIds;
    @XmlElementRef(name = "BranchCodes", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrInt> branchCodes;
    @XmlElementRef(name = "BranchNames", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrStr> branchNames;
    @XmlElement(name = "Condition")
    protected UserFunc condition;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Lexeme }{@code >}
     *     
     */
    public JAXBElement<Lexeme> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Lexeme }{@code >}
     *     
     */
    public void setDescription(JAXBElement<Lexeme> value) {
        this.description = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Lexeme }
     *     
     */
    public Lexeme getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lexeme }
     *     
     */
    public void setTitle(Lexeme value) {
        this.title = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
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
     * Gets the value of the logoFileGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoFileGuid() {
        return logoFileGuid;
    }

    /**
     * Sets the value of the logoFileGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoFileGuid(String value) {
        this.logoFileGuid = value;
    }

    /**
     * Gets the value of the logoImage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getLogoImage() {
        return logoImage;
    }

    /**
     * Sets the value of the logoImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setLogoImage(JAXBElement<byte[]> value) {
        this.logoImage = value;
    }

    /**
     * Gets the value of the topicId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTopicId() {
        return topicId;
    }

    /**
     * Sets the value of the topicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTopicId(JAXBElement<Long> value) {
        this.topicId = value;
    }

    /**
     * Gets the value of the termTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermTypes }{@code >}
     *     
     */
    public JAXBElement<TermTypes> getTermTypes() {
        return termTypes;
    }

    /**
     * Sets the value of the termTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermTypes }{@code >}
     *     
     */
    public void setTermTypes(JAXBElement<TermTypes> value) {
        this.termTypes = value;
    }

    /**
     * Gets the value of the branchIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrInt }{@code >}
     *     
     */
    public JAXBElement<ArrInt> getBranchIds() {
        return branchIds;
    }

    /**
     * Sets the value of the branchIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrInt }{@code >}
     *     
     */
    public void setBranchIds(JAXBElement<ArrInt> value) {
        this.branchIds = value;
    }

    /**
     * Gets the value of the branchCodes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrInt }{@code >}
     *     
     */
    public JAXBElement<ArrInt> getBranchCodes() {
        return branchCodes;
    }

    /**
     * Sets the value of the branchCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrInt }{@code >}
     *     
     */
    public void setBranchCodes(JAXBElement<ArrInt> value) {
        this.branchCodes = value;
    }

    /**
     * Gets the value of the branchNames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrStr }{@code >}
     *     
     */
    public JAXBElement<ArrStr> getBranchNames() {
        return branchNames;
    }

    /**
     * Sets the value of the branchNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrStr }{@code >}
     *     
     */
    public void setBranchNames(JAXBElement<ArrStr> value) {
        this.branchNames = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link UserFunc }
     *     
     */
    public UserFunc getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFunc }
     *     
     */
    public void setCondition(UserFunc value) {
        this.condition = value;
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
