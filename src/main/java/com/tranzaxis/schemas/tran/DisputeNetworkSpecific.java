
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeNetworkSpecific complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeNetworkSpecific"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="Visa"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ReturnReason" maxOccurs="5" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Code" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="IsDisputeFinancial" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="DisputeCondition" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="VrolFinancialId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="VrolCaseNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="VrolBundleNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="ClientCaseNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="DisputeStatus" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MasterCard"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ClaimId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="EventId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DinersClub"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RequiredDocs"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DocCode" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "DisputeNetworkSpecific", propOrder = {
    "visa",
    "masterCard",
    "dinersClub"
})
public class DisputeNetworkSpecific {

    @XmlElement(name = "Visa")
    protected DisputeNetworkSpecific.Visa visa;
    @XmlElement(name = "MasterCard")
    protected DisputeNetworkSpecific.MasterCard masterCard;
    @XmlElement(name = "DinersClub")
    protected DisputeNetworkSpecific.DinersClub dinersClub;

    /**
     * Gets the value of the visa property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeNetworkSpecific.Visa }
     *     
     */
    public DisputeNetworkSpecific.Visa getVisa() {
        return visa;
    }

    /**
     * Sets the value of the visa property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeNetworkSpecific.Visa }
     *     
     */
    public void setVisa(DisputeNetworkSpecific.Visa value) {
        this.visa = value;
    }

    /**
     * Gets the value of the masterCard property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeNetworkSpecific.MasterCard }
     *     
     */
    public DisputeNetworkSpecific.MasterCard getMasterCard() {
        return masterCard;
    }

    /**
     * Sets the value of the masterCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeNetworkSpecific.MasterCard }
     *     
     */
    public void setMasterCard(DisputeNetworkSpecific.MasterCard value) {
        this.masterCard = value;
    }

    /**
     * Gets the value of the dinersClub property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeNetworkSpecific.DinersClub }
     *     
     */
    public DisputeNetworkSpecific.DinersClub getDinersClub() {
        return dinersClub;
    }

    /**
     * Sets the value of the dinersClub property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeNetworkSpecific.DinersClub }
     *     
     */
    public void setDinersClub(DisputeNetworkSpecific.DinersClub value) {
        this.dinersClub = value;
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
     *         &lt;element name="RequiredDocs"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DocCode" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
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
        "requiredDocs"
    })
    public static class DinersClub {

        @XmlElement(name = "RequiredDocs", required = true)
        protected DisputeNetworkSpecific.DinersClub.RequiredDocs requiredDocs;

        /**
         * Gets the value of the requiredDocs property.
         * 
         * @return
         *     possible object is
         *     {@link DisputeNetworkSpecific.DinersClub.RequiredDocs }
         *     
         */
        public DisputeNetworkSpecific.DinersClub.RequiredDocs getRequiredDocs() {
            return requiredDocs;
        }

        /**
         * Sets the value of the requiredDocs property.
         * 
         * @param value
         *     allowed object is
         *     {@link DisputeNetworkSpecific.DinersClub.RequiredDocs }
         *     
         */
        public void setRequiredDocs(DisputeNetworkSpecific.DinersClub.RequiredDocs value) {
            this.requiredDocs = value;
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
         *         &lt;element name="DocCode" type="{http://schemas.radixware.org/types.xsd}Str" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "docCode"
        })
        public static class RequiredDocs {

            @XmlElement(name = "DocCode")
            protected List<String> docCode;

            /**
             * Gets the value of the docCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the docCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDocCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getDocCode() {
                if (docCode == null) {
                    docCode = new ArrayList<String>();
                }
                return this.docCode;
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
     *       &lt;attribute name="ClaimId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="EventId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MasterCard {

        @XmlAttribute(name = "ClaimId")
        protected Long claimId;
        @XmlAttribute(name = "EventId")
        protected Long eventId;

        /**
         * Gets the value of the claimId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getClaimId() {
            return claimId;
        }

        /**
         * Sets the value of the claimId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setClaimId(Long value) {
            this.claimId = value;
        }

        /**
         * Gets the value of the eventId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getEventId() {
            return eventId;
        }

        /**
         * Sets the value of the eventId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setEventId(Long value) {
            this.eventId = value;
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
     *         &lt;element name="ReturnReason" maxOccurs="5" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Code" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="IsDisputeFinancial" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="DisputeCondition" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="VrolFinancialId" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="VrolCaseNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="VrolBundleNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="ClientCaseNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="DisputeStatus" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "returnReason"
    })
    public static class Visa {

        @XmlElement(name = "ReturnReason")
        protected List<DisputeNetworkSpecific.Visa.ReturnReason> returnReason;
        @XmlAttribute(name = "IsDisputeFinancial")
        protected Boolean isDisputeFinancial;
        @XmlAttribute(name = "DisputeCondition")
        protected String disputeCondition;
        @XmlAttribute(name = "VrolFinancialId")
        protected String vrolFinancialId;
        @XmlAttribute(name = "VrolCaseNumber")
        protected String vrolCaseNumber;
        @XmlAttribute(name = "VrolBundleNumber")
        protected String vrolBundleNumber;
        @XmlAttribute(name = "ClientCaseNumber")
        protected String clientCaseNumber;
        @XmlAttribute(name = "DisputeStatus")
        protected String disputeStatus;

        /**
         * Gets the value of the returnReason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the returnReason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReturnReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DisputeNetworkSpecific.Visa.ReturnReason }
         * 
         * 
         */
        public List<DisputeNetworkSpecific.Visa.ReturnReason> getReturnReason() {
            if (returnReason == null) {
                returnReason = new ArrayList<DisputeNetworkSpecific.Visa.ReturnReason>();
            }
            return this.returnReason;
        }

        /**
         * Gets the value of the isDisputeFinancial property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsDisputeFinancial() {
            return isDisputeFinancial;
        }

        /**
         * Sets the value of the isDisputeFinancial property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsDisputeFinancial(Boolean value) {
            this.isDisputeFinancial = value;
        }

        /**
         * Gets the value of the disputeCondition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisputeCondition() {
            return disputeCondition;
        }

        /**
         * Sets the value of the disputeCondition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisputeCondition(String value) {
            this.disputeCondition = value;
        }

        /**
         * Gets the value of the vrolFinancialId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVrolFinancialId() {
            return vrolFinancialId;
        }

        /**
         * Sets the value of the vrolFinancialId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVrolFinancialId(String value) {
            this.vrolFinancialId = value;
        }

        /**
         * Gets the value of the vrolCaseNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVrolCaseNumber() {
            return vrolCaseNumber;
        }

        /**
         * Sets the value of the vrolCaseNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVrolCaseNumber(String value) {
            this.vrolCaseNumber = value;
        }

        /**
         * Gets the value of the vrolBundleNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVrolBundleNumber() {
            return vrolBundleNumber;
        }

        /**
         * Sets the value of the vrolBundleNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVrolBundleNumber(String value) {
            this.vrolBundleNumber = value;
        }

        /**
         * Gets the value of the clientCaseNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientCaseNumber() {
            return clientCaseNumber;
        }

        /**
         * Sets the value of the clientCaseNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientCaseNumber(String value) {
            this.clientCaseNumber = value;
        }

        /**
         * Gets the value of the disputeStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisputeStatus() {
            return disputeStatus;
        }

        /**
         * Sets the value of the disputeStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisputeStatus(String value) {
            this.disputeStatus = value;
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
         *       &lt;attribute name="Code" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ReturnReason {

            @XmlAttribute(name = "Code")
            protected String code;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

        }

    }

}
