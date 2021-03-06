//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RTSIRFCSwitchStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTSIRFCSwitchStatusResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}RFCID"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}SwitchingSystemStatus" maxOccurs="6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTSIRFCSwitchStatusResponseType", propOrder = {
    "visaCaseNumber",
    "rfcid",
    "switchingSystemStatus"
})
public class RTSIRFCSwitchStatusResponseType {

    @XmlElement(name = "VisaCaseNumber")
    protected long visaCaseNumber;
    @XmlElement(name = "RFCID")
    protected long rfcid;
    @XmlElement(name = "SwitchingSystemStatus")
    protected List<SwitchingSystemStatusType> switchingSystemStatus;

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
     * Gets the value of the switchingSystemStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the switchingSystemStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwitchingSystemStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchingSystemStatusType }
     * 
     * 
     */
    public List<SwitchingSystemStatusType> getSwitchingSystemStatus() {
        if (switchingSystemStatus == null) {
            switchingSystemStatus = new ArrayList<SwitchingSystemStatusType>();
        }
        return this.switchingSystemStatus;
    }

}
