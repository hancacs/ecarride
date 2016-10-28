package dev.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiLocationUpdate entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_location_update", catalog = "ecarride_db_foreign_key")

public class TaxiLocationUpdate implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer baseId;
	private Integer companyId;
	private Integer driverId;
	private String lat;
	private String lng;
	private Float direction;
	private Integer dutyStatus;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiLocationUpdate() {
	}

	/** full constructor */
	public TaxiLocationUpdate(Integer baseId, Integer companyId, Integer driverId, String lat, String lng,
			Float direction, Integer dutyStatus, Timestamp createdAt, Timestamp updatedAt, Integer status) {
		this.baseId = baseId;
		this.companyId = companyId;
		this.driverId = driverId;
		this.lat = lat;
		this.lng = lng;
		this.direction = direction;
		this.dutyStatus = dutyStatus;
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

	@Column(name = "driver_id", nullable = false)

	public Integer getDriverId() {
		return this.driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	@Column(name = "lat", nullable = false)

	public String getLat() {
		return this.lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	@Column(name = "lng", nullable = false)

	public String getLng() {
		return this.lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	@Column(name = "direction", nullable = false, precision = 10, scale = 6)

	public Float getDirection() {
		return this.direction;
	}

	public void setDirection(Float direction) {
		this.direction = direction;
	}

	@Column(name = "duty_status", nullable = false)

	public Integer getDutyStatus() {
		return this.dutyStatus;
	}

	public void setDutyStatus(Integer dutyStatus) {
		this.dutyStatus = dutyStatus;
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