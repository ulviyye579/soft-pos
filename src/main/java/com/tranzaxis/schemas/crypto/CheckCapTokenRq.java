
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CheckCapTokenRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckCapTokenRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IccAuthKey" type="{http://schemas.tranzaxis.com/crypto.xsd}IntKey"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="EmvScheme" use="required" type="{http://schemas.tranzaxis.com/crypto.xsd}EmvSchemeType" /&gt;
 *       &lt;attribute name="Pan" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Mbr" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TranData" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="Cvn" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Tac" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="Ipb" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="IpbMac"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}BinHex"&gt;
 *             &lt;length value="4"/&gt;
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
@XmlType(name = "CheckCapTokenRq", propOrder = {
    "iccAuthKey"
})
public class CheckCapTokenRq {

    @XmlElement(name = "IccAuthKey", required = true)
    protected IntKey iccAuthKey;
    @XmlAttribute(name = "EmvScheme", required = true)
    protected EmvSchemeType emvScheme;
    @XmlAttribute(name = "Pan", required = true)
    protected String pan;
    @XmlAttribute(name = "Mbr", required = true)
    protected long mbr;
    @XmlAttribute(name = "TranData", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] tranData;
    @XmlAttribute(name = "Cvn")
    protected Long cvn;
    @XmlAttribute(name = "Tac", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] tac;
    @XmlAttribute(name = "Ipb", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] ipb;
    @XmlAttribute(name = "IpbMac")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] ipbMac;

    /**
     * Gets the value of the iccAuthKey property.
     * 
     * @return
     *     possible object is
     *     {@link IntKey }
     *     
     */
    public IntKey getIccAuthKey() {
        return iccAuthKey;
    }

    /**
     * Sets the value of the iccAuthKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntKey }
     *     
     */
    public void setIccAuthKey(IntKey value) {
        this.iccAuthKey = value;
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
     * Gets the value of the tranData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getTranData() {
        return tranData;
    }

    /**
     * Sets the value of the tranData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranData(byte[] value) {
        this.tranData = value;
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

    /**
     * Gets the value of the tac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getTac() {
        return tac;
    }

    /**
     * Sets the value of the tac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTac(byte[] value) {
        this.tac = value;
    }

    /**
     * Gets the value of the ipb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getIpb() {
        return ipb;
    }

    /**
     * Sets the value of the ipb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpb(byte[] value) {
        this.ipb = value;
    }

    /**
     * Gets the value of the ipbMac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getIpbMac() {
        return ipbMac;
    }

    /**
     * Sets the value of the ipbMac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpbMac(byte[] value) {
        this.ipbMac = value;
    }

}
