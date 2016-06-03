
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.AgentInfo;


/**
 * <p>Java class for endorsement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endorsement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generalInfo" type="{http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices}generalInfo" minOccurs="0"/>
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
@XmlType(name = "endorsement", propOrder = {
    "generalInfo",
    "agentInfo"
})
public class Endorsement {

    protected GeneralInfo generalInfo;
    @XmlElement(required = true)
    protected AgentInfo agentInfo;

    /**
     * Gets the value of the generalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInfo }
     *     
     */
    public GeneralInfo getGeneralInfo() {
        return generalInfo;
    }

    /**
     * Sets the value of the generalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInfo }
     *     
     */
    public void setGeneralInfo(GeneralInfo value) {
        this.generalInfo = value;
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
