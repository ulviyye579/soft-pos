
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * \u0410\u0442\u0440\u0438\u0431\u0443\u0442\u044b Caption- \u0417\u0430\u0433\u043e\u043b\u043e\u0432\u043e\u043a \u043e\u043a\u043d\u0430. \u0415\u0441\u043b\u0438 \u044d\u0442\u043e\u0433\u043e \u0430\u0442\u0440\u0438\u0431\u0443\u0442\u0430 \u043d\u0435\u0442 \u0432 \u0437\u0430\u043f\u0440\u043e\u0441\u0435 – \u043a\u043b\u0438\u0435\u043d\u0442 \u0434\u043e\u043b\u0436\u0435\u043d \u043e\u0441\u0442\u0430\u0432\u0438\u0442\u044c \u043f\u0440\u0435\u0436\u043d\u0438\u0439 \u0437\u0430\u0433\u043e\u043b\u043e\u0432\u043e\u043a \u043e\u043a\u043d\u0430.
 *                 Title - \u041d\u0430\u0437\u0432\u0430\u043d\u0438\u0435 \u0442\u0435\u043a\u0443\u0449\u0435\u0439 \u0441\u0442\u0430\u0434\u0438\u0438
 *                 Cancellable - \u041f\u0440\u0438\u0437\u043d\u0430\u043a \u043a\u043d\u043e\u043f\u043a\u0438  “Cancel” \u0432 \u0434\u0438\u0430\u043b\u043e\u0433\u0435
 *                 ShowTrace - \u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0442\u044c \u0442\u0440\u0430\u0441\u0441\u0443 \u0434\u043b\u044f \u044d\u0442\u043e\u0439 \u0441\u0442\u0430\u0434\u0438\u0438
 *                 ShowPercent - \u0415\u0441\u043b\u0438 \u044d\u0442\u043e\u0442 \u0430\u0442\u0440\u0438\u0431\u0443\u0442 True  – \u043a\u043b\u0438\u0435\u043d\u0442 \u0434\u043e\u043b\u0436\u0435\u043d \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u043e\u0431\u044b\u0447\u043d\u044b\u0439 ProgressBar, \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0432 \u0435\u0433\u043e \u043d\u0430\u0447\u0430\u043b\u044c\u043d\u043e\u0435 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u0432 0.
 *                 \u0415\u0441\u043b\u0438 False - –  \u043d\u0443\u0436\u043d\u043e \u043e\u0442\u043e\u0431\u0440\u0430\u0437\u0438\u0442\u044c ProgressBar \u0441 \u043d\u0435\u0444\u0438\u043a\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u043c \u0432\u0440\u0435\u043c\u0435\u043d\u0435\u043c \u0432\u044b\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f (\u043a\u0430\u043a \u0434\u0438\u0430\u043b\u043e\u0433 “Please Wait ”).
 * 
 * <p>Java class for ProgressDialogStartProcessRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgressDialogStartProcessRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Caption" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
 *       &lt;attribute name="Title" use="required" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
 *       &lt;attribute name="Cancellable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ShowTrace" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ShowPercent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="CancelButtonTitle" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgressDialogStartProcessRq")
public class ProgressDialogStartProcessRq {

    @XmlAttribute(name = "Caption")
    protected String caption;
    @XmlAttribute(name = "Title", required = true)
    protected String title;
    @XmlAttribute(name = "Cancellable", required = true)
    protected boolean cancellable;
    @XmlAttribute(name = "ShowTrace")
    protected Boolean showTrace;
    @XmlAttribute(name = "ShowPercent")
    protected Boolean showPercent;
    @XmlAttribute(name = "CancelButtonTitle")
    protected String cancelButtonTitle;

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
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

    /**
     * Gets the value of the cancellable property.
     * 
     */
    public boolean isCancellable() {
        return cancellable;
    }

    /**
     * Sets the value of the cancellable property.
     * 
     */
    public void setCancellable(boolean value) {
        this.cancellable = value;
    }

    /**
     * Gets the value of the showTrace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowTrace() {
        if (showTrace == null) {
            return false;
        } else {
            return showTrace;
        }
    }

    /**
     * Sets the value of the showTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowTrace(Boolean value) {
        this.showTrace = value;
    }

    /**
     * Gets the value of the showPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowPercent() {
        if (showPercent == null) {
            return true;
        } else {
            return showPercent;
        }
    }

    /**
     * Sets the value of the showPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPercent(Boolean value) {
        this.showPercent = value;
    }

    /**
     * Gets the value of the cancelButtonTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelButtonTitle() {
        return cancelButtonTitle;
    }

    /**
     * Sets the value of the cancelButtonTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelButtonTitle(String value) {
        this.cancelButtonTitle = value;
    }

}
