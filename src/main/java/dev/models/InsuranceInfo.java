package dev.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * InsuranceInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "insurance_info", catalog = "ecarride_db_foreign_key", uniqueConstraints = @UniqueConstraint(columnNames = {
		"firstname", "lastname", "starting_address", "starting_borough", "ending_address", "ending_borough" }) )

public class InsuranceInfo implements java.io.Serializable {

	// Fields

	private Long infoId;
	private String firstname;
	private String lastname;
	private Integer insuranceCompanyId;
	private String startingAddress;
	private String startingBorough;
	private String endingAddress;
	private String endingBorough;
	private String status;
	private Float price;

	// Constructors

	/** default constructor */
	public InsuranceInfo() {
	}

	/** minimal constructor */
	public InsuranceInfo(String firstname, String lastname, Integer insuranceCompanyId, String startingAddress,
			String startingBorough, String endingAddress, String endingBorough, Float price) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.insuranceCompanyId = insuranceCompanyId;
		this.startingAddress = startingAddress;
		this.startingBorough = startingBorough;
		this.endingAddress = endingAddress;
		this.endingBorough = endingBorough;
		this.price = price;
	}

	/** full constructor */
	public InsuranceInfo(String firstname, String lastname, Integer insuranceCompanyId, String startingAddress,
			String startingBorough, String endingAddress, String endingBorough, String status, Float price) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.insuranceCompanyId = insuranceCompanyId;
		this.startingAddress = startingAddress;
		this.startingBorough = startingBorough;
		this.endingAddress = endingAddress;
		this.endingBorough = endingBorough;
		this.status = status;
		this.price = price;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "info_id", unique = true, nullable = false)

	public Long getInfoId() {
		return this.infoId;
	}

	public void setInfoId(Long infoId) {
		this.infoId = infoId;
	}

	@Column(name = "firstname", nullable = false, length = 50)

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "lastname", nullable = false, length = 50)

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "insurance_company_id", nullable = false)

	public Integer getInsuranceCompanyId() {
		return this.insuranceCompanyId;
	}

	public void setInsuranceCompanyId(Integer insuranceCompanyId) {
		this.insuranceCompanyId = insuranceCompanyId;
	}

	@Column(name = "starting_address", nullable = false, length = 100)

	public String getStartingAddress() {
		return this.startingAddress;
	}

	public void setStartingAddress(String startingAddress) {
		this.startingAddress = startingAddress;
	}

	@Column(name = "starting_borough", nullable = false, length = 100)

	public String getStartingBorough() {
		return this.startingBorough;
	}

	public void setStartingBorough(String startingBorough) {
		this.startingBorough = startingBorough;
	}

	@Column(name = "ending_address", nullable = false, length = 100)

	public String getEndingAddress() {
		return this.endingAddress;
	}

	public void setEndingAddress(String endingAddress) {
		this.endingAddress = endingAddress;
	}

	@Column(name = "ending_borough", nullable = false, length = 100)

	public String getEndingBorough() {
		return this.endingBorough;
	}

	public void setEndingBorough(String endingBorough) {
		this.endingBorough = endingBorough;
	}

	@Column(name = "status", length = 100)

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "price", nullable = false, precision = 10)

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

}