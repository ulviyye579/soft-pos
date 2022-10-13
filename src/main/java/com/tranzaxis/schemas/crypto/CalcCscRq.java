
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcCscRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcCscRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Csck" type="{http://schemas.tranzaxis.com/crypto.xsd}IntKey"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Pan" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ExpDate" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *             &lt;pattern value="\d{4}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Service" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *             &lt;pattern value="\d{3}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="CscAlgorithm" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}CscAlgorithm" /&gt;
 *       &lt;attribute name="CscLength" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
 *             &lt;minInclusive value="3"/&gt;
 *             &lt;maxInclusive value="5"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcCscRq", propOrder = {
    "csck"
})
@XmlSeeAlso({
    CheckCscRq.class
})
public class CalcCscRq {

    @XmlElement(name = "Csck", required = true)
    protected IntKey csck;
    @XmlAttribute(name = "Pan", required = true)
    protected String pan;
    @XmlAttribute(name = "ExpDate", required = true)
    protected String expDate;
    @XmlAttribute(name = "Service", required = true)
    protected String service;
    @XmlAttribute(name = "CscAlgorithm", required = true)
    protected CscAlgorithm cscAlgorithm;
    @XmlAttribute(name = "CscLength", required = true)
    protected int cscLength;

    /**
     * Gets the value of the csck property.
     * 
     * @return
     *     possible object is
     *     {@link IntKey }
     *     
     */
    public IntKey getCsck() {
        return csck;
    }

    /**
     * Sets the value of the csck property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntKey }
     *     
     */
    public void setCsck(IntKey value) {
        this.csck = value;
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
     * Gets the value of the expDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDate() {
        return expDate;
    }

    /**
     * Sets the value of the expDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDate(String value) {
        this.expDate = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the cscAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link CscAlgorithm }
     *     
     */
    public CscAlgorithm getCscAlgorithm() {
        return cscAlgorithm;
    }

    /**
     * Sets the value of the cscAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CscAlgorithm }
     *     
     */
    public void setCscAlgorithm(CscAlgorithm value) {
        this.cscAlgorithm = value;
    }

    /**
     * Gets the value of the cscLength property.
     * 
     */
    public int getCscLength() {
        return cscLength;
    }

    /**
     * Sets the value of the cscLength property.
     * 
     */
    public void setCscLength(int value) {
        this.cscLength = value;
    }

}
