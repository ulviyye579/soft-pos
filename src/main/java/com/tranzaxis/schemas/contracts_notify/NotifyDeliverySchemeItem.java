
package com.tranzaxis.schemas.contracts_notify;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.common.ImpExpEntity;


/**
 * <p>Java class for NotifyDeliverySchemeItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyDeliverySchemeItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/common.xsd}ImpExpEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isPrimary" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="seq" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="timeout" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="channelKinds" type="{http://schemas.tranzaxis.com/contracts-notify.xsd}ChannelKind" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyDeliverySchemeItem", propOrder = {
    "isPrimary",
    "seq",
    "timeout",
    "channelKinds"
})
public class NotifyDeliverySchemeItem
    extends ImpExpEntity
{

    protected Boolean isPrimary;
    protected Long seq;
    protected Long timeout;
    protected List<String> channelKinds;

    /**
     * Gets the value of the isPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimary() {
        return isPrimary;
    }

    /**
     * Sets the value of the isPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimary(Boolean value) {
        this.isPrimary = value;
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
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeout(Long value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the channelKinds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelKinds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelKinds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChannelKinds() {
        if (channelKinds == null) {
            channelKinds = new ArrayList<String>();
        }
        return this.channelKinds;
    }

}
