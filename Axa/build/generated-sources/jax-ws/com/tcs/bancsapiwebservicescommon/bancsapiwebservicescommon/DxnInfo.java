
package com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dxnInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dxnInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payrollCompanyIDDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dependencyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dependencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessAcitivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dxnInfo", propOrder = {
    "employeeNumber",
    "payrollCompanyIDDesc",
    "branchID",
    "branchName",
    "officeID",
    "officeDescription",
    "departmentID",
    "departmentDescription",
    "sellerID",
    "dependencyID",
    "dependencyName",
    "nationality",
    "businessAcitivity"
})
public class DxnInfo {

    protected String employeeNumber;
    protected String payrollCompanyIDDesc;
    protected String branchID;
    protected String branchName;
    protected String officeID;
    protected String officeDescription;
    protected String departmentID;
    protected String departmentDescription;
    protected String sellerID;
    protected String dependencyID;
    protected String dependencyName;
    protected String nationality;
    protected String businessAcitivity;

    /**
     * Gets the value of the employeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the value of the employeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNumber(String value) {
        this.employeeNumber = value;
    }

    /**
     * Gets the value of the payrollCompanyIDDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayrollCompanyIDDesc() {
        return payrollCompanyIDDesc;
    }

    /**
     * Sets the value of the payrollCompanyIDDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayrollCompanyIDDesc(String value) {
        this.payrollCompanyIDDesc = value;
    }

    /**
     * Gets the value of the branchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchID() {
        return branchID;
    }

    /**
     * Sets the value of the branchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchID(String value) {
        this.branchID = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the officeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeID() {
        return officeID;
    }

    /**
     * Sets the value of the officeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeID(String value) {
        this.officeID = value;
    }

    /**
     * Gets the value of the officeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeDescription() {
        return officeDescription;
    }

    /**
     * Sets the value of the officeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeDescription(String value) {
        this.officeDescription = value;
    }

    /**
     * Gets the value of the departmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentID() {
        return departmentID;
    }

    /**
     * Sets the value of the departmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentID(String value) {
        this.departmentID = value;
    }

    /**
     * Gets the value of the departmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentDescription() {
        return departmentDescription;
    }

    /**
     * Sets the value of the departmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentDescription(String value) {
        this.departmentDescription = value;
    }

    /**
     * Gets the value of the sellerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerID() {
        return sellerID;
    }

    /**
     * Sets the value of the sellerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerID(String value) {
        this.sellerID = value;
    }

    /**
     * Gets the value of the dependencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependencyID() {
        return dependencyID;
    }

    /**
     * Sets the value of the dependencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependencyID(String value) {
        this.dependencyID = value;
    }

    /**
     * Gets the value of the dependencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependencyName() {
        return dependencyName;
    }

    /**
     * Sets the value of the dependencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependencyName(String value) {
        this.dependencyName = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the businessAcitivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessAcitivity() {
        return businessAcitivity;
    }

    /**
     * Sets the value of the businessAcitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessAcitivity(String value) {
        this.businessAcitivity = value;
    }

}
