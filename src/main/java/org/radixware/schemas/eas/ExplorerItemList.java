
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExplorerItemList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExplorerItemList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://schemas.radixware.org/eas.xsd}Definition"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Object"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Presentation" type="{http://schemas.radixware.org/eas.xsd}Presentation"/&gt;
 *                             &lt;element name="PID" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *                             &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExplorerItemList", propOrder = {
    "item"
})
public class ExplorerItemList {

    @XmlElement(name = "Item")
    protected List<ExplorerItemList.Item> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExplorerItemList.Item }
     * 
     * 
     */
    public List<ExplorerItemList.Item> getItem() {
        if (item == null) {
            item = new ArrayList<ExplorerItemList.Item>();
        }
        return this.item;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Definition"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="Object"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Presentation" type="{http://schemas.radixware.org/eas.xsd}Presentation"/&gt;
     *                   &lt;element name="PID" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
     *                   &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "object"
    })
    public static class Item
        extends Definition
    {

        @XmlElement(name = "Object")
        protected ExplorerItemList.Item.Object object;

        /**
         * Gets the value of the object property.
         * 
         * @return
         *     possible object is
         *     {@link ExplorerItemList.Item.Object }
         *     
         */
        public ExplorerItemList.Item.Object getObject() {
            return object;
        }

        /**
         * Sets the value of the object property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExplorerItemList.Item.Object }
         *     
         */
        public void setObject(ExplorerItemList.Item.Object value) {
            this.object = value;
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
         *         &lt;element name="PID" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
         *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
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
            "pid",
            "title"
        })
        public static class Object {

            @XmlElement(name = "Presentation", required = true)
            protected Presentation presentation;
            @XmlElement(name = "PID", required = true)
            protected String pid;
            @XmlElement(name = "Title", required = true)
            protected String title;

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
             * Gets the value of the pid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPID() {
                return pid;
            }

            /**
             * Sets the value of the pid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPID(String value) {
                this.pid = value;
            }

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

        }

    }

}
