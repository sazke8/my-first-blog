
package com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for riskInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="riskInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="riskNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riskDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedVehicleSerialno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licencePlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="engineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="use" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="frequencyOfUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeOfZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zoneOfCirculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plateIssueState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupants" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tonnage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="kmsrecorded" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="antiTheftDevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeOfSumInsured" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commercialPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="invoiceAgreedValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="invoiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="registro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trailerUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smallTrailerUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="validationCESVI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validationOCRA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="armored" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salvaged" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RiskPreventionProgram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RiskPreventionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deductibleType" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}deductibleType" minOccurs="0"/>
 *         &lt;element name="riskPartyInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}partyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="riskCoverageInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}coverageInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="adaptationsInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}adaptationsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specialEquipInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}specialEquipInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="riskRecieptsInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}receiptsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serviceDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcAdaptationsInfo" type="{http://www.tcs.com/BancsAPIWebservicesCommon/BancsAPIWebservicesCommon}rcAdaptationsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "riskInfo", propOrder = {
    "riskNumber",
    "riskDescription",
    "relatedVehicleSerialno",
    "vin",
    "subBranch",
    "vehicleType",
    "classification",
    "vehicleCode",
    "description",
    "brand",
    "versionCode",
    "version",
    "model",
    "subModel",
    "lineCode",
    "line",
    "licencePlate",
    "engineNumber",
    "use",
    "frequencyOfUse",
    "typeOfZone",
    "zoneOfCirculation",
    "service",
    "cargo",
    "cargoType",
    "plateIssueState",
    "occupants",
    "tonnage",
    "kmsrecorded",
    "antiTheftDevice",
    "rfv",
    "typeOfSumInsured",
    "commercialPercentage",
    "invoiceAgreedValue",
    "invoiceDate",
    "registro",
    "trailerUsed",
    "smallTrailerUsed",
    "validationCESVI",
    "validationOCRA",
    "vehicleAge",
    "armored",
    "salvaged",
    "discount",
    "riskPreventionProgram",
    "riskPreventionName",
    "brandId",
    "vehicleTypeId",
    "amisCode",
    "deductibleType",
    "riskPartyInfo",
    "riskCoverageInfo",
    "adaptationsInfo",
    "specialEquipInfo",
    "riskRecieptsInfo",
    "serviceDesc",
    "useDesc",
    "cargoTypeDesc",
    "rcAdaptationsInfo"
})
public class RiskInfo {

    protected String riskNumber;
    protected String riskDescription;
    protected String relatedVehicleSerialno;
    @XmlElement(name = "VIN")
    protected String vin;
    protected String subBranch;
    protected String vehicleType;
    protected String classification;
    protected String vehicleCode;
    protected String description;
    protected String brand;
    protected String versionCode;
    protected String version;
    protected String model;
    protected String subModel;
    protected String lineCode;
    protected String line;
    protected String licencePlate;
    protected String engineNumber;
    protected String use;
    protected String frequencyOfUse;
    protected String typeOfZone;
    protected String zoneOfCirculation;
    protected String service;
    protected String cargo;
    protected String cargoType;
    protected String plateIssueState;
    protected String occupants;
    protected BigDecimal tonnage;
    protected BigDecimal kmsrecorded;
    protected String antiTheftDevice;
    @XmlElement(name = "RFV")
    protected String rfv;
    protected String typeOfSumInsured;
    protected BigDecimal commercialPercentage;
    protected BigDecimal invoiceAgreedValue;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceDate;
    protected String registro;
    protected String trailerUsed;
    protected Boolean smallTrailerUsed;
    protected String validationCESVI;
    protected String validationOCRA;
    protected String vehicleAge;
    protected String armored;
    protected String salvaged;
    protected BigDecimal discount;
    @XmlElement(name = "RiskPreventionProgram")
    protected String riskPreventionProgram;
    @XmlElement(name = "RiskPreventionName")
    protected String riskPreventionName;
    protected String brandId;
    protected String vehicleTypeId;
    @XmlElement(name = "AmisCode")
    protected String amisCode;
    @XmlSchemaType(name = "string")
    protected DeductibleType deductibleType;
    @XmlElement(nillable = true)
    protected List<PartyInfo> riskPartyInfo;
    @XmlElement(nillable = true)
    protected List<CoverageInfo> riskCoverageInfo;
    protected List<AdaptationsInfo> adaptationsInfo;
    protected List<SpecialEquipInfo> specialEquipInfo;
    @XmlElement(nillable = true)
    protected List<ReceiptsInfo> riskRecieptsInfo;
    protected String serviceDesc;
    protected String useDesc;
    protected String cargoTypeDesc;
    protected List<RcAdaptationsInfo> rcAdaptationsInfo;

