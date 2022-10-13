
package org.radixware.schemas.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Domain with subdomains
 * 
 * <p>Java class for Domain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Domain"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChildDomain" type="{http://schemas.radixware.org/common.xsd}Domain" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Guid" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *       &lt;attribute name="Name" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Domain", propOrder = {
    "childDomain"
})
public class Domain {

    @XmlElement(name = "ChildDomain")
    protected List<Domain> childDomain;
    @XmlAttribute(name = "Guid", required = true)
    protected String guid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Title")
    protected String title;

    /**
     * Gets the value of the childDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Domain }
     * 
     * 
     */
    public List<Domain> getChildDomain() {
        if (childDomain == null) {
            childDomain = new ArrayList<Domain>();
        }
        return this.childDomain;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
