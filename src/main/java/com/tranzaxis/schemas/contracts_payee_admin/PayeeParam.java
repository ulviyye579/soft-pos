
package com.tranzaxis.schemas.contracts_payee_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.InputFormat;
import com.tranzaxis.schemas.common_types.Lexeme;
import org.radixware.schemas.common.UserFunc;


/**
 * <p>Java class for PayeeParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayeeParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InitVal" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.tranzaxis.com/common-types.xsd}Lexeme" minOccurs="0"/&gt;
 *         &lt;element name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Seq" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TemplateId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="GroupTitle" type="{http://schemas.tranzaxis.com/common-types.xsd}Lexeme" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://schemas.tranzaxis.com/common-types.xsd}Lexeme" minOccurs="0"/&gt;
 *         &lt;element name="BeforeBill" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="IsHidden" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="IsNumrical" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="InputFormat" type="{http://schemas.tranzaxis.com/common-types.xsd}InputFormat" minOccurs="0"/&gt;
 *         &lt;element name="InputFormatFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *         &lt;element name="ValidatorFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
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
@XmlType(name = "PayeeParam", propOrder = {
    "initVal",
    "title",
    "rid",
    "seq",
    "templateId",
    "groupTitle",
    "description",
    "beforeBill",
    "isHidden",
    "isNumrical",
    "inputFormat",
    "inputFormatFunc",
    "validatorFunc"
})
public class PayeeParam {

    @XmlElementRef(name = "InitVal", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> initVal;
    @XmlElement(name = "Title")
    protected Lexeme title;
    @XmlElement(name = "Rid")
    protected String rid;
    @XmlElement(name = "Seq")
    protected Long seq;
    @XmlElement(name = "TemplateId")
    protected Long templateId;
    @XmlElementRef(name = "GroupTitle", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Lexeme> groupTitle;
    @XmlElementRef(name = "Description", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Lexeme> description;
    @XmlElement(name = "BeforeBill")
    protected Boolean beforeBill;
    @XmlElement(name = "IsHidden")
    protected Boolean isHidden;
    @XmlElement(name = "IsNumrical")
    protected Boolean isNumrical;
    @XmlElementRef(name = "InputFormat", namespace = "http://schemas.tranzaxis.com/contracts-payee-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<InputFormat> inputFormat;
    @XmlElement(name = "InputFormatFunc")
    protected UserFunc inputFormatFunc;
    @XmlElement(name = "ValidatorFunc")
    protected UserFunc validatorFunc;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;

    /**
     * Gets the value of the initVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInitVal() {
        return initVal;
    }

    /**
     * Sets the value of the initVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInitVal(JAXBElement<String> value) {
        this.initVal = value;
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
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTemplateId(Long value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the groupTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Lexeme }{@code >}
     *     
     */
    public JAXBElement<Lexeme> getGroupTitle() {
        return groupTitle;
    }

    /**
     * Sets the value of the groupTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Lexeme }{@code >}
     *     
     */
    public void setGroupTitle(JAXBElement<Lexeme> value) {
        this.groupTitle = value;
    }

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
     * Gets the value of the beforeBill property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeforeBill() {
        return beforeBill;
    }

    /**
     * Sets the value of the beforeBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeforeBill(Boolean value) {
        this.beforeBill = value;
    }

    /**
     * Gets the value of the isHidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Sets the value of the isHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHidden(Boolean value) {
        this.isHidden = value;
    }

    /**
     * Gets the value of the isNumrical property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNumrical() {
        return isNumrical;
    }

    /**
     * Sets the value of the isNumrical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNumrical(Boolean value) {
        this.isNumrical = value;
    }

    /**
     * Gets the value of the inputFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InputFormat }{@code >}
     *     
     */
    public JAXBElement<InputFormat> getInputFormat() {
        return inputFormat;
    }

    /**
     * Sets the value of the inputFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InputFormat }{@code >}
     *     
     */
    public void setInputFormat(JAXBElement<InputFormat> value) {
        this.inputFormat = value;
    }

    /**
     * Gets the value of the inputFormatFunc property.
     * 
     * @return
     *     possible object is
     *     {@link UserFunc }
     *     
     */
    public UserFunc getInputFormatFunc() {
        return inputFormatFunc;
    }

    /**
     * Sets the value of the inputFormatFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFunc }
     *     
     */
    public void setInputFormatFunc(UserFunc value) {
        this.inputFormatFunc = value;
    }

    /**
     * Gets the value of the validatorFunc property.
     * 
     * @return
     *     possible object is
     *     {@link UserFunc }
     *     
     */
    public UserFunc getValidatorFunc() {
        return validatorFunc;
    }

    /**
     * Sets the value of the validatorFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFunc }
     *     
     */
    public void setValidatorFunc(UserFunc value) {
        this.validatorFunc = value;
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
