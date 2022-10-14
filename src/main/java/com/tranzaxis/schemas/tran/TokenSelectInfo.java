
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenSelectInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenSelectInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tran.xsd}ContractSelectInfo"&gt;
 *       &lt;attribute name="TokenId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TokenRid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TokenClass" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="TokenProductId" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TokenProductRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TokenProductTitle" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="TokenStatus" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="TokenPhaseId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenSelectInfo")
public class TokenSelectInfo
    extends ContractSelectInfo
{

    @XmlAttribute(name = "TokenId", required = true)
    protected long tokenId;
    @XmlAttribute(name = "TokenRid", required = true)
    protected String tokenRid;
    @XmlAttribute(name = "TokenClass", required = true)
    protected String tokenClass;
    @XmlAttribute(name = "TokenProductId", required = true)
    protected long tokenProductId;
    @XmlAttribute(name = "TokenProductRid")
    protected String tokenProductRid;
    @XmlAttribute(name = "TokenProductTitle")
    protected String tokenProductTitle;
    @XmlAttribute(name = "TokenStatus", required = true)
    protected String tokenStatus;
    @XmlAttribute(name = "TokenPhaseId")
    protected Long tokenPhaseId;

    /**
     * Gets the value of the tokenId property.
     * 
     */
    public long getTokenId() {
        return tokenId;
    }

    /**
     * Sets the value of the tokenId property.
     * 
     */
    public void setTokenId(long value) {
        this.tokenId = value;
    }

    /**
     * Gets the value of the tokenRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenRid() {
        return tokenRid;
    }

    /**
     * Sets the value of the tokenRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenRid(String value) {
        this.tokenRid = value;
    }

    /**
     * Gets the value of the tokenClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenClass() {
        return tokenClass;
    }

    /**
     * Sets the value of the tokenClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenClass(String value) {
        this.tokenClass = value;
    }

    /**
     * Gets the value of the tokenProductId property.
     * 
     */
    public long getTokenProductId() {
        return tokenProductId;
    }

    /**
     * Sets the value of the tokenProductId property.
     * 
     */
    public void setTokenProductId(long value) {
        this.tokenProductId = value;
    }

    /**
     * Gets the value of the tokenProductRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenProductRid() {
        return tokenProductRid;
    }

    /**
     * Sets the value of the tokenProductRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenProductRid(String value) {
        this.tokenProductRid = value;
    }

    /**
     * Gets the value of the tokenProductTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenProductTitle() {
        return tokenProductTitle;
    }

    /**
     * Sets the value of the tokenProductTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenProductTitle(String value) {
        this.tokenProductTitle = value;
    }

    /**
     * Gets the value of the tokenStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenStatus() {
        return tokenStatus;
    }

    /**
     * Sets the value of the tokenStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenStatus(String value) {
        this.tokenStatus = value;
    }

    /**
     * Gets the value of the tokenPhaseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTokenPhaseId() {
        return tokenPhaseId;
    }

    /**
     * Sets the value of the tokenPhaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTokenPhaseId(Long value) {
        this.tokenPhaseId = value;
    }

}
