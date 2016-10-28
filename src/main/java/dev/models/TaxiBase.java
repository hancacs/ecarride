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
 * TaxiBase entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_base", catalog = "ecarride_db_foreign_key")

public class TaxiBase implements java.io.Serializable {

	// Fields

	private Integer id;
	private TaxiBaseType taxiBaseType;
	private TaxiFareCalType taxiFareCalType;
	private TaxiCompany taxiCompany;
	private String name;
	private String dispatchingLicenseNum;
	private String mainContact;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private Integer phone;
	private Integer fax;
	private String tlcLicense;
	private Integer tlcLicenseNum;
	private Date tlcLicenseStart;
	private Date tlcLicenseExpire;
	private Integer tlcLicenseStatus;
	private String automobileLiability;
	private Integer automobileLiabilityAmount;
	private Integer automobileLiabilityOperrCertificateHolder;
	private Integer automobileLiabilitySelfInsured;
	private Integer automobileLiabilityOperrAdditionalInsured;
	private String automobileLiabilityNameInsurer;
	private Date automobileLiabilityStart;
	private Date automobileLiabilityExpire;
	private Integer automobileLiabilityStatus;
	private String generalLiability;
	private Integer generalLiabilityAmount;
	private Integer generalLiabilityOperrCertificateHolder;
	private Integer generalLiabilitySelfInsured;
	private Integer generalLiabilityOperrAdditionalInsured;
	private String generalLiabilityNameInsurer;
	private Date generalLiabilityStart;
	private Date generalLiabilityExpire;
	private Integer generalLiabilityStatus;
	private String irsRegisteredBusinessName;
	private String federalTax;
	private String tinEinSsn;
	private String federalTaxNum;
	private Date federalTaxStart;
	private Date federalTaxExpire;
	private Integer federalTaxStatus;
	private String workersCompensation;
	private Integer workersCompensationAmount;
	private Date workersCompensationStart;
	private Date workersCompensationExpire;
	private Integer workersCompensationStatus;
	private String trainingAttestation;
	private Date trainingAttestationStart;
	private Date trainingAttestationExpire;
	private Integer trainingAttestationStatus;
	private String scheduleA;
	private Date scheduleAStart;
	private Date scheduleAExpire;
	private Integer scheduleAStatus;
	private String scheduleB;
	private Date scheduleBStart;
	private Date scheduleBExpire;
	private Integer scheduleBStatus;
	private String aetnaInsuranceAmendment;
	private Date aetnaInsuranceAmendmentStart;
	private Date aetnaInsuranceAmendmentExpire;
	private Integer aetnaInsuranceAmendmentStatus;
	private String wellcareInsuranceAmendment;
	private Date wellcareInsuranceAmendmentStart;
	private Date wellcareInsuranceAmendmentExpire;
	private Integer wellcareInsuranceAmendmentStatus;
	private String insuranceEndorsementAmendment;
	private Date insuranceEndorsementAmendmentStart;
	private Date insuranceEndorsementAmendmentExpire;
	private Integer insuranceEndorsementAmendmentStatus;
	private String nyctAmendment;
	private Date nyctAmendmentStart;
	private Date nyctAmendmentExpire;
	private Integer nyctAmendmentStatus;
	private String serviceAgreement;
	private Date serviceAgreementStart;
	private Date serviceAgreementExpire;
	private Integer serviceAgreementStatus;
	private Date visitDate;
	private String visitPerformedBy;
	private String visitType;
	private Integer apptCancelledByVendor;
	private Integer noShow;
	private String providerAudit;
	private Date providerAuditStart;
	private Date providerAuditExpire;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;
	private Set<TaxiNotification> taxiNotifications = new HashSet<TaxiNotification>(0);
	private Set<TaxiBooking> taxiBookings = new HashSet<TaxiBooking>(0);
	private Set<TaxiDriver> taxiDrivers = new HashSet<TaxiDriver>(0);
	private Set<TaxiTripPool> taxiTripPools = new HashSet<TaxiTripPool>(0);
	private Set<TaxiFeedback> taxiFeedbacks = new HashSet<TaxiFeedback>(0);
	private Set<TaxiDriverFilter> taxiDriverFilters = new HashSet<TaxiDriverFilter>(0);
	private Set<TaxiRatebook> taxiRatebooks = new HashSet<TaxiRatebook>(0);
	private Set<TaxiTripDetail> taxiTripDetails = new HashSet<TaxiTripDetail>(0);
	private Set<TaxiUsers> taxiUserses = new HashSet<TaxiUsers>(0);
	private Set<TaxiPayment> taxiPayments = new HashSet<TaxiPayment>(0);
	private Set<TaxiInsuranceRatebook> taxiInsuranceRatebooks = new HashSet<TaxiInsuranceRatebook>(0);
	private Set<TaxiTrip> taxiTrips = new HashSet<TaxiTrip>(0);
	private Set<TaxiPreScheduleHistory> taxiPreScheduleHistories = new HashSet<TaxiPreScheduleHistory>(0);
	private Set<TaxiDriverRating> taxiDriverRatings = new HashSet<TaxiDriverRating>(0);
	private Set<TaxiPreScheduleGroup> taxiPreScheduleGroups = new HashSet<TaxiPreScheduleGroup>(0);
	private Set<TaxiTransaction> taxiTransactions = new HashSet<TaxiTransaction>(0);
	private Set<TaxiVehicle> taxiVehicles = new HashSet<TaxiVehicle>(0);

	// Constructors

	/** default constructor */
	public TaxiBase() {
	}

