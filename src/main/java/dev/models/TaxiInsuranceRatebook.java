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
 * TaxiInsuranceRatebook entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_insurance_ratebook", catalog = "ecarride_db_foreign_key")

public class TaxiInsuranceRatebook implements java.io.Serializable {

	// Fields

	private Integer id;
	private TaxiBase taxiBase;
	private TaxiCompany taxiCompany;
	private String name;
	private Float basefare;
	private Float milefare;
	private Float minfare;
	private Float minimumfare;
	private Float cancelfare;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiInsuranceRatebook() {
	}

	/** full constructor */
	public TaxiInsuranceRatebook(TaxiBase taxiBase, TaxiCompany taxiCompany, String name, Float basefare,
			Float milefare, Float minfare, Float minimumfare, Float cancelfare, Timestamp createdAt,
			Timestamp updatedAt, Integer status) {
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.name = name;
		this.basefare = basefare;
		this.milefare = milefare;
		this.minfare = minfare;
		this.minimumfare = minimumfare;
		this.cancelfare = cancelfare;
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

	@Column(name = "name", nullable = false)

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "basefare", nullable = false, precision = 10)

	public Float getBasefare() {
		return this.basefare;
	}

	public void setBasefare(Float basefare) {
		this.basefare = basefare;
	}

	@Column(name = "milefare", nullable = false, precision = 10)

	public Float getMilefare() {
		return this.milefare;
	}

	public void setMilefare(Float milefare) {
		this.milefare = milefare;
	}

	@Column(name = "minfare", nullable = false, precision = 10)

	public Float getMinfare() {
		return this.minfare;
	}

	public void setMinfare(Float minfare) {
		this.minfare = minfare;
	}

	@Column(name = "minimumfare", nullable = false, precision = 10)

	public Float getMinimumfare() {
		return this.minimumfare;
	}

	public void setMinimumfare(Float minimumfare) {
		this.minimumfare = minimumfare;
	}

	@Column(name = "cancelfare", nullable = false, precision = 10)

	public Float getCancelfare() {
		return this.cancelfare;
	}

	public void setCancelfare(Float cancelfare) {
		this.cancelfare = cancelfare;
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