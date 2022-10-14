
package org.radixware.schemas.eas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Context complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Context"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="TreePath"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;choice&gt;
 *                       &lt;element name="RootItem"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;attribute name="RootId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                               &lt;attribute name="ExplorerItemId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                             &lt;/restriction&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                       &lt;element name="EdPresExplrItem"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;attribute name="ClassId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                               &lt;attribute name="EditorPresentationId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                               &lt;attribute name="ExplorerItemId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                               &lt;attribute name="ParentPid" use="required" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
 *                             &lt;/restriction&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                     &lt;/choice&gt;
 *                     &lt;element name="FilterList" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Filter" maxOccurs="unbounded"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Filter"&gt;
 *                                       &lt;attribute name="ExplorerItemId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                                     &lt;/extension&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ObjectProperty"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Object" type="{http://schemas.radixware.org/eas.xsd}Object"/&gt;
 *                     &lt;element name="ObjectContext" type="{http://schemas.radixware.org/eas.xsd}Context" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="EditorPresentationId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                   &lt;attribute name="PropertyId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="FormProperty"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Form" type="{http://schemas.radixware.org/eas.xsd}Form"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="PropertyId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ReportProperty"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Report" type="{http://schemas.radixware.org/eas.xsd}Report"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="PropertyId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Selector"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="ClassId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                   &lt;attribute name="PresentationId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Editor"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="ClassId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                   &lt;attribute name="PresentationId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ParentModelList" type="{http://schemas.radixware.org/eas.xsd}ParentModelList"/&gt;
 *         &lt;element name="GroupProperties" type="{http://schemas.radixware.org/eas.xsd}PropertyList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Context", propOrder = {
    "treePath",
    "objectProperty",
    "formProperty",
    "reportProperty",
    "selector",
    "editor",
    "parentModelList",
    "groupProperties"
})
public class Context {

    @XmlElement(name = "TreePath")
    protected Context.TreePath treePath;
    @XmlElement(name = "ObjectProperty")
    protected Context.ObjectProperty objectProperty;
    @XmlElement(name = "FormProperty")
    protected Context.FormProperty formProperty;
    @XmlElement(name = "ReportProperty")
    protected Context.ReportProperty reportProperty;
    @XmlElement(name = "Selector")
    protected Context.Selector selector;
    @XmlElement(name = "Editor")
    protected Context.Editor editor;
    @XmlElement(name = "ParentModelList", required = true)
    protected ParentModelList parentModelList;
    @XmlElement(name = "GroupProperties")
    protected PropertyList groupProperties;

    /**
     * Gets the value of the treePath property.
     * 
     * @return
     *     possible object is
     *     {@link Context.TreePath }
     *     
     */
    public Context.TreePath getTreePath() {
        return treePath;
    }

    /**
     * Sets the value of the treePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context.TreePath }
     *     
     */
    public void setTreePath(Context.TreePath value) {
        this.treePath = value;
    }

    /**
     * Gets the value of the objectProperty property.
     * 
     * @return
     *     possible object is
     *     {@link Context.ObjectProperty }
     *     
     */
    public Context.ObjectProperty getObjectProperty() {
        return objectProperty;
    }

    /**
     * Sets the value of the objectProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context.ObjectProperty }
     *     
     */
    public void setObjectProperty(Context.ObjectProperty value) {
        this.objectProperty = value;
    }

    /**
     * Gets the value of the formProperty property.
     * 
     * @return
     *     possible object is
     *     {@link Context.FormProperty }
     *     
     */
    public Context.FormProperty getFormProperty() {
        return formProperty;
    }

    /**
     * Sets the value of the formProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context.FormProperty }
     *     
     */
    public void setFormProperty(Context.FormProperty value) {
        this.formProperty = value;
    }

    /**
     * Gets the value of the reportProperty property.
     * 
     * @return
     *     possible object is
     *     {@link Context.ReportProperty }
     *     
     */
    public Context.ReportProperty getReportProperty() {
        return reportProperty;
    }

    /**
     * Sets the value of the reportProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context.ReportProperty }
     *     
     */
    public void setReportProperty(Context.ReportProperty value) {
        this.reportProperty = value;
    }

    /**
     * Gets the value of the selector property.
     * 
     * @return
     *     possible object is
     *     {@link Context.Selector }
     *     
     */
    public Context.Selector getSelector() {
        return selector;
    }

    /**
     * Sets the value of the selector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context.Selector }
     *     
     */
    public void setSelector(Context.Selector value) {
        this.selector = value;
    }

    /**
     * Gets the value of the editor property.
     * 
     * @return
     *     possible object is
     *     {@link Context.Editor }
     *     
     */
    public Context.Editor getEditor() {
        return editor;
    }

    /**
     * Sets the value of the editor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context.Editor }
     *     
     */
    public void setEditor(Context.Editor value) {
        this.editor = value;
    }

    /**
     * Gets the value of the parentModelList property.
     * 
     * @return
     *     possible object is
     *     {@link ParentModelList }
     *     
     */
    public ParentModelList getParentModelList() {
        return parentModelList;
    }

    /**
     * Sets the value of the parentModelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentModelList }
     *     
     */
    public void setParentModelList(ParentModelList value) {
        this.parentModelList = value;
    }

    /**
     * Gets the value of the groupProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyList }
     *     
     */
    public PropertyList getGroupProperties() {
        return groupProperties;
    }

    /**
     * Sets the value of the groupProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyList }
     *     
     */
    public void setGroupProperties(PropertyList value) {
        this.groupProperties = value;
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
     *       &lt;attribute name="ClassId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *       &lt;attribute name="PresentationId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Editor {

        @XmlAttribute(name = "ClassId", required = true)
        protected String classId;
        @XmlAttribute(name = "PresentationId", required = true)
        protected String presentationId;

        /**
         * Gets the value of the classId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassId() {
            return classId;
        }

        /**
         * Sets the value of the classId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassId(String value) {
            this.classId = value;
        }

        /**
         * Gets the value of the presentationId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPresentationId() {
            return presentationId;
        }

        /**
         * Sets the value of the presentationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPresentationId(String value) {
            this.presentationId = value;
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
     *         &lt;element name="Form" type="{http://schemas.radixware.org/eas.xsd}Form"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="PropertyId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "form"
    })
    public static class FormProperty {

        @XmlElement(name = "Form", required = true)
        protected Form form;
        @XmlAttribute(name = "PropertyId", required = true)
        protected String propertyId;

        /**
         * Gets the value of the form property.
         * 
         * @return
         *     possible object is
         *     {@link Form }
         *     
         */
        public Form getForm() {
            return form;
        }

        /**
         * Sets the value of the form property.
         * 
         * @param value
         *     allowed object is
         *     {@link Form }
         *     
         */
        public void setForm(Form value) {
            this.form = value;
        }

        /**
         * Gets the value of the propertyId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertyId() {
            return propertyId;
        }

        /**
         * Sets the value of the propertyId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertyId(String value) {
            this.propertyId = value;
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
     *         &lt;element name="Object" type="{http://schemas.radixware.org/eas.xsd}Object"/&gt;
     *         &lt;element name="ObjectContext" type="{http://schemas.radixware.org/eas.xsd}Context" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="EditorPresentationId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *       &lt;attribute name="PropertyId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "object",
        "objectContext"
    })
    public static class ObjectProperty {

        @XmlElement(name = "Object", required = true)
        protected Object object;
        @XmlElement(name = "ObjectContext")
        protected Context objectContext;
        @XmlAttribute(name = "EditorPresentationId", required = true)
        protected String editorPresentationId;
        @XmlAttribute(name = "PropertyId", required = true)
        protected String propertyId;

        /**
         * Gets the value of the object property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getObject() {
            return object;
        }

        /**
         * Sets the value of the object property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setObject(Object value) {
            this.object = value;
        }

        /**
         * Gets the value of the objectContext property.
         * 
         * @return
         *     possible object is
         *     {@link Context }
         *     
         */
        public Context getObjectContext() {
            return objectContext;
        }

        /**
         * Sets the value of the objectContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link Context }
         *     
         */
        public void setObjectContext(Context value) {
            this.objectContext = value;
        }

        /**
         * Gets the value of the editorPresentationId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEditorPresentationId() {
            return editorPresentationId;
        }

        /**
         * Sets the value of the editorPresentationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEditorPresentationId(String value) {
            this.editorPresentationId = value;
        }

        /**
         * Gets the value of the propertyId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertyId() {
            return propertyId;
        }

        /**
         * Sets the value of the propertyId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertyId(String value) {
            this.propertyId = value;
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
     *         &lt;element name="Report" type="{http://schemas.radixware.org/eas.xsd}Report"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="PropertyId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "report"
    })
    public static class ReportProperty {

        @XmlElement(name = "Report", required = true)
        protected Report report;
        @XmlAttribute(name = "PropertyId", required = true)
        protected String propertyId;

        /**
         * Gets the value of the report property.
         * 
         * @return
         *     possible object is
         *     {@link Report }
         *     
         */
        public Report getReport() {
            return report;
        }

        /**
         * Sets the value of the report property.
         * 
         * @param value
         *     allowed object is
         *     {@link Report }
         *     
         */
        public void setReport(Report value) {
            this.report = value;
        }

        /**
         * Gets the value of the propertyId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertyId() {
            return propertyId;
        }

        /**
         * Sets the value of the propertyId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertyId(String value) {
            this.propertyId = value;
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
     *       &lt;attribute name="ClassId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *       &lt;attribute name="PresentationId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Selector {

        @XmlAttribute(name = "ClassId", required = true)
        protected String classId;
        @XmlAttribute(name = "PresentationId", required = true)
        protected String presentationId;

        /**
         * Gets the value of the classId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassId() {
            return classId;
        }

        /**
         * Sets the value of the classId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassId(String value) {
            this.classId = value;
        }

        /**
         * Gets the value of the presentationId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPresentationId() {
            return presentationId;
        }

        /**
         * Sets the value of the presentationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPresentationId(String value) {
            this.presentationId = value;
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
     *         &lt;choice&gt;
     *           &lt;element name="RootItem"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;attribute name="RootId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                   &lt;attribute name="ExplorerItemId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="EdPresExplrItem"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;attribute name="ClassId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                   &lt;attribute name="EditorPresentationId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                   &lt;attribute name="ExplorerItemId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                   &lt;attribute name="ParentPid" use="required" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="FilterList" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Filter" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://schemas.radixware.org/eas.xsd}Filter"&gt;
     *                           &lt;attribute name="ExplorerItemId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "rootItem",
        "edPresExplrItem",
        "filterList"
    })
    public static class TreePath {

        @XmlElement(name = "RootItem")
        protected Context.TreePath.RootItem rootItem;
        @XmlElement(name = "EdPresExplrItem")
        protected Context.TreePath.EdPresExplrItem edPresExplrItem;
        @XmlElement(name = "FilterList")
        protected Context.TreePath.FilterList filterList;

        /**
         * Gets the value of the rootItem property.
         * 
         * @return
         *     possible object is
         *     {@link Context.TreePath.RootItem }
         *     
         */
        public Context.TreePath.RootItem getRootItem() {
            return rootItem;
        }

        /**
         * Sets the value of the rootItem property.
         * 
         * @param value
         *     allowed object is
         *     {@link Context.TreePath.RootItem }
         *     
         */
        public void setRootItem(Context.TreePath.RootItem value) {
            this.rootItem = value;
        }

        /**
         * Gets the value of the edPresExplrItem property.
         * 
         * @return
         *     possible object is
         *     {@link Context.TreePath.EdPresExplrItem }
         *     
         */
        public Context.TreePath.EdPresExplrItem getEdPresExplrItem() {
            return edPresExplrItem;
        }

        /**
         * Sets the value of the edPresExplrItem property.
         * 
         * @param value
         *     allowed object is
         *     {@link Context.TreePath.EdPresExplrItem }
         *     
         */
        public void setEdPresExplrItem(Context.TreePath.EdPresExplrItem value) {
            this.edPresExplrItem = value;
        }

        /**
         * Gets the value of the filterList property.
         * 
         * @return
         *     possible object is
         *     {@link Context.TreePath.FilterList }
         *     
         */
        public Context.TreePath.FilterList getFilterList() {
            return filterList;
        }

        /**
         * Sets the value of the filterList property.
         * 
         * @param value
         *     allowed object is
         *     {@link Context.TreePath.FilterList }
         *     
         */
        public void setFilterList(Context.TreePath.FilterList value) {
            this.filterList = value;
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
         *       &lt;attribute name="ClassId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="EditorPresentationId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="ExplorerItemId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="ParentPid" use="required" type="{http://schemas.radixware.org/types.xsd}SafeStr" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EdPresExplrItem {

            @XmlAttribute(name = "ClassId", required = true)
            protected String classId;
            @XmlAttribute(name = "EditorPresentationId", required = true)
            protected String editorPresentationId;
            @XmlAttribute(name = "ExplorerItemId", required = true)
            protected String explorerItemId;
            @XmlAttribute(name = "ParentPid", required = true)
            protected String parentPid;

            /**
             * Gets the value of the classId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClassId() {
                return classId;
            }

            /**
             * Sets the value of the classId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClassId(String value) {
                this.classId = value;
            }

            /**
             * Gets the value of the editorPresentationId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEditorPresentationId() {
                return editorPresentationId;
            }

            /**
             * Sets the value of the editorPresentationId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEditorPresentationId(String value) {
                this.editorPresentationId = value;
            }

            /**
             * Gets the value of the explorerItemId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExplorerItemId() {
                return explorerItemId;
            }

            /**
             * Sets the value of the explorerItemId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExplorerItemId(String value) {
                this.explorerItemId = value;
            }

            /**
             * Gets the value of the parentPid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParentPid() {
                return parentPid;
            }

            /**
             * Sets the value of the parentPid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParentPid(String value) {
                this.parentPid = value;
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
         *         &lt;element name="Filter" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://schemas.radixware.org/eas.xsd}Filter"&gt;
         *                 &lt;attribute name="ExplorerItemId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
            "filter"
        })
        public static class FilterList {

            @XmlElement(name = "Filter", required = true)
            protected List<Context.TreePath.FilterList.Filter> filter;

            /**
             * Gets the value of the filter property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the filter property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFilter().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Context.TreePath.FilterList.Filter }
             * 
             * 
             */
            public List<Context.TreePath.FilterList.Filter> getFilter() {
                if (filter == null) {
                    filter = new ArrayList<Context.TreePath.FilterList.Filter>();
                }
                return this.filter;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://schemas.radixware.org/eas.xsd}Filter"&gt;
             *       &lt;attribute name="ExplorerItemId" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Filter
                extends org.radixware.schemas.eas.Filter
            {

                @XmlAttribute(name = "ExplorerItemId")
                protected String explorerItemId;

                /**
                 * Gets the value of the explorerItemId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExplorerItemId() {
                    return explorerItemId;
                }

                /**
                 * Sets the value of the explorerItemId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExplorerItemId(String value) {
                    this.explorerItemId = value;
                }

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
         *       &lt;attribute name="RootId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *       &lt;attribute name="ExplorerItemId" use="required" type="{http://schemas.radixware.org/types.xsd}Id" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RootItem {

            @XmlAttribute(name = "RootId", required = true)
            protected String rootId;
            @XmlAttribute(name = "ExplorerItemId", required = true)
            protected String explorerItemId;

            /**
             * Gets the value of the rootId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRootId() {
                return rootId;
            }

            /**
             * Sets the value of the rootId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRootId(String value) {
                this.rootId = value;
            }

            /**
             * Gets the value of the explorerItemId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExplorerItemId() {
                return explorerItemId;
            }

            /**
             * Sets the value of the explorerItemId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExplorerItemId(String value) {
                this.explorerItemId = value;
            }

        }

    }

}
