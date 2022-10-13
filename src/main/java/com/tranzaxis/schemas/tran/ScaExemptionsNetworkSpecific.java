
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScaExemptionsNetworkSpecific complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScaExemptionsNetworkSpecific"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="Visa"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="SessionId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ExemptionsRejectReasons"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
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
@XmlType(name = "ScaExemptionsNetworkSpecific", propOrder = {
    "visa"
})
public class ScaExemptionsNetworkSpecific {

    @XmlElement(name = "Visa")
    protected ScaExemptionsNetworkSpecific.Visa visa;

    /**
     * Gets the value of the visa property.
     * 
     * @return
     *     possible object is
     *     {@link ScaExemptionsNetworkSpecific.Visa }
     *     
     */
    public ScaExemptionsNetworkSpecific.Visa getVisa() {
        return visa;
    }

    /**
     * Sets the value of the visa property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaExemptionsNetworkSpecific.Visa }
     *     
     */
    public void setVisa(ScaExemptionsNetworkSpecific.Visa value) {
        this.visa = value;
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
     *       &lt;attribute name="SessionId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ExemptionsRejectReasons"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
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
    @XmlType(name = "")
    public static class Visa {

        @XmlAttribute(name = "SessionId")
        protected String sessionId;
        @XmlAttribute(name = "ExemptionsRejectReasons")
        protected List<String> exemptionsRejectReasons;

        /**
         * Gets the value of the sessionId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSessionId() {
            return sessionId;
        }

        /**
         * Sets the value of the sessionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSessionId(String value) {
            this.sessionId = value;
        }

        /**
         * Gets the value of the exemptionsRejectReasons property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exemptionsRejectReasons property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExemptionsRejectReasons().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getExemptionsRejectReasons() {
            if (exemptionsRejectReasons == null) {
                exemptionsRejectReasons = new ArrayList<String>();
            }
            return this.exemptionsRejectReasons;
        }

    }

}
