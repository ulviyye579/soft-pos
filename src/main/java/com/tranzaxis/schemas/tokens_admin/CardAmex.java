
package com.tranzaxis.schemas.tokens_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAmex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAmex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardEmv"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalCntUpIntlLmt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TotalCntLwIntlLmt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAmex", propOrder = {
    "totalCntUpIntlLmt",
    "totalCntLwIntlLmt"
})
public class CardAmex
    extends CardEmv
{

    @XmlElementRef(name = "TotalCntUpIntlLmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalCntUpIntlLmt;
    @XmlElementRef(name = "TotalCntLwIntlLmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalCntLwIntlLmt;

    /**
     * Gets the value of the totalCntUpIntlLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalCntUpIntlLmt() {
        return totalCntUpIntlLmt;
    }

    /**
     * Sets the value of the totalCntUpIntlLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalCntUpIntlLmt(JAXBElement<Long> value) {
        this.totalCntUpIntlLmt = value;
    }

    /**
     * Gets the value of the totalCntLwIntlLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalCntLwIntlLmt() {
        return totalCntLwIntlLmt;
    }

    /**
     * Sets the value of the totalCntLwIntlLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalCntLwIntlLmt(JAXBElement<Long> value) {
        this.totalCntLwIntlLmt = value;
    }

}
