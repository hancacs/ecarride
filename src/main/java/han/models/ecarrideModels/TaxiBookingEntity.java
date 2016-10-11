package han.models.ecarrideModels;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by hanmei on 10/3/16.
 */
@Entity
@Table(name = "taxi_booking", schema = "ecarride_db", catalog = "")
public class TaxiBookingEntity {
    private int id;
    private int baseId;
    private int companyId;
    private int tripId;
    private int userId;
    private int routeOption;
    private int assignedDriverId;
    private String secondaryPhone;
    private int confirmed;
    private int assignedVehicleTypeId;
    private int insuranceRatebookId;
    private String insuranceId;
    private String insuranceCompanyName;
    private String insuranceCostCode;
    private double etaFare;
    private int noOfPassenger;
    private int noOfBaggage;
    private String airport;
    private String terminal;
    private String flightCarrier;
    private int flightNum;
    private String comments;
    private Timestamp pickupTime;
    private String bookingType;
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
    @Column(name = "trip_id", nullable = false)
    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }


//    @ManyToOne
//    @JoinColumn(name = "taxi_users_id")
    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "route_option", nullable = false)
    public int getRouteOption() {
        return routeOption;
    }

    public void setRouteOption(int routeOption) {
        this.routeOption = routeOption;
    }

    @Basic
    @Column(name = "assigned_driver_id", nullable = false)
    public int getAssignedDriverId() {
        return assignedDriverId;
    }

    public void setAssignedDriverId(int assignedDriverId) {
        this.assignedDriverId = assignedDriverId;
    }

    @Basic
    @Column(name = "secondary_phone", nullable = false, length = 255)
    public String getSecondaryPhone() {
        return secondaryPhone;
    }

    public void setSecondaryPhone(String secondaryPhone) {
        this.secondaryPhone = secondaryPhone;
    }

    @Basic
    @Column(name = "confirmed", nullable = false)
    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    @Basic
    @Column(name = "assigned_vehicle_type_id", nullable = false)
    public int getAssignedVehicleTypeId() {
        return assignedVehicleTypeId;
    }

    public void setAssignedVehicleTypeId(int assignedVehicleTypeId) {
        this.assignedVehicleTypeId = assignedVehicleTypeId;
    }

    @Basic
    @Column(name = "insurance_ratebook_id", nullable = false)
    public int getInsuranceRatebookId() {
        return insuranceRatebookId;
    }

    public void setInsuranceRatebookId(int insuranceRatebookId) {
        this.insuranceRatebookId = insuranceRatebookId;
    }

    @Basic
    @Column(name = "insurance_id", nullable = false, length = 255)
    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    @Basic
    @Column(name = "insurance_company_name", nullable = false, length = 255)
    public String getInsuranceCompanyName() {
        return insuranceCompanyName;
    }

    public void setInsuranceCompanyName(String insuranceCompanyName) {
        this.insuranceCompanyName = insuranceCompanyName;
    }

    @Basic
    @Column(name = "insurance_cost_code", nullable = false, length = 255)
    public String getInsuranceCostCode() {
        return insuranceCostCode;
    }

    public void setInsuranceCostCode(String insuranceCostCode) {
        this.insuranceCostCode = insuranceCostCode;
    }

    @Basic
    @Column(name = "eta_fare", nullable = false, precision = 2)
    public double getEtaFare() {
        return etaFare;
    }

    public void setEtaFare(double etaFare) {
        this.etaFare = etaFare;
    }

    @Basic
    @Column(name = "no_of_passenger", nullable = false)
    public int getNoOfPassenger() {
        return noOfPassenger;
    }

    public void setNoOfPassenger(int noOfPassenger) {
        this.noOfPassenger = noOfPassenger;
    }

    @Basic
    @Column(name = "no_of_baggage", nullable = false)
    public int getNoOfBaggage() {
        return noOfBaggage;
    }

    public void setNoOfBaggage(int noOfBaggage) {
        this.noOfBaggage = noOfBaggage;
    }

    @Basic
    @Column(name = "airport", nullable = false, length = 255)
    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    @Basic
    @Column(name = "terminal", nullable = false, length = 255)
    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    @Basic
    @Column(name = "flight_carrier", nullable = false, length = 255)
    public String getFlightCarrier() {
        return flightCarrier;
    }

    public void setFlightCarrier(String flightCarrier) {
        this.flightCarrier = flightCarrier;
    }

    @Basic
    @Column(name = "flight_num", nullable = false)
    public int getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
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
    @Column(name = "pickup_time", nullable = false)
    public Timestamp getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(Timestamp pickupTime) {
        this.pickupTime = pickupTime;
    }

    @Basic
    @Column(name = "booking_type", nullable = false, length = 255)
    public String getBookingType() {
        return bookingType;
    }

    public void setBookingType(String bookingType) {
        this.bookingType = bookingType;
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

        TaxiBookingEntity that = (TaxiBookingEntity) o;

        if (id != that.id) return false;
        if (baseId != that.baseId) return false;
        if (companyId != that.companyId) return false;
        if (tripId != that.tripId) return false;
        if (userId != that.userId) return false;
        if (routeOption != that.routeOption) return false;
        if (assignedDriverId != that.assignedDriverId) return false;
        if (confirmed != that.confirmed) return false;
        if (assignedVehicleTypeId != that.assignedVehicleTypeId) return false;
        if (insuranceRatebookId != that.insuranceRatebookId) return false;
        if (Double.compare(that.etaFare, etaFare) != 0) return false;
        if (noOfPassenger != that.noOfPassenger) return false;
        if (noOfBaggage != that.noOfBaggage) return false;
        if (flightNum != that.flightNum) return false;
        if (status != that.status) return false;
        if (secondaryPhone != null ? !secondaryPhone.equals(that.secondaryPhone) : that.secondaryPhone != null)
            return false;
        if (insuranceId != null ? !insuranceId.equals(that.insuranceId) : that.insuranceId != null) return false;
        if (insuranceCompanyName != null ? !insuranceCompanyName.equals(that.insuranceCompanyName) : that.insuranceCompanyName != null)
            return false;
        if (insuranceCostCode != null ? !insuranceCostCode.equals(that.insuranceCostCode) : that.insuranceCostCode != null)
            return false;
        if (airport != null ? !airport.equals(that.airport) : that.airport != null) return false;
        if (terminal != null ? !terminal.equals(that.terminal) : that.terminal != null) return false;
        if (flightCarrier != null ? !flightCarrier.equals(that.flightCarrier) : that.flightCarrier != null)
            return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (pickupTime != null ? !pickupTime.equals(that.pickupTime) : that.pickupTime != null) return false;
        if (bookingType != null ? !bookingType.equals(that.bookingType) : that.bookingType != null) return false;
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
        result = 31 * result + tripId;
        result = 31 * result + userId;
        result = 31 * result + routeOption;
        result = 31 * result + assignedDriverId;
        result = 31 * result + (secondaryPhone != null ? secondaryPhone.hashCode() : 0);
        result = 31 * result + confirmed;
        result = 31 * result + assignedVehicleTypeId;
        result = 31 * result + insuranceRatebookId;
        result = 31 * result + (insuranceId != null ? insuranceId.hashCode() : 0);
        result = 31 * result + (insuranceCompanyName != null ? insuranceCompanyName.hashCode() : 0);
        result = 31 * result + (insuranceCostCode != null ? insuranceCostCode.hashCode() : 0);
        temp = Double.doubleToLongBits(etaFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + noOfPassenger;
        result = 31 * result + noOfBaggage;
        result = 31 * result + (airport != null ? airport.hashCode() : 0);
        result = 31 * result + (terminal != null ? terminal.hashCode() : 0);
        result = 31 * result + (flightCarrier != null ? flightCarrier.hashCode() : 0);
        result = 31 * result + flightNum;
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (pickupTime != null ? pickupTime.hashCode() : 0);
        result = 31 * result + (bookingType != null ? bookingType.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + status;
        return result;
    }
}
