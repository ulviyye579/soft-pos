
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UpdateEtuMerchantSpecific complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateEtuMerchantSpecific"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RequestDate" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="SubjectId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="SettleContractId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="MerchantRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="MerchantName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Mcc" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="IsFailure" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="IsNewMerchantRid" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="Error" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Code" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="Description" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
@XmlType(name = "UpdateEtuMerchantSpecific", propOrder = {
    "requestType",
    "requestDate",
    "subjectId",
    "settleContractId",
    "merchantRid",
    "merchantName",
    "mcc",
    "isFailure",
    "isNewMerchantRid",
    "error"
})
public class UpdateEtuMerchantSpecific {

    @XmlElement(name = "RequestType", required = true)
    protected String requestType;
    @XmlElement(name = "RequestDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDate;
    @XmlElement(name = "SubjectId")
    protected Long subjectId;
    @XmlElement(name = "SettleContractId")
    protected Long settleContractId;
    @XmlElement(name = "MerchantRid")
    protected String merchantRid;
    @XmlElement(name = "MerchantName")
    protected String merchantName;
    @XmlElement(name = "Mcc")
    protected Long mcc;
    @XmlElement(name = "IsFailure")
    protected Boolean isFailure;
    @XmlElement(name = "IsNewMerchantRid")
    protected Boolean isNewMerchantRid;
    @XmlElement(name = "Error")
    protected List<UpdateEtuMerchantSpecific.Error> error;

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the subjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * Sets the value of the subjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubjectId(Long value) {
        this.subjectId = value;
    }

    /**
     * Gets the value of the settleContractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSettleContractId() {
        return settleContractId;
    }

    /**
     * Sets the value of the settleContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSettleContractId(Long value) {
        this.settleContractId = value;
    }

    /**
     * Gets the value of the merchantRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantRid() {
        return merchantRid;
    }

    /**
     * Sets the value of the merchantRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantRid(String value) {
        this.merchantRid = value;
    }

    /**
     * Gets the value of the merchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Sets the value of the merchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMcc() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMcc(Long value) {
        this.mcc = value;
    }

    /**
     * Gets the value of the isFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFailure() {
        return isFailure;
    }

    /**
     * Sets the value of the isFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFailure(Boolean value) {
        this.isFailure = value;
    }

    /**
     * Gets the value of the isNewMerchantRid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNewMerchantRid() {
        return isNewMerchantRid;
    }

    /**
     * Sets the value of the isNewMerchantRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNewMerchantRid(Boolean value) {
        this.isNewMerchantRid = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateEtuMerchantSpecific.Error }
     * 
     * 
     */
    public List<UpdateEtuMerchantSpecific.Error> getError() {
        if (error == null) {
            error = new ArrayList<UpdateEtuMerchantSpecific.Error>();
        }
        return this.error;
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
     *       &lt;attribute name="Code" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="Description" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Error {

        @XmlAttribute(name = "Code", required = true)
        protected String code;
        @XmlAttribute(name = "Description")
        protected String description;

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

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

    }

}
