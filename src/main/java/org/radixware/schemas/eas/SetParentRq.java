
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetParentRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetParentRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}ClassRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParentTitleProperty" type="{http://schemas.radixware.org/eas.xsd}Definition"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;choice minOccurs="0"&gt;
 *               &lt;element name="PID" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *               &lt;element name="Class" type="{http://schemas.radixware.org/eas.xsd}Definition"/&gt;
 *             &lt;/choice&gt;
 *             &lt;element name="SrcPID" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *             &lt;element name="CurrentData"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;extension base="{http://schemas.radixware.org/eas.xsd}Object"&gt;
 *                   &lt;/extension&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *             &lt;element name="EditorPresentation" type="{http://schemas.radixware.org/eas.xsd}Definition"/&gt;
 *             &lt;element name="SelectorPresentation" type="{http://schemas.radixware.org/eas.xsd}Definition" minOccurs="0"/&gt;
 *             &lt;element name="RespWithLOBValues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="Form" type="{http://schemas.radixware.org/eas.xsd}Form"/&gt;
 *           &lt;element name="Report" type="{http://schemas.radixware.org/eas.xsd}Report"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetParentRq", propOrder = {
    "rest"
})
public class SetParentRq
    extends ClassRequest
{

    @XmlElementRefs({
        @XmlElementRef(name = "ParentTitleProperty", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PID", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Class", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SrcPID", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CurrentData", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EditorPresentation", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SelectorPresentation", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RespWithLOBValues", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Form", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Report", namespace = "http://schemas.radixware.org/eas.xsd", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Clazz" is used by two different parts of a schema. See: 
     * line 4379 of file:/C:/Users/sanang/Desktop/Daily/RTP_v.3.2.24_orig/eas.xsd
     * line 1662 of file:/C:/Users/sanang/Desktop/Daily/RTP_v.3.2.24_orig/eas.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Definition }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Definition }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link SetParentRq.CurrentData }{@code >}
     * {@link JAXBElement }{@code <}{@link Definition }{@code >}
     * {@link JAXBElement }{@code <}{@link Definition }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Form }{@code >}
     * {@link JAXBElement }{@code <}{@link Report }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Object"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CurrentData
        extends Object
    {


    }

}
