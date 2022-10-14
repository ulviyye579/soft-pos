
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Data" type="{http://schemas.radixware.org/eas.xsd}PresentableObject"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadRs", propOrder = {
    "data"
})
@XmlSeeAlso({
    UpdateRs.class
})
public class ReadRs
    extends Response
{

    @XmlElement(name = "Data", required = true)
    protected PresentableObject data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link PresentableObject }
     *     
     */
    public PresentableObject getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentableObject }
     *     
     */
    public void setData(PresentableObject value) {
        this.data = value;
    }

}
