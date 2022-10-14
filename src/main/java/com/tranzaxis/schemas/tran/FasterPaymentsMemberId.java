
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FasterPaymentsMemberId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FasterPaymentsMemberId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ConnectionTypeIndicator" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="IscdBankCode" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FasterPaymentsMemberId")
public class FasterPaymentsMemberId {

    @XmlAttribute(name = "ConnectionTypeIndicator")
    protected Long connectionTypeIndicator;
    @XmlAttribute(name = "IscdBankCode")
    protected Long iscdBankCode;

    /**
     * Gets the value of the connectionTypeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConnectionTypeIndicator() {
        return connectionTypeIndicator;
    }

    /**
     * Sets the value of the connectionTypeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConnectionTypeIndicator(Long value) {
        this.connectionTypeIndicator = value;
    }

    /**
     * Gets the value of the iscdBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIscdBankCode() {
        return iscdBankCode;
    }

    /**
     * Sets the value of the iscdBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIscdBankCode(Long value) {
        this.iscdBankCode = value;
    }

}
