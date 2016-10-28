package dev.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiSms entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_sms", catalog = "ecarride_db_foreign_key")

public class TaxiSms implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer baseId;
	private Integer companyId;
	private String userType;
	private String sms;
	private Integer mobile;
	private String mobileNo;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiSms() {
	}

	/** full constructor */
	public TaxiSms(Integer baseId, Integer companyId, String userType, String sms, Integer mobile, String mobileNo,
			Timestamp createdAt, Timestamp updatedAt, Integer status) {
		this.baseId = baseId;
		this.companyId = companyId;
		this.userType = userType;
		this.sms = sms;
		this.mobile = mobile;
		this.mobileNo = mobileNo;
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

	@Column(name = "user_type", nullable = false)

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Column(name = "sms", nullable = false, length = 65535)

	public String getSms() {
		return this.sms;
	}

	public void setSms(String sms) {
		this.sms = sms;
	}

	@Column(name = "mobile", nullable = false)

	public Integer getMobile() {
		return this.mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	@Column(name = "mobile_no", nullable = false)

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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