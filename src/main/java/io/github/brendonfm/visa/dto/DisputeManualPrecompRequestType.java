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
 * <p>Java class for DisputeManualPrecompRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeManualPrecompRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AccountNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AccountType" minOccurs="0"/>
 *         &lt;element name="AccountType1Identification" type="{http://www.visa.com/ROLSI}AccountType1IdentificationType" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcquirerBID" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcquirerBIN" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}TransactionAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ARN" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}BusinessAppId" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CPD" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}DCCInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ECMOTO" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MCC" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantCity" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantCountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantCountrySubEntityCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantName" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantPostalCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}NetworkID" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ProcessingCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ReimbursementAttribute" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}RetrievalReferenceNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}SystemTraceAuditNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}Token" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}TokenAssuranceLevel" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}TransactionCategory" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}TranDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeManualPrecompRequestType", propOrder = {
    "accountNumber",
    "accountType",
    "accountType1Identification",
    "acquirerBID",
    "acquirerBIN",
    "transactionAmount",
    "arn",
    "businessAppId",
    "cpd",
    "dccInd",
    "ecmoto",
    "mcc",
    "merchantCity",
    "merchantCountryCode",
    "merchantCountrySubEntityCode",
    "merchantName",
    "merchantPostalCode",
    "networkID",
    "processingCode",
    "reimbursementAttribute",
    "retrievalReferenceNumber",
    "systemTraceAuditNumber",
    "token",
    "tokenAssuranceLevel",
    "transactionCategory",
    "tranDate"
})
public class DisputeManualPrecompRequestType {

    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "AccountType")
    protected String accountType;
    @XmlElement(name = "AccountType1Identification")
    protected String accountType1Identification;
    @XmlElement(name = "AcquirerBID")
    protected String acquirerBID;
    @XmlElement(name = "AcquirerBIN")
    protected String acquirerBIN;
    @XmlElement(name = "TransactionAmount")
    protected AmountType transactionAmount;
    @XmlElement(name = "ARN")
    protected String arn;
    @XmlElement(name = "BusinessAppId")
    protected String businessAppId;
    @XmlElement(name = "CPD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cpd;
    @XmlElement(name = "DCCInd")
    protected String dccInd;
    @XmlElement(name = "ECMOTO")
    protected String ecmoto;
    @XmlElement(name = "MCC")
    protected String mcc;
    @XmlElement(name = "MerchantCity")
    protected String merchantCity;
    @XmlElement(name = "MerchantCountryCode")
    protected String merchantCountryCode;
    @XmlElement(name = "MerchantCountrySubEntityCode")
    protected String merchantCountrySubEntityCode;
    @XmlElement(name = "MerchantName")
    protected String merchantName;
    @XmlElement(name = "MerchantPostalCode")
    protected String merchantPostalCode;
    @XmlElement(name = "NetworkID")
    protected String networkID;
    @XmlElement(name = "ProcessingCode")
    protected String processingCode;
    @XmlElement(name = "ReimbursementAttribute")
    protected String reimbursementAttribute;
    @XmlElement(name = "RetrievalReferenceNumber")
    protected String retrievalReferenceNumber;
    @XmlElement(name = "SystemTraceAuditNumber")
    protected String systemTraceAuditNumber;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "TokenAssuranceLevel")
    protected String tokenAssuranceLevel;
    @XmlElement(name = "TransactionCategory")
    @XmlSchemaType(name = "string")
    protected ManualTranCatType transactionCategory;
    @XmlElement(name = "TranDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tranDate;

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
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the accountType1Identification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType1Identification() {
        return accountType1Identification;
    }

    /**
     * Sets the value of the accountType1Identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType1Identification(String value) {
        this.accountType1Identification = value;
    }

    /**
     * Gets the value of the acquirerBID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerBID() {
        return acquirerBID;
    }

    /**
     * Sets the value of the acquirerBID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerBID(String value) {
        this.acquirerBID = value;
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
     * Gets the value of the transactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTransactionAmount(AmountType value) {
        this.transactionAmount = value;
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
     * Gets the value of the businessAppId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessAppId() {
        return businessAppId;
    }

    /**
     * Sets the value of the businessAppId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessAppId(String value) {
        this.businessAppId = value;
    }

    /**
     * Gets the value of the cpd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCPD() {
        return cpd;
    }

    /**
     * Sets the value of the cpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCPD(XMLGregorianCalendar value) {
        this.cpd = value;
    }

    /**
     * Gets the value of the dccInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCInd() {
        return dccInd;
    }

    /**
     * Sets the value of the dccInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCInd(String value) {
        this.dccInd = value;
    }

    /**
     * Gets the value of the ecmoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECMOTO() {
        return ecmoto;
    }

    /**
     * Sets the value of the ecmoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECMOTO(String value) {
        this.ecmoto = value;
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
     * Gets the value of the merchantCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCity() {
        return merchantCity;
    }

    /**
     * Sets the value of the merchantCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCity(String value) {
        this.merchantCity = value;
    }

    /**
     * Gets the value of the merchantCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCountryCode() {
        return merchantCountryCode;
    }

    /**
     * Sets the value of the merchantCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCountryCode(String value) {
        this.merchantCountryCode = value;
    }

    /**
     * Gets the value of the merchantCountrySubEntityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCountrySubEntityCode() {
        return merchantCountrySubEntityCode;
    }

    /**
     * Sets the value of the merchantCountrySubEntityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCountrySubEntityCode(String value) {
        this.merchantCountrySubEntityCode = value;
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
     * Gets the value of the merchantPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantPostalCode() {
        return merchantPostalCode;
    }

    /**
     * Sets the value of the merchantPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantPostalCode(String value) {
        this.merchantPostalCode = value;
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
     * Gets the value of the processingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingCode() {
        return processingCode;
    }

    /**
     * Sets the value of the processingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingCode(String value) {
        this.processingCode = value;
    }

    /**
     * Gets the value of the reimbursementAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReimbursementAttribute() {
        return reimbursementAttribute;
    }

    /**
     * Sets the value of the reimbursementAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReimbursementAttribute(String value) {
        this.reimbursementAttribute = value;
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
     * Gets the value of the tokenAssuranceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenAssuranceLevel() {
        return tokenAssuranceLevel;
    }

    /**
     * Sets the value of the tokenAssuranceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenAssuranceLevel(String value) {
        this.tokenAssuranceLevel = value;
    }

    /**
     * Gets the value of the transactionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ManualTranCatType }
     *     
     */
    public ManualTranCatType getTransactionCategory() {
        return transactionCategory;
    }

    /**
     * Sets the value of the transactionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManualTranCatType }
     *     
     */
    public void setTransactionCategory(ManualTranCatType value) {
        this.transactionCategory = value;
    }

    /**
     * Transaction date or purchase date. (yyyy-mm-dd)
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

}
