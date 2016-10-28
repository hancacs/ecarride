package dev.models;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TaxiVehicle entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_vehicle", catalog = "ecarride_db_foreign_key")

public class TaxiVehicle implements java.io.Serializable {

	// Fields

	private Integer id;
	private TaxiVehicleType taxiVehicleType;
	private TaxiBase taxiBase;
	private TaxiCompany taxiCompany;
	private Integer driverId;
	private String vin;
	private Integer year;
	private String brand;
	private String model;
	private String vehicleLicenseState;
	private String profilePhoto;
	private String vehiclePlateNum;
	private String vehicleRegistration;
	private Date vehicleRegistrationStart;
	private Date vehicleRegistrationExpire;
	private Integer vehicleRegistrationStatus;
	private String liabilityInsurance;
	private Integer liabilityAmount;
	private Integer liabilityEcarrideCertificateHolder;
	private Integer liabilityEcarrideAdditionalInsured;
	private Integer liabilitySelfInsured;
	private String liabilityNameInsurer;
	private Date liabilityInsuranceStart;
	private Date liabilityInsuranceExpire;
	private Integer liabilityInsuranceStatus;
	private String extraInsurance;
	private Date extraInsuranceStart;
	private Date extraInsuranceExpire;
	private Integer extraInsuranceStatus;
	private String vehicleTlcFhvLicense;
	private String vehicleTlcFhvLicenseNum;
	private Date vehicleTlcFhvLicenseStart;
	private Date vehicleTlcFhvLicenseExpire;
	private Integer vehicleTlcFhvLicenseStatus;
	private String vehicleInspection;
	private Date vehicleInspectionStart;
	private Date vehicleInspectionExpire;
	private Integer vehicleInspectionStatus;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;
	private Set<TaxiTrip> taxiTrips = new HashSet<TaxiTrip>(0);
	private Set<TaxiDriver> taxiDrivers = new HashSet<TaxiDriver>(0);

	// Constructors

	/** default constructor */
	public TaxiVehicle() {
	}

	/** minimal constructor */
	public TaxiVehicle(TaxiVehicleType taxiVehicleType, TaxiBase taxiBase, TaxiCompany taxiCompany, Integer driverId,
			String vin, Integer year, String brand, String model, String vehicleLicenseState, String profilePhoto,
			String vehiclePlateNum, String vehicleRegistration, Date vehicleRegistrationStart,
			Date vehicleRegistrationExpire, Integer vehicleRegistrationStatus, String liabilityInsurance,
			Integer liabilityAmount, Integer liabilityEcarrideCertificateHolder,
			Integer liabilityEcarrideAdditionalInsured, Integer liabilitySelfInsured, String liabilityNameInsurer,
			Date liabilityInsuranceStart, Date liabilityInsuranceExpire, Integer liabilityInsuranceStatus,
			String extraInsurance, Date extraInsuranceStart, Date extraInsuranceExpire, Integer extraInsuranceStatus,
			String vehicleTlcFhvLicense, String vehicleTlcFhvLicenseNum, Date vehicleTlcFhvLicenseStart,
			Date vehicleTlcFhvLicenseExpire, Integer vehicleTlcFhvLicenseStatus, String vehicleInspection,
			Date vehicleInspectionStart, Date vehicleInspectionExpire, Integer vehicleInspectionStatus,
			Timestamp createdAt, Timestamp updatedAt, Integer status) {
		this.taxiVehicleType = taxiVehicleType;
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.driverId = driverId;
		this.vin = vin;
		this.year = year;
		this.brand = brand;
		this.model = model;
		this.vehicleLicenseState = vehicleLicenseState;
		this.profilePhoto = profilePhoto;
		this.vehiclePlateNum = vehiclePlateNum;
		this.vehicleRegistration = vehicleRegistration;
		this.vehicleRegistrationStart = vehicleRegistrationStart;
		this.vehicleRegistrationExpire = vehicleRegistrationExpire;
		this.vehicleRegistrationStatus = vehicleRegistrationStatus;
		this.liabilityInsurance = liabilityInsurance;
		this.liabilityAmount = liabilityAmount;
		this.liabilityEcarrideCertificateHolder = liabilityEcarrideCertificateHolder;
		this.liabilityEcarrideAdditionalInsured = liabilityEcarrideAdditionalInsured;
		this.liabilitySelfInsured = liabilitySelfInsured;
		this.liabilityNameInsurer = liabilityNameInsurer;
		this.liabilityInsuranceStart = liabilityInsuranceStart;
		this.liabilityInsuranceExpire = liabilityInsuranceExpire;
		this.liabilityInsuranceStatus = liabilityInsuranceStatus;
		this.extraInsurance = extraInsurance;
		this.extraInsuranceStart = extraInsuranceStart;
		this.extraInsuranceExpire = extraInsuranceExpire;
		this.extraInsuranceStatus = extraInsuranceStatus;
		this.vehicleTlcFhvLicense = vehicleTlcFhvLicense;
		this.vehicleTlcFhvLicenseNum = vehicleTlcFhvLicenseNum;
		this.vehicleTlcFhvLicenseStart = vehicleTlcFhvLicenseStart;
		this.vehicleTlcFhvLicenseExpire = vehicleTlcFhvLicenseExpire;
		this.vehicleTlcFhvLicenseStatus = vehicleTlcFhvLicenseStatus;
		this.vehicleInspection = vehicleInspection;
		this.vehicleInspectionStart = vehicleInspectionStart;
		this.vehicleInspectionExpire = vehicleInspectionExpire;
		this.vehicleInspectionStatus = vehicleInspectionStatus;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
	}

