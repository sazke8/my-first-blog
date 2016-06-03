
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.Action;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.PartyInfo;


/**
 * <p>Java class for endorseCustomerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endorseCustomerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="riskNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}action"/>
 *         &lt;element name="endorseCustomerDetails" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}partyInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endorseCustomerInfo", propOrder = {
    "riskNumber",
    "action",
    "endorseCustomerDetails"
})
public class EndorseCustomerInfo {

    protected String riskNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Action action;
    @XmlElement(required = true, nillable = true)
    protected PartyInfo endorseCustomerDetails;

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
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setAction(Action value) {
        this.action = value;
    }

    /**
     * Gets the value of the endorseCustomerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PartyInfo }
     *     
     */
    public PartyInfo getEndorseCustomerDetails() {
        return endorseCustomerDetails;
    }

    /**
     * Sets the value of the endorseCustomerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInfo }
     *     
     */
    public void setEndorseCustomerDetails(PartyInfo value) {
        this.endorseCustomerDetails = value;
    }

}
