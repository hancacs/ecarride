package dev.models;

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TaxiBooking entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_booking", catalog = "ecarride_db_foreign_key")

public class TaxiBooking implements java.io.Serializable {

	// Fields

	private Integer id;
	private TaxiTrip taxiTrip;
	private TaxiBase taxiBase;
	private TaxiCompany taxiCompany;
	private Integer userId;
	private Integer routeOption;
	private Integer assignedDriverId;
	private Integer approvedByOperator;
	private String secondaryPhone;
	private Integer confirmed;
	private Integer assignedVehicleTypeId;
	private Integer insuranceRatebookId;
	private String insuranceId;
	private String insuranceCompanyName;
	private String insuranceCostCode;
	private Float etaFare;
	private Integer noOfPassenger;
	private Integer noOfBaggage;
	private String airport;
	private String terminal;
	private String flightCarrier;
	private Integer flightNum;
	private String comments;
	private Timestamp pickupTime;
	private String bookingType;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;
	private Set<TaxiPreScheduleHistory> taxiPreScheduleHistories = new HashSet<TaxiPreScheduleHistory>(0);
	private Set<TaxiTripPool> taxiTripPools = new HashSet<TaxiTripPool>(0);

	// Constructors

	/** default constructor */
	public TaxiBooking() {
	}

	/** minimal constructor */
	public TaxiBooking(TaxiTrip taxiTrip, TaxiBase taxiBase, TaxiCompany taxiCompany, Integer userId,
			Integer routeOption, Integer assignedDriverId, Integer approvedByOperator, String secondaryPhone,
			Integer confirmed, Integer assignedVehicleTypeId, Integer insuranceRatebookId, String insuranceId,
			String insuranceCompanyName, String insuranceCostCode, Float etaFare, Integer noOfPassenger,
			Integer noOfBaggage, String airport, String terminal, String flightCarrier, Integer flightNum,
			String comments, Timestamp pickupTime, String bookingType, Timestamp createdAt, Timestamp updatedAt,
			Integer status) {
		this.taxiTrip = taxiTrip;
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.userId = userId;
		this.routeOption = routeOption;
		this.assignedDriverId = assignedDriverId;
		this.approvedByOperator = approvedByOperator;
		this.secondaryPhone = secondaryPhone;
		this.confirmed = confirmed;
		this.assignedVehicleTypeId = assignedVehicleTypeId;
		this.insuranceRatebookId = insuranceRatebookId;
		this.insuranceId = insuranceId;
		this.insuranceCompanyName = insuranceCompanyName;
		this.insuranceCostCode = insuranceCostCode;
		this.etaFare = etaFare;
		this.noOfPassenger = noOfPassenger;
		this.noOfBaggage = noOfBaggage;
		this.airport = airport;
		this.terminal = terminal;
		this.flightCarrier = flightCarrier;
		this.flightNum = flightNum;
		this.comments = comments;
		this.pickupTime = pickupTime;
		this.bookingType = bookingType;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
	}

