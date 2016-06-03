
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.Action;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.RiskInfo;


/**
 * <p>Java class for endorseRiskInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endorseRiskInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}action"/>
 *         &lt;element name="endorsevehicleDetails" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}riskInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endorseRiskInfo", propOrder = {
    "action",
    "endorsevehicleDetails"
})
public class EndorseRiskInfo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Action action;
    @XmlElement(required = true, nillable = true)
    protected RiskInfo endorsevehicleDetails;

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
     * Gets the value of the endorsevehicleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RiskInfo }
     *     
     */
    public RiskInfo getEndorsevehicleDetails() {
        return endorsevehicleDetails;
    }

    /**
     * Sets the value of the endorsevehicleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskInfo }
     *     
     */
    public void setEndorsevehicleDetails(RiskInfo value) {
        this.endorsevehicleDetails = value;
    }

}
