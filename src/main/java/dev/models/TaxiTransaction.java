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
 * TaxiTransaction entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_transaction", catalog = "ecarride_db_foreign_key")

public class TaxiTransaction implements java.io.Serializable {

	// Fields

	private Integer id;
	private TaxiTrip taxiTrip;
	private TaxiBase taxiBase;
	private TaxiCompany taxiCompany;
	private String transactionId;
	private String transactionStatus;
	private Float transactionAmount;
	private String transactionCardno;
	private Timestamp createdAt;
	private Timestamp updatedAt;

	// Constructors

	/** default constructor */
	public TaxiTransaction() {
	}

	/** full constructor */
	public TaxiTransaction(TaxiTrip taxiTrip, TaxiBase taxiBase, TaxiCompany taxiCompany, String transactionId,
			String transactionStatus, Float transactionAmount, String transactionCardno, Timestamp createdAt,
			Timestamp updatedAt) {
		this.taxiTrip = taxiTrip;
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.transactionId = transactionId;
		this.transactionStatus = transactionStatus;
		this.transactionAmount = transactionAmount;
		this.transactionCardno = transactionCardno;
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

	@Column(name = "transaction_id", nullable = false, length = 64)

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Column(name = "transaction_status", nullable = false, length = 64)

	public String getTransactionStatus() {
		return this.transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	@Column(name = "transaction_amount", nullable = false, precision = 10)

	public Float getTransactionAmount() {
		return this.transactionAmount;
	}

	public void setTransactionAmount(Float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	@Column(name = "transaction_cardno", nullable = false)

	public String getTransactionCardno() {
		return this.transactionCardno;
	}

	public void setTransactionCardno(String transactionCardno) {
		this.transactionCardno = transactionCardno;
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