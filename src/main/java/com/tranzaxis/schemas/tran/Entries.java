
package com.tranzaxis.schemas.tran;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Entries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Entries"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entry" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Part" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="InLink" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="PrevTranId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                                     &lt;attribute name="PrevEntrySeq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                                     &lt;attribute name="PrevEntryPartSeq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                                     &lt;attribute name="Kind" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Seq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="FinOperKind" type="{http://schemas.tranzaxis.com/tran.xsd}FinOperKindEnum" /&gt;
 *                           &lt;attribute name="RegRole" type="{http://schemas.tranzaxis.com/tran.xsd}RegisterRoleEnum" /&gt;
 *                           &lt;attribute name="Classification" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="ClassificationForGl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="GlCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                           &lt;attribute name="Sign" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
 *                                 &lt;minInclusive value="-1"/&gt;
 *                                 &lt;maxInclusive value="1"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                           &lt;attribute name="AcctAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *                           &lt;attribute name="PostingId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CategoryText" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Seq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}EntryKindEnum" /&gt;
 *                 &lt;attribute name="CategoryCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="TariffVersionId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="TariffCellId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
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
@XmlType(name = "Entries", propOrder = {
    "entry"
})
public class Entries {

    @XmlElement(name = "Entry")
    protected List<Entries.Entry> entry;

    /**
     * Gets the value of the entry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Entries.Entry }
     * 
     * 
     */
    public List<Entries.Entry> getEntry() {
        if (entry == null) {
            entry = new ArrayList<Entries.Entry>();
        }
        return this.entry;
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
     *         &lt;element name="Part" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="InLink" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="PrevTranId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                           &lt;attribute name="PrevEntrySeq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                           &lt;attribute name="PrevEntryPartSeq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                           &lt;attribute name="Kind" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Seq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="FinOperKind" type="{http://schemas.tranzaxis.com/tran.xsd}FinOperKindEnum" /&gt;
     *                 &lt;attribute name="RegRole" type="{http://schemas.tranzaxis.com/tran.xsd}RegisterRoleEnum" /&gt;
     *                 &lt;attribute name="Classification" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="ClassificationForGl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="GlCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *                 &lt;attribute name="Sign" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
     *                       &lt;minInclusive value="-1"/&gt;
     *                       &lt;maxInclusive value="1"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *                 &lt;attribute name="AcctAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
     *                 &lt;attribute name="PostingId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CategoryText" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Seq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="Kind" use="required" type="{http://schemas.tranzaxis.com/tran.xsd}EntryKindEnum" /&gt;
     *       &lt;attribute name="CategoryCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="TariffVersionId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="TariffCellId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "part",
        "categoryText"
    })
    public static class Entry {

        @XmlElement(name = "Part", required = true)
        protected List<Entries.Entry.Part> part;
        @XmlElement(name = "CategoryText")
        protected String categoryText;
        @XmlAttribute(name = "Seq", required = true)
        protected long seq;
        @XmlAttribute(name = "Kind", required = true)
        protected String kind;
        @XmlAttribute(name = "CategoryCode")
        protected String categoryCode;
        @XmlAttribute(name = "TariffVersionId")
        protected Long tariffVersionId;
        @XmlAttribute(name = "TariffCellId")
        protected Long tariffCellId;

        /**
         * Gets the value of the part property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the part property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPart().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Entries.Entry.Part }
         * 
         * 
         */
        public List<Entries.Entry.Part> getPart() {
            if (part == null) {
                part = new ArrayList<Entries.Entry.Part>();
            }
            return this.part;
        }

        /**
         * Gets the value of the categoryText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategoryText() {
            return categoryText;
        }

        /**
         * Sets the value of the categoryText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategoryText(String value) {
            this.categoryText = value;
        }

        /**
         * Gets the value of the seq property.
         * 
         */
        public long getSeq() {
            return seq;
        }

