
package com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cardInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cardInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeOfOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activeCard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="prioritySequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memberSince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryMonthYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clabeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plasticNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fathersLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mothersLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="securityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inmediatePayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardInfo", propOrder = {
    "typeOfOperation",
    "activeCard",
    "prioritySequenceNumber",
    "memberSince",
    "cardNumber",
    "accountNumber",
    "expiryMonthYear",
    "clabeNumber",
    "plasticNumber",
    "firstName",
    "fathersLastName",
    "mothersLastName",
    "securityCode",
    "inmediatePayment",
    "bankCode"
})
public class CardInfo {

    protected String typeOfOperation;
    protected Boolean activeCard;
    @XmlElement(required = true)
    protected String prioritySequenceNumber;
    protected String memberSince;
    protected String cardNumber;
    protected String accountNumber;
    protected String expiryMonthYear;
    protected String clabeNumber;
    protected String plasticNumber;
    protected String firstName;
    protected String fathersLastName;
    protected String mothersLastName;
    protected String securityCode;
    protected String inmediatePayment;
    protected String bankCode;

    /**
     * Gets the value of the typeOfOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfOperation() {
        return typeOfOperation;
    }

    /**
     * Sets the value of the typeOfOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfOperation(String value) {
        this.typeOfOperation = value;
    }

    /**
     * Gets the value of the activeCard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveCard() {
        return activeCard;
    }

    /**
     * Sets the value of the activeCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveCard(Boolean value) {
        this.activeCard = value;
    }

    /**
     * Gets the value of the prioritySequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrioritySequenceNumber() {
        return prioritySequenceNumber;
    }

    /**
     * Sets the value of the prioritySequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrioritySequenceNumber(String value) {
        this.prioritySequenceNumber = value;
    }

    /**
     * Gets the value of the memberSince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberSince() {
        return memberSince;
    }

    /**
     * Sets the value of the memberSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberSince(String value) {
        this.memberSince = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the expiryMonthYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryMonthYear() {
        return expiryMonthYear;
    }

    /**
     * Sets the value of the expiryMonthYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryMonthYear(String value) {
        this.expiryMonthYear = value;
    }

    /**
     * Gets the value of the clabeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClabeNumber() {
        return clabeNumber;
    }

    /**
     * Sets the value of the clabeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClabeNumber(String value) {
        this.clabeNumber = value;
    }

    /**
     * Gets the value of the plasticNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlasticNumber() {
        return plasticNumber;
    }

    /**
     * Sets the value of the plasticNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlasticNumber(String value) {
        this.plasticNumber = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the fathersLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFathersLastName() {
        return fathersLastName;
    }

    /**
     * Sets the value of the fathersLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFathersLastName(String value) {
        this.fathersLastName = value;
    }

    /**
     * Gets the value of the mothersLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMothersLastName() {
        return mothersLastName;
    }

    /**
     * Sets the value of the mothersLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMothersLastName(String value) {
        this.mothersLastName = value;
    }

    /**
     * Gets the value of the securityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Sets the value of the securityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCode(String value) {
        this.securityCode = value;
    }

    /**
     * Gets the value of the inmediatePayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInmediatePayment() {
        return inmediatePayment;
    }

    /**
     * Sets the value of the inmediatePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInmediatePayment(String value) {
        this.inmediatePayment = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

}
