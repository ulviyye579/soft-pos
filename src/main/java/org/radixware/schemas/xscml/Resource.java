
package org.radixware.schemas.xscml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Resource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Resource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/xscml.xsd}MmlTagItem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResourceId" type="{http://schemas.radixware.org/types.xsd}Id"/&gt;
 *         &lt;element name="Markdown" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resource", propOrder = {
    "resourceId",
    "markdown"
})
@XmlSeeAlso({
    org.radixware.schemas.xscml.MmlType.Item.MarkdownImage.class,
    org.radixware.schemas.xscml.MmlType.Item.MarkdownRef.class
})
public class Resource
    extends MmlTagItem
{

    @XmlElement(name = "ResourceId", required = true)
    protected String resourceId;
    @XmlElement(name = "Markdown", required = true)
    protected String markdown;

    /**
     * Gets the value of the resourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceId(String value) {
        this.resourceId = value;
    }

    /**
     * Gets the value of the markdown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkdown() {
        return markdown;
    }

    /**
     * Sets the value of the markdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkdown(String value) {
        this.markdown = value;
    }

}
