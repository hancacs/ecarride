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
 * TaxiTrip entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_trip", catalog = "ecarride_db_foreign_key")

public class TaxiTrip implements java.io.Serializable {

	// Fields

	private Integer id;
	private TaxiUsers taxiUsers;
	private TaxiVehicle taxiVehicle;
	private TaxiBase taxiBase;
	private TaxiCompany taxiCompany;
	private Integer driverId;
	private Integer groupId;
	private Integer tripType;
	private Integer notifyDriverId;
	private Integer scriptStatus;
	private String pickupLat;
	private String pickupLng;
	private String pickupLocation;
	private String destinationLat;
	private String destinationLng;
	private String destinationLocation;
	private Integer pet;
	private Integer wheelchair;
	private Integer walkingAid;
	private Float estimateTime;
	private Float estimateLowFare;
	private Float estimateHighFare;
	private Float estimateHighFareOrigin;
	private Float negotiatedPrice;
	private Timestamp acceptanceTime;
	private Float baseFare;
	private Float distanceFare;
	private Float minuteFare;
	private Float tripFare;
	private Float tripFareOrigin;
	private Float gasSurcharge;
	private Float tollFee;
	private Float blackCarFund;
	private Float tax;
	private Float tip;
	private Float signupDiscount;
	private Float couponDiscount;
	private String couponCode;
	private Float adjustment;
	private Float totalAmount;
	private Float dspShare;
	private Float baseShare;
	private Float driverShare;
	private String comments;
	private Timestamp commentsTime;
	private Integer commentsType;
	private String cancelAddress;
	private Integer favorite;
	private Integer tripStatus;
	private Integer payStatus;
	private Timestamp arrivalTime;
	private String realPickupLocation;
	private Timestamp startTime;
	private String realStartLocation;
	private Timestamp endTime;
	private Float distance;
	private String endDestination;
	private String timezone;
	private String userSignature;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer status;
	private Set<TaxiBooking> taxiBookings = new HashSet<TaxiBooking>(0);
	private Set<TaxiTransaction> taxiTransactions = new HashSet<TaxiTransaction>(0);
	private Set<TaxiPreScheduleHistory> taxiPreScheduleHistories = new HashSet<TaxiPreScheduleHistory>(0);
	private Set<TaxiDriverRating> taxiDriverRatings = new HashSet<TaxiDriverRating>(0);
	private Set<TaxiTripPool> taxiTripPools = new HashSet<TaxiTripPool>(0);
	private Set<TaxiTripDetail> taxiTripDetails = new HashSet<TaxiTripDetail>(0);

	// Constructors

	/** default constructor */
	public TaxiTrip() {
	}

