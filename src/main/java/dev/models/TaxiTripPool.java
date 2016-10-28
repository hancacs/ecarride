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
 * TaxiTripPool entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_trip_pool", catalog = "ecarride_db_foreign_key")

public class TaxiTripPool implements java.io.Serializable {

	// Fields

	private Integer id;
	private TaxiTrip taxiTrip;
	private TaxiBooking taxiBooking;
	private TaxiBase taxiBase;
	private TaxiCompany taxiCompany;
	private String pickupLat;
	private String pickupLng;
	private String pickupLocation;
	private Timestamp pickupTime;
	private Timestamp sentAt;
	private Timestamp createdAt;
	private Timestamp updatedAt;

	// Constructors

	/** default constructor */
	public TaxiTripPool() {
	}

	/** full constructor */
	public TaxiTripPool(TaxiTrip taxiTrip, TaxiBooking taxiBooking, TaxiBase taxiBase, TaxiCompany taxiCompany,
			String pickupLat, String pickupLng, String pickupLocation, Timestamp pickupTime, Timestamp sentAt,
			Timestamp createdAt, Timestamp updatedAt) {
		this.taxiTrip = taxiTrip;
		this.taxiBooking = taxiBooking;
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.pickupLat = pickupLat;
		this.pickupLng = pickupLng;
		this.pickupLocation = pickupLocation;
		this.pickupTime = pickupTime;
		this.sentAt = sentAt;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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
	@JoinColumn(name = "booking_id", nullable = false)

	public TaxiBooking getTaxiBooking() {
		return this.taxiBooking;
	}

	public void setTaxiBooking(TaxiBooking taxiBooking) {
		this.taxiBooking = taxiBooking;
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

	@Column(name = "pickup_lat", nullable = false)

	public String getPickupLat() {
		return this.pickupLat;
	}

	public void setPickupLat(String pickupLat) {
		this.pickupLat = pickupLat;
	}

	@Column(name = "pickup_lng", nullable = false)

	public String getPickupLng() {
		return this.pickupLng;
	}

	public void setPickupLng(String pickupLng) {
		this.pickupLng = pickupLng;
	}

	@Column(name = "pickup_location", nullable = false)

	public String getPickupLocation() {
		return this.pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	@Column(name = "pickup_time", nullable = false, length = 0)

	public Timestamp getPickupTime() {
		return this.pickupTime;
	}

	public void setPickupTime(Timestamp pickupTime) {
		this.pickupTime = pickupTime;
	}

	@Column(name = "sent_at", nullable = false, length = 0)

	public Timestamp getSentAt() {
		return this.sentAt;
	}

	public void setSentAt(Timestamp sentAt) {
		this.sentAt = sentAt;
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

}