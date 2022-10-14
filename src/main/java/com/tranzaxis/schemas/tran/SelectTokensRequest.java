
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectTokensRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectTokensRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tran.xsd}SelectContractsRequest"&gt;
 *       &lt;attribute name="TokenProductId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="TokenProductRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectTokensRequest")
public class SelectTokensRequest
    extends SelectContractsRequest
{

    @XmlAttribute(name = "TokenProductId")
    protected Long tokenProductId;
    @XmlAttribute(name = "TokenProductRid")
    protected String tokenProductRid;

    /**
     * Gets the value of the tokenProductId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTokenProductId() {
        return tokenProductId;
    }

    /**
     * Sets the value of the tokenProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTokenProductId(Long value) {
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

}
