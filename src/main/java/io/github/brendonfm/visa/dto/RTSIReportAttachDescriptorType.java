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
 * <p>Java class for RTSIReportAttachDescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTSIReportAttachDescriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachType" type="{http://www.visa.com/ROLSI}SOAPAttachType" minOccurs="0"/>
 *         &lt;element name="Attachment" type="{http://www.visa.com/ROLSI}RTSIReportAttachmentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTSIReportAttachDescriptorType", propOrder = {
    "attachType",
    "attachment"
})
public class RTSIReportAttachDescriptorType {

    @XmlElement(name = "AttachType")
    @XmlSchemaType(name = "string")
    protected SOAPAttachType attachType;
    @XmlElement(name = "Attachment")
    protected RTSIReportAttachmentType attachment;

    /**
     * Gets the value of the attachType property.
     * 
     * @return
     *     possible object is
     *     {@link SOAPAttachType }
     *     
     */
    public SOAPAttachType getAttachType() {
        return attachType;
    }

    /**
     * Sets the value of the attachType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOAPAttachType }
     *     
     */
    public void setAttachType(SOAPAttachType value) {
        this.attachType = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIReportAttachmentType }
     *     
     */
    public RTSIReportAttachmentType getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIReportAttachmentType }
     *     
     */
    public void setAttachment(RTSIReportAttachmentType value) {
        this.attachment = value;
    }

}
