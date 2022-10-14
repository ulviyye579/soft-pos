
package com.tranzaxis.schemas.contracts_notify;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.InputFormat;
import org.radixware.schemas.common.ImpExpEntity;
import org.radixware.schemas.common.UserFunc;


/**
 * <p>Java class for NotifyOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/common.xsd}ImpExpEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InputFormat" type="{http://schemas.tranzaxis.com/common-types.xsd}InputFormat" minOccurs="0"/&gt;
 *         &lt;element name="InputFormatFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *         &lt;element name="ValidatorFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Description" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="InitialVal" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Seq" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyOption", propOrder = {
    "inputFormat",
    "inputFormatFunc",
    "validatorFunc"
})
public class NotifyOption
    extends ImpExpEntity
{

    @XmlElement(name = "InputFormat")
    protected InputFormat inputFormat;
    @XmlElement(name = "InputFormatFunc")
    protected UserFunc inputFormatFunc;
    @XmlElement(name = "ValidatorFunc")
    protected UserFunc validatorFunc;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "InitialVal")
    protected String initialVal;
    @XmlAttribute(name = "Rid")
    protected String rid;
    @XmlAttribute(name = "Seq")
    protected Long seq;
    @XmlAttribute(name = "Title")
    protected String title;

    /**
     * Gets the value of the inputFormat property.
     * 
     * @return
     *     possible object is
     *     {@link InputFormat }
     *     
     */
    public InputFormat getInputFormat() {
        return inputFormat;
    }

    /**
     * Sets the value of the inputFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputFormat }
     *     
     */
    public void setInputFormat(InputFormat value) {
        this.inputFormat = value;
    }

    /**
     * Gets the value of the inputFormatFunc property.
     * 
     * @return
     *     possible object is
     *     {@link UserFunc }
     *     
     */
    public UserFunc getInputFormatFunc() {
        return inputFormatFunc;
    }

    /**
     * Sets the value of the inputFormatFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFunc }
     *     
     */
    public void setInputFormatFunc(UserFunc value) {
        this.inputFormatFunc = value;
    }

    /**
     * Gets the value of the validatorFunc property.
     * 
     * @return
     *     possible object is
     *     {@link UserFunc }
     *     
     */
    public UserFunc getValidatorFunc() {
        return validatorFunc;
    }

    /**
     * Sets the value of the validatorFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFunc }
     *     
     */
    public void setValidatorFunc(UserFunc value) {
        this.validatorFunc = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the initialVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialVal() {
        return initialVal;
    }

    /**
     * Sets the value of the initialVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialVal(String value) {
        this.initialVal = value;
    }

    /**
     * Gets the value of the rid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRid() {
        return rid;
    }

    /**
     * Sets the value of the rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRid(String value) {
        this.rid = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeq(Long value) {
        this.seq = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
