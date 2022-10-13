
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestIfDirExistsMess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestIfDirExistsMess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="TestIfDirExistsRs" type="{http://schemas.radixware.org/eas.xsd}TestIfDirExistsRs"/&gt;
 *         &lt;element name="TestIfDirExistsRq" type="{http://schemas.radixware.org/eas.xsd}TestIfDirExistsRq"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestIfDirExistsMess", propOrder = {
    "testIfDirExistsRs",
    "testIfDirExistsRq"
})
public class TestIfDirExistsMess {

    @XmlElement(name = "TestIfDirExistsRs")
    protected TestIfDirExistsRs testIfDirExistsRs;
    @XmlElement(name = "TestIfDirExistsRq")
    protected TestIfDirExistsRq testIfDirExistsRq;

    /**
     * Gets the value of the testIfDirExistsRs property.
     * 
     * @return
     *     possible object is
     *     {@link TestIfDirExistsRs }
     *     
     */
    public TestIfDirExistsRs getTestIfDirExistsRs() {
        return testIfDirExistsRs;
    }

    /**
     * Sets the value of the testIfDirExistsRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestIfDirExistsRs }
     *     
     */
    public void setTestIfDirExistsRs(TestIfDirExistsRs value) {
        this.testIfDirExistsRs = value;
    }

    /**
     * Gets the value of the testIfDirExistsRq property.
     * 
     * @return
     *     possible object is
     *     {@link TestIfDirExistsRq }
     *     
     */
    public TestIfDirExistsRq getTestIfDirExistsRq() {
        return testIfDirExistsRq;
    }

    /**
     * Sets the value of the testIfDirExistsRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestIfDirExistsRq }
     *     
     */
    public void setTestIfDirExistsRq(TestIfDirExistsRq value) {
        this.testIfDirExistsRq = value;
    }

}
