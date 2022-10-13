
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rows" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Item" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="Object" type="{http://schemas.radixware.org/eas.xsd}PresentableObject"/&gt;
 *                             &lt;element name="Exception"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://schemas.radixware.org/faultdetail.xsd}Exception"&gt;
 *                                     &lt;attribute name="PID" use="required" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/choice&gt;
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
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectList", propOrder = {
    "rows"
})
public class ObjectList {

    @XmlElement(name = "Rows")
    protected ObjectList.Rows rows;

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectList.Rows }
     *     
     */
    public ObjectList.Rows getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectList.Rows }
     *     
     */
    public void setRows(ObjectList.Rows value) {
        this.rows = value;
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
     *                 &lt;choice&gt;
     *                   &lt;element name="Object" type="{http://schemas.radixware.org/eas.xsd}PresentableObject"/&gt;
     *                   &lt;element name="Exception"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://schemas.radixware.org/faultdetail.xsd}Exception"&gt;
     *                           &lt;attribute name="PID" use="required" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/choice&gt;
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
    public static class Rows {

        @XmlElement(name = "Item", required = true)
        protected List<ObjectList.Rows.Item> item;

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
         * {@link ObjectList.Rows.Item }
         * 
         * 
         */
        public List<ObjectList.Rows.Item> getItem() {
            if (item == null) {
                item = new ArrayList<ObjectList.Rows.Item>();
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
         *       &lt;choice&gt;
         *         &lt;element name="Object" type="{http://schemas.radixware.org/eas.xsd}PresentableObject"/&gt;
         *         &lt;element name="Exception"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://schemas.radixware.org/faultdetail.xsd}Exception"&gt;
         *                 &lt;attribute name="PID" use="required" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
         *               &lt;/extension&gt;
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
        @XmlType(name = "", propOrder = {
            "object",
            "exception"
        })
        public static class Item {

            @XmlElement(name = "Object")
            protected PresentableObject object;
            @XmlElement(name = "Exception")
            protected ObjectList.Rows.Item.Exception exception;

            /**
             * Gets the value of the object property.
             * 
             * @return
             *     possible object is
             *     {@link PresentableObject }
             *     
             */
            public PresentableObject getObject() {
                return object;
            }

            /**
             * Sets the value of the object property.
             * 
             * @param value
             *     allowed object is
             *     {@link PresentableObject }
             *     
             */
            public void setObject(PresentableObject value) {
                this.object = value;
            }

            /**
             * Gets the value of the exception property.
             * 
             * @return
             *     possible object is
             *     {@link ObjectList.Rows.Item.Exception }
             *     
             */
            public ObjectList.Rows.Item.Exception getException() {
                return exception;
            }

            /**
             * Sets the value of the exception property.
             * 
             * @param value
             *     allowed object is
             *     {@link ObjectList.Rows.Item.Exception }
             *     
             */
            public void setException(ObjectList.Rows.Item.Exception value) {
                this.exception = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://schemas.radixware.org/faultdetail.xsd}Exception"&gt;
             *       &lt;attribute name="PID" use="required" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Exception
                extends org.radixware.schemas.faultdetail.Exception
            {

                @XmlAttribute(name = "PID", required = true)
                protected String pid;

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

            }

        }

    }

}
