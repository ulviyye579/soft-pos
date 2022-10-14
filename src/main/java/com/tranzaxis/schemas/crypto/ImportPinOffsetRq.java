
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportPinOffsetRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportPinOffsetRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pvk" type="{http://schemas.tranzaxis.com/crypto.xsd}IntKey"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DecTable" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Str"&gt;
 *             &lt;pattern value="\d{16}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Pan" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ValData" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="CheckLen" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
 *             &lt;minInclusive value="4"/&gt;
 *             &lt;maxInclusive value="12"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="PinOffset" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportPinOffsetRq", propOrder = {
    "pvk"
})
public class ImportPinOffsetRq {

    @XmlElement(name = "Pvk", required = true)
    protected IntKey pvk;
    @XmlAttribute(name = "DecTable", required = true)
    protected String decTable;
    @XmlAttribute(name = "Pan", required = true)
    protected String pan;
    @XmlAttribute(name = "ValData", required = true)
    protected String valData;
    @XmlAttribute(name = "CheckLen", required = true)
    protected int checkLen;
    @XmlAttribute(name = "PinOffset", required = true)
    protected String pinOffset;

    /**
     * Gets the value of the pvk property.
     * 
     * @return
     *     possible object is
     *     {@link IntKey }
     *     
     */
    public IntKey getPvk() {
        return pvk;
    }

    /**
     * Sets the value of the pvk property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntKey }
     *     
     */
    public void setPvk(IntKey value) {
        this.pvk = value;
    }

    /**
     * Gets the value of the decTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecTable() {
        return decTable;
    }

    /**
     * Sets the value of the decTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecTable(String value) {
        this.decTable = value;
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
     * Gets the value of the valData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValData() {
        return valData;
    }

    /**
     * Sets the value of the valData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValData(String value) {
        this.valData = value;
    }

    /**
     * Gets the value of the checkLen property.
     * 
     */
    public int getCheckLen() {
        return checkLen;
    }

    /**
     * Sets the value of the checkLen property.
     * 
     */
    public void setCheckLen(int value) {
        this.checkLen = value;
    }

    /**
     * Gets the value of the pinOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinOffset() {
        return pinOffset;
    }

    /**
     * Sets the value of the pinOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinOffset(String value) {
        this.pinOffset = value;
    }

}
