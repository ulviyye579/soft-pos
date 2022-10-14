
package org.radixware.schemas.adsdef;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.commondef.Definition;


/**
 * <p>Java class for LocalizingBundleDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalizingBundleDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/commondef.xsd}Definition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="String" type="{http://schemas.radixware.org/adsdef.xsd}LocalizedString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OwnerId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalizingBundleDefinition", propOrder = {
    "string"
})
public class LocalizingBundleDefinition
    extends Definition
{

    @XmlElement(name = "String")
    protected List<LocalizedString> string;
    @XmlAttribute(name = "OwnerId")
    protected String ownerId;

    /**
     * Gets the value of the string property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the string property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizedString }
     * 
     * 
     */
    public List<LocalizedString> getString() {
        if (string == null) {
            string = new ArrayList<LocalizedString>();
        }
        return this.string;
    }

    /**
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerId(String value) {
        this.ownerId = value;
    }

}
