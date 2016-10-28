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
 * TaxiFeedback entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_feedback", catalog = "ecarride_db_foreign_key")

public class TaxiFeedback implements java.io.Serializable {

	// Fields

	private Integer id;
	private TaxiUsers taxiUsers;
	private TaxiBase taxiBase;
	private TaxiCompany taxiCompany;
	private String feedback;
	private Integer rating;
	private String reason;
	private String family;
	private Timestamp createdAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiFeedback() {
	}

	/** full constructor */
	public TaxiFeedback(TaxiUsers taxiUsers, TaxiBase taxiBase, TaxiCompany taxiCompany, String feedback,
			Integer rating, String reason, String family, Timestamp createdAt, Integer status) {
		this.taxiUsers = taxiUsers;
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.feedback = feedback;
		this.rating = rating;
		this.reason = reason;
		this.family = family;
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
	@JoinColumn(name = "user_id", nullable = false)

	public TaxiUsers getTaxiUsers() {
		return this.taxiUsers;
	}

	public void setTaxiUsers(TaxiUsers taxiUsers) {
		this.taxiUsers = taxiUsers;
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

	@Column(name = "feedback", nullable = false, length = 65535)

	public String getFeedback() {
		return this.feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Column(name = "rating", nullable = false)

	public Integer getRating() {
		return this.rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Column(name = "reason", nullable = false, length = 65535)

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Column(name = "family", nullable = false)

	public String getFamily() {
		return this.family;
	}

	public void setFamily(String family) {
		this.family = family;
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