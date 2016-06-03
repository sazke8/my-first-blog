
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for endorsementRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endorsementRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endorsement" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}endorsement"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endorsementRequest", propOrder = {
    "endorsement"
})
public class EndorsementRequest {

    @XmlElement(required = true)
    protected Endorsement endorsement;

    /**
     * Gets the value of the endorsement property.
     * 
     * @return
     *     possible object is
     *     {@link Endorsement }
     *     
     */
    public Endorsement getEndorsement() {
        return endorsement;
    }

    /**
     * Sets the value of the endorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Endorsement }
     *     
     */
    public void setEndorsement(Endorsement value) {
        this.endorsement = value;
    }

}
