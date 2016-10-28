package dev.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiLanguage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_language", catalog = "ecarride_db_foreign_key")

public class TaxiLanguage implements java.io.Serializable {

	// Fields

	private Integer id;
	private String languageName;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiLanguage() {
	}

	/** full constructor */
	public TaxiLanguage(String languageName, Integer status) {
		this.languageName = languageName;
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

	@Column(name = "language_name", nullable = false)

	public String getLanguageName() {
		return this.languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	@Column(name = "status", nullable = false)

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}