    /**
     * Gets the value of the riskNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskNumber() {
        return riskNumber;
    }

    /**
     * Sets the value of the riskNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskNumber(String value) {
        this.riskNumber = value;
    }

    /**
     * Gets the value of the riskDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskDescription() {
        return riskDescription;
    }

    /**
     * Sets the value of the riskDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskDescription(String value) {
        this.riskDescription = value;
    }

    /**
     * Gets the value of the relatedVehicleSerialno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedVehicleSerialno() {
        return relatedVehicleSerialno;
    }

    /**
     * Sets the value of the relatedVehicleSerialno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedVehicleSerialno(String value) {
        this.relatedVehicleSerialno = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIN() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIN(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the subBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBranch() {
        return subBranch;
    }

    /**
     * Sets the value of the subBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubBranch(String value) {
        this.subBranch = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the value of the vehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleType(String value) {
        this.vehicleType = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassification(String value) {
        this.classification = value;
    }

    /**
     * Gets the value of the vehicleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleCode() {
        return vehicleCode;
    }

    /**
     * Sets the value of the vehicleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleCode(String value) {
        this.vehicleCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the versionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionCode() {
        return versionCode;
    }

    /**
     * Sets the value of the versionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionCode(String value) {
        this.versionCode = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the subModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubModel() {
        return subModel;
    }

    /**
     * Sets the value of the subModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubModel(String value) {
        this.subModel = value;
    }

    /**
     * Gets the value of the lineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineCode() {
        return lineCode;
    }

    /**
     * Sets the value of the lineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineCode(String value) {
        this.lineCode = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine(String value) {
        this.line = value;
    }

    /**
     * Gets the value of the licencePlate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicencePlate() {
        return licencePlate;
    }

    /**
     * Sets the value of the licencePlate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicencePlate(String value) {
        this.licencePlate = value;
    }

    /**
     * Gets the value of the engineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineNumber() {
        return engineNumber;
    }

    /**
     * Sets the value of the engineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineNumber(String value) {
        this.engineNumber = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUse(String value) {
        this.use = value;
    }

    /**
     * Gets the value of the frequencyOfUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyOfUse() {
        return frequencyOfUse;
    }

    /**
     * Sets the value of the frequencyOfUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyOfUse(String value) {
        this.frequencyOfUse = value;
    }

    /**
     * Gets the value of the typeOfZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfZone() {
        return typeOfZone;
    }

    /**
     * Sets the value of the typeOfZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfZone(String value) {
        this.typeOfZone = value;
    }

    /**
     * Gets the value of the zoneOfCirculation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneOfCirculation() {
        return zoneOfCirculation;
    }

    /**
     * Sets the value of the zoneOfCirculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneOfCirculation(String value) {
        this.zoneOfCirculation = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the cargo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Sets the value of the cargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargo(String value) {
        this.cargo = value;
    }

    /**
     * Gets the value of the cargoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoType() {
        return cargoType;
    }

    /**
     * Sets the value of the cargoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoType(String value) {
        this.cargoType = value;
    }

    /**
     * Gets the value of the plateIssueState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateIssueState() {
        return plateIssueState;
    }

    /**
     * Sets the value of the plateIssueState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateIssueState(String value) {
        this.plateIssueState = value;
    }

    /**
     * Gets the value of the occupants property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupants() {
        return occupants;
    }

    /**
     * Sets the value of the occupants property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupants(String value) {
        this.occupants = value;
    }

    /**
     * Gets the value of the tonnage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTonnage() {
        return tonnage;
    }

    /**
     * Sets the value of the tonnage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTonnage(BigDecimal value) {
        this.tonnage = value;
    }

    /**
     * Gets the value of the kmsrecorded property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKmsrecorded() {
        return kmsrecorded;
    }

    /**
     * Sets the value of the kmsrecorded property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKmsrecorded(BigDecimal value) {
        this.kmsrecorded = value;
    }

    /**
     * Gets the value of the antiTheftDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntiTheftDevice() {
        return antiTheftDevice;
    }

    /**
     * Sets the value of the antiTheftDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntiTheftDevice(String value) {
        this.antiTheftDevice = value;
    }

    /**
     * Gets the value of the rfv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFV() {
        return rfv;
    }

    /**
     * Sets the value of the rfv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFV(String value) {
        this.rfv = value;
    }

    /**
     * Gets the value of the typeOfSumInsured property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfSumInsured() {
        return typeOfSumInsured;
    }

    /**
     * Sets the value of the typeOfSumInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfSumInsured(String value) {
        this.typeOfSumInsured = value;
    }

    /**
     * Gets the value of the commercialPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommercialPercentage() {
        return commercialPercentage;
    }

    /**
     * Sets the value of the commercialPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommercialPercentage(BigDecimal value) {
        this.commercialPercentage = value;
    }

    /**
     * Gets the value of the invoiceAgreedValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceAgreedValue() {
        return invoiceAgreedValue;
    }

    /**
     * Sets the value of the invoiceAgreedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceAgreedValue(BigDecimal value) {
        this.invoiceAgreedValue = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceDate(XMLGregorianCalendar value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the registro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistro() {
        return registro;
    }

    /**
     * Sets the value of the registro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistro(String value) {
        this.registro = value;
    }

    /**
     * Gets the value of the trailerUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailerUsed() {
        return trailerUsed;
    }

    /**
     * Sets the value of the trailerUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailerUsed(String value) {
        this.trailerUsed = value;
    }

    /**
     * Gets the value of the smallTrailerUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmallTrailerUsed() {
        return smallTrailerUsed;
    }

    /**
     * Sets the value of the smallTrailerUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmallTrailerUsed(Boolean value) {
        this.smallTrailerUsed = value;
    }

    /**
     * Gets the value of the validationCESVI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationCESVI() {
        return validationCESVI;
    }

    /**
     * Sets the value of the validationCESVI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationCESVI(String value) {
        this.validationCESVI = value;
    }

    /**
     * Gets the value of the validationOCRA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationOCRA() {
        return validationOCRA;
    }

    /**
     * Sets the value of the validationOCRA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationOCRA(String value) {
        this.validationOCRA = value;
    }

    /**
     * Gets the value of the vehicleAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleAge() {
        return vehicleAge;
    }

    /**
     * Sets the value of the vehicleAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleAge(String value) {
        this.vehicleAge = value;
    }

    /**
     * Gets the value of the armored property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArmored() {
        return armored;
    }

    /**
     * Sets the value of the armored property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmored(String value) {
        this.armored = value;
    }

    /**
     * Gets the value of the salvaged property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalvaged() {
        return salvaged;
    }

    /**
     * Sets the value of the salvaged property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalvaged(String value) {
        this.salvaged = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the riskPreventionProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskPreventionProgram() {
        return riskPreventionProgram;
    }

    /**
     * Sets the value of the riskPreventionProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskPreventionProgram(String value) {
        this.riskPreventionProgram = value;
    }

    /**
     * Gets the value of the riskPreventionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskPreventionName() {
        return riskPreventionName;
    }

    /**
     * Sets the value of the riskPreventionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskPreventionName(String value) {
        this.riskPreventionName = value;
    }

    /**
     * Gets the value of the brandId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * Sets the value of the brandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandId(String value) {
        this.brandId = value;
    }

    /**
     * Gets the value of the vehicleTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleTypeId() {
        return vehicleTypeId;
    }

    /**
     * Sets the value of the vehicleTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleTypeId(String value) {
        this.vehicleTypeId = value;
    }

    /**
     * Gets the value of the amisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmisCode() {
        return amisCode;
    }

    /**
     * Sets the value of the amisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmisCode(String value) {
        this.amisCode = value;
    }

    /**
     * Gets the value of the deductibleType property.
     * 
     * @return
     *     possible object is
     *     {@link DeductibleType }
     *     
     */
    public DeductibleType getDeductibleType() {
        return deductibleType;
    }

