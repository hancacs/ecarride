package dev.models;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TaxiCompany entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_company", catalog = "ecarride_db_foreign_key")

public class TaxiCompany implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String phone;
	private String email;
	private String addressOne;
	private String addressTwo;
	private Time worktimeStart;
	private Time worktimeEnd;
	private String city;
	private String state;
	private String zipcode;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;
	private Set<TaxiTransaction> taxiTransactions = new HashSet<TaxiTransaction>(0);
	private Set<TaxiBooking> taxiBookings = new HashSet<TaxiBooking>(0);
	private Set<TaxiDriverRating> taxiDriverRatings = new HashSet<TaxiDriverRating>(0);
	private Set<TaxiPreScheduleHistory> taxiPreScheduleHistories = new HashSet<TaxiPreScheduleHistory>(0);
	private Set<TaxiDriver> taxiDrivers = new HashSet<TaxiDriver>(0);
	private Set<TaxiInsuranceRatebook> taxiInsuranceRatebooks = new HashSet<TaxiInsuranceRatebook>(0);
	private Set<TaxiTripDetail> taxiTripDetails = new HashSet<TaxiTripDetail>(0);
	private Set<TaxiBase> taxiBases = new HashSet<TaxiBase>(0);
	private Set<TaxiNotification> taxiNotifications = new HashSet<TaxiNotification>(0);
	private Set<TaxiVehicle> taxiVehicles = new HashSet<TaxiVehicle>(0);
	private Set<TaxiTripPool> taxiTripPools = new HashSet<TaxiTripPool>(0);
	private Set<TaxiPreScheduleGroup> taxiPreScheduleGroups = new HashSet<TaxiPreScheduleGroup>(0);
	private Set<TaxiRatebook> taxiRatebooks = new HashSet<TaxiRatebook>(0);
	private Set<TaxiFeedback> taxiFeedbacks = new HashSet<TaxiFeedback>(0);
	private Set<TaxiDriverFilter> taxiDriverFilters = new HashSet<TaxiDriverFilter>(0);
	private Set<TaxiTrip> taxiTrips = new HashSet<TaxiTrip>(0);
	private Set<TaxiPayment> taxiPayments = new HashSet<TaxiPayment>(0);
	private Set<TaxiUsers> taxiUserses = new HashSet<TaxiUsers>(0);

	// Constructors

	/** default constructor */
	public TaxiCompany() {
	}

	/** minimal constructor */
	public TaxiCompany(String name, String phone, String email, String addressOne, String addressTwo,
			Time worktimeStart, Time worktimeEnd, String city, String state, String zipcode, Timestamp createdAt,
			Timestamp updatedAt, Integer status) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.addressOne = addressOne;
		this.addressTwo = addressTwo;
		this.worktimeStart = worktimeStart;
		this.worktimeEnd = worktimeEnd;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
	}

	/** full constructor */
	public TaxiCompany(String name, String phone, String email, String addressOne, String addressTwo,
			Time worktimeStart, Time worktimeEnd, String city, String state, String zipcode, Timestamp createdAt,
			Timestamp updatedAt, Integer status, Set<TaxiTransaction> taxiTransactions, Set<TaxiBooking> taxiBookings,
			Set<TaxiDriverRating> taxiDriverRatings, Set<TaxiPreScheduleHistory> taxiPreScheduleHistories,
			Set<TaxiDriver> taxiDrivers, Set<TaxiInsuranceRatebook> taxiInsuranceRatebooks,
			Set<TaxiTripDetail> taxiTripDetails, Set<TaxiBase> taxiBases, Set<TaxiNotification> taxiNotifications,
			Set<TaxiVehicle> taxiVehicles, Set<TaxiTripPool> taxiTripPools,
			Set<TaxiPreScheduleGroup> taxiPreScheduleGroups, Set<TaxiRatebook> taxiRatebooks,
			Set<TaxiFeedback> taxiFeedbacks, Set<TaxiDriverFilter> taxiDriverFilters, Set<TaxiTrip> taxiTrips,
			Set<TaxiPayment> taxiPayments, Set<TaxiUsers> taxiUserses) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.addressOne = addressOne;
		this.addressTwo = addressTwo;
		this.worktimeStart = worktimeStart;
		this.worktimeEnd = worktimeEnd;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
		this.taxiTransactions = taxiTransactions;
		this.taxiBookings = taxiBookings;
		this.taxiDriverRatings = taxiDriverRatings;
		this.taxiPreScheduleHistories = taxiPreScheduleHistories;
		this.taxiDrivers = taxiDrivers;
		this.taxiInsuranceRatebooks = taxiInsuranceRatebooks;
		this.taxiTripDetails = taxiTripDetails;
		this.taxiBases = taxiBases;
		this.taxiNotifications = taxiNotifications;
		this.taxiVehicles = taxiVehicles;
		this.taxiTripPools = taxiTripPools;
		this.taxiPreScheduleGroups = taxiPreScheduleGroups;
		this.taxiRatebooks = taxiRatebooks;
		this.taxiFeedbacks = taxiFeedbacks;
		this.taxiDriverFilters = taxiDriverFilters;
		this.taxiTrips = taxiTrips;
		this.taxiPayments = taxiPayments;
		this.taxiUserses = taxiUserses;
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

	@Column(name = "name", nullable = false)

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "phone", nullable = false)

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "email", nullable = false)

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "address_one", nullable = false)

	public String getAddressOne() {
		return this.addressOne;
	}

	public void setAddressOne(String addressOne) {
		this.addressOne = addressOne;
	}

	@Column(name = "address_two", nullable = false)

	public String getAddressTwo() {
		return this.addressTwo;
	}

	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}

	@Column(name = "worktime_start", nullable = false, length = 0)

	public Time getWorktimeStart() {
		return this.worktimeStart;
	}

	public void setWorktimeStart(Time worktimeStart) {
		this.worktimeStart = worktimeStart;
	}

	@Column(name = "worktime_end", nullable = false, length = 0)

	public Time getWorktimeEnd() {
		return this.worktimeEnd;
	}

	public void setWorktimeEnd(Time worktimeEnd) {
		this.worktimeEnd = worktimeEnd;
	}

	@Column(name = "city", nullable = false)

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "state", nullable = false)

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "zipcode", nullable = false)

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiCompany")

	public Set<TaxiTransaction> getTaxiTransactions() {
		return this.taxiTransactions;
	}

	public void setTaxiTransactions(Set<TaxiTransaction> taxiTransactions) {
		this.taxiTransactions = taxiTransactions;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiCompany")

	public Set<TaxiBooking> getTaxiBookings() {
		return this.taxiBookings;
	}

	public void setTaxiBookings(Set<TaxiBooking> taxiBookings) {
		this.taxiBookings = taxiBookings;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiCompany")

	public Set<TaxiDriverRating> getTaxiDriverRatings() {
		return this.taxiDriverRatings;
	}

	public void setTaxiDriverRatings(Set<TaxiDriverRating> taxiDriverRatings) {
		this.taxiDriverRatings = taxiDriverRatings;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiCompany")

	public Set<TaxiPreScheduleHistory> getTaxiPreScheduleHistories() {
		return this.taxiPreScheduleHistories;
	}

	public void setTaxiPreScheduleHistories(Set<TaxiPreScheduleHistory> taxiPreScheduleHistories) {
		this.taxiPreScheduleHistories = taxiPreScheduleHistories;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiCompany")

	public Set<TaxiDriver> getTaxiDrivers() {
		return this.taxiDrivers;
	}

	public void setTaxiDrivers(Set<TaxiDriver> taxiDrivers) {
		this.taxiDrivers = taxiDrivers;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiCompany")

	public Set<TaxiInsuranceRatebook> getTaxiInsuranceRatebooks() {
		return this.taxiInsuranceRatebooks;
	}

	public void setTaxiInsuranceRatebooks(Set<TaxiInsuranceRatebook> taxiInsuranceRatebooks) {
		this.taxiInsuranceRatebooks = taxiInsuranceRatebooks;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiCompany")

	public Set<TaxiTripDetail> getTaxiTripDetails() {
		return this.taxiTripDetails;
	}

	public void setTaxiTripDetails(Set<TaxiTripDetail> taxiTripDetails) {
		this.taxiTripDetails = taxiTripDetails;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiCompany")

	public Set<TaxiBase> getTaxiBases() {
		return this.taxiBases;
	}

	public void setTaxiBases(Set<TaxiBase> taxiBases) {
		this.taxiBases = taxiBases;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiCompany")

	public Set<TaxiNotification> getTaxiNotifications() {
		return this.taxiNotifications;
	}

	public void setTaxiNotifications(Set<TaxiNotification> taxiNotifications) {
		this.taxiNotifications = taxiNotifications;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiCompany")

	public Set<TaxiVehicle> getTaxiVehicles() {
		return this.taxiVehicles;
	}

	public void setTaxiVehicles(Set<TaxiVehicle> taxiVehicles) {
		this.taxiVehicles = taxiVehicles;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiCompany")

	public Set<TaxiTripPool> getTaxiTripPools() {
		return this.taxiTripPools;
	}

	public void setTaxiTripPools(Set<TaxiTripPool> taxiTripPools) {
		this.taxiTripPools = taxiTripPools;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiCompany")

	public Set<TaxiPreScheduleGroup> getTaxiPreScheduleGroups() {
		return this.taxiPreScheduleGroups;
	}

	public void setTaxiPreScheduleGroups(Set<TaxiPreScheduleGroup> taxiPreScheduleGroups) {
		this.taxiPreScheduleGroups = taxiPreScheduleGroups;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiCompany")

	public Set<TaxiRatebook> getTaxiRatebooks() {
		return this.taxiRatebooks;
	}

	public void setTaxiRatebooks(Set<TaxiRatebook> taxiRatebooks) {
		this.taxiRatebooks = taxiRatebooks;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiCompany")

	public Set<TaxiFeedback> getTaxiFeedbacks() {
		return this.taxiFeedbacks;
	}

	public void setTaxiFeedbacks(Set<TaxiFeedback> taxiFeedbacks) {
		this.taxiFeedbacks = taxiFeedbacks;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiCompany")

	public Set<TaxiDriverFilter> getTaxiDriverFilters() {
		return this.taxiDriverFilters;
	}

	public void setTaxiDriverFilters(Set<TaxiDriverFilter> taxiDriverFilters) {
		this.taxiDriverFilters = taxiDriverFilters;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiCompany")

	public Set<TaxiTrip> getTaxiTrips() {
		return this.taxiTrips;
	}

	public void setTaxiTrips(Set<TaxiTrip> taxiTrips) {
		this.taxiTrips = taxiTrips;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiCompany")

	public Set<TaxiPayment> getTaxiPayments() {
		return this.taxiPayments;
	}

	public void setTaxiPayments(Set<TaxiPayment> taxiPayments) {
		this.taxiPayments = taxiPayments;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiCompany")

	public Set<TaxiUsers> getTaxiUserses() {
		return this.taxiUserses;
	}

	public void setTaxiUserses(Set<TaxiUsers> taxiUserses) {
		this.taxiUserses = taxiUserses;
	}

}