
package com.tranzaxis.schemas.tokens_admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebApp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebApp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.tranzaxis.com/tokens-admin.xsd}DeviceApp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrowserJavaEnabled" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="BrowserJavaScriptEnabled" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="BrowserLanguage" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="BrowserUserAgent" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="BrowserScreenColorDepth" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="BrowserScreenHeight" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="BrowserScreenWidth" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebApp", propOrder = {
    "browserJavaEnabled",
    "browserJavaScriptEnabled",
    "browserLanguage",
    "browserUserAgent",
    "browserScreenColorDepth",
    "browserScreenHeight",
    "browserScreenWidth"
})
public class WebApp
    extends DeviceApp
{

    @XmlElementRef(name = "BrowserJavaEnabled", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> browserJavaEnabled;
    @XmlElementRef(name = "BrowserJavaScriptEnabled", namespace = "http://schemas.tranzaxis.com/tokens-admin.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> browserJavaScriptEnabled;
    @XmlElement(name = "BrowserLanguage")
    protected String browserLanguage;
    @XmlElement(name = "BrowserUserAgent")
    protected String browserUserAgent;
    @XmlElement(name = "BrowserScreenColorDepth")
    protected String browserScreenColorDepth;
    @XmlElement(name = "BrowserScreenHeight")
    protected String browserScreenHeight;
    @XmlElement(name = "BrowserScreenWidth")
    protected String browserScreenWidth;

    /**
     * Gets the value of the browserJavaEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBrowserJavaEnabled() {
        return browserJavaEnabled;
    }

    /**
     * Sets the value of the browserJavaEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBrowserJavaEnabled(JAXBElement<Boolean> value) {
        this.browserJavaEnabled = value;
    }

    /**
     * Gets the value of the browserJavaScriptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBrowserJavaScriptEnabled() {
        return browserJavaScriptEnabled;
    }

    /**
     * Sets the value of the browserJavaScriptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBrowserJavaScriptEnabled(JAXBElement<Boolean> value) {
        this.browserJavaScriptEnabled = value;
    }

    /**
     * Gets the value of the browserLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowserLanguage() {
        return browserLanguage;
    }

    /**
     * Sets the value of the browserLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowserLanguage(String value) {
        this.browserLanguage = value;
    }

    /**
     * Gets the value of the browserUserAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowserUserAgent() {
        return browserUserAgent;
    }

    /**
     * Sets the value of the browserUserAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowserUserAgent(String value) {
        this.browserUserAgent = value;
    }

    /**
     * Gets the value of the browserScreenColorDepth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowserScreenColorDepth() {
        return browserScreenColorDepth;
    }

    /**
     * Sets the value of the browserScreenColorDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowserScreenColorDepth(String value) {
        this.browserScreenColorDepth = value;
    }

    /**
     * Gets the value of the browserScreenHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowserScreenHeight() {
        return browserScreenHeight;
    }

    /**
     * Sets the value of the browserScreenHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowserScreenHeight(String value) {
        this.browserScreenHeight = value;
    }

    /**
     * Gets the value of the browserScreenWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowserScreenWidth() {
        return browserScreenWidth;
    }

    /**
     * Sets the value of the browserScreenWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowserScreenWidth(String value) {
        this.browserScreenWidth = value;
    }

}
