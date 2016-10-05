package han.models.ecarrideModels;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by hanmei on 10/3/16.
 */
@Entity
@Table(name = "taxi_trip", schema = "ecarride_db", catalog = "")
public class TaxiTripEntity {
    private int id;
    private int baseId;
    private int companyId;
    private int userId;
    private int driverId;
    private int tripType;
    private int notifyDriverId;
    private int scriptStatus;
    private String pickupLat;
    private String pickupLng;
    private String pickupLocation;
    private String destinationLat;
    private String destinationLng;
    private String destinationLocation;
    private int pet;
    private int wheelchair;
    private int walkingAid;
    private double estimateTime;
    private double estimateLowFare;
    private double estimateHighFare;
    private double estimateHighFareOrigin;
    private double negotiatedPrice;
    private Timestamp acceptanceTime;
    private double baseFare;
    private double distanceFare;
    private double minuteFare;
    private double tripFare;
    private double tripFareOrigin;
    private double gasSurcharge;
    private double tollFee;
    private double blackCarFund;
    private double tax;
    private double tip;
    private double signupDiscount;
    private double couponDiscount;
    private String couponCode;
    private double adjustment;
    private double totalAmount;
    private double dspShare;
    private double baseShare;
    private double driverShare;
    private String comments;
    private Timestamp commentsTime;
    private int commentsType;
    private String cancelAddress;
    private int favorite;
    private int tripStatus;
    private int payStatus;
    private Timestamp arrivalTime;
    private String realPickupLocation;
    private Timestamp startTime;
    private String realStartLocation;
    private Timestamp endTime;
    private double distance;
    private String endDestination;
    private String timezone;
    private String userSignature;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private int status;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "base_id", nullable = false)
    public int getBaseId() {
        return baseId;
    }

    public void setBaseId(int baseId) {
        this.baseId = baseId;
    }

    @Basic
    @Column(name = "company_id", nullable = false)
    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "driver_id", nullable = false)
    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    @Basic
    @Column(name = "trip_type", nullable = false)
    public int getTripType() {
        return tripType;
    }

    public void setTripType(int tripType) {
        this.tripType = tripType;
    }

    @Basic
    @Column(name = "notify_driver_id", nullable = false)
    public int getNotifyDriverId() {
        return notifyDriverId;
    }

    public void setNotifyDriverId(int notifyDriverId) {
        this.notifyDriverId = notifyDriverId;
    }

    @Basic
    @Column(name = "script_status", nullable = false)
    public int getScriptStatus() {
        return scriptStatus;
    }

    public void setScriptStatus(int scriptStatus) {
        this.scriptStatus = scriptStatus;
    }

    @Basic
    @Column(name = "pickup_lat", nullable = false, length = 255)
    public String getPickupLat() {
        return pickupLat;
    }

    public void setPickupLat(String pickupLat) {
        this.pickupLat = pickupLat;
    }

    @Basic
    @Column(name = "pickup_lng", nullable = false, length = 255)
    public String getPickupLng() {
        return pickupLng;
    }

    public void setPickupLng(String pickupLng) {
        this.pickupLng = pickupLng;
    }

    @Basic
    @Column(name = "pickup_location", nullable = false, length = 255)
    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    @Basic
    @Column(name = "destination_lat", nullable = false, length = 255)
    public String getDestinationLat() {
        return destinationLat;
    }

    public void setDestinationLat(String destinationLat) {
        this.destinationLat = destinationLat;
    }

    @Basic
    @Column(name = "destination_lng", nullable = false, length = 255)
    public String getDestinationLng() {
        return destinationLng;
    }

    public void setDestinationLng(String destinationLng) {
        this.destinationLng = destinationLng;
    }

    @Basic
    @Column(name = "destination_location", nullable = false, length = 255)
    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    @Basic
    @Column(name = "pet", nullable = false)
    public int getPet() {
        return pet;
    }

    public void setPet(int pet) {
        this.pet = pet;
    }

    @Basic
    @Column(name = "wheelchair", nullable = false)
    public int getWheelchair() {
        return wheelchair;
    }

    public void setWheelchair(int wheelchair) {
        this.wheelchair = wheelchair;
    }

    @Basic
    @Column(name = "walking_aid", nullable = false)
    public int getWalkingAid() {
        return walkingAid;
    }

    public void setWalkingAid(int walkingAid) {
        this.walkingAid = walkingAid;
    }

    @Basic
    @Column(name = "estimate_time", nullable = false, precision = 2)
    public double getEstimateTime() {
        return estimateTime;
    }

    public void setEstimateTime(double estimateTime) {
        this.estimateTime = estimateTime;
    }

    @Basic
    @Column(name = "estimate_low_fare", nullable = false, precision = 2)
    public double getEstimateLowFare() {
        return estimateLowFare;
    }

    public void setEstimateLowFare(double estimateLowFare) {
        this.estimateLowFare = estimateLowFare;
    }

    @Basic
    @Column(name = "estimate_high_fare", nullable = false, precision = 2)
    public double getEstimateHighFare() {
        return estimateHighFare;
    }

    public void setEstimateHighFare(double estimateHighFare) {
        this.estimateHighFare = estimateHighFare;
    }

    @Basic
    @Column(name = "estimate_high_fare_origin", nullable = false, precision = 2)
    public double getEstimateHighFareOrigin() {
        return estimateHighFareOrigin;
    }

    public void setEstimateHighFareOrigin(double estimateHighFareOrigin) {
        this.estimateHighFareOrigin = estimateHighFareOrigin;
    }

    @Basic
    @Column(name = "negotiated_price", nullable = false, precision = 2)
    public double getNegotiatedPrice() {
        return negotiatedPrice;
    }

    public void setNegotiatedPrice(double negotiatedPrice) {
        this.negotiatedPrice = negotiatedPrice;
    }

    @Basic
    @Column(name = "acceptance_time", nullable = false)
    public Timestamp getAcceptanceTime() {
        return acceptanceTime;
    }

    public void setAcceptanceTime(Timestamp acceptanceTime) {
        this.acceptanceTime = acceptanceTime;
    }

    @Basic
    @Column(name = "base_fare", nullable = false, precision = 2)
    public double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(double baseFare) {
        this.baseFare = baseFare;
    }

    @Basic
    @Column(name = "distance_fare", nullable = false, precision = 2)
    public double getDistanceFare() {
        return distanceFare;
    }

    public void setDistanceFare(double distanceFare) {
        this.distanceFare = distanceFare;
    }

    @Basic
    @Column(name = "minute_fare", nullable = false, precision = 2)
    public double getMinuteFare() {
        return minuteFare;
    }

    public void setMinuteFare(double minuteFare) {
        this.minuteFare = minuteFare;
    }

    @Basic
    @Column(name = "trip_fare", nullable = false, precision = 2)
    public double getTripFare() {
        return tripFare;
    }

    public void setTripFare(double tripFare) {
        this.tripFare = tripFare;
    }

    @Basic
    @Column(name = "trip_fare_origin", nullable = false, precision = 2)
    public double getTripFareOrigin() {
        return tripFareOrigin;
    }

    public void setTripFareOrigin(double tripFareOrigin) {
        this.tripFareOrigin = tripFareOrigin;
    }

    @Basic
    @Column(name = "gas_surcharge", nullable = false, precision = 2)
    public double getGasSurcharge() {
        return gasSurcharge;
    }

    public void setGasSurcharge(double gasSurcharge) {
        this.gasSurcharge = gasSurcharge;
    }

    @Basic
    @Column(name = "toll_fee", nullable = false, precision = 2)
    public double getTollFee() {
        return tollFee;
    }

    public void setTollFee(double tollFee) {
        this.tollFee = tollFee;
    }

    @Basic
    @Column(name = "black_car_fund", nullable = false, precision = 2)
    public double getBlackCarFund() {
        return blackCarFund;
    }

    public void setBlackCarFund(double blackCarFund) {
        this.blackCarFund = blackCarFund;
    }

    @Basic
    @Column(name = "tax", nullable = false, precision = 2)
    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Basic
    @Column(name = "tip", nullable = false, precision = 2)
    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    @Basic
    @Column(name = "signup_discount", nullable = false, precision = 2)
    public double getSignupDiscount() {
        return signupDiscount;
    }

    public void setSignupDiscount(double signupDiscount) {
        this.signupDiscount = signupDiscount;
    }

    @Basic
    @Column(name = "coupon_discount", nullable = false, precision = 2)
    public double getCouponDiscount() {
        return couponDiscount;
    }

    public void setCouponDiscount(double couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    @Basic
    @Column(name = "coupon_code", nullable = false, length = 255)
    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    @Basic
    @Column(name = "adjustment", nullable = false, precision = 2)
    public double getAdjustment() {
        return adjustment;
    }

    public void setAdjustment(double adjustment) {
        this.adjustment = adjustment;
    }

    @Basic
    @Column(name = "total_amount", nullable = false, precision = 2)
    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Basic
    @Column(name = "dsp_share", nullable = false, precision = 2)
    public double getDspShare() {
        return dspShare;
    }

    public void setDspShare(double dspShare) {
        this.dspShare = dspShare;
    }

    @Basic
    @Column(name = "base_share", nullable = false, precision = 2)
    public double getBaseShare() {
        return baseShare;
    }

    public void setBaseShare(double baseShare) {
        this.baseShare = baseShare;
    }

    @Basic
    @Column(name = "driver_share", nullable = false, precision = 2)
    public double getDriverShare() {
        return driverShare;
    }

    public void setDriverShare(double driverShare) {
        this.driverShare = driverShare;
    }

    @Basic
    @Column(name = "comments", nullable = false, length = -1)
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Basic
    @Column(name = "comments_time", nullable = false)
    public Timestamp getCommentsTime() {
        return commentsTime;
    }

    public void setCommentsTime(Timestamp commentsTime) {
        this.commentsTime = commentsTime;
    }

    @Basic
    @Column(name = "comments_type", nullable = false)
    public int getCommentsType() {
        return commentsType;
    }

    public void setCommentsType(int commentsType) {
        this.commentsType = commentsType;
    }

    @Basic
    @Column(name = "cancel_address", nullable = false, length = 255)
    public String getCancelAddress() {
        return cancelAddress;
    }

    public void setCancelAddress(String cancelAddress) {
        this.cancelAddress = cancelAddress;
    }

    @Basic
    @Column(name = "favorite", nullable = false)
    public int getFavorite() {
        return favorite;
    }

    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }

    @Basic
    @Column(name = "trip_status", nullable = false)
    public int getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(int tripStatus) {
        this.tripStatus = tripStatus;
    }

    @Basic
    @Column(name = "pay_status", nullable = false)
    public int getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(int payStatus) {
        this.payStatus = payStatus;
    }

    @Basic
    @Column(name = "arrival_time", nullable = false)
    public Timestamp getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Timestamp arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Basic
    @Column(name = "real_pickup_location", nullable = false, length = 255)
    public String getRealPickupLocation() {
        return realPickupLocation;
    }

    public void setRealPickupLocation(String realPickupLocation) {
        this.realPickupLocation = realPickupLocation;
    }

    @Basic
    @Column(name = "start_time", nullable = false)
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "real_start_location", nullable = false, length = 255)
    public String getRealStartLocation() {
        return realStartLocation;
    }

    public void setRealStartLocation(String realStartLocation) {
        this.realStartLocation = realStartLocation;
    }

    @Basic
    @Column(name = "end_time", nullable = false)
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "distance", nullable = false, precision = 2)
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Basic
    @Column(name = "end_destination", nullable = false, length = 255)
    public String getEndDestination() {
        return endDestination;
    }

    public void setEndDestination(String endDestination) {
        this.endDestination = endDestination;
    }

    @Basic
    @Column(name = "timezone", nullable = false, length = 255)
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Basic
    @Column(name = "user_signature", nullable = false, length = 255)
    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature;
    }

    @Basic
    @Column(name = "created_at", nullable = false)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at", nullable = false)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaxiTripEntity that = (TaxiTripEntity) o;

        if (id != that.id) return false;
        if (baseId != that.baseId) return false;
        if (companyId != that.companyId) return false;
        if (userId != that.userId) return false;
        if (driverId != that.driverId) return false;
        if (tripType != that.tripType) return false;
        if (notifyDriverId != that.notifyDriverId) return false;
        if (scriptStatus != that.scriptStatus) return false;
        if (pet != that.pet) return false;
        if (wheelchair != that.wheelchair) return false;
        if (walkingAid != that.walkingAid) return false;
        if (Double.compare(that.estimateTime, estimateTime) != 0) return false;
        if (Double.compare(that.estimateLowFare, estimateLowFare) != 0) return false;
        if (Double.compare(that.estimateHighFare, estimateHighFare) != 0) return false;
        if (Double.compare(that.estimateHighFareOrigin, estimateHighFareOrigin) != 0) return false;
        if (Double.compare(that.negotiatedPrice, negotiatedPrice) != 0) return false;
        if (Double.compare(that.baseFare, baseFare) != 0) return false;
        if (Double.compare(that.distanceFare, distanceFare) != 0) return false;
        if (Double.compare(that.minuteFare, minuteFare) != 0) return false;
        if (Double.compare(that.tripFare, tripFare) != 0) return false;
        if (Double.compare(that.tripFareOrigin, tripFareOrigin) != 0) return false;
        if (Double.compare(that.gasSurcharge, gasSurcharge) != 0) return false;
        if (Double.compare(that.tollFee, tollFee) != 0) return false;
        if (Double.compare(that.blackCarFund, blackCarFund) != 0) return false;
        if (Double.compare(that.tax, tax) != 0) return false;
        if (Double.compare(that.tip, tip) != 0) return false;
        if (Double.compare(that.signupDiscount, signupDiscount) != 0) return false;
        if (Double.compare(that.couponDiscount, couponDiscount) != 0) return false;
        if (Double.compare(that.adjustment, adjustment) != 0) return false;
        if (Double.compare(that.totalAmount, totalAmount) != 0) return false;
        if (Double.compare(that.dspShare, dspShare) != 0) return false;
        if (Double.compare(that.baseShare, baseShare) != 0) return false;
        if (Double.compare(that.driverShare, driverShare) != 0) return false;
        if (commentsType != that.commentsType) return false;
        if (favorite != that.favorite) return false;
        if (tripStatus != that.tripStatus) return false;
        if (payStatus != that.payStatus) return false;
        if (Double.compare(that.distance, distance) != 0) return false;
        if (status != that.status) return false;
        if (pickupLat != null ? !pickupLat.equals(that.pickupLat) : that.pickupLat != null) return false;
        if (pickupLng != null ? !pickupLng.equals(that.pickupLng) : that.pickupLng != null) return false;
        if (pickupLocation != null ? !pickupLocation.equals(that.pickupLocation) : that.pickupLocation != null)
            return false;
        if (destinationLat != null ? !destinationLat.equals(that.destinationLat) : that.destinationLat != null)
            return false;
        if (destinationLng != null ? !destinationLng.equals(that.destinationLng) : that.destinationLng != null)
            return false;
        if (destinationLocation != null ? !destinationLocation.equals(that.destinationLocation) : that.destinationLocation != null)
            return false;
        if (acceptanceTime != null ? !acceptanceTime.equals(that.acceptanceTime) : that.acceptanceTime != null)
            return false;
        if (couponCode != null ? !couponCode.equals(that.couponCode) : that.couponCode != null) return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (commentsTime != null ? !commentsTime.equals(that.commentsTime) : that.commentsTime != null) return false;
        if (cancelAddress != null ? !cancelAddress.equals(that.cancelAddress) : that.cancelAddress != null)
            return false;
        if (arrivalTime != null ? !arrivalTime.equals(that.arrivalTime) : that.arrivalTime != null) return false;
        if (realPickupLocation != null ? !realPickupLocation.equals(that.realPickupLocation) : that.realPickupLocation != null)
            return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (realStartLocation != null ? !realStartLocation.equals(that.realStartLocation) : that.realStartLocation != null)
            return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (endDestination != null ? !endDestination.equals(that.endDestination) : that.endDestination != null)
            return false;
        if (timezone != null ? !timezone.equals(that.timezone) : that.timezone != null) return false;
        if (userSignature != null ? !userSignature.equals(that.userSignature) : that.userSignature != null)
            return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + baseId;
        result = 31 * result + companyId;
        result = 31 * result + userId;
        result = 31 * result + driverId;
        result = 31 * result + tripType;
        result = 31 * result + notifyDriverId;
        result = 31 * result + scriptStatus;
        result = 31 * result + (pickupLat != null ? pickupLat.hashCode() : 0);
        result = 31 * result + (pickupLng != null ? pickupLng.hashCode() : 0);
        result = 31 * result + (pickupLocation != null ? pickupLocation.hashCode() : 0);
        result = 31 * result + (destinationLat != null ? destinationLat.hashCode() : 0);
        result = 31 * result + (destinationLng != null ? destinationLng.hashCode() : 0);
        result = 31 * result + (destinationLocation != null ? destinationLocation.hashCode() : 0);
        result = 31 * result + pet;
        result = 31 * result + wheelchair;
        result = 31 * result + walkingAid;
        temp = Double.doubleToLongBits(estimateTime);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(estimateLowFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(estimateHighFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(estimateHighFareOrigin);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(negotiatedPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (acceptanceTime != null ? acceptanceTime.hashCode() : 0);
        temp = Double.doubleToLongBits(baseFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(distanceFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(minuteFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tripFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tripFareOrigin);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(gasSurcharge);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tollFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(blackCarFund);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tax);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tip);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(signupDiscount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(couponDiscount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (couponCode != null ? couponCode.hashCode() : 0);
        temp = Double.doubleToLongBits(adjustment);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(dspShare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(baseShare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(driverShare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (commentsTime != null ? commentsTime.hashCode() : 0);
        result = 31 * result + commentsType;
        result = 31 * result + (cancelAddress != null ? cancelAddress.hashCode() : 0);
        result = 31 * result + favorite;
        result = 31 * result + tripStatus;
        result = 31 * result + payStatus;
        result = 31 * result + (arrivalTime != null ? arrivalTime.hashCode() : 0);
        result = 31 * result + (realPickupLocation != null ? realPickupLocation.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (realStartLocation != null ? realStartLocation.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        temp = Double.doubleToLongBits(distance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (endDestination != null ? endDestination.hashCode() : 0);
        result = 31 * result + (timezone != null ? timezone.hashCode() : 0);
        result = 31 * result + (userSignature != null ? userSignature.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + status;
        return result;
    }
}
