
package com.tranzaxis.schemas.tokens_admin;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardEmv complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardEmv"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tokens-admin.xsd}Card"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UseCap" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="LastAtc" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="AppCcy" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmtUpLmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmtLwLmt" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="TotalCntUpLmt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TotalCntLwLmt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="InvalidCapTriesCnt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="EmvAppBlocked" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="EmvCardBlocked" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="MainCardAppId" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardEmv", propOrder = {
    "useCap",
    "lastAtc",
    "appCcy",
    "totalAmtUpLmt",
    "totalAmtLwLmt",
    "totalCntUpLmt",
    "totalCntLwLmt",
    "invalidCapTriesCnt",
    "emvAppBlocked",
    "emvCardBlocked",
    "mainCardAppId"
})
@XmlSeeAlso({
    CardMc.class,
    CardVsdc.class,
    CardAmex.class,
    CardJcb.class,
    CardNsiccs.class,
    CardVccs.class,
    CardCupIc.class,
    CardCcd.class
})
public class CardEmv
    extends Card
{

    @XmlElementRef(name = "UseCap", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useCap;
    @XmlElementRef(name = "LastAtc", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lastAtc;
    @XmlElementRef(name = "AppCcy", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> appCcy;
    @XmlElementRef(name = "TotalAmtUpLmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalAmtUpLmt;
    @XmlElementRef(name = "TotalAmtLwLmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalAmtLwLmt;
    @XmlElementRef(name = "TotalCntUpLmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalCntUpLmt;
    @XmlElementRef(name = "TotalCntLwLmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalCntLwLmt;
    @XmlElementRef(name = "InvalidCapTriesCnt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> invalidCapTriesCnt;
    @XmlElementRef(name = "EmvAppBlocked", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> emvAppBlocked;
    @XmlElementRef(name = "EmvCardBlocked", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> emvCardBlocked;
    @XmlElementRef(name = "MainCardAppId", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> mainCardAppId;

    /**
     * Gets the value of the useCap property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseCap() {
        return useCap;
    }

    /**
     * Sets the value of the useCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseCap(JAXBElement<Boolean> value) {
        this.useCap = value;
    }

    /**
     * Gets the value of the lastAtc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLastAtc() {
        return lastAtc;
    }

    /**
     * Sets the value of the lastAtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLastAtc(JAXBElement<Long> value) {
        this.lastAtc = value;
    }

    /**
     * Gets the value of the appCcy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAppCcy() {
        return appCcy;
    }

    /**
     * Sets the value of the appCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAppCcy(JAXBElement<Long> value) {
        this.appCcy = value;
    }

    /**
     * Gets the value of the totalAmtUpLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalAmtUpLmt() {
        return totalAmtUpLmt;
    }

    /**
     * Sets the value of the totalAmtUpLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalAmtUpLmt(JAXBElement<BigDecimal> value) {
        this.totalAmtUpLmt = value;
    }

    /**
     * Gets the value of the totalAmtLwLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalAmtLwLmt() {
        return totalAmtLwLmt;
    }

    /**
     * Sets the value of the totalAmtLwLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalAmtLwLmt(JAXBElement<BigDecimal> value) {
        this.totalAmtLwLmt = value;
    }

    /**
     * Gets the value of the totalCntUpLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalCntUpLmt() {
        return totalCntUpLmt;
    }

    /**
     * Sets the value of the totalCntUpLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalCntUpLmt(JAXBElement<Long> value) {
        this.totalCntUpLmt = value;
    }

    /**
     * Gets the value of the totalCntLwLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalCntLwLmt() {
        return totalCntLwLmt;
    }

    /**
     * Sets the value of the totalCntLwLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalCntLwLmt(JAXBElement<Long> value) {
        this.totalCntLwLmt = value;
    }

    /**
     * Gets the value of the invalidCapTriesCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInvalidCapTriesCnt() {
        return invalidCapTriesCnt;
    }

    /**
     * Sets the value of the invalidCapTriesCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInvalidCapTriesCnt(JAXBElement<Long> value) {
        this.invalidCapTriesCnt = value;
    }

    /**
     * Gets the value of the emvAppBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEmvAppBlocked() {
        return emvAppBlocked;
    }

    /**
     * Sets the value of the emvAppBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEmvAppBlocked(JAXBElement<Boolean> value) {
        this.emvAppBlocked = value;
    }

    /**
     * Gets the value of the emvCardBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEmvCardBlocked() {
        return emvCardBlocked;
    }

    /**
     * Sets the value of the emvCardBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEmvCardBlocked(JAXBElement<Boolean> value) {
        this.emvCardBlocked = value;
    }

    /**
     * Gets the value of the mainCardAppId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMainCardAppId() {
        return mainCardAppId;
    }

    /**
     * Sets the value of the mainCardAppId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMainCardAppId(JAXBElement<Long> value) {
        this.mainCardAppId = value;
    }

}
