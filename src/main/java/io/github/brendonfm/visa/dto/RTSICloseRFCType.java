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
 * <p>Java class for RTSICloseRFCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTSICloseRFCType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}RFCID"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTSICloseRFCType", propOrder = {
    "rfcid",
    "visaCaseNumber"
})
public class RTSICloseRFCType {

    @XmlElement(name = "RFCID")
    protected long rfcid;
    @XmlElement(name = "VisaCaseNumber")
    protected long visaCaseNumber;

    /**
     * Gets the value of the rfcid property.
     * 
     */
    public long getRFCID() {
        return rfcid;
    }

    /**
     * Sets the value of the rfcid property.
     * 
     */
    public void setRFCID(long value) {
        this.rfcid = value;
    }

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

}