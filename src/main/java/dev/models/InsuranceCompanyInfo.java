package dev.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * InsuranceCompanyInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "insurance_company_info", catalog = "ecarride_db_foreign_key")

public class InsuranceCompanyInfo implements java.io.Serializable {

	// Fields

	private Integer insuranceCompanyId;
	private String insuranceCompanyName;

	// Constructors

	/** default constructor */
	public InsuranceCompanyInfo() {
	}

	/** full constructor */
	public InsuranceCompanyInfo(Integer insuranceCompanyId, String insuranceCompanyName) {
		this.insuranceCompanyId = insuranceCompanyId;
		this.insuranceCompanyName = insuranceCompanyName;
	}

	// Property accessors
	@Id

	@Column(name = "insurance_company_id", unique = true, nullable = false)

	public Integer getInsuranceCompanyId() {
		return this.insuranceCompanyId;
	}

	public void setInsuranceCompanyId(Integer insuranceCompanyId) {
		this.insuranceCompanyId = insuranceCompanyId;
	}

	@Column(name = "insurance_company_name", nullable = false, length = 50)

	public String getInsuranceCompanyName() {
		return this.insuranceCompanyName;
	}

	public void setInsuranceCompanyName(String insuranceCompanyName) {
		this.insuranceCompanyName = insuranceCompanyName;
	}

}