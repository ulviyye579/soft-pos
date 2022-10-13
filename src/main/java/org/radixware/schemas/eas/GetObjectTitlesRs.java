
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetObjectTitlesRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetObjectTitlesRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectTitles"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Item" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PID" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *                             &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="State" use="required" type="{http://schemas.radixware.org/eas.xsd}GetObjectTitleResultStateEnum" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "GetObjectTitlesRs", propOrder = {
    "objectTitles"
})
public class GetObjectTitlesRs
    extends Response
{

    @XmlElement(name = "ObjectTitles", required = true)
    protected GetObjectTitlesRs.ObjectTitles objectTitles;

    /**
     * Gets the value of the objectTitles property.
     * 
     * @return
     *     possible object is
     *     {@link GetObjectTitlesRs.ObjectTitles }
     *     
     */
    public GetObjectTitlesRs.ObjectTitles getObjectTitles() {
        return objectTitles;
    }

    /**
     * Sets the value of the objectTitles property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetObjectTitlesRs.ObjectTitles }
     *     
     */
    public void setObjectTitles(GetObjectTitlesRs.ObjectTitles value) {
        this.objectTitles = value;
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
     *         &lt;element name="Item" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PID" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
     *                   &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="State" use="required" type="{http://schemas.radixware.org/eas.xsd}GetObjectTitleResultStateEnum" /&gt;
     *               &lt;/restriction&gt;
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
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class ObjectTitles {

        @XmlElement(name = "Item", required = true)
        protected List<GetObjectTitlesRs.ObjectTitles.Item> item;

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
         * {@link GetObjectTitlesRs.ObjectTitles.Item }
         * 
         * 
         */
        public List<GetObjectTitlesRs.ObjectTitles.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetObjectTitlesRs.ObjectTitles.Item>();
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="PID" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
         *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="State" use="required" type="{http://schemas.radixware.org/eas.xsd}GetObjectTitleResultStateEnum" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "pid",
            "title"
        })
        public static class Item {

            @XmlElement(name = "PID", required = true)
            protected String pid;
            @XmlElement(name = "Title")
            protected String title;
            @XmlAttribute(name = "State", required = true)
            protected GetObjectTitleResultStateEnum state;

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

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link GetObjectTitleResultStateEnum }
             *     
             */
            public GetObjectTitleResultStateEnum getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetObjectTitleResultStateEnum }
             *     
             */
            public void setState(GetObjectTitleResultStateEnum value) {
                this.state = value;
            }

        }

    }

}
