
package com.tranzaxis.schemas.tariffs_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TariffTableCellDim complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffTableCellDim"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Val" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Idx" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffTableCellDim", propOrder = {
    "rid",
    "val"
})
public class TariffTableCellDim {

    @XmlElementRef(name = "Rid", namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rid;
    @XmlElementRef(name = "Val", namespace = "http://schemas.tranzaxis.com/tariffs-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> val;
    @XmlAttribute(name = "Idx")
    protected Long idx;

    /**
     * Gets the value of the rid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRid() {
        return rid;
    }

    /**
     * Sets the value of the rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRid(JAXBElement<String> value) {
        this.rid = value;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVal(JAXBElement<String> value) {
        this.val = value;
    }

    /**
     * Gets the value of the idx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdx() {
        return idx;
    }

    /**
     * Sets the value of the idx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdx(Long value) {
        this.idx = value;
    }

}
