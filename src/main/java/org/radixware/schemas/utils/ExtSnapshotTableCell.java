
package org.radixware.schemas.utils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtSnapshotTableCell complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtSnapshotTableCell"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SafeStr" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtSnapshotTableCell", propOrder = {
    "safeStr"
})
public class ExtSnapshotTableCell {

    @XmlElement(name = "SafeStr")
    protected String safeStr;

    /**
     * Gets the value of the safeStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafeStr() {
        return safeStr;
    }

    /**
     * Sets the value of the safeStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafeStr(String value) {
        this.safeStr = value;
    }

}
