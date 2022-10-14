
package org.radixware.schemas.xscml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MmlTagItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MmlTagItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Presentation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MmlTagItem", propOrder = {
    "presentation"
})
@XmlSeeAlso({
    DocResource.class,
    org.radixware.schemas.xscml.MmlType.Item.IdReference.class,
    org.radixware.schemas.xscml.MmlType.Item.MmlTagTable.class,
    Resource.class,
    org.radixware.schemas.xscml.MmlType.Item.Comment.class
})
public class MmlTagItem {

    @XmlElement(name = "Presentation")
    protected String presentation;

    /**
     * Gets the value of the presentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentation() {
        return presentation;
    }

    /**
     * Sets the value of the presentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentation(String value) {
        this.presentation = value;
    }

}
