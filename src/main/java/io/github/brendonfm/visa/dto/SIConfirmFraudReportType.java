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
 * <p>Java class for SIConfirmFraudReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIConfirmFraudReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FraudReportID"/>
 *         &lt;element name="FraudConfirmTypeInd" type="{http://www.visa.com/ROLSI}YNType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIConfirmFraudReportType", propOrder = {
    "visaCaseNumber",
    "fraudReportID",
    "fraudConfirmTypeInd"
})
public class SIConfirmFraudReportType {

    @XmlElement(name = "VisaCaseNumber")
    protected long visaCaseNumber;
    @XmlElement(name = "FraudReportID")
    protected long fraudReportID;
    @XmlElement(name = "FraudConfirmTypeInd", required = true)
    @XmlSchemaType(name = "string")
    protected YNType fraudConfirmTypeInd;

    /**
     * Gets the value of the visaCaseNumber property.
     * 
     */
    public long getVisaCaseNumber() {
        return visaCaseNumber;
    }

    /**
     * Sets the value of the visaCaseNumber property.
     * 
     */
    public void setVisaCaseNumber(long value) {
        this.visaCaseNumber = value;
    }

    /**
     * Gets the value of the fraudReportID property.
     * 
     */
    public long getFraudReportID() {
        return fraudReportID;
    }

    /**
     * Sets the value of the fraudReportID property.
     * 
     */
    public void setFraudReportID(long value) {
        this.fraudReportID = value;
    }

    /**
     * Gets the value of the fraudConfirmTypeInd property.
     * 
     * @return
     *     possible object is
     *     {@link YNType }
     *     
     */
    public YNType getFraudConfirmTypeInd() {
        return fraudConfirmTypeInd;
    }

    /**
     * Sets the value of the fraudConfirmTypeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNType }
     *     
     */
    public void setFraudConfirmTypeInd(YNType value) {
        this.fraudConfirmTypeInd = value;
    }

}