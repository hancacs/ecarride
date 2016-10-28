package dev.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiPromoDetail entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_promo_detail", catalog = "ecarride_db_foreign_key")

public class TaxiPromoDetail implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer baseId;
	private Integer companyId;
	private Integer userId;
	private Integer tripId;
	private String promoCode;
	private Integer usedCount;
	private Timestamp createdAt;

	// Constructors

	/** default constructor */
	public TaxiPromoDetail() {
	}

	/** full constructor */
	public TaxiPromoDetail(Integer baseId, Integer companyId, Integer userId, Integer tripId, String promoCode,
			Integer usedCount, Timestamp createdAt) {
		this.baseId = baseId;
		this.companyId = companyId;
		this.userId = userId;
		this.tripId = tripId;
		this.promoCode = promoCode;
		this.usedCount = usedCount;
		this.createdAt = createdAt;
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

	@Column(name = "trip_id", nullable = false)

	public Integer getTripId() {
		return this.tripId;
	}

	public void setTripId(Integer tripId) {
		this.tripId = tripId;
	}

	@Column(name = "promo_code", nullable = false)

	public String getPromoCode() {
		return this.promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	@Column(name = "used_count", nullable = false)

	public Integer getUsedCount() {
		return this.usedCount;
	}

	public void setUsedCount(Integer usedCount) {
		this.usedCount = usedCount;
	}

	@Column(name = "created_at", nullable = false, length = 0)

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

}