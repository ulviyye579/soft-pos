
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptoServiceInvoke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CryptoServiceInvoke"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CryptoServiceRequest"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Envelope" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="InitiatorRid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CryptoRootId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CryptoServiceResponse"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Envelope" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoServiceInvoke", propOrder = {
    "cryptoServiceRequest",
    "cryptoServiceResponse"
})
public class CryptoServiceInvoke {

    @XmlElement(name = "CryptoServiceRequest")
    protected CryptoServiceInvoke.CryptoServiceRequest cryptoServiceRequest;
    @XmlElement(name = "CryptoServiceResponse")
    protected CryptoServiceInvoke.CryptoServiceResponse cryptoServiceResponse;

    /**
     * Gets the value of the cryptoServiceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoServiceInvoke.CryptoServiceRequest }
     *     
     */
    public CryptoServiceInvoke.CryptoServiceRequest getCryptoServiceRequest() {
        return cryptoServiceRequest;
    }

    /**
     * Sets the value of the cryptoServiceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoServiceInvoke.CryptoServiceRequest }
     *     
     */
    public void setCryptoServiceRequest(CryptoServiceInvoke.CryptoServiceRequest value) {
        this.cryptoServiceRequest = value;
    }

    /**
     * Gets the value of the cryptoServiceResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoServiceInvoke.CryptoServiceResponse }
     *     
     */
    public CryptoServiceInvoke.CryptoServiceResponse getCryptoServiceResponse() {
        return cryptoServiceResponse;
    }

    /**
     * Sets the value of the cryptoServiceResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoServiceInvoke.CryptoServiceResponse }
     *     
     */
    public void setCryptoServiceResponse(CryptoServiceInvoke.CryptoServiceResponse value) {
        this.cryptoServiceResponse = value;
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
     *         &lt;element name="Envelope" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="InitiatorRid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CryptoRootId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "envelope"
    })
    public static class CryptoServiceRequest {

        @XmlElement(name = "Envelope", required = true)
        protected Object envelope;
        @XmlAttribute(name = "InitiatorRid", required = true)
        protected String initiatorRid;
        @XmlAttribute(name = "CryptoRootId")
        protected Long cryptoRootId;

        /**
         * Gets the value of the envelope property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getEnvelope() {
            return envelope;
        }

        /**
         * Sets the value of the envelope property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setEnvelope(Object value) {
            this.envelope = value;
        }

        /**
         * Gets the value of the initiatorRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInitiatorRid() {
            return initiatorRid;
        }

        /**
         * Sets the value of the initiatorRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInitiatorRid(String value) {
            this.initiatorRid = value;
        }

        /**
         * Gets the value of the cryptoRootId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getCryptoRootId() {
            return cryptoRootId;
        }

        /**
         * Sets the value of the cryptoRootId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setCryptoRootId(Long value) {
            this.cryptoRootId = value;
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
     *         &lt;element name="Envelope" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "envelope"
    })
    public static class CryptoServiceResponse {

        @XmlElement(name = "Envelope", required = true)
        protected Object envelope;

        /**
         * Gets the value of the envelope property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getEnvelope() {
            return envelope;
        }

        /**
         * Sets the value of the envelope property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setEnvelope(Object value) {
            this.envelope = value;
        }

    }

}