        /**
         * Sets the value of the seq property.
         * 
         */
        public void setSeq(long value) {
            this.seq = value;
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
         * Gets the value of the categoryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategoryCode() {
            return categoryCode;
        }

        /**
         * Sets the value of the categoryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategoryCode(String value) {
            this.categoryCode = value;
        }

        /**
         * Gets the value of the tariffVersionId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTariffVersionId() {
            return tariffVersionId;
        }

        /**
         * Sets the value of the tariffVersionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTariffVersionId(Long value) {
            this.tariffVersionId = value;
        }

        /**
         * Gets the value of the tariffCellId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTariffCellId() {
            return tariffCellId;
        }

        /**
         * Sets the value of the tariffCellId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTariffCellId(Long value) {
            this.tariffCellId = value;
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
         *         &lt;element name="InLink" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="PrevTranId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *                 &lt;attribute name="PrevEntrySeq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *                 &lt;attribute name="PrevEntryPartSeq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *                 &lt;attribute name="Kind" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Seq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="FinOperKind" type="{http://schemas.tranzaxis.com/tran.xsd}FinOperKindEnum" /&gt;
         *       &lt;attribute name="RegRole" type="{http://schemas.tranzaxis.com/tran.xsd}RegisterRoleEnum" /&gt;
         *       &lt;attribute name="Classification" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="ClassificationForGl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="GlCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
         *       &lt;attribute name="Sign" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}Int"&gt;
         *             &lt;minInclusive value="-1"/&gt;
         *             &lt;maxInclusive value="1"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *       &lt;attribute name="AcctAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
         *       &lt;attribute name="PostingId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "inLink"
        })
        public static class Part {

            @XmlElement(name = "InLink")
            protected List<Entries.Entry.Part.InLink> inLink;
            @XmlAttribute(name = "Seq", required = true)
            protected long seq;
            @XmlAttribute(name = "FinOperKind")
            protected String finOperKind;
            @XmlAttribute(name = "RegRole")
            protected String regRole;
            @XmlAttribute(name = "Classification")
            protected String classification;
            @XmlAttribute(name = "ClassificationForGl")
            protected String classificationForGl;
            @XmlAttribute(name = "GlCode")
            protected String glCode;
            @XmlAttribute(name = "Sign", required = true)
            protected int sign;
            @XmlAttribute(name = "Amt", required = true)
            protected BigDecimal amt;
            @XmlAttribute(name = "Ccy", required = true)
            protected long ccy;
            @XmlAttribute(name = "AcctAmt", required = true)
            protected BigDecimal acctAmt;
            @XmlAttribute(name = "PostingId", required = true)
            protected long postingId;

            /**
             * Gets the value of the inLink property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the inLink property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInLink().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Entries.Entry.Part.InLink }
             * 
             * 
             */
            public List<Entries.Entry.Part.InLink> getInLink() {
                if (inLink == null) {
                    inLink = new ArrayList<Entries.Entry.Part.InLink>();
                }
                return this.inLink;
            }

            /**
             * Gets the value of the seq property.
             * 
             */
            public long getSeq() {
                return seq;
            }

            /**
             * Sets the value of the seq property.
             * 
             */
            public void setSeq(long value) {
                this.seq = value;
            }

            /**
             * Gets the value of the finOperKind property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFinOperKind() {
                return finOperKind;
            }

            /**
             * Sets the value of the finOperKind property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFinOperKind(String value) {
                this.finOperKind = value;
            }

            /**
             * Gets the value of the regRole property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegRole() {
                return regRole;
            }

            /**
             * Sets the value of the regRole property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegRole(String value) {
                this.regRole = value;
            }

            /**
             * Gets the value of the classification property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClassification() {
                return classification;
            }

            /**
             * Sets the value of the classification property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClassification(String value) {
                this.classification = value;
            }

            /**
             * Gets the value of the classificationForGl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClassificationForGl() {
                return classificationForGl;
            }

            /**
             * Sets the value of the classificationForGl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClassificationForGl(String value) {
                this.classificationForGl = value;
            }

            /**
             * Gets the value of the glCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGlCode() {
                return glCode;
            }

            /**
             * Sets the value of the glCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGlCode(String value) {
                this.glCode = value;
            }

            /**
             * Gets the value of the sign property.
             * 
             */
            public int getSign() {
                return sign;
            }

            /**
             * Sets the value of the sign property.
             * 
             */
            public void setSign(int value) {
                this.sign = value;
            }

            /**
             * Gets the value of the amt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmt() {
                return amt;
            }

            /**
             * Sets the value of the amt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmt(BigDecimal value) {
                this.amt = value;
            }

            /**
             * Gets the value of the ccy property.
             * 
             */
            public long getCcy() {
                return ccy;
            }

            /**
             * Sets the value of the ccy property.
             * 
             */
            public void setCcy(long value) {
                this.ccy = value;
            }

            /**
             * Gets the value of the acctAmt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAcctAmt() {
                return acctAmt;
            }

            /**
             * Sets the value of the acctAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAcctAmt(BigDecimal value) {
                this.acctAmt = value;
            }

            /**
             * Gets the value of the postingId property.
             * 
             */
            public long getPostingId() {
                return postingId;
            }

            /**
             * Sets the value of the postingId property.
             * 
             */
            public void setPostingId(long value) {
                this.postingId = value;
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
             *       &lt;attribute name="PrevTranId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
             *       &lt;attribute name="PrevEntrySeq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
             *       &lt;attribute name="PrevEntryPartSeq" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
             *       &lt;attribute name="Kind" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
             *           &lt;/restriction&gt;
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
            public static class InLink {

                @XmlAttribute(name = "PrevTranId", required = true)
                protected long prevTranId;
                @XmlAttribute(name = "PrevEntrySeq", required = true)
                protected long prevEntrySeq;
                @XmlAttribute(name = "PrevEntryPartSeq", required = true)
                protected long prevEntryPartSeq;
                @XmlAttribute(name = "Kind", required = true)
                protected String kind;

                /**
                 * Gets the value of the prevTranId property.
                 * 
                 */
                public long getPrevTranId() {
                    return prevTranId;
                }

                /**
                 * Sets the value of the prevTranId property.
                 * 
                 */
                public void setPrevTranId(long value) {
                    this.prevTranId = value;
                }

                /**
                 * Gets the value of the prevEntrySeq property.
                 * 
                 */
                public long getPrevEntrySeq() {
                    return prevEntrySeq;
                }

                /**
                 * Sets the value of the prevEntrySeq property.
                 * 
                 */
                public void setPrevEntrySeq(long value) {
                    this.prevEntrySeq = value;
                }

                /**
                 * Gets the value of the prevEntryPartSeq property.
                 * 
                 */
                public long getPrevEntryPartSeq() {
                    return prevEntryPartSeq;
                }

                /**
                 * Sets the value of the prevEntryPartSeq property.
                 * 
                 */
                public void setPrevEntryPartSeq(long value) {
                    this.prevEntryPartSeq = value;
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

            }

        }

    }

}
