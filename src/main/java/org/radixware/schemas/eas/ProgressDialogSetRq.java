
package org.radixware.schemas.eas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Title - \u041d\u0430\u0437\u0432\u0430\u043d\u0438\u0435 \u0442\u0435\u043a\u0443\u0449\u0435\u0439 \u0441\u0442\u0430\u0434\u0438\u0438
 *                 Progress - \u041f\u0440\u043e\u0433\u0440\u0435\u0441\u0441 \u0432\u044b\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f \u0441\u0442\u0430\u0434\u0438\u0438, %.
 *                 \u0418\u043c\u0435\u0435\u0442 \u0441\u043c\u044b\u0441\u043b \u0435\u0441\u043b\u0438 \u0432 \u0437\u0430\u043f\u0440\u043e\u0441\u0435 StartStage \u0430\u0442\u0440\u0438\u0431\u0443\u0442 ShowPercent == true
 *                 Cancellable - \u041f\u0440\u0438\u0437\u043d\u0430\u043a \u043d\u0430\u043b\u0438\u0447\u0438\u044f \u043a\u043d\u043e\u043f\u043a\u0438  “Cancel” \u0432 \u0434\u0438\u0430\u043b\u043e\u0433\u0435
 *                 \u0415\u0441\u043b\u0438  \u0442\u044d\u0433\u0438/\u0430\u0442\u0440\u0438\u0431\u0443\u0442\u044b \u043d\u0435 \u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u044b – \u043e\u0441\u0442\u0430\u0432\u0438\u0442\u044c \u0441\u043e\u043e\u0442\u0432\u0435\u0442\u0441\u0442\u0432\u0443\u044e\u0449\u0438\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u044b \u0431\u0435\u0437 \u0438\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u0439. \u0417\u0430\u043f\u0440\u043e\u0441 \u043c\u043e\u0436\u0435\u0442 \u043f\u0440\u0438\u0439\u0442\u0438 \u043f\u043e\u043b\u043d\u043e\u0441\u0442\u044c\u044e \u043f\u0443\u0441\u0442\u044b\u043c – \u0434\u043b\u044f \u043f\u0440\u043e\u0432\u0435\u0440\u043a\u0438, \u043d\u0435 \u0431\u044b\u043b \u043b\u0438 \u043d\u0430\u0436\u0430\u0442 Cancel.
 * 
 * <p>Java class for ProgressDialogSetRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgressDialogSetRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Title" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
 *       &lt;attribute name="Progress" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="Cancellable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CancelButtonTitle" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgressDialogSetRq")
public class ProgressDialogSetRq {

    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "Title")
    protected String title;
    @XmlAttribute(name = "Progress")
    protected Float progress;
    @XmlAttribute(name = "Cancellable")
    protected Boolean cancellable;
    @XmlAttribute(name = "CancelButtonTitle")
    protected String cancelButtonTitle;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Gets the value of the progress property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProgress() {
        return progress;
    }

    /**
     * Sets the value of the progress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProgress(Float value) {
        this.progress = value;
    }

    /**
     * Gets the value of the cancellable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancellable() {
        return cancellable;
    }

    /**
     * Sets the value of the cancellable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancellable(Boolean value) {
        this.cancellable = value;
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
