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
 * Details about the image being uploaded or downloaded.
 * 
 * <p>Java class for ImageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemoteFileName" type="{http://www.visa.com/ROLSI}RequiredField"/>
 *         &lt;element name="DocComment" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="250"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MimeType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="image/tiff"/>
 *               &lt;enumeration value="image/jpeg"/>
 *               &lt;enumeration value="application/pdf"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.visa.com/ROLSI}DocType" minOccurs="0"/>
 *         &lt;element name="ImageType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="DOCUMENT"/>
 *               &lt;enumeration value="QUESTIONNAIRE"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ImageSize" type="{http://www.visa.com/ROLSI}FileSizeType" minOccurs="0"/>
 *         &lt;element name="TransitName" type="{http://www.visa.com/ROLSI}DocTransitNameType" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AttachmentId" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CopyToSubordinateCases" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageType", propOrder = {
    "remoteFileName",
    "docComment",
    "mimeType",
    "docType",
    "imageType",
    "imageSize",
    "transitName",
    "attachmentId",
    "copyToSubordinateCases"
})
public class ImageType {

    @XmlElement(name = "RemoteFileName", required = true)
    protected String remoteFileName;
    @XmlElement(name = "DocComment")
    protected String docComment;
    @XmlElement(name = "MimeType", required = true)
    protected String mimeType;
    @XmlElement(name = "DocType")
    protected String docType;
    @XmlElement(name = "ImageType", required = true)
    protected String imageType;
    @XmlElement(name = "ImageSize")
    protected FileSizeType imageSize;
    @XmlElement(name = "TransitName")
    protected String transitName;
    @XmlElement(name = "AttachmentId")
    protected String attachmentId;
    @XmlElement(name = "CopyToSubordinateCases")
    protected Boolean copyToSubordinateCases;

    /**
     * Gets the value of the remoteFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteFileName() {
        return remoteFileName;
    }

    /**
     * Sets the value of the remoteFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteFileName(String value) {
        this.remoteFileName = value;
    }

    /**
     * Gets the value of the docComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocComment() {
        return docComment;
    }

    /**
     * Sets the value of the docComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocComment(String value) {
        this.docComment = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
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

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageType(String value) {
        this.imageType = value;
    }

    /**
     * Gets the value of the imageSize property.
     * 
     * @return
     *     possible object is
     *     {@link FileSizeType }
     *     
     */
    public FileSizeType getImageSize() {
        return imageSize;
    }

    /**
     * Sets the value of the imageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSizeType }
     *     
     */
    public void setImageSize(FileSizeType value) {
        this.imageSize = value;
    }

    /**
     * Gets the value of the transitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitName() {
        return transitName;
    }

    /**
     * Sets the value of the transitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitName(String value) {
        this.transitName = value;
    }

    /**
     * Gets the value of the attachmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    /**
     * Sets the value of the attachmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentId(String value) {
        this.attachmentId = value;
    }

    /**
     * Gets the value of the copyToSubordinateCases property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyToSubordinateCases() {
        return copyToSubordinateCases;
    }

    /**
     * Sets the value of the copyToSubordinateCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyToSubordinateCases(Boolean value) {
        this.copyToSubordinateCases = value;
    }

}