	/** full constructor */
	public TaxiBooking(TaxiTrip taxiTrip, TaxiBase taxiBase, TaxiCompany taxiCompany, Integer userId,
			Integer routeOption, Integer assignedDriverId, Integer approvedByOperator, String secondaryPhone,
			Integer confirmed, Integer assignedVehicleTypeId, Integer insuranceRatebookId, String insuranceId,
			String insuranceCompanyName, String insuranceCostCode, Float etaFare, Integer noOfPassenger,
			Integer noOfBaggage, String airport, String terminal, String flightCarrier, Integer flightNum,
			String comments, Timestamp pickupTime, String bookingType, Timestamp createdAt, Timestamp updatedAt,
			Integer status, Set<TaxiPreScheduleHistory> taxiPreScheduleHistories, Set<TaxiTripPool> taxiTripPools) {
		this.taxiTrip = taxiTrip;
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.userId = userId;
		this.routeOption = routeOption;
		this.assignedDriverId = assignedDriverId;
		this.approvedByOperator = approvedByOperator;
		this.secondaryPhone = secondaryPhone;
		this.confirmed = confirmed;
		this.assignedVehicleTypeId = assignedVehicleTypeId;
		this.insuranceRatebookId = insuranceRatebookId;
		this.insuranceId = insuranceId;
		this.insuranceCompanyName = insuranceCompanyName;
		this.insuranceCostCode = insuranceCostCode;
		this.etaFare = etaFare;
		this.noOfPassenger = noOfPassenger;
		this.noOfBaggage = noOfBaggage;
		this.airport = airport;
		this.terminal = terminal;
		this.flightCarrier = flightCarrier;
		this.flightNum = flightNum;
		this.comments = comments;
		this.pickupTime = pickupTime;
		this.bookingType = bookingType;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
		this.taxiPreScheduleHistories = taxiPreScheduleHistories;
		this.taxiTripPools = taxiTripPools;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trip_id", nullable = false)

	public TaxiTrip getTaxiTrip() {
		return this.taxiTrip;
	}

	public void setTaxiTrip(TaxiTrip taxiTrip) {
		this.taxiTrip = taxiTrip;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "base_id", nullable = false)

	public TaxiBase getTaxiBase() {
		return this.taxiBase;
	}

	public void setTaxiBase(TaxiBase taxiBase) {
		this.taxiBase = taxiBase;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company_id", nullable = false)

	public TaxiCompany getTaxiCompany() {
		return this.taxiCompany;
	}

	public void setTaxiCompany(TaxiCompany taxiCompany) {
		this.taxiCompany = taxiCompany;
	}

	@Column(name = "user_id", nullable = false)

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "route_option", nullable = false)

	public Integer getRouteOption() {
		return this.routeOption;
	}

	public void setRouteOption(Integer routeOption) {
		this.routeOption = routeOption;
	}

	@Column(name = "assigned_driver_id", nullable = false)

	public Integer getAssignedDriverId() {
		return this.assignedDriverId;
	}

	public void setAssignedDriverId(Integer assignedDriverId) {
		this.assignedDriverId = assignedDriverId;
	}

	@Column(name = "approved_by_operator", nullable = false)

	public Integer getApprovedByOperator() {
		return this.approvedByOperator;
	}

	public void setApprovedByOperator(Integer approvedByOperator) {
		this.approvedByOperator = approvedByOperator;
	}

	@Column(name = "secondary_phone", nullable = false)

	public String getSecondaryPhone() {
		return this.secondaryPhone;
	}

	public void setSecondaryPhone(String secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}

	@Column(name = "confirmed", nullable = false)

	public Integer getConfirmed() {
		return this.confirmed;
	}

	public void setConfirmed(Integer confirmed) {
		this.confirmed = confirmed;
	}

	@Column(name = "assigned_vehicle_type_id", nullable = false)

	public Integer getAssignedVehicleTypeId() {
		return this.assignedVehicleTypeId;
	}

	public void setAssignedVehicleTypeId(Integer assignedVehicleTypeId) {
		this.assignedVehicleTypeId = assignedVehicleTypeId;
	}

	@Column(name = "insurance_ratebook_id", nullable = false)

	public Integer getInsuranceRatebookId() {
		return this.insuranceRatebookId;
	}

	public void setInsuranceRatebookId(Integer insuranceRatebookId) {
		this.insuranceRatebookId = insuranceRatebookId;
	}

	@Column(name = "insurance_id", nullable = false)

	public String getInsuranceId() {
		return this.insuranceId;
	}

	public void setInsuranceId(String insuranceId) {
		this.insuranceId = insuranceId;
	}

	@Column(name = "insurance_company_name", nullable = false)

	public String getInsuranceCompanyName() {
		return this.insuranceCompanyName;
	}

	public void setInsuranceCompanyName(String insuranceCompanyName) {
		this.insuranceCompanyName = insuranceCompanyName;
	}

	@Column(name = "insurance_cost_code", nullable = false)

	public String getInsuranceCostCode() {
		return this.insuranceCostCode;
	}

	public void setInsuranceCostCode(String insuranceCostCode) {
		this.insuranceCostCode = insuranceCostCode;
	}

	@Column(name = "eta_fare", nullable = false, precision = 10)

	public Float getEtaFare() {
		return this.etaFare;
	}

	public void setEtaFare(Float etaFare) {
		this.etaFare = etaFare;
	}

	@Column(name = "no_of_passenger", nullable = false)

	public Integer getNoOfPassenger() {
		return this.noOfPassenger;
	}

	public void setNoOfPassenger(Integer noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}

	@Column(name = "no_of_baggage", nullable = false)

	public Integer getNoOfBaggage() {
		return this.noOfBaggage;
	}

	public void setNoOfBaggage(Integer noOfBaggage) {
		this.noOfBaggage = noOfBaggage;
	}

	@Column(name = "airport", nullable = false)

	public String getAirport() {
		return this.airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	@Column(name = "terminal", nullable = false)

	public String getTerminal() {
		return this.terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	@Column(name = "flight_carrier", nullable = false)

	public String getFlightCarrier() {
		return this.flightCarrier;
	}

	public void setFlightCarrier(String flightCarrier) {
		this.flightCarrier = flightCarrier;
	}

	@Column(name = "flight_num", nullable = false)

	public Integer getFlightNum() {
		return this.flightNum;
	}

	public void setFlightNum(Integer flightNum) {
		this.flightNum = flightNum;
	}

	@Column(name = "comments", nullable = false, length = 65535)

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Column(name = "pickup_time", nullable = false, length = 0)

	public Timestamp getPickupTime() {
		return this.pickupTime;
	}

	public void setPickupTime(Timestamp pickupTime) {
		this.pickupTime = pickupTime;
	}

	@Column(name = "booking_type", nullable = false)

	public String getBookingType() {
		return this.bookingType;
	}

	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBooking")

	public Set<TaxiPreScheduleHistory> getTaxiPreScheduleHistories() {
		return this.taxiPreScheduleHistories;
	}

	public void setTaxiPreScheduleHistories(Set<TaxiPreScheduleHistory> taxiPreScheduleHistories) {
		this.taxiPreScheduleHistories = taxiPreScheduleHistories;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiBooking")

	public Set<TaxiTripPool> getTaxiTripPools() {
		return this.taxiTripPools;
	}

	public void setTaxiTripPools(Set<TaxiTripPool> taxiTripPools) {
		this.taxiTripPools = taxiTripPools;
	}

}