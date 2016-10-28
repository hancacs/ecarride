package dev.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiRefund entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_refund", catalog = "ecarride_db_foreign_key")

public class TaxiRefund implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer baseId;
	private Integer companyId;
	private Integer tripId;
	private String transactionId;
	private Double amount;
	private String comment;
	private Timestamp createdAt;

	// Constructors

	/** default constructor */
	public TaxiRefund() {
	}

	/** full constructor */
	public TaxiRefund(Integer baseId, Integer companyId, Integer tripId, String transactionId, Double amount,
			String comment, Timestamp createdAt) {
		this.baseId = baseId;
		this.companyId = companyId;
		this.tripId = tripId;
		this.transactionId = transactionId;
		this.amount = amount;
		this.comment = comment;
		this.createdAt = createdAt;
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

	@Column(name = "trip_id", nullable = false)

	public Integer getTripId() {
		return this.tripId;
	}

	public void setTripId(Integer tripId) {
		this.tripId = tripId;
	}

	@Column(name = "transaction_id", nullable = false)

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Column(name = "amount", nullable = false, precision = 10)

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Column(name = "comment", nullable = false)

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

}