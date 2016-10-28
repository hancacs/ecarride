package dev.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiTripToll entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_trip_toll", catalog = "ecarride_db_foreign_key")

public class TaxiTripToll implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer baseId;
	private Integer companyId;
	private Integer tollId;
	private String tollCode;
	private String tollName;
	private Float tollPrice;
	private Integer tripId;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiTripToll() {
	}

	/** full constructor */
	public TaxiTripToll(Integer baseId, Integer companyId, Integer tollId, String tollCode, String tollName,
			Float tollPrice, Integer tripId, Timestamp createdAt, Timestamp updatedAt, Integer status) {
		this.baseId = baseId;
		this.companyId = companyId;
		this.tollId = tollId;
		this.tollCode = tollCode;
		this.tollName = tollName;
		this.tollPrice = tollPrice;
		this.tripId = tripId;
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

	@Column(name = "toll_id", nullable = false)

	public Integer getTollId() {
		return this.tollId;
	}

	public void setTollId(Integer tollId) {
		this.tollId = tollId;
	}

	@Column(name = "toll_code", nullable = false)

	public String getTollCode() {
		return this.tollCode;
	}

	public void setTollCode(String tollCode) {
		this.tollCode = tollCode;
	}

	@Column(name = "toll_name", nullable = false)

	public String getTollName() {
		return this.tollName;
	}

	public void setTollName(String tollName) {
		this.tollName = tollName;
	}

	@Column(name = "toll_price", nullable = false, precision = 10)

	public Float getTollPrice() {
		return this.tollPrice;
	}

	public void setTollPrice(Float tollPrice) {
		this.tollPrice = tollPrice;
	}

	@Column(name = "trip_id", nullable = false)

	public Integer getTripId() {
		return this.tripId;
	}

	public void setTripId(Integer tripId) {
		this.tripId = tripId;
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