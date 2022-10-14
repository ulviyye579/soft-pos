
package com.tranzaxis.schemas.contracts_types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.common.Map;


/**
 * <p>Java class for BalancingSnapshot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalancingSnapshot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Props" type="{http://schemas.radixware.org/common.xsd}Map" minOccurs="0"/&gt;
 *         &lt;element name="Ext" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalancingSnapshot", propOrder = {
    "props",
    "ext"
})
public class BalancingSnapshot {

    @XmlElement(name = "Props")
    protected Map props;
    @XmlElement(name = "Ext")
    protected Object ext;

    /**
     * Gets the value of the props property.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getProps() {
        return props;
    }

    /**
     * Sets the value of the props property.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setProps(Map value) {
        this.props = value;
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

}
