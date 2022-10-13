
package com.tranzaxis.schemas.tokens_admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.AppEncryptedData;


/**
 * <p>Java class for Card complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Card"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tokens-admin.xsd}Base"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PinEnabledTill" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="PinClerk" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="DesignId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="DesignRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Pvki" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Pvv" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="IPvv" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="AntiAmbushPvv" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="EmbossName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="TrackName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="PrintName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="PinBlock" type="{http://schemas.radixware.org/types.xsd}BinHex" minOccurs="0"/&gt;
 *         &lt;element name="IPinBlock" type="{http://schemas.radixware.org/types.xsd}BinHex" minOccurs="0"/&gt;
 *         &lt;element name="AntiAmbushPinBlock" type="{http://schemas.radixware.org/types.xsd}BinHex" minOccurs="0"/&gt;
 *         &lt;element name="IsDomestic" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="TdsEnrollment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DigitizationEligibility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DigitizationRid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Track1Dd" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Track2Dd" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="InvalidCvv2TriesCnt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="InvalidIPinTriesCnt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="InvalidPinTriesCnt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="InvalidTdsEnrollTriesCnt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="PanCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *         &lt;element name="DigitizedCards" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DigitizedCard" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizedCard"&gt;
 *                           &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                           &lt;attribute name="ObjectMustExist" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdditionalCards" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AdditionalCard" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="NewStatus" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}TokenStatus" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Pan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Mbr" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="FindByPan" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="ManualDigitizedCardManagement" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Card", propOrder = {
    "pinEnabledTill",
    "pinClerk",
    "designId",
    "designRid",
    "pvki",
    "pvv",
    "iPvv",
    "antiAmbushPvv",
    "embossName",
    "trackName",
    "printName",
    "pinBlock",
    "iPinBlock",
    "antiAmbushPinBlock",
    "isDomestic",
    "tdsEnrollment",
    "digitizationEligibility",
    "digitizationRid",
    "track1Dd",
    "track2Dd",
    "invalidCvv2TriesCnt",
    "invalidIPinTriesCnt",
    "invalidPinTriesCnt",
    "invalidTdsEnrollTriesCnt",
    "panCrypt",
    "digitizedCards",
    "additionalCards"
})
@XmlSeeAlso({
    CardEmv.class
})
public class Card
    extends Base
{

    @XmlElementRef(name = "PinEnabledTill", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> pinEnabledTill;
    @XmlElementRef(name = "PinClerk", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pinClerk;
    @XmlElementRef(name = "DesignId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> designId;
    @XmlElementRef(name = "DesignRid", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> designRid;
    @XmlElementRef(name = "Pvki", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> pvki;
    @XmlElementRef(name = "Pvv", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pvv;
    @XmlElementRef(name = "IPvv", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iPvv;
    @XmlElementRef(name = "AntiAmbushPvv", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> antiAmbushPvv;
    @XmlElementRef(name = "EmbossName", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> embossName;
    @XmlElementRef(name = "TrackName", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trackName;
    @XmlElementRef(name = "PrintName", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> printName;
    @XmlElementRef(name = "PinBlock", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> pinBlock;
    @XmlElementRef(name = "IPinBlock", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> iPinBlock;
    @XmlElementRef(name = "AntiAmbushPinBlock", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> antiAmbushPinBlock;
    @XmlElementRef(name = "IsDomestic", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDomestic;
    @XmlElementRef(name = "TdsEnrollment", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> tdsEnrollment;
    @XmlElementRef(name = "DigitizationEligibility", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> digitizationEligibility;
    @XmlElementRef(name = "DigitizationRid", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> digitizationRid;
    @XmlElementRef(name = "Track1Dd", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> track1Dd;
    @XmlElementRef(name = "Track2Dd", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> track2Dd;
    @XmlElementRef(name = "InvalidCvv2TriesCnt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> invalidCvv2TriesCnt;
    @XmlElementRef(name = "InvalidIPinTriesCnt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> invalidIPinTriesCnt;
    @XmlElementRef(name = "InvalidPinTriesCnt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> invalidPinTriesCnt;
    @XmlElementRef(name = "InvalidTdsEnrollTriesCnt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> invalidTdsEnrollTriesCnt;
    @XmlElement(name = "PanCrypt")
    protected AppEncryptedData panCrypt;
    @XmlElement(name = "DigitizedCards")
    protected Card.DigitizedCards digitizedCards;
    @XmlElement(name = "AdditionalCards")
    protected Card.AdditionalCards additionalCards;
    @XmlAttribute(name = "Pan")
    protected String pan;
    @XmlAttribute(name = "Mbr")
    protected Long mbr;
    @XmlAttribute(name = "FindByPan")
    protected Boolean findByPan;
    @XmlAttribute(name = "ManualDigitizedCardManagement")
    protected Boolean manualDigitizedCardManagement;

    /**
     * Gets the value of the pinEnabledTill property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPinEnabledTill() {
        return pinEnabledTill;
    }

    /**
     * Sets the value of the pinEnabledTill property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPinEnabledTill(JAXBElement<XMLGregorianCalendar> value) {
        this.pinEnabledTill = value;
    }

    /**
     * Gets the value of the pinClerk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinClerk() {
        return pinClerk;
    }

    /**
     * Sets the value of the pinClerk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinClerk(JAXBElement<String> value) {
        this.pinClerk = value;
    }

    /**
     * Gets the value of the designId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDesignId() {
        return designId;
    }

    /**
     * Sets the value of the designId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDesignId(JAXBElement<Long> value) {
        this.designId = value;
    }

    /**
     * Gets the value of the designRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesignRid() {
        return designRid;
    }

    /**
     * Sets the value of the designRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesignRid(JAXBElement<String> value) {
        this.designRid = value;
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
     * Gets the value of the iPvv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIPvv() {
        return iPvv;
    }

    /**
     * Sets the value of the iPvv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIPvv(JAXBElement<String> value) {
        this.iPvv = value;
    }

    /**
     * Gets the value of the antiAmbushPvv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAntiAmbushPvv() {
        return antiAmbushPvv;
    }

    /**
     * Sets the value of the antiAmbushPvv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAntiAmbushPvv(JAXBElement<String> value) {
        this.antiAmbushPvv = value;
    }

    /**
     * Gets the value of the embossName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmbossName() {
        return embossName;
    }

    /**
     * Sets the value of the embossName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmbossName(JAXBElement<String> value) {
        this.embossName = value;
    }

    /**
     * Gets the value of the trackName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrackName() {
        return trackName;
    }

    /**
     * Sets the value of the trackName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrackName(JAXBElement<String> value) {
        this.trackName = value;
    }

    /**
     * Gets the value of the printName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrintName() {
        return printName;
    }

    /**
     * Sets the value of the printName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrintName(JAXBElement<String> value) {
        this.printName = value;
    }

    /**
     * Gets the value of the pinBlock property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getPinBlock() {
        return pinBlock;
    }

    /**
     * Sets the value of the pinBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setPinBlock(JAXBElement<byte[]> value) {
        this.pinBlock = value;
    }

    /**
     * Gets the value of the iPinBlock property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getIPinBlock() {
        return iPinBlock;
    }

    /**
     * Sets the value of the iPinBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setIPinBlock(JAXBElement<byte[]> value) {
        this.iPinBlock = value;
    }

    /**
     * Gets the value of the antiAmbushPinBlock property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getAntiAmbushPinBlock() {
        return antiAmbushPinBlock;
    }

    /**
     * Sets the value of the antiAmbushPinBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setAntiAmbushPinBlock(JAXBElement<byte[]> value) {
        this.antiAmbushPinBlock = value;
    }

    /**
     * Gets the value of the isDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDomestic() {
        return isDomestic;
    }

    /**
     * Sets the value of the isDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDomestic(JAXBElement<Boolean> value) {
        this.isDomestic = value;
    }

    /**
     * Gets the value of the tdsEnrollment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTdsEnrollment() {
        return tdsEnrollment;
    }

    /**
     * Sets the value of the tdsEnrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTdsEnrollment(JAXBElement<Boolean> value) {
        this.tdsEnrollment = value;
    }

    /**
     * Gets the value of the digitizationEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDigitizationEligibility() {
        return digitizationEligibility;
    }

    /**
     * Sets the value of the digitizationEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDigitizationEligibility(JAXBElement<Boolean> value) {
        this.digitizationEligibility = value;
    }

    /**
     * Gets the value of the digitizationRid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDigitizationRid() {
        return digitizationRid;
    }

    /**
     * Sets the value of the digitizationRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDigitizationRid(JAXBElement<String> value) {
        this.digitizationRid = value;
    }

    /**
     * Gets the value of the track1Dd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrack1Dd() {
        return track1Dd;
    }

    /**
     * Sets the value of the track1Dd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrack1Dd(JAXBElement<String> value) {
        this.track1Dd = value;
    }

    /**
     * Gets the value of the track2Dd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrack2Dd() {
        return track2Dd;
    }

    /**
     * Sets the value of the track2Dd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrack2Dd(JAXBElement<String> value) {
        this.track2Dd = value;
    }

    /**
     * Gets the value of the invalidCvv2TriesCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInvalidCvv2TriesCnt() {
        return invalidCvv2TriesCnt;
    }

    /**
     * Sets the value of the invalidCvv2TriesCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInvalidCvv2TriesCnt(JAXBElement<Long> value) {
        this.invalidCvv2TriesCnt = value;
    }

    /**
     * Gets the value of the invalidIPinTriesCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInvalidIPinTriesCnt() {
        return invalidIPinTriesCnt;
    }

    /**
     * Sets the value of the invalidIPinTriesCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInvalidIPinTriesCnt(JAXBElement<Long> value) {
        this.invalidIPinTriesCnt = value;
    }

    /**
     * Gets the value of the invalidPinTriesCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInvalidPinTriesCnt() {
        return invalidPinTriesCnt;
    }

    /**
     * Sets the value of the invalidPinTriesCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInvalidPinTriesCnt(JAXBElement<Long> value) {
        this.invalidPinTriesCnt = value;
    }

    /**
     * Gets the value of the invalidTdsEnrollTriesCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInvalidTdsEnrollTriesCnt() {
        return invalidTdsEnrollTriesCnt;
    }

    /**
     * Sets the value of the invalidTdsEnrollTriesCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInvalidTdsEnrollTriesCnt(JAXBElement<Long> value) {
        this.invalidTdsEnrollTriesCnt = value;
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
     * Gets the value of the digitizedCards property.
     * 
     * @return
     *     possible object is
     *     {@link Card.DigitizedCards }
     *     
     */
    public Card.DigitizedCards getDigitizedCards() {
        return digitizedCards;
    }

    /**
     * Sets the value of the digitizedCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Card.DigitizedCards }
     *     
     */
    public void setDigitizedCards(Card.DigitizedCards value) {
        this.digitizedCards = value;
    }

    /**
     * Gets the value of the additionalCards property.
     * 
     * @return
     *     possible object is
     *     {@link Card.AdditionalCards }
     *     
     */
    public Card.AdditionalCards getAdditionalCards() {
        return additionalCards;
    }

    /**
     * Sets the value of the additionalCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Card.AdditionalCards }
     *     
     */
    public void setAdditionalCards(Card.AdditionalCards value) {
        this.additionalCards = value;
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
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMbr() {
        return mbr;
    }

    /**
     * Sets the value of the mbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMbr(Long value) {
        this.mbr = value;
    }

    /**
     * Gets the value of the findByPan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFindByPan() {
        return findByPan;
    }

    /**
     * Sets the value of the findByPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFindByPan(Boolean value) {
        this.findByPan = value;
    }

    /**
     * Gets the value of the manualDigitizedCardManagement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManualDigitizedCardManagement() {
        return manualDigitizedCardManagement;
    }

    /**
     * Sets the value of the manualDigitizedCardManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManualDigitizedCardManagement(Boolean value) {
        this.manualDigitizedCardManagement = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="AdditionalCard" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="NewStatus" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}TokenStatus" /&gt;
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
    @XmlType(name = "", propOrder = {
        "additionalCard"
    })
    public static class AdditionalCards {

        @XmlElement(name = "AdditionalCard")
        protected List<Card.AdditionalCards.AdditionalCard> additionalCard;

        /**
         * Gets the value of the additionalCard property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalCard property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalCard().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Card.AdditionalCards.AdditionalCard }
         * 
         * 
         */
        public List<Card.AdditionalCards.AdditionalCard> getAdditionalCard() {
            if (additionalCard == null) {
                additionalCard = new ArrayList<Card.AdditionalCards.AdditionalCard>();
            }
            return this.additionalCard;
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
         *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="NewStatus" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}TokenStatus" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AdditionalCard {

            @XmlAttribute(name = "Id")
            protected Long id;
            @XmlAttribute(name = "NewStatus")
            protected String newStatus;

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
             * Gets the value of the newStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNewStatus() {
                return newStatus;
            }

            /**
             * Sets the value of the newStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNewStatus(String value) {
                this.newStatus = value;
            }

        }

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
     *       &lt;sequence&gt;
     *         &lt;element name="DigitizedCard" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizedCard"&gt;
     *                 &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *                 &lt;attribute name="ObjectMustExist" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *               &lt;/extension&gt;
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
    @XmlType(name = "", propOrder = {
        "digitizedCard"
    })
    public static class DigitizedCards {

        @XmlElement(name = "DigitizedCard")
        protected List<Card.DigitizedCards.DigitizedCard> digitizedCard;

        /**
         * Gets the value of the digitizedCard property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the digitizedCard property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDigitizedCard().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Card.DigitizedCards.DigitizedCard }
         * 
         * 
         */
        public List<Card.DigitizedCards.DigitizedCard> getDigitizedCard() {
            if (digitizedCard == null) {
                digitizedCard = new ArrayList<Card.DigitizedCards.DigitizedCard>();
            }
            return this.digitizedCard;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://schemas.tranzaxis.com/digitized-card.xsd}DigitizedCard"&gt;
         *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *       &lt;attribute name="ObjectMustExist" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DigitizedCard
            extends com.tranzaxis.schemas.digitized_card.DigitizedCard
        {

            @XmlAttribute(name = "ToDelete")
            protected Boolean toDelete;
            @XmlAttribute(name = "ObjectMustExist")
            protected Boolean objectMustExist;

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

            /**
             * Gets the value of the objectMustExist property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isObjectMustExist() {
                return objectMustExist;
            }

            /**
             * Sets the value of the objectMustExist property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setObjectMustExist(Boolean value) {
                this.objectMustExist = value;
            }

        }

    }

}
