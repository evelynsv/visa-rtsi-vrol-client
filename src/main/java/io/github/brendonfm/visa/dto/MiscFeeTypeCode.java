//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MiscFeeTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MiscFeeTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FeeCollection"/>
 *     &lt;enumeration value="FundDisbursement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MiscFeeTypeCode")
@XmlEnum
public enum MiscFeeTypeCode {

    @XmlEnumValue("FeeCollection")
    FEE_COLLECTION("FeeCollection"),
    @XmlEnumValue("FundDisbursement")
    FUND_DISBURSEMENT("FundDisbursement");
    private final String value;

    MiscFeeTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MiscFeeTypeCode fromValue(String v) {
        for (MiscFeeTypeCode c: MiscFeeTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
