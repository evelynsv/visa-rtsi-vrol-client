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
 * <p>Java class for QuestionnaireRespBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuestionnaireRespBodyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.visa.com/ROLSI}ResponseBodyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="DisputeQuestionnaireResp" type="{http://www.visa.com/ROLSI}UploadQnResponseType"/>
 *           &lt;element name="UploadImageResponse" type="{http://www.visa.com/ROLSI}UploadDocumentResponseType"/>
 *           &lt;element name="GetQnDetailsResponse" type="{http://www.visa.com/ROLSI}GetQnDetailsResponseType"/>
 *           &lt;element ref="{http://www.visa.com/ROLSI}GetImageResponse"/>
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
@XmlType(name = "QuestionnaireRespBodyType", propOrder = {
    "disputeQuestionnaireResp",
    "uploadImageResponse",
    "getQnDetailsResponse",
    "getImageResponse"
})
public class QuestionnaireRespBodyType
    extends ResponseBodyType
{

    @XmlElement(name = "DisputeQuestionnaireResp")
    protected UploadQnResponseType disputeQuestionnaireResp;
    @XmlElement(name = "UploadImageResponse")
    protected UploadDocumentResponseType uploadImageResponse;
    @XmlElement(name = "GetQnDetailsResponse")
    protected GetQnDetailsResponseType getQnDetailsResponse;
    @XmlElement(name = "GetImageResponse")
    protected DocumentType getImageResponse;

    /**
     * Gets the value of the disputeQuestionnaireResp property.
     * 
     * @return
     *     possible object is
     *     {@link UploadQnResponseType }
     *     
     */
    public UploadQnResponseType getDisputeQuestionnaireResp() {
        return disputeQuestionnaireResp;
    }

    /**
     * Sets the value of the disputeQuestionnaireResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadQnResponseType }
     *     
     */
    public void setDisputeQuestionnaireResp(UploadQnResponseType value) {
        this.disputeQuestionnaireResp = value;
    }

    /**
     * Gets the value of the uploadImageResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UploadDocumentResponseType }
     *     
     */
    public UploadDocumentResponseType getUploadImageResponse() {
        return uploadImageResponse;
    }

    /**
     * Sets the value of the uploadImageResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadDocumentResponseType }
     *     
     */
    public void setUploadImageResponse(UploadDocumentResponseType value) {
        this.uploadImageResponse = value;
    }

    /**
     * Gets the value of the getQnDetailsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetQnDetailsResponseType }
     *     
     */
    public GetQnDetailsResponseType getGetQnDetailsResponse() {
        return getQnDetailsResponse;
    }

    /**
     * Sets the value of the getQnDetailsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetQnDetailsResponseType }
     *     
     */
    public void setGetQnDetailsResponse(GetQnDetailsResponseType value) {
        this.getQnDetailsResponse = value;
    }

    /**
     * Gets the value of the getImageResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getGetImageResponse() {
        return getImageResponse;
    }

    /**
     * Sets the value of the getImageResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setGetImageResponse(DocumentType value) {
        this.getImageResponse = value;
    }

}