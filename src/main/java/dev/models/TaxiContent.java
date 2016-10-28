package dev.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * TaxiContent entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_content", catalog = "ecarride_db_foreign_key", uniqueConstraints = @UniqueConstraint(columnNames = "accessKey") )

public class TaxiContent implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer parentId;
	private String title;
	private String content;
	private String pageTitle;
	private String pageKeyword;
	private String pageDescription;
	private String accessKey;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Short status;

	// Constructors

	/** default constructor */
	public TaxiContent() {
	}

	/** full constructor */
	public TaxiContent(Integer parentId, String title, String content, String pageTitle, String pageKeyword,
			String pageDescription, String accessKey, Timestamp createdAt, Timestamp updatedAt, Short status) {
		this.parentId = parentId;
		this.title = title;
		this.content = content;
		this.pageTitle = pageTitle;
		this.pageKeyword = pageKeyword;
		this.pageDescription = pageDescription;
		this.accessKey = accessKey;
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

	@Column(name = "parent_id", nullable = false)

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Column(name = "title", nullable = false)

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "content", nullable = false)

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "page_title", nullable = false)

	public String getPageTitle() {
		return this.pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	@Column(name = "page_keyword", nullable = false, length = 65535)

	public String getPageKeyword() {
		return this.pageKeyword;
	}

	public void setPageKeyword(String pageKeyword) {
		this.pageKeyword = pageKeyword;
	}

	@Column(name = "page_description", nullable = false, length = 65535)

	public String getPageDescription() {
		return this.pageDescription;
	}

	public void setPageDescription(String pageDescription) {
		this.pageDescription = pageDescription;
	}

	@Column(name = "accessKey", unique = true, nullable = false)

	public String getAccessKey() {
		return this.accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
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

	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

}