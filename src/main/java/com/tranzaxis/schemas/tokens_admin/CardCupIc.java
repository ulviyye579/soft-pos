
package com.tranzaxis.schemas.tokens_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardCupIc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardCupIc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardEmv"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalCntICLmt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="TotalCntILmt" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardCupIc", propOrder = {
    "totalCntICLmt",
    "totalCntILmt"
})
public class CardCupIc
    extends CardEmv
{

    @XmlElementRef(name = "TotalCntICLmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalCntICLmt;
    @XmlElementRef(name = "TotalCntILmt", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalCntILmt;

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

}
