
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckDcscRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckDcscRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IccAuthKey" type="{http://schemas.tranzaxis.com/crypto.xsd}IntKey"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Pan" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *             &lt;pattern value="\d{15}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Mbr" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="99"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Un" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *             &lt;pattern value="\d{4}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Atc" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *             &lt;maxInclusive value="65535"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Dcsc" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *             &lt;pattern value="\d{5}"/&gt;
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
@XmlType(name = "CheckDcscRq", propOrder = {
    "iccAuthKey"
})
public class CheckDcscRq {

    @XmlElement(name = "IccAuthKey", required = true)
    protected IntKey iccAuthKey;
    @XmlAttribute(name = "Pan", required = true)
    protected String pan;
    @XmlAttribute(name = "Mbr", required = true)
    protected int mbr;
    @XmlAttribute(name = "Un", required = true)
    protected String un;
    @XmlAttribute(name = "Atc", required = true)
    protected int atc;
    @XmlAttribute(name = "Dcsc", required = true)
    protected String dcsc;

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
    public int getMbr() {
        return mbr;
    }

    /**
     * Sets the value of the mbr property.
     * 
     */
    public void setMbr(int value) {
        this.mbr = value;
    }

    /**
     * Gets the value of the un property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUn() {
        return un;
    }

    /**
     * Sets the value of the un property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUn(String value) {
        this.un = value;
    }

    /**
     * Gets the value of the atc property.
     * 
     */
    public int getAtc() {
        return atc;
    }

    /**
     * Sets the value of the atc property.
     * 
     */
    public void setAtc(int value) {
        this.atc = value;
    }

    /**
     * Gets the value of the dcsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcsc() {
        return dcsc;
    }

    /**
     * Sets the value of the dcsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcsc(String value) {
        this.dcsc = value;
    }

}
