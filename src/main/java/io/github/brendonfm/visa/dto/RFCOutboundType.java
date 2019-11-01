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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Request for Copy Sent to member (not advice)
 * 
 * <p>Java class for RFCOutboundType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RFCOutboundType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.visa.com/ROLSI}RFCType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CardholderName" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}CPD" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}RFCCPD" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}SrcAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}SwitchingSystemStatus" maxOccurs="6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFCOutboundType", propOrder = {
    "cardholderName",
    "cpd",
    "rfccpd",
    "srcAmt",
    "switchingSystemStatus"
})
@XmlSeeAlso({
    RequestForCopyType.class
})
public class RFCOutboundType
    extends RFCType
{

    @XmlElement(name = "CardholderName")
    protected String cardholderName;
    @XmlElement(name = "CPD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cpd;
    @XmlElement(name = "RFCCPD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rfccpd;
    @XmlElement(name = "SrcAmt")
    protected AmountType srcAmt;
    @XmlElement(name = "SwitchingSystemStatus")
    protected List<SwitchingSystemStatusType> switchingSystemStatus;

    /**
     * Gets the value of the cardholderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderName() {
        return cardholderName;
    }

    /**
     * Sets the value of the cardholderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderName(String value) {
        this.cardholderName = value;
    }

    /**
     * Gets the value of the cpd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCPD() {
        return cpd;
    }

    /**
     * Sets the value of the cpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCPD(XMLGregorianCalendar value) {
        this.cpd = value;
    }

    /**
     * Gets the value of the rfccpd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRFCCPD() {
        return rfccpd;
    }

    /**
     * Sets the value of the rfccpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRFCCPD(XMLGregorianCalendar value) {
        this.rfccpd = value;
    }

    /**
     * Gets the value of the srcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSrcAmt() {
        return srcAmt;
    }

    /**
     * Sets the value of the srcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSrcAmt(AmountType value) {
        this.srcAmt = value;
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
