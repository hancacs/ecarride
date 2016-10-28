package dev.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiDutyStatus entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_duty_status", catalog = "ecarride_db_foreign_key")

public class TaxiDutyStatus implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiDutyStatus() {
	}

	/** full constructor */
	public TaxiDutyStatus(Integer id, String name, Integer status) {
		this.id = id;
		this.name = name;
		this.status = status;
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

}