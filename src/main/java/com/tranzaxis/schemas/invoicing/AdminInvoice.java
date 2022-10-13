
package com.tranzaxis.schemas.invoicing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdminInvoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdminInvoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/invoicing.xsd}Invoice"&gt;
 *       &lt;attribute name="PrototypeId" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdminInvoice")
public class AdminInvoice
    extends Invoice
{

    @XmlAttribute(name = "PrototypeId")
    protected Long prototypeId;

    /**
     * Gets the value of the prototypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrototypeId() {
        return prototypeId;
    }

    /**
     * Sets the value of the prototypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrototypeId(Long value) {
        this.prototypeId = value;
    }

}
