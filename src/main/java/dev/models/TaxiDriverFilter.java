package dev.models;

import java.sql.Time;
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
import javax.persistence.UniqueConstraint;

/**
 * TaxiDriverFilter entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_driver_filter", catalog = "ecarride_db_foreign_key", uniqueConstraints = @UniqueConstraint(columnNames = "driver_id") )

public class TaxiDriverFilter implements java.io.Serializable {

	// Fields

	private Integer id;
	private TaxiVehicleType taxiVehicleType;
	private TaxiBase taxiBase;
	private TaxiCompany taxiCompany;
	private Integer driverId;
	private String lat;
	private String lng;
	private Float direction;
	private Integer gender;
	private String language;
	private Time reservedStart;
	private Time reservedEnd;
	private String reservedZipcode;
	private Integer drivingExperience;
	private String nationality;
	private Time worktimeStart;
	private Time worktimeEnd;
	private String vehicleBrand;
	private Integer dutyStatus;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiDriverFilter() {
	}

	/** full constructor */
	public TaxiDriverFilter(TaxiVehicleType taxiVehicleType, TaxiBase taxiBase, TaxiCompany taxiCompany,
			Integer driverId, String lat, String lng, Float direction, Integer gender, String language,
			Time reservedStart, Time reservedEnd, String reservedZipcode, Integer drivingExperience, String nationality,
			Time worktimeStart, Time worktimeEnd, String vehicleBrand, Integer dutyStatus, Timestamp createdAt,
			Timestamp updatedAt, Integer status) {
		this.taxiVehicleType = taxiVehicleType;
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.driverId = driverId;
		this.lat = lat;
		this.lng = lng;
		this.direction = direction;
		this.gender = gender;
		this.language = language;
		this.reservedStart = reservedStart;
		this.reservedEnd = reservedEnd;
		this.reservedZipcode = reservedZipcode;
		this.drivingExperience = drivingExperience;
		this.nationality = nationality;
		this.worktimeStart = worktimeStart;
		this.worktimeEnd = worktimeEnd;
		this.vehicleBrand = vehicleBrand;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vehicle_type_id", nullable = false)

	public TaxiVehicleType getTaxiVehicleType() {
		return this.taxiVehicleType;
	}

	public void setTaxiVehicleType(TaxiVehicleType taxiVehicleType) {
		this.taxiVehicleType = taxiVehicleType;
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

	@Column(name = "driver_id", unique = true, nullable = false)

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

	@Column(name = "gender", nullable = false)

	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	@Column(name = "language", nullable = false)

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Column(name = "reserved_start", nullable = false, length = 0)

	public Time getReservedStart() {
		return this.reservedStart;
	}

	public void setReservedStart(Time reservedStart) {
		this.reservedStart = reservedStart;
	}

	@Column(name = "reserved_end", nullable = false, length = 0)

	public Time getReservedEnd() {
		return this.reservedEnd;
	}

	public void setReservedEnd(Time reservedEnd) {
		this.reservedEnd = reservedEnd;
	}

	@Column(name = "reserved_zipcode", nullable = false)

	public String getReservedZipcode() {
		return this.reservedZipcode;
	}

	public void setReservedZipcode(String reservedZipcode) {
		this.reservedZipcode = reservedZipcode;
	}

	@Column(name = "driving_experience", nullable = false)

	public Integer getDrivingExperience() {
		return this.drivingExperience;
	}

	public void setDrivingExperience(Integer drivingExperience) {
		this.drivingExperience = drivingExperience;
	}

	@Column(name = "nationality", nullable = false)

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Column(name = "worktime_start", nullable = false, length = 0)

	public Time getWorktimeStart() {
		return this.worktimeStart;
	}

	public void setWorktimeStart(Time worktimeStart) {
		this.worktimeStart = worktimeStart;
	}

	@Column(name = "worktime_end", nullable = false, length = 0)

	public Time getWorktimeEnd() {
		return this.worktimeEnd;
	}

	public void setWorktimeEnd(Time worktimeEnd) {
		this.worktimeEnd = worktimeEnd;
	}

	@Column(name = "vehicle_brand", nullable = false)

	public String getVehicleBrand() {
		return this.vehicleBrand;
	}

	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
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