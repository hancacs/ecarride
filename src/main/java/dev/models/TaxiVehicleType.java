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
 * TaxiVehicleType entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_vehicle_type", catalog = "ecarride_db_foreign_key")

public class TaxiVehicleType implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer capacity;
	private Integer status;
	private Set<TaxiRatebook> taxiRatebooks = new HashSet<TaxiRatebook>(0);
	private Set<TaxiDriverFilter> taxiDriverFilters = new HashSet<TaxiDriverFilter>(0);
	private Set<TaxiVehicle> taxiVehicles = new HashSet<TaxiVehicle>(0);

	// Constructors

	/** default constructor */
	public TaxiVehicleType() {
	}

	/** minimal constructor */
	public TaxiVehicleType(Integer id, String name, Integer capacity, Integer status) {
		this.id = id;
		this.name = name;
		this.capacity = capacity;
		this.status = status;
	}

	/** full constructor */
	public TaxiVehicleType(Integer id, String name, Integer capacity, Integer status, Set<TaxiRatebook> taxiRatebooks,
			Set<TaxiDriverFilter> taxiDriverFilters, Set<TaxiVehicle> taxiVehicles) {
		this.id = id;
		this.name = name;
		this.capacity = capacity;
		this.status = status;
		this.taxiRatebooks = taxiRatebooks;
		this.taxiDriverFilters = taxiDriverFilters;
		this.taxiVehicles = taxiVehicles;
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

	@Column(name = "capacity", nullable = false)

	public Integer getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	@Column(name = "status", nullable = false)

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiVehicleType")

	public Set<TaxiRatebook> getTaxiRatebooks() {
		return this.taxiRatebooks;
	}

	public void setTaxiRatebooks(Set<TaxiRatebook> taxiRatebooks) {
		this.taxiRatebooks = taxiRatebooks;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiVehicleType")

	public Set<TaxiDriverFilter> getTaxiDriverFilters() {
		return this.taxiDriverFilters;
	}

	public void setTaxiDriverFilters(Set<TaxiDriverFilter> taxiDriverFilters) {
		this.taxiDriverFilters = taxiDriverFilters;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiVehicleType")

	public Set<TaxiVehicle> getTaxiVehicles() {
		return this.taxiVehicles;
	}

	public void setTaxiVehicles(Set<TaxiVehicle> taxiVehicles) {
		this.taxiVehicles = taxiVehicles;
	}

}