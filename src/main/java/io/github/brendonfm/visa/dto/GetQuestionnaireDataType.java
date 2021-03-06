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
 * <p>Java class for GetQuestionnaireDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetQuestionnaireDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}QnId"/>
 *         &lt;element name="QnType">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {http://www.visa.com/ROLSI}RTSIQnType {http://www.visa.com/ROLSI}CaseFilingType {http://www.visa.com/ROLSI}CaseFilingItemType">
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IncludeQnImageInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetQuestionnaireDataType", propOrder = {
    "visaCaseNumber",
    "qnId",
    "qnType",
    "includeQnImageInd"
})
public class GetQuestionnaireDataType {

    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "QnId")
    protected long qnId;
    @XmlElement(name = "QnType", required = true)
    protected String qnType;
    @XmlElement(name = "IncludeQnImageInd")
    protected Boolean includeQnImageInd;

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
     * Gets the value of the qnId property.
     * 
     */
    public long getQnId() {
        return qnId;
    }

    /**
     * Sets the value of the qnId property.
     * 
     */
    public void setQnId(long value) {
        this.qnId = value;
    }

    /**
     * Gets the value of the qnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQnType() {
        return qnType;
    }

    /**
     * Sets the value of the qnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQnType(String value) {
        this.qnType = value;
    }

    /**
     * Gets the value of the includeQnImageInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeQnImageInd() {
        return includeQnImageInd;
    }

    /**
     * Sets the value of the includeQnImageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeQnImageInd(Boolean value) {
        this.includeQnImageInd = value;
    }

}
