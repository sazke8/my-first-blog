
package com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfEquipment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfEquipment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EE"/>
 *     &lt;enumeration value="AD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfEquipment")
@XmlEnum
public enum TypeOfEquipment {

    EE,
    AD;

    public String value() {
        return name();
    }

    public static TypeOfEquipment fromValue(String v) {
        return valueOf(v);
    }

}
