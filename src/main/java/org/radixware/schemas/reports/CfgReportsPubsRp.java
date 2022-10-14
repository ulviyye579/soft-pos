
package org.radixware.schemas.reports;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="PubList" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ClassTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ClassId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                 &lt;attribute name="Pid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "pubList"
})
@XmlRootElement(name = "CfgReportsPubsRp")
public class CfgReportsPubsRp {

    @XmlElement(name = "PubList")
    protected List<CfgReportsPubsRp.PubList> pubList;

    /**
     * Gets the value of the pubList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfgReportsPubsRp.PubList }
     * 
     * 
     */
    public List<CfgReportsPubsRp.PubList> getPubList() {
        if (pubList == null) {
            pubList = new ArrayList<CfgReportsPubsRp.PubList>();
        }
        return this.pubList;
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
     *         &lt;element name="ClassTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ClassId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *       &lt;attribute name="Pid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "classTitle"
    })
    public static class PubList {

        @XmlElement(name = "ClassTitle", required = true)
        protected String classTitle;
        @XmlAttribute(name = "ClassId", required = true)
        protected String classId;
        @XmlAttribute(name = "Pid")
        protected String pid;

        /**
         * Gets the value of the classTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassTitle() {
            return classTitle;
        }

        /**
         * Sets the value of the classTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassTitle(String value) {
            this.classTitle = value;
        }

        /**
         * Gets the value of the classId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassId() {
            return classId;
        }

        /**
         * Sets the value of the classId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassId(String value) {
            this.classId = value;
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

    }

}
