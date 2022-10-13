
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}ObjectRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NewData" type="{http://schemas.radixware.org/eas.xsd}Object"/&gt;
 *         &lt;element name="RespWithLOBValues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EditorPresentation" type="{http://schemas.radixware.org/eas.xsd}Definition"/&gt;
 *         &lt;element name="SelectorPresentation" type="{http://schemas.radixware.org/eas.xsd}Definition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateRq", propOrder = {
    "newData",
    "respWithLOBValues",
    "editorPresentation",
    "selectorPresentation"
})
public class UpdateRq
    extends ObjectRequest
{

    @XmlElement(name = "NewData", required = true)
    protected Object newData;
    @XmlElement(name = "RespWithLOBValues", defaultValue = "true")
    protected Boolean respWithLOBValues;
    @XmlElement(name = "EditorPresentation", required = true)
    protected Definition editorPresentation;
    @XmlElement(name = "SelectorPresentation")
    protected Definition selectorPresentation;

    /**
     * Gets the value of the newData property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNewData() {
        return newData;
    }

    /**
     * Sets the value of the newData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNewData(Object value) {
        this.newData = value;
    }

    /**
     * Gets the value of the respWithLOBValues property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRespWithLOBValues() {
        return respWithLOBValues;
    }

    /**
     * Sets the value of the respWithLOBValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRespWithLOBValues(Boolean value) {
        this.respWithLOBValues = value;
    }

    /**
     * Gets the value of the editorPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link Definition }
     *     
     */
    public Definition getEditorPresentation() {
        return editorPresentation;
    }

    /**
     * Sets the value of the editorPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Definition }
     *     
     */
    public void setEditorPresentation(Definition value) {
        this.editorPresentation = value;
    }

    /**
     * Gets the value of the selectorPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link Definition }
     *     
     */
    public Definition getSelectorPresentation() {
        return selectorPresentation;
    }

    /**
     * Sets the value of the selectorPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Definition }
     *     
     */
    public void setSelectorPresentation(Definition value) {
        this.selectorPresentation = value;
    }

}
