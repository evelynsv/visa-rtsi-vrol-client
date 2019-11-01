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
 * <p>Java class for BQICreateCaseTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BQICreateCaseTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.visa.com/ROLSI}MerchantGroup"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ECMOTO" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ReimbursementAttribute" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}SpecialConditionInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CPD" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}TransactionCategory" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AcquirerBID" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}NetworkID" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}ProcessingCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AccountType" minOccurs="0"/>
 *         &lt;element name="AccountType1Identification" type="{http://www.visa.com/ROLSI}AccountType1IdentificationType" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}DCCInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}DCCIndDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}Token" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}TokenAssuranceLevel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BQICreateCaseTransactionType", propOrder = {
    "merchantName",
    "merchantCity",
    "merchantCountrySubEntityCode",
    "merchantCountryCode",
    "merchantPostalCode",
    "mcc",
    "ecmoto",
    "reimbursementAttribute",
    "specialConditionInd",
    "cpd",
    "transactionCategory",
    "acquirerBID",
    "networkID",
    "processingCode",
    "accountType",
    "accountType1Identification",
    "dccInd",
    "dccIndDescription",
    "token",
    "tokenAssuranceLevel"
})
public class BQICreateCaseTransactionType {

    @XmlElement(name = "MerchantName")
    protected String merchantName;
    @XmlElement(name = "MerchantCity")
    protected String merchantCity;
    @XmlElement(name = "MerchantCountrySubEntityCode")
    protected String merchantCountrySubEntityCode;
    @XmlElement(name = "MerchantCountryCode")
    protected String merchantCountryCode;
    @XmlElement(name = "MerchantPostalCode")
    protected String merchantPostalCode;
    @XmlElement(name = "MCC")
    protected String mcc;
    @XmlElement(name = "ECMOTO")
    protected String ecmoto;
    @XmlElement(name = "ReimbursementAttribute")
    protected String reimbursementAttribute;
    @XmlElement(name = "SpecialConditionInd")
    protected String specialConditionInd;
    @XmlElement(name = "CPD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cpd;
    @XmlElement(name = "TransactionCategory")
    @XmlSchemaType(name = "string")
    protected ManualTranCatType transactionCategory;
    @XmlElement(name = "AcquirerBID")
    protected String acquirerBID;
    @XmlElement(name = "NetworkID")
    protected String networkID;
    @XmlElement(name = "ProcessingCode")
    protected String processingCode;
    @XmlElement(name = "AccountType")
    protected String accountType;
    @XmlElement(name = "AccountType1Identification")
    protected String accountType1Identification;
    @XmlElement(name = "DCCInd")
    protected String dccInd;
    @XmlElement(name = "DCCIndDescription")
    protected String dccIndDescription;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "TokenAssuranceLevel")
    protected String tokenAssuranceLevel;

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
     * Gets the value of the specialConditionInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialConditionInd() {
        return specialConditionInd;
    }

    /**
     * Sets the value of the specialConditionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialConditionInd(String value) {
        this.specialConditionInd = value;
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
     * Gets the value of the dccIndDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCIndDescription() {
        return dccIndDescription;
    }

    /**
     * Sets the value of the dccIndDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCIndDescription(String value) {
        this.dccIndDescription = value;
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

}
