//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitiatePreArbReasonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InitiatePreArbReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ND"/>
 *     &lt;enumeration value="CP"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="CE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InitiatePreArbReasonType")
@XmlEnum
public enum InitiatePreArbReasonType {

    ND,
    CP,
    ID,
    MI,
    CE;

    public String value() {
        return name();
    }

    public static InitiatePreArbReasonType fromValue(String v) {
        return valueOf(v);
    }

}
