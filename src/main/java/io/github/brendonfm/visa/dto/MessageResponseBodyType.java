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
 * <p>Java class for MessageResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageResponseBodyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.visa.com/ROLSI}ResponseBodyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="CreateMessageResponse" type="{http://www.visa.com/ROLSI}CreateMessageResponseType"/>
 *           &lt;element name="MessageDetailsResponse" type="{http://www.visa.com/ROLSI}MessageDetailsResponseType"/>
 *           &lt;element name="UploadMessageImageResponse" type="{http://www.visa.com/ROLSI}UploadMessageImageResponseType"/>
 *           &lt;element name="GetMessageImageResponse" type="{http://www.visa.com/ROLSI}MessageDocumentType"/>
 *           &lt;element name="CloseMessageResponse" type="{http://www.visa.com/ROLSI}CloseMessageResponseType"/>
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
@XmlType(name = "MessageResponseBodyType", propOrder = {
    "createMessageResponse",
    "messageDetailsResponse",
    "uploadMessageImageResponse",
    "getMessageImageResponse",
    "closeMessageResponse"
})
public class MessageResponseBodyType
    extends ResponseBodyType
{

    @XmlElement(name = "CreateMessageResponse")
    protected CreateMessageResponseType createMessageResponse;
    @XmlElement(name = "MessageDetailsResponse")
    protected MessageDetailsResponseType messageDetailsResponse;
    @XmlElement(name = "UploadMessageImageResponse")
    protected UploadMessageImageResponseType uploadMessageImageResponse;
    @XmlElement(name = "GetMessageImageResponse")
    protected MessageDocumentType getMessageImageResponse;
    @XmlElement(name = "CloseMessageResponse")
    protected CloseMessageResponseType closeMessageResponse;

    /**
     * Gets the value of the createMessageResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CreateMessageResponseType }
     *     
     */
    public CreateMessageResponseType getCreateMessageResponse() {
        return createMessageResponse;
    }

    /**
     * Sets the value of the createMessageResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateMessageResponseType }
     *     
     */
    public void setCreateMessageResponse(CreateMessageResponseType value) {
        this.createMessageResponse = value;
    }

    /**
     * Gets the value of the messageDetailsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link MessageDetailsResponseType }
     *     
     */
    public MessageDetailsResponseType getMessageDetailsResponse() {
        return messageDetailsResponse;
    }

    /**
     * Sets the value of the messageDetailsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDetailsResponseType }
     *     
     */
    public void setMessageDetailsResponse(MessageDetailsResponseType value) {
        this.messageDetailsResponse = value;
    }

    /**
     * Gets the value of the uploadMessageImageResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UploadMessageImageResponseType }
     *     
     */
    public UploadMessageImageResponseType getUploadMessageImageResponse() {
        return uploadMessageImageResponse;
    }

    /**
     * Sets the value of the uploadMessageImageResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadMessageImageResponseType }
     *     
     */
    public void setUploadMessageImageResponse(UploadMessageImageResponseType value) {
        this.uploadMessageImageResponse = value;
    }

    /**
     * Gets the value of the getMessageImageResponse property.
     * 
     * @return
     *     possible object is
     *     {@link MessageDocumentType }
     *     
     */
    public MessageDocumentType getGetMessageImageResponse() {
        return getMessageImageResponse;
    }

    /**
     * Sets the value of the getMessageImageResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDocumentType }
     *     
     */
    public void setGetMessageImageResponse(MessageDocumentType value) {
        this.getMessageImageResponse = value;
    }

    /**
     * Gets the value of the closeMessageResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CloseMessageResponseType }
     *     
     */
    public CloseMessageResponseType getCloseMessageResponse() {
        return closeMessageResponse;
    }

    /**
     * Sets the value of the closeMessageResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloseMessageResponseType }
     *     
     */
    public void setCloseMessageResponse(CloseMessageResponseType value) {
        this.closeMessageResponse = value;
    }

}