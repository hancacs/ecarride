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
 * TaxiDriver entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_driver", catalog = "ecarride_db_foreign_key")

public class TaxiDriver implements java.io.Serializable {

	// Fields

	private Integer id;
	private TaxiVehicle taxiVehicle;
	private TaxiBase taxiBase;
	private TaxiCompany taxiCompany;
	private String merchantAccountId;
	private Integer groupId;
	private String username;
	private String password;
	private Integer driverType;
	private String firstName;
	private String lastName;
	private String fleetNum;
	private String phone;
	private String secondaryPhone;
	private String email;
	private Date dob;
	private Integer gender;
	private String nationality;
	private Integer drivingExperience;
	private String verificationCode;
	private String profilePhoto;
	private String signature;
	private String driverLicense;
	private String driverLicenseNum;
	private String driverLicenseClass;
	private String driverLicenseState;
	private Date driverLicenseStart;
	private Date driverLicenseExpire;
	private Integer driverLicenseStatus;
	private String driverTlcFhvLicense;
	private String driverTlcFhvLicenseNum;
	private Date driverTlcFhvLicenseStart;
	private Date driverTlcFhvLicenseExpire;
	private Integer driverTlcFhvLicenseStatus;
	private String backgroundCheck;
	private Date backgroundCheckStart;
	private Date backgroundCheckExpire;
	private Integer backgroundCheckStatus;
	private String drivingRecord;
	private Date drivingRecordStart;
	private Date drivingRecordExpire;
	private Integer drivingRecordStatus;
	private String drugScreen;
	private Date drugScreenStart;
	private Date drugScreenExpire;
	private Integer drugScreenStatus;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private Integer allowPets;
	private Integer allowWheelchair;
	private Integer dutyStatus;
	private String appLanguage;
	private String deviceToken;
	private String deviceId;
	private String mobileOs;
	private String objectId;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer approvableMail;
	private Integer baseApproved;
	private Integer status;
	private Set<TaxiPreScheduleHistory> taxiPreScheduleHistories = new HashSet<TaxiPreScheduleHistory>(0);
	private Set<TaxiFavoriteList> taxiFavoriteLists = new HashSet<TaxiFavoriteList>(0);
	private Set<TaxiPayment> taxiPayments = new HashSet<TaxiPayment>(0);
	private Set<TaxiTripDetail> taxiTripDetails = new HashSet<TaxiTripDetail>(0);
	private Set<TaxiBlackList> taxiBlackLists = new HashSet<TaxiBlackList>(0);

	// Constructors

	/** default constructor */
	public TaxiDriver() {
	}

	/** minimal constructor */
	public TaxiDriver(TaxiVehicle taxiVehicle, TaxiBase taxiBase, TaxiCompany taxiCompany, String merchantAccountId,
			Integer groupId, String username, String password, Integer driverType, String firstName, String lastName,
			String fleetNum, String phone, String secondaryPhone, String email, Date dob, Integer gender,
			String nationality, Integer drivingExperience, String verificationCode, String profilePhoto,
			String signature, String driverLicense, String driverLicenseNum, String driverLicenseClass,
			String driverLicenseState, Date driverLicenseStart, Date driverLicenseExpire, Integer driverLicenseStatus,
			String driverTlcFhvLicense, String driverTlcFhvLicenseNum, Date driverTlcFhvLicenseStart,
			Date driverTlcFhvLicenseExpire, Integer driverTlcFhvLicenseStatus, String backgroundCheck,
			Date backgroundCheckStart, Date backgroundCheckExpire, Integer backgroundCheckStatus, String drivingRecord,
			Date drivingRecordStart, Date drivingRecordExpire, Integer drivingRecordStatus, String drugScreen,
			Date drugScreenStart, Date drugScreenExpire, Integer drugScreenStatus, String address, String city,
			String state, String zipcode, Integer allowPets, Integer allowWheelchair, Integer dutyStatus,
			String appLanguage, String deviceToken, String deviceId, String mobileOs, String objectId,
			Timestamp createdAt, Timestamp updatedAt, Integer approvableMail, Integer baseApproved, Integer status) {
		this.taxiVehicle = taxiVehicle;
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.merchantAccountId = merchantAccountId;
		this.groupId = groupId;
		this.username = username;
		this.password = password;
		this.driverType = driverType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fleetNum = fleetNum;
		this.phone = phone;
		this.secondaryPhone = secondaryPhone;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.nationality = nationality;
		this.drivingExperience = drivingExperience;
		this.verificationCode = verificationCode;
		this.profilePhoto = profilePhoto;
		this.signature = signature;
		this.driverLicense = driverLicense;
		this.driverLicenseNum = driverLicenseNum;
		this.driverLicenseClass = driverLicenseClass;
		this.driverLicenseState = driverLicenseState;
		this.driverLicenseStart = driverLicenseStart;
		this.driverLicenseExpire = driverLicenseExpire;
		this.driverLicenseStatus = driverLicenseStatus;
		this.driverTlcFhvLicense = driverTlcFhvLicense;
		this.driverTlcFhvLicenseNum = driverTlcFhvLicenseNum;
		this.driverTlcFhvLicenseStart = driverTlcFhvLicenseStart;
		this.driverTlcFhvLicenseExpire = driverTlcFhvLicenseExpire;
		this.driverTlcFhvLicenseStatus = driverTlcFhvLicenseStatus;
		this.backgroundCheck = backgroundCheck;
		this.backgroundCheckStart = backgroundCheckStart;
		this.backgroundCheckExpire = backgroundCheckExpire;
		this.backgroundCheckStatus = backgroundCheckStatus;
		this.drivingRecord = drivingRecord;
		this.drivingRecordStart = drivingRecordStart;
		this.drivingRecordExpire = drivingRecordExpire;
		this.drivingRecordStatus = drivingRecordStatus;
		this.drugScreen = drugScreen;
		this.drugScreenStart = drugScreenStart;
		this.drugScreenExpire = drugScreenExpire;
		this.drugScreenStatus = drugScreenStatus;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.allowPets = allowPets;
		this.allowWheelchair = allowWheelchair;
		this.dutyStatus = dutyStatus;
		this.appLanguage = appLanguage;
		this.deviceToken = deviceToken;
		this.deviceId = deviceId;
		this.mobileOs = mobileOs;
		this.objectId = objectId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.approvableMail = approvableMail;
		this.baseApproved = baseApproved;
		this.status = status;
	}

