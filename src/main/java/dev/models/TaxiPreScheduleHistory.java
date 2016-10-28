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
 * TaxiPreScheduleHistory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_pre_schedule_history", catalog = "ecarride_db_foreign_key")

public class TaxiPreScheduleHistory implements java.io.Serializable {

	// Fields

	private Integer id;
	private TaxiUsers taxiUsers;
	private TaxiTrip taxiTrip;
	private TaxiDriver taxiDriver;
	private TaxiBooking taxiBooking;
	private TaxiBase taxiBase;
	private TaxiCompany taxiCompany;
	private Integer updateTimes;
	private Integer countTimes;
	private Timestamp sentTime;
	private Timestamp createdAt;
	private Timestamp updatedAt;

	// Constructors

	/** default constructor */
	public TaxiPreScheduleHistory() {
	}

	/** full constructor */
	public TaxiPreScheduleHistory(TaxiUsers taxiUsers, TaxiTrip taxiTrip, TaxiDriver taxiDriver,
			TaxiBooking taxiBooking, TaxiBase taxiBase, TaxiCompany taxiCompany, Integer updateTimes,
			Integer countTimes, Timestamp sentTime, Timestamp createdAt, Timestamp updatedAt) {
		this.taxiUsers = taxiUsers;
		this.taxiTrip = taxiTrip;
		this.taxiDriver = taxiDriver;
		this.taxiBooking = taxiBooking;
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.updateTimes = updateTimes;
		this.countTimes = countTimes;
		this.sentTime = sentTime;
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
	@JoinColumn(name = "assigned_driver_id", nullable = false)

	public TaxiDriver getTaxiDriver() {
		return this.taxiDriver;
	}

	public void setTaxiDriver(TaxiDriver taxiDriver) {
		this.taxiDriver = taxiDriver;
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

	@Column(name = "update_times", nullable = false)

	public Integer getUpdateTimes() {
		return this.updateTimes;
	}

	public void setUpdateTimes(Integer updateTimes) {
		this.updateTimes = updateTimes;
	}

	@Column(name = "count_times", nullable = false)

	public Integer getCountTimes() {
		return this.countTimes;
	}

	public void setCountTimes(Integer countTimes) {
		this.countTimes = countTimes;
	}

	@Column(name = "sent_time", nullable = false, length = 0)

	public Timestamp getSentTime() {
		return this.sentTime;
	}

	public void setSentTime(Timestamp sentTime) {
		this.sentTime = sentTime;
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