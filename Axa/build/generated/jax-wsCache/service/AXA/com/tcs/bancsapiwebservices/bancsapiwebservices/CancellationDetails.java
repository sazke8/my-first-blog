
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.EndorsementType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.ReceiptsInfo;


/**
 * <p>Java class for cancellationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancellationDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastEndorsementNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastEndorsementType" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}EndorsementType" minOccurs="0"/>
 *         &lt;element name="policyStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cancellationeffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="executionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="receiptsInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}receiptsInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancellationDetails", propOrder = {
    "policyNumber",
    "lastEndorsementNumber",
    "lastEndorsementType",
    "policyStatus",
    "cancellationeffectiveDate",
    "executionDate",
    "receiptsInfo"
})
public class CancellationDetails {

    @XmlElement(required = true)
    protected String policyNumber;
    protected String lastEndorsementNumber;
    @XmlSchemaType(name = "string")
    protected EndorsementType lastEndorsementType;
    @XmlElement(required = true)
    protected String policyStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cancellationeffectiveDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar executionDate;
    @XmlElement(required = true)
    protected ReceiptsInfo receiptsInfo;

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
     * Gets the value of the lastEndorsementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastEndorsementNumber() {
        return lastEndorsementNumber;
    }

    /**
     * Sets the value of the lastEndorsementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastEndorsementNumber(String value) {
        this.lastEndorsementNumber = value;
    }

    /**
     * Gets the value of the lastEndorsementType property.
     * 
     * @return
     *     possible object is
     *     {@link EndorsementType }
     *     
     */
    public EndorsementType getLastEndorsementType() {
        return lastEndorsementType;
    }

    /**
     * Sets the value of the lastEndorsementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorsementType }
     *     
     */
    public void setLastEndorsementType(EndorsementType value) {
        this.lastEndorsementType = value;
    }

    /**
     * Gets the value of the policyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyStatus() {
        return policyStatus;
    }

    /**
     * Sets the value of the policyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyStatus(String value) {
        this.policyStatus = value;
    }

    /**
     * Gets the value of the cancellationeffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationeffectiveDate() {
        return cancellationeffectiveDate;
    }

    /**
     * Sets the value of the cancellationeffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationeffectiveDate(XMLGregorianCalendar value) {
        this.cancellationeffectiveDate = value;
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

}
