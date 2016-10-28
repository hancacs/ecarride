package dev.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaxiUserCard entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_user_card", catalog = "ecarride_db_foreign_key")

public class TaxiUserCard implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private String firstName;
	private String lastName;
	private String cardNo;
	private String cardType;
	private String cardCvv;
	private String cardValidMon;
	private String cardValidYear;
	private Integer mydefault;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;

	// Constructors

	/** default constructor */
	public TaxiUserCard() {
	}

	/** full constructor */
	public TaxiUserCard(Integer userId, String firstName, String lastName, String cardNo, String cardType,
			String cardCvv, String cardValidMon, String cardValidYear, Integer mydefault, Timestamp createdAt,
			Timestamp updatedAt, Integer status) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cardNo = cardNo;
		this.cardType = cardType;
		this.cardCvv = cardCvv;
		this.cardValidMon = cardValidMon;
		this.cardValidYear = cardValidYear;
		this.mydefault = mydefault;
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

	@Column(name = "first_name", nullable = false)

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false)

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "card_no", nullable = false)

	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	@Column(name = "card_type", nullable = false, length = 64)

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	@Column(name = "card_cvv", nullable = false)

	public String getCardCvv() {
		return this.cardCvv;
	}

	public void setCardCvv(String cardCvv) {
		this.cardCvv = cardCvv;
	}

	@Column(name = "card_valid_mon", nullable = false, length = 32)

	public String getCardValidMon() {
		return this.cardValidMon;
	}

	public void setCardValidMon(String cardValidMon) {
		this.cardValidMon = cardValidMon;
	}

	@Column(name = "card_valid_year", nullable = false, length = 32)

	public String getCardValidYear() {
		return this.cardValidYear;
	}

	public void setCardValidYear(String cardValidYear) {
		this.cardValidYear = cardValidYear;
	}

	@Column(name = "mydefault", nullable = false)

	public Integer getMydefault() {
		return this.mydefault;
	}

	public void setMydefault(Integer mydefault) {
		this.mydefault = mydefault;
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