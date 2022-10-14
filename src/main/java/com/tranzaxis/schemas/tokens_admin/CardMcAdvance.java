
package com.tranzaxis.schemas.tokens_admin;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardMcAdvance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardMcAdvance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardMc"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalAmtUpLmt2" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmtLwLmt2" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="TotalCntUpLmt2" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TotalCntLwLmt2" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="InterfaceEnablingSwitch" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardMcAdvance", propOrder = {
    "totalAmtUpLmt2",
    "totalAmtLwLmt2",
    "totalCntUpLmt2",
    "totalCntLwLmt2",
    "interfaceEnablingSwitch"
})
public class CardMcAdvance
    extends CardMc
{

    @XmlElementRef(name = "TotalAmtUpLmt2", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalAmtUpLmt2;
    @XmlElementRef(name = "TotalAmtLwLmt2", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalAmtLwLmt2;
    @XmlElementRef(name = "TotalCntUpLmt2", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalCntUpLmt2;
    @XmlElementRef(name = "TotalCntLwLmt2", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalCntLwLmt2;
    @XmlElementRef(name = "InterfaceEnablingSwitch", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> interfaceEnablingSwitch;

    /**
     * Gets the value of the totalAmtUpLmt2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalAmtUpLmt2() {
        return totalAmtUpLmt2;
    }

    /**
     * Sets the value of the totalAmtUpLmt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalAmtUpLmt2(JAXBElement<BigDecimal> value) {
        this.totalAmtUpLmt2 = value;
    }

    /**
     * Gets the value of the totalAmtLwLmt2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalAmtLwLmt2() {
        return totalAmtLwLmt2;
    }

    /**
     * Sets the value of the totalAmtLwLmt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalAmtLwLmt2(JAXBElement<BigDecimal> value) {
        this.totalAmtLwLmt2 = value;
    }

    /**
     * Gets the value of the totalCntUpLmt2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalCntUpLmt2() {
        return totalCntUpLmt2;
    }

    /**
     * Sets the value of the totalCntUpLmt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalCntUpLmt2(JAXBElement<Long> value) {
        this.totalCntUpLmt2 = value;
    }

    /**
     * Gets the value of the totalCntLwLmt2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalCntLwLmt2() {
        return totalCntLwLmt2;
    }

    /**
     * Sets the value of the totalCntLwLmt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalCntLwLmt2(JAXBElement<Long> value) {
        this.totalCntLwLmt2 = value;
    }

    /**
     * Gets the value of the interfaceEnablingSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInterfaceEnablingSwitch() {
        return interfaceEnablingSwitch;
    }

    /**
     * Sets the value of the interfaceEnablingSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInterfaceEnablingSwitch(JAXBElement<Long> value) {
        this.interfaceEnablingSwitch = value;
    }

}
