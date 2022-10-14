
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CalcEmvMacRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcEmvMacRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IccMacKey" type="{http://schemas.tranzaxis.com/crypto.xsd}IntKey"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="EmvScheme" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}EmvSchemeType" /&gt;
 *       &lt;attribute name="SessionData" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="Pan" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Mbr" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Message" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="Cvn" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcEmvMacRq", propOrder = {
    "iccMacKey"
})
public class CalcEmvMacRq {

    @XmlElement(name = "IccMacKey", required = true)
    protected IntKey iccMacKey;
    @XmlAttribute(name = "EmvScheme", required = true)
    protected EmvSchemeType emvScheme;
    @XmlAttribute(name = "SessionData", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] sessionData;
    @XmlAttribute(name = "Pan", required = true)
    protected String pan;
    @XmlAttribute(name = "Mbr", required = true)
    protected long mbr;
    @XmlAttribute(name = "Message", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] message;
    @XmlAttribute(name = "Cvn")
    protected Long cvn;

    /**
     * Gets the value of the iccMacKey property.
     * 
     * @return
     *     possible object is
     *     {@link IntKey }
     *     
     */
    public IntKey getIccMacKey() {
        return iccMacKey;
    }

    /**
     * Sets the value of the iccMacKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntKey }
     *     
     */
    public void setIccMacKey(IntKey value) {
        this.iccMacKey = value;
    }

    /**
     * Gets the value of the emvScheme property.
     * 
     * @return
     *     possible object is
     *     {@link EmvSchemeType }
     *     
     */
    public EmvSchemeType getEmvScheme() {
        return emvScheme;
    }

    /**
     * Sets the value of the emvScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmvSchemeType }
     *     
     */
    public void setEmvScheme(EmvSchemeType value) {
        this.emvScheme = value;
    }

    /**
     * Gets the value of the sessionData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSessionData() {
        return sessionData;
    }

    /**
     * Sets the value of the sessionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionData(byte[] value) {
        this.sessionData = value;
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
     * Gets the value of the mbr property.
     * 
     */
    public long getMbr() {
        return mbr;
    }

    /**
     * Sets the value of the mbr property.
     * 
     */
    public void setMbr(long value) {
        this.mbr = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(byte[] value) {
        this.message = value;
    }

    /**
     * Gets the value of the cvn property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCvn() {
        return cvn;
    }

    /**
     * Sets the value of the cvn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCvn(Long value) {
        this.cvn = value;
    }

}
