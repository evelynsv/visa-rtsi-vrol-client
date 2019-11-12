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
 * <p>Java class for QuestionnaireRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuestionnaireRequestBodyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.visa.com/ROLSI}RequestBodyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="DisputeQuestionnaireRequest" type="{http://www.visa.com/ROLSI}DisputeQuestionnaireType"/>
 *           &lt;element name="UploadImageRequest" type="{http://www.visa.com/ROLSI}UploadDocType"/>
 *           &lt;element name="GetQuestionnaireDataRequest" type="{http://www.visa.com/ROLSI}GetQuestionnaireDataType"/>
 *           &lt;element name="GetImageRequest" type="{http://www.visa.com/ROLSI}GetDocumentType"/>
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
@XmlType(name = "QuestionnaireRequestBodyType", propOrder = {
    "disputeQuestionnaireRequest",
    "uploadImageRequest",
    "getQuestionnaireDataRequest",
    "getImageRequest"
})
public class QuestionnaireRequestBodyType
    extends RequestBodyType
{

    @XmlElement(name = "DisputeQuestionnaireRequest")
    protected DisputeQuestionnaireType disputeQuestionnaireRequest;
    @XmlElement(name = "UploadImageRequest")
    protected UploadDocType uploadImageRequest;
    @XmlElement(name = "GetQuestionnaireDataRequest")
    protected GetQuestionnaireDataType getQuestionnaireDataRequest;
    @XmlElement(name = "GetImageRequest")
    protected GetDocumentType getImageRequest;

    /**
     * Gets the value of the disputeQuestionnaireRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeQuestionnaireType }
     *     
     */
    public DisputeQuestionnaireType getDisputeQuestionnaireRequest() {
        return disputeQuestionnaireRequest;
    }

    /**
     * Sets the value of the disputeQuestionnaireRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeQuestionnaireType }
     *     
     */
    public void setDisputeQuestionnaireRequest(DisputeQuestionnaireType value) {
        this.disputeQuestionnaireRequest = value;
    }

    /**
     * Gets the value of the uploadImageRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UploadDocType }
     *     
     */
    public UploadDocType getUploadImageRequest() {
        return uploadImageRequest;
    }

    /**
     * Sets the value of the uploadImageRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadDocType }
     *     
     */
    public void setUploadImageRequest(UploadDocType value) {
        this.uploadImageRequest = value;
    }

    /**
     * Gets the value of the getQuestionnaireDataRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetQuestionnaireDataType }
     *     
     */
    public GetQuestionnaireDataType getGetQuestionnaireDataRequest() {
        return getQuestionnaireDataRequest;
    }

    /**
     * Sets the value of the getQuestionnaireDataRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetQuestionnaireDataType }
     *     
     */
    public void setGetQuestionnaireDataRequest(GetQuestionnaireDataType value) {
        this.getQuestionnaireDataRequest = value;
    }

    /**
     * Gets the value of the getImageRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetDocumentType }
     *     
     */
    public GetDocumentType getGetImageRequest() {
        return getImageRequest;
    }

    /**
     * Sets the value of the getImageRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDocumentType }
     *     
     */
    public void setGetImageRequest(GetDocumentType value) {
        this.getImageRequest = value;
    }

}