package dev.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiCity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_city", catalog = "ecarride_db_foreign_key")

public class TaxiCity implements java.io.Serializable {

	// Fields

	private Integer zipCode;
	private Float latitude;
	private Float longitude;
	private String state;
	private String city;
	private String county;

	// Constructors

	/** default constructor */
	public TaxiCity() {
	}

	/** full constructor */
	public TaxiCity(Integer zipCode, Float latitude, Float longitude, String state, String city, String county) {
		this.zipCode = zipCode;
		this.latitude = latitude;
		this.longitude = longitude;
		this.state = state;
		this.city = city;
		this.county = county;
	}

	// Property accessors
	@Id

	@Column(name = "zip_code", unique = true, nullable = false)

	public Integer getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	@Column(name = "latitude", nullable = false, precision = 10, scale = 8)

	public Float getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	@Column(name = "longitude", nullable = false, precision = 10, scale = 8)

	public Float getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	@Column(name = "state", nullable = false, length = 2)

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "city", nullable = false, length = 128)

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "county", nullable = false, length = 128)

	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

}