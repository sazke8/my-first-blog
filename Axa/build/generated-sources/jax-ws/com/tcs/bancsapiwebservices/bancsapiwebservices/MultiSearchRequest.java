
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for multiSearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multiSearchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="multiSearch" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}multiSearch"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiSearchRequest", propOrder = {
    "multiSearch"
})
public class MultiSearchRequest {

    @XmlElement(required = true)
    protected MultiSearch multiSearch;

    /**
     * Gets the value of the multiSearch property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSearch }
     *     
     */
    public MultiSearch getMultiSearch() {
        return multiSearch;
    }

    /**
     * Sets the value of the multiSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSearch }
     *     
     */
    public void setMultiSearch(MultiSearch value) {
        this.multiSearch = value;
    }

}
