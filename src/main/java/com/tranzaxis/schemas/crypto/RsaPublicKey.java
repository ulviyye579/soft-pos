
package com.tranzaxis.schemas.crypto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RsaPublicKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RsaPublicKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Modulus" type="{http://schemas.radixware.org/types.xsd}BinBase64"/&gt;
 *         &lt;element name="PublicName" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="X509Certificate" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Value" type="{http://schemas.radixware.org/types.xsd}BinBase64" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Exponent" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RsaPublicKey", propOrder = {
    "modulus",
    "publicName",
    "x509Certificate"
})
public class RsaPublicKey {

    @XmlElement(name = "Modulus", required = true)
    protected byte[] modulus;
    @XmlElement(name = "PublicName")
    protected String publicName;
    @XmlElement(name = "X509Certificate")
    protected RsaPublicKey.X509Certificate x509Certificate;
    @XmlAttribute(name = "Exponent", required = true)
    protected long exponent;

    /**
     * Gets the value of the modulus property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getModulus() {
        return modulus;
    }

    /**
     * Sets the value of the modulus property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setModulus(byte[] value) {
        this.modulus = value;
    }

    /**
     * Gets the value of the publicName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicName() {
        return publicName;
    }

    /**
     * Sets the value of the publicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicName(String value) {
        this.publicName = value;
    }

    /**
     * Gets the value of the x509Certificate property.
     * 
     * @return
     *     possible object is
     *     {@link RsaPublicKey.X509Certificate }
     *     
     */
    public RsaPublicKey.X509Certificate getX509Certificate() {
        return x509Certificate;
    }

    /**
     * Sets the value of the x509Certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RsaPublicKey.X509Certificate }
     *     
     */
    public void setX509Certificate(RsaPublicKey.X509Certificate value) {
        this.x509Certificate = value;
    }

    /**
     * Gets the value of the exponent property.
     * 
     */
    public long getExponent() {
        return exponent;
    }

    /**
     * Sets the value of the exponent property.
     * 
     */
    public void setExponent(long value) {
        this.exponent = value;
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
     *         &lt;element name="Value" type="{http://schemas.radixware.org/types.xsd}BinBase64" maxOccurs="unbounded"/&gt;
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
        "value"
    })
    public static class X509Certificate {

        @XmlElement(name = "Value", required = true)
        protected List<byte[]> value;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * byte[]
         * 
         */
        public List<byte[]> getValue() {
            if (value == null) {
                value = new ArrayList<byte[]>();
            }
            return this.value;
        }

    }

}
