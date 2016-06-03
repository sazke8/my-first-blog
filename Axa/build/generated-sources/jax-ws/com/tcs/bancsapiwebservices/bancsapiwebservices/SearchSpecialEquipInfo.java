
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.AdaptationsInfo;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.SpecialEquipInfo;


/**
 * <p>Java class for searchSpecialEquipInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchSpecialEquipInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="riskNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endorsementNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endorsementReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="executionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="adaptationsInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}adaptationsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specialEquipInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}specialEquipInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchSpecialEquipInfo", propOrder = {
    "policyNumber",
    "riskNumber",
    "endorsementNumber",
    "endorsementReason",
    "effectiveDate",
    "executionDate",
    "adaptationsInfo",
    "specialEquipInfo"
})
public class SearchSpecialEquipInfo {

    @XmlElement(required = true)
    protected String policyNumber;
    protected String riskNumber;
    protected String endorsementNumber;
    protected String endorsementReason;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar executionDate;
    protected List<AdaptationsInfo> adaptationsInfo;
    protected List<SpecialEquipInfo> specialEquipInfo;

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
     * Gets the value of the adaptationsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adaptationsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdaptationsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdaptationsInfo }
     * 
     * 
     */
    public List<AdaptationsInfo> getAdaptationsInfo() {
        if (adaptationsInfo == null) {
            adaptationsInfo = new ArrayList<AdaptationsInfo>();
        }
        return this.adaptationsInfo;
    }

    /**
     * Gets the value of the specialEquipInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialEquipInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialEquipInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialEquipInfo }
     * 
     * 
     */
    public List<SpecialEquipInfo> getSpecialEquipInfo() {
        if (specialEquipInfo == null) {
            specialEquipInfo = new ArrayList<SpecialEquipInfo>();
        }
        return this.specialEquipInfo;
    }

}
