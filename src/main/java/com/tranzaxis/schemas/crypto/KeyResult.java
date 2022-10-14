
package com.tranzaxis.schemas.crypto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for KeyResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tr34Key" type="{http://schemas.tranzaxis.com/crypto.xsd}ExportKeyUnderTr34Result"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="KeyId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="IntKey" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="OutKey" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *       &lt;attribute name="KeyCheck" use="required" type="{http://schemas.radixware.org/types.xsd}BinHex" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyResult", propOrder = {
    "tr34Key"
})
public class KeyResult {

    @XmlElement(name = "Tr34Key", required = true)
    protected ExportKeyUnderTr34Result tr34Key;
    @XmlAttribute(name = "KeyId")
    protected Long keyId;
    @XmlAttribute(name = "IntKey")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] intKey;
    @XmlAttribute(name = "OutKey")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] outKey;
    @XmlAttribute(name = "KeyCheck", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] keyCheck;

    /**
     * Gets the value of the tr34Key property.
     * 
     * @return
     *     possible object is
     *     {@link ExportKeyUnderTr34Result }
     *     
     */
    public ExportKeyUnderTr34Result getTr34Key() {
        return tr34Key;
    }

    /**
     * Sets the value of the tr34Key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportKeyUnderTr34Result }
     *     
     */
    public void setTr34Key(ExportKeyUnderTr34Result value) {
        this.tr34Key = value;
    }

    /**
     * Gets the value of the keyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKeyId(Long value) {
        this.keyId = value;
    }

    /**
     * Gets the value of the intKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getIntKey() {
        return intKey;
    }

    /**
     * Sets the value of the intKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntKey(byte[] value) {
        this.intKey = value;
    }

    /**
     * Gets the value of the outKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getOutKey() {
        return outKey;
    }

    /**
     * Sets the value of the outKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutKey(byte[] value) {
        this.outKey = value;
    }

    /**
     * Gets the value of the keyCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getKeyCheck() {
        return keyCheck;
    }

    /**
     * Sets the value of the keyCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyCheck(byte[] value) {
        this.keyCheck = value;
    }

}
