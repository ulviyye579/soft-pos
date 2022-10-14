
package org.radixware.schemas.reports;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportPubTopic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportPubTopic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Topics" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Topic" type="{http://schemas.radixware.org/reports.xsd}ReportPubTopic" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Pubs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Pub" type="{http://schemas.radixware.org/reports.xsd}ReportPub" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Pid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportPubTopic", propOrder = {
    "title",
    "description",
    "location",
    "topics",
    "pubs"
})
public class ReportPubTopic {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Topics")
    protected ReportPubTopic.Topics topics;
    @XmlElement(name = "Pubs")
    protected ReportPubTopic.Pubs pubs;
    @XmlAttribute(name = "Pid")
    protected String pid;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the topics property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPubTopic.Topics }
     *     
     */
    public ReportPubTopic.Topics getTopics() {
        return topics;
    }

    /**
     * Sets the value of the topics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPubTopic.Topics }
     *     
     */
    public void setTopics(ReportPubTopic.Topics value) {
        this.topics = value;
    }

    /**
     * Gets the value of the pubs property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPubTopic.Pubs }
     *     
     */
    public ReportPubTopic.Pubs getPubs() {
        return pubs;
    }

    /**
     * Sets the value of the pubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPubTopic.Pubs }
     *     
     */
    public void setPubs(ReportPubTopic.Pubs value) {
        this.pubs = value;
    }

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPid() {
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
    public void setPid(String value) {
        this.pid = value;
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
     *         &lt;element name="Pub" type="{http://schemas.radixware.org/reports.xsd}ReportPub" maxOccurs="unbounded"/&gt;
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
        "pub"
    })
    public static class Pubs {

        @XmlElement(name = "Pub", required = true)
        protected List<ReportPub> pub;

        /**
         * Gets the value of the pub property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pub property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPub().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReportPub }
         * 
         * 
         */
        public List<ReportPub> getPub() {
            if (pub == null) {
                pub = new ArrayList<ReportPub>();
            }
            return this.pub;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Topic" type="{http://schemas.radixware.org/reports.xsd}ReportPubTopic" maxOccurs="unbounded"/&gt;
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
        "topic"
    })
    public static class Topics {

        @XmlElement(name = "Topic", required = true)
        protected List<ReportPubTopic> topic;

        /**
         * Gets the value of the topic property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the topic property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTopic().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReportPubTopic }
         * 
         * 
         */
        public List<ReportPubTopic> getTopic() {
            if (topic == null) {
                topic = new ArrayList<ReportPubTopic>();
            }
            return this.topic;
        }

    }

}
