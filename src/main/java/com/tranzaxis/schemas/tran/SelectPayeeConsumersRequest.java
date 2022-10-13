
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectPayeeConsumersRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectPayeeConsumersRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayeeConsumerListFilter" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Payers" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Kind1" type="{http://schemas.tranzaxis.com/tran-common.xsd}PayerIdKindEnum" /&gt;
 *                           &lt;attribute name="Rid1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Kind2" type="{http://schemas.tranzaxis.com/tran-common.xsd}PayerIdKindEnum" /&gt;
 *                           &lt;attribute name="Rid2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="HasBills" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *                 &lt;attribute name="Statuses"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}PayeeConsumerStatusEnum" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="InitiatorRid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="InstitutionId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="InstitutionName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="StartObjNo" type="{http://schemas.radixware.org/types.xsd}Int" default="1" /&gt;
 *       &lt;attribute name="ObjCnt" type="{http://schemas.radixware.org/types.xsd}Int" default="100" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectPayeeConsumersRequest", propOrder = {
    "payeeConsumerListFilter"
})
public class SelectPayeeConsumersRequest {

    @XmlElement(name = "PayeeConsumerListFilter")
    protected SelectPayeeConsumersRequest.PayeeConsumerListFilter payeeConsumerListFilter;
    @XmlAttribute(name = "InitiatorRid", required = true)
    protected String initiatorRid;
    @XmlAttribute(name = "InstitutionId")
    protected Long institutionId;
    @XmlAttribute(name = "InstitutionName")
    protected String institutionName;
    @XmlAttribute(name = "StartObjNo")
    protected Long startObjNo;
    @XmlAttribute(name = "ObjCnt")
    protected Long objCnt;

    /**
     * Gets the value of the payeeConsumerListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SelectPayeeConsumersRequest.PayeeConsumerListFilter }
     *     
     */
    public SelectPayeeConsumersRequest.PayeeConsumerListFilter getPayeeConsumerListFilter() {
        return payeeConsumerListFilter;
    }

    /**
     * Sets the value of the payeeConsumerListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectPayeeConsumersRequest.PayeeConsumerListFilter }
     *     
     */
    public void setPayeeConsumerListFilter(SelectPayeeConsumersRequest.PayeeConsumerListFilter value) {
        this.payeeConsumerListFilter = value;
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
     * Gets the value of the institutionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInstitutionId() {
        return institutionId;
    }

    /**
     * Sets the value of the institutionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInstitutionId(Long value) {
        this.institutionId = value;
    }

    /**
     * Gets the value of the institutionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionName() {
        return institutionName;
    }

    /**
     * Sets the value of the institutionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionName(String value) {
        this.institutionName = value;
    }

    /**
     * Gets the value of the startObjNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getStartObjNo() {
        if (startObjNo == null) {
            return  1L;
        } else {
            return startObjNo;
        }
    }

    /**
     * Sets the value of the startObjNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStartObjNo(Long value) {
        this.startObjNo = value;
    }

    /**
     * Gets the value of the objCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getObjCnt() {
        if (objCnt == null) {
            return  100L;
        } else {
            return objCnt;
        }
    }

    /**
     * Sets the value of the objCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setObjCnt(Long value) {
        this.objCnt = value;
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
     *         &lt;element name="Payers" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Kind1" type="{http://schemas.tranzaxis.com/tran-common.xsd}PayerIdKindEnum" /&gt;
     *                 &lt;attribute name="Rid1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Kind2" type="{http://schemas.tranzaxis.com/tran-common.xsd}PayerIdKindEnum" /&gt;
     *                 &lt;attribute name="Rid2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="HasBills" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
     *       &lt;attribute name="Statuses"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.tranzaxis.com/tran-common.xsd}PayeeConsumerStatusEnum" /&gt;
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
    @XmlType(name = "", propOrder = {
        "payers"
    })
    public static class PayeeConsumerListFilter {

        @XmlElement(name = "Payers")
        protected SelectPayeeConsumersRequest.PayeeConsumerListFilter.Payers payers;
        @XmlAttribute(name = "HasBills")
        protected Boolean hasBills;
        @XmlAttribute(name = "Statuses")
        protected List<String> statuses;

        /**
         * Gets the value of the payers property.
         * 
         * @return
         *     possible object is
         *     {@link SelectPayeeConsumersRequest.PayeeConsumerListFilter.Payers }
         *     
         */
        public SelectPayeeConsumersRequest.PayeeConsumerListFilter.Payers getPayers() {
            return payers;
        }

        /**
         * Sets the value of the payers property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectPayeeConsumersRequest.PayeeConsumerListFilter.Payers }
         *     
         */
        public void setPayers(SelectPayeeConsumersRequest.PayeeConsumerListFilter.Payers value) {
            this.payers = value;
        }

        /**
         * Gets the value of the hasBills property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasBills() {
            return hasBills;
        }

        /**
         * Sets the value of the hasBills property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasBills(Boolean value) {
            this.hasBills = value;
        }

        /**
         * Gets the value of the statuses property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statuses property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatuses().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStatuses() {
            if (statuses == null) {
                statuses = new ArrayList<String>();
            }
            return this.statuses;
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
         *       &lt;attribute name="Kind1" type="{http://schemas.tranzaxis.com/tran-common.xsd}PayerIdKindEnum" /&gt;
         *       &lt;attribute name="Rid1" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Kind2" type="{http://schemas.tranzaxis.com/tran-common.xsd}PayerIdKindEnum" /&gt;
         *       &lt;attribute name="Rid2" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Payers {

            @XmlAttribute(name = "Kind1")
            protected String kind1;
            @XmlAttribute(name = "Rid1")
            protected String rid1;
            @XmlAttribute(name = "Kind2")
            protected String kind2;
            @XmlAttribute(name = "Rid2")
            protected String rid2;

            /**
             * Gets the value of the kind1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKind1() {
                return kind1;
            }

            /**
             * Sets the value of the kind1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKind1(String value) {
                this.kind1 = value;
            }

            /**
             * Gets the value of the rid1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRid1() {
                return rid1;
            }

            /**
             * Sets the value of the rid1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRid1(String value) {
                this.rid1 = value;
            }

            /**
             * Gets the value of the kind2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKind2() {
                return kind2;
            }

            /**
             * Sets the value of the kind2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKind2(String value) {
                this.kind2 = value;
            }

            /**
             * Gets the value of the rid2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRid2() {
                return rid2;
            }

            /**
             * Sets the value of the rid2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRid2(String value) {
                this.rid2 = value;
            }

        }

    }

}
