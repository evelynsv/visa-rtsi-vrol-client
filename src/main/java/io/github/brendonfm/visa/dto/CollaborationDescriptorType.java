//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollaborationDescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollaborationDescriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.visa.com/ROLSI}TransactionInfo" minOccurs="0"/>
 *         &lt;group ref="{http://www.visa.com/ROLSI}CollaborationDataGroup"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.visa.com/ROLSI}CollaborationAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborationDescriptorType", propOrder = {
    "transactionInfo",
    "collaborationResp",
    "collaboration",
    "recall"
})
public class CollaborationDescriptorType {

    @XmlElement(name = "TransactionInfo")
    protected TranHeaderInfoType transactionInfo;
    @XmlElement(name = "CollaborationResp")
    protected RespondOrFollowupType collaborationResp;
    @XmlElement(name = "Collaboration")
    protected InitiateOrFollowupType collaboration;
    @XmlElement(name = "Recall")
    protected CollaborationRecallType recall;
    @XmlAttribute(name = "id", required = true)
    protected long id;
    @XmlAttribute(name = "operation", required = true)
    protected CollabOpType operation;
    @XmlAttribute(name = "action", required = true)
    protected CollaborationActionType action;

    /**
     * Gets the value of the transactionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TranHeaderInfoType }
     *     
     */
    public TranHeaderInfoType getTransactionInfo() {
        return transactionInfo;
    }

    /**
     * Sets the value of the transactionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranHeaderInfoType }
     *     
     */
    public void setTransactionInfo(TranHeaderInfoType value) {
        this.transactionInfo = value;
    }

    /**
     * Gets the value of the collaborationResp property.
     * 
     * @return
     *     possible object is
     *     {@link RespondOrFollowupType }
     *     
     */
    public RespondOrFollowupType getCollaborationResp() {
        return collaborationResp;
    }

    /**
     * Sets the value of the collaborationResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespondOrFollowupType }
     *     
     */
    public void setCollaborationResp(RespondOrFollowupType value) {
        this.collaborationResp = value;
    }

    /**
     * Gets the value of the collaboration property.
     * 
     * @return
     *     possible object is
     *     {@link InitiateOrFollowupType }
     *     
     */
    public InitiateOrFollowupType getCollaboration() {
        return collaboration;
    }

    /**
     * Sets the value of the collaboration property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitiateOrFollowupType }
     *     
     */
    public void setCollaboration(InitiateOrFollowupType value) {
        this.collaboration = value;
    }

    /**
     * Gets the value of the recall property.
     * 
     * @return
     *     possible object is
     *     {@link CollaborationRecallType }
     *     
     */
    public CollaborationRecallType getRecall() {
        return recall;
    }

    /**
     * Sets the value of the recall property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborationRecallType }
     *     
     */
    public void setRecall(CollaborationRecallType value) {
        this.recall = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link CollabOpType }
     *     
     */
    public CollabOpType getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollabOpType }
     *     
     */
    public void setOperation(CollabOpType value) {
        this.operation = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link CollaborationActionType }
     *     
     */
    public CollaborationActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborationActionType }
     *     
     */
    public void setAction(CollaborationActionType value) {
        this.action = value;
    }

}