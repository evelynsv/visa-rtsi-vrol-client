//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.01 at 09:57:25 PM GMT 
//


package io.github.brendonfm.visa.dto;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MerchandiseOrServicesType {

    MERCHANDISE("Merchandise"),
    SERVICES("Services");
	
    private final String value;

    MerchandiseOrServicesType(String v) {
        value = v;
    }

    @JsonValue
    public String value() {
        return value;
    }

    public static MerchandiseOrServicesType fromValue(String v) {
        for (MerchandiseOrServicesType c: MerchandiseOrServicesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