    /**
     * Sets the value of the deductibleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeductibleType }
     *     
     */
    public void setDeductibleType(DeductibleType value) {
        this.deductibleType = value;
    }

    /**
     * Gets the value of the riskPartyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskPartyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskPartyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyInfo }
     * 
     * 
     */
    public List<PartyInfo> getRiskPartyInfo() {
        if (riskPartyInfo == null) {
            riskPartyInfo = new ArrayList<PartyInfo>();
        }
        return this.riskPartyInfo;
    }

    /**
     * Gets the value of the riskCoverageInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskCoverageInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskCoverageInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageInfo }
     * 
     * 
     */
    public List<CoverageInfo> getRiskCoverageInfo() {
        if (riskCoverageInfo == null) {
            riskCoverageInfo = new ArrayList<CoverageInfo>();
        }
        return this.riskCoverageInfo;
    }

    /**
     * Gets the value of the adaptationsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adaptationsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdaptationsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdaptationsInfo }
     * 
     * 
     */
    public List<AdaptationsInfo> getAdaptationsInfo() {
        if (adaptationsInfo == null) {
            adaptationsInfo = new ArrayList<AdaptationsInfo>();
        }
        return this.adaptationsInfo;
    }

    /**
     * Gets the value of the specialEquipInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialEquipInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialEquipInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialEquipInfo }
     * 
     * 
     */
    public List<SpecialEquipInfo> getSpecialEquipInfo() {
        if (specialEquipInfo == null) {
            specialEquipInfo = new ArrayList<SpecialEquipInfo>();
        }
        return this.specialEquipInfo;
    }

