//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.11.01 at 09:57:25 PM GMT
//

package io.github.brendonfm.visa.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class SubmitFraudReportResponseType {

	@JsonProperty(value = "VisaCaseNumber")
	protected long visaCaseNumber;
	@JsonProperty(value = "FraudReportID")
	protected long fraudReportID;

	/**
	 * Gets the value of the visaCaseNumber property.
	 */
	public long getVisaCaseNumber() {
		return visaCaseNumber;
	}

	/**
	 * Sets the value of the visaCaseNumber property.
	 */
	public void setVisaCaseNumber(final long value) {
		this.visaCaseNumber = value;
	}

	/**
	 * Gets the value of the fraudReportID property.
	 */
	public long getFraudReportID() {
		return fraudReportID;
	}

	/**
	 * Sets the value of the fraudReportID property.
	 */
	public void setFraudReportID(final long value) {
		this.fraudReportID = value;
	}

}
