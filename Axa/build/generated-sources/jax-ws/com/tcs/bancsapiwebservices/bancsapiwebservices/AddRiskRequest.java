
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addRiskRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addRiskRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addRisk" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}addRisk"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addRiskRequest", propOrder = {
    "addRisk"
})
public class AddRiskRequest {

    @XmlElement(required = true)
    protected AddRisk addRisk;

    /**
     * Gets the value of the addRisk property.
     * 
     * @return
     *     possible object is
     *     {@link AddRisk }
     *     
     */
    public AddRisk getAddRisk() {
        return addRisk;
    }

    /**
     * Sets the value of the addRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddRisk }
     *     
     */
    public void setAddRisk(AddRisk value) {
        this.addRisk = value;
    }

}
