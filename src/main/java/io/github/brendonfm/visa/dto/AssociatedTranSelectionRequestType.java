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
 * <p>Java class for AssociatedTranSelectionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedTranSelectionRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AssociatedTransGroupId"/>
 *         &lt;element name="CreditChangeReason" type="{http://www.visa.com/ROLSI}CreditChangeReasonType" minOccurs="0"/>
 *         &lt;element name="AuthChangeReason" type="{http://www.visa.com/ROLSI}AuthChangeReasonType" minOccurs="0"/>
 *         &lt;element name="Association" type="{http://www.visa.com/ROLSI}AssociationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedTranSelectionRequestType", propOrder = {
    "visaCaseNumber",
    "associatedTransGroupId",
    "creditChangeReason",
    "authChangeReason",
    "association"
})
public class AssociatedTranSelectionRequestType {

    @XmlElement(name = "VisaCaseNumber")
    protected long visaCaseNumber;
    @XmlElement(name = "AssociatedTransGroupId")
    protected long associatedTransGroupId;
    @XmlElement(name = "CreditChangeReason")
    protected String creditChangeReason;
    @XmlElement(name = "AuthChangeReason")
    protected String authChangeReason;
    @XmlElement(name = "Association")
    protected List<AssociationType> association;

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
     * Gets the value of the associatedTransGroupId property.
     * 
     */
    public long getAssociatedTransGroupId() {
        return associatedTransGroupId;
    }

    /**
     * Sets the value of the associatedTransGroupId property.
     * 
     */
    public void setAssociatedTransGroupId(long value) {
        this.associatedTransGroupId = value;
    }

    /**
     * Gets the value of the creditChangeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditChangeReason() {
        return creditChangeReason;
    }

    /**
     * Sets the value of the creditChangeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditChangeReason(String value) {
        this.creditChangeReason = value;
    }

    /**
     * Gets the value of the authChangeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthChangeReason() {
        return authChangeReason;
    }

    /**
     * Sets the value of the authChangeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthChangeReason(String value) {
        this.authChangeReason = value;
    }

    /**
     * Gets the value of the association property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the association property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationType }
     * 
     * 
     */
    public List<AssociationType> getAssociation() {
        if (association == null) {
            association = new ArrayList<AssociationType>();
        }
        return this.association;
    }

}
