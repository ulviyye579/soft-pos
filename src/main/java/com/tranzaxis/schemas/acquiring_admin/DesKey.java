
package com.tranzaxis.schemas.acquiring_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.ObjectId;
import com.tranzaxis.schemas.crypto.KeyExtForm;


/**
 * <p>Java class for DesKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/acquiring-admin.xsd}Key"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zmk" type="{http://schemas.tranzaxis.com/common-types.xsd}ObjectId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Check" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Value" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ExtForm" type="{http://schemas.tranzaxis.com/crypto.xsd}KeyExtForm" default="X9" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesKey", propOrder = {
    "zmk"
})
@XmlSeeAlso({
    DesKeyWithKek.class
})
public class DesKey
    extends Key
{

    @XmlElement(name = "Zmk")
    protected ObjectId zmk;
    @XmlAttribute(name = "Check")
    protected String check;
    @XmlAttribute(name = "Value")
    protected String value;
    @XmlAttribute(name = "ExtForm")
    protected KeyExtForm extForm;

    /**
     * Gets the value of the zmk property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectId }
     *     
     */
    public ObjectId getZmk() {
        return zmk;
    }

    /**
     * Sets the value of the zmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectId }
     *     
     */
    public void setZmk(ObjectId value) {
        this.zmk = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheck(String value) {
        this.check = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the extForm property.
     * 
     * @return
     *     possible object is
     *     {@link KeyExtForm }
     *     
     */
    public KeyExtForm getExtForm() {
        if (extForm == null) {
            return KeyExtForm.X_9;
        } else {
            return extForm;
        }
    }

    /**
     * Sets the value of the extForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyExtForm }
     *     
     */
    public void setExtForm(KeyExtForm value) {
        this.extForm = value;
    }

}
