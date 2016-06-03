
package com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for partyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateofBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="taxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentPartyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benficiaryPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancellationAllowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mainDriver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAlsoPolicyHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}contactInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dxnInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}dxnInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partyInfo", propOrder = {
    "partyCode",
    "partyRole",
    "partyType",
    "initial",
    "name",
    "fatherLastName",
    "motherLastName",
    "startDate",
    "endDate",
    "gender",
    "dateofBirth",
    "taxId",
    "occupation",
    "curpId",
    "voterId",
    "parentPartyCode",
    "maritalStatus",
    "profession",
    "benficiaryPercentage",
    "cancellationAllowed",
    "mainDriver",
    "isAlsoPolicyHolder",
    "contactInfo",
    "dxnInfo"
})
public class PartyInfo {

    protected String partyCode;
    protected String partyRole;
    protected String partyType;
    protected String initial;
    protected String name;
    protected String fatherLastName;
    protected String motherLastName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected String gender;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateofBirth;
    protected String taxId;
    protected String occupation;
    protected String curpId;
    protected String voterId;
    protected String parentPartyCode;
    protected String maritalStatus;
    protected String profession;
    protected String benficiaryPercentage;
    protected String cancellationAllowed;
    protected String mainDriver;
    protected String isAlsoPolicyHolder;
    @XmlElement(nillable = true)
    protected List<ContactInfo> contactInfo;
    protected DxnInfo dxnInfo;

    /**
     * Gets the value of the partyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyCode() {
        return partyCode;
    }

    /**
     * Sets the value of the partyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyCode(String value) {
        this.partyCode = value;
    }

    /**
     * Gets the value of the partyRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRole() {
        return partyRole;
    }

    /**
     * Sets the value of the partyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRole(String value) {
        this.partyRole = value;
    }

    /**
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyType(String value) {
        this.partyType = value;
    }

    /**
     * Gets the value of the initial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitial() {
        return initial;
    }

    /**
     * Sets the value of the initial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitial(String value) {
        this.initial = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the fatherLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherLastName() {
        return fatherLastName;
    }

    /**
     * Sets the value of the fatherLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherLastName(String value) {
        this.fatherLastName = value;
    }

    /**
     * Gets the value of the motherLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherLastName() {
        return motherLastName;
    }

    /**
     * Sets the value of the motherLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherLastName(String value) {
        this.motherLastName = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the dateofBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateofBirth() {
        return dateofBirth;
    }

    /**
     * Sets the value of the dateofBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateofBirth(XMLGregorianCalendar value) {
        this.dateofBirth = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the curpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurpId() {
        return curpId;
    }

    /**
     * Sets the value of the curpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurpId(String value) {
        this.curpId = value;
    }

    /**
     * Gets the value of the voterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterId() {
        return voterId;
    }

    /**
     * Sets the value of the voterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterId(String value) {
        this.voterId = value;
    }

    /**
     * Gets the value of the parentPartyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPartyCode() {
        return parentPartyCode;
    }

    /**
     * Sets the value of the parentPartyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPartyCode(String value) {
        this.parentPartyCode = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the profession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfession() {
        return profession;
    }

    /**
     * Sets the value of the profession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfession(String value) {
        this.profession = value;
    }

    /**
     * Gets the value of the benficiaryPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenficiaryPercentage() {
        return benficiaryPercentage;
    }

    /**
     * Sets the value of the benficiaryPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenficiaryPercentage(String value) {
        this.benficiaryPercentage = value;
    }

    /**
     * Gets the value of the cancellationAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationAllowed() {
        return cancellationAllowed;
    }

    /**
     * Sets the value of the cancellationAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationAllowed(String value) {
        this.cancellationAllowed = value;
    }

    /**
     * Gets the value of the mainDriver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainDriver() {
        return mainDriver;
    }

    /**
     * Sets the value of the mainDriver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainDriver(String value) {
        this.mainDriver = value;
    }

    /**
     * Gets the value of the isAlsoPolicyHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAlsoPolicyHolder() {
        return isAlsoPolicyHolder;
    }

    /**
     * Sets the value of the isAlsoPolicyHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAlsoPolicyHolder(String value) {
        this.isAlsoPolicyHolder = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfo }
     * 
     * 
     */
    public List<ContactInfo> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<ContactInfo>();
        }
        return this.contactInfo;
    }

    /**
     * Gets the value of the dxnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DxnInfo }
     *     
     */
    public DxnInfo getDxnInfo() {
        return dxnInfo;
    }

    /**
     * Sets the value of the dxnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DxnInfo }
     *     
     */
    public void setDxnInfo(DxnInfo value) {
        this.dxnInfo = value;
    }

}
