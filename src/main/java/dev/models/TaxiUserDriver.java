package dev.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiUserDriver entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_user_driver", catalog = "ecarride_db_foreign_key")

public class TaxiUserDriver implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private Integer driverId;
	private Integer priority;

	// Constructors

	/** default constructor */
	public TaxiUserDriver() {
	}

	/** full constructor */
	public TaxiUserDriver(Integer userId, Integer driverId, Integer priority) {
		this.userId = userId;
		this.driverId = driverId;
		this.priority = priority;
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

	@Column(name = "priority", nullable = false)

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

}