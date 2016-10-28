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
import javax.persistence.UniqueConstraint;

/**
 * TaxiDriverRating entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_driver_rating", catalog = "ecarride_db_foreign_key", uniqueConstraints = @UniqueConstraint(columnNames = "driver_id") )

public class TaxiDriverRating implements java.io.Serializable {

	// Fields

	private Integer id;
	private TaxiUsers taxiUsers;
	private TaxiTrip taxiTrip;
	private TaxiBase taxiBase;
	private TaxiCompany taxiCompany;
	private Integer driverId;
	private Integer rating;
	private String comment;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiDriverRating() {
	}

	/** full constructor */
	public TaxiDriverRating(TaxiUsers taxiUsers, TaxiTrip taxiTrip, TaxiBase taxiBase, TaxiCompany taxiCompany,
			Integer driverId, Integer rating, String comment, Timestamp createdAt, Timestamp updatedAt,
			Integer status) {
		this.taxiUsers = taxiUsers;
		this.taxiTrip = taxiTrip;
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.driverId = driverId;
		this.rating = rating;
		this.comment = comment;
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
	@JoinColumn(name = "user_id", nullable = false)

	public TaxiUsers getTaxiUsers() {
		return this.taxiUsers;
	}

	public void setTaxiUsers(TaxiUsers taxiUsers) {
		this.taxiUsers = taxiUsers;
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

	@Column(name = "rating", nullable = false)

	public Integer getRating() {
		return this.rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Column(name = "comment", nullable = false, length = 65535)

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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