package dev.models;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TaxiEmployeeTracking entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_employee_tracking", catalog = "ecarride_db_foreign_key")

public class TaxiEmployeeTracking implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer employeeId;
	private Date workDate;
	private String checkHistory;
	private Double workingHours;
	private String workSummary;
	private String routePhoto;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiEmployeeTracking() {
	}

	/** full constructor */
	public TaxiEmployeeTracking(Integer employeeId, Date workDate, String checkHistory, Double workingHours,
			String workSummary, String routePhoto, Timestamp createdAt, Timestamp updatedAt, Integer status) {
		this.employeeId = employeeId;
		this.workDate = workDate;
		this.checkHistory = checkHistory;
		this.workingHours = workingHours;
		this.workSummary = workSummary;
		this.routePhoto = routePhoto;
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

	@Column(name = "employee_id", nullable = false)

	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "work_date", nullable = false, length = 0)

	public Date getWorkDate() {
		return this.workDate;
	}

	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}

	@Column(name = "check_history", nullable = false, length = 65535)

	public String getCheckHistory() {
		return this.checkHistory;
	}

	public void setCheckHistory(String checkHistory) {
		this.checkHistory = checkHistory;
	}

	@Column(name = "working_hours", nullable = false, precision = 10)

	public Double getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(Double workingHours) {
		this.workingHours = workingHours;
	}

	@Column(name = "work_summary", nullable = false)

	public String getWorkSummary() {
		return this.workSummary;
	}

	public void setWorkSummary(String workSummary) {
		this.workSummary = workSummary;
	}

	@Column(name = "route_photo", nullable = false)

	public String getRoutePhoto() {
		return this.routePhoto;
	}

	public void setRoutePhoto(String routePhoto) {
		this.routePhoto = routePhoto;
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