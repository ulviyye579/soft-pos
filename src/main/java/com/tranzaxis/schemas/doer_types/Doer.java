
package com.tranzaxis.schemas.doer_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Doer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Doer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartyId" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Key" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Seq" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Role" type="{http://schemas.tranzaxis.com/doer-types.xsd}DoerRole" /&gt;
 *       &lt;attribute name="ParentRolePath" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ParentDoerSeq" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="PartyEntityGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ApprovalCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Rrn" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Stan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Arn" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Irn" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Nrn" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TermRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TransTime" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="AcquirerRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ForwarderRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Doer", propOrder = {
    "partyId",
    "key"
})
public class Doer {

    @XmlElement(name = "PartyId")
    protected String partyId;
    @XmlElement(name = "Key")
    protected String key;
    @XmlAttribute(name = "Seq")
    protected Long seq;
    @XmlAttribute(name = "Role")
    protected String role;
    @XmlAttribute(name = "ParentRolePath")
    protected String parentRolePath;
    @XmlAttribute(name = "ParentDoerSeq")
    protected Long parentDoerSeq;
    @XmlAttribute(name = "PartyEntityGuid")
    protected String partyEntityGuid;
    @XmlAttribute(name = "ApprovalCode")
    protected String approvalCode;
    @XmlAttribute(name = "Rrn")
    protected String rrn;
    @XmlAttribute(name = "Stan")
    protected String stan;
    @XmlAttribute(name = "Arn")
    protected String arn;
    @XmlAttribute(name = "Irn")
    protected String irn;
    @XmlAttribute(name = "Nrn")
    protected String nrn;
    @XmlAttribute(name = "TermRid")
    protected String termRid;
    @XmlAttribute(name = "TransTime")
    protected XMLGregorianCalendar transTime;
    @XmlAttribute(name = "AcquirerRid")
    protected String acquirerRid;
    @XmlAttribute(name = "ForwarderRid")
    protected String forwarderRid;

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyId(String value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
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
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the parentRolePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentRolePath() {
        return parentRolePath;
    }

    /**
     * Sets the value of the parentRolePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentRolePath(String value) {
        this.parentRolePath = value;
    }

    /**
     * Gets the value of the parentDoerSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentDoerSeq() {
        return parentDoerSeq;
    }

    /**
     * Sets the value of the parentDoerSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentDoerSeq(Long value) {
        this.parentDoerSeq = value;
    }

    /**
     * Gets the value of the partyEntityGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyEntityGuid() {
        return partyEntityGuid;
    }

    /**
     * Sets the value of the partyEntityGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyEntityGuid(String value) {
        this.partyEntityGuid = value;
    }

    /**
     * Gets the value of the approvalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalCode() {
        return approvalCode;
    }

    /**
     * Sets the value of the approvalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalCode(String value) {
        this.approvalCode = value;
    }

    /**
     * Gets the value of the rrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRrn() {
        return rrn;
    }

    /**
     * Sets the value of the rrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRrn(String value) {
        this.rrn = value;
    }

    /**
     * Gets the value of the stan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStan() {
        return stan;
    }

    /**
     * Sets the value of the stan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStan(String value) {
        this.stan = value;
    }

    /**
     * Gets the value of the arn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArn() {
        return arn;
    }

    /**
     * Sets the value of the arn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArn(String value) {
        this.arn = value;
    }

    /**
     * Gets the value of the irn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIrn() {
        return irn;
    }

    /**
     * Sets the value of the irn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIrn(String value) {
        this.irn = value;
    }

    /**
     * Gets the value of the nrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrn() {
        return nrn;
    }

    /**
     * Sets the value of the nrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrn(String value) {
        this.nrn = value;
    }

    /**
     * Gets the value of the termRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermRid() {
        return termRid;
    }

    /**
     * Sets the value of the termRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermRid(String value) {
        this.termRid = value;
    }

    /**
     * Gets the value of the transTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransTime() {
        return transTime;
    }

    /**
     * Sets the value of the transTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransTime(XMLGregorianCalendar value) {
        this.transTime = value;
    }

    /**
     * Gets the value of the acquirerRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerRid() {
        return acquirerRid;
    }

    /**
     * Sets the value of the acquirerRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerRid(String value) {
        this.acquirerRid = value;
    }

    /**
     * Gets the value of the forwarderRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwarderRid() {
        return forwarderRid;
    }

    /**
     * Sets the value of the forwarderRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwarderRid(String value) {
        this.forwarderRid = value;
    }

}
