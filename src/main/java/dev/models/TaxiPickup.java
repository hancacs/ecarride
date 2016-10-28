package dev.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiPickup entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_pickup", catalog = "ecarride_db_foreign_key")

public class TaxiPickup implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer baseId;
	private Integer companyId;
	private String pickupLocation;
	private String destinationLocation;
	private String lat;
	private String lng;
	private Integer userId;
	private Integer driverId;
	private Integer wheelchair;
	private String taxiType;
	private Timestamp pickupTime;
	private String pickupStatus;
	private String comments;
	private Integer time;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiPickup() {
	}

	/** full constructor */
	public TaxiPickup(Integer baseId, Integer companyId, String pickupLocation, String destinationLocation, String lat,
			String lng, Integer userId, Integer driverId, Integer wheelchair, String taxiType, Timestamp pickupTime,
			String pickupStatus, String comments, Integer time, Timestamp createdAt, Timestamp updatedAt,
			Integer status) {
		this.baseId = baseId;
		this.companyId = companyId;
		this.pickupLocation = pickupLocation;
		this.destinationLocation = destinationLocation;
		this.lat = lat;
		this.lng = lng;
		this.userId = userId;
		this.driverId = driverId;
		this.wheelchair = wheelchair;
		this.taxiType = taxiType;
		this.pickupTime = pickupTime;
		this.pickupStatus = pickupStatus;
		this.comments = comments;
		this.time = time;
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

	@Column(name = "pickup_location", nullable = false)

	public String getPickupLocation() {
		return this.pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	@Column(name = "destination_location", nullable = false)

	public String getDestinationLocation() {
		return this.destinationLocation;
	}

	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
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

	@Column(name = "wheelchair", nullable = false)

	public Integer getWheelchair() {
		return this.wheelchair;
	}

	public void setWheelchair(Integer wheelchair) {
		this.wheelchair = wheelchair;
	}

	@Column(name = "taxi_type", nullable = false, length = 64)

	public String getTaxiType() {
		return this.taxiType;
	}

	public void setTaxiType(String taxiType) {
		this.taxiType = taxiType;
	}

	@Column(name = "pickup_time", nullable = false, length = 0)

	public Timestamp getPickupTime() {
		return this.pickupTime;
	}

	public void setPickupTime(Timestamp pickupTime) {
		this.pickupTime = pickupTime;
	}

	@Column(name = "pickup_status", nullable = false)

	public String getPickupStatus() {
		return this.pickupStatus;
	}

	public void setPickupStatus(String pickupStatus) {
		this.pickupStatus = pickupStatus;
	}

	@Column(name = "comments", nullable = false, length = 65535)

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Column(name = "time", nullable = false)

	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
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