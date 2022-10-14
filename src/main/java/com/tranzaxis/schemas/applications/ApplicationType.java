
package com.tranzaxis.schemas.applications;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.Lexeme;
import com.tranzaxis.schemas.common_types.ParamDescriptions;
import org.radixware.schemas.common.UserFunc;
import org.radixware.schemas.commondef.ChangeLog;


/**
 * <p>Java class for ApplicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChildTypes" type="{http://schemas.tranzaxis.com/applications.xsd}ApplicationTypeGroup" minOccurs="0"/&gt;
 *         &lt;element name="ChangeLog" type="{http://schemas.radixware.org/commondef.xsd}ChangeLog" minOccurs="0"/&gt;
 *         &lt;element name="Phases" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ApplicationPhase" type="{http://schemas.tranzaxis.com/applications.xsd}ApplicationPhase" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Params" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Param" type="{http://schemas.tranzaxis.com/applications.xsd}ApplicationTypeParam" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Description" type="{http://schemas.tranzaxis.com/common-types.xsd}Lexeme" minOccurs="0"/&gt;
 *         &lt;element name="Rid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://schemas.tranzaxis.com/common-types.xsd}Lexeme" minOccurs="0"/&gt;
 *         &lt;element name="ProcessTypeGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="DataSchemeInCore" type="{http://schemas.radixware.org/types.xsd}Bool" minOccurs="0"/&gt;
 *         &lt;element name="DataSchemeUri" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="DataScheme" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="HtmlTransform" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InitData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AccessibilityFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *         &lt;element name="InitFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *         &lt;element name="CheckFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *         &lt;element name="ProcessFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *         &lt;element name="GetParamsFunc" type="{http://schemas.radixware.org/common.xsd}UserFunc" minOccurs="0"/&gt;
 *         &lt;element name="AttrsDesc" type="{http://schemas.tranzaxis.com/common-types.xsd}ParamDescriptions" minOccurs="0"/&gt;
 *         &lt;element name="InitPhaseGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="OperListGuid" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="FinishedShowDays" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *         &lt;element name="FinishedStoreDays" type="{http://schemas.radixware.org/types.xsd}Int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="InstName" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="Guid" use="required" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="ParentGuid" type="{http://schemas.radixware.org/types.xsd}Str" /&gt;
 *       &lt;attribute name="IsAbstract" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *       &lt;attribute name="ContextType" use="required" type="{http://schemas.tranzaxis.com/applications.xsd}AppContextType" /&gt;
 *       &lt;attribute name="IsPhaseSetDefined" use="required" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationType", propOrder = {
    "childTypes",
    "changeLog",
    "phases",
    "params",
    "description",
    "rid",
    "title",
    "processTypeGuid",
    "dataSchemeInCore",
    "dataSchemeUri",
    "dataScheme",
    "htmlTransform",
    "initData",
    "accessibilityFunc",
    "initFunc",
    "checkFunc",
    "processFunc",
    "getParamsFunc",
    "attrsDesc",
    "initPhaseGuid",
    "operListGuid",
    "finishedShowDays",
    "finishedStoreDays"
})
public class ApplicationType {

    @XmlElement(name = "ChildTypes")
    protected ApplicationTypeGroup childTypes;
    @XmlElement(name = "ChangeLog")
    protected ChangeLog changeLog;
    @XmlElement(name = "Phases")
    protected ApplicationType.Phases phases;
    @XmlElement(name = "Params")
    protected ApplicationType.Params params;
    @XmlElement(name = "Description")
    protected Lexeme description;
    @XmlElementRef(name = "Rid", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rid;
    @XmlElement(name = "Title")
    protected Lexeme title;
    @XmlElementRef(name = "ProcessTypeGuid", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> processTypeGuid;
    @XmlElementRef(name = "DataSchemeInCore", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dataSchemeInCore;
    @XmlElementRef(name = "DataSchemeUri", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataSchemeUri;
    @XmlElementRef(name = "DataScheme", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> dataScheme;
    @XmlElementRef(name = "HtmlTransform", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> htmlTransform;
    @XmlElementRef(name = "InitData", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> initData;
    @XmlElementRef(name = "AccessibilityFunc", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserFunc> accessibilityFunc;
    @XmlElementRef(name = "InitFunc", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserFunc> initFunc;
    @XmlElementRef(name = "CheckFunc", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserFunc> checkFunc;
    @XmlElementRef(name = "ProcessFunc", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserFunc> processFunc;
    @XmlElementRef(name = "GetParamsFunc", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserFunc> getParamsFunc;
    @XmlElement(name = "AttrsDesc")
    protected ParamDescriptions attrsDesc;
    @XmlElementRef(name = "InitPhaseGuid", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> initPhaseGuid;
    @XmlElementRef(name = "OperListGuid", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operListGuid;
    @XmlElementRef(name = "FinishedShowDays", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> finishedShowDays;
    @XmlElementRef(name = "FinishedStoreDays", namespace = "http://schemas.tranzaxis.com/applications.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> finishedStoreDays;
    @XmlAttribute(name = "InstName")
    protected String instName;
    @XmlAttribute(name = "Guid", required = true)
    protected String guid;
    @XmlAttribute(name = "ParentGuid")
    protected String parentGuid;
    @XmlAttribute(name = "IsAbstract", required = true)
    protected boolean isAbstract;
    @XmlAttribute(name = "ContextType", required = true)
    protected String contextType;
    @XmlAttribute(name = "IsPhaseSetDefined", required = true)
    protected boolean isPhaseSetDefined;

    /**
     * Gets the value of the childTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationTypeGroup }
     *     
     */
    public ApplicationTypeGroup getChildTypes() {
        return childTypes;
    }

    /**
     * Sets the value of the childTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationTypeGroup }
     *     
     */
    public void setChildTypes(ApplicationTypeGroup value) {
        this.childTypes = value;
    }

    /**
     * Gets the value of the changeLog property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeLog }
     *     
     */
    public ChangeLog getChangeLog() {
        return changeLog;
    }

    /**
     * Sets the value of the changeLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeLog }
     *     
     */
    public void setChangeLog(ChangeLog value) {
        this.changeLog = value;
    }

    /**
     * Gets the value of the phases property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationType.Phases }
     *     
     */
    public ApplicationType.Phases getPhases() {
        return phases;
    }

    /**
     * Sets the value of the phases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationType.Phases }
     *     
     */
    public void setPhases(ApplicationType.Phases value) {
        this.phases = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationType.Params }
     *     
     */
    public ApplicationType.Params getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationType.Params }
     *     
     */
    public void setParams(ApplicationType.Params value) {
        this.params = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Lexeme }
     *     
     */
    public Lexeme getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lexeme }
     *     
     */
    public void setDescription(Lexeme value) {
        this.description = value;
    }

    /**
     * Gets the value of the rid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRid() {
        return rid;
    }

    /**
     * Sets the value of the rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRid(JAXBElement<String> value) {
        this.rid = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Lexeme }
     *     
     */
    public Lexeme getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lexeme }
     *     
     */
    public void setTitle(Lexeme value) {
        this.title = value;
    }

    /**
     * Gets the value of the processTypeGuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcessTypeGuid() {
        return processTypeGuid;
    }

    /**
     * Sets the value of the processTypeGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcessTypeGuid(JAXBElement<String> value) {
        this.processTypeGuid = value;
    }

    /**
     * Gets the value of the dataSchemeInCore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDataSchemeInCore() {
        return dataSchemeInCore;
    }

    /**
     * Sets the value of the dataSchemeInCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDataSchemeInCore(JAXBElement<Boolean> value) {
        this.dataSchemeInCore = value;
    }

    /**
     * Gets the value of the dataSchemeUri property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataSchemeUri() {
        return dataSchemeUri;
    }

    /**
     * Sets the value of the dataSchemeUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataSchemeUri(JAXBElement<String> value) {
        this.dataSchemeUri = value;
    }

    /**
     * Gets the value of the dataScheme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getDataScheme() {
        return dataScheme;
    }

    /**
     * Sets the value of the dataScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setDataScheme(JAXBElement<Object> value) {
        this.dataScheme = value;
    }

    /**
     * Gets the value of the htmlTransform property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getHtmlTransform() {
        return htmlTransform;
    }

    /**
     * Sets the value of the htmlTransform property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setHtmlTransform(JAXBElement<Object> value) {
        this.htmlTransform = value;
    }

    /**
     * Gets the value of the initData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getInitData() {
        return initData;
    }

    /**
     * Sets the value of the initData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setInitData(JAXBElement<Object> value) {
        this.initData = value;
    }

    /**
     * Gets the value of the accessibilityFunc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public JAXBElement<UserFunc> getAccessibilityFunc() {
        return accessibilityFunc;
    }

    /**
     * Sets the value of the accessibilityFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public void setAccessibilityFunc(JAXBElement<UserFunc> value) {
        this.accessibilityFunc = value;
    }

    /**
     * Gets the value of the initFunc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public JAXBElement<UserFunc> getInitFunc() {
        return initFunc;
    }

    /**
     * Sets the value of the initFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public void setInitFunc(JAXBElement<UserFunc> value) {
        this.initFunc = value;
    }

    /**
     * Gets the value of the checkFunc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public JAXBElement<UserFunc> getCheckFunc() {
        return checkFunc;
    }

    /**
     * Sets the value of the checkFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public void setCheckFunc(JAXBElement<UserFunc> value) {
        this.checkFunc = value;
    }

    /**
     * Gets the value of the processFunc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public JAXBElement<UserFunc> getProcessFunc() {
        return processFunc;
    }

    /**
     * Sets the value of the processFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public void setProcessFunc(JAXBElement<UserFunc> value) {
        this.processFunc = value;
    }

    /**
     * Gets the value of the getParamsFunc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public JAXBElement<UserFunc> getGetParamsFunc() {
        return getParamsFunc;
    }

    /**
     * Sets the value of the getParamsFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserFunc }{@code >}
     *     
     */
    public void setGetParamsFunc(JAXBElement<UserFunc> value) {
        this.getParamsFunc = value;
    }

    /**
     * Gets the value of the attrsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ParamDescriptions }
     *     
     */
    public ParamDescriptions getAttrsDesc() {
        return attrsDesc;
    }

    /**
     * Sets the value of the attrsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamDescriptions }
     *     
     */
    public void setAttrsDesc(ParamDescriptions value) {
        this.attrsDesc = value;
    }

    /**
     * Gets the value of the initPhaseGuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInitPhaseGuid() {
        return initPhaseGuid;
    }

    /**
     * Sets the value of the initPhaseGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInitPhaseGuid(JAXBElement<String> value) {
        this.initPhaseGuid = value;
    }

    /**
     * Gets the value of the operListGuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperListGuid() {
        return operListGuid;
    }

    /**
     * Sets the value of the operListGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperListGuid(JAXBElement<String> value) {
        this.operListGuid = value;
    }

    /**
     * Gets the value of the finishedShowDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getFinishedShowDays() {
        return finishedShowDays;
    }

    /**
     * Sets the value of the finishedShowDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setFinishedShowDays(JAXBElement<Long> value) {
        this.finishedShowDays = value;
    }

    /**
     * Gets the value of the finishedStoreDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getFinishedStoreDays() {
        return finishedStoreDays;
    }

    /**
     * Sets the value of the finishedStoreDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setFinishedStoreDays(JAXBElement<Long> value) {
        this.finishedStoreDays = value;
    }

    /**
     * Gets the value of the instName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstName() {
        return instName;
    }

    /**
     * Sets the value of the instName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstName(String value) {
        this.instName = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the parentGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentGuid() {
        return parentGuid;
    }

    /**
     * Sets the value of the parentGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentGuid(String value) {
        this.parentGuid = value;
    }

    /**
     * Gets the value of the isAbstract property.
     * 
     */
    public boolean isIsAbstract() {
        return isAbstract;
    }

    /**
     * Sets the value of the isAbstract property.
     * 
     */
    public void setIsAbstract(boolean value) {
        this.isAbstract = value;
    }

    /**
     * Gets the value of the contextType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextType() {
        return contextType;
    }

    /**
     * Sets the value of the contextType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextType(String value) {
        this.contextType = value;
    }

    /**
     * Gets the value of the isPhaseSetDefined property.
     * 
     */
    public boolean isIsPhaseSetDefined() {
        return isPhaseSetDefined;
    }

    /**
     * Sets the value of the isPhaseSetDefined property.
     * 
     */
    public void setIsPhaseSetDefined(boolean value) {
        this.isPhaseSetDefined = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Param" type="{http://schemas.tranzaxis.com/applications.xsd}ApplicationTypeParam" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "param"
    })
    public static class Params {

        @XmlElement(name = "Param")
        protected List<ApplicationTypeParam> param;

        /**
         * Gets the value of the param property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the param property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParam().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ApplicationTypeParam }
         * 
         * 
         */
        public List<ApplicationTypeParam> getParam() {
            if (param == null) {
                param = new ArrayList<ApplicationTypeParam>();
            }
            return this.param;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ApplicationPhase" type="{http://schemas.tranzaxis.com/applications.xsd}ApplicationPhase" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "applicationPhase"
    })
    public static class Phases {

        @XmlElement(name = "ApplicationPhase")
        protected List<ApplicationPhase> applicationPhase;

        /**
         * Gets the value of the applicationPhase property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the applicationPhase property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getApplicationPhase().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ApplicationPhase }
         * 
         * 
         */
        public List<ApplicationPhase> getApplicationPhase() {
            if (applicationPhase == null) {
                applicationPhase = new ArrayList<ApplicationPhase>();
            }
            return this.applicationPhase;
        }

    }

}
