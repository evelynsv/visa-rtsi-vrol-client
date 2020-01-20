//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import java.io.Serializable;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class DisputeFraudType implements Serializable {

	private static final long serialVersionUID = -3051062989675261106L;
	
	@JsonProperty("CardStatusWhenTransactionHappened")
    protected CardStatusWhenTransactionHappenedType cardStatusWhenTransactionHappened;
    @JsonProperty("FraudOtherExplanation")
    protected String fraudOtherExplanation;
    @JsonProperty("PinPreferringCard")
    protected YNType pinPreferringCard;
    @JsonProperty("ChipOnCard")
    protected YNType chipOnCard;
    @JsonProperty("CardholderDeniesAuthorizingInd")
    protected Boolean cardholderDeniesAuthorizingInd;
    @JsonProperty("CardholderOnlineBankingCertificationObtainedInd")
    protected Boolean cardholderOnlineBankingCertificationObtainedInd;
    @JsonProperty("UniqueIdentity")
    protected String uniqueIdentity;
    @JsonProperty("CardholderTeleBankingCertificationObtainedInd")
    protected Boolean cardholderTeleBankingCertificationObtainedInd;
    @JsonProperty("DateAndTimeOfCall")
    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss",
	shape = JsonFormat.Shape.STRING,
	locale = "pt-BR",
	timezone = "Brazil/East")
    protected Date dateAndTimeOfCall;
    @JsonProperty("NameOfIssuerRepresentative")
    protected String nameOfIssuerRepresentative;

    /**
     * Gets the value of the cardStatusWhenTransactionHappened property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatusWhenTransactionHappenedType }
     *     
     */
    public CardStatusWhenTransactionHappenedType getCardStatusWhenTransactionHappened() {
        return cardStatusWhenTransactionHappened;
    }

    /**
     * Sets the value of the cardStatusWhenTransactionHappened property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatusWhenTransactionHappenedType }
     *     
     */
    public void setCardStatusWhenTransactionHappened(CardStatusWhenTransactionHappenedType value) {
        this.cardStatusWhenTransactionHappened = value;
    }

    /**
     * Gets the value of the fraudOtherExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudOtherExplanation() {
        return fraudOtherExplanation;
    }

    /**
     * Sets the value of the fraudOtherExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudOtherExplanation(String value) {
        this.fraudOtherExplanation = value;
    }

    /**
     * Gets the value of the pinPreferringCard property.
     * 
     * @return
     *     possible object is
     *     {@link YNType }
     *     
     */
    public YNType getPinPreferringCard() {
        return pinPreferringCard;
    }

    /**
     * Sets the value of the pinPreferringCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNType }
     *     
     */
    public void setPinPreferringCard(YNType value) {
        this.pinPreferringCard = value;
    }

    /**
     * Gets the value of the chipOnCard property.
     * 
     * @return
     *     possible object is
     *     {@link YNType }
     *     
     */
    public YNType getChipOnCard() {
        return chipOnCard;
    }

    /**
     * Sets the value of the chipOnCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link YNType }
     *     
     */
    public void setChipOnCard(YNType value) {
        this.chipOnCard = value;
    }

    /**
     * Gets the value of the cardholderDeniesAuthorizingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardholderDeniesAuthorizingInd() {
        return cardholderDeniesAuthorizingInd;
    }

    /**
     * Sets the value of the cardholderDeniesAuthorizingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardholderDeniesAuthorizingInd(Boolean value) {
        this.cardholderDeniesAuthorizingInd = value;
    }

    /**
     * Gets the value of the cardholderOnlineBankingCertificationObtainedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardholderOnlineBankingCertificationObtainedInd() {
        return cardholderOnlineBankingCertificationObtainedInd;
    }

    /**
     * Sets the value of the cardholderOnlineBankingCertificationObtainedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardholderOnlineBankingCertificationObtainedInd(Boolean value) {
        this.cardholderOnlineBankingCertificationObtainedInd = value;
    }

    /**
     * Gets the value of the uniqueIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueIdentity() {
        return uniqueIdentity;
    }

    /**
     * Sets the value of the uniqueIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueIdentity(String value) {
        this.uniqueIdentity = value;
    }

    /**
     * Gets the value of the cardholderTeleBankingCertificationObtainedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardholderTeleBankingCertificationObtainedInd() {
        return cardholderTeleBankingCertificationObtainedInd;
    }

    /**
     * Sets the value of the cardholderTeleBankingCertificationObtainedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardholderTeleBankingCertificationObtainedInd(Boolean value) {
        this.cardholderTeleBankingCertificationObtainedInd = value;
    }

    /**
     * Gets the value of the dateAndTimeOfCall property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDateAndTimeOfCall() {
        return dateAndTimeOfCall;
    }

    /**
     * Sets the value of the dateAndTimeOfCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTimeOfCall(Date value) {
        this.dateAndTimeOfCall = value;
    }

    /**
     * Gets the value of the nameOfIssuerRepresentative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfIssuerRepresentative() {
        return nameOfIssuerRepresentative;
    }

    /**
     * Sets the value of the nameOfIssuerRepresentative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfIssuerRepresentative(String value) {
        this.nameOfIssuerRepresentative = value;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cardStatusWhenTransactionHappened == null) ? 0 : cardStatusWhenTransactionHappened.hashCode());
		result = prime * result
				+ ((cardholderDeniesAuthorizingInd == null) ? 0 : cardholderDeniesAuthorizingInd.hashCode());
		result = prime * result + ((cardholderOnlineBankingCertificationObtainedInd == null) ? 0
				: cardholderOnlineBankingCertificationObtainedInd.hashCode());
		result = prime * result + ((cardholderTeleBankingCertificationObtainedInd == null) ? 0
				: cardholderTeleBankingCertificationObtainedInd.hashCode());
		result = prime * result + ((chipOnCard == null) ? 0 : chipOnCard.hashCode());
		result = prime * result + ((dateAndTimeOfCall == null) ? 0 : dateAndTimeOfCall.hashCode());
		result = prime * result + ((fraudOtherExplanation == null) ? 0 : fraudOtherExplanation.hashCode());
		result = prime * result + ((nameOfIssuerRepresentative == null) ? 0 : nameOfIssuerRepresentative.hashCode());
		result = prime * result + ((pinPreferringCard == null) ? 0 : pinPreferringCard.hashCode());
		result = prime * result + ((uniqueIdentity == null) ? 0 : uniqueIdentity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DisputeFraudType other = (DisputeFraudType) obj;
		if (cardStatusWhenTransactionHappened != other.cardStatusWhenTransactionHappened)
			return false;
		if (cardholderDeniesAuthorizingInd == null) {
			if (other.cardholderDeniesAuthorizingInd != null)
				return false;
		} else if (!cardholderDeniesAuthorizingInd.equals(other.cardholderDeniesAuthorizingInd))
			return false;
		if (cardholderOnlineBankingCertificationObtainedInd == null) {
			if (other.cardholderOnlineBankingCertificationObtainedInd != null)
				return false;
		} else if (!cardholderOnlineBankingCertificationObtainedInd
				.equals(other.cardholderOnlineBankingCertificationObtainedInd))
			return false;
		if (cardholderTeleBankingCertificationObtainedInd == null) {
			if (other.cardholderTeleBankingCertificationObtainedInd != null)
				return false;
		} else if (!cardholderTeleBankingCertificationObtainedInd
				.equals(other.cardholderTeleBankingCertificationObtainedInd))
			return false;
		if (chipOnCard != other.chipOnCard)
			return false;
		if (dateAndTimeOfCall == null) {
			if (other.dateAndTimeOfCall != null)
				return false;
		} else if (!dateAndTimeOfCall.equals(other.dateAndTimeOfCall))
			return false;
		if (fraudOtherExplanation == null) {
			if (other.fraudOtherExplanation != null)
				return false;
		} else if (!fraudOtherExplanation.equals(other.fraudOtherExplanation))
			return false;
		if (nameOfIssuerRepresentative == null) {
			if (other.nameOfIssuerRepresentative != null)
				return false;
		} else if (!nameOfIssuerRepresentative.equals(other.nameOfIssuerRepresentative))
			return false;
		if (pinPreferringCard != other.pinPreferringCard)
			return false;
		if (uniqueIdentity == null) {
			if (other.uniqueIdentity != null)
				return false;
		} else if (!uniqueIdentity.equals(other.uniqueIdentity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DisputeFraudType [cardStatusWhenTransactionHappened=" + cardStatusWhenTransactionHappened
				+ ", fraudOtherExplanation=" + fraudOtherExplanation + ", pinPreferringCard=" + pinPreferringCard
				+ ", chipOnCard=" + chipOnCard + ", cardholderDeniesAuthorizingInd=" + cardholderDeniesAuthorizingInd
				+ ", cardholderOnlineBankingCertificationObtainedInd=" + cardholderOnlineBankingCertificationObtainedInd
				+ ", uniqueIdentity=" + uniqueIdentity + ", cardholderTeleBankingCertificationObtainedInd="
				+ cardholderTeleBankingCertificationObtainedInd + ", dateAndTimeOfCall=" + dateAndTimeOfCall
				+ ", nameOfIssuerRepresentative=" + nameOfIssuerRepresentative + "]";
	}
    
    

}
