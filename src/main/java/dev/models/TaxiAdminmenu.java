package dev.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiAdminmenu entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_adminmenu", catalog = "ecarride_db_foreign_key")

public class TaxiAdminmenu implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer parentId;
	private String name;
	private String url;
	private String angularUrl;
	private String page;
	private String class_;
	private String imgUrl;
	private Timestamp createdAt;
	private Short displayOrder;
	private Short status;

	// Constructors

	/** default constructor */
	public TaxiAdminmenu() {
	}

	/** full constructor */
	public TaxiAdminmenu(Integer parentId, String name, String url, String angularUrl, String page, String class_,
			String imgUrl, Timestamp createdAt, Short displayOrder, Short status) {
		this.parentId = parentId;
		this.name = name;
		this.url = url;
		this.angularUrl = angularUrl;
		this.page = page;
		this.class_ = class_;
		this.imgUrl = imgUrl;
		this.createdAt = createdAt;
		this.displayOrder = displayOrder;
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

	@Column(name = "parent_id", nullable = false)

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Column(name = "name", nullable = false)

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "url", nullable = false)

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "angular_url", nullable = false)

	public String getAngularUrl() {
		return this.angularUrl;
	}

	public void setAngularUrl(String angularUrl) {
		this.angularUrl = angularUrl;
	}

	@Column(name = "page", nullable = false)

	public String getPage() {
		return this.page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	@Column(name = "class", nullable = false, length = 64)

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	@Column(name = "img_url", nullable = false)

	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Column(name = "created_at", nullable = false, length = 0)

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "display_order", nullable = false)

	public Short getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(Short displayOrder) {
		this.displayOrder = displayOrder;
	}

	@Column(name = "status", nullable = false)

	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

}