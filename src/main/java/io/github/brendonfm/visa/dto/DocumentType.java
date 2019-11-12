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
 * <p>Java class for DocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.visa.com/ROLSI}BaseQnResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}DocId"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AttachmentDescriptor"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}DocType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", propOrder = {
    "docId",
    "attachmentDescriptor",
    "docType"
})
public class DocumentType
    extends BaseQnResponseType
{

    @XmlElement(name = "DocId")
    protected long docId;
    @XmlElement(name = "AttachmentDescriptor", required = true)
    protected RTSIAttachDescriptorType attachmentDescriptor;
    @XmlElement(name = "DocType")
    protected String docType;

    /**
     * Gets the value of the docId property.
     * 
     */
    public long getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     */
    public void setDocId(long value) {
        this.docId = value;
    }

    /**
     * Gets the value of the attachmentDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link RTSIAttachDescriptorType }
     *     
     */
    public RTSIAttachDescriptorType getAttachmentDescriptor() {
        return attachmentDescriptor;
    }

    /**
     * Sets the value of the attachmentDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTSIAttachDescriptorType }
     *     
     */
    public void setAttachmentDescriptor(RTSIAttachDescriptorType value) {
        this.attachmentDescriptor = value;
    }

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
    }

}