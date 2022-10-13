
package com.tranzaxis.schemas.contracts_notify;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.ParamValues;
import org.radixware.schemas.common.ImpExpEntity;


/**
 * <p>Java class for NotifyMessageTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyMessageTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/common.xsd}ImpExpEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Seq" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="EmailBody" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="EmailSubject" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="SmsBody" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="SmsSubject" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="SmsBodyTranslit" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="SmsSubjectTranslit" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="TwitterBody" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="TwitterSubject" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="RoutingKey" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Importance" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}Importance" minOccurs="0"/&gt;
 *         &lt;element name="UserAttrs" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamValues" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyMessageTemplate", propOrder = {
    "extGuid",
    "seq",
    "title",
    "emailBody",
    "emailSubject",
    "smsBody",
    "smsSubject",
    "smsBodyTranslit",
    "smsSubjectTranslit",
    "twitterBody",
    "twitterSubject",
    "routingKey",
    "importance",
    "userAttrs"
})
public class NotifyMessageTemplate
    extends ImpExpEntity
{

    @XmlElement(name = "ExtGuid")
    protected String extGuid;
    @XmlElement(name = "Seq")
    protected Long seq;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "EmailBody")
    protected String emailBody;
    @XmlElement(name = "EmailSubject")
    protected String emailSubject;
    @XmlElement(name = "SmsBody")
    protected String smsBody;
    @XmlElement(name = "SmsSubject")
    protected String smsSubject;
    @XmlElement(name = "SmsBodyTranslit")
    protected String smsBodyTranslit;
    @XmlElement(name = "SmsSubjectTranslit")
    protected String smsSubjectTranslit;
    @XmlElement(name = "TwitterBody")
    protected String twitterBody;
    @XmlElement(name = "TwitterSubject")
    protected String twitterSubject;
    @XmlElement(name = "RoutingKey")
    protected String routingKey;
    @XmlElement(name = "Importance")
    protected Long importance;
    @XmlElement(name = "UserAttrs")
    protected ParamValues userAttrs;

    /**
     * Gets the value of the extGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtGuid() {
        return extGuid;
    }

    /**
     * Sets the value of the extGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtGuid(String value) {
        this.extGuid = value;
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

    /**
     * Gets the value of the emailBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailBody() {
        return emailBody;
    }

    /**
     * Sets the value of the emailBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailBody(String value) {
        this.emailBody = value;
    }

    /**
     * Gets the value of the emailSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSubject() {
        return emailSubject;
    }

    /**
     * Sets the value of the emailSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSubject(String value) {
        this.emailSubject = value;
    }

    /**
     * Gets the value of the smsBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsBody() {
        return smsBody;
    }

    /**
     * Sets the value of the smsBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsBody(String value) {
        this.smsBody = value;
    }

    /**
     * Gets the value of the smsSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsSubject() {
        return smsSubject;
    }

    /**
     * Sets the value of the smsSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsSubject(String value) {
        this.smsSubject = value;
    }

    /**
     * Gets the value of the smsBodyTranslit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsBodyTranslit() {
        return smsBodyTranslit;
    }

    /**
     * Sets the value of the smsBodyTranslit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsBodyTranslit(String value) {
        this.smsBodyTranslit = value;
    }

    /**
     * Gets the value of the smsSubjectTranslit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsSubjectTranslit() {
        return smsSubjectTranslit;
    }

    /**
     * Sets the value of the smsSubjectTranslit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsSubjectTranslit(String value) {
        this.smsSubjectTranslit = value;
    }

    /**
     * Gets the value of the twitterBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwitterBody() {
        return twitterBody;
    }

    /**
     * Sets the value of the twitterBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwitterBody(String value) {
        this.twitterBody = value;
    }

    /**
     * Gets the value of the twitterSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwitterSubject() {
        return twitterSubject;
    }

    /**
     * Sets the value of the twitterSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwitterSubject(String value) {
        this.twitterSubject = value;
    }

    /**
     * Gets the value of the routingKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingKey() {
        return routingKey;
    }

    /**
     * Sets the value of the routingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingKey(String value) {
        this.routingKey = value;
    }

    /**
     * Gets the value of the importance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImportance() {
        return importance;
    }

    /**
     * Sets the value of the importance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImportance(Long value) {
        this.importance = value;
    }

    /**
     * Gets the value of the userAttrs property.
     * 
     * @return
     *     possible object is
     *     {@link ParamValues }
     *     
     */
    public ParamValues getUserAttrs() {
        return userAttrs;
    }

    /**
     * Sets the value of the userAttrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamValues }
     *     
     */
    public void setUserAttrs(ParamValues value) {
        this.userAttrs = value;
    }

}
