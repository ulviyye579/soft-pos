
package com.tranzaxis.schemas.tran;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MigrationEntryPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MigrationEntryPart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="DoerRole" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="BaseAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="BaseCcy" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="AcctAmt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="AcctCcy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="FinOperKind" type="{http://schemas.tranzaxis.com/tran.xsd}FinOperKindEnum" /&gt;
 *       &lt;attribute name="Classification" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ClassificationForGl" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="GlCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="RegisterRole" type="{http://schemas.tranzaxis.com/tran.xsd}RegisterRoleEnum" /&gt;
 *       &lt;attribute name="RegisterSection" type="{http://schemas.tranzaxis.com/tran.xsd}RegisterSectionEnum" /&gt;
 *       &lt;attribute name="AcctRole" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AcctClassification" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="AcctSchemaKey" type="{http://schemas.radixware.org/types.xsd}Str" default="-" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrationEntryPart")
public class MigrationEntryPart {

    @XmlAttribute(name = "DoerRole", required = true)
    protected String doerRole;
    @XmlAttribute(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlAttribute(name = "Ccy", required = true)
    protected long ccy;
    @XmlAttribute(name = "BaseAmt")
    protected BigDecimal baseAmt;
    @XmlAttribute(name = "BaseCcy")
    protected Long baseCcy;
    @XmlAttribute(name = "AcctAmt", required = true)
    protected BigDecimal acctAmt;
    @XmlAttribute(name = "AcctCcy", required = true)
    protected long acctCcy;
    @XmlAttribute(name = "FinOperKind")
    protected String finOperKind;
    @XmlAttribute(name = "Classification")
    protected String classification;
    @XmlAttribute(name = "ClassificationForGl")
    protected String classificationForGl;
    @XmlAttribute(name = "GlCode")
    protected String glCode;
    @XmlAttribute(name = "RegisterRole")
    protected String registerRole;
    @XmlAttribute(name = "RegisterSection")
    protected String registerSection;
    @XmlAttribute(name = "AcctRole")
    protected String acctRole;
    @XmlAttribute(name = "AcctClassification")
    protected String acctClassification;
    @XmlAttribute(name = "AcctSchemaKey")
    protected String acctSchemaKey;

    /**
     * Gets the value of the doerRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoerRole() {
        return doerRole;
    }

    /**
     * Sets the value of the doerRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoerRole(String value) {
        this.doerRole = value;
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
     * Gets the value of the baseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseAmt() {
        return baseAmt;
    }

    /**
     * Sets the value of the baseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseAmt(BigDecimal value) {
        this.baseAmt = value;
    }

    /**
     * Gets the value of the baseCcy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBaseCcy() {
        return baseCcy;
    }

    /**
     * Sets the value of the baseCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBaseCcy(Long value) {
        this.baseCcy = value;
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
     * Gets the value of the acctCcy property.
     * 
     */
    public long getAcctCcy() {
        return acctCcy;
    }

    /**
     * Sets the value of the acctCcy property.
     * 
     */
    public void setAcctCcy(long value) {
        this.acctCcy = value;
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
     * Gets the value of the registerSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterSection() {
        return registerSection;
    }

    /**
     * Sets the value of the registerSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterSection(String value) {
        this.registerSection = value;
    }

    /**
     * Gets the value of the acctRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctRole() {
        return acctRole;
    }

    /**
     * Sets the value of the acctRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctRole(String value) {
        this.acctRole = value;
    }

    /**
     * Gets the value of the acctClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctClassification() {
        return acctClassification;
    }

    /**
     * Sets the value of the acctClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctClassification(String value) {
        this.acctClassification = value;
    }

    /**
     * Gets the value of the acctSchemaKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSchemaKey() {
        if (acctSchemaKey == null) {
            return "-";
        } else {
            return acctSchemaKey;
        }
    }

    /**
     * Sets the value of the acctSchemaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSchemaKey(String value) {
        this.acctSchemaKey = value;
    }

}
