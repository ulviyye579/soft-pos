
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * \u0414\u0438\u0430\u043b\u043e\u0433 \u0432\u0432\u043e\u0434\u0430 \u043f\u0430\u0440\u0430\u043c\u0435\u0442\u0440\u043e\u0432 \u043e\u0442\u0447\u0435\u0442\u0430
 * 
 * \u041e\u0442\u0447\u0435\u0442, \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u043e \u043a\u043e\u0442\u043e\u0440\u043e\u0433\u043e \u0440\u0435\u0434\u0430\u043a\u0442\u0438\u0440\u0443\u0435\u0442\u0441\u044f
 * 
 * <p>Java class for Report complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Report"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Definition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Properties" type="{http://schemas.radixware.org/eas.xsd}PropertyList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Report", propOrder = {
    "properties"
})
public class Report
    extends Definition
{

    @XmlElement(name = "Properties")
    protected PropertyList properties;

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyList }
     *     
     */
    public PropertyList getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyList }
     *     
     */
    public void setProperties(PropertyList value) {
        this.properties = value;
    }

}
