
package org.radixware.schemas.xscml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeArguments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeArguments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Argument" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Type" type="{http://schemas.radixware.org/xscml.xsd}TypeDeclaration"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="DerivationRule"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="super"/&gt;
 *                       &lt;enumeration value="extends"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "TypeArguments", propOrder = {
    "argument"
})
public class TypeArguments {

    @XmlElement(name = "Argument", required = true)
    protected List<TypeArguments.Argument> argument;

    /**
     * Gets the value of the argument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the argument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArgument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeArguments.Argument }
     * 
     * 
     */
    public List<TypeArguments.Argument> getArgument() {
        if (argument == null) {
            argument = new ArrayList<TypeArguments.Argument>();
        }
        return this.argument;
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
     *         &lt;element name="Type" type="{http://schemas.radixware.org/xscml.xsd}TypeDeclaration"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="DerivationRule"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="super"/&gt;
     *             &lt;enumeration value="extends"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "type"
    })
    public static class Argument {

        @XmlElement(name = "Type", required = true)
        protected TypeDeclaration type;
        @XmlAttribute(name = "DerivationRule")
        protected String derivationRule;
        @XmlAttribute(name = "Alias")
        protected String alias;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link TypeDeclaration }
         *     
         */
        public TypeDeclaration getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeDeclaration }
         *     
         */
        public void setType(TypeDeclaration value) {
            this.type = value;
        }

        /**
         * Gets the value of the derivationRule property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDerivationRule() {
            return derivationRule;
        }

        /**
         * Sets the value of the derivationRule property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDerivationRule(String value) {
            this.derivationRule = value;
        }

        /**
         * Gets the value of the alias property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlias() {
            return alias;
        }

        /**
         * Sets the value of the alias property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlias(String value) {
            this.alias = value;
        }

    }

}
