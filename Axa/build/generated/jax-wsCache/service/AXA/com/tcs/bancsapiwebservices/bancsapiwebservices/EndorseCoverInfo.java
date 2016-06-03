
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.Action;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.CoverageInfo;


/**
 * <p>Java class for endorseCoverInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endorseCoverInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="riskNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}action"/>
 *         &lt;element name="endorsecoverageDetails" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}coverageInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endorseCoverInfo", propOrder = {
    "riskNumber",
    "action",
    "endorsecoverageDetails"
})
public class EndorseCoverInfo {

    protected String riskNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Action action;
    @XmlElement(required = true, nillable = true)
    protected CoverageInfo endorsecoverageDetails;

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
     * Gets the value of the endorsecoverageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageInfo }
     *     
     */
    public CoverageInfo getEndorsecoverageDetails() {
        return endorsecoverageDetails;
    }

    /**
     * Sets the value of the endorsecoverageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageInfo }
     *     
     */
    public void setEndorsecoverageDetails(CoverageInfo value) {
        this.endorsecoverageDetails = value;
    }

}
