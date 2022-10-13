
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TranRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://schemas.tranzaxis.com/tran-common.xsd}MatchingAttrs"/&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ApprovalCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranRef")
public class TranRef {

    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "ApprovalCode")
    protected String approvalCode;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "Stan")
    protected String stan;
    @XmlAttribute(name = "Rrn")
    protected String rrn;
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
