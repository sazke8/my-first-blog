
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.PartyInfo;


/**
 * <p>Java class for endorsePartyDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endorsePartyDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="riskNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyDetails" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}partyInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endorsePartyDetails", propOrder = {
    "riskNumber",
    "partyDetails"
})
public class EndorsePartyDetails {

    protected String riskNumber;
    @XmlElement(required = true)
    protected PartyInfo partyDetails;

    /**
     * Gets the value of the riskNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskNumber() {
        return riskNumber;
    }

    /**
     * Sets the value of the riskNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskNumber(String value) {
        this.riskNumber = value;
    }

    /**
     * Gets the value of the partyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PartyInfo }
     *     
     */
    public PartyInfo getPartyDetails() {
        return partyDetails;
    }

    /**
     * Sets the value of the partyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInfo }
     *     
     */
    public void setPartyDetails(PartyInfo value) {
        this.partyDetails = value;
    }

}