	/** minimal constructor */
	public TaxiBase(TaxiBaseType taxiBaseType, TaxiFareCalType taxiFareCalType, TaxiCompany taxiCompany, String name,
			String dispatchingLicenseNum, String mainContact, String address, String city, String state, String zipcode,
			Integer phone, Integer fax, String tlcLicense, Integer tlcLicenseNum, Date tlcLicenseStart,
			Date tlcLicenseExpire, Integer tlcLicenseStatus, String automobileLiability,
			Integer automobileLiabilityAmount, Integer automobileLiabilityOperrCertificateHolder,
			Integer automobileLiabilitySelfInsured, Integer automobileLiabilityOperrAdditionalInsured,
			String automobileLiabilityNameInsurer, Date automobileLiabilityStart, Date automobileLiabilityExpire,
			Integer automobileLiabilityStatus, String generalLiability, Integer generalLiabilityAmount,
			Integer generalLiabilityOperrCertificateHolder, Integer generalLiabilitySelfInsured,
			Integer generalLiabilityOperrAdditionalInsured, String generalLiabilityNameInsurer,
			Date generalLiabilityStart, Date generalLiabilityExpire, Integer generalLiabilityStatus,
			String irsRegisteredBusinessName, String federalTax, String tinEinSsn, String federalTaxNum,
			Date federalTaxStart, Date federalTaxExpire, Integer federalTaxStatus, String workersCompensation,
			Integer workersCompensationAmount, Date workersCompensationStart, Date workersCompensationExpire,
			Integer workersCompensationStatus, String trainingAttestation, Date trainingAttestationStart,
			Date trainingAttestationExpire, Integer trainingAttestationStatus, String scheduleA, Date scheduleAStart,
			Date scheduleAExpire, Integer scheduleAStatus, String scheduleB, Date scheduleBStart, Date scheduleBExpire,
			Integer scheduleBStatus, String aetnaInsuranceAmendment, Date aetnaInsuranceAmendmentStart,
			Date aetnaInsuranceAmendmentExpire, Integer aetnaInsuranceAmendmentStatus,
			String wellcareInsuranceAmendment, Date wellcareInsuranceAmendmentStart,
			Date wellcareInsuranceAmendmentExpire, Integer wellcareInsuranceAmendmentStatus,
			String insuranceEndorsementAmendment, Date insuranceEndorsementAmendmentStart,
			Date insuranceEndorsementAmendmentExpire, Integer insuranceEndorsementAmendmentStatus, String nyctAmendment,
			Date nyctAmendmentStart, Date nyctAmendmentExpire, Integer nyctAmendmentStatus, String serviceAgreement,
			Date serviceAgreementStart, Date serviceAgreementExpire, Integer serviceAgreementStatus, Date visitDate,
			String visitPerformedBy, String visitType, Integer apptCancelledByVendor, Integer noShow,
			String providerAudit, Date providerAuditStart, Date providerAuditExpire, Timestamp createdAt,
			Timestamp updatedAt, Integer status) {
		this.taxiBaseType = taxiBaseType;
		this.taxiFareCalType = taxiFareCalType;
		this.taxiCompany = taxiCompany;
		this.name = name;
		this.dispatchingLicenseNum = dispatchingLicenseNum;
		this.mainContact = mainContact;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phone = phone;
		this.fax = fax;
		this.tlcLicense = tlcLicense;
		this.tlcLicenseNum = tlcLicenseNum;
		this.tlcLicenseStart = tlcLicenseStart;
		this.tlcLicenseExpire = tlcLicenseExpire;
		this.tlcLicenseStatus = tlcLicenseStatus;
		this.automobileLiability = automobileLiability;
		this.automobileLiabilityAmount = automobileLiabilityAmount;
		this.automobileLiabilityOperrCertificateHolder = automobileLiabilityOperrCertificateHolder;
		this.automobileLiabilitySelfInsured = automobileLiabilitySelfInsured;
		this.automobileLiabilityOperrAdditionalInsured = automobileLiabilityOperrAdditionalInsured;
		this.automobileLiabilityNameInsurer = automobileLiabilityNameInsurer;
		this.automobileLiabilityStart = automobileLiabilityStart;
		this.automobileLiabilityExpire = automobileLiabilityExpire;
		this.automobileLiabilityStatus = automobileLiabilityStatus;
		this.generalLiability = generalLiability;
		this.generalLiabilityAmount = generalLiabilityAmount;
		this.generalLiabilityOperrCertificateHolder = generalLiabilityOperrCertificateHolder;
		this.generalLiabilitySelfInsured = generalLiabilitySelfInsured;
		this.generalLiabilityOperrAdditionalInsured = generalLiabilityOperrAdditionalInsured;
		this.generalLiabilityNameInsurer = generalLiabilityNameInsurer;
		this.generalLiabilityStart = generalLiabilityStart;
		this.generalLiabilityExpire = generalLiabilityExpire;
		this.generalLiabilityStatus = generalLiabilityStatus;
		this.irsRegisteredBusinessName = irsRegisteredBusinessName;
		this.federalTax = federalTax;
		this.tinEinSsn = tinEinSsn;
		this.federalTaxNum = federalTaxNum;
		this.federalTaxStart = federalTaxStart;
		this.federalTaxExpire = federalTaxExpire;
		this.federalTaxStatus = federalTaxStatus;
		this.workersCompensation = workersCompensation;
		this.workersCompensationAmount = workersCompensationAmount;
		this.workersCompensationStart = workersCompensationStart;
		this.workersCompensationExpire = workersCompensationExpire;
		this.workersCompensationStatus = workersCompensationStatus;
		this.trainingAttestation = trainingAttestation;
		this.trainingAttestationStart = trainingAttestationStart;
		this.trainingAttestationExpire = trainingAttestationExpire;
		this.trainingAttestationStatus = trainingAttestationStatus;
		this.scheduleA = scheduleA;
		this.scheduleAStart = scheduleAStart;
		this.scheduleAExpire = scheduleAExpire;
		this.scheduleAStatus = scheduleAStatus;
		this.scheduleB = scheduleB;
		this.scheduleBStart = scheduleBStart;
		this.scheduleBExpire = scheduleBExpire;
		this.scheduleBStatus = scheduleBStatus;
		this.aetnaInsuranceAmendment = aetnaInsuranceAmendment;
		this.aetnaInsuranceAmendmentStart = aetnaInsuranceAmendmentStart;
		this.aetnaInsuranceAmendmentExpire = aetnaInsuranceAmendmentExpire;
		this.aetnaInsuranceAmendmentStatus = aetnaInsuranceAmendmentStatus;
		this.wellcareInsuranceAmendment = wellcareInsuranceAmendment;
		this.wellcareInsuranceAmendmentStart = wellcareInsuranceAmendmentStart;
		this.wellcareInsuranceAmendmentExpire = wellcareInsuranceAmendmentExpire;
		this.wellcareInsuranceAmendmentStatus = wellcareInsuranceAmendmentStatus;
		this.insuranceEndorsementAmendment = insuranceEndorsementAmendment;
		this.insuranceEndorsementAmendmentStart = insuranceEndorsementAmendmentStart;
		this.insuranceEndorsementAmendmentExpire = insuranceEndorsementAmendmentExpire;
		this.insuranceEndorsementAmendmentStatus = insuranceEndorsementAmendmentStatus;
		this.nyctAmendment = nyctAmendment;
		this.nyctAmendmentStart = nyctAmendmentStart;
		this.nyctAmendmentExpire = nyctAmendmentExpire;
		this.nyctAmendmentStatus = nyctAmendmentStatus;
		this.serviceAgreement = serviceAgreement;
		this.serviceAgreementStart = serviceAgreementStart;
		this.serviceAgreementExpire = serviceAgreementExpire;
		this.serviceAgreementStatus = serviceAgreementStatus;
		this.visitDate = visitDate;
		this.visitPerformedBy = visitPerformedBy;
		this.visitType = visitType;
		this.apptCancelledByVendor = apptCancelledByVendor;
		this.noShow = noShow;
		this.providerAudit = providerAudit;
		this.providerAuditStart = providerAuditStart;
		this.providerAuditExpire = providerAuditExpire;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
	}

