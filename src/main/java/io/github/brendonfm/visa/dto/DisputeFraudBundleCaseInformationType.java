//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DisputeFraudBundleCaseInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeFraudBundleCaseInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}MemberCaseNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FraudClassification" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}InitiatorAndSource" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CardholderContactDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CardholderWrittenNotiffDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FollowUpDate" minOccurs="0"/>
 *         &lt;element name="FeeAmount" type="{http://www.visa.com/ROLSI}MonetaryAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}RegEIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}RegZIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}RegERegZExpirationDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeFraudBundleCaseInformationType", propOrder = {
    "memberCaseNumber",
    "fraudClassification",
    "initiatorAndSource",
    "cardholderContactDate",
    "cardholderWrittenNotiffDate",
    "followUpDate",
    "feeAmount",
    "regEIndicator",
    "regZIndicator",
    "regERegZExpirationDate"
})
public class DisputeFraudBundleCaseInformationType {

    @XmlElement(name = "MemberCaseNumber")
    protected String memberCaseNumber;
    @XmlElement(name = "FraudClassification")
    protected String fraudClassification;
    @XmlElement(name = "InitiatorAndSource")
    protected String initiatorAndSource;
    @XmlElement(name = "CardholderContactDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cardholderContactDate;
    @XmlElement(name = "CardholderWrittenNotiffDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cardholderWrittenNotiffDate;
    @XmlElement(name = "FollowUpDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar followUpDate;
    @XmlElement(name = "FeeAmount")
    protected BigDecimal feeAmount;
    @XmlElement(name = "RegEIndicator")
    protected Boolean regEIndicator;
    @XmlElement(name = "RegZIndicator")
    protected Boolean regZIndicator;
    @XmlElement(name = "RegERegZExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regERegZExpirationDate;

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
     * Gets the value of the fraudClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudClassification() {
        return fraudClassification;
    }

    /**
     * Sets the value of the fraudClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudClassification(String value) {
        this.fraudClassification = value;
    }

    /**
     * Gets the value of the initiatorAndSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatorAndSource() {
        return initiatorAndSource;
    }

    /**
     * Sets the value of the initiatorAndSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatorAndSource(String value) {
        this.initiatorAndSource = value;
    }

    /**
     * Gets the value of the cardholderContactDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCardholderContactDate() {
        return cardholderContactDate;
    }

    /**
     * Sets the value of the cardholderContactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCardholderContactDate(XMLGregorianCalendar value) {
        this.cardholderContactDate = value;
    }

    /**
     * Gets the value of the cardholderWrittenNotiffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCardholderWrittenNotiffDate() {
        return cardholderWrittenNotiffDate;
    }

    /**
     * Sets the value of the cardholderWrittenNotiffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCardholderWrittenNotiffDate(XMLGregorianCalendar value) {
        this.cardholderWrittenNotiffDate = value;
    }

    /**
     * Gets the value of the followUpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFollowUpDate() {
        return followUpDate;
    }

    /**
     * Sets the value of the followUpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFollowUpDate(XMLGregorianCalendar value) {
        this.followUpDate = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeAmount(BigDecimal value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the regEIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegEIndicator() {
        return regEIndicator;
    }

    /**
     * Sets the value of the regEIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegEIndicator(Boolean value) {
        this.regEIndicator = value;
    }

    /**
     * Gets the value of the regZIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegZIndicator() {
        return regZIndicator;
    }

    /**
     * Sets the value of the regZIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegZIndicator(Boolean value) {
        this.regZIndicator = value;
    }

    /**
     * Gets the value of the regERegZExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegERegZExpirationDate() {
        return regERegZExpirationDate;
    }

    /**
     * Sets the value of the regERegZExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegERegZExpirationDate(XMLGregorianCalendar value) {
        this.regERegZExpirationDate = value;
    }

}