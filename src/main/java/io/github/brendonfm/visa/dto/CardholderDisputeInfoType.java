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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CardholderDisputeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardholderDisputeInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardholderName" type="{http://www.visa.com/ROLSI}Name60Type" minOccurs="0"/>
 *         &lt;element name="BusinessName" type="{http://www.visa.com/ROLSI}BusinessNameType" minOccurs="0"/>
 *         &lt;element name="CardholderAddress" type="{http://www.visa.com/ROLSI}CardHolderAddressType" minOccurs="0"/>
 *         &lt;element name="Address3" type="{http://www.visa.com/ROLSI}CardHolderAddressType" minOccurs="0"/>
 *         &lt;element name="CardholderCity" type="{http://www.visa.com/ROLSI}CardHolderCityType" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CardholderCountrySubEntityCode" minOccurs="0"/>
 *         &lt;element name="NameType" type="{http://www.visa.com/ROLSI}NameValueType" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.visa.com/ROLSI}ContactRegionType" minOccurs="0"/>
 *         &lt;element name="CardholderPostalCode" type="{http://www.visa.com/ROLSI}CardHolderPostalCodeType" minOccurs="0"/>
 *         &lt;element name="CardholderCountryCode" type="{http://www.visa.com/ROLSI}CardHolderCountryCodeType" minOccurs="0"/>
 *         &lt;element name="CardholderPhoneNum" type="{http://www.visa.com/ROLSI}CardHolderPhoneNumType" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CardholderBusPhoneNum" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CardholderCellPhoneNum" minOccurs="0"/>
 *         &lt;element name="CardholderNotificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CardholderFaxNum" type="{http://www.visa.com/ROLSI}DisputePhoneNumType" minOccurs="0"/>
 *         &lt;element name="CardholderEmail" type="{http://www.visa.com/ROLSI}CardHolderEmailType" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CardholderBestTimeCall" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CardholderOptInInd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardholderDisputeInfoType", propOrder = {
    "cardholderName",
    "businessName",
    "cardholderAddress",
    "address3",
    "cardholderCity",
    "cardholderCountrySubEntityCode",
    "nameType",
    "region",
    "cardholderPostalCode",
    "cardholderCountryCode",
    "cardholderPhoneNum",
    "cardholderBusPhoneNum",
    "cardholderCellPhoneNum",
    "cardholderNotificationDate",
    "cardholderFaxNum",
    "cardholderEmail",
    "cardholderBestTimeCall",
    "cardholderOptInInd"
})
@XmlSeeAlso({
    DisputeCardholderInfoType.class
})
public class CardholderDisputeInfoType {

