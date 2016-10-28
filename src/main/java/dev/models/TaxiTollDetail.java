package dev.models;

import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiTollDetail entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_toll_detail", catalog = "ecarride_db_foreign_key")

public class TaxiTollDetail implements java.io.Serializable {

	// Fields

	private Integer id;
	private String tollCode;
	private String type;
	private Time peakHourStart;
	private Time peakHourEnd;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiTollDetail() {
	}

	/** full constructor */
	public TaxiTollDetail(String tollCode, String type, Time peakHourStart, Time peakHourEnd, Integer status) {
		this.tollCode = tollCode;
		this.type = type;
		this.peakHourStart = peakHourStart;
		this.peakHourEnd = peakHourEnd;
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

	@Column(name = "toll_code", nullable = false)

	public String getTollCode() {
		return this.tollCode;
	}

	public void setTollCode(String tollCode) {
		this.tollCode = tollCode;
	}

	@Column(name = "type", nullable = false)

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "peak_hour_start", nullable = false, length = 0)

	public Time getPeakHourStart() {
		return this.peakHourStart;
	}

	public void setPeakHourStart(Time peakHourStart) {
		this.peakHourStart = peakHourStart;
	}

	@Column(name = "peak_hour_end", nullable = false, length = 0)

	public Time getPeakHourEnd() {
		return this.peakHourEnd;
	}

	public void setPeakHourEnd(Time peakHourEnd) {
		this.peakHourEnd = peakHourEnd;
	}

	@Column(name = "status", nullable = false)

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}