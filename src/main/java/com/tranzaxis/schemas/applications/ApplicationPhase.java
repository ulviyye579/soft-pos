
package com.tranzaxis.schemas.applications;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.Lexeme;


/**
 * <p>Java class for ApplicationPhase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationPhase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://schemas.tranzaxis.com/common-types.xsd}Lexeme" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.tranzaxis.com/common-types.xsd}Lexeme" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Guid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ApplicationPhaseRid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationPhase", propOrder = {
    "description",
    "title"
})
public class ApplicationPhase {

    @XmlElement(name = "Description")
    protected Lexeme description;
    @XmlElement(name = "Title")
    protected Lexeme title;
    @XmlAttribute(name = "Guid", required = true)
    protected String guid;
    @XmlAttribute(name = "ApplicationPhaseRid")
    protected String applicationPhaseRid;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Lexeme }
     *     
     */
    public Lexeme getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lexeme }
     *     
     */
    public void setDescription(Lexeme value) {
        this.description = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Lexeme }
     *     
     */
    public Lexeme getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lexeme }
     *     
     */
    public void setTitle(Lexeme value) {
        this.title = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the applicationPhaseRid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationPhaseRid() {
        return applicationPhaseRid;
    }

    /**
     * Sets the value of the applicationPhaseRid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationPhaseRid(String value) {
        this.applicationPhaseRid = value;
    }

}
