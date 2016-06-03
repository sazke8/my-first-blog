
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for origin.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="origin">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BACK OFFICE"/>
 *     &lt;enumeration value="BATCH"/>
 *     &lt;enumeration value="WEBSERVICE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "origin")
@XmlEnum
public enum Origin {

    @XmlEnumValue("BACK OFFICE")
    BACK_OFFICE("BACK OFFICE"),
    BATCH("BATCH"),
    WEBSERVICE("WEBSERVICE");
    private final String value;

    Origin(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Origin fromValue(String v) {
        for (Origin c: Origin.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
