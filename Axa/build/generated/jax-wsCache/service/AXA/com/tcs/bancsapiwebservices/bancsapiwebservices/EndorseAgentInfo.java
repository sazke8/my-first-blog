
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for endorseAgentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endorseAgentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oldAgentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endorseAgentInfo", propOrder = {
    "oldAgentCode",
    "newAgentCode"
})
public class EndorseAgentInfo {

    protected String oldAgentCode;
    @XmlElement(required = true)
    protected String newAgentCode;

    /**
     * Gets the value of the oldAgentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldAgentCode() {
        return oldAgentCode;
    }

    /**
     * Sets the value of the oldAgentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldAgentCode(String value) {
        this.oldAgentCode = value;
    }

    /**
     * Gets the value of the newAgentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewAgentCode() {
        return newAgentCode;
    }

    /**
     * Sets the value of the newAgentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewAgentCode(String value) {
        this.newAgentCode = value;
    }

}
