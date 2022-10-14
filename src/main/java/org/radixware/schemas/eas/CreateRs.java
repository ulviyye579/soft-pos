
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PID" type="{http://schemas.radixware.org/types.xsd}SafeStr"/&gt;
 *         &lt;element name="Presentation" type="{http://schemas.radixware.org/eas.xsd}Definition"/&gt;
 *         &lt;element name="Title" type="{http://schemas.radixware.org/types.xsd}SafeStr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateRs", propOrder = {
    "pid",
    "presentation",
    "title"
})
public class CreateRs
    extends Response
{

    @XmlElement(name = "PID", required = true)
    protected String pid;
    @XmlElement(name = "Presentation", required = true)
    protected Definition presentation;
    @XmlElement(name = "Title")
    protected String title;

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPID() {
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
    public void setPID(String value) {
        this.pid = value;
    }

    /**
     * Gets the value of the presentation property.
     * 
     * @return
     *     possible object is
     *     {@link Definition }
     *     
     */
    public Definition getPresentation() {
        return presentation;
    }

    /**
     * Sets the value of the presentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Definition }
     *     
     */
    public void setPresentation(Definition value) {
        this.presentation = value;
    }

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

}
