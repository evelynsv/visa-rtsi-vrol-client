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
 * <p>Java class for ContactMessagesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactMessagesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactMessageId" type="{http://www.visa.com/ROLSI}ContactMessageIdIndType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactMessageResponseId" type="{http://www.visa.com/ROLSI}ContactMessageResponseIdIndType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMessagesType", propOrder = {
    "contactMessageId",
    "contactMessageResponseId"
})
public class ContactMessagesType {

    @XmlElement(name = "ContactMessageId")
    protected List<ContactMessageIdIndType> contactMessageId;
    @XmlElement(name = "ContactMessageResponseId")
    protected List<ContactMessageResponseIdIndType> contactMessageResponseId;

    /**
     * Gets the value of the contactMessageId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactMessageId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactMessageId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactMessageIdIndType }
     * 
     * 
     */
    public List<ContactMessageIdIndType> getContactMessageId() {
        if (contactMessageId == null) {
            contactMessageId = new ArrayList<ContactMessageIdIndType>();
        }
        return this.contactMessageId;
    }

    /**
     * Gets the value of the contactMessageResponseId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactMessageResponseId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactMessageResponseId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactMessageResponseIdIndType }
     * 
     * 
     */
    public List<ContactMessageResponseIdIndType> getContactMessageResponseId() {
        if (contactMessageResponseId == null) {
            contactMessageResponseId = new ArrayList<ContactMessageResponseIdIndType>();
        }
        return this.contactMessageResponseId;
    }

}
