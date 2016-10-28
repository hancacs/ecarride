package dev.models;

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
 * TaxiPreScheduleGroup entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_pre_schedule_group", catalog = "ecarride_db_foreign_key")

public class TaxiPreScheduleGroup implements java.io.Serializable {

	// Fields

	private Integer id;
	private TaxiBase taxiBase;
	private TaxiCompany taxiCompany;
	private String name;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiPreScheduleGroup() {
	}

	/** full constructor */
	public TaxiPreScheduleGroup(TaxiBase taxiBase, TaxiCompany taxiCompany, String name, Integer status) {
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.name = name;
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

	@Column(name = "status", nullable = false)

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}