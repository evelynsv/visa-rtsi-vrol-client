//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FormatUQueueItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormatUQueueItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}BatchQueueItemSID" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}RetrievalRequestID" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}TranDate" minOccurs="0"/>
 *         &lt;element name="ExceptionItemCPD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DaysAged" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DisputeStage" type="{http://www.visa.com/ROLSI}DisputeStageType" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}DisputeAmt" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.visa.com/ROLSI}AccountNumber" minOccurs="0"/>
 *           &lt;group ref="{http://www.visa.com/ROLSI}PANlessFieldGroup" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ARN" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}NetworkID" minOccurs="0"/>
 *         &lt;element name="MultiMatchIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantName" minOccurs="0"/>
 *         &lt;element name="InternalId" type="{http://www.visa.com/ROLSI}InternalId" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}Token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormatUQueueItemType", propOrder = {
    "batchQueueItemSID",
    "retrievalRequestID",
    "tranDate",
    "exceptionItemCPD",
    "daysAged",
    "disputeStage",
    "disputeAmt",
    "reasonCode",
    "reasonCodeDescription",
    "accountNumber",
    "trn",
    "consumerAccountNumber",
    "checkNumber",
    "arn",
    "networkID",
    "multiMatchIndicator",
    "merchantName",
    "internalId",
    "token"
})
@XmlSeeAlso({
    AdviceItemDetailsType.class
})
public class FormatUQueueItemType {

    @XmlElement(name = "BatchQueueItemSID")
    protected Long batchQueueItemSID;
    @XmlElement(name = "RetrievalRequestID")
    protected String retrievalRequestID;
    @XmlElement(name = "TranDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tranDate;
    @XmlElement(name = "ExceptionItemCPD")
    protected String exceptionItemCPD;
    @XmlElement(name = "DaysAged")
    protected BigInteger daysAged;
    @XmlElement(name = "DisputeStage")
    @XmlSchemaType(name = "string")
    protected DisputeStageType disputeStage;
    @XmlElement(name = "DisputeAmt")
    protected AmountType disputeAmt;
    @XmlElement(name = "ReasonCode")
    protected String reasonCode;
    @XmlElement(name = "ReasonCodeDescription")
    protected String reasonCodeDescription;
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
    @XmlElement(name = "NetworkID")
    protected String networkID;
    @XmlElement(name = "MultiMatchIndicator")
    protected Boolean multiMatchIndicator;
    @XmlElement(name = "MerchantName")
    protected String merchantName;
    @XmlElement(name = "InternalId")
    protected InternalId internalId;
    @XmlElement(name = "Token")
    protected String token;

    /**
     * Gets the value of the batchQueueItemSID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBatchQueueItemSID() {
        return batchQueueItemSID;
    }

    /**
     * Sets the value of the batchQueueItemSID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBatchQueueItemSID(Long value) {
        this.batchQueueItemSID = value;
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
     * Gets the value of the tranDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranDate() {
        return tranDate;
    }

    /**
     * Sets the value of the tranDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranDate(XMLGregorianCalendar value) {
        this.tranDate = value;
    }

    /**
     * Gets the value of the exceptionItemCPD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionItemCPD() {
        return exceptionItemCPD;
    }

    /**
     * Sets the value of the exceptionItemCPD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionItemCPD(String value) {
        this.exceptionItemCPD = value;
    }

    /**
     * Gets the value of the daysAged property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaysAged() {
        return daysAged;
    }

    /**
     * Sets the value of the daysAged property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaysAged(BigInteger value) {
        this.daysAged = value;
    }

    /**
     * Gets the value of the disputeStage property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeStageType }
     *     
     */
    public DisputeStageType getDisputeStage() {
        return disputeStage;
    }

    /**
     * Sets the value of the disputeStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeStageType }
     *     
     */
    public void setDisputeStage(DisputeStageType value) {
        this.disputeStage = value;
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
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the reasonCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCodeDescription() {
        return reasonCodeDescription;
    }

    /**
     * Sets the value of the reasonCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCodeDescription(String value) {
        this.reasonCodeDescription = value;
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
     * Gets the value of the multiMatchIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiMatchIndicator() {
        return multiMatchIndicator;
    }

    /**
     * Sets the value of the multiMatchIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiMatchIndicator(Boolean value) {
        this.multiMatchIndicator = value;
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

}