
package com.tranzaxis.schemas.contracts_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountingSchemes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingSchemes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountingScheme" type="{http://schemas.tranzaxis.com/contracts-types.xsd}AccountingScheme" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="InstName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingSchemes", propOrder = {
    "accountingScheme"
})
public class AccountingSchemes {

    @XmlElement(name = "AccountingScheme")
    protected List<AccountingScheme> accountingScheme;
    @XmlAttribute(name = "InstName")
    protected String instName;

    /**
     * Gets the value of the accountingScheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingScheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingScheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountingScheme }
     * 
     * 
     */
    public List<AccountingScheme> getAccountingScheme() {
        if (accountingScheme == null) {
            accountingScheme = new ArrayList<AccountingScheme>();
        }
        return this.accountingScheme;
    }

    /**
     * Gets the value of the instName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstName() {
        return instName;
    }

    /**
     * Sets the value of the instName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstName(String value) {
        this.instName = value;
    }

}
