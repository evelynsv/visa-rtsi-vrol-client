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
 * <p>Java class for MessageRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageRequestBodyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.visa.com/ROLSI}RequestBodyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="CreateMessageRequest" type="{http://www.visa.com/ROLSI}CreateMessageType"/>
 *           &lt;element name="UploadMessageImageRequest" type="{http://www.visa.com/ROLSI}UploadMessageDocType"/>
 *           &lt;element name="GetMessageDetailsRequest" type="{http://www.visa.com/ROLSI}GetMessageDetailsType"/>
 *           &lt;element name="GetMessageImageRequest" type="{http://www.visa.com/ROLSI}GetMessageDocumentType"/>
 *           &lt;element name="CloseMessageRequest" type="{http://www.visa.com/ROLSI}CloseMessageRequestType"/>
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
@XmlType(name = "MessageRequestBodyType", propOrder = {
    "createMessageRequest",
    "uploadMessageImageRequest",
    "getMessageDetailsRequest",
    "getMessageImageRequest",
    "closeMessageRequest"
})
public class MessageRequestBodyType
    extends RequestBodyType
{

    @XmlElement(name = "CreateMessageRequest")
    protected CreateMessageType createMessageRequest;
    @XmlElement(name = "UploadMessageImageRequest")
    protected UploadMessageDocType uploadMessageImageRequest;
    @XmlElement(name = "GetMessageDetailsRequest")
    protected GetMessageDetailsType getMessageDetailsRequest;
    @XmlElement(name = "GetMessageImageRequest")
    protected GetMessageDocumentType getMessageImageRequest;
    @XmlElement(name = "CloseMessageRequest")
    protected CloseMessageRequestType closeMessageRequest;

    /**
     * Gets the value of the createMessageRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CreateMessageType }
     *     
     */
    public CreateMessageType getCreateMessageRequest() {
        return createMessageRequest;
    }

    /**
     * Sets the value of the createMessageRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateMessageType }
     *     
     */
    public void setCreateMessageRequest(CreateMessageType value) {
        this.createMessageRequest = value;
    }

    /**
     * Gets the value of the uploadMessageImageRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UploadMessageDocType }
     *     
     */
    public UploadMessageDocType getUploadMessageImageRequest() {
        return uploadMessageImageRequest;
    }

    /**
     * Sets the value of the uploadMessageImageRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadMessageDocType }
     *     
     */
    public void setUploadMessageImageRequest(UploadMessageDocType value) {
        this.uploadMessageImageRequest = value;
    }

    /**
     * Gets the value of the getMessageDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetMessageDetailsType }
     *     
     */
    public GetMessageDetailsType getGetMessageDetailsRequest() {
        return getMessageDetailsRequest;
    }

    /**
     * Sets the value of the getMessageDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMessageDetailsType }
     *     
     */
    public void setGetMessageDetailsRequest(GetMessageDetailsType value) {
        this.getMessageDetailsRequest = value;
    }

    /**
     * Gets the value of the getMessageImageRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetMessageDocumentType }
     *     
     */
    public GetMessageDocumentType getGetMessageImageRequest() {
        return getMessageImageRequest;
    }

    /**
     * Sets the value of the getMessageImageRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMessageDocumentType }
     *     
     */
    public void setGetMessageImageRequest(GetMessageDocumentType value) {
        this.getMessageImageRequest = value;
    }

    /**
     * Gets the value of the closeMessageRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CloseMessageRequestType }
     *     
     */
    public CloseMessageRequestType getCloseMessageRequest() {
        return closeMessageRequest;
    }

    /**
     * Sets the value of the closeMessageRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloseMessageRequestType }
     *     
     */
    public void setCloseMessageRequest(CloseMessageRequestType value) {
        this.closeMessageRequest = value;
    }

}