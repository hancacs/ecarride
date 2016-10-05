package han.models.ecarrideModels;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by hanmei on 10/3/16.
 */
@Entity
@Table(name = "taxi_trip_detail", schema = "ecarride_db", catalog = "")
public class TaxiTripDetailEntity {
    private int id;
    private int baseId;
    private int companyId;
    private int tripId;
    private int tripType;
    private int driverId;
    private String distance;
    private Timestamp createdAt;
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

    @Basic
    @Column(name = "trip_type", nullable = false)
    public int getTripType() {
        return tripType;
    }

    public void setTripType(int tripType) {
        this.tripType = tripType;
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
    @Column(name = "distance", nullable = false, length = 255)
    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
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

        TaxiTripDetailEntity that = (TaxiTripDetailEntity) o;

        if (id != that.id) return false;
        if (baseId != that.baseId) return false;
        if (companyId != that.companyId) return false;
        if (tripId != that.tripId) return false;
        if (tripType != that.tripType) return false;
        if (driverId != that.driverId) return false;
        if (status != that.status) return false;
        if (distance != null ? !distance.equals(that.distance) : that.distance != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + baseId;
        result = 31 * result + companyId;
        result = 31 * result + tripId;
        result = 31 * result + tripType;
        result = 31 * result + driverId;
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + status;
        return result;
    }
}
