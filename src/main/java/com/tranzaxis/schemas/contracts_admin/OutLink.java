
package com.tranzaxis.schemas.contracts_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tranzaxis.schemas.common_types.AppEncryptedData;


/**
 * <p>Java class for OutLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutLink"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/contracts-admin.xsd}Link"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Contract2CardPanCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Contract2Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Contract2TokenId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Contract2TokenExtRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Contract2LoginName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Contract2CardPan" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Contract2CardMbr" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Contract2CardExpDate" type="{http://schemas.radixware.org/types.xsd}DateTime" /&gt;
 *       &lt;attribute name="Seq2" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutLink", propOrder = {
    "contract2CardPanCrypt"
})
@XmlSeeAlso({
    com.tranzaxis.schemas.contracts_admin.Contract.OutLinks.Link.class
})
public class OutLink
    extends com.tranzaxis.schemas.contracts_admin.Link
{

    @XmlElement(name = "Contract2CardPanCrypt")
    protected AppEncryptedData contract2CardPanCrypt;
    @XmlAttribute(name = "Contract2Rid")
    protected String contract2Rid;
    @XmlAttribute(name = "Contract2TokenId")
    protected Long contract2TokenId;
    @XmlAttribute(name = "Contract2TokenExtRid")
    protected String contract2TokenExtRid;
    @XmlAttribute(name = "Contract2LoginName")
    protected String contract2LoginName;
    @XmlAttribute(name = "Contract2CardPan")
    protected String contract2CardPan;
    @XmlAttribute(name = "Contract2CardMbr")
    protected Long contract2CardMbr;
    @XmlAttribute(name = "Contract2CardExpDate")
    protected XMLGregorianCalendar contract2CardExpDate;
    @XmlAttribute(name = "Seq2")
    protected Long seq2;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;

    /**
     * Gets the value of the contract2CardPanCrypt property.
     * 
     * @return
     *     possible object is
     *     {@link AppEncryptedData }
     *     
     */
    public AppEncryptedData getContract2CardPanCrypt() {
        return contract2CardPanCrypt;
    }

    /**
     * Sets the value of the contract2CardPanCrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppEncryptedData }
     *     
     */
    public void setContract2CardPanCrypt(AppEncryptedData value) {
        this.contract2CardPanCrypt = value;
    }

    /**
     * Gets the value of the contract2Rid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContract2Rid() {
        return contract2Rid;
    }

    /**
     * Sets the value of the contract2Rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContract2Rid(String value) {
        this.contract2Rid = value;
    }

    /**
     * Gets the value of the contract2TokenId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContract2TokenId() {
        return contract2TokenId;
    }

    /**
     * Sets the value of the contract2TokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContract2TokenId(Long value) {
        this.contract2TokenId = value;
    }

    /**
     * Gets the value of the contract2TokenExtRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContract2TokenExtRid() {
        return contract2TokenExtRid;
    }

    /**
     * Sets the value of the contract2TokenExtRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContract2TokenExtRid(String value) {
        this.contract2TokenExtRid = value;
    }

    /**
     * Gets the value of the contract2LoginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContract2LoginName() {
        return contract2LoginName;
    }

    /**
     * Sets the value of the contract2LoginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContract2LoginName(String value) {
        this.contract2LoginName = value;
    }

    /**
     * Gets the value of the contract2CardPan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContract2CardPan() {
        return contract2CardPan;
    }

    /**
     * Sets the value of the contract2CardPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContract2CardPan(String value) {
        this.contract2CardPan = value;
    }

    /**
     * Gets the value of the contract2CardMbr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContract2CardMbr() {
        return contract2CardMbr;
    }

    /**
     * Sets the value of the contract2CardMbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContract2CardMbr(Long value) {
        this.contract2CardMbr = value;
    }

    /**
     * Gets the value of the contract2CardExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContract2CardExpDate() {
        return contract2CardExpDate;
    }

    /**
     * Sets the value of the contract2CardExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContract2CardExpDate(XMLGregorianCalendar value) {
        this.contract2CardExpDate = value;
    }

    /**
     * Gets the value of the seq2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeq2() {
        return seq2;
    }

    /**
     * Sets the value of the seq2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeq2(Long value) {
        this.seq2 = value;
    }

    /**
     * Gets the value of the toDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToDelete() {
        return toDelete;
    }

    /**
     * Sets the value of the toDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToDelete(Boolean value) {
        this.toDelete = value;
    }

}
