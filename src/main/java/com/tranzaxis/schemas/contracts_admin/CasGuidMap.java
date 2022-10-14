
package com.tranzaxis.schemas.contracts_admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CasGuidMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CasGuidMap"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CasGuidItem" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="CasKey" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="CasGuid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CasGuidMap", propOrder = {
    "casGuidItem"
})
public class CasGuidMap {

    @XmlElement(name = "CasGuidItem", required = true)
    protected List<CasGuidMap.CasGuidItem> casGuidItem;

    /**
     * Gets the value of the casGuidItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the casGuidItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCasGuidItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CasGuidMap.CasGuidItem }
     * 
     * 
     */
    public List<CasGuidMap.CasGuidItem> getCasGuidItem() {
        if (casGuidItem == null) {
            casGuidItem = new ArrayList<CasGuidMap.CasGuidItem>();
        }
        return this.casGuidItem;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="CasKey" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="CasGuid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CasGuidItem {

        @XmlAttribute(name = "CasKey", required = true)
        protected String casKey;
        @XmlAttribute(name = "CasGuid", required = true)
        protected String casGuid;

        /**
         * Gets the value of the casKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCasKey() {
            return casKey;
        }

        /**
         * Sets the value of the casKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCasKey(String value) {
            this.casKey = value;
        }

        /**
         * Gets the value of the casGuid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCasGuid() {
            return casGuid;
        }

        /**
         * Sets the value of the casGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCasGuid(String value) {
            this.casGuid = value;
        }

    }

}
