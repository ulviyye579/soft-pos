
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CalcPvvRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcPvvRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pvk1" type="{http://schemas.tranzaxis.com/crypto.xsd}IntKey"/&gt;
 *         &lt;element name="Pvk2" type="{http://schemas.tranzaxis.com/crypto.xsd}IntKey" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Pvki" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="6"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Pan" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="PinBlockInt" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcPvvRq", propOrder = {
    "pvk1",
    "pvk2"
})
@XmlSeeAlso({
    CheckPvvRq.class
})
public class CalcPvvRq {

    @XmlElement(name = "Pvk1", required = true)
    protected IntKey pvk1;
    @XmlElement(name = "Pvk2")
    protected IntKey pvk2;
    @XmlAttribute(name = "Pvki", required = true)
    protected int pvki;
    @XmlAttribute(name = "Pan", required = true)
    protected String pan;
    @XmlAttribute(name = "PinBlockInt", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] pinBlockInt;

    /**
     * Gets the value of the pvk1 property.
     * 
     * @return
     *     possible object is
     *     {@link IntKey }
     *     
     */
    public IntKey getPvk1() {
        return pvk1;
    }

    /**
     * Sets the value of the pvk1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntKey }
     *     
     */
    public void setPvk1(IntKey value) {
        this.pvk1 = value;
    }

    /**
     * Gets the value of the pvk2 property.
     * 
     * @return
     *     possible object is
     *     {@link IntKey }
     *     
     */
    public IntKey getPvk2() {
        return pvk2;
    }

    /**
     * Sets the value of the pvk2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntKey }
     *     
     */
    public void setPvk2(IntKey value) {
        this.pvk2 = value;
    }

    /**
     * Gets the value of the pvki property.
     * 
     */
    public int getPvki() {
        return pvki;
    }

    /**
     * Sets the value of the pvki property.
     * 
     */
    public void setPvki(int value) {
        this.pvki = value;
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
     * Gets the value of the pinBlockInt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getPinBlockInt() {
        return pinBlockInt;
    }

    /**
     * Sets the value of the pinBlockInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinBlockInt(byte[] value) {
        this.pinBlockInt = value;
    }

}