	/** minimal constructor */
	public TaxiTrip(TaxiUsers taxiUsers, TaxiVehicle taxiVehicle, TaxiBase taxiBase, TaxiCompany taxiCompany,
			Integer driverId, Integer groupId, Integer tripType, Integer notifyDriverId, Integer scriptStatus,
			String pickupLat, String pickupLng, String pickupLocation, String destinationLat, String destinationLng,
			String destinationLocation, Integer pet, Integer wheelchair, Integer walkingAid, Float estimateTime,
			Float estimateLowFare, Float estimateHighFare, Float estimateHighFareOrigin, Float negotiatedPrice,
			Timestamp acceptanceTime, Float baseFare, Float distanceFare, Float minuteFare, Float tripFare,
			Float tripFareOrigin, Float gasSurcharge, Float tollFee, Float blackCarFund, Float tax, Float tip,
			Float signupDiscount, Float couponDiscount, String couponCode, Float adjustment, Float totalAmount,
			Float dspShare, Float baseShare, Float driverShare, String comments, Timestamp commentsTime,
			Integer commentsType, String cancelAddress, Integer favorite, Integer tripStatus, Integer payStatus,
			Timestamp arrivalTime, String realPickupLocation, Timestamp startTime, String realStartLocation,
			Timestamp endTime, Float distance, String endDestination, String timezone, String userSignature,
			Timestamp createdAt, Timestamp updatedAt, Integer status) {
		this.taxiUsers = taxiUsers;
		this.taxiVehicle = taxiVehicle;
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.driverId = driverId;
		this.groupId = groupId;
		this.tripType = tripType;
		this.notifyDriverId = notifyDriverId;
		this.scriptStatus = scriptStatus;
		this.pickupLat = pickupLat;
		this.pickupLng = pickupLng;
		this.pickupLocation = pickupLocation;
		this.destinationLat = destinationLat;
		this.destinationLng = destinationLng;
		this.destinationLocation = destinationLocation;
		this.pet = pet;
		this.wheelchair = wheelchair;
		this.walkingAid = walkingAid;
		this.estimateTime = estimateTime;
		this.estimateLowFare = estimateLowFare;
		this.estimateHighFare = estimateHighFare;
		this.estimateHighFareOrigin = estimateHighFareOrigin;
		this.negotiatedPrice = negotiatedPrice;
		this.acceptanceTime = acceptanceTime;
		this.baseFare = baseFare;
		this.distanceFare = distanceFare;
		this.minuteFare = minuteFare;
		this.tripFare = tripFare;
		this.tripFareOrigin = tripFareOrigin;
		this.gasSurcharge = gasSurcharge;
		this.tollFee = tollFee;
		this.blackCarFund = blackCarFund;
		this.tax = tax;
		this.tip = tip;
		this.signupDiscount = signupDiscount;
		this.couponDiscount = couponDiscount;
		this.couponCode = couponCode;
		this.adjustment = adjustment;
		this.totalAmount = totalAmount;
		this.dspShare = dspShare;
		this.baseShare = baseShare;
		this.driverShare = driverShare;
		this.comments = comments;
		this.commentsTime = commentsTime;
		this.commentsType = commentsType;
		this.cancelAddress = cancelAddress;
		this.favorite = favorite;
		this.tripStatus = tripStatus;
		this.payStatus = payStatus;
		this.arrivalTime = arrivalTime;
		this.realPickupLocation = realPickupLocation;
		this.startTime = startTime;
		this.realStartLocation = realStartLocation;
		this.endTime = endTime;
		this.distance = distance;
		this.endDestination = endDestination;
		this.timezone = timezone;
		this.userSignature = userSignature;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
	}

