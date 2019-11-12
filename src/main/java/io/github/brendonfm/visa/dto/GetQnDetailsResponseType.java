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
 * <p>Java class for GetQnDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetQnDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaseManifest" type="{http://www.visa.com/ROLSI}RTSICaseManifestType"/>
 *         &lt;element name="QuestionnaireAttachmentDescriptor" type="{http://www.visa.com/ROLSI}QuestionnaireAttachmentDescriptorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetQnDetailsResponseType", propOrder = {
    "caseManifest",
    "questionnaireAttachmentDescriptor"
})
public class GetQnDetailsResponseType {

    @XmlElement(name = "CaseManifest", required = true)
    protected RTSICaseManifestType caseManifest;
    @XmlElement(name = "QuestionnaireAttachmentDescriptor")
    protected QuestionnaireAttachmentDescriptorType questionnaireAttachmentDescriptor;

    /**
     * Gets the value of the caseManifest property.
     * 
     * @return
     *     possible object is
     *     {@link RTSICaseManifestType }
     *     
     */
    public RTSICaseManifestType getCaseManifest() {
        return caseManifest;
    }

    /**
     * Sets the value of the caseManifest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSICaseManifestType }
     *     
     */
    public void setCaseManifest(RTSICaseManifestType value) {
        this.caseManifest = value;
    }

    /**
     * Gets the value of the questionnaireAttachmentDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionnaireAttachmentDescriptorType }
     *     
     */
    public QuestionnaireAttachmentDescriptorType getQuestionnaireAttachmentDescriptor() {
        return questionnaireAttachmentDescriptor;
    }

    /**
     * Sets the value of the questionnaireAttachmentDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionnaireAttachmentDescriptorType }
     *     
     */
    public void setQuestionnaireAttachmentDescriptor(QuestionnaireAttachmentDescriptorType value) {
        this.questionnaireAttachmentDescriptor = value;
    }

}