    @XmlElement(name = "CardholderName")
    protected String cardholderName;
    @XmlElement(name = "BusinessName")
    protected String businessName;
    @XmlElement(name = "CardholderAddress")
    protected String cardholderAddress;
    @XmlElement(name = "Address3")
    protected String address3;
    @XmlElement(name = "CardholderCity")
    protected String cardholderCity;
    @XmlElement(name = "CardholderCountrySubEntityCode")
    protected String cardholderCountrySubEntityCode;
    @XmlElement(name = "NameType")
    @XmlSchemaType(name = "string")
    protected NameValueType nameType;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "CardholderPostalCode")
    protected String cardholderPostalCode;
    @XmlElement(name = "CardholderCountryCode")
    protected String cardholderCountryCode;
    @XmlElement(name = "CardholderPhoneNum")
    protected String cardholderPhoneNum;
    @XmlElement(name = "CardholderBusPhoneNum")
    protected String cardholderBusPhoneNum;
    @XmlElement(name = "CardholderCellPhoneNum")
    protected String cardholderCellPhoneNum;
    @XmlElement(name = "CardholderNotificationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cardholderNotificationDate;
    @XmlElement(name = "CardholderFaxNum")
    protected String cardholderFaxNum;
    @XmlElement(name = "CardholderEmail")
    protected String cardholderEmail;
    @XmlElement(name = "CardholderBestTimeCall")
    protected String cardholderBestTimeCall;
    @XmlElement(name = "CardholderOptInInd")
    protected Boolean cardholderOptInInd;

    /**
     * Gets the value of the cardholderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderName() {
        return cardholderName;
    }

    /**
     * Sets the value of the cardholderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderName(String value) {
        this.cardholderName = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the cardholderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderAddress() {
        return cardholderAddress;
    }

    /**
     * Sets the value of the cardholderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderAddress(String value) {
        this.cardholderAddress = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the cardholderCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderCity() {
        return cardholderCity;
    }

    /**
     * Sets the value of the cardholderCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderCity(String value) {
        this.cardholderCity = value;
    }

    /**
     * Gets the value of the cardholderCountrySubEntityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderCountrySubEntityCode() {
        return cardholderCountrySubEntityCode;
    }

    /**
     * Sets the value of the cardholderCountrySubEntityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderCountrySubEntityCode(String value) {
        this.cardholderCountrySubEntityCode = value;
    }

    /**
     * Gets the value of the nameType property.
     * 
     * @return
     *     possible object is
     *     {@link NameValueType }
     *     
     */
    public NameValueType getNameType() {
        return nameType;
    }

    /**
     * Sets the value of the nameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueType }
     *     
     */
    public void setNameType(NameValueType value) {
        this.nameType = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the cardholderPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderPostalCode() {
        return cardholderPostalCode;
    }

    /**
     * Sets the value of the cardholderPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderPostalCode(String value) {
        this.cardholderPostalCode = value;
    }

    /**
     * Gets the value of the cardholderCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderCountryCode() {
        return cardholderCountryCode;
    }

    /**
     * Sets the value of the cardholderCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderCountryCode(String value) {
        this.cardholderCountryCode = value;
    }

    /**
     * Gets the value of the cardholderPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderPhoneNum() {
        return cardholderPhoneNum;
    }

    /**
     * Sets the value of the cardholderPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderPhoneNum(String value) {
        this.cardholderPhoneNum = value;
    }

    /**
     * Gets the value of the cardholderBusPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderBusPhoneNum() {
        return cardholderBusPhoneNum;
    }

    /**
     * Sets the value of the cardholderBusPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderBusPhoneNum(String value) {
        this.cardholderBusPhoneNum = value;
    }

    /**
     * Gets the value of the cardholderCellPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderCellPhoneNum() {
        return cardholderCellPhoneNum;
    }

    /**
     * Sets the value of the cardholderCellPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderCellPhoneNum(String value) {
        this.cardholderCellPhoneNum = value;
    }

    /**
     * Gets the value of the cardholderNotificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCardholderNotificationDate() {
        return cardholderNotificationDate;
    }

    /**
     * Sets the value of the cardholderNotificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCardholderNotificationDate(XMLGregorianCalendar value) {
        this.cardholderNotificationDate = value;
    }

    /**
     * Gets the value of the cardholderFaxNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderFaxNum() {
        return cardholderFaxNum;
    }

    /**
     * Sets the value of the cardholderFaxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderFaxNum(String value) {
        this.cardholderFaxNum = value;
    }

    /**
     * Gets the value of the cardholderEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderEmail() {
        return cardholderEmail;
    }

    /**
     * Sets the value of the cardholderEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderEmail(String value) {
        this.cardholderEmail = value;
    }

    /**
     * Gets the value of the cardholderBestTimeCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderBestTimeCall() {
        return cardholderBestTimeCall;
    }

    /**
     * Sets the value of the cardholderBestTimeCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderBestTimeCall(String value) {
        this.cardholderBestTimeCall = value;
    }

    /**
     * Gets the value of the cardholderOptInInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardholderOptInInd() {
        return cardholderOptInInd;
    }

    /**
     * Sets the value of the cardholderOptInInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardholderOptInInd(Boolean value) {
        this.cardholderOptInInd = value;
    }

}