	/** full constructor */
	public TaxiDriver(TaxiVehicle taxiVehicle, TaxiBase taxiBase, TaxiCompany taxiCompany, String merchantAccountId,
			Integer groupId, String username, String password, Integer driverType, String firstName, String lastName,
			String fleetNum, String phone, String secondaryPhone, String email, Date dob, Integer gender,
			String nationality, Integer drivingExperience, String verificationCode, String profilePhoto,
			String signature, String driverLicense, String driverLicenseNum, String driverLicenseClass,
			String driverLicenseState, Date driverLicenseStart, Date driverLicenseExpire, Integer driverLicenseStatus,
			String driverTlcFhvLicense, String driverTlcFhvLicenseNum, Date driverTlcFhvLicenseStart,
			Date driverTlcFhvLicenseExpire, Integer driverTlcFhvLicenseStatus, String backgroundCheck,
			Date backgroundCheckStart, Date backgroundCheckExpire, Integer backgroundCheckStatus, String drivingRecord,
			Date drivingRecordStart, Date drivingRecordExpire, Integer drivingRecordStatus, String drugScreen,
			Date drugScreenStart, Date drugScreenExpire, Integer drugScreenStatus, String address, String city,
			String state, String zipcode, Integer allowPets, Integer allowWheelchair, Integer dutyStatus,
			String appLanguage, String deviceToken, String deviceId, String mobileOs, String objectId,
			Timestamp createdAt, Timestamp updatedAt, Integer approvableMail, Integer baseApproved, Integer status,
			Set<TaxiPreScheduleHistory> taxiPreScheduleHistories, Set<TaxiFavoriteList> taxiFavoriteLists,
			Set<TaxiPayment> taxiPayments, Set<TaxiTripDetail> taxiTripDetails, Set<TaxiBlackList> taxiBlackLists) {
		this.taxiVehicle = taxiVehicle;
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.merchantAccountId = merchantAccountId;
		this.groupId = groupId;
		this.username = username;
		this.password = password;
		this.driverType = driverType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fleetNum = fleetNum;
		this.phone = phone;
		this.secondaryPhone = secondaryPhone;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.nationality = nationality;
		this.drivingExperience = drivingExperience;
		this.verificationCode = verificationCode;
		this.profilePhoto = profilePhoto;
		this.signature = signature;
		this.driverLicense = driverLicense;
		this.driverLicenseNum = driverLicenseNum;
		this.driverLicenseClass = driverLicenseClass;
		this.driverLicenseState = driverLicenseState;
		this.driverLicenseStart = driverLicenseStart;
		this.driverLicenseExpire = driverLicenseExpire;
		this.driverLicenseStatus = driverLicenseStatus;
		this.driverTlcFhvLicense = driverTlcFhvLicense;
		this.driverTlcFhvLicenseNum = driverTlcFhvLicenseNum;
		this.driverTlcFhvLicenseStart = driverTlcFhvLicenseStart;
		this.driverTlcFhvLicenseExpire = driverTlcFhvLicenseExpire;
		this.driverTlcFhvLicenseStatus = driverTlcFhvLicenseStatus;
		this.backgroundCheck = backgroundCheck;
		this.backgroundCheckStart = backgroundCheckStart;
		this.backgroundCheckExpire = backgroundCheckExpire;
		this.backgroundCheckStatus = backgroundCheckStatus;
		this.drivingRecord = drivingRecord;
		this.drivingRecordStart = drivingRecordStart;
		this.drivingRecordExpire = drivingRecordExpire;
		this.drivingRecordStatus = drivingRecordStatus;
		this.drugScreen = drugScreen;
		this.drugScreenStart = drugScreenStart;
		this.drugScreenExpire = drugScreenExpire;
		this.drugScreenStatus = drugScreenStatus;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.allowPets = allowPets;
		this.allowWheelchair = allowWheelchair;
		this.dutyStatus = dutyStatus;
		this.appLanguage = appLanguage;
		this.deviceToken = deviceToken;
		this.deviceId = deviceId;
		this.mobileOs = mobileOs;
		this.objectId = objectId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.approvableMail = approvableMail;
		this.baseApproved = baseApproved;
		this.status = status;
		this.taxiPreScheduleHistories = taxiPreScheduleHistories;
		this.taxiFavoriteLists = taxiFavoriteLists;
		this.taxiPayments = taxiPayments;
		this.taxiTripDetails = taxiTripDetails;
		this.taxiBlackLists = taxiBlackLists;
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
	@JoinColumn(name = "vehicle_id", nullable = false)

	public TaxiVehicle getTaxiVehicle() {
		return this.taxiVehicle;
	}

	public void setTaxiVehicle(TaxiVehicle taxiVehicle) {
		this.taxiVehicle = taxiVehicle;
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

	@Column(name = "merchant_account_id", nullable = false)

	public String getMerchantAccountId() {
		return this.merchantAccountId;
	}

	public void setMerchantAccountId(String merchantAccountId) {
		this.merchantAccountId = merchantAccountId;
	}

	@Column(name = "group_id", nullable = false)

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	@Column(name = "username", nullable = false)

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false)

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "driver_type", nullable = false)

