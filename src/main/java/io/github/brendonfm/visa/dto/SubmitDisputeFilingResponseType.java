//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitDisputeFilingResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitDisputeFilingResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber" minOccurs="0"/>
 *         &lt;element name="DisputeFilingInfo" type="{http://www.visa.com/ROLSI}DisputeFilingInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DocIdList" type="{http://www.visa.com/ROLSI}DocIdListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitDisputeFilingResponseType", propOrder = {
    "visaCaseNumber",
    "disputeFilingInfo",
    "docIdList"
})
public class SubmitDisputeFilingResponseType {

    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "DisputeFilingInfo")
    protected List<DisputeFilingInfoType> disputeFilingInfo;
    @XmlElement(name = "DocIdList")
    protected DocIdListType docIdList;

    /**
     * Gets the value of the visaCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisaCaseNumber() {
        return visaCaseNumber;
    }

    /**
     * Sets the value of the visaCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisaCaseNumber(Long value) {
        this.visaCaseNumber = value;
    }

    /**
     * Gets the value of the disputeFilingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disputeFilingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisputeFilingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeFilingInfoType }
     * 
     * 
     */
    public List<DisputeFilingInfoType> getDisputeFilingInfo() {
        if (disputeFilingInfo == null) {
            disputeFilingInfo = new ArrayList<DisputeFilingInfoType>();
        }
        return this.disputeFilingInfo;
    }

    /**
     * Gets the value of the docIdList property.
     * 
     * @return
     *     possible object is
     *     {@link DocIdListType }
     *     
     */
    public DocIdListType getDocIdList() {
        return docIdList;
    }

    /**
     * Sets the value of the docIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocIdListType }
     *     
     */
    public void setDocIdList(DocIdListType value) {
        this.docIdList = value;
    }

}
