package dev.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiAdmin entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_admin", catalog = "ecarride_db_foreign_key")

public class TaxiAdmin implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private Integer baseId;
	private Integer companyId;
	private String menuList;
	private Integer permission;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String secondaryPhone;
	private String profilePhoto;
	private Timestamp lastLogin;
	private String ip;
	private String rememberToken;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiAdmin() {
	}

	/** full constructor */
	public TaxiAdmin(String username, String password, Integer baseId, Integer companyId, String menuList,
			Integer permission, String firstName, String lastName, String email, String phone, String secondaryPhone,
			String profilePhoto, Timestamp lastLogin, String ip, String rememberToken, Timestamp createdAt,
			Timestamp updatedAt, Integer status) {
		this.username = username;
		this.password = password;
		this.baseId = baseId;
		this.companyId = companyId;
		this.menuList = menuList;
		this.permission = permission;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.secondaryPhone = secondaryPhone;
		this.profilePhoto = profilePhoto;
		this.lastLogin = lastLogin;
		this.ip = ip;
		this.rememberToken = rememberToken;
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

	@Column(name = "menu_list", nullable = false)

	public String getMenuList() {
		return this.menuList;
	}

	public void setMenuList(String menuList) {
		this.menuList = menuList;
	}

	@Column(name = "permission", nullable = false)

	public Integer getPermission() {
		return this.permission;
	}

	public void setPermission(Integer permission) {
		this.permission = permission;
	}

	@Column(name = "first_name", nullable = false, length = 64)

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false, length = 64)

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	@Column(name = "profile_photo", nullable = false)

	public String getProfilePhoto() {
		return this.profilePhoto;
	}

	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

	@Column(name = "last_login", nullable = false, length = 0)

	public Timestamp getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}

	@Column(name = "ip", nullable = false)

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Column(name = "remember_token", nullable = false)

	public String getRememberToken() {
		return this.rememberToken;
	}

	public void setRememberToken(String rememberToken) {
		this.rememberToken = rememberToken;
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