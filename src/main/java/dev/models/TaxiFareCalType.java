package dev.models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TaxiFareCalType entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_fare_cal_type", catalog = "ecarride_db_foreign_key")

public class TaxiFareCalType implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer status;
	private Set<TaxiBase> taxiBases = new HashSet<TaxiBase>(0);

	// Constructors

	/** default constructor */
	public TaxiFareCalType() {
	}

	/** minimal constructor */
	public TaxiFareCalType(Integer id, String name, Integer status) {
		this.id = id;
		this.name = name;
		this.status = status;
	}

	/** full constructor */
	public TaxiFareCalType(Integer id, String name, Integer status, Set<TaxiBase> taxiBases) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.taxiBases = taxiBases;
	}

	// Property accessors
	@Id

	@Column(name = "id", unique = true, nullable = false)

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiFareCalType")

	public Set<TaxiBase> getTaxiBases() {
		return this.taxiBases;
	}

	public void setTaxiBases(Set<TaxiBase> taxiBases) {
		this.taxiBases = taxiBases;
	}

}