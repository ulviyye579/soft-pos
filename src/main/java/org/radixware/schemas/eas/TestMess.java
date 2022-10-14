
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="TestRs" type="{http://schemas.radixware.org/eas.xsd}TestRs"/&gt;
 *         &lt;element name="TestRq" type="{http://schemas.radixware.org/eas.xsd}TestRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestMess", propOrder = {
    "testRs",
    "testRq"
})
public class TestMess {

    @XmlElement(name = "TestRs")
    protected TestRs testRs;
    @XmlElement(name = "TestRq")
    protected TestRq testRq;

    /**
     * Gets the value of the testRs property.
     * 
     * @return
     *     possible object is
     *     {@link TestRs }
     *     
     */
    public TestRs getTestRs() {
        return testRs;
    }

    /**
     * Sets the value of the testRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestRs }
     *     
     */
    public void setTestRs(TestRs value) {
        this.testRs = value;
    }

    /**
     * Gets the value of the testRq property.
     * 
     * @return
     *     possible object is
     *     {@link TestRq }
     *     
     */
    public TestRq getTestRq() {
        return testRq;
    }

    /**
     * Sets the value of the testRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestRq }
     *     
     */
    public void setTestRq(TestRq value) {
        this.testRq = value;
    }

}
