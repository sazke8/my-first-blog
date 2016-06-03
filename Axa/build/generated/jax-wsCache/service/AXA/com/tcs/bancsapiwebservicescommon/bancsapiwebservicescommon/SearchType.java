
package com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="searchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POLICY"/>
 *     &lt;enumeration value="QUOTE"/>
 *     &lt;enumeration value="RENEWAL_QUOTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "searchType")
@XmlEnum
public enum SearchType {

    POLICY,
    QUOTE,
    RENEWAL_QUOTE;

    public String value() {
        return name();
    }

    public static SearchType fromValue(String v) {
        return valueOf(v);
    }

}
