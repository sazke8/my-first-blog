
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.ErrorDetails;


/**
 * <p>Java class for endorsementResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endorsementResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endorsementDetails" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}endorsementDetails" minOccurs="0"/>
 *         &lt;element name="errorDetails" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}errorDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endorsementResponse", propOrder = {
    "requestId",
    "userCode",
    "roleCode",
    "endorsementDetails",
    "errorDetails"
})
public class EndorsementResponse {

    protected String requestId;
    protected String userCode;
    protected String roleCode;
    protected EndorsementDetails endorsementDetails;
    @XmlElement(nillable = true)
    protected List<ErrorDetails> errorDetails;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the userCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * Sets the value of the userCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCode(String value) {
        this.userCode = value;
    }

    /**
     * Gets the value of the roleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * Sets the value of the roleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleCode(String value) {
        this.roleCode = value;
    }

    /**
     * Gets the value of the endorsementDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EndorsementDetails }
     *     
     */
    public EndorsementDetails getEndorsementDetails() {
        return endorsementDetails;
    }

    /**
     * Sets the value of the endorsementDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorsementDetails }
     *     
     */
    public void setEndorsementDetails(EndorsementDetails value) {
        this.endorsementDetails = value;
    }

    /**
     * Gets the value of the errorDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorDetails }
     * 
     * 
     */
    public List<ErrorDetails> getErrorDetails() {
        if (errorDetails == null) {
            errorDetails = new ArrayList<ErrorDetails>();
        }
        return this.errorDetails;
    }

}
