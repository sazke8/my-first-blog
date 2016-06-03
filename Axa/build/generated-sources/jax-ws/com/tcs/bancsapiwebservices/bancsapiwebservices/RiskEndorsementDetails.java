
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.ReceiptsInfo;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.RiskInfo;


/**
 * <p>Java class for riskEndorsementDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="riskEndorsementDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endorsementNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endorsementReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endorsementeffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="executionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="receiptsInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}receiptsInfo"/>
 *         &lt;element name="addRiskDetails" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}riskInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "riskEndorsementDetails", propOrder = {
    "policyNumber",
    "endorsementNumber",
    "endorsementReason",
    "endorsementeffectiveDate",
    "executionDate",
    "receiptsInfo",
    "addRiskDetails"
})
public class RiskEndorsementDetails {

    @XmlElement(required = true)
    protected String policyNumber;
    @XmlElement(required = true)
    protected String endorsementNumber;
    protected String endorsementReason;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endorsementeffectiveDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar executionDate;
    @XmlElement(required = true)
    protected ReceiptsInfo receiptsInfo;
    @XmlElement(nillable = true)
    protected List<RiskInfo> addRiskDetails;

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
     * Gets the value of the endorsementeffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndorsementeffectiveDate() {
        return endorsementeffectiveDate;
    }

    /**
     * Sets the value of the endorsementeffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndorsementeffectiveDate(XMLGregorianCalendar value) {
        this.endorsementeffectiveDate = value;
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
     * Gets the value of the receiptsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptsInfo }
     *     
     */
    public ReceiptsInfo getReceiptsInfo() {
        return receiptsInfo;
    }

    /**
     * Sets the value of the receiptsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptsInfo }
     *     
     */
    public void setReceiptsInfo(ReceiptsInfo value) {
        this.receiptsInfo = value;
    }

    /**
     * Gets the value of the addRiskDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addRiskDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddRiskDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskInfo }
     * 
     * 
     */
    public List<RiskInfo> getAddRiskDetails() {
        if (addRiskDetails == null) {
            addRiskDetails = new ArrayList<RiskInfo>();
        }
        return this.addRiskDetails;
    }

}
