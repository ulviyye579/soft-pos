
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PresentableObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresentableObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Object"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Presentation" type="{http://schemas.radixware.org/eas.xsd}Presentation" minOccurs="0"/&gt;
 *         &lt;element name="DisabledActions" type="{http://schemas.radixware.org/eas.xsd}Actions" minOccurs="0"/&gt;
 *         &lt;element name="EnabledEditorPages" type="{http://schemas.radixware.org/eas.xsd}EditorPages" minOccurs="0"/&gt;
 *         &lt;element name="AccessibleExplorerItems" type="{http://schemas.radixware.org/eas.xsd}ExplorerItemList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresentableObject", propOrder = {
    "presentation",
    "disabledActions",
    "enabledEditorPages",
    "accessibleExplorerItems"
})
public class PresentableObject
    extends Object
{

    @XmlElement(name = "Presentation")
    protected Presentation presentation;
    @XmlElement(name = "DisabledActions")
    protected Actions disabledActions;
    @XmlElement(name = "EnabledEditorPages")
    protected EditorPages enabledEditorPages;
    @XmlElement(name = "AccessibleExplorerItems")
    protected ExplorerItemList accessibleExplorerItems;

    /**
     * Gets the value of the presentation property.
     * 
     * @return
     *     possible object is
     *     {@link Presentation }
     *     
     */
    public Presentation getPresentation() {
        return presentation;
    }

    /**
     * Sets the value of the presentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Presentation }
     *     
     */
    public void setPresentation(Presentation value) {
        this.presentation = value;
    }

    /**
     * Gets the value of the disabledActions property.
     * 
     * @return
     *     possible object is
     *     {@link Actions }
     *     
     */
    public Actions getDisabledActions() {
        return disabledActions;
    }

    /**
     * Sets the value of the disabledActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Actions }
     *     
     */
    public void setDisabledActions(Actions value) {
        this.disabledActions = value;
    }

    /**
     * Gets the value of the enabledEditorPages property.
     * 
     * @return
     *     possible object is
     *     {@link EditorPages }
     *     
     */
    public EditorPages getEnabledEditorPages() {
        return enabledEditorPages;
    }

    /**
     * Sets the value of the enabledEditorPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditorPages }
     *     
     */
    public void setEnabledEditorPages(EditorPages value) {
        this.enabledEditorPages = value;
    }

    /**
     * Gets the value of the accessibleExplorerItems property.
     * 
     * @return
     *     possible object is
     *     {@link ExplorerItemList }
     *     
     */
    public ExplorerItemList getAccessibleExplorerItems() {
        return accessibleExplorerItems;
    }

    /**
     * Sets the value of the accessibleExplorerItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExplorerItemList }
     *     
     */
    public void setAccessibleExplorerItems(ExplorerItemList value) {
        this.accessibleExplorerItems = value;
    }

}
