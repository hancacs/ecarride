package dev.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiVehicleTypeBak entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_vehicle_type_bak", catalog = "ecarride_db_foreign_key")

public class TaxiVehicleTypeBak implements java.io.Serializable {

	// Fields

	private Integer id;
	private String vehicleType;
	private String baseType;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiVehicleTypeBak() {
	}

	/** full constructor */
	public TaxiVehicleTypeBak(String vehicleType, String baseType, Integer status) {
		this.vehicleType = vehicleType;
		this.baseType = baseType;
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

	@Column(name = "vehicle_type", nullable = false)

	public String getVehicleType() {
		return this.vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Column(name = "base_type", nullable = false)

	public String getBaseType() {
		return this.baseType;
	}

	public void setBaseType(String baseType) {
		this.baseType = baseType;
	}

	@Column(name = "status", nullable = false)

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}