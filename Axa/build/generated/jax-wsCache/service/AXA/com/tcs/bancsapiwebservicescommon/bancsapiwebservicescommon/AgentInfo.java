
package com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mainAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="participationPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cessionPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="centroProduccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ejecutivoComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="territorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vicepresidencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compania" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agentInfo", propOrder = {
    "agentCode",
    "mainAgent",
    "participationPercentage",
    "cessionPercentage",
    "centroProduccion",
    "promotorCode",
    "ejecutivoComercial",
    "oficina",
    "zona",
    "territorio",
    "vicepresidencia",
    "compania",
    "tipoPersona"
})
public class AgentInfo {

    @XmlElement(required = true)
    protected String agentCode;
    protected String mainAgent;
    protected String participationPercentage;
    protected BigDecimal cessionPercentage;
    protected String centroProduccion;
    protected String promotorCode;
    protected String ejecutivoComercial;
    protected String oficina;
    protected String zona;
    protected String territorio;
    protected String vicepresidencia;
    protected String compania;
    protected String tipoPersona;

    /**
     * Gets the value of the agentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCode() {
        return agentCode;
    }

    /**
     * Sets the value of the agentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCode(String value) {
        this.agentCode = value;
    }

    /**
     * Gets the value of the mainAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainAgent() {
        return mainAgent;
    }

    /**
     * Sets the value of the mainAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainAgent(String value) {
        this.mainAgent = value;
    }

    /**
     * Gets the value of the participationPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipationPercentage() {
        return participationPercentage;
    }

    /**
     * Sets the value of the participationPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipationPercentage(String value) {
        this.participationPercentage = value;
    }

    /**
     * Gets the value of the cessionPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCessionPercentage() {
        return cessionPercentage;
    }

    /**
     * Sets the value of the cessionPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCessionPercentage(BigDecimal value) {
        this.cessionPercentage = value;
    }

    /**
     * Gets the value of the centroProduccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroProduccion() {
        return centroProduccion;
    }

    /**
     * Sets the value of the centroProduccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroProduccion(String value) {
        this.centroProduccion = value;
    }

    /**
     * Gets the value of the promotorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotorCode() {
        return promotorCode;
    }

    /**
     * Sets the value of the promotorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotorCode(String value) {
        this.promotorCode = value;
    }

    /**
     * Gets the value of the ejecutivoComercial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEjecutivoComercial() {
        return ejecutivoComercial;
    }

    /**
     * Sets the value of the ejecutivoComercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEjecutivoComercial(String value) {
        this.ejecutivoComercial = value;
    }

    /**
     * Gets the value of the oficina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOficina() {
        return oficina;
    }

    /**
     * Sets the value of the oficina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOficina(String value) {
        this.oficina = value;
    }

    /**
     * Gets the value of the zona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZona() {
        return zona;
    }

    /**
     * Sets the value of the zona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZona(String value) {
        this.zona = value;
    }

    /**
     * Gets the value of the territorio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritorio() {
        return territorio;
    }

    /**
     * Sets the value of the territorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritorio(String value) {
        this.territorio = value;
    }

    /**
     * Gets the value of the vicepresidencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVicepresidencia() {
        return vicepresidencia;
    }

    /**
     * Sets the value of the vicepresidencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVicepresidencia(String value) {
        this.vicepresidencia = value;
    }

    /**
     * Gets the value of the compania property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompania() {
        return compania;
    }

    /**
     * Sets the value of the compania property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompania(String value) {
        this.compania = value;
    }

    /**
     * Gets the value of the tipoPersona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Sets the value of the tipoPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPersona(String value) {
        this.tipoPersona = value;
    }

}
