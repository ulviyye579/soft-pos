
package org.radixware.schemas.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.contracts_notify.NotifyDeliveryScheme;
import com.tranzaxis.schemas.contracts_notify.NotifyDeliverySchemeItem;
import com.tranzaxis.schemas.contracts_notify.NotifyMessageTemplate;
import com.tranzaxis.schemas.contracts_notify.NotifyOption;
import com.tranzaxis.schemas.contracts_notify.NotifyType;
import com.tranzaxis.schemas.restricting_admin.Restriction;


/**
 * <p>Java class for ImpExpEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImpExpEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserProps" type="{http://schemas.radixware.org/common.xsd}UserProps" minOccurs="0"/&gt;
 *         &lt;element name="Ext" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ClassId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpExpEntity", propOrder = {
    "userProps",
    "ext"
})
@XmlSeeAlso({
    Restriction.class,
    NotifyOption.class,
    NotifyMessageTemplate.class,
    NotifyType.class,
    NotifyDeliveryScheme.class,
    NotifyDeliverySchemeItem.class
})
public class ImpExpEntity {

    @XmlElement(name = "UserProps")
    protected UserProps userProps;
    @XmlElement(name = "Ext")
    protected Object ext;
    @XmlAttribute(name = "ClassId")
    protected String classId;

    /**
     * Gets the value of the userProps property.
     * 
     * @return
     *     possible object is
     *     {@link UserProps }
     *     
     */
    public UserProps getUserProps() {
        return userProps;
    }

    /**
     * Sets the value of the userProps property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserProps }
     *     
     */
    public void setUserProps(UserProps value) {
        this.userProps = value;
    }

    /**
     * Gets the value of the ext property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExt() {
        return ext;
    }

    /**
     * Sets the value of the ext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExt(Object value) {
        this.ext = value;
    }

    /**
     * Gets the value of the classId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassId(String value) {
        this.classId = value;
    }

}
