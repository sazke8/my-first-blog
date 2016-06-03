
package com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coverageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coverageInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coverCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coverApplicable" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}coverAction" minOccurs="0"/>
 *         &lt;element name="deductibleType" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}deductibleType" minOccurs="0"/>
 *         &lt;element name="deductible" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sumInsured" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="premium" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coverageInfo", propOrder = {
    "coverCode",
    "coverApplicable",
    "deductibleType",
    "deductible",
    "sumInsured",
    "premium"
})
public class CoverageInfo {

    @XmlElement(required = true)
    protected String coverCode;
    protected String coverApplicable;
    @XmlSchemaType(name = "string")
    protected DeductibleType deductibleType;
    protected BigDecimal deductible;
    protected BigDecimal sumInsured;
    protected BigDecimal premium;

    /**
     * Gets the value of the coverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverCode() {
        return coverCode;
    }

    /**
     * Sets the value of the coverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverCode(String value) {
        this.coverCode = value;
    }

    /**
     * Gets the value of the coverApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverApplicable() {
        return coverApplicable;
    }

    /**
     * Sets the value of the coverApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverApplicable(String value) {
        this.coverApplicable = value;
    }

    /**
     * Gets the value of the deductibleType property.
     * 
     * @return
     *     possible object is
     *     {@link DeductibleType }
     *     
     */
    public DeductibleType getDeductibleType() {
        return deductibleType;
    }

    /**
     * Sets the value of the deductibleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeductibleType }
     *     
     */
    public void setDeductibleType(DeductibleType value) {
        this.deductibleType = value;
    }

    /**
     * Gets the value of the deductible property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductible() {
        return deductible;
    }

    /**
     * Sets the value of the deductible property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductible(BigDecimal value) {
        this.deductible = value;
    }

    /**
     * Gets the value of the sumInsured property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSumInsured() {
        return sumInsured;
    }

    /**
     * Sets the value of the sumInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSumInsured(BigDecimal value) {
        this.sumInsured = value;
    }

    /**
     * Gets the value of the premium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPremium() {
        return premium;
    }

    /**
     * Sets the value of the premium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPremium(BigDecimal value) {
        this.premium = value;
    }

}
