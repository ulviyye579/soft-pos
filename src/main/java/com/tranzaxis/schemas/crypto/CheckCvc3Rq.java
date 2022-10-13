
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckCvc3Rq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckCvc3Rq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IccCvc3Key" type="{http://schemas.tranzaxis.com/crypto.xsd}IntKey"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Pan" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *             &lt;pattern value="\d{12,19}"/&gt;
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
 *       &lt;attribute name="TrackData" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *             &lt;pattern value="\d{1,99}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Un" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *             &lt;pattern value="\d{1,8}"/&gt;
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
 *       &lt;attribute name="Cvc3" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *             &lt;pattern value="\d{3,5}"/&gt;
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
@XmlType(name = "CheckCvc3Rq", propOrder = {
    "iccCvc3Key"
})
public class CheckCvc3Rq {

    @XmlElement(name = "IccCvc3Key", required = true)
    protected IntKey iccCvc3Key;
    @XmlAttribute(name = "Pan", required = true)
    protected String pan;
    @XmlAttribute(name = "Mbr", required = true)
    protected int mbr;
    @XmlAttribute(name = "TrackData", required = true)
    protected String trackData;
    @XmlAttribute(name = "Un", required = true)
    protected String un;
    @XmlAttribute(name = "Atc", required = true)
    protected int atc;
    @XmlAttribute(name = "Cvc3", required = true)
    protected String cvc3;

    /**
     * Gets the value of the iccCvc3Key property.
     * 
     * @return
     *     possible object is
     *     {@link IntKey }
     *     
     */
    public IntKey getIccCvc3Key() {
        return iccCvc3Key;
    }

    /**
     * Sets the value of the iccCvc3Key property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntKey }
     *     
     */
    public void setIccCvc3Key(IntKey value) {
        this.iccCvc3Key = value;
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
     * Gets the value of the trackData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackData() {
        return trackData;
    }

    /**
     * Sets the value of the trackData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackData(String value) {
        this.trackData = value;
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
     * Gets the value of the cvc3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvc3() {
        return cvc3;
    }

    /**
     * Sets the value of the cvc3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvc3(String value) {
        this.cvc3 = value;
    }

}
