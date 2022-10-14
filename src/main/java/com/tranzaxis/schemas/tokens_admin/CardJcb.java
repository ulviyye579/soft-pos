
package com.tranzaxis.schemas.tokens_admin;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardJcb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardJcb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardEmv"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SngTranDmstLmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="TotalCntUpDmstLmt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TotalCntLwDmstLmt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
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
@XmlType(name = "CardJcb", propOrder = {
    "sngTranDmstLmt",
    "totalCntUpDmstLmt",
    "totalCntLwDmstLmt",
    "totalCntUpIntlLmt",
    "totalCntLwIntlLmt"
})
public class CardJcb
    extends CardEmv
{

    @XmlElementRef(name = "SngTranDmstLmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> sngTranDmstLmt;
    @XmlElementRef(name = "TotalCntUpDmstLmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalCntUpDmstLmt;
    @XmlElementRef(name = "TotalCntLwDmstLmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalCntLwDmstLmt;
    @XmlElementRef(name = "TotalCntUpIntlLmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalCntUpIntlLmt;
    @XmlElementRef(name = "TotalCntLwIntlLmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalCntLwIntlLmt;

    /**
     * Gets the value of the sngTranDmstLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSngTranDmstLmt() {
        return sngTranDmstLmt;
    }

    /**
     * Sets the value of the sngTranDmstLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSngTranDmstLmt(JAXBElement<BigDecimal> value) {
        this.sngTranDmstLmt = value;
    }

    /**
     * Gets the value of the totalCntUpDmstLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalCntUpDmstLmt() {
        return totalCntUpDmstLmt;
    }

    /**
     * Sets the value of the totalCntUpDmstLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalCntUpDmstLmt(JAXBElement<Long> value) {
        this.totalCntUpDmstLmt = value;
    }

    /**
     * Gets the value of the totalCntLwDmstLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalCntLwDmstLmt() {
        return totalCntLwDmstLmt;
    }

    /**
     * Sets the value of the totalCntLwDmstLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalCntLwDmstLmt(JAXBElement<Long> value) {
        this.totalCntLwDmstLmt = value;
    }

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
