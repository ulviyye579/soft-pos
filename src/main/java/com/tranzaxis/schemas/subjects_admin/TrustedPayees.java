
package com.tranzaxis.schemas.subjects_admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrustedPayees complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrustedPayees"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrustedPayee" type="{http://schemas.tranzaxis.com/subjects-admin.xsd}TrustedPayee" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TrustedPayees", propOrder = {
    "trustedPayee"
})
public class TrustedPayees {

    @XmlElement(name = "TrustedPayee")
    protected List<TrustedPayee> trustedPayee;
    @XmlAttribute(name = "Mode")
    protected Mode mode;

    /**
     * Gets the value of the trustedPayee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trustedPayee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrustedPayee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrustedPayee }
     * 
     * 
     */
    public List<TrustedPayee> getTrustedPayee() {
        if (trustedPayee == null) {
            trustedPayee = new ArrayList<TrustedPayee>();
        }
        return this.trustedPayee;
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
