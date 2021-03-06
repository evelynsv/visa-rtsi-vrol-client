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
 * <p>Java class for MsgType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MsgType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RPPMessage"/>
 *     &lt;enumeration value="RPPMessageResp"/>
 *     &lt;enumeration value="Message"/>
 *     &lt;enumeration value="MessageResp"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MsgType")
@XmlEnum
public enum MsgType {

    @XmlEnumValue("RPPMessage")
    RPP_MESSAGE("RPPMessage"),
    @XmlEnumValue("RPPMessageResp")
    RPP_MESSAGE_RESP("RPPMessageResp"),
    @XmlEnumValue("Message")
    MESSAGE("Message"),
    @XmlEnumValue("MessageResp")
    MESSAGE_RESP("MessageResp");
    private final String value;

    MsgType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MsgType fromValue(String v) {
        for (MsgType c: MsgType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
