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


/**
 * <p>Java class for ContinueDisputeRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContinueDisputeRequestBodyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.visa.com/ROLSI}RequestBodyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.visa.com/ROLSI}CaseMatchingInfoGroup"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}QnSubmitButton" minOccurs="0"/>
 *         &lt;element name="QnSubmitButtonOnDispute" type="{http://www.visa.com/ROLSI}QnSubmitButtonType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContinueDisputeRequestBodyType", propOrder = {
    "memberCaseNumber",
    "visaCaseNumber",
    "accountNumber",
    "trn",
    "consumerAccountNumber",
    "checkNumber",
    "arn",
    "disputeGroupCode",
    "disputeReasonCode",
    "disputeCategory",
    "transaction",
    "retrievalRequestID",
    "acquirerBIN",
    "retrievalReferenceNumber",
    "systemTraceAuditNumber",
    "quickFormID",
    "qnSubmitButton",
    "qnSubmitButtonOnDispute"
})
public class ContinueDisputeRequestBodyType
    extends RequestBodyType
{

    @XmlElement(name = "MemberCaseNumber")
    protected String memberCaseNumber;
    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "TRN")
    protected String trn;
    @XmlElement(name = "ConsumerAccountNumber")
    protected String consumerAccountNumber;
    @XmlElement(name = "CheckNumber")
    protected String checkNumber;
    @XmlElement(name = "ARN")
    protected String arn;
    @XmlElement(name = "DisputeGroupCode")
    protected String disputeGroupCode;
    @XmlElement(name = "DisputeReasonCode")
    protected String disputeReasonCode;
    @XmlElement(name = "DisputeCategory")
    protected DisputeCategoryType disputeCategory;
    @XmlElement(name = "Transaction")
    protected TransactionType transaction;
    @XmlElement(name = "RetrievalRequestID")
    protected String retrievalRequestID;
    @XmlElement(name = "AcquirerBIN")
    protected String acquirerBIN;
    @XmlElement(name = "RetrievalReferenceNumber")
    protected String retrievalReferenceNumber;
    @XmlElement(name = "SystemTraceAuditNumber")
    protected String systemTraceAuditNumber;
    @XmlElement(name = "QuickFormID")
    protected Long quickFormID;
    @XmlElement(name = "QnSubmitButton")
    @XmlSchemaType(name = "string")
    protected QnSubmitButtonType qnSubmitButton;
    @XmlElement(name = "QnSubmitButtonOnDispute")
    @XmlSchemaType(name = "string")
    protected QnSubmitButtonType qnSubmitButtonOnDispute;

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
     * Gets the value of the trn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRN() {
        return trn;
    }

    /**
     * Sets the value of the trn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRN(String value) {
        this.trn = value;
    }

    /**
     * Gets the value of the consumerAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerAccountNumber() {
        return consumerAccountNumber;
    }

    /**
     * Sets the value of the consumerAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerAccountNumber(String value) {
        this.consumerAccountNumber = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the arn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARN() {
        return arn;
    }

    /**
     * Sets the value of the arn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARN(String value) {
        this.arn = value;
    }

    /**
     * Gets the value of the disputeGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeGroupCode() {
        return disputeGroupCode;
    }

    /**
     * Sets the value of the disputeGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeGroupCode(String value) {
        this.disputeGroupCode = value;
    }

    /**
     * Gets the value of the disputeReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeReasonCode() {
        return disputeReasonCode;
    }

    /**
     * Sets the value of the disputeReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeReasonCode(String value) {
        this.disputeReasonCode = value;
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
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransaction(TransactionType value) {
        this.transaction = value;
    }

    /**
     * Gets the value of the retrievalRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrievalRequestID() {
        return retrievalRequestID;
    }

    /**
     * Sets the value of the retrievalRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetrievalRequestID(String value) {
        this.retrievalRequestID = value;
    }

    /**
     * Gets the value of the acquirerBIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerBIN() {
        return acquirerBIN;
    }

    /**
     * Sets the value of the acquirerBIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerBIN(String value) {
        this.acquirerBIN = value;
    }

    /**
     * Gets the value of the retrievalReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrievalReferenceNumber() {
        return retrievalReferenceNumber;
    }

    /**
     * Sets the value of the retrievalReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetrievalReferenceNumber(String value) {
        this.retrievalReferenceNumber = value;
    }

    /**
     * Gets the value of the systemTraceAuditNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemTraceAuditNumber() {
        return systemTraceAuditNumber;
    }

    /**
     * Sets the value of the systemTraceAuditNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemTraceAuditNumber(String value) {
        this.systemTraceAuditNumber = value;
    }

    /**
     * Gets the value of the quickFormID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuickFormID() {
        return quickFormID;
    }

    /**
     * Sets the value of the quickFormID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuickFormID(Long value) {
        this.quickFormID = value;
    }

    /**
     * Gets the value of the qnSubmitButton property.
     * 
     * @return
     *     possible object is
     *     {@link QnSubmitButtonType }
     *     
     */
    public QnSubmitButtonType getQnSubmitButton() {
        return qnSubmitButton;
    }

    /**
     * Sets the value of the qnSubmitButton property.
     * 
     * @param value
     *     allowed object is
     *     {@link QnSubmitButtonType }
     *     
     */
    public void setQnSubmitButton(QnSubmitButtonType value) {
        this.qnSubmitButton = value;
    }

    /**
     * Gets the value of the qnSubmitButtonOnDispute property.
     * 
     * @return
     *     possible object is
     *     {@link QnSubmitButtonType }
     *     
     */
    public QnSubmitButtonType getQnSubmitButtonOnDispute() {
        return qnSubmitButtonOnDispute;
    }

    /**
     * Sets the value of the qnSubmitButtonOnDispute property.
     * 
     * @param value
     *     allowed object is
     *     {@link QnSubmitButtonType }
     *     
     */
    public void setQnSubmitButtonOnDispute(QnSubmitButtonType value) {
        this.qnSubmitButtonOnDispute = value;
    }

}
