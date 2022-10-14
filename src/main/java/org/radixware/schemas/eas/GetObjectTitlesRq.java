
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * \u041f\u043e\u043b\u0443\u0447\u0438\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u0437\u0430\u0433\u043e\u043b\u043e\u0432\u043a\u043e\u0432 \u0443\u043a\u0430\u0437\u0430\u043d\u043d\u044b\u0445 \u043e\u0431\u044a\u0435\u043a\u0442\u043e\u0432, \u0441\u0435\u0440\u0432\u0435\u0440 \u0432\u0435\u0440\u043d\u0435\u0442 \u0437\u0430\u0433\u043e\u043b\u043e\u0432\u043a\u0438 \u0442\u043e\u043b\u044c\u043a\u043e \u0442\u0435\u0445 \u043e\u0431\u044a\u0435\u043a\u0442\u043e\u0432, \u043d\u0430 \u043a\u043e\u0442\u043e\u0440\u044b\u0435 \u0435\u0441\u0442\u044c \u043f\u0440\u0430\u0432\u0430 \u043d\u0430 \u0447\u0442\u0435\u043d\u0438\u0435 (Access \u0438 View).
 *                 \u0415\u0441\u043b\u0438 \u0412\u0430\u043c \u043f\u043e\u043d\u0430\u0434\u043e\u0431\u0438\u043b\u0441\u044f \u044d\u0442\u043e\u0442 \u0437\u0430\u043f\u0440\u043e\u0441, \u0441\u043a\u043e\u0440\u0435\u0435 \u0432\u0441\u0435\u0433\u043e, \u0412\u0430\u0448\u0430 \u0441\u0438\u0441\u0442\u0435\u043c\u0430 \u0441\u043f\u0440\u043e\u0435\u043a\u0442\u0438\u0440\u043e\u0432\u0430\u043d\u0430 \u043d\u0435 \u043e\u043f\u0442\u0438\u043c\u0430\u043b\u044c\u043d\u044b\u043c \u043e\u0431\u0440\u0430\u0437\u043e\u043c: \u043f\u043e\u0447\u0442\u0438 \u0432\u0441\u0435\u0433\u0434\u0430 \u0437\u0430\u0433\u043e\u043b\u043e\u0432\u043e\u043a \u043e\u0431\u044a\u0435\u043a\u0442\u0430 \u043c\u043e\u0436\u043d\u043e \u043f\u043e\u043b\u0443\u0447\u0438\u0442\u044c \u0432 \u0442\u043e\u043c \u0436\u0435 \u0437\u0430\u043f\u0440\u043e\u0441\u0435, \u0447\u0442\u043e \u0438 \u043a\u043b\u044e\u0447.
 * 
 * <p>Java class for GetObjectTitlesRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetObjectTitlesRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}EntityRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Objects"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Item" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Context" type="{http://schemas.radixware.org/eas.xsd}Context" minOccurs="0"/&gt;
 *                             &lt;element name="PID" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *                           &lt;/sequence&gt;
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
@XmlType(name = "GetObjectTitlesRq", propOrder = {
    "objects"
})
public class GetObjectTitlesRq
    extends EntityRequest
{

    @XmlElement(name = "Objects", required = true)
    protected GetObjectTitlesRq.Objects objects;

    /**
     * Gets the value of the objects property.
     * 
     * @return
     *     possible object is
     *     {@link GetObjectTitlesRq.Objects }
     *     
     */
    public GetObjectTitlesRq.Objects getObjects() {
        return objects;
    }

    /**
     * Sets the value of the objects property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetObjectTitlesRq.Objects }
     *     
     */
    public void setObjects(GetObjectTitlesRq.Objects value) {
        this.objects = value;
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
     *                   &lt;element name="Context" type="{http://schemas.radixware.org/eas.xsd}Context" minOccurs="0"/&gt;
     *                   &lt;element name="PID" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
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
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Objects {

        @XmlElement(name = "Item", required = true)
        protected List<GetObjectTitlesRq.Objects.Item> item;

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
         * {@link GetObjectTitlesRq.Objects.Item }
         * 
         * 
         */
        public List<GetObjectTitlesRq.Objects.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetObjectTitlesRq.Objects.Item>();
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
         *         &lt;element name="Context" type="{http://schemas.radixware.org/eas.xsd}Context" minOccurs="0"/&gt;
         *         &lt;element name="PID" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
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
            "context",
            "pid"
        })
        public static class Item {

            @XmlElement(name = "Context")
            protected Context context;
            @XmlElement(name = "PID", required = true)
            protected String pid;

            /**
             * Gets the value of the context property.
             * 
             * @return
             *     possible object is
             *     {@link Context }
             *     
             */
            public Context getContext() {
                return context;
            }

            /**
             * Sets the value of the context property.
             * 
             * @param value
             *     allowed object is
             *     {@link Context }
             *     
             */
            public void setContext(Context value) {
                this.context = value;
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

        }

    }

}
