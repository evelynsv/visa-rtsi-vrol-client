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
 * <p>Java class for UnmatchedItemResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnmatchedItemResponseBodyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.visa.com/ROLSI}ResponseBodyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="RetrievePotentialMatchesResponse" type="{http://www.visa.com/ROLSI}RetrievePotentialMatchesResponseType"/>
 *           &lt;element name="IgnoreUnmatchedItemResponse" type="{http://www.visa.com/ROLSI}IgnoreUnmatchedItemResponseType"/>
 *           &lt;element name="AddUnmatchedItemToCaseResponse" type="{http://www.visa.com/ROLSI}AddUnmatchedItemToCaseResponseType"/>
 *           &lt;element name="LinkAsSameDisputeResponse" type="{http://www.visa.com/ROLSI}AddUnmatchedItemToCaseResponseType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnmatchedItemResponseBodyType", propOrder = {
    "retrievePotentialMatchesResponse",
    "ignoreUnmatchedItemResponse",
    "addUnmatchedItemToCaseResponse",
    "linkAsSameDisputeResponse"
})
public class UnmatchedItemResponseBodyType
    extends ResponseBodyType
{

    @XmlElement(name = "RetrievePotentialMatchesResponse")
    protected RetrievePotentialMatchesResponseType retrievePotentialMatchesResponse;
    @XmlElement(name = "IgnoreUnmatchedItemResponse")
    protected IgnoreUnmatchedItemResponseType ignoreUnmatchedItemResponse;
    @XmlElement(name = "AddUnmatchedItemToCaseResponse")
    protected AddUnmatchedItemToCaseResponseType addUnmatchedItemToCaseResponse;
    @XmlElement(name = "LinkAsSameDisputeResponse")
    protected AddUnmatchedItemToCaseResponseType linkAsSameDisputeResponse;

    /**
     * Gets the value of the retrievePotentialMatchesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievePotentialMatchesResponseType }
     *     
     */
    public RetrievePotentialMatchesResponseType getRetrievePotentialMatchesResponse() {
        return retrievePotentialMatchesResponse;
    }

    /**
     * Sets the value of the retrievePotentialMatchesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievePotentialMatchesResponseType }
     *     
     */
    public void setRetrievePotentialMatchesResponse(RetrievePotentialMatchesResponseType value) {
        this.retrievePotentialMatchesResponse = value;
    }

    /**
     * Gets the value of the ignoreUnmatchedItemResponse property.
     * 
     * @return
     *     possible object is
     *     {@link IgnoreUnmatchedItemResponseType }
     *     
     */
    public IgnoreUnmatchedItemResponseType getIgnoreUnmatchedItemResponse() {
        return ignoreUnmatchedItemResponse;
    }

    /**
     * Sets the value of the ignoreUnmatchedItemResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link IgnoreUnmatchedItemResponseType }
     *     
     */
    public void setIgnoreUnmatchedItemResponse(IgnoreUnmatchedItemResponseType value) {
        this.ignoreUnmatchedItemResponse = value;
    }

    /**
     * Gets the value of the addUnmatchedItemToCaseResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AddUnmatchedItemToCaseResponseType }
     *     
     */
    public AddUnmatchedItemToCaseResponseType getAddUnmatchedItemToCaseResponse() {
        return addUnmatchedItemToCaseResponse;
    }

    /**
     * Sets the value of the addUnmatchedItemToCaseResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddUnmatchedItemToCaseResponseType }
     *     
     */
    public void setAddUnmatchedItemToCaseResponse(AddUnmatchedItemToCaseResponseType value) {
        this.addUnmatchedItemToCaseResponse = value;
    }

    /**
     * Gets the value of the linkAsSameDisputeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AddUnmatchedItemToCaseResponseType }
     *     
     */
    public AddUnmatchedItemToCaseResponseType getLinkAsSameDisputeResponse() {
        return linkAsSameDisputeResponse;
    }

    /**
     * Sets the value of the linkAsSameDisputeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddUnmatchedItemToCaseResponseType }
     *     
     */
    public void setLinkAsSameDisputeResponse(AddUnmatchedItemToCaseResponseType value) {
        this.linkAsSameDisputeResponse = value;
    }

}