	/** full constructor */
	public TaxiBase(TaxiBaseType taxiBaseType, TaxiFareCalType taxiFareCalType, TaxiCompany taxiCompany, String name,
			String dispatchingLicenseNum, String mainContact, String address, String city, String state, String zipcode,
			Integer phone, Integer fax, String tlcLicense, Integer tlcLicenseNum, Date tlcLicenseStart,
			Date tlcLicenseExpire, Integer tlcLicenseStatus, String automobileLiability,
			Integer automobileLiabilityAmount, Integer automobileLiabilityOperrCertificateHolder,
			Integer automobileLiabilitySelfInsured, Integer automobileLiabilityOperrAdditionalInsured,
			String automobileLiabilityNameInsurer, Date automobileLiabilityStart, Date automobileLiabilityExpire,
			Integer automobileLiabilityStatus, String generalLiability, Integer generalLiabilityAmount,
			Integer generalLiabilityOperrCertificateHolder, Integer generalLiabilitySelfInsured,
			Integer generalLiabilityOperrAdditionalInsured, String generalLiabilityNameInsurer,
			Date generalLiabilityStart, Date generalLiabilityExpire, Integer generalLiabilityStatus,
			String irsRegisteredBusinessName, String federalTax, String tinEinSsn, String federalTaxNum,
			Date federalTaxStart, Date federalTaxExpire, Integer federalTaxStatus, String workersCompensation,
			Integer workersCompensationAmount, Date workersCompensationStart, Date workersCompensationExpire,
			Integer workersCompensationStatus, String trainingAttestation, Date trainingAttestationStart,
			Date trainingAttestationExpire, Integer trainingAttestationStatus, String scheduleA, Date scheduleAStart,
			Date scheduleAExpire, Integer scheduleAStatus, String scheduleB, Date scheduleBStart, Date scheduleBExpire,
			Integer scheduleBStatus, String aetnaInsuranceAmendment, Date aetnaInsuranceAmendmentStart,
			Date aetnaInsuranceAmendmentExpire, Integer aetnaInsuranceAmendmentStatus,
			String wellcareInsuranceAmendment, Date wellcareInsuranceAmendmentStart,
			Date wellcareInsuranceAmendmentExpire, Integer wellcareInsuranceAmendmentStatus,
			String insuranceEndorsementAmendment, Date insuranceEndorsementAmendmentStart,
			Date insuranceEndorsementAmendmentExpire, Integer insuranceEndorsementAmendmentStatus, String nyctAmendment,
			Date nyctAmendmentStart, Date nyctAmendmentExpire, Integer nyctAmendmentStatus, String serviceAgreement,
			Date serviceAgreementStart, Date serviceAgreementExpire, Integer serviceAgreementStatus, Date visitDate,
			String visitPerformedBy, String visitType, Integer apptCancelledByVendor, Integer noShow,
			String providerAudit, Date providerAuditStart, Date providerAuditExpire, Timestamp createdAt,
			Timestamp updatedAt, Integer status, Set<TaxiNotification> taxiNotifications, Set<TaxiBooking> taxiBookings,
			Set<TaxiDriver> taxiDrivers, Set<TaxiTripPool> taxiTripPools, Set<TaxiFeedback> taxiFeedbacks,
			Set<TaxiDriverFilter> taxiDriverFilters, Set<TaxiRatebook> taxiRatebooks,
			Set<TaxiTripDetail> taxiTripDetails, Set<TaxiUsers> taxiUserses, Set<TaxiPayment> taxiPayments,
			Set<TaxiInsuranceRatebook> taxiInsuranceRatebooks, Set<TaxiTrip> taxiTrips,
			Set<TaxiPreScheduleHistory> taxiPreScheduleHistories, Set<TaxiDriverRating> taxiDriverRatings,
			Set<TaxiPreScheduleGroup> taxiPreScheduleGroups, Set<TaxiTransaction> taxiTransactions,
			Set<TaxiVehicle> taxiVehicles) {
		this.taxiBaseType = taxiBaseType;
		this.taxiFareCalType = taxiFareCalType;
		this.taxiCompany = taxiCompany;
		this.name = name;
		this.dispatchingLicenseNum = dispatchingLicenseNum;
		this.mainContact = mainContact;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phone = phone;
		this.fax = fax;
		this.tlcLicense = tlcLicense;
		this.tlcLicenseNum = tlcLicenseNum;
		this.tlcLicenseStart = tlcLicenseStart;
		this.tlcLicenseExpire = tlcLicenseExpire;
		this.tlcLicenseStatus = tlcLicenseStatus;
		this.automobileLiability = automobileLiability;
		this.automobileLiabilityAmount = automobileLiabilityAmount;
		this.automobileLiabilityOperrCertificateHolder = automobileLiabilityOperrCertificateHolder;
		this.automobileLiabilitySelfInsured = automobileLiabilitySelfInsured;
		this.automobileLiabilityOperrAdditionalInsured = automobileLiabilityOperrAdditionalInsured;
		this.automobileLiabilityNameInsurer = automobileLiabilityNameInsurer;
		this.automobileLiabilityStart = automobileLiabilityStart;
		this.automobileLiabilityExpire = automobileLiabilityExpire;
		this.automobileLiabilityStatus = automobileLiabilityStatus;
		this.generalLiability = generalLiability;
		this.generalLiabilityAmount = generalLiabilityAmount;
		this.generalLiabilityOperrCertificateHolder = generalLiabilityOperrCertificateHolder;
		this.generalLiabilitySelfInsured = generalLiabilitySelfInsured;
		this.generalLiabilityOperrAdditionalInsured = generalLiabilityOperrAdditionalInsured;
		this.generalLiabilityNameInsurer = generalLiabilityNameInsurer;
		this.generalLiabilityStart = generalLiabilityStart;
		this.generalLiabilityExpire = generalLiabilityExpire;
		this.generalLiabilityStatus = generalLiabilityStatus;
		this.irsRegisteredBusinessName = irsRegisteredBusinessName;
		this.federalTax = federalTax;
		this.tinEinSsn = tinEinSsn;
		this.federalTaxNum = federalTaxNum;
		this.federalTaxStart = federalTaxStart;
		this.federalTaxExpire = federalTaxExpire;
		this.federalTaxStatus = federalTaxStatus;
		this.workersCompensation = workersCompensation;
		this.workersCompensationAmount = workersCompensationAmount;
		this.workersCompensationStart = workersCompensationStart;
		this.workersCompensationExpire = workersCompensationExpire;
		this.workersCompensationStatus = workersCompensationStatus;
		this.trainingAttestation = trainingAttestation;
		this.trainingAttestationStart = trainingAttestationStart;
		this.trainingAttestationExpire = trainingAttestationExpire;
		this.trainingAttestationStatus = trainingAttestationStatus;
		this.scheduleA = scheduleA;
		this.scheduleAStart = scheduleAStart;
		this.scheduleAExpire = scheduleAExpire;
		this.scheduleAStatus = scheduleAStatus;
		this.scheduleB = scheduleB;
		this.scheduleBStart = scheduleBStart;
		this.scheduleBExpire = scheduleBExpire;
		this.scheduleBStatus = scheduleBStatus;
		this.aetnaInsuranceAmendment = aetnaInsuranceAmendment;
		this.aetnaInsuranceAmendmentStart = aetnaInsuranceAmendmentStart;
		this.aetnaInsuranceAmendmentExpire = aetnaInsuranceAmendmentExpire;
		this.aetnaInsuranceAmendmentStatus = aetnaInsuranceAmendmentStatus;
		this.wellcareInsuranceAmendment = wellcareInsuranceAmendment;
		this.wellcareInsuranceAmendmentStart = wellcareInsuranceAmendmentStart;
		this.wellcareInsuranceAmendmentExpire = wellcareInsuranceAmendmentExpire;
		this.wellcareInsuranceAmendmentStatus = wellcareInsuranceAmendmentStatus;
		this.insuranceEndorsementAmendment = insuranceEndorsementAmendment;
		this.insuranceEndorsementAmendmentStart = insuranceEndorsementAmendmentStart;
		this.insuranceEndorsementAmendmentExpire = insuranceEndorsementAmendmentExpire;
		this.insuranceEndorsementAmendmentStatus = insuranceEndorsementAmendmentStatus;
		this.nyctAmendment = nyctAmendment;
		this.nyctAmendmentStart = nyctAmendmentStart;
		this.nyctAmendmentExpire = nyctAmendmentExpire;
		this.nyctAmendmentStatus = nyctAmendmentStatus;
		this.serviceAgreement = serviceAgreement;
		this.serviceAgreementStart = serviceAgreementStart;
		this.serviceAgreementExpire = serviceAgreementExpire;
		this.serviceAgreementStatus = serviceAgreementStatus;
		this.visitDate = visitDate;
		this.visitPerformedBy = visitPerformedBy;
		this.visitType = visitType;
		this.apptCancelledByVendor = apptCancelledByVendor;
		this.noShow = noShow;
		this.providerAudit = providerAudit;
		this.providerAuditStart = providerAuditStart;
		this.providerAuditExpire = providerAuditExpire;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
		this.taxiNotifications = taxiNotifications;
		this.taxiBookings = taxiBookings;
		this.taxiDrivers = taxiDrivers;
		this.taxiTripPools = taxiTripPools;
		this.taxiFeedbacks = taxiFeedbacks;
		this.taxiDriverFilters = taxiDriverFilters;
		this.taxiRatebooks = taxiRatebooks;
		this.taxiTripDetails = taxiTripDetails;
		this.taxiUserses = taxiUserses;
		this.taxiPayments = taxiPayments;
		this.taxiInsuranceRatebooks = taxiInsuranceRatebooks;
		this.taxiTrips = taxiTrips;
		this.taxiPreScheduleHistories = taxiPreScheduleHistories;
		this.taxiDriverRatings = taxiDriverRatings;
		this.taxiPreScheduleGroups = taxiPreScheduleGroups;
		this.taxiTransactions = taxiTransactions;
		this.taxiVehicles = taxiVehicles;
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
	@JoinColumn(name = "base_type_id", nullable = false)

	public TaxiBaseType getTaxiBaseType() {
		return this.taxiBaseType;
	}

	public void setTaxiBaseType(TaxiBaseType taxiBaseType) {
		this.taxiBaseType = taxiBaseType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fare_cal_type_id", nullable = false)

	public TaxiFareCalType getTaxiFareCalType() {
		return this.taxiFareCalType;
	}

	public void setTaxiFareCalType(TaxiFareCalType taxiFareCalType) {
		this.taxiFareCalType = taxiFareCalType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company_id", nullable = false)

	public TaxiCompany getTaxiCompany() {
		return this.taxiCompany;
	}

	public void setTaxiCompany(TaxiCompany taxiCompany) {
		this.taxiCompany = taxiCompany;
	}

	@Column(name = "name", nullable = false)

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "dispatching_license_num", nullable = false)

	public String getDispatchingLicenseNum() {
		return this.dispatchingLicenseNum;
	}

	public void setDispatchingLicenseNum(String dispatchingLicenseNum) {
		this.dispatchingLicenseNum = dispatchingLicenseNum;
	}

	@Column(name = "main_contact", nullable = false)

	public String getMainContact() {
		return this.mainContact;
	}

	public void setMainContact(String mainContact) {
		this.mainContact = mainContact;
	}

	@Column(name = "address", nullable = false)

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "city", nullable = false)

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "state", nullable = false)

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "zipcode", nullable = false)

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "phone", nullable = false)

	public Integer getPhone() {
		return this.phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	@Column(name = "fax", nullable = false)

	public Integer getFax() {
		return this.fax;
	}

	public void setFax(Integer fax) {
		this.fax = fax;
	}

	@Column(name = "tlc_license", nullable = false)

	public String getTlcLicense() {
		return this.tlcLicense;
	}

	public void setTlcLicense(String tlcLicense) {
		this.tlcLicense = tlcLicense;
	}

	@Column(name = "tlc_license_num", nullable = false)

	public Integer getTlcLicenseNum() {
		return this.tlcLicenseNum;
	}

	public void setTlcLicenseNum(Integer tlcLicenseNum) {
		this.tlcLicenseNum = tlcLicenseNum;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "tlc_license_start", nullable = false, length = 0)

	public Date getTlcLicenseStart() {
		return this.tlcLicenseStart;
	}

	public void setTlcLicenseStart(Date tlcLicenseStart) {
		this.tlcLicenseStart = tlcLicenseStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "tlc_license_expire", nullable = false, length = 0)

	public Date getTlcLicenseExpire() {
		return this.tlcLicenseExpire;
	}

	public void setTlcLicenseExpire(Date tlcLicenseExpire) {
		this.tlcLicenseExpire = tlcLicenseExpire;
	}

	@Column(name = "tlc_license_status", nullable = false)

	public Integer getTlcLicenseStatus() {
		return this.tlcLicenseStatus;
	}

	public void setTlcLicenseStatus(Integer tlcLicenseStatus) {
		this.tlcLicenseStatus = tlcLicenseStatus;
	}

	@Column(name = "automobile_liability", nullable = false)

	public String getAutomobileLiability() {
		return this.automobileLiability;
	}

	public void setAutomobileLiability(String automobileLiability) {
		this.automobileLiability = automobileLiability;
	}

	@Column(name = "automobile_liability_amount", nullable = false)

	public Integer getAutomobileLiabilityAmount() {
		return this.automobileLiabilityAmount;
	}

	public void setAutomobileLiabilityAmount(Integer automobileLiabilityAmount) {
		this.automobileLiabilityAmount = automobileLiabilityAmount;
	}

	@Column(name = "automobile_liability_operr_certificate_holder", nullable = false)

	public Integer getAutomobileLiabilityOperrCertificateHolder() {
		return this.automobileLiabilityOperrCertificateHolder;
	}

	public void setAutomobileLiabilityOperrCertificateHolder(Integer automobileLiabilityOperrCertificateHolder) {
		this.automobileLiabilityOperrCertificateHolder = automobileLiabilityOperrCertificateHolder;
	}

	@Column(name = "automobile_liability_self_insured", nullable = false)

	public Integer getAutomobileLiabilitySelfInsured() {
		return this.automobileLiabilitySelfInsured;
	}

	public void setAutomobileLiabilitySelfInsured(Integer automobileLiabilitySelfInsured) {
		this.automobileLiabilitySelfInsured = automobileLiabilitySelfInsured;
	}

	@Column(name = "automobile_liability_operr_additional_insured", nullable = false)

	public Integer getAutomobileLiabilityOperrAdditionalInsured() {
		return this.automobileLiabilityOperrAdditionalInsured;
	}

	public void setAutomobileLiabilityOperrAdditionalInsured(Integer automobileLiabilityOperrAdditionalInsured) {
		this.automobileLiabilityOperrAdditionalInsured = automobileLiabilityOperrAdditionalInsured;
	}

	@Column(name = "automobile_liability_name_insurer", nullable = false)

	public String getAutomobileLiabilityNameInsurer() {
		return this.automobileLiabilityNameInsurer;
	}

	public void setAutomobileLiabilityNameInsurer(String automobileLiabilityNameInsurer) {
		this.automobileLiabilityNameInsurer = automobileLiabilityNameInsurer;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "automobile_liability_start", nullable = false, length = 0)

	public Date getAutomobileLiabilityStart() {
		return this.automobileLiabilityStart;
	}

	public void setAutomobileLiabilityStart(Date automobileLiabilityStart) {
		this.automobileLiabilityStart = automobileLiabilityStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "automobile_liability_expire", nullable = false, length = 0)

	public Date getAutomobileLiabilityExpire() {
		return this.automobileLiabilityExpire;
	}

	public void setAutomobileLiabilityExpire(Date automobileLiabilityExpire) {
		this.automobileLiabilityExpire = automobileLiabilityExpire;
	}

	@Column(name = "automobile_liability_status", nullable = false)

	public Integer getAutomobileLiabilityStatus() {
		return this.automobileLiabilityStatus;
	}

	public void setAutomobileLiabilityStatus(Integer automobileLiabilityStatus) {
		this.automobileLiabilityStatus = automobileLiabilityStatus;
	}

	@Column(name = "general_liability", nullable = false)

	public String getGeneralLiability() {
		return this.generalLiability;
	}

	public void setGeneralLiability(String generalLiability) {
		this.generalLiability = generalLiability;
	}

	@Column(name = "general_liability_amount", nullable = false)

	public Integer getGeneralLiabilityAmount() {
		return this.generalLiabilityAmount;
	}

	public void setGeneralLiabilityAmount(Integer generalLiabilityAmount) {
		this.generalLiabilityAmount = generalLiabilityAmount;
	}

	@Column(name = "general_liability_operr_certificate_holder", nullable = false)

	public Integer getGeneralLiabilityOperrCertificateHolder() {
		return this.generalLiabilityOperrCertificateHolder;
	}

	public void setGeneralLiabilityOperrCertificateHolder(Integer generalLiabilityOperrCertificateHolder) {
		this.generalLiabilityOperrCertificateHolder = generalLiabilityOperrCertificateHolder;
	}

	@Column(name = "general_liability_self_insured", nullable = false)

	public Integer getGeneralLiabilitySelfInsured() {
		return this.generalLiabilitySelfInsured;
	}

	public void setGeneralLiabilitySelfInsured(Integer generalLiabilitySelfInsured) {
		this.generalLiabilitySelfInsured = generalLiabilitySelfInsured;
	}

	@Column(name = "general_liability_operr_additional_insured", nullable = false)

	public Integer getGeneralLiabilityOperrAdditionalInsured() {
		return this.generalLiabilityOperrAdditionalInsured;
	}

	public void setGeneralLiabilityOperrAdditionalInsured(Integer generalLiabilityOperrAdditionalInsured) {
		this.generalLiabilityOperrAdditionalInsured = generalLiabilityOperrAdditionalInsured;
	}

	@Column(name = "general_liability_name_insurer", nullable = false)

	public String getGeneralLiabilityNameInsurer() {
		return this.generalLiabilityNameInsurer;
	}

	public void setGeneralLiabilityNameInsurer(String generalLiabilityNameInsurer) {
		this.generalLiabilityNameInsurer = generalLiabilityNameInsurer;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "general_liability_start", nullable = false, length = 0)

	public Date getGeneralLiabilityStart() {
		return this.generalLiabilityStart;
	}

	public void setGeneralLiabilityStart(Date generalLiabilityStart) {
		this.generalLiabilityStart = generalLiabilityStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "general_liability_expire", nullable = false, length = 0)

	public Date getGeneralLiabilityExpire() {
		return this.generalLiabilityExpire;
	}

	public void setGeneralLiabilityExpire(Date generalLiabilityExpire) {
		this.generalLiabilityExpire = generalLiabilityExpire;
	}

	@Column(name = "general_liability_status", nullable = false)

	public Integer getGeneralLiabilityStatus() {
		return this.generalLiabilityStatus;
	}

	public void setGeneralLiabilityStatus(Integer generalLiabilityStatus) {
		this.generalLiabilityStatus = generalLiabilityStatus;
	}

	@Column(name = "irs_registered_business_name", nullable = false)

	public String getIrsRegisteredBusinessName() {
		return this.irsRegisteredBusinessName;
	}

	public void setIrsRegisteredBusinessName(String irsRegisteredBusinessName) {
		this.irsRegisteredBusinessName = irsRegisteredBusinessName;
	}

	@Column(name = "federal_tax", nullable = false)

	public String getFederalTax() {
		return this.federalTax;
	}

	public void setFederalTax(String federalTax) {
		this.federalTax = federalTax;
	}

	@Column(name = "tin_ein_ssn", nullable = false)

	public String getTinEinSsn() {
		return this.tinEinSsn;
	}

	public void setTinEinSsn(String tinEinSsn) {
		this.tinEinSsn = tinEinSsn;
	}

	@Column(name = "federal_tax_num", nullable = false)

	public String getFederalTaxNum() {
		return this.federalTaxNum;
	}

	public void setFederalTaxNum(String federalTaxNum) {
		this.federalTaxNum = federalTaxNum;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "federal_tax_start", nullable = false, length = 0)

	public Date getFederalTaxStart() {
		return this.federalTaxStart;
	}

	public void setFederalTaxStart(Date federalTaxStart) {
		this.federalTaxStart = federalTaxStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "federal_tax_expire", nullable = false, length = 0)

	public Date getFederalTaxExpire() {
		return this.federalTaxExpire;
	}

	public void setFederalTaxExpire(Date federalTaxExpire) {
		this.federalTaxExpire = federalTaxExpire;
	}

	@Column(name = "federal_tax_status", nullable = false)

	public Integer getFederalTaxStatus() {
		return this.federalTaxStatus;
	}

	public void setFederalTaxStatus(Integer federalTaxStatus) {
		this.federalTaxStatus = federalTaxStatus;
	}

	@Column(name = "workers_compensation", nullable = false)

	public String getWorkersCompensation() {
		return this.workersCompensation;
	}

	public void setWorkersCompensation(String workersCompensation) {
		this.workersCompensation = workersCompensation;
	}

	@Column(name = "workers_compensation_amount", nullable = false)

	public Integer getWorkersCompensationAmount() {
		return this.workersCompensationAmount;
	}

	public void setWorkersCompensationAmount(Integer workersCompensationAmount) {
		this.workersCompensationAmount = workersCompensationAmount;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "workers_compensation_start", nullable = false, length = 0)

	public Date getWorkersCompensationStart() {
		return this.workersCompensationStart;
	}

	public void setWorkersCompensationStart(Date workersCompensationStart) {
		this.workersCompensationStart = workersCompensationStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "workers_compensation_expire", nullable = false, length = 0)

	public Date getWorkersCompensationExpire() {
		return this.workersCompensationExpire;
	}

	public void setWorkersCompensationExpire(Date workersCompensationExpire) {
		this.workersCompensationExpire = workersCompensationExpire;
	}

	@Column(name = "workers_compensation_status", nullable = false)

	public Integer getWorkersCompensationStatus() {
		return this.workersCompensationStatus;
	}

	public void setWorkersCompensationStatus(Integer workersCompensationStatus) {
		this.workersCompensationStatus = workersCompensationStatus;
	}

	@Column(name = "training_attestation", nullable = false)

	public String getTrainingAttestation() {
		return this.trainingAttestation;
	}

	public void setTrainingAttestation(String trainingAttestation) {
		this.trainingAttestation = trainingAttestation;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "training_attestation_start", nullable = false, length = 0)

	public Date getTrainingAttestationStart() {
		return this.trainingAttestationStart;
	}

	public void setTrainingAttestationStart(Date trainingAttestationStart) {
		this.trainingAttestationStart = trainingAttestationStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "training_attestation_expire", nullable = false, length = 0)

	public Date getTrainingAttestationExpire() {
		return this.trainingAttestationExpire;
	}

	public void setTrainingAttestationExpire(Date trainingAttestationExpire) {
		this.trainingAttestationExpire = trainingAttestationExpire;
	}

	@Column(name = "training_attestation_status", nullable = false)

	public Integer getTrainingAttestationStatus() {
		return this.trainingAttestationStatus;
	}

	public void setTrainingAttestationStatus(Integer trainingAttestationStatus) {
		this.trainingAttestationStatus = trainingAttestationStatus;
	}

	@Column(name = "schedule_a", nullable = false)

	public String getScheduleA() {
		return this.scheduleA;
	}

	public void setScheduleA(String scheduleA) {
		this.scheduleA = scheduleA;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "schedule_a_start", nullable = false, length = 0)

	public Date getScheduleAStart() {
		return this.scheduleAStart;
	}

	public void setScheduleAStart(Date scheduleAStart) {
		this.scheduleAStart = scheduleAStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "schedule_a_expire", nullable = false, length = 0)

	public Date getScheduleAExpire() {
		return this.scheduleAExpire;
	}

	public void setScheduleAExpire(Date scheduleAExpire) {
		this.scheduleAExpire = scheduleAExpire;
	}

	@Column(name = "schedule_a_status", nullable = false)

	public Integer getScheduleAStatus() {
		return this.scheduleAStatus;
	}

	public void setScheduleAStatus(Integer scheduleAStatus) {
		this.scheduleAStatus = scheduleAStatus;
	}

	@Column(name = "schedule_b", nullable = false)

	public String getScheduleB() {
		return this.scheduleB;
	}

	public void setScheduleB(String scheduleB) {
		this.scheduleB = scheduleB;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "schedule_b_start", nullable = false, length = 0)

	public Date getScheduleBStart() {
		return this.scheduleBStart;
	}

	public void setScheduleBStart(Date scheduleBStart) {
		this.scheduleBStart = scheduleBStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "schedule_b_expire", nullable = false, length = 0)

	public Date getScheduleBExpire() {
		return this.scheduleBExpire;
	}

	public void setScheduleBExpire(Date scheduleBExpire) {
		this.scheduleBExpire = scheduleBExpire;
	}

	@Column(name = "schedule_b_status", nullable = false)

	public Integer getScheduleBStatus() {
		return this.scheduleBStatus;
	}

	public void setScheduleBStatus(Integer scheduleBStatus) {
		this.scheduleBStatus = scheduleBStatus;
	}

	@Column(name = "aetna_insurance_amendment", nullable = false)

	public String getAetnaInsuranceAmendment() {
		return this.aetnaInsuranceAmendment;
	}

	public void setAetnaInsuranceAmendment(String aetnaInsuranceAmendment) {
		this.aetnaInsuranceAmendment = aetnaInsuranceAmendment;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "aetna_insurance_amendment_start", nullable = false, length = 0)

	public Date getAetnaInsuranceAmendmentStart() {
		return this.aetnaInsuranceAmendmentStart;
	}

	public void setAetnaInsuranceAmendmentStart(Date aetnaInsuranceAmendmentStart) {
		this.aetnaInsuranceAmendmentStart = aetnaInsuranceAmendmentStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "aetna_insurance_amendment_expire", nullable = false, length = 0)

	public Date getAetnaInsuranceAmendmentExpire() {
		return this.aetnaInsuranceAmendmentExpire;
	}

	public void setAetnaInsuranceAmendmentExpire(Date aetnaInsuranceAmendmentExpire) {
		this.aetnaInsuranceAmendmentExpire = aetnaInsuranceAmendmentExpire;
	}

	@Column(name = "aetna_insurance_amendment_status", nullable = false)

	public Integer getAetnaInsuranceAmendmentStatus() {
		return this.aetnaInsuranceAmendmentStatus;
	}

	public void setAetnaInsuranceAmendmentStatus(Integer aetnaInsuranceAmendmentStatus) {
		this.aetnaInsuranceAmendmentStatus = aetnaInsuranceAmendmentStatus;
	}

	@Column(name = "wellcare_insurance_amendment", nullable = false)

	public String getWellcareInsuranceAmendment() {
		return this.wellcareInsuranceAmendment;
	}

	public void setWellcareInsuranceAmendment(String wellcareInsuranceAmendment) {
		this.wellcareInsuranceAmendment = wellcareInsuranceAmendment;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "wellcare_insurance_amendment_start", nullable = false, length = 0)

	public Date getWellcareInsuranceAmendmentStart() {
		return this.wellcareInsuranceAmendmentStart;
	}

	public void setWellcareInsuranceAmendmentStart(Date wellcareInsuranceAmendmentStart) {
		this.wellcareInsuranceAmendmentStart = wellcareInsuranceAmendmentStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "wellcare_insurance_amendment_expire", nullable = false, length = 0)

	public Date getWellcareInsuranceAmendmentExpire() {
		return this.wellcareInsuranceAmendmentExpire;
	}

	public void setWellcareInsuranceAmendmentExpire(Date wellcareInsuranceAmendmentExpire) {
		this.wellcareInsuranceAmendmentExpire = wellcareInsuranceAmendmentExpire;
	}

	@Column(name = "wellcare_insurance_amendment_status", nullable = false)

	public Integer getWellcareInsuranceAmendmentStatus() {
		return this.wellcareInsuranceAmendmentStatus;
	}

	public void setWellcareInsuranceAmendmentStatus(Integer wellcareInsuranceAmendmentStatus) {
		this.wellcareInsuranceAmendmentStatus = wellcareInsuranceAmendmentStatus;
	}

	@Column(name = "insurance_endorsement_amendment", nullable = false)

	public String getInsuranceEndorsementAmendment() {
		return this.insuranceEndorsementAmendment;
	}

	public void setInsuranceEndorsementAmendment(String insuranceEndorsementAmendment) {
		this.insuranceEndorsementAmendment = insuranceEndorsementAmendment;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "insurance_endorsement_amendment_start", nullable = false, length = 0)

	public Date getInsuranceEndorsementAmendmentStart() {
		return this.insuranceEndorsementAmendmentStart;
	}

	public void setInsuranceEndorsementAmendmentStart(Date insuranceEndorsementAmendmentStart) {
		this.insuranceEndorsementAmendmentStart = insuranceEndorsementAmendmentStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "insurance_endorsement_amendment_expire", nullable = false, length = 0)

	public Date getInsuranceEndorsementAmendmentExpire() {
		return this.insuranceEndorsementAmendmentExpire;
	}

	public void setInsuranceEndorsementAmendmentExpire(Date insuranceEndorsementAmendmentExpire) {
		this.insuranceEndorsementAmendmentExpire = insuranceEndorsementAmendmentExpire;
	}

	@Column(name = "insurance_endorsement_amendment_status", nullable = false)

	public Integer getInsuranceEndorsementAmendmentStatus() {
		return this.insuranceEndorsementAmendmentStatus;
	}

	public void setInsuranceEndorsementAmendmentStatus(Integer insuranceEndorsementAmendmentStatus) {
		this.insuranceEndorsementAmendmentStatus = insuranceEndorsementAmendmentStatus;
	}

	@Column(name = "nyct_amendment", nullable = false)

	public String getNyctAmendment() {
		return this.nyctAmendment;
	}

	public void setNyctAmendment(String nyctAmendment) {
		this.nyctAmendment = nyctAmendment;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "nyct_amendment_start", nullable = false, length = 0)

	public Date getNyctAmendmentStart() {
		return this.nyctAmendmentStart;
	}

	public void setNyctAmendmentStart(Date nyctAmendmentStart) {
		this.nyctAmendmentStart = nyctAmendmentStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "nyct_amendment_expire", nullable = false, length = 0)

	public Date getNyctAmendmentExpire() {
		return this.nyctAmendmentExpire;
	}

	public void setNyctAmendmentExpire(Date nyctAmendmentExpire) {
		this.nyctAmendmentExpire = nyctAmendmentExpire;
	}

	@Column(name = "nyct_amendment_status", nullable = false)

	public Integer getNyctAmendmentStatus() {
		return this.nyctAmendmentStatus;
	}

	public void setNyctAmendmentStatus(Integer nyctAmendmentStatus) {
		this.nyctAmendmentStatus = nyctAmendmentStatus;
	}

	@Column(name = "service_agreement", nullable = false)

	public String getServiceAgreement() {
		return this.serviceAgreement;
	}

	public void setServiceAgreement(String serviceAgreement) {
		this.serviceAgreement = serviceAgreement;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "service_agreement_start", nullable = false, length = 0)

	public Date getServiceAgreementStart() {
		return this.serviceAgreementStart;
	}

	public void setServiceAgreementStart(Date serviceAgreementStart) {
		this.serviceAgreementStart = serviceAgreementStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "service_agreement_expire", nullable = false, length = 0)

	public Date getServiceAgreementExpire() {
		return this.serviceAgreementExpire;
	}

	public void setServiceAgreementExpire(Date serviceAgreementExpire) {
		this.serviceAgreementExpire = serviceAgreementExpire;
	}

	@Column(name = "service_agreement_status", nullable = false)

	public Integer getServiceAgreementStatus() {
		return this.serviceAgreementStatus;
	}

	public void setServiceAgreementStatus(Integer serviceAgreementStatus) {
		this.serviceAgreementStatus = serviceAgreementStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "visit_date", nullable = false, length = 0)

	public Date getVisitDate() {
		return this.visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	@Column(name = "visit_performed_by", nullable = false)

	public String getVisitPerformedBy() {
		return this.visitPerformedBy;
	}

	public void setVisitPerformedBy(String visitPerformedBy) {
		this.visitPerformedBy = visitPerformedBy;
	}

	@Column(name = "visit_type", nullable = false)

	public String getVisitType() {
		return this.visitType;
	}

	public void setVisitType(String visitType) {
		this.visitType = visitType;
	}

	@Column(name = "appt_cancelled_by_vendor", nullable = false)

	public Integer getApptCancelledByVendor() {
		return this.apptCancelledByVendor;
	}

	public void setApptCancelledByVendor(Integer apptCancelledByVendor) {
		this.apptCancelledByVendor = apptCancelledByVendor;
	}

	@Column(name = "no_show", nullable = false)

	public Integer getNoShow() {
		return this.noShow;
	}

	public void setNoShow(Integer noShow) {
		this.noShow = noShow;
	}

	@Column(name = "provider_audit", nullable = false)

	public String getProviderAudit() {
		return this.providerAudit;
	}

	public void setProviderAudit(String providerAudit) {
		this.providerAudit = providerAudit;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "provider_audit_start", nullable = false, length = 0)

	public Date getProviderAuditStart() {
		return this.providerAuditStart;
	}

	public void setProviderAuditStart(Date providerAuditStart) {
		this.providerAuditStart = providerAuditStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "provider_audit_expire", nullable = false, length = 0)

	public Date getProviderAuditExpire() {
		return this.providerAuditExpire;
	}

	public void setProviderAuditExpire(Date providerAuditExpire) {
		this.providerAuditExpire = providerAuditExpire;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBase")

	public Set<TaxiNotification> getTaxiNotifications() {
		return this.taxiNotifications;
	}

	public void setTaxiNotifications(Set<TaxiNotification> taxiNotifications) {
		this.taxiNotifications = taxiNotifications;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBase")

	public Set<TaxiBooking> getTaxiBookings() {
		return this.taxiBookings;
	}

	public void setTaxiBookings(Set<TaxiBooking> taxiBookings) {
		this.taxiBookings = taxiBookings;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBase")

	public Set<TaxiDriver> getTaxiDrivers() {
		return this.taxiDrivers;
	}

	public void setTaxiDrivers(Set<TaxiDriver> taxiDrivers) {
		this.taxiDrivers = taxiDrivers;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBase")

	public Set<TaxiTripPool> getTaxiTripPools() {
		return this.taxiTripPools;
	}

	public void setTaxiTripPools(Set<TaxiTripPool> taxiTripPools) {
		this.taxiTripPools = taxiTripPools;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBase")

	public Set<TaxiFeedback> getTaxiFeedbacks() {
		return this.taxiFeedbacks;
	}

	public void setTaxiFeedbacks(Set<TaxiFeedback> taxiFeedbacks) {
		this.taxiFeedbacks = taxiFeedbacks;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBase")

	public Set<TaxiDriverFilter> getTaxiDriverFilters() {
		return this.taxiDriverFilters;
	}

	public void setTaxiDriverFilters(Set<TaxiDriverFilter> taxiDriverFilters) {
		this.taxiDriverFilters = taxiDriverFilters;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBase")

	public Set<TaxiRatebook> getTaxiRatebooks() {
		return this.taxiRatebooks;
	}

	public void setTaxiRatebooks(Set<TaxiRatebook> taxiRatebooks) {
		this.taxiRatebooks = taxiRatebooks;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBase")

	public Set<TaxiTripDetail> getTaxiTripDetails() {
		return this.taxiTripDetails;
	}

	public void setTaxiTripDetails(Set<TaxiTripDetail> taxiTripDetails) {
		this.taxiTripDetails = taxiTripDetails;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBase")

	public Set<TaxiUsers> getTaxiUserses() {
		return this.taxiUserses;
	}

	public void setTaxiUserses(Set<TaxiUsers> taxiUserses) {
		this.taxiUserses = taxiUserses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBase")

	public Set<TaxiPayment> getTaxiPayments() {
		return this.taxiPayments;
	}

	public void setTaxiPayments(Set<TaxiPayment> taxiPayments) {
		this.taxiPayments = taxiPayments;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBase")

	public Set<TaxiInsuranceRatebook> getTaxiInsuranceRatebooks() {
		return this.taxiInsuranceRatebooks;
	}

	public void setTaxiInsuranceRatebooks(Set<TaxiInsuranceRatebook> taxiInsuranceRatebooks) {
		this.taxiInsuranceRatebooks = taxiInsuranceRatebooks;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBase")

	public Set<TaxiTrip> getTaxiTrips() {
		return this.taxiTrips;
	}

	public void setTaxiTrips(Set<TaxiTrip> taxiTrips) {
		this.taxiTrips = taxiTrips;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBase")

	public Set<TaxiPreScheduleHistory> getTaxiPreScheduleHistories() {
		return this.taxiPreScheduleHistories;
	}

	public void setTaxiPreScheduleHistories(Set<TaxiPreScheduleHistory> taxiPreScheduleHistories) {
		this.taxiPreScheduleHistories = taxiPreScheduleHistories;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBase")

	public Set<TaxiDriverRating> getTaxiDriverRatings() {
		return this.taxiDriverRatings;
	}

	public void setTaxiDriverRatings(Set<TaxiDriverRating> taxiDriverRatings) {
		this.taxiDriverRatings = taxiDriverRatings;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBase")

	public Set<TaxiPreScheduleGroup> getTaxiPreScheduleGroups() {
		return this.taxiPreScheduleGroups;
	}

	public void setTaxiPreScheduleGroups(Set<TaxiPreScheduleGroup> taxiPreScheduleGroups) {
		this.taxiPreScheduleGroups = taxiPreScheduleGroups;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBase")

	public Set<TaxiTransaction> getTaxiTransactions() {
		return this.taxiTransactions;
	}

	public void setTaxiTransactions(Set<TaxiTransaction> taxiTransactions) {
		this.taxiTransactions = taxiTransactions;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBase")

	public Set<TaxiVehicle> getTaxiVehicles() {
		return this.taxiVehicles;
	}

	public void setTaxiVehicles(Set<TaxiVehicle> taxiVehicles) {
		this.taxiVehicles = taxiVehicles;
	}

}