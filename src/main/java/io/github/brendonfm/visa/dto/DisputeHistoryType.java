//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DisputeHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubmittedBy" type="{http://www.visa.com/ROLSI}OrgDisputeType" minOccurs="0"/>
 *         &lt;element name="DisputeCategory" type="{http://www.visa.com/ROLSI}DisputeCategoryType" minOccurs="0"/>
 *         &lt;element name="DisputeItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecallInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ResponseCode" minOccurs="0"/>
 *         &lt;element name="EventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserOrOrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisputeItemID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeHistoryType", propOrder = {
    "submittedBy",
    "disputeCategory",
    "disputeItemType",
    "recallInd",
    "responseCode",
    "eventDate",
    "userOrOrgName",
    "disputeItemID"
})
public class DisputeHistoryType {

    @XmlElement(name = "SubmittedBy")
    @XmlSchemaType(name = "string")
    protected OrgDisputeType submittedBy;
    @XmlElement(name = "DisputeCategory")
    protected DisputeCategoryType disputeCategory;
    @XmlElement(name = "DisputeItemType")
    protected String disputeItemType;
    @XmlElement(name = "RecallInd")
    protected Boolean recallInd;
    @XmlElement(name = "ResponseCode")
    protected String responseCode;
    @XmlElement(name = "EventDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "UserOrOrgName")
    protected String userOrOrgName;
    @XmlElement(name = "DisputeItemID")
    protected Long disputeItemID;

    /**
     * Gets the value of the submittedBy property.
     * 
     * @return
     *     possible object is
     *     {@link OrgDisputeType }
     *     
     */
    public OrgDisputeType getSubmittedBy() {
        return submittedBy;
    }

    /**
     * Sets the value of the submittedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgDisputeType }
     *     
     */
    public void setSubmittedBy(OrgDisputeType value) {
        this.submittedBy = value;
    }

    /**
     * Gets the value of the disputeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeCategoryType }
     *     
     */
    public DisputeCategoryType getDisputeCategory() {
        return disputeCategory;
    }

    /**
     * Sets the value of the disputeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeCategoryType }
     *     
     */
    public void setDisputeCategory(DisputeCategoryType value) {
        this.disputeCategory = value;
    }

    /**
     * Gets the value of the disputeItemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeItemType() {
        return disputeItemType;
    }

    /**
     * Sets the value of the disputeItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeItemType(String value) {
        this.disputeItemType = value;
    }

    /**
     * Gets the value of the recallInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecallInd() {
        return recallInd;
    }

    /**
     * Sets the value of the recallInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecallInd(Boolean value) {
        this.recallInd = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the userOrOrgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserOrOrgName() {
        return userOrOrgName;
    }

    /**
     * Sets the value of the userOrOrgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserOrOrgName(String value) {
        this.userOrOrgName = value;
    }

    /**
     * Gets the value of the disputeItemID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisputeItemID() {
        return disputeItemID;
    }

    /**
     * Sets the value of the disputeItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisputeItemID(Long value) {
        this.disputeItemID = value;
    }

}
