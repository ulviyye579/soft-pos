
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListVisibleExplorerItemsRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListVisibleExplorerItemsRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExplorerRoot" type="{http://schemas.radixware.org/eas.xsd}Definition"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListVisibleExplorerItemsRq", propOrder = {
    "explorerRoot"
})
public class ListVisibleExplorerItemsRq
    extends Request
{

    @XmlElement(name = "ExplorerRoot", required = true)
    protected Definition explorerRoot;

    /**
     * Gets the value of the explorerRoot property.
     * 
     * @return
     *     possible object is
     *     {@link Definition }
     *     
     */
    public Definition getExplorerRoot() {
        return explorerRoot;
    }

    /**
     * Sets the value of the explorerRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Definition }
     *     
     */
    public void setExplorerRoot(Definition value) {
        this.explorerRoot = value;
    }

}
