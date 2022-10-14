
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tran-common.xsd}OrganizationBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubMerchant" type="{http://schemas.tranzaxis.com/tran-common.xsd}SubMerchantInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ExternalRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="MerchantRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="FacilitatorTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="FacilitatorRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="IsoRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="SubMerchantRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="SingleMerchantRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="FeeProgramIndicators" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="MerchantCapability" type="{http://schemas.tranzaxis.com/tran-common.xsd}MerchantCapabilityEnum" /&gt;
 *       &lt;attribute name="MerchantVerificationValue" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="BranchId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="BranchName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="FacilitatorKind" type="{http://schemas.tranzaxis.com/tran-common.xsd}MerchantFacilitatorKindEnum" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationInfo", propOrder = {
    "subMerchant"
})
public class OrganizationInfo
    extends OrganizationBase
{

    @XmlElement(name = "SubMerchant")
    protected SubMerchantInfo subMerchant;
    @XmlAttribute(name = "ExternalRid")
    protected String externalRid;
    @XmlAttribute(name = "MerchantRid")
    protected String merchantRid;
    @XmlAttribute(name = "FacilitatorTitle")
    protected String facilitatorTitle;
    @XmlAttribute(name = "FacilitatorRid")
    protected String facilitatorRid;
    @XmlAttribute(name = "IsoRid")
    protected String isoRid;
    @XmlAttribute(name = "SubMerchantRid")
    protected String subMerchantRid;
    @XmlAttribute(name = "SingleMerchantRid")
    protected String singleMerchantRid;
    @XmlAttribute(name = "FeeProgramIndicators")
    protected String feeProgramIndicators;
    @XmlAttribute(name = "MerchantCapability")
    protected String merchantCapability;
    @XmlAttribute(name = "MerchantVerificationValue")
    protected String merchantVerificationValue;
    @XmlAttribute(name = "BranchId")
    protected Long branchId;
    @XmlAttribute(name = "BranchName")
    protected String branchName;
    @XmlAttribute(name = "FacilitatorKind")
    protected String facilitatorKind;

    /**
     * Gets the value of the subMerchant property.
     * 
     * @return
     *     possible object is
     *     {@link SubMerchantInfo }
     *     
     */
    public SubMerchantInfo getSubMerchant() {
        return subMerchant;
    }

    /**
     * Sets the value of the subMerchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubMerchantInfo }
     *     
     */
    public void setSubMerchant(SubMerchantInfo value) {
        this.subMerchant = value;
    }

    /**
     * Gets the value of the externalRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRid() {
        return externalRid;
    }

    /**
     * Sets the value of the externalRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRid(String value) {
        this.externalRid = value;
    }

    /**
     * Gets the value of the merchantRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantRid() {
        return merchantRid;
    }

    /**
     * Sets the value of the merchantRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantRid(String value) {
        this.merchantRid = value;
    }

    /**
     * Gets the value of the facilitatorTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilitatorTitle() {
        return facilitatorTitle;
    }

    /**
     * Sets the value of the facilitatorTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilitatorTitle(String value) {
        this.facilitatorTitle = value;
    }

    /**
     * Gets the value of the facilitatorRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilitatorRid() {
        return facilitatorRid;
    }

    /**
     * Sets the value of the facilitatorRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilitatorRid(String value) {
        this.facilitatorRid = value;
    }

    /**
     * Gets the value of the isoRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoRid() {
        return isoRid;
    }

    /**
     * Sets the value of the isoRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoRid(String value) {
        this.isoRid = value;
    }

    /**
     * Gets the value of the subMerchantRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubMerchantRid() {
        return subMerchantRid;
    }

    /**
     * Sets the value of the subMerchantRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubMerchantRid(String value) {
        this.subMerchantRid = value;
    }

    /**
     * Gets the value of the singleMerchantRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleMerchantRid() {
        return singleMerchantRid;
    }

    /**
     * Sets the value of the singleMerchantRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleMerchantRid(String value) {
        this.singleMerchantRid = value;
    }

    /**
     * Gets the value of the feeProgramIndicators property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeProgramIndicators() {
        return feeProgramIndicators;
    }

    /**
     * Sets the value of the feeProgramIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeProgramIndicators(String value) {
        this.feeProgramIndicators = value;
    }

    /**
     * Gets the value of the merchantCapability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCapability() {
        return merchantCapability;
    }

    /**
     * Sets the value of the merchantCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCapability(String value) {
        this.merchantCapability = value;
    }

    /**
     * Gets the value of the merchantVerificationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantVerificationValue() {
        return merchantVerificationValue;
    }

    /**
     * Sets the value of the merchantVerificationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantVerificationValue(String value) {
        this.merchantVerificationValue = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBranchId(Long value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the facilitatorKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilitatorKind() {
        return facilitatorKind;
    }

    /**
     * Sets the value of the facilitatorKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilitatorKind(String value) {
        this.facilitatorKind = value;
    }

}
