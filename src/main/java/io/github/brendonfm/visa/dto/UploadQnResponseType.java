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
 * <p>Java class for UploadQnResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadQnResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.visa.com/ROLSI}BaseQnResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}QnId" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FinID" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}FilingId" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.visa.com/ROLSI}QnType"/>
 *           &lt;element name="CaseFilingType" type="{http://www.visa.com/ROLSI}CaseFilingType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadQnResponseType", propOrder = {
    "qnId",
    "finID",
    "filingId",
    "qnType",
    "caseFilingType"
})
public class UploadQnResponseType
    extends BaseQnResponseType
{

    @XmlElement(name = "QnId")
    protected Long qnId;
    @XmlElement(name = "FinID")
    protected Long finID;
    @XmlElement(name = "FilingId")
    protected Long filingId;
    @XmlElement(name = "QnType")
    @XmlSchemaType(name = "string")
    protected RTSIQnType qnType;
    @XmlElement(name = "CaseFilingType")
    @XmlSchemaType(name = "string")
    protected CaseFilingType caseFilingType;

    /**
     * Gets the value of the qnId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQnId() {
        return qnId;
    }

    /**
     * Sets the value of the qnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQnId(Long value) {
        this.qnId = value;
    }

    /**
     * Gets the value of the finID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinID() {
        return finID;
    }

    /**
     * Sets the value of the finID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinID(Long value) {
        this.finID = value;
    }

    /**
     * Gets the value of the filingId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFilingId() {
        return filingId;
    }

    /**
     * Sets the value of the filingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFilingId(Long value) {
        this.filingId = value;
    }

    /**
     * Gets the value of the qnType property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIQnType }
     *     
     */
    public RTSIQnType getQnType() {
        return qnType;
    }

    /**
     * Sets the value of the qnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIQnType }
     *     
     */
    public void setQnType(RTSIQnType value) {
        this.qnType = value;
    }

    /**
     * Gets the value of the caseFilingType property.
     * 
     * @return
     *     possible object is
     *     {@link CaseFilingType }
     *     
     */
    public CaseFilingType getCaseFilingType() {
        return caseFilingType;
    }

    /**
     * Sets the value of the caseFilingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseFilingType }
     *     
     */
    public void setCaseFilingType(CaseFilingType value) {
        this.caseFilingType = value;
    }

}