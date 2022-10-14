
package org.radixware.schemas.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoneyValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoneyValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Amt" use="required" type="{http://schemas.radixware.org/types.xsd}Num" /&gt;
 *       &lt;attribute name="Ccy" use="required" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyValue")
public class MoneyValue {

    @XmlAttribute(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlAttribute(name = "Ccy", required = true)
    protected long ccy;

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

}
