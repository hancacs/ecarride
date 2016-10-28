package dev.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiPromo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_promo", catalog = "ecarride_db_foreign_key")

public class TaxiPromo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer baseId;
	private Integer companyId;
	private Integer userId;
	private Integer assignedUserId;
	private String promoCode;
	private Timestamp activateFrom;
	private Timestamp activateTill;
	private Integer disPercentage;
	private Float disAmount;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiPromo() {
	}

	/** full constructor */
	public TaxiPromo(Integer baseId, Integer companyId, Integer userId, Integer assignedUserId, String promoCode,
			Timestamp activateFrom, Timestamp activateTill, Integer disPercentage, Float disAmount, Timestamp createdAt,
			Timestamp updatedAt, Integer status) {
		this.baseId = baseId;
		this.companyId = companyId;
		this.userId = userId;
		this.assignedUserId = assignedUserId;
		this.promoCode = promoCode;
		this.activateFrom = activateFrom;
		this.activateTill = activateTill;
		this.disPercentage = disPercentage;
		this.disAmount = disAmount;
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

	@Column(name = "user_id", nullable = false)

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "assigned_user_id", nullable = false)

	public Integer getAssignedUserId() {
		return this.assignedUserId;
	}

	public void setAssignedUserId(Integer assignedUserId) {
		this.assignedUserId = assignedUserId;
	}

	@Column(name = "promo_code", nullable = false)

	public String getPromoCode() {
		return this.promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	@Column(name = "activate_from", nullable = false, length = 0)

	public Timestamp getActivateFrom() {
		return this.activateFrom;
	}

	public void setActivateFrom(Timestamp activateFrom) {
		this.activateFrom = activateFrom;
	}

	@Column(name = "activate_till", nullable = false, length = 0)

	public Timestamp getActivateTill() {
		return this.activateTill;
	}

	public void setActivateTill(Timestamp activateTill) {
		this.activateTill = activateTill;
	}

	@Column(name = "dis_percentage", nullable = false)

	public Integer getDisPercentage() {
		return this.disPercentage;
	}

	public void setDisPercentage(Integer disPercentage) {
		this.disPercentage = disPercentage;
	}

	@Column(name = "dis_amount", nullable = false, precision = 10)

	public Float getDisAmount() {
		return this.disAmount;
	}

	public void setDisAmount(Float disAmount) {
		this.disAmount = disAmount;
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