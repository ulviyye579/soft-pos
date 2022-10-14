
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
 * <p>Java class for PostEntryPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostEntryPart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InLink" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="PrevEntryPartRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="PrevTranId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="PrevEntrySeq" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *                 &lt;attribute name="PrevEntryPartSeq" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
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
 *       &lt;attribute name="AcctId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="AcctNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AcctExtNumber" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AcctMapGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="RegisterRole" type="{http://schemas.tranzaxis.com/tran.xsd}RegisterRoleEnum" /&gt;
 *       &lt;attribute name="Classification" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ClassificationForGl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="GlCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="FinOperKind" type="{http://schemas.tranzaxis.com/tran.xsd}FinOperKindEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostEntryPart", propOrder = {
    "inLink"
})
public class PostEntryPart {

    @XmlElement(name = "InLink")
    protected List<PostEntryPart.InLink> inLink;
    @XmlAttribute(name = "AcctId")
    protected Long acctId;
    @XmlAttribute(name = "AcctNumber")
    protected String acctNumber;
    @XmlAttribute(name = "AcctExtNumber")
    protected String acctExtNumber;
    @XmlAttribute(name = "AcctMapGuid")
    protected String acctMapGuid;
    @XmlAttribute(name = "RegisterRole")
    protected String registerRole;
    @XmlAttribute(name = "Classification")
    protected String classification;
    @XmlAttribute(name = "ClassificationForGl")
    protected String classificationForGl;
    @XmlAttribute(name = "GlCode")
    protected String glCode;
    @XmlAttribute(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlAttribute(name = "Ccy", required = true)
    protected long ccy;
    @XmlAttribute(name = "Rid")
    protected String rid;
    @XmlAttribute(name = "FinOperKind")
    protected String finOperKind;

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
     * {@link PostEntryPart.InLink }
     * 
     * 
     */
    public List<PostEntryPart.InLink> getInLink() {
        if (inLink == null) {
            inLink = new ArrayList<PostEntryPart.InLink>();
        }
        return this.inLink;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAcctId(Long value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNumber() {
        return acctNumber;
    }

    /**
     * Sets the value of the acctNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNumber(String value) {
        this.acctNumber = value;
    }

    /**
     * Gets the value of the acctExtNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctExtNumber() {
        return acctExtNumber;
    }

    /**
     * Sets the value of the acctExtNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctExtNumber(String value) {
        this.acctExtNumber = value;
    }

    /**
     * Gets the value of the acctMapGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctMapGuid() {
        return acctMapGuid;
    }

    /**
     * Sets the value of the acctMapGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctMapGuid(String value) {
        this.acctMapGuid = value;
    }

    /**
     * Gets the value of the registerRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterRole() {
        return registerRole;
    }

    /**
     * Sets the value of the registerRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterRole(String value) {
        this.registerRole = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="PrevEntryPartRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="PrevTranId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="PrevEntrySeq" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
     *       &lt;attribute name="PrevEntryPartSeq" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
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

        @XmlAttribute(name = "PrevEntryPartRid")
        protected String prevEntryPartRid;
        @XmlAttribute(name = "PrevTranId")
        protected Long prevTranId;
        @XmlAttribute(name = "PrevEntrySeq")
        protected Long prevEntrySeq;
        @XmlAttribute(name = "PrevEntryPartSeq")
        protected Long prevEntryPartSeq;
        @XmlAttribute(name = "Kind", required = true)
        protected String kind;

        /**
         * Gets the value of the prevEntryPartRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrevEntryPartRid() {
            return prevEntryPartRid;
        }

        /**
         * Sets the value of the prevEntryPartRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrevEntryPartRid(String value) {
            this.prevEntryPartRid = value;
        }

        /**
         * Gets the value of the prevTranId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPrevTranId() {
            return prevTranId;
        }

        /**
         * Sets the value of the prevTranId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPrevTranId(Long value) {
            this.prevTranId = value;
        }

        /**
         * Gets the value of the prevEntrySeq property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPrevEntrySeq() {
            return prevEntrySeq;
        }

        /**
         * Sets the value of the prevEntrySeq property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPrevEntrySeq(Long value) {
            this.prevEntrySeq = value;
        }

        /**
         * Gets the value of the prevEntryPartSeq property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPrevEntryPartSeq() {
            return prevEntryPartSeq;
        }

        /**
         * Sets the value of the prevEntryPartSeq property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPrevEntryPartSeq(Long value) {
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
