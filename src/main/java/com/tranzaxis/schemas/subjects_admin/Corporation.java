
package com.tranzaxis.schemas.subjects_admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Corporation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Corporation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/subjects-admin.xsd}Organization"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CorporationBankProps" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Property" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}CorporationBankProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Corporation", propOrder = {
    "corporationBankProps"
})
public class Corporation
    extends Organization
{

    @XmlElementRef(name = "CorporationBankProps", namespace = "http://schemas.tranzaxis.com/subjects-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Corporation.CorporationBankProps> corporationBankProps;

    /**
     * Gets the value of the corporationBankProps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Corporation.CorporationBankProps }{@code >}
     *     
     */
    public JAXBElement<Corporation.CorporationBankProps> getCorporationBankProps() {
        return corporationBankProps;
    }

    /**
     * Sets the value of the corporationBankProps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Corporation.CorporationBankProps }{@code >}
     *     
     */
    public void setCorporationBankProps(JAXBElement<Corporation.CorporationBankProps> value) {
        this.corporationBankProps = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Property" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}CorporationBankProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Mode" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}Mode" default="Sync" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "property"
    })
    public static class CorporationBankProps {

        @XmlElement(name = "Property")
        protected List<CorporationBankProperty> property;
        @XmlAttribute(name = "Mode")
        protected Mode mode;

        /**
         * Gets the value of the property property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the property property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CorporationBankProperty }
         * 
         * 
         */
        public List<CorporationBankProperty> getProperty() {
            if (property == null) {
                property = new ArrayList<CorporationBankProperty>();
            }
            return this.property;
        }

        /**
         * Gets the value of the mode property.
         * 
         * @return
         *     possible object is
         *     {@link Mode }
         *     
         */
        public Mode getMode() {
            if (mode == null) {
                return Mode.SYNC;
            } else {
                return mode;
            }
        }

        /**
         * Sets the value of the mode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Mode }
         *     
         */
        public void setMode(Mode value) {
            this.mode = value;
        }

    }

}
