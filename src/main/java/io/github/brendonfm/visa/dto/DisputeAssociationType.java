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
 * <p>Java class for DisputeAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeAssociationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RolTransactionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Associated" type="{http://www.visa.com/ROLSI}YNType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeAssociationType", propOrder = {
    "rolTransactionId",
    "associated"
})
public class DisputeAssociationType {

    @XmlElement(name = "RolTransactionId")
    protected Long rolTransactionId;
    @XmlElement(name = "Associated")
    @XmlSchemaType(name = "string")
    protected YNType associated;

    /**
     * Gets the value of the rolTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRolTransactionId() {
        return rolTransactionId;
    }

    /**
     * Sets the value of the rolTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRolTransactionId(Long value) {
        this.rolTransactionId = value;
    }

    /**
     * Gets the value of the associated property.
     * 
     * @return
     *     possible object is
     *     {@link YNType }
     *     
     */
    public YNType getAssociated() {
        return associated;
    }

    /**
     * Sets the value of the associated property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNType }
     *     
     */
    public void setAssociated(YNType value) {
        this.associated = value;
    }

}
