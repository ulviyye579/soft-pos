
package com.tranzaxis.schemas.contracts_shadow_admin;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ShadowContractExt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShadowContractExt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PermOverdraft" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="TmpOverdraft" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *         &lt;element name="TmpOverdraftExpiration" type="{http://schemas.radixware.org/types.xsd}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="LedgerBalanceCorr" type="{http://schemas.radixware.org/types.xsd}Num" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShadowContractExt", propOrder = {
    "permOverdraft",
    "tmpOverdraft",
    "tmpOverdraftExpiration",
    "ledgerBalanceCorr"
})
public class ShadowContractExt {

    @XmlElement(name = "PermOverdraft")
    protected BigDecimal permOverdraft;
    @XmlElementRef(name = "TmpOverdraft", namespace = "http://schemas.tranzaxis.com/contracts-shadow-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> tmpOverdraft;
    @XmlElementRef(name = "TmpOverdraftExpiration", namespace = "http://schemas.tranzaxis.com/contracts-shadow-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> tmpOverdraftExpiration;
    @XmlElementRef(name = "LedgerBalanceCorr", namespace = "http://schemas.tranzaxis.com/contracts-shadow-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ledgerBalanceCorr;

    /**
     * Gets the value of the permOverdraft property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPermOverdraft() {
        return permOverdraft;
    }

    /**
     * Sets the value of the permOverdraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPermOverdraft(BigDecimal value) {
        this.permOverdraft = value;
    }

    /**
     * Gets the value of the tmpOverdraft property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTmpOverdraft() {
        return tmpOverdraft;
    }

    /**
     * Sets the value of the tmpOverdraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTmpOverdraft(JAXBElement<BigDecimal> value) {
        this.tmpOverdraft = value;
    }

    /**
     * Gets the value of the tmpOverdraftExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTmpOverdraftExpiration() {
        return tmpOverdraftExpiration;
    }

    /**
     * Sets the value of the tmpOverdraftExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTmpOverdraftExpiration(JAXBElement<XMLGregorianCalendar> value) {
        this.tmpOverdraftExpiration = value;
    }

    /**
     * Gets the value of the ledgerBalanceCorr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLedgerBalanceCorr() {
        return ledgerBalanceCorr;
    }

    /**
     * Sets the value of the ledgerBalanceCorr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLedgerBalanceCorr(JAXBElement<BigDecimal> value) {
        this.ledgerBalanceCorr = value;
    }

}
