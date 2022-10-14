
package com.tranzaxis.schemas.tokens_admin;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardNspk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardNspk"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardCpa"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VlpFundsLmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardNspk", propOrder = {
    "vlpFundsLmt"
})
public class CardNspk
    extends CardCpa
{

    @XmlElementRef(name = "VlpFundsLmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> vlpFundsLmt;

    /**
     * Gets the value of the vlpFundsLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getVlpFundsLmt() {
        return vlpFundsLmt;
    }

    /**
     * Sets the value of the vlpFundsLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setVlpFundsLmt(JAXBElement<BigDecimal> value) {
        this.vlpFundsLmt = value;
    }

}
