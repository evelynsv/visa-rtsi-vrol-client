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
 * <p>Java class for FormatHQueueItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormatHQueueItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AccountNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}Token" minOccurs="0"/>
 *         &lt;element name="DisputeCategoryCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisputeAmt" type="{http://www.visa.com/ROLSI}AmountType" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberCaseNumber" minOccurs="0"/>
 *         &lt;element name="InternalId" type="{http://www.visa.com/ROLSI}InternalId" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantName" minOccurs="0"/>
 *         &lt;element name="VisaCaseNumber" type="{http://www.visa.com/ROLSI}VisaCaseNumberType" minOccurs="0"/>
 *         &lt;element name="RdrSubmissionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RdrExpiryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RdrStatus" type="{http://www.visa.com/ROLSI}RdrStatusQueueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormatHQueueItemType", propOrder = {
    "accountNumber",
    "token",
    "disputeCategoryCondition",
    "disputeAmt",
    "memberCaseNumber",
    "internalId",
    "merchantName",
    "visaCaseNumber",
    "rdrSubmissionTime",
    "rdrExpiryTime",
    "rdrStatus"
})
public class FormatHQueueItemType {

    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "DisputeCategoryCondition")
    protected String disputeCategoryCondition;
    @XmlElement(name = "DisputeAmt")
    protected AmountType disputeAmt;
    @XmlElement(name = "MemberCaseNumber")
    protected String memberCaseNumber;
    @XmlElement(name = "InternalId")
    protected InternalId internalId;
    @XmlElement(name = "MerchantName")
    protected String merchantName;
    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "RdrSubmissionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rdrSubmissionTime;
    @XmlElement(name = "RdrExpiryTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rdrExpiryTime;
    @XmlElement(name = "RdrStatus")
    @XmlSchemaType(name = "string")
    protected RdrStatusQueueType rdrStatus;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the disputeCategoryCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeCategoryCondition() {
        return disputeCategoryCondition;
    }

    /**
     * Sets the value of the disputeCategoryCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeCategoryCondition(String value) {
        this.disputeCategoryCondition = value;
    }

    /**
     * Gets the value of the disputeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDisputeAmt() {
        return disputeAmt;
    }

    /**
     * Sets the value of the disputeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDisputeAmt(AmountType value) {
        this.disputeAmt = value;
    }

    /**
     * Gets the value of the memberCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberCaseNumber() {
        return memberCaseNumber;
    }

    /**
     * Sets the value of the memberCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberCaseNumber(String value) {
        this.memberCaseNumber = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link InternalId }
     *     
     */
    public InternalId getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalId }
     *     
     */
    public void setInternalId(InternalId value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the merchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Sets the value of the merchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

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
     * Gets the value of the rdrSubmissionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRdrSubmissionTime() {
        return rdrSubmissionTime;
    }

    /**
     * Sets the value of the rdrSubmissionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRdrSubmissionTime(XMLGregorianCalendar value) {
        this.rdrSubmissionTime = value;
    }

    /**
     * Gets the value of the rdrExpiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRdrExpiryTime() {
        return rdrExpiryTime;
    }

    /**
     * Sets the value of the rdrExpiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRdrExpiryTime(XMLGregorianCalendar value) {
        this.rdrExpiryTime = value;
    }

    /**
     * Gets the value of the rdrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RdrStatusQueueType }
     *     
     */
    public RdrStatusQueueType getRdrStatus() {
        return rdrStatus;
    }

    /**
     * Sets the value of the rdrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RdrStatusQueueType }
     *     
     */
    public void setRdrStatus(RdrStatusQueueType value) {
        this.rdrStatus = value;
    }

}