	/** full constructor */
	public TaxiVehicle(TaxiVehicleType taxiVehicleType, TaxiBase taxiBase, TaxiCompany taxiCompany, Integer driverId,
			String vin, Integer year, String brand, String model, String vehicleLicenseState, String profilePhoto,
			String vehiclePlateNum, String vehicleRegistration, Date vehicleRegistrationStart,
			Date vehicleRegistrationExpire, Integer vehicleRegistrationStatus, String liabilityInsurance,
			Integer liabilityAmount, Integer liabilityEcarrideCertificateHolder,
			Integer liabilityEcarrideAdditionalInsured, Integer liabilitySelfInsured, String liabilityNameInsurer,
			Date liabilityInsuranceStart, Date liabilityInsuranceExpire, Integer liabilityInsuranceStatus,
			String extraInsurance, Date extraInsuranceStart, Date extraInsuranceExpire, Integer extraInsuranceStatus,
			String vehicleTlcFhvLicense, String vehicleTlcFhvLicenseNum, Date vehicleTlcFhvLicenseStart,
			Date vehicleTlcFhvLicenseExpire, Integer vehicleTlcFhvLicenseStatus, String vehicleInspection,
			Date vehicleInspectionStart, Date vehicleInspectionExpire, Integer vehicleInspectionStatus,
			Timestamp createdAt, Timestamp updatedAt, Integer status, Set<TaxiTrip> taxiTrips,
			Set<TaxiDriver> taxiDrivers) {
		this.taxiVehicleType = taxiVehicleType;
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.driverId = driverId;
		this.vin = vin;
		this.year = year;
		this.brand = brand;
		this.model = model;
		this.vehicleLicenseState = vehicleLicenseState;
		this.profilePhoto = profilePhoto;
		this.vehiclePlateNum = vehiclePlateNum;
		this.vehicleRegistration = vehicleRegistration;
		this.vehicleRegistrationStart = vehicleRegistrationStart;
		this.vehicleRegistrationExpire = vehicleRegistrationExpire;
		this.vehicleRegistrationStatus = vehicleRegistrationStatus;
		this.liabilityInsurance = liabilityInsurance;
		this.liabilityAmount = liabilityAmount;
		this.liabilityEcarrideCertificateHolder = liabilityEcarrideCertificateHolder;
		this.liabilityEcarrideAdditionalInsured = liabilityEcarrideAdditionalInsured;
		this.liabilitySelfInsured = liabilitySelfInsured;
		this.liabilityNameInsurer = liabilityNameInsurer;
		this.liabilityInsuranceStart = liabilityInsuranceStart;
		this.liabilityInsuranceExpire = liabilityInsuranceExpire;
		this.liabilityInsuranceStatus = liabilityInsuranceStatus;
		this.extraInsurance = extraInsurance;
		this.extraInsuranceStart = extraInsuranceStart;
		this.extraInsuranceExpire = extraInsuranceExpire;
		this.extraInsuranceStatus = extraInsuranceStatus;
		this.vehicleTlcFhvLicense = vehicleTlcFhvLicense;
		this.vehicleTlcFhvLicenseNum = vehicleTlcFhvLicenseNum;
		this.vehicleTlcFhvLicenseStart = vehicleTlcFhvLicenseStart;
		this.vehicleTlcFhvLicenseExpire = vehicleTlcFhvLicenseExpire;
		this.vehicleTlcFhvLicenseStatus = vehicleTlcFhvLicenseStatus;
		this.vehicleInspection = vehicleInspection;
		this.vehicleInspectionStart = vehicleInspectionStart;
		this.vehicleInspectionExpire = vehicleInspectionExpire;
		this.vehicleInspectionStatus = vehicleInspectionStatus;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
		this.taxiTrips = taxiTrips;
		this.taxiDrivers = taxiDrivers;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vehicle_type_id", nullable = false)

	public TaxiVehicleType getTaxiVehicleType() {
		return this.taxiVehicleType;
	}

	public void setTaxiVehicleType(TaxiVehicleType taxiVehicleType) {
		this.taxiVehicleType = taxiVehicleType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "base_id", nullable = false)

	public TaxiBase getTaxiBase() {
		return this.taxiBase;
	}

	public void setTaxiBase(TaxiBase taxiBase) {
		this.taxiBase = taxiBase;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company_id", nullable = false)

	public TaxiCompany getTaxiCompany() {
		return this.taxiCompany;
	}

	public void setTaxiCompany(TaxiCompany taxiCompany) {
		this.taxiCompany = taxiCompany;
	}

	@Column(name = "driver_id", nullable = false)

	public Integer getDriverId() {
		return this.driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	@Column(name = "vin", nullable = false)

	public String getVin() {
		return this.vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	@Column(name = "year", nullable = false)

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Column(name = "brand", nullable = false)

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Column(name = "model", nullable = false)

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name = "vehicle_license_state", nullable = false)

	public String getVehicleLicenseState() {
		return this.vehicleLicenseState;
	}

	public void setVehicleLicenseState(String vehicleLicenseState) {
		this.vehicleLicenseState = vehicleLicenseState;
	}

	@Column(name = "profile_photo", nullable = false)

	public String getProfilePhoto() {
		return this.profilePhoto;
	}

	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

	@Column(name = "vehicle_plate_num", nullable = false)

	public String getVehiclePlateNum() {
		return this.vehiclePlateNum;
	}

	public void setVehiclePlateNum(String vehiclePlateNum) {
		this.vehiclePlateNum = vehiclePlateNum;
	}

	@Column(name = "vehicle_registration", nullable = false)

	public String getVehicleRegistration() {
		return this.vehicleRegistration;
	}

	public void setVehicleRegistration(String vehicleRegistration) {
		this.vehicleRegistration = vehicleRegistration;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "vehicle_registration_start", nullable = false, length = 0)

	public Date getVehicleRegistrationStart() {
		return this.vehicleRegistrationStart;
	}

	public void setVehicleRegistrationStart(Date vehicleRegistrationStart) {
		this.vehicleRegistrationStart = vehicleRegistrationStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "vehicle_registration_expire", nullable = false, length = 0)

	public Date getVehicleRegistrationExpire() {
		return this.vehicleRegistrationExpire;
	}

	public void setVehicleRegistrationExpire(Date vehicleRegistrationExpire) {
		this.vehicleRegistrationExpire = vehicleRegistrationExpire;
	}

	@Column(name = "vehicle_registration_status", nullable = false)

	public Integer getVehicleRegistrationStatus() {
		return this.vehicleRegistrationStatus;
	}

	public void setVehicleRegistrationStatus(Integer vehicleRegistrationStatus) {
		this.vehicleRegistrationStatus = vehicleRegistrationStatus;
	}

	@Column(name = "liability_insurance", nullable = false)

	public String getLiabilityInsurance() {
		return this.liabilityInsurance;
	}

	public void setLiabilityInsurance(String liabilityInsurance) {
		this.liabilityInsurance = liabilityInsurance;
	}

	@Column(name = "liability_amount", nullable = false)

	public Integer getLiabilityAmount() {
		return this.liabilityAmount;
	}

	public void setLiabilityAmount(Integer liabilityAmount) {
		this.liabilityAmount = liabilityAmount;
	}

	@Column(name = "liability_ecarride_certificate_holder", nullable = false)

	public Integer getLiabilityEcarrideCertificateHolder() {
		return this.liabilityEcarrideCertificateHolder;
	}

	public void setLiabilityEcarrideCertificateHolder(Integer liabilityEcarrideCertificateHolder) {
		this.liabilityEcarrideCertificateHolder = liabilityEcarrideCertificateHolder;
	}

	@Column(name = "liability_ecarride_additional_insured", nullable = false)

	public Integer getLiabilityEcarrideAdditionalInsured() {
		return this.liabilityEcarrideAdditionalInsured;
	}

	public void setLiabilityEcarrideAdditionalInsured(Integer liabilityEcarrideAdditionalInsured) {
		this.liabilityEcarrideAdditionalInsured = liabilityEcarrideAdditionalInsured;
	}

	@Column(name = "liability_self_insured", nullable = false)

	public Integer getLiabilitySelfInsured() {
		return this.liabilitySelfInsured;
	}

	public void setLiabilitySelfInsured(Integer liabilitySelfInsured) {
		this.liabilitySelfInsured = liabilitySelfInsured;
	}

	@Column(name = "liability_name_insurer", nullable = false)

	public String getLiabilityNameInsurer() {
		return this.liabilityNameInsurer;
	}

	public void setLiabilityNameInsurer(String liabilityNameInsurer) {
		this.liabilityNameInsurer = liabilityNameInsurer;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "liability_insurance_start", nullable = false, length = 0)

	public Date getLiabilityInsuranceStart() {
		return this.liabilityInsuranceStart;
	}

	public void setLiabilityInsuranceStart(Date liabilityInsuranceStart) {
		this.liabilityInsuranceStart = liabilityInsuranceStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "liability_insurance_expire", nullable = false, length = 0)

	public Date getLiabilityInsuranceExpire() {
		return this.liabilityInsuranceExpire;
	}

	public void setLiabilityInsuranceExpire(Date liabilityInsuranceExpire) {
		this.liabilityInsuranceExpire = liabilityInsuranceExpire;
	}

	@Column(name = "liability_insurance_status", nullable = false)

	public Integer getLiabilityInsuranceStatus() {
		return this.liabilityInsuranceStatus;
	}

	public void setLiabilityInsuranceStatus(Integer liabilityInsuranceStatus) {
		this.liabilityInsuranceStatus = liabilityInsuranceStatus;
	}

	@Column(name = "extra_insurance", nullable = false)

	public String getExtraInsurance() {
		return this.extraInsurance;
	}

	public void setExtraInsurance(String extraInsurance) {
		this.extraInsurance = extraInsurance;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "extra_insurance_start", nullable = false, length = 0)

	public Date getExtraInsuranceStart() {
		return this.extraInsuranceStart;
	}

	public void setExtraInsuranceStart(Date extraInsuranceStart) {
		this.extraInsuranceStart = extraInsuranceStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "extra_insurance_expire", nullable = false, length = 0)

	public Date getExtraInsuranceExpire() {
		return this.extraInsuranceExpire;
	}

	public void setExtraInsuranceExpire(Date extraInsuranceExpire) {
		this.extraInsuranceExpire = extraInsuranceExpire;
	}

	@Column(name = "extra_insurance_status", nullable = false)

	public Integer getExtraInsuranceStatus() {
		return this.extraInsuranceStatus;
	}

	public void setExtraInsuranceStatus(Integer extraInsuranceStatus) {
		this.extraInsuranceStatus = extraInsuranceStatus;
	}

	@Column(name = "vehicle_tlc_fhv_license", nullable = false)

	public String getVehicleTlcFhvLicense() {
		return this.vehicleTlcFhvLicense;
	}

	public void setVehicleTlcFhvLicense(String vehicleTlcFhvLicense) {
		this.vehicleTlcFhvLicense = vehicleTlcFhvLicense;
	}

	@Column(name = "vehicle_tlc_fhv_license_num", nullable = false)

	public String getVehicleTlcFhvLicenseNum() {
		return this.vehicleTlcFhvLicenseNum;
	}

	public void setVehicleTlcFhvLicenseNum(String vehicleTlcFhvLicenseNum) {
		this.vehicleTlcFhvLicenseNum = vehicleTlcFhvLicenseNum;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "vehicle_tlc_fhv_license_start", nullable = false, length = 0)

	public Date getVehicleTlcFhvLicenseStart() {
		return this.vehicleTlcFhvLicenseStart;
	}

	public void setVehicleTlcFhvLicenseStart(Date vehicleTlcFhvLicenseStart) {
		this.vehicleTlcFhvLicenseStart = vehicleTlcFhvLicenseStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "vehicle_tlc_fhv_license_expire", nullable = false, length = 0)

	public Date getVehicleTlcFhvLicenseExpire() {
		return this.vehicleTlcFhvLicenseExpire;
	}

	public void setVehicleTlcFhvLicenseExpire(Date vehicleTlcFhvLicenseExpire) {
		this.vehicleTlcFhvLicenseExpire = vehicleTlcFhvLicenseExpire;
	}

	@Column(name = "vehicle_tlc_fhv_license_status", nullable = false)

	public Integer getVehicleTlcFhvLicenseStatus() {
		return this.vehicleTlcFhvLicenseStatus;
	}

	public void setVehicleTlcFhvLicenseStatus(Integer vehicleTlcFhvLicenseStatus) {
		this.vehicleTlcFhvLicenseStatus = vehicleTlcFhvLicenseStatus;
	}

	@Column(name = "vehicle_inspection", nullable = false)

	public String getVehicleInspection() {
		return this.vehicleInspection;
	}

	public void setVehicleInspection(String vehicleInspection) {
		this.vehicleInspection = vehicleInspection;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "vehicle_inspection_start", nullable = false, length = 0)

	public Date getVehicleInspectionStart() {
		return this.vehicleInspectionStart;
	}

	public void setVehicleInspectionStart(Date vehicleInspectionStart) {
		this.vehicleInspectionStart = vehicleInspectionStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "vehicle_inspection_expire", nullable = false, length = 0)

	public Date getVehicleInspectionExpire() {
		return this.vehicleInspectionExpire;
	}

	public void setVehicleInspectionExpire(Date vehicleInspectionExpire) {
		this.vehicleInspectionExpire = vehicleInspectionExpire;
	}

	@Column(name = "vehicle_inspection_status", nullable = false)

	public Integer getVehicleInspectionStatus() {
		return this.vehicleInspectionStatus;
	}

	public void setVehicleInspectionStatus(Integer vehicleInspectionStatus) {
		this.vehicleInspectionStatus = vehicleInspectionStatus;
	}

	@Column(name = "created_at", nullable = false, length = 0)

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "updated_at", nullable = false, length = 0)

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Column(name = "status", nullable = false)

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiVehicle")

	public Set<TaxiTrip> getTaxiTrips() {
		return this.taxiTrips;
	}

	public void setTaxiTrips(Set<TaxiTrip> taxiTrips) {
		this.taxiTrips = taxiTrips;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiVehicle")

	public Set<TaxiDriver> getTaxiDrivers() {
		return this.taxiDrivers;
	}

	public void setTaxiDrivers(Set<TaxiDriver> taxiDrivers) {
		this.taxiDrivers = taxiDrivers;
	}

}