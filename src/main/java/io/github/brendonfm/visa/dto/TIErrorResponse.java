//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.visa.com/ROLSI}TranInquiryRequestGroup"/>
 *         &lt;element name="Errors">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cardNumber",
    "token",
    "senderAccountNumber",
    "terminalId",
    "transactionID",
    "arn",
    "consumerAccountNumber",
    "trn",
    "startDate",
    "endDate",
    "includeInd",
    "includeCreditsOrReversalsOrAdjustmentsInd",
    "tranStatus",
    "transactionTypeOption",
    "transactionType",
    "showDuplicateAuthWithSameTranIDInd",
    "authCode",
    "tranAmountRange1",
    "tranAmountRange2",
    "retrievalReferenceNumber",
    "networkID",
    "mcc",
    "errors"
})
@XmlRootElement(name = "TIErrorResponse")
public class TIErrorResponse {

    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "SenderAccountNumber")
    protected String senderAccountNumber;
    @XmlElement(name = "TerminalId")
    protected String terminalId;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "ARN")
    protected String arn;
    @XmlElement(name = "ConsumerAccountNumber")
    protected String consumerAccountNumber;
    @XmlElement(name = "TRN")
    protected String trn;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "IncludeInd")
    @XmlSchemaType(name = "string")
    protected AdditionalSearchCriteriaInclude includeInd;
    @XmlElement(name = "IncludeCreditsOrReversalsOrAdjustmentsInd")
    protected Boolean includeCreditsOrReversalsOrAdjustmentsInd;
    @XmlElement(name = "TranStatus")
    protected String tranStatus;
    @XmlElement(name = "TransactionTypeOption")
    protected String transactionTypeOption;
    @XmlElement(name = "TransactionType")
    protected String transactionType;
    @XmlElement(name = "ShowDuplicateAuthWithSameTranIDInd")
    protected Boolean showDuplicateAuthWithSameTranIDInd;
    @XmlElement(name = "AuthCode")
    protected String authCode;
    @XmlElement(name = "TranAmountRange1")
    protected BigDecimal tranAmountRange1;
    @XmlElement(name = "TranAmountRange2")
    protected BigDecimal tranAmountRange2;
    @XmlElement(name = "RetrievalReferenceNumber")
    protected String retrievalReferenceNumber;
    @XmlElement(name = "NetworkID")
    protected String networkID;
    @XmlElement(name = "MCC")
    protected String mcc;
    @XmlElement(name = "Errors", required = true)
    protected TIErrorResponse.Errors errors;

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
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
     * Gets the value of the senderAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAccountNumber() {
        return senderAccountNumber;
    }

    /**
     * Sets the value of the senderAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAccountNumber(String value) {
        this.senderAccountNumber = value;
    }

    /**
     * Gets the value of the terminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalId(String value) {
        this.terminalId = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the includeInd property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalSearchCriteriaInclude }
     *     
     */
    public AdditionalSearchCriteriaInclude getIncludeInd() {
        return includeInd;
    }

    /**
     * Sets the value of the includeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalSearchCriteriaInclude }
     *     
     */
    public void setIncludeInd(AdditionalSearchCriteriaInclude value) {
        this.includeInd = value;
    }

    /**
     * Gets the value of the includeCreditsOrReversalsOrAdjustmentsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCreditsOrReversalsOrAdjustmentsInd() {
        return includeCreditsOrReversalsOrAdjustmentsInd;
    }

    /**
     * Sets the value of the includeCreditsOrReversalsOrAdjustmentsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCreditsOrReversalsOrAdjustmentsInd(Boolean value) {
        this.includeCreditsOrReversalsOrAdjustmentsInd = value;
    }

    /**
     * Gets the value of the tranStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranStatus() {
        return tranStatus;
    }

    /**
     * Sets the value of the tranStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranStatus(String value) {
        this.tranStatus = value;
    }

    /**
     * Gets the value of the transactionTypeOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTypeOption() {
        return transactionTypeOption;
    }

    /**
     * Sets the value of the transactionTypeOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTypeOption(String value) {
        this.transactionTypeOption = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the showDuplicateAuthWithSameTranIDInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowDuplicateAuthWithSameTranIDInd() {
        return showDuplicateAuthWithSameTranIDInd;
    }

    /**
     * Sets the value of the showDuplicateAuthWithSameTranIDInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowDuplicateAuthWithSameTranIDInd(Boolean value) {
        this.showDuplicateAuthWithSameTranIDInd = value;
    }

    /**
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the tranAmountRange1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTranAmountRange1() {
        return tranAmountRange1;
    }

    /**
     * Sets the value of the tranAmountRange1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTranAmountRange1(BigDecimal value) {
        this.tranAmountRange1 = value;
    }

    /**
     * Gets the value of the tranAmountRange2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTranAmountRange2() {
        return tranAmountRange2;
    }

    /**
     * Sets the value of the tranAmountRange2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTranAmountRange2(BigDecimal value) {
        this.tranAmountRange2 = value;
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
     * Gets the value of the networkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkID() {
        return networkID;
    }

    /**
     * Sets the value of the networkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkID(String value) {
        this.networkID = value;
    }

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCC() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCC(String value) {
        this.mcc = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link TIErrorResponse.Errors }
     *     
     */
    public TIErrorResponse.Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIErrorResponse.Errors }
     *     
     */
    public void setErrors(TIErrorResponse.Errors value) {
        this.errors = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class Errors {

        @XmlElement(name = "Description", required = true)
        protected List<String> description;

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDescription() {
            if (description == null) {
                description = new ArrayList<String>();
            }
            return this.description;
        }

    }

}
