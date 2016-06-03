
package mx.axa.ecm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for abstractDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abstractDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Pwd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProyectoId" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="ExpId" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="AgentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConfiguracionXml" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="filtros">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="filtrop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="filtroh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Rama" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractDocument", propOrder = {
    "userId",
    "pwd",
    "proyectoId",
    "expId",
    "agentId",
    "configuracionXml",
    "filtros",
    "rama"
})
@XmlSeeAlso({
    DownloadDocument.class,
    ViewDocument.class
})
public abstract class AbstractDocument {

    @XmlElement(name = "UserId", required = true)
    protected String userId;
    @XmlElement(name = "Pwd", required = true)
    protected String pwd;
    @XmlElement(name = "ProyectoId")
    @XmlSchemaType(name = "unsignedByte")
    protected short proyectoId;
    @XmlElement(name = "ExpId")
    @XmlSchemaType(name = "unsignedByte")
    protected short expId;
    @XmlElement(name = "AgentId", required = true)
    protected String agentId;
    @XmlElement(name = "ConfiguracionXml")
    @XmlSchemaType(name = "unsignedByte")
    protected short configuracionXml;
    @XmlElement(required = true)
    protected AbstractDocument.Filtros filtros;
    @XmlElement(name = "Rama")
    @XmlSchemaType(name = "unsignedByte")
    protected short rama;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the pwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * Sets the value of the pwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwd(String value) {
        this.pwd = value;
    }

    /**
     * Gets the value of the proyectoId property.
     * 
     */
    public short getProyectoId() {
        return proyectoId;
    }

    /**
     * Sets the value of the proyectoId property.
     * 
     */
    public void setProyectoId(short value) {
        this.proyectoId = value;
    }

    /**
     * Gets the value of the expId property.
     * 
     */
    public short getExpId() {
        return expId;
    }

    /**
     * Sets the value of the expId property.
     * 
     */
    public void setExpId(short value) {
        this.expId = value;
    }

    /**
     * Gets the value of the agentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentId(String value) {
        this.agentId = value;
    }

    /**
     * Gets the value of the configuracionXml property.
     * 
     */
    public short getConfiguracionXml() {
        return configuracionXml;
    }

    /**
     * Sets the value of the configuracionXml property.
     * 
     */
    public void setConfiguracionXml(short value) {
        this.configuracionXml = value;
    }

    /**
     * Gets the value of the filtros property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractDocument.Filtros }
     *     
     */
    public AbstractDocument.Filtros getFiltros() {
        return filtros;
    }

    /**
     * Sets the value of the filtros property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractDocument.Filtros }
     *     
     */
    public void setFiltros(AbstractDocument.Filtros value) {
        this.filtros = value;
    }

    /**
     * Gets the value of the rama property.
     * 
     */
    public short getRama() {
        return rama;
    }

    /**
     * Sets the value of the rama property.
     * 
     */
    public void setRama(short value) {
        this.rama = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="filtrop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="filtroh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "filtrop",
        "filtroh"
    })
    public static class Filtros {

        @XmlElement(required = true)
        protected String filtrop;
        protected String filtroh;

        /**
         * Gets the value of the filtrop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFiltrop() {
            return filtrop;
        }

        /**
         * Sets the value of the filtrop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFiltrop(String value) {
            this.filtrop = value;
        }

        /**
         * Gets the value of the filtroh property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFiltroh() {
            return filtroh;
        }

        /**
         * Sets the value of the filtroh property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFiltroh(String value) {
            this.filtroh = value;
        }

    }

}
