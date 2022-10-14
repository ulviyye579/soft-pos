
package com.tranzaxis.schemas.crypto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptAppleProvisioningPayloadRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncryptAppleProvisioningPayloadRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Certificates"&gt;
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
 *         &lt;element name="Payload" type="{http://schemas.radixware.org/types.xsd}BinBase64"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptAppleProvisioningPayloadRq", propOrder = {
    "certificates",
    "payload"
})
public class EncryptAppleProvisioningPayloadRq {

    @XmlElement(name = "Certificates", required = true)
    protected EncryptAppleProvisioningPayloadRq.Certificates certificates;
    @XmlElement(name = "Payload", required = true)
    protected byte[] payload;

    /**
     * Gets the value of the certificates property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptAppleProvisioningPayloadRq.Certificates }
     *     
     */
    public EncryptAppleProvisioningPayloadRq.Certificates getCertificates() {
        return certificates;
    }

    /**
     * Sets the value of the certificates property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptAppleProvisioningPayloadRq.Certificates }
     *     
     */
    public void setCertificates(EncryptAppleProvisioningPayloadRq.Certificates value) {
        this.certificates = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPayload(byte[] value) {
        this.payload = value;
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
    public static class Certificates {

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
