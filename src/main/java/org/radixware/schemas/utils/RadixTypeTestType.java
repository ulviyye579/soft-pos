
package org.radixware.schemas.utils;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.radixware.schemas.types.MapStrStr;


/**
 * <p>Java class for RadixTypeTestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadixTypeTestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AAA" type="{http://schemas.radixware.org/types.xsd}MapStrStr" minOccurs="0"/&gt;
 *         &lt;element name="TestNillableSimpleList" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;list itemType="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TestStrList"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadixTypeTestType", propOrder = {
    "aaa",
    "testNillableSimpleList"
})
public class RadixTypeTestType {

    @XmlElement(name = "AAA")
    protected MapStrStr aaa;
    @XmlElementRef(name = "TestNillableSimpleList", namespace = "http://schemas.radixware.org/utils.xsd", type = JAXBElement.class, required = false)
    protected List<JAXBElement<List<Long>>> testNillableSimpleList;
    @XmlAttribute(name = "TestStrList")
    protected List<String> testStrList;

    /**
     * Gets the value of the aaa property.
     * 
     * @return
     *     possible object is
     *     {@link MapStrStr }
     *     
     */
    public MapStrStr getAAA() {
        return aaa;
    }

    /**
     * Sets the value of the aaa property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapStrStr }
     *     
     */
    public void setAAA(MapStrStr value) {
        this.aaa = value;
    }

    /**
     * Gets the value of the testNillableSimpleList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testNillableSimpleList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestNillableSimpleList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}
     * 
     * 
     */
    public List<JAXBElement<List<Long>>> getTestNillableSimpleList() {
        if (testNillableSimpleList == null) {
            testNillableSimpleList = new ArrayList<JAXBElement<List<Long>>>();
        }
        return this.testNillableSimpleList;
    }

    /**
     * Gets the value of the testStrList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testStrList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestStrList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTestStrList() {
        if (testStrList == null) {
            testStrList = new ArrayList<String>();
        }
        return this.testStrList;
    }

}
