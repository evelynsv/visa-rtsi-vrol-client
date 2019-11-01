//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GMFPResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GMFPResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantName" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantCity" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MerchantCountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AccountNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}Token" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}OrigTranCPD" minOccurs="0"/>
 *         &lt;element name="TranDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DestinationAmount" type="{http://www.visa.com/ROLSI}AmountType" minOccurs="0"/>
 *         &lt;element name="USDAmount" type="{http://www.visa.com/ROLSI}AmountType" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}TransactionID" minOccurs="0"/>
 *         &lt;element name="ARN" type="{http://www.visa.com/ROLSI}ARNType" minOccurs="0"/>
 *         &lt;element name="ECMOTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PosEntryModeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FraudPostDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DaysToAct" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MatchedCases" type="{http://www.visa.com/ROLSI}MatchedCasesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}GMFPStatus" minOccurs="0"/>
 *         &lt;element name="ExceptionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuerBID" type="{http://www.visa.com/ROLSI}BIDType" minOccurs="0"/>
 *         &lt;element name="IssuerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IssuerCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FraudCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateAdded" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GMFPResponseType", propOrder = {
    "merchantName",
    "merchantCity",
    "merchantCountryCode",
    "accountNumber",
    "token",
    "origTranCPD",
    "tranDate",
    "destinationAmount",
    "usdAmount",
    "transactionID",
    "arn",
    "ecmoto",
    "posEntryModeCd",
    "mcc",
    "fraudPostDate",
    "daysToAct",
    "matchedCases",
    "gmfpStatus",
    "exceptionReason",
    "issuerBID",
    "issuerName",
    "issuerCountryCode",
    "fraudCode",
    "dateAdded"
})
public class GMFPResponseType {

    @XmlElement(name = "MerchantName")
    protected String merchantName;
    @XmlElement(name = "MerchantCity")
    protected String merchantCity;
    @XmlElement(name = "MerchantCountryCode")
    protected String merchantCountryCode;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "OrigTranCPD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar origTranCPD;
    @XmlElement(name = "TranDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tranDate;
    @XmlElement(name = "DestinationAmount")
    protected AmountType destinationAmount;
    @XmlElement(name = "USDAmount")
    protected AmountType usdAmount;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "ARN")
    protected String arn;
    @XmlElement(name = "ECMOTO")
    protected String ecmoto;
    @XmlElement(name = "PosEntryModeCd")
    protected String posEntryModeCd;
    @XmlElement(name = "MCC")
    protected String mcc;
    @XmlElement(name = "FraudPostDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fraudPostDate;
    @XmlElement(name = "DaysToAct")
    protected BigInteger daysToAct;
    @XmlElement(name = "MatchedCases")
    protected List<MatchedCasesType> matchedCases;
    @XmlElement(name = "GMFPStatus")
    protected String gmfpStatus;
    @XmlElement(name = "ExceptionReason")
    protected String exceptionReason;
    @XmlElement(name = "IssuerBID")
    protected String issuerBID;
    @XmlElement(name = "IssuerName", required = true)
    protected String issuerName;
    @XmlElement(name = "IssuerCountryCode")
    protected String issuerCountryCode;
    @XmlElement(name = "FraudCode")
    protected String fraudCode;
    @XmlElement(name = "DateAdded")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateAdded;

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
     * Gets the value of the origTranCPD property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigTranCPD() {
        return origTranCPD;
    }

    /**
     * Sets the value of the origTranCPD property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigTranCPD(XMLGregorianCalendar value) {
        this.origTranCPD = value;
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
     * Gets the value of the destinationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDestinationAmount() {
        return destinationAmount;
    }

    /**
     * Sets the value of the destinationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDestinationAmount(AmountType value) {
        this.destinationAmount = value;
    }

    /**
     * Gets the value of the usdAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUSDAmount() {
        return usdAmount;
    }

    /**
     * Sets the value of the usdAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUSDAmount(AmountType value) {
        this.usdAmount = value;
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
     * Gets the value of the posEntryModeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosEntryModeCd() {
        return posEntryModeCd;
    }

    /**
     * Sets the value of the posEntryModeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosEntryModeCd(String value) {
        this.posEntryModeCd = value;
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
     * Gets the value of the fraudPostDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFraudPostDate() {
        return fraudPostDate;
    }

    /**
     * Sets the value of the fraudPostDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFraudPostDate(XMLGregorianCalendar value) {
        this.fraudPostDate = value;
    }

    /**
     * Gets the value of the daysToAct property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaysToAct() {
        return daysToAct;
    }

    /**
     * Sets the value of the daysToAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaysToAct(BigInteger value) {
        this.daysToAct = value;
    }

    /**
     * Gets the value of the matchedCases property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchedCases property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchedCases().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchedCasesType }
     * 
     * 
     */
    public List<MatchedCasesType> getMatchedCases() {
        if (matchedCases == null) {
            matchedCases = new ArrayList<MatchedCasesType>();
        }
        return this.matchedCases;
    }

    /**
     * Gets the value of the gmfpStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMFPStatus() {
        return gmfpStatus;
    }

    /**
     * Sets the value of the gmfpStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMFPStatus(String value) {
        this.gmfpStatus = value;
    }

    /**
     * Gets the value of the exceptionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionReason() {
        return exceptionReason;
    }

    /**
     * Sets the value of the exceptionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionReason(String value) {
        this.exceptionReason = value;
    }

    /**
     * Gets the value of the issuerBID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerBID() {
        return issuerBID;
    }

    /**
     * Sets the value of the issuerBID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerBID(String value) {
        this.issuerBID = value;
    }

    /**
     * Gets the value of the issuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerName() {
        return issuerName;
    }

    /**
     * Sets the value of the issuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerName(String value) {
        this.issuerName = value;
    }

    /**
     * Gets the value of the issuerCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerCountryCode() {
        return issuerCountryCode;
    }

    /**
     * Sets the value of the issuerCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerCountryCode(String value) {
        this.issuerCountryCode = value;
    }

    /**
     * Gets the value of the fraudCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudCode() {
        return fraudCode;
    }

    /**
     * Sets the value of the fraudCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudCode(String value) {
        this.fraudCode = value;
    }

    /**
     * Gets the value of the dateAdded property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAdded() {
        return dateAdded;
    }

    /**
     * Sets the value of the dateAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAdded(XMLGregorianCalendar value) {
        this.dateAdded = value;
    }

}
