
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestIfDirExistsRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestIfDirExistsRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="DirPath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestIfDirExistsRq")
public class TestIfDirExistsRq {

    @XmlAttribute(name = "DirPath", required = true)
    protected String dirPath;

    /**
     * Gets the value of the dirPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirPath() {
        return dirPath;
    }

    /**
     * Sets the value of the dirPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirPath(String value) {
        this.dirPath = value;
    }

}
