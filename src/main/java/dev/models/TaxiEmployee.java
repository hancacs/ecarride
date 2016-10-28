package dev.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiEmployee entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_employee", catalog = "ecarride_db_foreign_key")

public class TaxiEmployee implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer baseId;
	private Integer companyId;
	private Integer adminId;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private Integer dutyStatus;
	private String currentLat;
	private String currentLng;
	private String deviceId;
	private String mobileOs;
	private String objectId;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiEmployee() {
	}

	/** full constructor */
	public TaxiEmployee(Integer baseId, Integer companyId, Integer adminId, String username, String password,
			String firstName, String lastName, String phone, String email, Integer dutyStatus, String currentLat,
			String currentLng, String deviceId, String mobileOs, String objectId, Timestamp createdAt,
			Timestamp updatedAt, Integer status) {
		this.baseId = baseId;
		this.companyId = companyId;
		this.adminId = adminId;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.dutyStatus = dutyStatus;
		this.currentLat = currentLat;
		this.currentLng = currentLng;
		this.deviceId = deviceId;
		this.mobileOs = mobileOs;
		this.objectId = objectId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
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

	@Column(name = "base_id", nullable = false)

	public Integer getBaseId() {
		return this.baseId;
	}

	public void setBaseId(Integer baseId) {
		this.baseId = baseId;
	}

	@Column(name = "company_id", nullable = false)

	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	@Column(name = "admin_id", nullable = false)

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
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

	@Column(name = "phone", nullable = false)

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "email", nullable = false)

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "duty_status", nullable = false)

	public Integer getDutyStatus() {
		return this.dutyStatus;
	}

	public void setDutyStatus(Integer dutyStatus) {
		this.dutyStatus = dutyStatus;
	}

	@Column(name = "current_lat", nullable = false)

	public String getCurrentLat() {
		return this.currentLat;
	}

	public void setCurrentLat(String currentLat) {
		this.currentLat = currentLat;
	}

	@Column(name = "current_lng", nullable = false)

	public String getCurrentLng() {
		return this.currentLng;
	}

	public void setCurrentLng(String currentLng) {
		this.currentLng = currentLng;
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

	@Column(name = "status", nullable = false)

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}