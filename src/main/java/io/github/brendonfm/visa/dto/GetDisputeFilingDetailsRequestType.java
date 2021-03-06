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
 * <p>Java class for GetDisputeFilingDetailsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDisputeFilingDetailsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber"/>
 *         &lt;element name="DisputeFilingItemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IncludeDisputeAsImageInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DownloadImageInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDisputeFilingDetailsRequestType", propOrder = {
    "visaCaseNumber",
    "disputeFilingItemId",
    "includeDisputeAsImageInd",
    "downloadImageInd"
})
public class GetDisputeFilingDetailsRequestType {

    @XmlElement(name = "VisaCaseNumber")
    protected long visaCaseNumber;
    @XmlElement(name = "DisputeFilingItemId")
    protected long disputeFilingItemId;
    @XmlElement(name = "IncludeDisputeAsImageInd")
    protected Boolean includeDisputeAsImageInd;
    @XmlElement(name = "DownloadImageInd")
    protected Boolean downloadImageInd;

    /**
     * Gets the value of the visaCaseNumber property.
     * 
     */
    public long getVisaCaseNumber() {
        return visaCaseNumber;
    }

    /**
     * Sets the value of the visaCaseNumber property.
     * 
     */
    public void setVisaCaseNumber(long value) {
        this.visaCaseNumber = value;
    }

    /**
     * Gets the value of the disputeFilingItemId property.
     * 
     */
    public long getDisputeFilingItemId() {
        return disputeFilingItemId;
    }

    /**
     * Sets the value of the disputeFilingItemId property.
     * 
     */
    public void setDisputeFilingItemId(long value) {
        this.disputeFilingItemId = value;
    }

    /**
     * Gets the value of the includeDisputeAsImageInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDisputeAsImageInd() {
        return includeDisputeAsImageInd;
    }

    /**
     * Sets the value of the includeDisputeAsImageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDisputeAsImageInd(Boolean value) {
        this.includeDisputeAsImageInd = value;
    }

    /**
     * Gets the value of the downloadImageInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDownloadImageInd() {
        return downloadImageInd;
    }

    /**
     * Sets the value of the downloadImageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDownloadImageInd(Boolean value) {
        this.downloadImageInd = value;
    }

}
