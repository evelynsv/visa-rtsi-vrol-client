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
 * <p>Java class for AssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RolTransactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Associated" type="{http://www.visa.com/ROLSI}YNType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociationType", propOrder = {
    "rolTransactionId",
    "associated"
})
public class AssociationType {

    @XmlElement(name = "RolTransactionId")
    protected long rolTransactionId;
    @XmlElement(name = "Associated", required = true)
    @XmlSchemaType(name = "string")
    protected YNType associated;

    /**
     * Gets the value of the rolTransactionId property.
     * 
     */
    public long getRolTransactionId() {
        return rolTransactionId;
    }

    /**
     * Sets the value of the rolTransactionId property.
     * 
     */
    public void setRolTransactionId(long value) {
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
