
package com.tranzaxis.schemas.tran;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tranzaxis.schemas.issue_admin.IssueInfo;


/**
 * <p>Java class for IssuesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuesInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Issue" type="{http://schemas.tranzaxis.com/issue-admin.xsd}IssueInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuesInfo", propOrder = {
    "issue"
})
public class IssuesInfo {

    @XmlElement(name = "Issue")
    protected List<IssueInfo> issue;

    /**
     * Gets the value of the issue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssueInfo }
     * 
     * 
     */
    public List<IssueInfo> getIssue() {
        if (issue == null) {
            issue = new ArrayList<IssueInfo>();
        }
        return this.issue;
    }

}
