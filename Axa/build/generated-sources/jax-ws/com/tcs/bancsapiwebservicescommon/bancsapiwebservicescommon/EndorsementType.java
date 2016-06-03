
package com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndorsementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EndorsementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EndorsementType")
@XmlEnum
public enum EndorsementType {

    A,
    D,
    B;

    public String value() {
        return name();
    }

    public static EndorsementType fromValue(String v) {
        return valueOf(v);
    }

}
