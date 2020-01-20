//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class IssuerAcquirerContactInfoType implements Serializable {

	private static final long serialVersionUID = 7833499468513054298L;
	
	@JsonProperty("ContactName")
    protected String contactName;
    @JsonProperty("ContactPhone")
    protected String contactPhone;
    @JsonProperty("ContactFax")
    protected String contactFax;
    @JsonProperty("ContactOther")
    protected String contactOther;
    @JsonProperty("ContactEmail")
    protected String contactEmail;

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the contactFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFax() {
        return contactFax;
    }

    /**
     * Sets the value of the contactFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFax(String value) {
        this.contactFax = value;
    }

    /**
     * Gets the value of the contactOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactOther() {
        return contactOther;
    }

    /**
     * Sets the value of the contactOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactOther(String value) {
        this.contactOther = value;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contactEmail == null) ? 0 : contactEmail.hashCode());
		result = prime * result + ((contactFax == null) ? 0 : contactFax.hashCode());
		result = prime * result + ((contactName == null) ? 0 : contactName.hashCode());
		result = prime * result + ((contactOther == null) ? 0 : contactOther.hashCode());
		result = prime * result + ((contactPhone == null) ? 0 : contactPhone.hashCode());
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
		IssuerAcquirerContactInfoType other = (IssuerAcquirerContactInfoType) obj;
		if (contactEmail == null) {
			if (other.contactEmail != null)
				return false;
		} else if (!contactEmail.equals(other.contactEmail))
			return false;
		if (contactFax == null) {
			if (other.contactFax != null)
				return false;
		} else if (!contactFax.equals(other.contactFax))
			return false;
		if (contactName == null) {
			if (other.contactName != null)
				return false;
		} else if (!contactName.equals(other.contactName))
			return false;
		if (contactOther == null) {
			if (other.contactOther != null)
				return false;
		} else if (!contactOther.equals(other.contactOther))
			return false;
		if (contactPhone == null) {
			if (other.contactPhone != null)
				return false;
		} else if (!contactPhone.equals(other.contactPhone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IssuerAcquirerContactInfoType [contactName=" + contactName + ", contactPhone=" + contactPhone
				+ ", contactFax=" + contactFax + ", contactOther=" + contactOther + ", contactEmail=" + contactEmail
				+ "]";
	}
    
    

}
