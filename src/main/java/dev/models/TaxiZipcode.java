package dev.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiZipcode entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_zipcode", catalog = "ecarride_db_foreign_key")

public class TaxiZipcode implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer adminId;
	private String zipcode;
	private Integer vehicleTypeId;
	private String vehicleType;
	private Float basefare;
	private Float milefare;
	private Float minfare;
	private Float minimumfare;
	private Float cancelfare;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiZipcode() {
	}

	/** full constructor */
	public TaxiZipcode(Integer adminId, String zipcode, Integer vehicleTypeId, String vehicleType, Float basefare,
			Float milefare, Float minfare, Float minimumfare, Float cancelfare, Timestamp createdAt,
			Timestamp updatedAt, Integer status) {
		this.adminId = adminId;
		this.zipcode = zipcode;
		this.vehicleTypeId = vehicleTypeId;
		this.vehicleType = vehicleType;
		this.basefare = basefare;
		this.milefare = milefare;
		this.minfare = minfare;
		this.minimumfare = minimumfare;
		this.cancelfare = cancelfare;
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

	@Column(name = "admin_id", nullable = false)

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	@Column(name = "zipcode", nullable = false)

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "vehicle_type_id", nullable = false)

	public Integer getVehicleTypeId() {
		return this.vehicleTypeId;
	}

	public void setVehicleTypeId(Integer vehicleTypeId) {
		this.vehicleTypeId = vehicleTypeId;
	}

	@Column(name = "vehicle_type", nullable = false)

	public String getVehicleType() {
		return this.vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Column(name = "basefare", nullable = false, precision = 10)

	public Float getBasefare() {
		return this.basefare;
	}

	public void setBasefare(Float basefare) {
		this.basefare = basefare;
	}

	@Column(name = "milefare", nullable = false, precision = 10)

	public Float getMilefare() {
		return this.milefare;
	}

	public void setMilefare(Float milefare) {
		this.milefare = milefare;
	}

	@Column(name = "minfare", nullable = false, precision = 10)

	public Float getMinfare() {
		return this.minfare;
	}

	public void setMinfare(Float minfare) {
		this.minfare = minfare;
	}

	@Column(name = "minimumfare", nullable = false, precision = 10)

	public Float getMinimumfare() {
		return this.minimumfare;
	}

	public void setMinimumfare(Float minimumfare) {
		this.minimumfare = minimumfare;
	}

	@Column(name = "cancelfare", nullable = false, precision = 10)

	public Float getCancelfare() {
		return this.cancelfare;
	}

	public void setCancelfare(Float cancelfare) {
		this.cancelfare = cancelfare;
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