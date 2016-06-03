
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for nonFinancialEndorseInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nonFinancialEndorseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="riskNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endorsementNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endorsementReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="executionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="previousValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nonFinancialEndorseInfo", propOrder = {
    "policyNumber",
    "riskNumber",
    "endorsementNumber",
    "endorsementReason",
    "effectiveDate",
    "executionDate",
    "previousValue",
    "currentValue"
})
public class NonFinancialEndorseInfo {

    @XmlElement(required = true)
    protected String policyNumber;
    protected String riskNumber;
    @XmlElement(required = true)
    protected String endorsementNumber;
    protected String endorsementReason;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar executionDate;
    protected String previousValue;
    @XmlElement(required = true)
    protected String currentValue;

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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the executionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecutionDate() {
        return executionDate;
    }

    /**
     * Sets the value of the executionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecutionDate(XMLGregorianCalendar value) {
        this.executionDate = value;
    }

    /**
     * Gets the value of the previousValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousValue() {
        return previousValue;
    }

    /**
     * Sets the value of the previousValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousValue(String value) {
        this.previousValue = value;
    }

    /**
     * Gets the value of the currentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentValue() {
        return currentValue;
    }

    /**
     * Sets the value of the currentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentValue(String value) {
        this.currentValue = value;
    }

}
