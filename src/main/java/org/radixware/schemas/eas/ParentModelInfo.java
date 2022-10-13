
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParentModelInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParentModelInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="EntityObjectInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://schemas.radixware.org/eas.xsd}ObjectReference"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Presentation" type="{http://schemas.radixware.org/eas.xsd}Presentation"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EntityGroupInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Presentation" type="{http://schemas.radixware.org/eas.xsd}Presentation"/&gt;
 *                   &lt;element name="GroupProperties" type="{http://schemas.radixware.org/eas.xsd}PropertyList" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentModelInfo", propOrder = {
    "entityObjectInfo",
    "entityGroupInfo"
})
public class ParentModelInfo {

    @XmlElement(name = "EntityObjectInfo")
    protected ParentModelInfo.EntityObjectInfo entityObjectInfo;
    @XmlElement(name = "EntityGroupInfo")
    protected ParentModelInfo.EntityGroupInfo entityGroupInfo;

    /**
     * Gets the value of the entityObjectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ParentModelInfo.EntityObjectInfo }
     *     
     */
    public ParentModelInfo.EntityObjectInfo getEntityObjectInfo() {
        return entityObjectInfo;
    }

    /**
     * Sets the value of the entityObjectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentModelInfo.EntityObjectInfo }
     *     
     */
    public void setEntityObjectInfo(ParentModelInfo.EntityObjectInfo value) {
        this.entityObjectInfo = value;
    }

    /**
     * Gets the value of the entityGroupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ParentModelInfo.EntityGroupInfo }
     *     
     */
    public ParentModelInfo.EntityGroupInfo getEntityGroupInfo() {
        return entityGroupInfo;
    }

    /**
     * Sets the value of the entityGroupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentModelInfo.EntityGroupInfo }
     *     
     */
    public void setEntityGroupInfo(ParentModelInfo.EntityGroupInfo value) {
        this.entityGroupInfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Presentation" type="{http://schemas.radixware.org/eas.xsd}Presentation"/&gt;
     *         &lt;element name="GroupProperties" type="{http://schemas.radixware.org/eas.xsd}PropertyList" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "presentation",
        "groupProperties"
    })
    public static class EntityGroupInfo {

        @XmlElement(name = "Presentation", required = true)
        protected Presentation presentation;
        @XmlElement(name = "GroupProperties")
        protected PropertyList groupProperties;

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
         * Gets the value of the groupProperties property.
         * 
         * @return
         *     possible object is
         *     {@link PropertyList }
         *     
         */
        public PropertyList getGroupProperties() {
            return groupProperties;
        }

        /**
         * Sets the value of the groupProperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link PropertyList }
         *     
         */
        public void setGroupProperties(PropertyList value) {
            this.groupProperties = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}ObjectReference"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Presentation" type="{http://schemas.radixware.org/eas.xsd}Presentation"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "presentation"
    })
    public static class EntityObjectInfo
        extends ObjectReference
    {

        @XmlElement(name = "Presentation", required = true)
        protected Presentation presentation;

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

    }

}
