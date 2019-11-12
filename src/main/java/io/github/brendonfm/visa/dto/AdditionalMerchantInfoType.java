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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalMerchantInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalMerchantInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VisaStoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VisaMerchantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantDBAName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessLegalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantLocation" type="{http://www.visa.com/ROLSI}GMRMerchantLocationType" minOccurs="0"/>
 *         &lt;element name="MerchantURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantContactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantCategoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalMerchantInfoType", propOrder = {
    "visaStoreName",
    "visaMerchantName",
    "merchantDBAName",
    "businessLegalName",
    "merchantStreetAddress",
    "merchantCity",
    "merchantState",
    "merchantPostalCode",
    "merchantCountryCode",
    "merchantLocation",
    "merchantURL",
    "merchantContactPhone",
    "merchantCategoryCode",
    "merchantCategoryDescription"
})
public class AdditionalMerchantInfoType {

    @XmlElement(name = "VisaStoreName")
    protected String visaStoreName;
    @XmlElement(name = "VisaMerchantName")
    protected String visaMerchantName;
    @XmlElement(name = "MerchantDBAName")
    protected String merchantDBAName;
    @XmlElement(name = "BusinessLegalName")
    protected String businessLegalName;
    @XmlElement(name = "MerchantStreetAddress")
    protected String merchantStreetAddress;
    @XmlElement(name = "MerchantCity")
    protected String merchantCity;
    @XmlElement(name = "MerchantState")
    protected String merchantState;
    @XmlElement(name = "MerchantPostalCode")
    protected String merchantPostalCode;
    @XmlElement(name = "MerchantCountryCode")
    protected String merchantCountryCode;
    @XmlElement(name = "MerchantLocation")
    protected GMRMerchantLocationType merchantLocation;
    @XmlElement(name = "MerchantURL")
    protected String merchantURL;
    @XmlElement(name = "MerchantContactPhone")
    protected String merchantContactPhone;
    @XmlElement(name = "MerchantCategoryCode")
    protected String merchantCategoryCode;
    @XmlElement(name = "MerchantCategoryDescription")
    protected String merchantCategoryDescription;

    /**
     * Gets the value of the visaStoreName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaStoreName() {
        return visaStoreName;
    }

    /**
     * Sets the value of the visaStoreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaStoreName(String value) {
        this.visaStoreName = value;
    }

    /**
     * Gets the value of the visaMerchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaMerchantName() {
        return visaMerchantName;
    }

    /**
     * Sets the value of the visaMerchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaMerchantName(String value) {
        this.visaMerchantName = value;
    }

    /**
     * Gets the value of the merchantDBAName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDBAName() {
        return merchantDBAName;
    }

    /**
     * Sets the value of the merchantDBAName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDBAName(String value) {
        this.merchantDBAName = value;
    }

    /**
     * Gets the value of the businessLegalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessLegalName() {
        return businessLegalName;
    }

    /**
     * Sets the value of the businessLegalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessLegalName(String value) {
        this.businessLegalName = value;
    }

    /**
     * Gets the value of the merchantStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantStreetAddress() {
        return merchantStreetAddress;
    }

    /**
     * Sets the value of the merchantStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantStreetAddress(String value) {
        this.merchantStreetAddress = value;
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
     * Gets the value of the merchantState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantState() {
        return merchantState;
    }

    /**
     * Sets the value of the merchantState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantState(String value) {
        this.merchantState = value;
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
     * Gets the value of the merchantLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GMRMerchantLocationType }
     *     
     */
    public GMRMerchantLocationType getMerchantLocation() {
        return merchantLocation;
    }

    /**
     * Sets the value of the merchantLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMRMerchantLocationType }
     *     
     */
    public void setMerchantLocation(GMRMerchantLocationType value) {
        this.merchantLocation = value;
    }

    /**
     * Gets the value of the merchantURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantURL() {
        return merchantURL;
    }

    /**
     * Sets the value of the merchantURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantURL(String value) {
        this.merchantURL = value;
    }

    /**
     * Gets the value of the merchantContactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantContactPhone() {
        return merchantContactPhone;
    }

    /**
     * Sets the value of the merchantContactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantContactPhone(String value) {
        this.merchantContactPhone = value;
    }

    /**
     * Gets the value of the merchantCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    /**
     * Sets the value of the merchantCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCategoryCode(String value) {
        this.merchantCategoryCode = value;
    }

    /**
     * Gets the value of the merchantCategoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCategoryDescription() {
        return merchantCategoryDescription;
    }

    /**
     * Sets the value of the merchantCategoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCategoryDescription(String value) {
        this.merchantCategoryDescription = value;
    }

}