
package com.tranzaxis.schemas.tran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonalInfoCheck complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalInfoCheck"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="StreetAddressOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="ZipOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="BirthDateOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="DocOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="PhoneOk" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalInfoCheck")
@XmlSeeAlso({
    com.tranzaxis.schemas.tran.Request.Parties.Cust.Auth.PersonalInfo.class
})
public class PersonalInfoCheck {

    @XmlAttribute(name = "StreetAddressOk")
    protected Boolean streetAddressOk;
    @XmlAttribute(name = "ZipOk")
    protected Boolean zipOk;
    @XmlAttribute(name = "BirthDateOk")
    protected Boolean birthDateOk;
    @XmlAttribute(name = "DocOk")
    protected Boolean docOk;
    @XmlAttribute(name = "PhoneOk")
    protected Boolean phoneOk;

    /**
     * Gets the value of the streetAddressOk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStreetAddressOk() {
        return streetAddressOk;
    }

    /**
     * Sets the value of the streetAddressOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStreetAddressOk(Boolean value) {
        this.streetAddressOk = value;
    }

    /**
     * Gets the value of the zipOk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZipOk() {
        return zipOk;
    }

    /**
     * Sets the value of the zipOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZipOk(Boolean value) {
        this.zipOk = value;
    }

    /**
     * Gets the value of the birthDateOk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBirthDateOk() {
        return birthDateOk;
    }

    /**
     * Sets the value of the birthDateOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBirthDateOk(Boolean value) {
        this.birthDateOk = value;
    }

    /**
     * Gets the value of the docOk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocOk() {
        return docOk;
    }

    /**
     * Sets the value of the docOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocOk(Boolean value) {
        this.docOk = value;
    }

    /**
     * Gets the value of the phoneOk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhoneOk() {
        return phoneOk;
    }

    /**
     * Sets the value of the phoneOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhoneOk(Boolean value) {
        this.phoneOk = value;
    }

}
