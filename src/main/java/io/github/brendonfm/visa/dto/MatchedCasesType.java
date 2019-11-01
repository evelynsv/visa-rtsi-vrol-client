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
 * <p>Java class for MatchedCasesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchedCasesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VisaCaseNumber" type="{http://www.visa.com/ROLSI}VisaCaseNumberType" minOccurs="0"/>
 *         &lt;element name="StageStateDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuerCaseNumber" type="{http://www.visa.com/ROLSI}MemberCaseNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchedCasesType", propOrder = {
    "visaCaseNumber",
    "stageStateDesc",
    "issuerCaseNumber"
})
public class MatchedCasesType {

    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "StageStateDesc")
    protected String stageStateDesc;
    @XmlElement(name = "IssuerCaseNumber")
    protected String issuerCaseNumber;

    /**
     * Gets the value of the visaCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisaCaseNumber() {
        return visaCaseNumber;
    }

    /**
     * Sets the value of the visaCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisaCaseNumber(Long value) {
        this.visaCaseNumber = value;
    }

    /**
     * Gets the value of the stageStateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStageStateDesc() {
        return stageStateDesc;
    }

    /**
     * Sets the value of the stageStateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStageStateDesc(String value) {
        this.stageStateDesc = value;
    }

    /**
     * Gets the value of the issuerCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerCaseNumber() {
        return issuerCaseNumber;
    }

    /**
     * Sets the value of the issuerCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerCaseNumber(String value) {
        this.issuerCaseNumber = value;
    }

}
