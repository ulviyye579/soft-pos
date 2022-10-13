
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalCapabilites complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalCapabilites"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Icc" type="{http://schemas.radixware.org/types.xsd}Bool" default="0" /&gt;
 *       &lt;attribute name="KeyEntry" type="{http://schemas.radixware.org/types.xsd}Bool" default="0" /&gt;
 *       &lt;attribute name="Contactless" type="{http://schemas.radixware.org/types.xsd}Bool" default="0" /&gt;
 *       &lt;attribute name="MagRead" type="{http://schemas.radixware.org/types.xsd}Bool" default="0" /&gt;
 *       &lt;attribute name="MagWrite" type="{http://schemas.radixware.org/types.xsd}Bool" default="0" /&gt;
 *       &lt;attribute name="Ocr" type="{http://schemas.radixware.org/types.xsd}Bool" default="0" /&gt;
 *       &lt;attribute name="SingleTap" type="{http://schemas.radixware.org/types.xsd}Bool" default="0" /&gt;
 *       &lt;attribute name="BarCode" type="{http://schemas.radixware.org/types.xsd}Bool" default="0" /&gt;
 *       &lt;attribute name="Pin" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="MaxPinLen" default="4"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
 *             &lt;minInclusive value="4"/&gt;
 *             &lt;maxInclusive value="12"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SignAnalysis" type="{http://schemas.radixware.org/types.xsd}Bool" default="0" /&gt;
 *       &lt;attribute name="CardCapture" type="{http://schemas.radixware.org/types.xsd}Bool" default="0" /&gt;
 *       &lt;attribute name="Attendance" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="LocationKind"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="AreaKind"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Mpos" type="{http://schemas.radixware.org/types.xsd}Bool" default="0" /&gt;
 *       &lt;attribute name="MposPinEntryKind"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="MposContactlessKind"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Mobile" type="{http://schemas.radixware.org/types.xsd}Bool" default="0" /&gt;
 *       &lt;attribute name="Dsrp" type="{http://schemas.radixware.org/types.xsd}Bool" default="0" /&gt;
 *       &lt;attribute name="Tds" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="Moto" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="DeviceCategory"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Interactive" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="PartialApproval" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="GoodsAuthOnly" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="Protected" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalCapabilites")
public class TerminalCapabilites {

    @XmlAttribute(name = "Icc")
    protected Boolean icc;
    @XmlAttribute(name = "KeyEntry")
    protected Boolean keyEntry;
    @XmlAttribute(name = "Contactless")
    protected Boolean contactless;
    @XmlAttribute(name = "MagRead")
    protected Boolean magRead;
    @XmlAttribute(name = "MagWrite")
    protected Boolean magWrite;
    @XmlAttribute(name = "Ocr")
    protected Boolean ocr;
    @XmlAttribute(name = "SingleTap")
    protected Boolean singleTap;
    @XmlAttribute(name = "BarCode")
    protected Boolean barCode;
    @XmlAttribute(name = "Pin")
    protected Boolean pin;
    @XmlAttribute(name = "MaxPinLen")
    protected Integer maxPinLen;
    @XmlAttribute(name = "SignAnalysis")
    protected Boolean signAnalysis;
    @XmlAttribute(name = "CardCapture")
    protected Boolean cardCapture;
    @XmlAttribute(name = "Attendance")
    protected Boolean attendance;
    @XmlAttribute(name = "LocationKind")
    protected String locationKind;
    @XmlAttribute(name = "AreaKind")
    protected String areaKind;
    @XmlAttribute(name = "Mpos")
    protected Boolean mpos;
    @XmlAttribute(name = "MposPinEntryKind")
    protected String mposPinEntryKind;
    @XmlAttribute(name = "MposContactlessKind")
    protected String mposContactlessKind;
    @XmlAttribute(name = "Mobile")
    protected Boolean mobile;
    @XmlAttribute(name = "Dsrp")
    protected Boolean dsrp;
    @XmlAttribute(name = "Tds")
    protected Boolean tds;
    @XmlAttribute(name = "Moto")
    protected Boolean moto;
    @XmlAttribute(name = "DeviceCategory")
    protected Long deviceCategory;
    @XmlAttribute(name = "Interactive")
    protected Boolean interactive;
    @XmlAttribute(name = "PartialApproval")
    protected Boolean partialApproval;
    @XmlAttribute(name = "GoodsAuthOnly")
    protected Boolean goodsAuthOnly;
    @XmlAttribute(name = "Protected")
    protected Boolean _protected;

    /**
     * Gets the value of the icc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIcc() {
        if (icc == null) {
            return false;
        } else {
            return icc;
        }
    }

    /**
     * Sets the value of the icc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIcc(Boolean value) {
        this.icc = value;
    }

    /**
     * Gets the value of the keyEntry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isKeyEntry() {
        if (keyEntry == null) {
            return false;
        } else {
            return keyEntry;
        }
    }

    /**
     * Sets the value of the keyEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyEntry(Boolean value) {
        this.keyEntry = value;
    }

    /**
     * Gets the value of the contactless property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContactless() {
        if (contactless == null) {
            return false;
        } else {
            return contactless;
        }
    }

    /**
     * Sets the value of the contactless property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactless(Boolean value) {
        this.contactless = value;
    }

    /**
     * Gets the value of the magRead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMagRead() {
        if (magRead == null) {
            return false;
        } else {
            return magRead;
        }
    }

    /**
     * Sets the value of the magRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMagRead(Boolean value) {
        this.magRead = value;
    }

    /**
     * Gets the value of the magWrite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMagWrite() {
        if (magWrite == null) {
            return false;
        } else {
            return magWrite;
        }
    }

    /**
     * Sets the value of the magWrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMagWrite(Boolean value) {
        this.magWrite = value;
    }

    /**
     * Gets the value of the ocr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOcr() {
        if (ocr == null) {
            return false;
        } else {
            return ocr;
        }
    }

    /**
     * Sets the value of the ocr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOcr(Boolean value) {
        this.ocr = value;
    }

    /**
     * Gets the value of the singleTap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSingleTap() {
        if (singleTap == null) {
            return false;
        } else {
            return singleTap;
        }
    }

    /**
     * Sets the value of the singleTap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSingleTap(Boolean value) {
        this.singleTap = value;
    }

    /**
     * Gets the value of the barCode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBarCode() {
        if (barCode == null) {
            return false;
        } else {
            return barCode;
        }
    }

    /**
     * Sets the value of the barCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBarCode(Boolean value) {
        this.barCode = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPin(Boolean value) {
        this.pin = value;
    }

    /**
     * Gets the value of the maxPinLen property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxPinLen() {
        if (maxPinLen == null) {
            return  4;
        } else {
            return maxPinLen;
        }
    }

    /**
     * Sets the value of the maxPinLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPinLen(Integer value) {
        this.maxPinLen = value;
    }

    /**
     * Gets the value of the signAnalysis property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSignAnalysis() {
        if (signAnalysis == null) {
            return false;
        } else {
            return signAnalysis;
        }
    }

    /**
     * Sets the value of the signAnalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignAnalysis(Boolean value) {
        this.signAnalysis = value;
    }

    /**
     * Gets the value of the cardCapture property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCardCapture() {
        if (cardCapture == null) {
            return false;
        } else {
            return cardCapture;
        }
    }

    /**
     * Sets the value of the cardCapture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardCapture(Boolean value) {
        this.cardCapture = value;
    }

    /**
     * Gets the value of the attendance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttendance() {
        return attendance;
    }

    /**
     * Sets the value of the attendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttendance(Boolean value) {
        this.attendance = value;
    }

    /**
     * Gets the value of the locationKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationKind() {
        return locationKind;
    }

    /**
     * Sets the value of the locationKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationKind(String value) {
        this.locationKind = value;
    }

    /**
     * Gets the value of the areaKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaKind() {
        return areaKind;
    }

    /**
     * Sets the value of the areaKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaKind(String value) {
        this.areaKind = value;
    }

    /**
     * Gets the value of the mpos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMpos() {
        if (mpos == null) {
            return false;
        } else {
            return mpos;
        }
    }

    /**
     * Sets the value of the mpos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMpos(Boolean value) {
        this.mpos = value;
    }

    /**
     * Gets the value of the mposPinEntryKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMposPinEntryKind() {
        return mposPinEntryKind;
    }

    /**
     * Sets the value of the mposPinEntryKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMposPinEntryKind(String value) {
        this.mposPinEntryKind = value;
    }

    /**
     * Gets the value of the mposContactlessKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMposContactlessKind() {
        return mposContactlessKind;
    }

    /**
     * Sets the value of the mposContactlessKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMposContactlessKind(String value) {
        this.mposContactlessKind = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMobile() {
        if (mobile == null) {
            return false;
        } else {
            return mobile;
        }
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobile(Boolean value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the dsrp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDsrp() {
        if (dsrp == null) {
            return false;
        } else {
            return dsrp;
        }
    }

    /**
     * Sets the value of the dsrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDsrp(Boolean value) {
        this.dsrp = value;
    }

    /**
     * Gets the value of the tds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTds() {
        return tds;
    }

    /**
     * Sets the value of the tds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTds(Boolean value) {
        this.tds = value;
    }

    /**
     * Gets the value of the moto property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoto() {
        return moto;
    }

    /**
     * Sets the value of the moto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoto(Boolean value) {
        this.moto = value;
    }

    /**
     * Gets the value of the deviceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeviceCategory() {
        return deviceCategory;
    }

    /**
     * Sets the value of the deviceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeviceCategory(Long value) {
        this.deviceCategory = value;
    }

    /**
     * Gets the value of the interactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInteractive() {
        return interactive;
    }

    /**
     * Sets the value of the interactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInteractive(Boolean value) {
        this.interactive = value;
    }

    /**
     * Gets the value of the partialApproval property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartialApproval() {
        return partialApproval;
    }

    /**
     * Sets the value of the partialApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartialApproval(Boolean value) {
        this.partialApproval = value;
    }

    /**
     * Gets the value of the goodsAuthOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoodsAuthOnly() {
        return goodsAuthOnly;
    }

    /**
     * Sets the value of the goodsAuthOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoodsAuthOnly(Boolean value) {
        this.goodsAuthOnly = value;
    }

    /**
     * Gets the value of the protected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProtected() {
        return _protected;
    }

    /**
     * Sets the value of the protected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtected(Boolean value) {
        this._protected = value;
    }

}