	public Integer getDriverType() {
		return this.driverType;
	}

	public void setDriverType(Integer driverType) {
		this.driverType = driverType;
	}

	@Column(name = "first_name", nullable = false)

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false)

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "fleet_num", nullable = false)

	public String getFleetNum() {
		return this.fleetNum;
	}

	public void setFleetNum(String fleetNum) {
		this.fleetNum = fleetNum;
	}

	@Column(name = "phone", nullable = false)

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "secondary_phone", nullable = false)

	public String getSecondaryPhone() {
		return this.secondaryPhone;
	}

	public void setSecondaryPhone(String secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}

	@Column(name = "email", nullable = false)

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dob", nullable = false, length = 0)

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Column(name = "gender", nullable = false)

	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	@Column(name = "nationality", nullable = false)

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Column(name = "driving_experience", nullable = false)

	public Integer getDrivingExperience() {
		return this.drivingExperience;
	}

	public void setDrivingExperience(Integer drivingExperience) {
		this.drivingExperience = drivingExperience;
	}

	@Column(name = "verification_code", nullable = false, length = 64)

	public String getVerificationCode() {
		return this.verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	@Column(name = "profile_photo", nullable = false)

	public String getProfilePhoto() {
		return this.profilePhoto;
	}

	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

	@Column(name = "signature", nullable = false)

	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	@Column(name = "driver_license", nullable = false)

	public String getDriverLicense() {
		return this.driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	@Column(name = "driver_license_num", nullable = false)

	public String getDriverLicenseNum() {
		return this.driverLicenseNum;
	}

	public void setDriverLicenseNum(String driverLicenseNum) {
		this.driverLicenseNum = driverLicenseNum;
	}

	@Column(name = "driver_license_class", nullable = false)

	public String getDriverLicenseClass() {
		return this.driverLicenseClass;
	}

	public void setDriverLicenseClass(String driverLicenseClass) {
		this.driverLicenseClass = driverLicenseClass;
	}

	@Column(name = "driver_license_state", nullable = false)

	public String getDriverLicenseState() {
		return this.driverLicenseState;
	}

	public void setDriverLicenseState(String driverLicenseState) {
		this.driverLicenseState = driverLicenseState;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "driver_license_start", nullable = false, length = 0)

	public Date getDriverLicenseStart() {
		return this.driverLicenseStart;
	}

	public void setDriverLicenseStart(Date driverLicenseStart) {
		this.driverLicenseStart = driverLicenseStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "driver_license_expire", nullable = false, length = 0)

	public Date getDriverLicenseExpire() {
		return this.driverLicenseExpire;
	}

	public void setDriverLicenseExpire(Date driverLicenseExpire) {
		this.driverLicenseExpire = driverLicenseExpire;
	}

	@Column(name = "driver_license_status", nullable = false)

	public Integer getDriverLicenseStatus() {
		return this.driverLicenseStatus;
	}

	public void setDriverLicenseStatus(Integer driverLicenseStatus) {
		this.driverLicenseStatus = driverLicenseStatus;
	}

	@Column(name = "driver_tlc_fhv_license", nullable = false)

	public String getDriverTlcFhvLicense() {
		return this.driverTlcFhvLicense;
	}

	public void setDriverTlcFhvLicense(String driverTlcFhvLicense) {
		this.driverTlcFhvLicense = driverTlcFhvLicense;
	}

	@Column(name = "driver_tlc_fhv_license_num", nullable = false)

	public String getDriverTlcFhvLicenseNum() {
		return this.driverTlcFhvLicenseNum;
	}

	public void setDriverTlcFhvLicenseNum(String driverTlcFhvLicenseNum) {
		this.driverTlcFhvLicenseNum = driverTlcFhvLicenseNum;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "driver_tlc_fhv_license_start", nullable = false, length = 0)

	public Date getDriverTlcFhvLicenseStart() {
		return this.driverTlcFhvLicenseStart;
	}

	public void setDriverTlcFhvLicenseStart(Date driverTlcFhvLicenseStart) {
		this.driverTlcFhvLicenseStart = driverTlcFhvLicenseStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "driver_tlc_fhv_license_expire", nullable = false, length = 0)

	public Date getDriverTlcFhvLicenseExpire() {
		return this.driverTlcFhvLicenseExpire;
	}

	public void setDriverTlcFhvLicenseExpire(Date driverTlcFhvLicenseExpire) {
		this.driverTlcFhvLicenseExpire = driverTlcFhvLicenseExpire;
	}

	@Column(name = "driver_tlc_fhv_license_status", nullable = false)

	public Integer getDriverTlcFhvLicenseStatus() {
		return this.driverTlcFhvLicenseStatus;
	}

	public void setDriverTlcFhvLicenseStatus(Integer driverTlcFhvLicenseStatus) {
		this.driverTlcFhvLicenseStatus = driverTlcFhvLicenseStatus;
	}

	@Column(name = "background_check", nullable = false)

	public String getBackgroundCheck() {
		return this.backgroundCheck;
	}

	public void setBackgroundCheck(String backgroundCheck) {
		this.backgroundCheck = backgroundCheck;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "background_check_start", nullable = false, length = 0)

	public Date getBackgroundCheckStart() {
		return this.backgroundCheckStart;
	}

	public void setBackgroundCheckStart(Date backgroundCheckStart) {
		this.backgroundCheckStart = backgroundCheckStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "background_check_expire", nullable = false, length = 0)

	public Date getBackgroundCheckExpire() {
		return this.backgroundCheckExpire;
	}

	public void setBackgroundCheckExpire(Date backgroundCheckExpire) {
		this.backgroundCheckExpire = backgroundCheckExpire;
	}

	@Column(name = "background_check_status", nullable = false)

	public Integer getBackgroundCheckStatus() {
		return this.backgroundCheckStatus;
	}

	public void setBackgroundCheckStatus(Integer backgroundCheckStatus) {
		this.backgroundCheckStatus = backgroundCheckStatus;
	}

	@Column(name = "driving_record", nullable = false)

	public String getDrivingRecord() {
		return this.drivingRecord;
	}

	public void setDrivingRecord(String drivingRecord) {
		this.drivingRecord = drivingRecord;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "driving_record_start", nullable = false, length = 0)

	public Date getDrivingRecordStart() {
		return this.drivingRecordStart;
	}

	public void setDrivingRecordStart(Date drivingRecordStart) {
		this.drivingRecordStart = drivingRecordStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "driving_record_expire", nullable = false, length = 0)

	public Date getDrivingRecordExpire() {
		return this.drivingRecordExpire;
	}

	public void setDrivingRecordExpire(Date drivingRecordExpire) {
		this.drivingRecordExpire = drivingRecordExpire;
	}

	@Column(name = "driving_record_status", nullable = false)

	public Integer getDrivingRecordStatus() {
		return this.drivingRecordStatus;
	}

	public void setDrivingRecordStatus(Integer drivingRecordStatus) {
		this.drivingRecordStatus = drivingRecordStatus;
	}

	@Column(name = "drug_screen", nullable = false)

	public String getDrugScreen() {
		return this.drugScreen;
	}

	public void setDrugScreen(String drugScreen) {
		this.drugScreen = drugScreen;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "drug_screen_start", nullable = false, length = 0)

	public Date getDrugScreenStart() {
		return this.drugScreenStart;
	}

	public void setDrugScreenStart(Date drugScreenStart) {
		this.drugScreenStart = drugScreenStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "drug_screen_expire", nullable = false, length = 0)

	public Date getDrugScreenExpire() {
		return this.drugScreenExpire;
	}

	public void setDrugScreenExpire(Date drugScreenExpire) {
		this.drugScreenExpire = drugScreenExpire;
	}

	@Column(name = "drug_screen_status", nullable = false)

	public Integer getDrugScreenStatus() {
		return this.drugScreenStatus;
	}

	public void setDrugScreenStatus(Integer drugScreenStatus) {
		this.drugScreenStatus = drugScreenStatus;
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

	@Column(name = "allow_pets", nullable = false)

	public Integer getAllowPets() {
		return this.allowPets;
	}

	public void setAllowPets(Integer allowPets) {
		this.allowPets = allowPets;
	}

	@Column(name = "allow_wheelchair", nullable = false)

	public Integer getAllowWheelchair() {
		return this.allowWheelchair;
	}

	public void setAllowWheelchair(Integer allowWheelchair) {
		this.allowWheelchair = allowWheelchair;
	}

	@Column(name = "duty_status", nullable = false)

	public Integer getDutyStatus() {
		return this.dutyStatus;
	}

	public void setDutyStatus(Integer dutyStatus) {
		this.dutyStatus = dutyStatus;
	}

	@Column(name = "app_language", nullable = false)

	public String getAppLanguage() {
		return this.appLanguage;
	}

	public void setAppLanguage(String appLanguage) {
		this.appLanguage = appLanguage;
	}

	@Column(name = "device_token", nullable = false)

	public String getDeviceToken() {
		return this.deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	@Column(name = "device_id", nullable = false)

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	@Column(name = "mobile_os", nullable = false)

	public String getMobileOs() {
		return this.mobileOs;
	}

	public void setMobileOs(String mobileOs) {
		this.mobileOs = mobileOs;
	}

	@Column(name = "object_id", nullable = false)

	public String getObjectId() {
		return this.objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
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

	@Column(name = "approvable_mail", nullable = false)

	public Integer getApprovableMail() {
		return this.approvableMail;
	}

	public void setApprovableMail(Integer approvableMail) {
		this.approvableMail = approvableMail;
	}

	@Column(name = "base_approved", nullable = false)

	public Integer getBaseApproved() {
		return this.baseApproved;
	}

	public void setBaseApproved(Integer baseApproved) {
		this.baseApproved = baseApproved;
	}

	@Column(name = "status", nullable = false)

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiDriver")

	public Set<TaxiPreScheduleHistory> getTaxiPreScheduleHistories() {
		return this.taxiPreScheduleHistories;
	}

	public void setTaxiPreScheduleHistories(Set<TaxiPreScheduleHistory> taxiPreScheduleHistories) {
		this.taxiPreScheduleHistories = taxiPreScheduleHistories;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiDriver")

	public Set<TaxiFavoriteList> getTaxiFavoriteLists() {
		return this.taxiFavoriteLists;
	}

	public void setTaxiFavoriteLists(Set<TaxiFavoriteList> taxiFavoriteLists) {
		this.taxiFavoriteLists = taxiFavoriteLists;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiDriver")

	public Set<TaxiPayment> getTaxiPayments() {
		return this.taxiPayments;
	}

	public void setTaxiPayments(Set<TaxiPayment> taxiPayments) {
		this.taxiPayments = taxiPayments;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiDriver")

	public Set<TaxiTripDetail> getTaxiTripDetails() {
		return this.taxiTripDetails;
	}

	public void setTaxiTripDetails(Set<TaxiTripDetail> taxiTripDetails) {
		this.taxiTripDetails = taxiTripDetails;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiDriver")

	public Set<TaxiBlackList> getTaxiBlackLists() {
		return this.taxiBlackLists;
	}

	public void setTaxiBlackLists(Set<TaxiBlackList> taxiBlackLists) {
		this.taxiBlackLists = taxiBlackLists;
	}



	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		TaxiDriver that = (TaxiDriver) o;

		if (id != null ? !id.equals(that.id) : that.id != null) return false;
		if (taxiVehicle != null ? !taxiVehicle.equals(that.taxiVehicle) : that.taxiVehicle != null) return false;
		if (taxiBase != null ? !taxiBase.equals(that.taxiBase) : that.taxiBase != null) return false;
		if (taxiCompany != null ? !taxiCompany.equals(that.taxiCompany) : that.taxiCompany != null) return false;
		if (merchantAccountId != null ? !merchantAccountId.equals(that.merchantAccountId) : that.merchantAccountId != null)
			return false;
		if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
		if (username != null ? !username.equals(that.username) : that.username != null) return false;
		if (password != null ? !password.equals(that.password) : that.password != null) return false;
		if (driverType != null ? !driverType.equals(that.driverType) : that.driverType != null) return false;
		if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
		if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
		if (fleetNum != null ? !fleetNum.equals(that.fleetNum) : that.fleetNum != null) return false;
		if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
		if (secondaryPhone != null ? !secondaryPhone.equals(that.secondaryPhone) : that.secondaryPhone != null)
			return false;
		if (email != null ? !email.equals(that.email) : that.email != null) return false;
		if (dob != null ? !dob.equals(that.dob) : that.dob != null) return false;
		if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
		if (nationality != null ? !nationality.equals(that.nationality) : that.nationality != null) return false;
		if (drivingExperience != null ? !drivingExperience.equals(that.drivingExperience) : that.drivingExperience != null)
			return false;
		if (verificationCode != null ? !verificationCode.equals(that.verificationCode) : that.verificationCode != null)
			return false;
		if (profilePhoto != null ? !profilePhoto.equals(that.profilePhoto) : that.profilePhoto != null) return false;
		if (signature != null ? !signature.equals(that.signature) : that.signature != null) return false;
		if (driverLicense != null ? !driverLicense.equals(that.driverLicense) : that.driverLicense != null)
			return false;
		if (driverLicenseNum != null ? !driverLicenseNum.equals(that.driverLicenseNum) : that.driverLicenseNum != null)
			return false;
		if (driverLicenseClass != null ? !driverLicenseClass.equals(that.driverLicenseClass) : that.driverLicenseClass != null)
			return false;
		if (driverLicenseState != null ? !driverLicenseState.equals(that.driverLicenseState) : that.driverLicenseState != null)
			return false;
		if (driverLicenseStart != null ? !driverLicenseStart.equals(that.driverLicenseStart) : that.driverLicenseStart != null)
			return false;
		if (driverLicenseExpire != null ? !driverLicenseExpire.equals(that.driverLicenseExpire) : that.driverLicenseExpire != null)
			return false;
		if (driverLicenseStatus != null ? !driverLicenseStatus.equals(that.driverLicenseStatus) : that.driverLicenseStatus != null)
			return false;
		if (driverTlcFhvLicense != null ? !driverTlcFhvLicense.equals(that.driverTlcFhvLicense) : that.driverTlcFhvLicense != null)
			return false;
		if (driverTlcFhvLicenseNum != null ? !driverTlcFhvLicenseNum.equals(that.driverTlcFhvLicenseNum) : that.driverTlcFhvLicenseNum != null)
			return false;
		if (driverTlcFhvLicenseStart != null ? !driverTlcFhvLicenseStart.equals(that.driverTlcFhvLicenseStart) : that.driverTlcFhvLicenseStart != null)
			return false;
		if (driverTlcFhvLicenseExpire != null ? !driverTlcFhvLicenseExpire.equals(that.driverTlcFhvLicenseExpire) : that.driverTlcFhvLicenseExpire != null)
			return false;
		if (driverTlcFhvLicenseStatus != null ? !driverTlcFhvLicenseStatus.equals(that.driverTlcFhvLicenseStatus) : that.driverTlcFhvLicenseStatus != null)
			return false;
		if (backgroundCheck != null ? !backgroundCheck.equals(that.backgroundCheck) : that.backgroundCheck != null)
			return false;
		if (backgroundCheckStart != null ? !backgroundCheckStart.equals(that.backgroundCheckStart) : that.backgroundCheckStart != null)
			return false;
		if (backgroundCheckExpire != null ? !backgroundCheckExpire.equals(that.backgroundCheckExpire) : that.backgroundCheckExpire != null)
			return false;
		if (backgroundCheckStatus != null ? !backgroundCheckStatus.equals(that.backgroundCheckStatus) : that.backgroundCheckStatus != null)
			return false;
		if (drivingRecord != null ? !drivingRecord.equals(that.drivingRecord) : that.drivingRecord != null)
			return false;
		if (drivingRecordStart != null ? !drivingRecordStart.equals(that.drivingRecordStart) : that.drivingRecordStart != null)
			return false;
		if (drivingRecordExpire != null ? !drivingRecordExpire.equals(that.drivingRecordExpire) : that.drivingRecordExpire != null)
			return false;
		if (drivingRecordStatus != null ? !drivingRecordStatus.equals(that.drivingRecordStatus) : that.drivingRecordStatus != null)
			return false;
		if (drugScreen != null ? !drugScreen.equals(that.drugScreen) : that.drugScreen != null) return false;
		if (drugScreenStart != null ? !drugScreenStart.equals(that.drugScreenStart) : that.drugScreenStart != null)
			return false;
		if (drugScreenExpire != null ? !drugScreenExpire.equals(that.drugScreenExpire) : that.drugScreenExpire != null)
			return false;
		if (drugScreenStatus != null ? !drugScreenStatus.equals(that.drugScreenStatus) : that.drugScreenStatus != null)
			return false;
		if (address != null ? !address.equals(that.address) : that.address != null) return false;
		if (city != null ? !city.equals(that.city) : that.city != null) return false;
		if (state != null ? !state.equals(that.state) : that.state != null) return false;
		if (zipcode != null ? !zipcode.equals(that.zipcode) : that.zipcode != null) return false;
		if (allowPets != null ? !allowPets.equals(that.allowPets) : that.allowPets != null) return false;
		if (allowWheelchair != null ? !allowWheelchair.equals(that.allowWheelchair) : that.allowWheelchair != null)
			return false;
		if (dutyStatus != null ? !dutyStatus.equals(that.dutyStatus) : that.dutyStatus != null) return false;
		if (appLanguage != null ? !appLanguage.equals(that.appLanguage) : that.appLanguage != null) return false;
		if (deviceToken != null ? !deviceToken.equals(that.deviceToken) : that.deviceToken != null) return false;
		if (deviceId != null ? !deviceId.equals(that.deviceId) : that.deviceId != null) return false;
		if (mobileOs != null ? !mobileOs.equals(that.mobileOs) : that.mobileOs != null) return false;
		if (objectId != null ? !objectId.equals(that.objectId) : that.objectId != null) return false;
		if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
		if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
		if (approvableMail != null ? !approvableMail.equals(that.approvableMail) : that.approvableMail != null)
			return false;
		if (baseApproved != null ? !baseApproved.equals(that.baseApproved) : that.baseApproved != null) return false;
		if (status != null ? !status.equals(that.status) : that.status != null) return false;
		if (taxiPreScheduleHistories != null ? !taxiPreScheduleHistories.equals(that.taxiPreScheduleHistories) : that.taxiPreScheduleHistories != null)
			return false;
		if (taxiFavoriteLists != null ? !taxiFavoriteLists.equals(that.taxiFavoriteLists) : that.taxiFavoriteLists != null)
			return false;
		if (taxiPayments != null ? !taxiPayments.equals(that.taxiPayments) : that.taxiPayments != null) return false;
		if (taxiTripDetails != null ? !taxiTripDetails.equals(that.taxiTripDetails) : that.taxiTripDetails != null)
			return false;
		return taxiBlackLists != null ? taxiBlackLists.equals(that.taxiBlackLists) : that.taxiBlackLists == null;

	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (taxiVehicle != null ? taxiVehicle.hashCode() : 0);
		result = 31 * result + (taxiBase != null ? taxiBase.hashCode() : 0);
		result = 31 * result + (taxiCompany != null ? taxiCompany.hashCode() : 0);
		result = 31 * result + (merchantAccountId != null ? merchantAccountId.hashCode() : 0);
		result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
		result = 31 * result + (username != null ? username.hashCode() : 0);
		result = 31 * result + (password != null ? password.hashCode() : 0);
		result = 31 * result + (driverType != null ? driverType.hashCode() : 0);
		result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
		result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
		result = 31 * result + (fleetNum != null ? fleetNum.hashCode() : 0);
		result = 31 * result + (phone != null ? phone.hashCode() : 0);
		result = 31 * result + (secondaryPhone != null ? secondaryPhone.hashCode() : 0);
		result = 31 * result + (email != null ? email.hashCode() : 0);
		result = 31 * result + (dob != null ? dob.hashCode() : 0);
		result = 31 * result + (gender != null ? gender.hashCode() : 0);
		result = 31 * result + (nationality != null ? nationality.hashCode() : 0);
		result = 31 * result + (drivingExperience != null ? drivingExperience.hashCode() : 0);
		result = 31 * result + (verificationCode != null ? verificationCode.hashCode() : 0);
		result = 31 * result + (profilePhoto != null ? profilePhoto.hashCode() : 0);
		result = 31 * result + (signature != null ? signature.hashCode() : 0);
		result = 31 * result + (driverLicense != null ? driverLicense.hashCode() : 0);
		result = 31 * result + (driverLicenseNum != null ? driverLicenseNum.hashCode() : 0);
		result = 31 * result + (driverLicenseClass != null ? driverLicenseClass.hashCode() : 0);
		result = 31 * result + (driverLicenseState != null ? driverLicenseState.hashCode() : 0);
		result = 31 * result + (driverLicenseStart != null ? driverLicenseStart.hashCode() : 0);
		result = 31 * result + (driverLicenseExpire != null ? driverLicenseExpire.hashCode() : 0);
		result = 31 * result + (driverLicenseStatus != null ? driverLicenseStatus.hashCode() : 0);
		result = 31 * result + (driverTlcFhvLicense != null ? driverTlcFhvLicense.hashCode() : 0);
		result = 31 * result + (driverTlcFhvLicenseNum != null ? driverTlcFhvLicenseNum.hashCode() : 0);
		result = 31 * result + (driverTlcFhvLicenseStart != null ? driverTlcFhvLicenseStart.hashCode() : 0);
		result = 31 * result + (driverTlcFhvLicenseExpire != null ? driverTlcFhvLicenseExpire.hashCode() : 0);
		result = 31 * result + (driverTlcFhvLicenseStatus != null ? driverTlcFhvLicenseStatus.hashCode() : 0);
		result = 31 * result + (backgroundCheck != null ? backgroundCheck.hashCode() : 0);
		result = 31 * result + (backgroundCheckStart != null ? backgroundCheckStart.hashCode() : 0);
		result = 31 * result + (backgroundCheckExpire != null ? backgroundCheckExpire.hashCode() : 0);
		result = 31 * result + (backgroundCheckStatus != null ? backgroundCheckStatus.hashCode() : 0);
		result = 31 * result + (drivingRecord != null ? drivingRecord.hashCode() : 0);
		result = 31 * result + (drivingRecordStart != null ? drivingRecordStart.hashCode() : 0);
		result = 31 * result + (drivingRecordExpire != null ? drivingRecordExpire.hashCode() : 0);
		result = 31 * result + (drivingRecordStatus != null ? drivingRecordStatus.hashCode() : 0);
		result = 31 * result + (drugScreen != null ? drugScreen.hashCode() : 0);
		result = 31 * result + (drugScreenStart != null ? drugScreenStart.hashCode() : 0);
		result = 31 * result + (drugScreenExpire != null ? drugScreenExpire.hashCode() : 0);
		result = 31 * result + (drugScreenStatus != null ? drugScreenStatus.hashCode() : 0);
		result = 31 * result + (address != null ? address.hashCode() : 0);
		result = 31 * result + (city != null ? city.hashCode() : 0);
		result = 31 * result + (state != null ? state.hashCode() : 0);
		result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
		result = 31 * result + (allowPets != null ? allowPets.hashCode() : 0);
		result = 31 * result + (allowWheelchair != null ? allowWheelchair.hashCode() : 0);
		result = 31 * result + (dutyStatus != null ? dutyStatus.hashCode() : 0);
		result = 31 * result + (appLanguage != null ? appLanguage.hashCode() : 0);
		result = 31 * result + (deviceToken != null ? deviceToken.hashCode() : 0);
		result = 31 * result + (deviceId != null ? deviceId.hashCode() : 0);
		result = 31 * result + (mobileOs != null ? mobileOs.hashCode() : 0);
		result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
		result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
		result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
		result = 31 * result + (approvableMail != null ? approvableMail.hashCode() : 0);
		result = 31 * result + (baseApproved != null ? baseApproved.hashCode() : 0);
		result = 31 * result + (status != null ? status.hashCode() : 0);
		result = 31 * result + (taxiPreScheduleHistories != null ? taxiPreScheduleHistories.hashCode() : 0);
		result = 31 * result + (taxiFavoriteLists != null ? taxiFavoriteLists.hashCode() : 0);
		result = 31 * result + (taxiPayments != null ? taxiPayments.hashCode() : 0);
		result = 31 * result + (taxiTripDetails != null ? taxiTripDetails.hashCode() : 0);
		result = 31 * result + (taxiBlackLists != null ? taxiBlackLists.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "TaxiDriver{" +
				"id=" + id +
				", taxiVehicle=" + taxiVehicle +
				", taxiBase=" + taxiBase +
				", taxiCompany=" + taxiCompany +
				", merchantAccountId='" + merchantAccountId + '\'' +
				", groupId=" + groupId +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", driverType=" + driverType +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", fleetNum='" + fleetNum + '\'' +
				", phone='" + phone + '\'' +
				", secondaryPhone='" + secondaryPhone + '\'' +
				", email='" + email + '\'' +
				", dob=" + dob +
				", gender=" + gender +
				", nationality='" + nationality + '\'' +
				", drivingExperience=" + drivingExperience +
				", verificationCode='" + verificationCode + '\'' +
				", profilePhoto='" + profilePhoto + '\'' +
				", signature='" + signature + '\'' +
				", driverLicense='" + driverLicense + '\'' +
				", driverLicenseNum='" + driverLicenseNum + '\'' +
				", driverLicenseClass='" + driverLicenseClass + '\'' +
				", driverLicenseState='" + driverLicenseState + '\'' +
				", driverLicenseStart=" + driverLicenseStart +
				", driverLicenseExpire=" + driverLicenseExpire +
				", driverLicenseStatus=" + driverLicenseStatus +
				", driverTlcFhvLicense='" + driverTlcFhvLicense + '\'' +
				", driverTlcFhvLicenseNum='" + driverTlcFhvLicenseNum + '\'' +
				", driverTlcFhvLicenseStart=" + driverTlcFhvLicenseStart +
				", driverTlcFhvLicenseExpire=" + driverTlcFhvLicenseExpire +
				", driverTlcFhvLicenseStatus=" + driverTlcFhvLicenseStatus +
				", backgroundCheck='" + backgroundCheck + '\'' +
				", backgroundCheckStart=" + backgroundCheckStart +
				", backgroundCheckExpire=" + backgroundCheckExpire +
				", backgroundCheckStatus=" + backgroundCheckStatus +
				", drivingRecord='" + drivingRecord + '\'' +
				", drivingRecordStart=" + drivingRecordStart +
				", drivingRecordExpire=" + drivingRecordExpire +
				", drivingRecordStatus=" + drivingRecordStatus +
				", drugScreen='" + drugScreen + '\'' +
				", drugScreenStart=" + drugScreenStart +
				", drugScreenExpire=" + drugScreenExpire +
				", drugScreenStatus=" + drugScreenStatus +
				", address='" + address + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", zipcode='" + zipcode + '\'' +
				", allowPets=" + allowPets +
				", allowWheelchair=" + allowWheelchair +
				", dutyStatus=" + dutyStatus +
				", appLanguage='" + appLanguage + '\'' +
				", deviceToken='" + deviceToken + '\'' +
				", deviceId='" + deviceId + '\'' +
				", mobileOs='" + mobileOs + '\'' +
				", objectId='" + objectId + '\'' +
				", createdAt=" + createdAt +
				", updatedAt=" + updatedAt +
				", approvableMail=" + approvableMail +
				", baseApproved=" + baseApproved +
				", status=" + status +
				", taxiPreScheduleHistories=" + taxiPreScheduleHistories +
				", taxiFavoriteLists=" + taxiFavoriteLists +
				", taxiPayments=" + taxiPayments +
				", taxiTripDetails=" + taxiTripDetails +
				", taxiBlackLists=" + taxiBlackLists +
				'}';
	}
}