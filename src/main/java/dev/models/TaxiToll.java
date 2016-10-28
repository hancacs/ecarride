package dev.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiToll entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_toll", catalog = "ecarride_db_foreign_key")

public class TaxiToll implements java.io.Serializable {

	// Fields

	private Integer id;
	private String tollName;
	private String tollCode;
	private Float ezpassOffpeak;
	private Float ezpassPeak;
	private Float cash;
	private String borough;
	private String zipcode;
	private String lat;
	private String lng;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiToll() {
	}

	/** full constructor */
	public TaxiToll(String tollName, String tollCode, Float ezpassOffpeak, Float ezpassPeak, Float cash, String borough,
			String zipcode, String lat, String lng, Integer status) {
		this.tollName = tollName;
		this.tollCode = tollCode;
		this.ezpassOffpeak = ezpassOffpeak;
		this.ezpassPeak = ezpassPeak;
		this.cash = cash;
		this.borough = borough;
		this.zipcode = zipcode;
		this.lat = lat;
		this.lng = lng;
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

	@Column(name = "toll_name", nullable = false)

	public String getTollName() {
		return this.tollName;
	}

	public void setTollName(String tollName) {
		this.tollName = tollName;
	}

	@Column(name = "toll_code", nullable = false)

	public String getTollCode() {
		return this.tollCode;
	}

	public void setTollCode(String tollCode) {
		this.tollCode = tollCode;
	}

	@Column(name = "ezpass_offpeak", nullable = false, precision = 10)

	public Float getEzpassOffpeak() {
		return this.ezpassOffpeak;
	}

	public void setEzpassOffpeak(Float ezpassOffpeak) {
		this.ezpassOffpeak = ezpassOffpeak;
	}

	@Column(name = "ezpass_peak", nullable = false, precision = 10)

	public Float getEzpassPeak() {
		return this.ezpassPeak;
	}

	public void setEzpassPeak(Float ezpassPeak) {
		this.ezpassPeak = ezpassPeak;
	}

	@Column(name = "cash", nullable = false, precision = 10)

	public Float getCash() {
		return this.cash;
	}

	public void setCash(Float cash) {
		this.cash = cash;
	}

	@Column(name = "borough", nullable = false)

	public String getBorough() {
		return this.borough;
	}

	public void setBorough(String borough) {
		this.borough = borough;
	}

	@Column(name = "zipcode", nullable = false)

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "lat", nullable = false)

	public String getLat() {
		return this.lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	@Column(name = "lng", nullable = false)

	public String getLng() {
		return this.lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	@Column(name = "status", nullable = false)

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}