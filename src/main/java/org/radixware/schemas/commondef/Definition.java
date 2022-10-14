
package org.radixware.schemas.commondef;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.groupsettings.CustomFilterParameter;
import org.radixware.schemas.groupsettings.PropertyBasedFilterParameter;


/**
 * <p>Java class for Definition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Definition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReplacedDeprecatedPaths" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Path"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SuppressedWarning" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://schemas.radixware.org/utils.xsd}SuppressedWarning"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="IsOverwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ExpirationRelease" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DeprecatedByUser" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DefinitionType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}IntEnum"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="CompilerWarnings"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Definition", propOrder = {
    "replacedDeprecatedPaths",
    "suppressedWarning"
})
@XmlSeeAlso({
    PropertyBasedFilterParameter.class,
    CustomFilterParameter.class,
    NamedDefinition.class
})
public class Definition {

    @XmlElement(name = "ReplacedDeprecatedPaths")
    protected List<Definition.ReplacedDeprecatedPaths> replacedDeprecatedPaths;
    @XmlElement(name = "SuppressedWarning")
    protected List<Definition.SuppressedWarning> suppressedWarning;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "IsOverwrite")
    protected Boolean isOverwrite;
    @XmlAttribute(name = "ExpirationRelease")
    protected String expirationRelease;
    @XmlAttribute(name = "DeprecatedByUser")
    protected String deprecatedByUser;
    @XmlAttribute(name = "DefinitionType")
    protected Long definitionType;
    @XmlAttribute(name = "CompilerWarnings")
    protected List<Integer> compilerWarnings;

    /**
     * Gets the value of the replacedDeprecatedPaths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replacedDeprecatedPaths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplacedDeprecatedPaths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Definition.ReplacedDeprecatedPaths }
     * 
     * 
     */
    public List<Definition.ReplacedDeprecatedPaths> getReplacedDeprecatedPaths() {
        if (replacedDeprecatedPaths == null) {
            replacedDeprecatedPaths = new ArrayList<Definition.ReplacedDeprecatedPaths>();
        }
        return this.replacedDeprecatedPaths;
    }

    /**
     * Gets the value of the suppressedWarning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suppressedWarning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuppressedWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Definition.SuppressedWarning }
     * 
     * 
     */
    public List<Definition.SuppressedWarning> getSuppressedWarning() {
        if (suppressedWarning == null) {
            suppressedWarning = new ArrayList<Definition.SuppressedWarning>();
        }
        return this.suppressedWarning;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the isOverwrite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsOverwrite() {
        if (isOverwrite == null) {
            return false;
        } else {
            return isOverwrite;
        }
    }

    /**
     * Sets the value of the isOverwrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOverwrite(Boolean value) {
        this.isOverwrite = value;
    }

    /**
     * Gets the value of the expirationRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationRelease() {
        return expirationRelease;
    }

    /**
     * Sets the value of the expirationRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationRelease(String value) {
        this.expirationRelease = value;
    }

    /**
     * Gets the value of the deprecatedByUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeprecatedByUser() {
        return deprecatedByUser;
    }

    /**
     * Sets the value of the deprecatedByUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeprecatedByUser(String value) {
        this.deprecatedByUser = value;
    }

    /**
     * Gets the value of the definitionType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDefinitionType() {
        return definitionType;
    }

    /**
     * Sets the value of the definitionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDefinitionType(Long value) {
        this.definitionType = value;
    }

    /**
     * Gets the value of the compilerWarnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compilerWarnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompilerWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getCompilerWarnings() {
        if (compilerWarnings == null) {
            compilerWarnings = new ArrayList<Integer>();
        }
        return this.compilerWarnings;
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
     *       &lt;attribute name="Path"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReplacedDeprecatedPaths {

        @XmlAttribute(name = "Path")
        protected List<String> path;

        /**
         * Gets the value of the path property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the path property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPath().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPath() {
            if (path == null) {
                path = new ArrayList<String>();
            }
            return this.path;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://schemas.radixware.org/utils.xsd}SuppressedWarning"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SuppressedWarning
        extends org.radixware.schemas.utils.SuppressedWarning
    {


    }

}
