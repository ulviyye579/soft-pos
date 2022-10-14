
package com.tranzaxis.schemas.common_types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectionCriterionSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectionCriterionSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Criteria" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Val" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *                   &lt;element name="Vals" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="TypeRid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *                 &lt;attribute name="MatchMode" type="{http://schemas.tranzaxis.com/common-types.xsd}SelectionMatchingMode" /&gt;
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
@XmlType(name = "SelectionCriterionSet", propOrder = {
    "criteria"
})
public class SelectionCriterionSet {

    @XmlElement(name = "Criteria")
    protected List<SelectionCriterionSet.Criteria> criteria;

    /**
     * Gets the value of the criteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionCriterionSet.Criteria }
     * 
     * 
     */
    public List<SelectionCriterionSet.Criteria> getCriteria() {
        if (criteria == null) {
            criteria = new ArrayList<SelectionCriterionSet.Criteria>();
        }
        return this.criteria;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Val" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
     *         &lt;element name="Vals" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="TypeRid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
     *       &lt;attribute name="MatchMode" type="{http://schemas.tranzaxis.com/common-types.xsd}SelectionMatchingMode" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "val",
        "vals"
    })
    public static class Criteria {

        @XmlElement(name = "Val")
        protected String val;
        @XmlList
        @XmlElement(name = "Vals")
        protected List<String> vals;
        @XmlAttribute(name = "TypeRid", required = true)
        protected String typeRid;
        @XmlAttribute(name = "MatchMode")
        protected String matchMode;

        /**
         * Gets the value of the val property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVal() {
            return val;
        }

        /**
         * Sets the value of the val property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVal(String value) {
            this.val = value;
        }

        /**
         * Gets the value of the vals property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vals property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVals().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVals() {
            if (vals == null) {
                vals = new ArrayList<String>();
            }
            return this.vals;
        }

        /**
         * Gets the value of the typeRid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypeRid() {
            return typeRid;
        }

        /**
         * Sets the value of the typeRid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypeRid(String value) {
            this.typeRid = value;
        }

        /**
         * Gets the value of the matchMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMatchMode() {
            return matchMode;
        }

        /**
         * Sets the value of the matchMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMatchMode(String value) {
            this.matchMode = value;
        }

    }

}
