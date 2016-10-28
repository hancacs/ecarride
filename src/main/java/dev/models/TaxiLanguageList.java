package dev.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiLanguageList entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_language_list", catalog = "ecarride_db_foreign_key")

public class TaxiLanguageList implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiLanguageList() {
	}

	/** full constructor */
	public TaxiLanguageList(String name, Integer status) {
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