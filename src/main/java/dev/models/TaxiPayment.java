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
 * TaxiPayment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_payment", catalog = "ecarride_db_foreign_key")

public class TaxiPayment implements java.io.Serializable {

	// Fields

	private Integer id;
	private TaxiDriver taxiDriver;
	private TaxiBase taxiBase;
	private TaxiCompany taxiCompany;
	private Float payment;
	private String chequeNo;
	private Timestamp payTime;
	private String payStatus;
	private Timestamp createdAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiPayment() {
	}

	/** full constructor */
	public TaxiPayment(TaxiDriver taxiDriver, TaxiBase taxiBase, TaxiCompany taxiCompany, Float payment,
			String chequeNo, Timestamp payTime, String payStatus, Timestamp createdAt, Integer status) {
		this.taxiDriver = taxiDriver;
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.payment = payment;
		this.chequeNo = chequeNo;
		this.payTime = payTime;
		this.payStatus = payStatus;
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
	@JoinColumn(name = "driver_id", nullable = false)

	public TaxiDriver getTaxiDriver() {
		return this.taxiDriver;
	}

	public void setTaxiDriver(TaxiDriver taxiDriver) {
		this.taxiDriver = taxiDriver;
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

	@Column(name = "payment", nullable = false, precision = 10)

	public Float getPayment() {
		return this.payment;
	}

	public void setPayment(Float payment) {
		this.payment = payment;
	}

	@Column(name = "cheque_no", nullable = false, length = 64)

	public String getChequeNo() {
		return this.chequeNo;
	}

	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}

	@Column(name = "pay_time", nullable = false, length = 0)

	public Timestamp getPayTime() {
		return this.payTime;
	}

	public void setPayTime(Timestamp payTime) {
		this.payTime = payTime;
	}

	@Column(name = "pay_status", nullable = false, length = 32)

	public String getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
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