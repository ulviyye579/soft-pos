
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestIfFileExistsMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestIfFileExistsMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="TestIfFileExistsRs" type="{http://schemas.radixware.org/eas.xsd}TestIfFileExistsRs"/&gt;
 *         &lt;element name="TestIfFileExistsRq" type="{http://schemas.radixware.org/eas.xsd}TestIfFileExistsRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestIfFileExistsMess", propOrder = {
    "testIfFileExistsRs",
    "testIfFileExistsRq"
})
public class TestIfFileExistsMess {

    @XmlElement(name = "TestIfFileExistsRs")
    protected TestIfFileExistsRs testIfFileExistsRs;
    @XmlElement(name = "TestIfFileExistsRq")
    protected TestIfFileExistsRq testIfFileExistsRq;

    /**
     * Gets the value of the testIfFileExistsRs property.
     * 
     * @return
     *     possible object is
     *     {@link TestIfFileExistsRs }
     *     
     */
    public TestIfFileExistsRs getTestIfFileExistsRs() {
        return testIfFileExistsRs;
    }

    /**
     * Sets the value of the testIfFileExistsRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestIfFileExistsRs }
     *     
     */
    public void setTestIfFileExistsRs(TestIfFileExistsRs value) {
        this.testIfFileExistsRs = value;
    }

    /**
     * Gets the value of the testIfFileExistsRq property.
     * 
     * @return
     *     possible object is
     *     {@link TestIfFileExistsRq }
     *     
     */
    public TestIfFileExistsRq getTestIfFileExistsRq() {
        return testIfFileExistsRq;
    }

    /**
     * Sets the value of the testIfFileExistsRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestIfFileExistsRq }
     *     
     */
    public void setTestIfFileExistsRq(TestIfFileExistsRq value) {
        this.testIfFileExistsRq = value;
    }

}
