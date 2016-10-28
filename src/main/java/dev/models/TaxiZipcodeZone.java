package dev.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiZipcodeZone entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_zipcode_zone", catalog = "ecarride_db_foreign_key")

public class TaxiZipcodeZone implements java.io.Serializable {

	// Fields

	private String zipcode;
	private Integer baseId;
	private Integer companyId;
	private String zone;

	// Constructors

	/** default constructor */
	public TaxiZipcodeZone() {
	}

	/** full constructor */
	public TaxiZipcodeZone(String zipcode, Integer baseId, Integer companyId, String zone) {
		this.zipcode = zipcode;
		this.baseId = baseId;
		this.companyId = companyId;
		this.zone = zone;
	}

	// Property accessors
	@Id

	@Column(name = "zipcode", unique = true, nullable = false, length = 20)

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "base_id", nullable = false)

	public Integer getBaseId() {
		return this.baseId;
	}

	public void setBaseId(Integer baseId) {
		this.baseId = baseId;
	}

	@Column(name = "company_id", nullable = false)

	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	@Column(name = "zone", nullable = false, length = 20)

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}