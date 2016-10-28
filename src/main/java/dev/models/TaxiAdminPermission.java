package dev.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiAdminPermission entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_admin_permission", catalog = "ecarride_db_foreign_key")

public class TaxiAdminPermission implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer level;
	private String levelName;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiAdminPermission() {
	}

	/** full constructor */
	public TaxiAdminPermission(Integer id, Integer level, String levelName, Integer status) {
		this.id = id;
		this.level = level;
		this.levelName = levelName;
		this.status = status;
	}

	// Property accessors
	@Id

	@Column(name = "id", unique = true, nullable = false)

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "level", nullable = false)

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	@Column(name = "level_name", nullable = false)

	public String getLevelName() {
		return this.levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	@Column(name = "status", nullable = false)

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}