	/** full constructor */
	public TaxiTrip(TaxiUsers taxiUsers, TaxiVehicle taxiVehicle, TaxiBase taxiBase, TaxiCompany taxiCompany,
			Integer driverId, Integer groupId, Integer tripType, Integer notifyDriverId, Integer scriptStatus,
			String pickupLat, String pickupLng, String pickupLocation, String destinationLat, String destinationLng,
			String destinationLocation, Integer pet, Integer wheelchair, Integer walkingAid, Float estimateTime,
			Float estimateLowFare, Float estimateHighFare, Float estimateHighFareOrigin, Float negotiatedPrice,
			Timestamp acceptanceTime, Float baseFare, Float distanceFare, Float minuteFare, Float tripFare,
			Float tripFareOrigin, Float gasSurcharge, Float tollFee, Float blackCarFund, Float tax, Float tip,
			Float signupDiscount, Float couponDiscount, String couponCode, Float adjustment, Float totalAmount,
			Float dspShare, Float baseShare, Float driverShare, String comments, Timestamp commentsTime,
			Integer commentsType, String cancelAddress, Integer favorite, Integer tripStatus, Integer payStatus,
			Timestamp arrivalTime, String realPickupLocation, Timestamp startTime, String realStartLocation,
			Timestamp endTime, Float distance, String endDestination, String timezone, String userSignature,
			Timestamp createdAt, Timestamp updatedAt, Integer status, Set<TaxiBooking> taxiBookings,
			Set<TaxiTransaction> taxiTransactions, Set<TaxiPreScheduleHistory> taxiPreScheduleHistories,
			Set<TaxiDriverRating> taxiDriverRatings, Set<TaxiTripPool> taxiTripPools,
			Set<TaxiTripDetail> taxiTripDetails) {
		this.taxiUsers = taxiUsers;
		this.taxiVehicle = taxiVehicle;
		this.taxiBase = taxiBase;
		this.taxiCompany = taxiCompany;
		this.driverId = driverId;
		this.groupId = groupId;
		this.tripType = tripType;
		this.notifyDriverId = notifyDriverId;
		this.scriptStatus = scriptStatus;
		this.pickupLat = pickupLat;
		this.pickupLng = pickupLng;
		this.pickupLocation = pickupLocation;
		this.destinationLat = destinationLat;
		this.destinationLng = destinationLng;
		this.destinationLocation = destinationLocation;
		this.pet = pet;
		this.wheelchair = wheelchair;
		this.walkingAid = walkingAid;
		this.estimateTime = estimateTime;
		this.estimateLowFare = estimateLowFare;
		this.estimateHighFare = estimateHighFare;
		this.estimateHighFareOrigin = estimateHighFareOrigin;
		this.negotiatedPrice = negotiatedPrice;
		this.acceptanceTime = acceptanceTime;
		this.baseFare = baseFare;
		this.distanceFare = distanceFare;
		this.minuteFare = minuteFare;
		this.tripFare = tripFare;
		this.tripFareOrigin = tripFareOrigin;
		this.gasSurcharge = gasSurcharge;
		this.tollFee = tollFee;
		this.blackCarFund = blackCarFund;
		this.tax = tax;
		this.tip = tip;
		this.signupDiscount = signupDiscount;
		this.couponDiscount = couponDiscount;
		this.couponCode = couponCode;
		this.adjustment = adjustment;
		this.totalAmount = totalAmount;
		this.dspShare = dspShare;
		this.baseShare = baseShare;
		this.driverShare = driverShare;
		this.comments = comments;
		this.commentsTime = commentsTime;
		this.commentsType = commentsType;
		this.cancelAddress = cancelAddress;
		this.favorite = favorite;
		this.tripStatus = tripStatus;
		this.payStatus = payStatus;
		this.arrivalTime = arrivalTime;
		this.realPickupLocation = realPickupLocation;
		this.startTime = startTime;
		this.realStartLocation = realStartLocation;
		this.endTime = endTime;
		this.distance = distance;
		this.endDestination = endDestination;
		this.timezone = timezone;
		this.userSignature = userSignature;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
		this.taxiBookings = taxiBookings;
		this.taxiTransactions = taxiTransactions;
		this.taxiPreScheduleHistories = taxiPreScheduleHistories;
		this.taxiDriverRatings = taxiDriverRatings;
		this.taxiTripPools = taxiTripPools;
		this.taxiTripDetails = taxiTripDetails;
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
	@JoinColumn(name = "user_id", nullable = false)

	public TaxiUsers getTaxiUsers() {
		return this.taxiUsers;
	}

	public void setTaxiUsers(TaxiUsers taxiUsers) {
		this.taxiUsers = taxiUsers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vehicle_id", nullable = false)

	public TaxiVehicle getTaxiVehicle() {
		return this.taxiVehicle;
	}

	public void setTaxiVehicle(TaxiVehicle taxiVehicle) {
		this.taxiVehicle = taxiVehicle;
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

	@Column(name = "driver_id", nullable = false)

	public Integer getDriverId() {
		return this.driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	@Column(name = "group_id", nullable = false)

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	@Column(name = "trip_type", nullable = false)

	public Integer getTripType() {
		return this.tripType;
	}

	public void setTripType(Integer tripType) {
		this.tripType = tripType;
	}

	@Column(name = "notify_driver_id", nullable = false)

	public Integer getNotifyDriverId() {
		return this.notifyDriverId;
	}

	public void setNotifyDriverId(Integer notifyDriverId) {
		this.notifyDriverId = notifyDriverId;
	}

	@Column(name = "script_status", nullable = false)

	public Integer getScriptStatus() {
		return this.scriptStatus;
	}

	public void setScriptStatus(Integer scriptStatus) {
		this.scriptStatus = scriptStatus;
	}

	@Column(name = "pickup_lat", nullable = false)

	public String getPickupLat() {
		return this.pickupLat;
	}

	public void setPickupLat(String pickupLat) {
		this.pickupLat = pickupLat;
	}

	@Column(name = "pickup_lng", nullable = false)

	public String getPickupLng() {
		return this.pickupLng;
	}

	public void setPickupLng(String pickupLng) {
		this.pickupLng = pickupLng;
	}

	@Column(name = "pickup_location", nullable = false)

	public String getPickupLocation() {
		return this.pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	@Column(name = "destination_lat", nullable = false)

	public String getDestinationLat() {
		return this.destinationLat;
	}

	public void setDestinationLat(String destinationLat) {
		this.destinationLat = destinationLat;
	}

	@Column(name = "destination_lng", nullable = false)

	public String getDestinationLng() {
		return this.destinationLng;
	}

	public void setDestinationLng(String destinationLng) {
		this.destinationLng = destinationLng;
	}

	@Column(name = "destination_location", nullable = false)

	public String getDestinationLocation() {
		return this.destinationLocation;
	}

	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}

	@Column(name = "pet", nullable = false)

	public Integer getPet() {
		return this.pet;
	}

	public void setPet(Integer pet) {
		this.pet = pet;
	}

	@Column(name = "wheelchair", nullable = false)

	public Integer getWheelchair() {
		return this.wheelchair;
	}

	public void setWheelchair(Integer wheelchair) {
		this.wheelchair = wheelchair;
	}

	@Column(name = "walking_aid", nullable = false)

	public Integer getWalkingAid() {
		return this.walkingAid;
	}

	public void setWalkingAid(Integer walkingAid) {
		this.walkingAid = walkingAid;
	}

	@Column(name = "estimate_time", nullable = false, precision = 10)

	public Float getEstimateTime() {
		return this.estimateTime;
	}

	public void setEstimateTime(Float estimateTime) {
		this.estimateTime = estimateTime;
	}

	@Column(name = "estimate_low_fare", nullable = false, precision = 10)

	public Float getEstimateLowFare() {
		return this.estimateLowFare;
	}

	public void setEstimateLowFare(Float estimateLowFare) {
		this.estimateLowFare = estimateLowFare;
	}

	@Column(name = "estimate_high_fare", nullable = false, precision = 10)

	public Float getEstimateHighFare() {
		return this.estimateHighFare;
	}

	public void setEstimateHighFare(Float estimateHighFare) {
		this.estimateHighFare = estimateHighFare;
	}

	@Column(name = "estimate_high_fare_origin", nullable = false, precision = 10)

	public Float getEstimateHighFareOrigin() {
		return this.estimateHighFareOrigin;
	}

	public void setEstimateHighFareOrigin(Float estimateHighFareOrigin) {
		this.estimateHighFareOrigin = estimateHighFareOrigin;
	}

	@Column(name = "negotiated_price", nullable = false, precision = 10)

	public Float getNegotiatedPrice() {
		return this.negotiatedPrice;
	}

	public void setNegotiatedPrice(Float negotiatedPrice) {
		this.negotiatedPrice = negotiatedPrice;
	}

	@Column(name = "acceptance_time", nullable = false, length = 0)

	public Timestamp getAcceptanceTime() {
		return this.acceptanceTime;
	}

	public void setAcceptanceTime(Timestamp acceptanceTime) {
		this.acceptanceTime = acceptanceTime;
	}

	@Column(name = "base_fare", nullable = false, precision = 10)

	public Float getBaseFare() {
		return this.baseFare;
	}

	public void setBaseFare(Float baseFare) {
		this.baseFare = baseFare;
	}

	@Column(name = "distance_fare", nullable = false, precision = 10)

	public Float getDistanceFare() {
		return this.distanceFare;
	}

	public void setDistanceFare(Float distanceFare) {
		this.distanceFare = distanceFare;
	}

	@Column(name = "minute_fare", nullable = false, precision = 10)

	public Float getMinuteFare() {
		return this.minuteFare;
	}

	public void setMinuteFare(Float minuteFare) {
		this.minuteFare = minuteFare;
	}

	@Column(name = "trip_fare", nullable = false, precision = 10)

	public Float getTripFare() {
		return this.tripFare;
	}

	public void setTripFare(Float tripFare) {
		this.tripFare = tripFare;
	}

	@Column(name = "trip_fare_origin", nullable = false, precision = 10)

	public Float getTripFareOrigin() {
		return this.tripFareOrigin;
	}

	public void setTripFareOrigin(Float tripFareOrigin) {
		this.tripFareOrigin = tripFareOrigin;
	}

	@Column(name = "gas_surcharge", nullable = false, precision = 10)

	public Float getGasSurcharge() {
		return this.gasSurcharge;
	}

	public void setGasSurcharge(Float gasSurcharge) {
		this.gasSurcharge = gasSurcharge;
	}

	@Column(name = "toll_fee", nullable = false, precision = 10)

	public Float getTollFee() {
		return this.tollFee;
	}

	public void setTollFee(Float tollFee) {
		this.tollFee = tollFee;
	}

	@Column(name = "black_car_fund", nullable = false, precision = 10)

	public Float getBlackCarFund() {
		return this.blackCarFund;
	}

	public void setBlackCarFund(Float blackCarFund) {
		this.blackCarFund = blackCarFund;
	}

	@Column(name = "tax", nullable = false, precision = 10)

	public Float getTax() {
		return this.tax;
	}

	public void setTax(Float tax) {
		this.tax = tax;
	}

	@Column(name = "tip", nullable = false, precision = 10)

	public Float getTip() {
		return this.tip;
	}

	public void setTip(Float tip) {
		this.tip = tip;
	}

	@Column(name = "signup_discount", nullable = false, precision = 10)

	public Float getSignupDiscount() {
		return this.signupDiscount;
	}

	public void setSignupDiscount(Float signupDiscount) {
		this.signupDiscount = signupDiscount;
	}

	@Column(name = "coupon_discount", nullable = false, precision = 10)

	public Float getCouponDiscount() {
		return this.couponDiscount;
	}

	public void setCouponDiscount(Float couponDiscount) {
		this.couponDiscount = couponDiscount;
	}

	@Column(name = "coupon_code", nullable = false)

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	@Column(name = "adjustment", nullable = false, precision = 10)

	public Float getAdjustment() {
		return this.adjustment;
	}

	public void setAdjustment(Float adjustment) {
		this.adjustment = adjustment;
	}

	@Column(name = "total_amount", nullable = false, precision = 10)

	public Float getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Column(name = "dsp_share", nullable = false, precision = 10)

	public Float getDspShare() {
		return this.dspShare;
	}

	public void setDspShare(Float dspShare) {
		this.dspShare = dspShare;
	}

	@Column(name = "base_share", nullable = false, precision = 10)

	public Float getBaseShare() {
		return this.baseShare;
	}

	public void setBaseShare(Float baseShare) {
		this.baseShare = baseShare;
	}

	@Column(name = "driver_share", nullable = false, precision = 10)

	public Float getDriverShare() {
		return this.driverShare;
	}

	public void setDriverShare(Float driverShare) {
		this.driverShare = driverShare;
	}

	@Column(name = "comments", nullable = false, length = 65535)

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Column(name = "comments_time", nullable = false, length = 0)

	public Timestamp getCommentsTime() {
		return this.commentsTime;
	}

	public void setCommentsTime(Timestamp commentsTime) {
		this.commentsTime = commentsTime;
	}

	@Column(name = "comments_type", nullable = false)

	public Integer getCommentsType() {
		return this.commentsType;
	}

	public void setCommentsType(Integer commentsType) {
		this.commentsType = commentsType;
	}

	@Column(name = "cancel_address", nullable = false)

	public String getCancelAddress() {
		return this.cancelAddress;
	}

	public void setCancelAddress(String cancelAddress) {
		this.cancelAddress = cancelAddress;
	}

	@Column(name = "favorite", nullable = false)

	public Integer getFavorite() {
		return this.favorite;
	}

	public void setFavorite(Integer favorite) {
		this.favorite = favorite;
	}

	@Column(name = "trip_status", nullable = false)

	public Integer getTripStatus() {
		return this.tripStatus;
	}

	public void setTripStatus(Integer tripStatus) {
		this.tripStatus = tripStatus;
	}

	@Column(name = "pay_status", nullable = false)

	public Integer getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

	@Column(name = "arrival_time", nullable = false, length = 0)

	public Timestamp getArrivalTime() {
		return this.arrivalTime;
	}

	public void setArrivalTime(Timestamp arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	@Column(name = "real_pickup_location", nullable = false)

	public String getRealPickupLocation() {
		return this.realPickupLocation;
	}

	public void setRealPickupLocation(String realPickupLocation) {
		this.realPickupLocation = realPickupLocation;
	}

	@Column(name = "start_time", nullable = false, length = 0)

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	@Column(name = "real_start_location", nullable = false)

	public String getRealStartLocation() {
		return this.realStartLocation;
	}

	public void setRealStartLocation(String realStartLocation) {
		this.realStartLocation = realStartLocation;
	}

	@Column(name = "end_time", nullable = false, length = 0)

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	@Column(name = "distance", nullable = false, precision = 10)

	public Float getDistance() {
		return this.distance;
	}

	public void setDistance(Float distance) {
		this.distance = distance;
	}

	@Column(name = "end_destination", nullable = false)

	public String getEndDestination() {
		return this.endDestination;
	}

	public void setEndDestination(String endDestination) {
		this.endDestination = endDestination;
	}

	@Column(name = "timezone", nullable = false)

	public String getTimezone() {
		return this.timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	@Column(name = "user_signature", nullable = false)

	public String getUserSignature() {
		return this.userSignature;
	}

	public void setUserSignature(String userSignature) {
		this.userSignature = userSignature;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiTrip")

	public Set<TaxiBooking> getTaxiBookings() {
		return this.taxiBookings;
	}

	public void setTaxiBookings(Set<TaxiBooking> taxiBookings) {
		this.taxiBookings = taxiBookings;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiTrip")

	public Set<TaxiTransaction> getTaxiTransactions() {
		return this.taxiTransactions;
	}

	public void setTaxiTransactions(Set<TaxiTransaction> taxiTransactions) {
		this.taxiTransactions = taxiTransactions;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiTrip")

	public Set<TaxiPreScheduleHistory> getTaxiPreScheduleHistories() {
		return this.taxiPreScheduleHistories;
	}

	public void setTaxiPreScheduleHistories(Set<TaxiPreScheduleHistory> taxiPreScheduleHistories) {
		this.taxiPreScheduleHistories = taxiPreScheduleHistories;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiTrip")

	public Set<TaxiDriverRating> getTaxiDriverRatings() {
		return this.taxiDriverRatings;
	}

	public void setTaxiDriverRatings(Set<TaxiDriverRating> taxiDriverRatings) {
		this.taxiDriverRatings = taxiDriverRatings;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiTrip")

	public Set<TaxiTripPool> getTaxiTripPools() {
		return this.taxiTripPools;
	}

	public void setTaxiTripPools(Set<TaxiTripPool> taxiTripPools) {
		this.taxiTripPools = taxiTripPools;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taxiTrip")

	public Set<TaxiTripDetail> getTaxiTripDetails() {
		return this.taxiTripDetails;
	}

	public void setTaxiTripDetails(Set<TaxiTripDetail> taxiTripDetails) {
		this.taxiTripDetails = taxiTripDetails;
	}

}