package dev.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiOptions entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_options", catalog = "ecarride_db_foreign_key")

public class TaxiOptions implements java.io.Serializable {

	// Fields

	private Integer optionId;
	private String optionName;
	private String optionValue;
	private Timestamp updatedAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiOptions() {
	}

	/** full constructor */
	public TaxiOptions(String optionName, String optionValue, Timestamp updatedAt, Integer status) {
		this.optionName = optionName;
		this.optionValue = optionValue;
		this.updatedAt = updatedAt;
		this.status = status;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "option_id", unique = true, nullable = false)

	public Integer getOptionId() {
		return this.optionId;
	}

	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

	@Column(name = "option_name", nullable = false)

	public String getOptionName() {
		return this.optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	@Column(name = "option_value", nullable = false)

	public String getOptionValue() {
		return this.optionValue;
	}

	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
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