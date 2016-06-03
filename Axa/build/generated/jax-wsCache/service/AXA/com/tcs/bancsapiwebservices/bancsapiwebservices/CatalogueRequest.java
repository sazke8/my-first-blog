
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.AgentInfo;


/**
 * <p>Java class for catalogueRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="catalogueRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogue" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}catalogue"/>
 *         &lt;element name="agentInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}agentInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catalogueRequest", propOrder = {
    "catalogue",
    "agentInfo"
})
public class CatalogueRequest {

    @XmlElement(required = true)
    protected Catalogue catalogue;
    @XmlElement(required = true)
    protected AgentInfo agentInfo;

    /**
     * Gets the value of the catalogue property.
     * 
     * @return
     *     possible object is
     *     {@link Catalogue }
     *     
     */
    public Catalogue getCatalogue() {
        return catalogue;
    }

    /**
     * Sets the value of the catalogue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Catalogue }
     *     
     */
    public void setCatalogue(Catalogue value) {
        this.catalogue = value;
    }

    /**
     * Gets the value of the agentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AgentInfo }
     *     
     */
    public AgentInfo getAgentInfo() {
        return agentInfo;
    }

    /**
     * Sets the value of the agentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentInfo }
     *     
     */
    public void setAgentInfo(AgentInfo value) {
        this.agentInfo = value;
    }

}
