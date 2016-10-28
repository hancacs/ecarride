package dev.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiUserfavoriteDriver entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_userfavorite_driver", catalog = "ecarride_db_foreign_key")

public class TaxiUserfavoriteDriver implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer baseId;
	private Integer companyId;
	private Integer userId;
	private Integer driverId;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiUserfavoriteDriver() {
	}

	/** full constructor */
	public TaxiUserfavoriteDriver(Integer baseId, Integer companyId, Integer userId, Integer driverId,
			Timestamp createdAt, Timestamp updatedAt, Integer status) {
		this.baseId = baseId;
		this.companyId = companyId;
		this.userId = userId;
		this.driverId = driverId;
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

	@Column(name = "driver_id", nullable = false)

	public Integer getDriverId() {
		return this.driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
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