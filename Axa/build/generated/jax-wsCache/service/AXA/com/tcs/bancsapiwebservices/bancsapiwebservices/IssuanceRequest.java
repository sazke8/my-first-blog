
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for issuanceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="issuanceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="issuance" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}issuance"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issuanceRequest", propOrder = {
    "issuance"
})
public class IssuanceRequest {

    @XmlElement(required = true)
    protected Issuance issuance;

    /**
     * Gets the value of the issuance property.
     * 
     * @return
     *     possible object is
     *     {@link Issuance }
     *     
     */
    public Issuance getIssuance() {
        return issuance;
    }

    /**
     * Sets the value of the issuance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Issuance }
     *     
     */
    public void setIssuance(Issuance value) {
        this.issuance = value;
    }

}
