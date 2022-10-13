
package org.radixware.schemas.reports;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportMsdlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportMsdlType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Band" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Transformation" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Xsd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Xslt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Msdl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Type" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="GroupLevel" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
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
@XmlType(name = "ReportMsdlType", propOrder = {
    "band"
})
public class ReportMsdlType {

    @XmlElement(name = "Band", required = true)
    protected List<ReportMsdlType.Band> band;

    /**
     * Gets the value of the band property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the band property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportMsdlType.Band }
     * 
     * 
     */
    public List<ReportMsdlType.Band> getBand() {
        if (band == null) {
            band = new ArrayList<ReportMsdlType.Band>();
        }
        return this.band;
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
     *         &lt;element name="Transformation" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Xsd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Xslt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Msdl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Type" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://schemas.radixware.org/types.xsd}StrEnum"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="GroupLevel" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "transformation",
        "msdl"
    })
    public static class Band {

        @XmlElement(name = "Transformation")
        protected ReportMsdlType.Band.Transformation transformation;
        @XmlElement(name = "Msdl", required = true)
        protected String msdl;
        @XmlAttribute(name = "Type", required = true)
        protected String type;
        @XmlAttribute(name = "GroupLevel")
        protected Integer groupLevel;

        /**
         * Gets the value of the transformation property.
         * 
         * @return
         *     possible object is
         *     {@link ReportMsdlType.Band.Transformation }
         *     
         */
        public ReportMsdlType.Band.Transformation getTransformation() {
            return transformation;
        }

        /**
         * Sets the value of the transformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportMsdlType.Band.Transformation }
         *     
         */
        public void setTransformation(ReportMsdlType.Band.Transformation value) {
            this.transformation = value;
        }

        /**
         * Gets the value of the msdl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMsdl() {
            return msdl;
        }

        /**
         * Sets the value of the msdl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMsdl(String value) {
            this.msdl = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the groupLevel property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getGroupLevel() {
            if (groupLevel == null) {
                return  0;
            } else {
                return groupLevel;
            }
        }

        /**
         * Sets the value of the groupLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setGroupLevel(Integer value) {
            this.groupLevel = value;
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
         *         &lt;element name="Xsd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Xslt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "xsd",
            "xslt"
        })
        public static class Transformation {

            @XmlElement(name = "Xsd", required = true)
            protected String xsd;
            @XmlElement(name = "Xslt", required = true)
            protected String xslt;

            /**
             * Gets the value of the xsd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXsd() {
                return xsd;
            }

            /**
             * Sets the value of the xsd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXsd(String value) {
                this.xsd = value;
            }

            /**
             * Gets the value of the xslt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXslt() {
                return xslt;
            }

            /**
             * Sets the value of the xslt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXslt(String value) {
                this.xslt = value;
            }

        }

    }

}
