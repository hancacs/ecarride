package dev.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiUserfavoritePlace entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_userfavorite_place", catalog = "ecarride_db_foreign_key")

public class TaxiUserfavoritePlace implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private String favoriteLocation;
	private String latitude;
	private String longitude;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiUserfavoritePlace() {
	}

	/** full constructor */
	public TaxiUserfavoritePlace(Integer userId, String favoriteLocation, String latitude, String longitude,
			Timestamp createdAt, Timestamp updatedAt, Integer status) {
		this.userId = userId;
		this.favoriteLocation = favoriteLocation;
		this.latitude = latitude;
		this.longitude = longitude;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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

	@Column(name = "user_id", nullable = false)

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "favorite_location", nullable = false)

	public String getFavoriteLocation() {
		return this.favoriteLocation;
	}

	public void setFavoriteLocation(String favoriteLocation) {
		this.favoriteLocation = favoriteLocation;
	}

	@Column(name = "latitude", nullable = false)

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Column(name = "longitude", nullable = false)

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Column(name = "created_at", nullable = false, length = 0)

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
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