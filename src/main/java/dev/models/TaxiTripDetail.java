package dev.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TaxiTripDetail entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_trip_detail", catalog = "ecarride_db_foreign_key")

public class TaxiTripDetail implements java.io.Serializable {

	// Fields

	private Integer id;
	private TaxiTrip taxiTrip;
	private TaxiDriver taxiDriver;
	private TaxiBase taxiBase;
	private TaxiCompany taxiCompany;
	private Integer tripType;
	private String distance;
	private Timestamp createdAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiTripDetail() {
	}

	/** full constructor */
	public TaxiTripDetail(TaxiTrip taxiTrip, TaxiDriver taxiDriver, TaxiBase taxiBase, TaxiCompany taxiCompany,
			Integer tripType, String distance, Timestamp createdAt, Integer status) {
		this.taxiTrip = taxiTrip;
		this.taxiDriver = taxiDriver;
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.tripType = tripType;
		this.distance = distance;
		this.createdAt = createdAt;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trip_id", nullable = false)

	public TaxiTrip getTaxiTrip() {
		return this.taxiTrip;
	}

	public void setTaxiTrip(TaxiTrip taxiTrip) {
		this.taxiTrip = taxiTrip;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "driver_id", nullable = false)

	public TaxiDriver getTaxiDriver() {
		return this.taxiDriver;
	}

	public void setTaxiDriver(TaxiDriver taxiDriver) {
		this.taxiDriver = taxiDriver;
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

	@Column(name = "trip_type", nullable = false)

	public Integer getTripType() {
		return this.tripType;
	}

	public void setTripType(Integer tripType) {
		this.tripType = tripType;
	}

	@Column(name = "distance", nullable = false)

	public String getDistance() {
		return this.distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	@Column(name = "created_at", nullable = false, length = 0)

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "status", nullable = false)

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}