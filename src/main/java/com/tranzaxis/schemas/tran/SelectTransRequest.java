
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.tran_common.CustInfoRq;


/**
 * <p>Java class for SelectTransRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectTransRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Party"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="Token"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="ExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Contract"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="ExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Subject"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Batch"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Params" type="{http://schemas.tranzaxis.com/tran-common.xsd}CustInfoRq"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="InitiatorRid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="InstitutionId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="InstitutionName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectTransRequest", propOrder = {
    "party",
    "params"
})
public class SelectTransRequest {

    @XmlElement(name = "Party", required = true)
    protected SelectTransRequest.Party party;
    @XmlElement(name = "Params", required = true)
    protected CustInfoRq params;
    @XmlAttribute(name = "InitiatorRid", required = true)
    protected String initiatorRid;
    @XmlAttribute(name = "InstitutionId")
    protected Long institutionId;
    @XmlAttribute(name = "InstitutionName")
    protected String institutionName;

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link SelectTransRequest.Party }
     *     
     */
    public SelectTransRequest.Party getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectTransRequest.Party }
     *     
     */
    public void setParty(SelectTransRequest.Party value) {
        this.party = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoRq }
     *     
     */
    public CustInfoRq getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoRq }
     *     
     */
    public void setParams(CustInfoRq value) {
        this.params = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="Token"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="ExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Contract"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="ExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Subject"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Batch"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
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
    @XmlType(name = "", propOrder = {
        "token",
        "contract",
        "subject",
        "batch"
    })
    public static class Party {

        @XmlElement(name = "Token")
        protected SelectTransRequest.Party.Token token;
        @XmlElement(name = "Contract")
        protected SelectTransRequest.Party.Contract contract;
        @XmlElement(name = "Subject")
        protected SelectTransRequest.Party.Subject subject;
        @XmlElement(name = "Batch")
        protected SelectTransRequest.Party.Batch batch;

        /**
         * Gets the value of the token property.
         * 
         * @return
         *     possible object is
         *     {@link SelectTransRequest.Party.Token }
         *     
         */
        public SelectTransRequest.Party.Token getToken() {
            return token;
        }

        /**
         * Sets the value of the token property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectTransRequest.Party.Token }
         *     
         */
        public void setToken(SelectTransRequest.Party.Token value) {
            this.token = value;
        }

        /**
         * Gets the value of the contract property.
         * 
         * @return
         *     possible object is
         *     {@link SelectTransRequest.Party.Contract }
         *     
         */
        public SelectTransRequest.Party.Contract getContract() {
            return contract;
        }

        /**
         * Sets the value of the contract property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectTransRequest.Party.Contract }
         *     
         */
        public void setContract(SelectTransRequest.Party.Contract value) {
            this.contract = value;
        }

        /**
         * Gets the value of the subject property.
         * 
         * @return
         *     possible object is
         *     {@link SelectTransRequest.Party.Subject }
         *     
         */
        public SelectTransRequest.Party.Subject getSubject() {
            return subject;
        }

        /**
         * Sets the value of the subject property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectTransRequest.Party.Subject }
         *     
         */
        public void setSubject(SelectTransRequest.Party.Subject value) {
            this.subject = value;
        }

        /**
         * Gets the value of the batch property.
         * 
         * @return
         *     possible object is
         *     {@link SelectTransRequest.Party.Batch }
         *     
         */
        public SelectTransRequest.Party.Batch getBatch() {
            return batch;
        }

        /**
         * Sets the value of the batch property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectTransRequest.Party.Batch }
         *     
         */
        public void setBatch(SelectTransRequest.Party.Batch value) {
            this.batch = value;
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
         *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Batch {

            @XmlAttribute(name = "Id", required = true)
            protected long id;

            /**
             * Gets the value of the id property.
             * 
             */
            public long getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             */
            public void setId(long value) {
                this.id = value;
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
         *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="ExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Contract {

            @XmlAttribute(name = "Id")
            protected Long id;
            @XmlAttribute(name = "ExtRid")
            protected String extRid;
            @XmlAttribute(name = "Rid")
            protected String rid;

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
             * Gets the value of the extRid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtRid() {
                return extRid;
            }

            /**
             * Sets the value of the extRid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtRid(String value) {
                this.extRid = value;
            }

            /**
             * Gets the value of the rid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRid() {
                return rid;
            }

            /**
             * Sets the value of the rid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRid(String value) {
                this.rid = value;
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
         *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Subject {

            @XmlAttribute(name = "Id")
            protected Long id;
            @XmlAttribute(name = "Rid")
            protected String rid;

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
             * Gets the value of the rid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRid() {
                return rid;
            }

            /**
             * Sets the value of the rid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRid(String value) {
                this.rid = value;
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
         *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="ExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Token {

            @XmlAttribute(name = "Id")
            protected Long id;
            @XmlAttribute(name = "ExtRid")
            protected String extRid;

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
             * Gets the value of the extRid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtRid() {
                return extRid;
            }

            /**
             * Sets the value of the extRid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtRid(String value) {
                this.extRid = value;
            }

        }

    }

}