    /**
     * Gets the value of the riskRecieptsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskRecieptsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskRecieptsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiptsInfo }
     * 
     * 
     */
    public List<ReceiptsInfo> getRiskRecieptsInfo() {
        if (riskRecieptsInfo == null) {
            riskRecieptsInfo = new ArrayList<ReceiptsInfo>();
        }
        return this.riskRecieptsInfo;
    }

    /**
     * Gets the value of the serviceDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDesc() {
        return serviceDesc;
    }

    /**
     * Sets the value of the serviceDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDesc(String value) {
        this.serviceDesc = value;
    }

    /**
     * Gets the value of the useDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDesc() {
        return useDesc;
    }

    /**
     * Sets the value of the useDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDesc(String value) {
        this.useDesc = value;
    }

    /**
     * Gets the value of the cargoTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoTypeDesc() {
        return cargoTypeDesc;
    }

    /**
     * Sets the value of the cargoTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoTypeDesc(String value) {
        this.cargoTypeDesc = value;
    }

    /**
     * Gets the value of the rcAdaptationsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcAdaptationsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcAdaptationsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RcAdaptationsInfo }
     * 
     * 
     */
    public List<RcAdaptationsInfo> getRcAdaptationsInfo() {
        if (rcAdaptationsInfo == null) {
            rcAdaptationsInfo = new ArrayList<RcAdaptationsInfo>();
        }
        return this.rcAdaptationsInfo;
    }

}
