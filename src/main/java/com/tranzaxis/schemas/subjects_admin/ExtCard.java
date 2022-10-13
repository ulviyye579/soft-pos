
package com.tranzaxis.schemas.subjects_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.AppEncryptedData;
import com.tranzaxis.schemas.tran_common.CofMatch;
import com.tranzaxis.schemas.tran_common.PersonInfo;


/**
 * <p>Java class for ExtCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mbr" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ClassGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="PanCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *         &lt;element name="Pvv" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Pvki" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="PersonInfo" type="{http://schemas.tranzaxis.com/tran-common.xsd}PersonInfo" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTemplates" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}PaymentTemplates" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://schemas.tranzaxis.com/tran-common.xsd}TokenStatus" minOccurs="0"/&gt;
 *         &lt;element name="CofMatch" type="{http://schemas.tranzaxis.com/tran-common.xsd}CofMatch" minOccurs="0"/&gt;
 *         &lt;element name="Seq" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="CheckTranId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="ActivateTill" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="BinNetworkId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="SettleContractId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="EtuStatus" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}ExtCardEtuStatus" minOccurs="0"/&gt;
 *         &lt;element name="EtuStatusDesc" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="EtuStatusReqTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="EtuStatusUpdTime" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Pan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="OwnerSubjectId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtCard", propOrder = {
    "mbr",
    "expDate",
    "classGuid",
    "panCrypt",
    "pvv",
    "pvki",
    "personInfo",
    "paymentTemplates",
    "status",
    "cofMatch",
    "seq",
    "title",
    "checkTranId",
    "activateTill",
    "binNetworkId",
    "settleContractId",
    "etuStatus",
    "etuStatusDesc",
    "etuStatusReqTime",
    "etuStatusUpdTime"
})
public class ExtCard {

    @XmlElementRef(name = "Mbr", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> mbr;
    @XmlElementRef(name = "ExpDate", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expDate;
    @XmlElement(name = "ClassGuid")
    protected String classGuid;
    @XmlElement(name = "PanCrypt")
    protected AppEncryptedData panCrypt;
    @XmlElementRef(name = "Pvv", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pvv;
    @XmlElementRef(name = "Pvki", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> pvki;
    @XmlElement(name = "PersonInfo")
    protected PersonInfo personInfo;
    @XmlElement(name = "PaymentTemplates")
    protected PaymentTemplates paymentTemplates;
    @XmlElementRef(name = "Status", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElement(name = "CofMatch")
    protected CofMatch cofMatch;
    @XmlElement(name = "Seq")
    protected Long seq;
    @XmlElementRef(name = "Title", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "CheckTranId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> checkTranId;
    @XmlElementRef(name = "ActivateTill", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> activateTill;
    @XmlElementRef(name = "BinNetworkId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> binNetworkId;
    @XmlElementRef(name = "SettleContractId", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> settleContractId;
    @XmlElementRef(name = "EtuStatus", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etuStatus;
    @XmlElementRef(name = "EtuStatusDesc", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etuStatusDesc;
    @XmlElementRef(name = "EtuStatusReqTime", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> etuStatusReqTime;
    @XmlElementRef(name = "EtuStatusUpdTime", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> etuStatusUpdTime;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "Pan")
    protected String pan;
    @XmlAttribute(name = "OwnerSubjectId")
    protected Long ownerSubjectId;

    /**
     * Gets the value of the mbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMbr() {
        return mbr;
    }

    /**
     * Sets the value of the mbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMbr(JAXBElement<Long> value) {
        this.mbr = value;
    }

    /**
     * Gets the value of the expDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpDate() {
        return expDate;
    }

    /**
     * Sets the value of the expDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expDate = value;
    }

    /**
     * Gets the value of the classGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassGuid() {
        return classGuid;
    }

    /**
     * Sets the value of the classGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassGuid(String value) {
        this.classGuid = value;
    }

    /**
     * Gets the value of the panCrypt property.
     * 
     * @return
     *     possible object is
     *     {@link AppEncryptedData }
     *     
     */
    public AppEncryptedData getPanCrypt() {
        return panCrypt;
    }

    /**
     * Sets the value of the panCrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppEncryptedData }
     *     
     */
    public void setPanCrypt(AppEncryptedData value) {
        this.panCrypt = value;
    }

    /**
     * Gets the value of the pvv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPvv() {
        return pvv;
    }

    /**
     * Sets the value of the pvv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPvv(JAXBElement<String> value) {
        this.pvv = value;
    }

    /**
     * Gets the value of the pvki property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPvki() {
        return pvki;
    }

    /**
     * Sets the value of the pvki property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPvki(JAXBElement<Long> value) {
        this.pvki = value;
    }

    /**
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfo }
     *     
     */
    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfo }
     *     
     */
    public void setPersonInfo(PersonInfo value) {
        this.personInfo = value;
    }

    /**
     * Gets the value of the paymentTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTemplates }
     *     
     */
    public PaymentTemplates getPaymentTemplates() {
        return paymentTemplates;
    }

    /**
     * Sets the value of the paymentTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTemplates }
     *     
     */
    public void setPaymentTemplates(PaymentTemplates value) {
        this.paymentTemplates = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the cofMatch property.
     * 
     * @return
     *     possible object is
     *     {@link CofMatch }
     *     
     */
    public CofMatch getCofMatch() {
        return cofMatch;
    }

    /**
     * Sets the value of the cofMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CofMatch }
     *     
     */
    public void setCofMatch(CofMatch value) {
        this.cofMatch = value;
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
     * Gets the value of the checkTranId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCheckTranId() {
        return checkTranId;
    }

    /**
     * Sets the value of the checkTranId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCheckTranId(JAXBElement<Long> value) {
        this.checkTranId = value;
    }

    /**
     * Gets the value of the activateTill property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActivateTill() {
        return activateTill;
    }

    /**
     * Sets the value of the activateTill property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActivateTill(JAXBElement<XMLGregorianCalendar> value) {
        this.activateTill = value;
    }

    /**
     * Gets the value of the binNetworkId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBinNetworkId() {
        return binNetworkId;
    }

    /**
     * Sets the value of the binNetworkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBinNetworkId(JAXBElement<Long> value) {
        this.binNetworkId = value;
    }

    /**
     * Gets the value of the settleContractId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSettleContractId() {
        return settleContractId;
    }

    /**
     * Sets the value of the settleContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSettleContractId(JAXBElement<Long> value) {
        this.settleContractId = value;
    }

    /**
     * Gets the value of the etuStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtuStatus() {
        return etuStatus;
    }

    /**
     * Sets the value of the etuStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtuStatus(JAXBElement<String> value) {
        this.etuStatus = value;
    }

    /**
     * Gets the value of the etuStatusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtuStatusDesc() {
        return etuStatusDesc;
    }

    /**
     * Sets the value of the etuStatusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtuStatusDesc(JAXBElement<String> value) {
        this.etuStatusDesc = value;
    }

    /**
     * Gets the value of the etuStatusReqTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEtuStatusReqTime() {
        return etuStatusReqTime;
    }

    /**
     * Sets the value of the etuStatusReqTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEtuStatusReqTime(JAXBElement<XMLGregorianCalendar> value) {
        this.etuStatusReqTime = value;
    }

    /**
     * Gets the value of the etuStatusUpdTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEtuStatusUpdTime() {
        return etuStatusUpdTime;
    }

    /**
     * Sets the value of the etuStatusUpdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEtuStatusUpdTime(JAXBElement<XMLGregorianCalendar> value) {
        this.etuStatusUpdTime = value;
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
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPan() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPan(String value) {
        this.pan = value;
    }

    /**
     * Gets the value of the ownerSubjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOwnerSubjectId() {
        return ownerSubjectId;
    }

    /**
     * Sets the value of the ownerSubjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOwnerSubjectId(Long value) {
        this.ownerSubjectId = value;
    }

}
