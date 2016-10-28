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
 * TaxiFavoriteList entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_favorite_list", catalog = "ecarride_db_foreign_key")

public class TaxiFavoriteList implements java.io.Serializable {

	// Fields

	private Integer id;
	private TaxiUsers taxiUsers;
	private TaxiDriver taxiDriver;
	private Integer userConfirmed;
	private Integer driverConfirmed;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiFavoriteList() {
	}

	/** full constructor */
	public TaxiFavoriteList(TaxiUsers taxiUsers, TaxiDriver taxiDriver, Integer userConfirmed, Integer driverConfirmed,
			Timestamp createdAt, Timestamp updatedAt, Integer status) {
		this.taxiUsers = taxiUsers;
		this.taxiDriver = taxiDriver;
		this.userConfirmed = userConfirmed;
		this.driverConfirmed = driverConfirmed;
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
	@JoinColumn(name = "driver_id", nullable = false)

	public TaxiDriver getTaxiDriver() {
		return this.taxiDriver;
	}

	public void setTaxiDriver(TaxiDriver taxiDriver) {
		this.taxiDriver = taxiDriver;
	}

	@Column(name = "user_confirmed", nullable = false)

	public Integer getUserConfirmed() {
		return this.userConfirmed;
	}

	public void setUserConfirmed(Integer userConfirmed) {
		this.userConfirmed = userConfirmed;
	}

	@Column(name = "driver_confirmed", nullable = false)

	public Integer getDriverConfirmed() {
		return this.driverConfirmed;
	}

	public void setDriverConfirmed(Integer driverConfirmed) {
		this.driverConfirmed = driverConfirmed;
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