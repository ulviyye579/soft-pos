
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for DigitizationRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigitizationRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="ActivationMethods" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ActivationMethod" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://schemas.radixware.org/types.xsd&gt;Str"&gt;
 *                           &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}DigitizationActivationMethod" /&gt;
 *                           &lt;attribute name="Message" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="AddressRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="SourceAddress" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Eligible" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="DesignExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="CardEmbossName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="CardMbr" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitizationRs", propOrder = {
    "activationMethods"
})
public class DigitizationRs {

    @XmlElement(name = "ActivationMethods")
    protected DigitizationRs.ActivationMethods activationMethods;
    @XmlAttribute(name = "Eligible")
    protected Boolean eligible;
    @XmlAttribute(name = "DesignExtRid")
    protected String designExtRid;
    @XmlAttribute(name = "CardEmbossName")
    protected String cardEmbossName;
    @XmlAttribute(name = "CardMbr")
    protected Long cardMbr;
    @XmlAttribute(name = "Id")
    protected Long id;

    /**
     * Gets the value of the activationMethods property.
     * 
     * @return
     *     possible object is
     *     {@link DigitizationRs.ActivationMethods }
     *     
     */
    public DigitizationRs.ActivationMethods getActivationMethods() {
        return activationMethods;
    }

    /**
     * Sets the value of the activationMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitizationRs.ActivationMethods }
     *     
     */
    public void setActivationMethods(DigitizationRs.ActivationMethods value) {
        this.activationMethods = value;
    }

    /**
     * Gets the value of the eligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligible() {
        return eligible;
    }

    /**
     * Sets the value of the eligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligible(Boolean value) {
        this.eligible = value;
    }

    /**
     * Gets the value of the designExtRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignExtRid() {
        return designExtRid;
    }

    /**
     * Sets the value of the designExtRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignExtRid(String value) {
        this.designExtRid = value;
    }

    /**
     * Gets the value of the cardEmbossName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardEmbossName() {
        return cardEmbossName;
    }

    /**
     * Sets the value of the cardEmbossName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardEmbossName(String value) {
        this.cardEmbossName = value;
    }

    /**
     * Gets the value of the cardMbr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCardMbr() {
        return cardMbr;
    }

    /**
     * Sets the value of the cardMbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCardMbr(Long value) {
        this.cardMbr = value;
    }

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ActivationMethod" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://schemas.radixware.org/types.xsd&gt;Str"&gt;
     *                 &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}DigitizationActivationMethod" /&gt;
     *                 &lt;attribute name="Message" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="AddressRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="SourceAddress" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
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
        "activationMethod"
    })
    public static class ActivationMethods {

        @XmlElement(name = "ActivationMethod")
        protected List<DigitizationRs.ActivationMethods.ActivationMethod> activationMethod;

        /**
         * Gets the value of the activationMethod property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the activationMethod property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActivationMethod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DigitizationRs.ActivationMethods.ActivationMethod }
         * 
         * 
         */
        public List<DigitizationRs.ActivationMethods.ActivationMethod> getActivationMethod() {
            if (activationMethod == null) {
                activationMethod = new ArrayList<DigitizationRs.ActivationMethods.ActivationMethod>();
            }
            return this.activationMethod;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://schemas.radixware.org/types.xsd&gt;Str"&gt;
         *       &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}DigitizationActivationMethod" /&gt;
         *       &lt;attribute name="Message" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="AddressRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="SourceAddress" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ActivationMethod {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Kind", required = true)
            protected String kind;
            @XmlAttribute(name = "Message")
            protected String message;
            @XmlAttribute(name = "AddressRid")
            protected String addressRid;
            @XmlAttribute(name = "SourceAddress")
            protected String sourceAddress;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the kind property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKind() {
                return kind;
            }

            /**
             * Sets the value of the kind property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKind(String value) {
                this.kind = value;
            }

            /**
             * Gets the value of the message property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMessage() {
                return message;
            }

            /**
             * Sets the value of the message property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMessage(String value) {
                this.message = value;
            }

            /**
             * Gets the value of the addressRid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressRid() {
                return addressRid;
            }

            /**
             * Sets the value of the addressRid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressRid(String value) {
                this.addressRid = value;
            }

            /**
             * Gets the value of the sourceAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSourceAddress() {
                return sourceAddress;
            }

            /**
             * Sets the value of the sourceAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSourceAddress(String value) {
                this.sourceAddress = value;
            }

        }

    }

}
