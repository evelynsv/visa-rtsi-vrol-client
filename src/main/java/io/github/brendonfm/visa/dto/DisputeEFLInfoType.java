//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class DisputeEFLInfoType {

    @JsonProperty("EFLActionCode")
    protected EFLActionCodeType eflActionCode;
    @JsonProperty("PurgeOptions")
    protected PurgeOptionsType purgeOptions;
    @JsonProperty("PurgeNoOfDays")
    protected BigInteger purgeNoOfDays;
    @JsonProperty("CardRecoveryBulletinRegions")
    protected CRBRegionType cardRecoveryBulletinRegions;

    /**
     * Gets the value of the eflActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link EFLActionCodeType }
     *     
     */
    public EFLActionCodeType getEFLActionCode() {
        return eflActionCode;
    }

    /**
     * Sets the value of the eflActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFLActionCodeType }
     *     
     */
    public void setEFLActionCode(EFLActionCodeType value) {
        this.eflActionCode = value;
    }

    /**
     * Gets the value of the purgeOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PurgeOptionsType }
     *     
     */
    public PurgeOptionsType getPurgeOptions() {
        return purgeOptions;
    }

    /**
     * Sets the value of the purgeOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurgeOptionsType }
     *     
     */
    public void setPurgeOptions(PurgeOptionsType value) {
        this.purgeOptions = value;
    }

    /**
     * Gets the value of the purgeNoOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPurgeNoOfDays() {
        return purgeNoOfDays;
    }

    /**
     * Sets the value of the purgeNoOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPurgeNoOfDays(BigInteger value) {
        this.purgeNoOfDays = value;
    }

    /**
     * Gets the value of the cardRecoveryBulletinRegions property.
     * 
     * @return
     *     possible object is
     *     {@link CRBRegionType }
     *     
     */
    public CRBRegionType getCardRecoveryBulletinRegions() {
        return cardRecoveryBulletinRegions;
    }

    /**
     * Sets the value of the cardRecoveryBulletinRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRBRegionType }
     *     
     */
    public void setCardRecoveryBulletinRegions(CRBRegionType value) {
        this.cardRecoveryBulletinRegions = value;
    }

}
