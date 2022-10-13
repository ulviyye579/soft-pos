
package com.tranzaxis.schemas.tokens_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtAuthApp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtAuthApp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tokens-admin.xsd}Base"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AppLabel" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="AppUrl" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtAuthApp", propOrder = {
    "appLabel",
    "appUrl"
})
public class ExtAuthApp
    extends Base
{

    @XmlElement(name = "AppLabel")
    protected String appLabel;
    @XmlElement(name = "AppUrl")
    protected String appUrl;

    /**
     * Gets the value of the appLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppLabel() {
        return appLabel;
    }

    /**
     * Sets the value of the appLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppLabel(String value) {
        this.appLabel = value;
    }

    /**
     * Gets the value of the appUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppUrl() {
        return appUrl;
    }

    /**
     * Sets the value of the appUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppUrl(String value) {
        this.appUrl = value;
    }

}
