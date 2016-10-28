package dev.models;

import java.sql.Timestamp;
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

/**
 * TaxiUsers entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_users", catalog = "ecarride_db_foreign_key")

public class TaxiUsers implements java.io.Serializable {

	// Fields

	private Integer id;
	private TaxiBase taxiBase;
	private TaxiCompany taxiCompany;
	private String customerId;
	private Integer userType;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String appLanguage;
	private String deviceToken;
	private String deviceId;
	private String mobileOs;
	private String objectId;
	private String email;
	private String phone;
	private String secondaryPhone;
	private String verificationCode;
	private Integer preferredDriverId;
	private String address;
	private String profilePhoto;
	private String userIp;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Timestamp lastLogin;
	private Integer approvableMail;
	private Integer status;
	private Set<TaxiTrip> taxiTrips = new HashSet<TaxiTrip>(0);
	private Set<TaxiBlackList> taxiBlackLists = new HashSet<TaxiBlackList>(0);
	private Set<TaxiPreScheduleHistory> taxiPreScheduleHistories = new HashSet<TaxiPreScheduleHistory>(0);
	private Set<TaxiFavoriteList> taxiFavoriteLists = new HashSet<TaxiFavoriteList>(0);
	private Set<TaxiFeedback> taxiFeedbacks = new HashSet<TaxiFeedback>(0);
	private Set<TaxiNotificationUnread> taxiNotificationUnreads = new HashSet<TaxiNotificationUnread>(0);
	private Set<TaxiDriverRating> taxiDriverRatings = new HashSet<TaxiDriverRating>(0);

	// Constructors

	/** default constructor */
	public TaxiUsers() {
	}

	/** minimal constructor */
	public TaxiUsers(TaxiBase taxiBase, TaxiCompany taxiCompany, String customerId, Integer userType, String username,
			String password, String firstName, String lastName, String appLanguage, String deviceToken, String deviceId,
			String mobileOs, String objectId, String email, String phone, String secondaryPhone,
			String verificationCode, Integer preferredDriverId, String address, String profilePhoto, String userIp,
			Timestamp createdAt, Timestamp updatedAt, Timestamp lastLogin, Integer approvableMail, Integer status) {
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.customerId = customerId;
		this.userType = userType;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.appLanguage = appLanguage;
		this.deviceToken = deviceToken;
		this.deviceId = deviceId;
		this.mobileOs = mobileOs;
		this.objectId = objectId;
		this.email = email;
		this.phone = phone;
		this.secondaryPhone = secondaryPhone;
		this.verificationCode = verificationCode;
		this.preferredDriverId = preferredDriverId;
		this.address = address;
		this.profilePhoto = profilePhoto;
		this.userIp = userIp;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.lastLogin = lastLogin;
		this.approvableMail = approvableMail;
		this.status = status;
	}

	/** full constructor */
	public TaxiUsers(TaxiBase taxiBase, TaxiCompany taxiCompany, String customerId, Integer userType, String username,
			String password, String firstName, String lastName, String appLanguage, String deviceToken, String deviceId,
			String mobileOs, String objectId, String email, String phone, String secondaryPhone,
			String verificationCode, Integer preferredDriverId, String address, String profilePhoto, String userIp,
			Timestamp createdAt, Timestamp updatedAt, Timestamp lastLogin, Integer approvableMail, Integer status,
			Set<TaxiTrip> taxiTrips, Set<TaxiBlackList> taxiBlackLists,
			Set<TaxiPreScheduleHistory> taxiPreScheduleHistories, Set<TaxiFavoriteList> taxiFavoriteLists,
			Set<TaxiFeedback> taxiFeedbacks, Set<TaxiNotificationUnread> taxiNotificationUnreads,
			Set<TaxiDriverRating> taxiDriverRatings) {
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.customerId = customerId;
		this.userType = userType;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.appLanguage = appLanguage;
		this.deviceToken = deviceToken;
		this.deviceId = deviceId;
		this.mobileOs = mobileOs;
		this.objectId = objectId;
		this.email = email;
		this.phone = phone;
		this.secondaryPhone = secondaryPhone;
		this.verificationCode = verificationCode;
		this.preferredDriverId = preferredDriverId;
		this.address = address;
		this.profilePhoto = profilePhoto;
		this.userIp = userIp;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.lastLogin = lastLogin;
		this.approvableMail = approvableMail;
		this.status = status;
		this.taxiTrips = taxiTrips;
		this.taxiBlackLists = taxiBlackLists;
		this.taxiPreScheduleHistories = taxiPreScheduleHistories;
		this.taxiFavoriteLists = taxiFavoriteLists;
		this.taxiFeedbacks = taxiFeedbacks;
		this.taxiNotificationUnreads = taxiNotificationUnreads;
		this.taxiDriverRatings = taxiDriverRatings;
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

	@Column(name = "customer_id", nullable = false)

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@Column(name = "user_type", nullable = false)

	public Integer getUserType() {
		return this.userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
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

	@Column(name = "email", nullable = false)

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@Column(name = "verification_code", nullable = false)

	public String getVerificationCode() {
		return this.verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	@Column(name = "preferred_driver_id", nullable = false)

	public Integer getPreferredDriverId() {
		return this.preferredDriverId;
	}

	public void setPreferredDriverId(Integer preferredDriverId) {
		this.preferredDriverId = preferredDriverId;
	}

	@Column(name = "address", nullable = false)

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "profile_photo", nullable = false)

	public String getProfilePhoto() {
		return this.profilePhoto;
	}

	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

	@Column(name = "user_ip", nullable = false)

	public String getUserIp() {
		return this.userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
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

	@Column(name = "last_login", nullable = false, length = 0)

	public Timestamp getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}

	@Column(name = "approvable_mail", nullable = false)

	public Integer getApprovableMail() {
		return this.approvableMail;
	}

	public void setApprovableMail(Integer approvableMail) {
		this.approvableMail = approvableMail;
	}

	@Column(name = "status", nullable = false)

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiUsers")

	public Set<TaxiTrip> getTaxiTrips() {
		return this.taxiTrips;
	}

	public void setTaxiTrips(Set<TaxiTrip> taxiTrips) {
		this.taxiTrips = taxiTrips;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiUsers")

	public Set<TaxiBlackList> getTaxiBlackLists() {
		return this.taxiBlackLists;
	}

	public void setTaxiBlackLists(Set<TaxiBlackList> taxiBlackLists) {
		this.taxiBlackLists = taxiBlackLists;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiUsers")

	public Set<TaxiPreScheduleHistory> getTaxiPreScheduleHistories() {
		return this.taxiPreScheduleHistories;
	}

	public void setTaxiPreScheduleHistories(Set<TaxiPreScheduleHistory> taxiPreScheduleHistories) {
		this.taxiPreScheduleHistories = taxiPreScheduleHistories;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiUsers")

	public Set<TaxiFavoriteList> getTaxiFavoriteLists() {
		return this.taxiFavoriteLists;
	}

	public void setTaxiFavoriteLists(Set<TaxiFavoriteList> taxiFavoriteLists) {
		this.taxiFavoriteLists = taxiFavoriteLists;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiUsers")

	public Set<TaxiFeedback> getTaxiFeedbacks() {
		return this.taxiFeedbacks;
	}

	public void setTaxiFeedbacks(Set<TaxiFeedback> taxiFeedbacks) {
		this.taxiFeedbacks = taxiFeedbacks;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiUsers")

	public Set<TaxiNotificationUnread> getTaxiNotificationUnreads() {
		return this.taxiNotificationUnreads;
	}

	public void setTaxiNotificationUnreads(Set<TaxiNotificationUnread> taxiNotificationUnreads) {
		this.taxiNotificationUnreads = taxiNotificationUnreads;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiUsers")

	public Set<TaxiDriverRating> getTaxiDriverRatings() {
		return this.taxiDriverRatings;
	}

	public void setTaxiDriverRatings(Set<TaxiDriverRating> taxiDriverRatings) {
		this.taxiDriverRatings = taxiDriverRatings;
	}

}