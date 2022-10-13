
package org.radixware.schemas.xscml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JmlTagItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JmlTagItem"&gt;
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
@XmlType(name = "JmlTagItem", propOrder = {
    "presentation"
})
@XmlSeeAlso({
    org.radixware.schemas.xscml.JmlType.Item.Literal.class,
    org.radixware.schemas.xscml.JmlType.Item.IdReference.class,
    org.radixware.schemas.xscml.JmlType.Item.LocalizedString.class,
    org.radixware.schemas.xscml.JmlType.Item.EventCode.class,
    org.radixware.schemas.xscml.JmlType.Item.DbEntity.class,
    org.radixware.schemas.xscml.JmlType.Item.Pin.class,
    org.radixware.schemas.xscml.JmlType.Item.Data.class,
    org.radixware.schemas.xscml.JmlType.Item.ReadLicense.class,
    org.radixware.schemas.xscml.JmlType.Item.CheckLicense.class,
    org.radixware.schemas.xscml.JmlType.Item.ActionBlock.class,
    TypeDeclaration.class
})
public class JmlTagItem {

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
