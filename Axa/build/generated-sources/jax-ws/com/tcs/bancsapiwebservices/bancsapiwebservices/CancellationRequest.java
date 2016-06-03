
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cancellationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancellationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancellation" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}cancellation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancellationRequest", propOrder = {
    "cancellation"
})
public class CancellationRequest {

    @XmlElement(required = true)
    protected Cancellation cancellation;

    /**
     * Gets the value of the cancellation property.
     * 
     * @return
     *     possible object is
     *     {@link Cancellation }
     *     
     */
    public Cancellation getCancellation() {
        return cancellation;
    }

    /**
     * Sets the value of the cancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cancellation }
     *     
     */
    public void setCancellation(Cancellation value) {
        this.cancellation = value;
    }

}
