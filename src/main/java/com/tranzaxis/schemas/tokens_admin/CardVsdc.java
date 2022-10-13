
package com.tranzaxis.schemas.tokens_admin;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardVsdc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardVsdc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardEmv"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalCntICLmt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TotalCntILmt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TotalCntUpILmt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmtDCLmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="VlpFundsLmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="VlpTranLmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="VlpResetThreshold" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="AppCapabilities" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="CvmLimit" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardVsdc", propOrder = {
    "totalCntICLmt",
    "totalCntILmt",
    "totalCntUpILmt",
    "totalAmtDCLmt",
    "vlpFundsLmt",
    "vlpTranLmt",
    "vlpResetThreshold",
    "appCapabilities",
    "cvmLimit"
})
public class CardVsdc
    extends CardEmv
{

    @XmlElementRef(name = "TotalCntICLmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalCntICLmt;
    @XmlElementRef(name = "TotalCntILmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalCntILmt;
    @XmlElementRef(name = "TotalCntUpILmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalCntUpILmt;
    @XmlElementRef(name = "TotalAmtDCLmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalAmtDCLmt;
    @XmlElementRef(name = "VlpFundsLmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> vlpFundsLmt;
    @XmlElementRef(name = "VlpTranLmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> vlpTranLmt;
    @XmlElementRef(name = "VlpResetThreshold", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> vlpResetThreshold;
    @XmlElementRef(name = "AppCapabilities", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> appCapabilities;
    @XmlElementRef(name = "CvmLimit", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> cvmLimit;

    /**
     * Gets the value of the totalCntICLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalCntICLmt() {
        return totalCntICLmt;
    }

    /**
     * Sets the value of the totalCntICLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalCntICLmt(JAXBElement<Long> value) {
        this.totalCntICLmt = value;
    }

    /**
     * Gets the value of the totalCntILmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalCntILmt() {
        return totalCntILmt;
    }

    /**
     * Sets the value of the totalCntILmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalCntILmt(JAXBElement<Long> value) {
        this.totalCntILmt = value;
    }

    /**
     * Gets the value of the totalCntUpILmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalCntUpILmt() {
        return totalCntUpILmt;
    }

    /**
     * Sets the value of the totalCntUpILmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalCntUpILmt(JAXBElement<Long> value) {
        this.totalCntUpILmt = value;
    }

    /**
     * Gets the value of the totalAmtDCLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalAmtDCLmt() {
        return totalAmtDCLmt;
    }

    /**
     * Sets the value of the totalAmtDCLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalAmtDCLmt(JAXBElement<BigDecimal> value) {
        this.totalAmtDCLmt = value;
    }

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

    /**
     * Gets the value of the vlpTranLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getVlpTranLmt() {
        return vlpTranLmt;
    }

    /**
     * Sets the value of the vlpTranLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setVlpTranLmt(JAXBElement<BigDecimal> value) {
        this.vlpTranLmt = value;
    }

    /**
     * Gets the value of the vlpResetThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getVlpResetThreshold() {
        return vlpResetThreshold;
    }

    /**
     * Sets the value of the vlpResetThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setVlpResetThreshold(JAXBElement<BigDecimal> value) {
        this.vlpResetThreshold = value;
    }

    /**
     * Gets the value of the appCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAppCapabilities() {
        return appCapabilities;
    }

    /**
     * Sets the value of the appCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAppCapabilities(JAXBElement<Long> value) {
        this.appCapabilities = value;
    }

    /**
     * Gets the value of the cvmLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCvmLimit() {
        return cvmLimit;
    }

    /**
     * Sets the value of the cvmLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCvmLimit(JAXBElement<BigDecimal> value) {
        this.cvmLimit = value;
    }

}
