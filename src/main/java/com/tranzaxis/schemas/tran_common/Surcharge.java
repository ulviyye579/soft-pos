
package com.tranzaxis.schemas.tran_common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Surcharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Surcharge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="SurchargePayer" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="TariffVerId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TariffTableCellId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="CorrespondentAcctMapGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="CorrespondentContractId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="EntryCategoryCode" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="EntryCategoryText" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="DccRefAmt" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Surcharge")
public class Surcharge {

    @XmlAttribute(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlAttribute(name = "SurchargePayer", required = true)
    protected String surchargePayer;
    @XmlAttribute(name = "TariffVerId")
    protected Long tariffVerId;
    @XmlAttribute(name = "TariffTableCellId")
    protected Long tariffTableCellId;
    @XmlAttribute(name = "CorrespondentAcctMapGuid")
    protected String correspondentAcctMapGuid;
    @XmlAttribute(name = "CorrespondentContractId")
    protected Long correspondentContractId;
    @XmlAttribute(name = "EntryCategoryCode")
    protected String entryCategoryCode;
    @XmlAttribute(name = "EntryCategoryText")
    protected String entryCategoryText;
    @XmlAttribute(name = "DccRefAmt")
    protected BigDecimal dccRefAmt;

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
     * Gets the value of the surchargePayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurchargePayer() {
        return surchargePayer;
    }

    /**
     * Sets the value of the surchargePayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurchargePayer(String value) {
        this.surchargePayer = value;
    }

    /**
     * Gets the value of the tariffVerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTariffVerId() {
        return tariffVerId;
    }

    /**
     * Sets the value of the tariffVerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTariffVerId(Long value) {
        this.tariffVerId = value;
    }

    /**
     * Gets the value of the tariffTableCellId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTariffTableCellId() {
        return tariffTableCellId;
    }

    /**
     * Sets the value of the tariffTableCellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTariffTableCellId(Long value) {
        this.tariffTableCellId = value;
    }

    /**
     * Gets the value of the correspondentAcctMapGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondentAcctMapGuid() {
        return correspondentAcctMapGuid;
    }

    /**
     * Sets the value of the correspondentAcctMapGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondentAcctMapGuid(String value) {
        this.correspondentAcctMapGuid = value;
    }

    /**
     * Gets the value of the correspondentContractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCorrespondentContractId() {
        return correspondentContractId;
    }

    /**
     * Sets the value of the correspondentContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCorrespondentContractId(Long value) {
        this.correspondentContractId = value;
    }

    /**
     * Gets the value of the entryCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryCategoryCode() {
        return entryCategoryCode;
    }

    /**
     * Sets the value of the entryCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryCategoryCode(String value) {
        this.entryCategoryCode = value;
    }

    /**
     * Gets the value of the entryCategoryText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryCategoryText() {
        return entryCategoryText;
    }

    /**
     * Sets the value of the entryCategoryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryCategoryText(String value) {
        this.entryCategoryText = value;
    }

    /**
     * Gets the value of the dccRefAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDccRefAmt() {
        return dccRefAmt;
    }

    /**
     * Sets the value of the dccRefAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDccRefAmt(BigDecimal value) {
        this.dccRefAmt = value;
    }

}
