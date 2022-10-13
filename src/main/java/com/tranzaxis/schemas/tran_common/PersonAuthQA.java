
package com.tranzaxis.schemas.tran_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.common_types.AppEncryptedData;
import com.tranzaxis.schemas.subjects_admin.AuthQA;


/**
 * <p>Java class for PersonAuthQA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonAuthQA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Question" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="Answer" type="{http://schemas.radixware.org/types.xsd}Str" minOccurs="0"/&gt;
 *         &lt;element name="AnswerCrypt" type="{http://schemas.tranzaxis.com/common-types.xsd}AppEncryptedData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://schemas.radixware.org/types.xsd}Int" /&gt;
 *       &lt;attribute name="ToDelete" type="{http://schemas.radixware.org/types.xsd}Bool" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonAuthQA", propOrder = {
    "question",
    "answer",
    "answerCrypt"
})
@XmlSeeAlso({
    AuthQA.class
})
public class PersonAuthQA {

    @XmlElement(name = "Question")
    protected String question;
    @XmlElement(name = "Answer")
    protected String answer;
    @XmlElement(name = "AnswerCrypt")
    protected AppEncryptedData answerCrypt;
    @XmlAttribute(name = "Id")
    protected Long id;
    @XmlAttribute(name = "ToDelete")
    protected Boolean toDelete;

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestion(String value) {
        this.question = value;
    }

    /**
     * Gets the value of the answer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswer(String value) {
        this.answer = value;
    }

    /**
     * Gets the value of the answerCrypt property.
     * 
     * @return
     *     possible object is
     *     {@link AppEncryptedData }
     *     
     */
    public AppEncryptedData getAnswerCrypt() {
        return answerCrypt;
    }

    /**
     * Sets the value of the answerCrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppEncryptedData }
     *     
     */
    public void setAnswerCrypt(AppEncryptedData value) {
        this.answerCrypt = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the toDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToDelete() {
        return toDelete;
    }

    /**
     * Sets the value of the toDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToDelete(Boolean value) {
        this.toDelete = value;
    }

}
