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
 * <p>Java class for AssociatedTranSelectionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedTranSelectionResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}VisaCaseNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.visa.com/ROLSI}AssociatedTransGroupId" minOccurs="0"/>
 *         &lt;element name="RolTransactionIdsList" type="{http://www.visa.com/ROLSI}RolTransactionIdsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedTranSelectionResponseType", propOrder = {
    "visaCaseNumber",
    "associatedTransGroupId",
    "rolTransactionIdsList"
})
public class AssociatedTranSelectionResponseType {

    @XmlElement(name = "VisaCaseNumber")
    protected Long visaCaseNumber;
    @XmlElement(name = "AssociatedTransGroupId")
    protected Long associatedTransGroupId;
    @XmlElement(name = "RolTransactionIdsList")
    protected RolTransactionIdsListType rolTransactionIdsList;

    /**
     * Gets the value of the visaCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisaCaseNumber() {
        return visaCaseNumber;
    }

    /**
     * Sets the value of the visaCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisaCaseNumber(Long value) {
        this.visaCaseNumber = value;
    }

    /**
     * Gets the value of the associatedTransGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssociatedTransGroupId() {
        return associatedTransGroupId;
    }

    /**
     * Sets the value of the associatedTransGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssociatedTransGroupId(Long value) {
        this.associatedTransGroupId = value;
    }

    /**
     * Gets the value of the rolTransactionIdsList property.
     * 
     * @return
     *     possible object is
     *     {@link RolTransactionIdsListType }
     *     
     */
    public RolTransactionIdsListType getRolTransactionIdsList() {
        return rolTransactionIdsList;
    }

    /**
     * Sets the value of the rolTransactionIdsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RolTransactionIdsListType }
     *     
     */
    public void setRolTransactionIdsList(RolTransactionIdsListType value) {
        this.rolTransactionIdsList = value;
    }

}
