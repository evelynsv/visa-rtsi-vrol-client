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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateCaseInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateCaseInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CaseType" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FraudClassification" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}InitiatorAndSource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCaseInfoType", propOrder = {
    "caseType",
    "fraudClassification",
    "initiatorAndSource"
})
@XmlSeeAlso({
    ExtendedCreateCaseInfoType.class
})
public class CreateCaseInfoType {

    @XmlElement(name = "CaseType")
    protected String caseType;
    @XmlElement(name = "FraudClassification")
    protected String fraudClassification;
    @XmlElement(name = "InitiatorAndSource")
    protected String initiatorAndSource;

    /**
     * Gets the value of the caseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseType() {
        return caseType;
    }

    /**
     * Sets the value of the caseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseType(String value) {
        this.caseType = value;
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

}
