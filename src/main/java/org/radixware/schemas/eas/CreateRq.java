
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}ClassRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Presentation" type="{http://schemas.radixware.org/eas.xsd}Definition"/&gt;
 *         &lt;element name="Data" type="{http://schemas.radixware.org/eas.xsd}Object"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateRq", propOrder = {
    "presentation",
    "data"
})
public class CreateRq
    extends ClassRequest
{

    @XmlElement(name = "Presentation", required = true)
    protected Definition presentation;
    @XmlElement(name = "Data", required = true)
    protected Object data;

    /**
     * Gets the value of the presentation property.
     * 
     * @return
     *     possible object is
     *     {@link Definition }
     *     
     */
    public Definition getPresentation() {
        return presentation;
    }

    /**
     * Sets the value of the presentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Definition }
     *     
     */
    public void setPresentation(Definition value) {
        this.presentation = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setData(Object value) {
        this.data = value;
    }

}
