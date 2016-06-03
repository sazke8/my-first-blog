
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for endorsementDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endorsementDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endorsementNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endorsementReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="followupDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endorsePartyDetails" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}endorsePartyDetails"/>
 *         &lt;element name="endorsereceiptDetails" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}endorseReceiptDetails" minOccurs="0"/>
 *         &lt;element name="endorsementDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endorsementDetails", propOrder = {
    "policyNumber",
    "endorsementNumber",
    "endorsementReason",
    "effectiveDate",
    "followupDate",
    "expiryDate",
    "endorsePartyDetails",
    "endorsereceiptDetails",
    "endorsementDescription"
})
public class EndorsementDetails {

    @XmlElement(required = true)
    protected String policyNumber;
    @XmlElement(required = true)
    protected String endorsementNumber;
    protected String endorsementReason;
    @XmlElement(required = true)
    protected String effectiveDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar followupDate;
    @XmlElement(required = true)
    protected String expiryDate;
    @XmlElement(required = true)
    protected EndorsePartyDetails endorsePartyDetails;
    protected EndorseReceiptDetails endorsereceiptDetails;
    protected String endorsementDescription;

    /**
     * Gets the value of the policyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNumber(String value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the endorsementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndorsementNumber() {
        return endorsementNumber;
    }

    /**
     * Sets the value of the endorsementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndorsementNumber(String value) {
        this.endorsementNumber = value;
    }

    /**
     * Gets the value of the endorsementReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndorsementReason() {
        return endorsementReason;
    }

    /**
     * Sets the value of the endorsementReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndorsementReason(String value) {
        this.endorsementReason = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the followupDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFollowupDate() {
        return followupDate;
    }

    /**
     * Sets the value of the followupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFollowupDate(XMLGregorianCalendar value) {
        this.followupDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the endorsePartyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EndorsePartyDetails }
     *     
     */
    public EndorsePartyDetails getEndorsePartyDetails() {
        return endorsePartyDetails;
    }

    /**
     * Sets the value of the endorsePartyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorsePartyDetails }
     *     
     */
    public void setEndorsePartyDetails(EndorsePartyDetails value) {
        this.endorsePartyDetails = value;
    }

    /**
     * Gets the value of the endorsereceiptDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EndorseReceiptDetails }
     *     
     */
    public EndorseReceiptDetails getEndorsereceiptDetails() {
        return endorsereceiptDetails;
    }

    /**
     * Sets the value of the endorsereceiptDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorseReceiptDetails }
     *     
     */
    public void setEndorsereceiptDetails(EndorseReceiptDetails value) {
        this.endorsereceiptDetails = value;
    }

    /**
     * Gets the value of the endorsementDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndorsementDescription() {
        return endorsementDescription;
    }

    /**
     * Sets the value of the endorsementDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndorsementDescription(String value) {
        this.endorsementDescription = value;
    }

}
