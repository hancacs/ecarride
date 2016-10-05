package han.models.ecarrideModels;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by hanmei on 10/3/16.
 */
@Entity
@Table(name = "taxi_driver", schema = "ecarride_db", catalog = "")
public class TaxiDriverEntity {
    private int id;
    private String merchantAccountId;
    private int baseId;
    private int companyId;
    private String username;
    private String password;
    private int driverType;
    private String firstName;
    private String lastName;
    private String fleetNum;
    private String phone;
    private String secondaryPhone;
    private String email;
    private Date dob;
    private int gender;
    private String nationality;
    private int drivingExperience;
    private String verificationCode;
    private String profilePhoto;
    private String signature;
    private String driverLicense;
    private String driverLicenseNum;
    private String driverLicenseClass;
    private String driverLicenseState;
    private Date driverLicenseStart;
    private Date driverLicenseExpire;
    private int driverLicenseStatus;
    private String driverTlcFhvLicense;
    private String driverTlcFhvLicenseNum;
    private Date driverTlcFhvLicenseStart;
    private Date driverTlcFhvLicenseExpire;
    private int driverTlcFhvLicenseStatus;
    private String backgroundCheck;
    private Date backgroundCheckStart;
    private Date backgroundCheckExpire;
    private int backgroundCheckStatus;
    private String drivingRecord;
    private Date drivingRecordStart;
    private Date drivingRecordExpire;
    private int drivingRecordStatus;
    private String drugScreen;
    private Date drugScreenStart;
    private Date drugScreenExpire;
    private int drugScreenStatus;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private int vehicleId;
    private int allowPets;
    private int allowWheelchair;
    private int dutyStatus;
    private String appLanguage;
    private String deviceToken;
    private String deviceId;
    private String mobileOs;
    private String objectId;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private int approvableMail;
    private int baseApproved;
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
    @Column(name = "merchant_account_id", nullable = false, length = 255)
    public String getMerchantAccountId() {
        return merchantAccountId;
    }

    public void setMerchantAccountId(String merchantAccountId) {
        this.merchantAccountId = merchantAccountId;
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
    @Column(name = "username", nullable = false, length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "driver_type", nullable = false)
    public int getDriverType() {
        return driverType;
    }

    public void setDriverType(int driverType) {
        this.driverType = driverType;
    }

    @Basic
    @Column(name = "first_name", nullable = false, length = 255)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = false, length = 255)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "fleet_num", nullable = false, length = 255)
    public String getFleetNum() {
        return fleetNum;
    }

    public void setFleetNum(String fleetNum) {
        this.fleetNum = fleetNum;
    }

    @Basic
    @Column(name = "phone", nullable = false, length = 255)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
    @Column(name = "email", nullable = false, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "dob", nullable = false)
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Basic
    @Column(name = "gender", nullable = false)
    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "nationality", nullable = false, length = 255)
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Basic
    @Column(name = "driving_experience", nullable = false)
    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Basic
    @Column(name = "verification_code", nullable = false, length = 64)
    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    @Basic
    @Column(name = "profile_photo", nullable = false, length = 255)
    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    @Basic
    @Column(name = "signature", nullable = false, length = 255)
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Basic
    @Column(name = "driver_license", nullable = false, length = 255)
    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    @Basic
    @Column(name = "driver_license_num", nullable = false, length = 255)
    public String getDriverLicenseNum() {
        return driverLicenseNum;
    }

    public void setDriverLicenseNum(String driverLicenseNum) {
        this.driverLicenseNum = driverLicenseNum;
    }

    @Basic
    @Column(name = "driver_license_class", nullable = false, length = 255)
    public String getDriverLicenseClass() {
        return driverLicenseClass;
    }

    public void setDriverLicenseClass(String driverLicenseClass) {
        this.driverLicenseClass = driverLicenseClass;
    }

    @Basic
    @Column(name = "driver_license_state", nullable = false, length = 255)
    public String getDriverLicenseState() {
        return driverLicenseState;
    }

    public void setDriverLicenseState(String driverLicenseState) {
        this.driverLicenseState = driverLicenseState;
    }

    @Basic
    @Column(name = "driver_license_start", nullable = false)
    public Date getDriverLicenseStart() {
        return driverLicenseStart;
    }

    public void setDriverLicenseStart(Date driverLicenseStart) {
        this.driverLicenseStart = driverLicenseStart;
    }

    @Basic
    @Column(name = "driver_license_expire", nullable = false)
    public Date getDriverLicenseExpire() {
        return driverLicenseExpire;
    }

    public void setDriverLicenseExpire(Date driverLicenseExpire) {
        this.driverLicenseExpire = driverLicenseExpire;
    }

    @Basic
    @Column(name = "driver_license_status", nullable = false)
    public int getDriverLicenseStatus() {
        return driverLicenseStatus;
    }

    public void setDriverLicenseStatus(int driverLicenseStatus) {
        this.driverLicenseStatus = driverLicenseStatus;
    }

    @Basic
    @Column(name = "driver_tlc_fhv_license", nullable = false, length = 255)
    public String getDriverTlcFhvLicense() {
        return driverTlcFhvLicense;
    }

    public void setDriverTlcFhvLicense(String driverTlcFhvLicense) {
        this.driverTlcFhvLicense = driverTlcFhvLicense;
    }

    @Basic
    @Column(name = "driver_tlc_fhv_license_num", nullable = false, length = 255)
    public String getDriverTlcFhvLicenseNum() {
        return driverTlcFhvLicenseNum;
    }

    public void setDriverTlcFhvLicenseNum(String driverTlcFhvLicenseNum) {
        this.driverTlcFhvLicenseNum = driverTlcFhvLicenseNum;
    }

    @Basic
    @Column(name = "driver_tlc_fhv_license_start", nullable = false)
    public Date getDriverTlcFhvLicenseStart() {
        return driverTlcFhvLicenseStart;
    }

    public void setDriverTlcFhvLicenseStart(Date driverTlcFhvLicenseStart) {
        this.driverTlcFhvLicenseStart = driverTlcFhvLicenseStart;
    }

    @Basic
    @Column(name = "driver_tlc_fhv_license_expire", nullable = false)
    public Date getDriverTlcFhvLicenseExpire() {
        return driverTlcFhvLicenseExpire;
    }

    public void setDriverTlcFhvLicenseExpire(Date driverTlcFhvLicenseExpire) {
        this.driverTlcFhvLicenseExpire = driverTlcFhvLicenseExpire;
    }

    @Basic
    @Column(name = "driver_tlc_fhv_license_status", nullable = false)
    public int getDriverTlcFhvLicenseStatus() {
        return driverTlcFhvLicenseStatus;
    }

    public void setDriverTlcFhvLicenseStatus(int driverTlcFhvLicenseStatus) {
        this.driverTlcFhvLicenseStatus = driverTlcFhvLicenseStatus;
    }

    @Basic
    @Column(name = "background_check", nullable = false, length = 255)
    public String getBackgroundCheck() {
        return backgroundCheck;
    }

    public void setBackgroundCheck(String backgroundCheck) {
        this.backgroundCheck = backgroundCheck;
    }

    @Basic
    @Column(name = "background_check_start", nullable = false)
    public Date getBackgroundCheckStart() {
        return backgroundCheckStart;
    }

    public void setBackgroundCheckStart(Date backgroundCheckStart) {
        this.backgroundCheckStart = backgroundCheckStart;
    }

    @Basic
    @Column(name = "background_check_expire", nullable = false)
    public Date getBackgroundCheckExpire() {
        return backgroundCheckExpire;
    }

    public void setBackgroundCheckExpire(Date backgroundCheckExpire) {
        this.backgroundCheckExpire = backgroundCheckExpire;
    }

    @Basic
    @Column(name = "background_check_status", nullable = false)
    public int getBackgroundCheckStatus() {
        return backgroundCheckStatus;
    }

    public void setBackgroundCheckStatus(int backgroundCheckStatus) {
        this.backgroundCheckStatus = backgroundCheckStatus;
    }

    @Basic
    @Column(name = "driving_record", nullable = false, length = 255)
    public String getDrivingRecord() {
        return drivingRecord;
    }

    public void setDrivingRecord(String drivingRecord) {
        this.drivingRecord = drivingRecord;
    }

    @Basic
    @Column(name = "driving_record_start", nullable = false)
    public Date getDrivingRecordStart() {
        return drivingRecordStart;
    }

    public void setDrivingRecordStart(Date drivingRecordStart) {
        this.drivingRecordStart = drivingRecordStart;
    }

    @Basic
    @Column(name = "driving_record_expire", nullable = false)
    public Date getDrivingRecordExpire() {
        return drivingRecordExpire;
    }

    public void setDrivingRecordExpire(Date drivingRecordExpire) {
        this.drivingRecordExpire = drivingRecordExpire;
    }

    @Basic
    @Column(name = "driving_record_status", nullable = false)
    public int getDrivingRecordStatus() {
        return drivingRecordStatus;
    }

    public void setDrivingRecordStatus(int drivingRecordStatus) {
        this.drivingRecordStatus = drivingRecordStatus;
    }

    @Basic
    @Column(name = "drug_screen", nullable = false, length = 255)
    public String getDrugScreen() {
        return drugScreen;
    }

    public void setDrugScreen(String drugScreen) {
        this.drugScreen = drugScreen;
    }

    @Basic
    @Column(name = "drug_screen_start", nullable = false)
    public Date getDrugScreenStart() {
        return drugScreenStart;
    }

    public void setDrugScreenStart(Date drugScreenStart) {
        this.drugScreenStart = drugScreenStart;
    }

    @Basic
    @Column(name = "drug_screen_expire", nullable = false)
    public Date getDrugScreenExpire() {
        return drugScreenExpire;
    }

    public void setDrugScreenExpire(Date drugScreenExpire) {
        this.drugScreenExpire = drugScreenExpire;
    }

    @Basic
    @Column(name = "drug_screen_status", nullable = false)
    public int getDrugScreenStatus() {
        return drugScreenStatus;
    }

    public void setDrugScreenStatus(int drugScreenStatus) {
        this.drugScreenStatus = drugScreenStatus;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "city", nullable = false, length = 255)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "state", nullable = false, length = 255)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "zipcode", nullable = false, length = 255)
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Basic
    @Column(name = "vehicle_id", nullable = false)
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Basic
    @Column(name = "allow_pets", nullable = false)
    public int getAllowPets() {
        return allowPets;
    }

    public void setAllowPets(int allowPets) {
        this.allowPets = allowPets;
    }

    @Basic
    @Column(name = "allow_wheelchair", nullable = false)
    public int getAllowWheelchair() {
        return allowWheelchair;
    }

    public void setAllowWheelchair(int allowWheelchair) {
        this.allowWheelchair = allowWheelchair;
    }

    @Basic
    @Column(name = "duty_status", nullable = false)
    public int getDutyStatus() {
        return dutyStatus;
    }

    public void setDutyStatus(int dutyStatus) {
        this.dutyStatus = dutyStatus;
    }

    @Basic
    @Column(name = "app_language", nullable = false, length = 255)
    public String getAppLanguage() {
        return appLanguage;
    }

    public void setAppLanguage(String appLanguage) {
        this.appLanguage = appLanguage;
    }

    @Basic
    @Column(name = "device_token", nullable = false, length = 255)
    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    @Basic
    @Column(name = "device_id", nullable = false, length = 255)
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "mobile_os", nullable = false, length = 255)
    public String getMobileOs() {
        return mobileOs;
    }

    public void setMobileOs(String mobileOs) {
        this.mobileOs = mobileOs;
    }

    @Basic
    @Column(name = "object_id", nullable = false, length = 255)
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
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
    @Column(name = "approvable_mail", nullable = false)
    public int getApprovableMail() {
        return approvableMail;
    }

    public void setApprovableMail(int approvableMail) {
        this.approvableMail = approvableMail;
    }

    @Basic
    @Column(name = "base_approved", nullable = false)
    public int getBaseApproved() {
        return baseApproved;
    }

    public void setBaseApproved(int baseApproved) {
        this.baseApproved = baseApproved;
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

        TaxiDriverEntity that = (TaxiDriverEntity) o;

        if (id != that.id) return false;
        if (baseId != that.baseId) return false;
        if (companyId != that.companyId) return false;
        if (driverType != that.driverType) return false;
        if (gender != that.gender) return false;
        if (drivingExperience != that.drivingExperience) return false;
        if (driverLicenseStatus != that.driverLicenseStatus) return false;
        if (driverTlcFhvLicenseStatus != that.driverTlcFhvLicenseStatus) return false;
        if (backgroundCheckStatus != that.backgroundCheckStatus) return false;
        if (drivingRecordStatus != that.drivingRecordStatus) return false;
        if (drugScreenStatus != that.drugScreenStatus) return false;
        if (vehicleId != that.vehicleId) return false;
        if (allowPets != that.allowPets) return false;
        if (allowWheelchair != that.allowWheelchair) return false;
        if (dutyStatus != that.dutyStatus) return false;
        if (approvableMail != that.approvableMail) return false;
        if (baseApproved != that.baseApproved) return false;
        if (status != that.status) return false;
        if (merchantAccountId != null ? !merchantAccountId.equals(that.merchantAccountId) : that.merchantAccountId != null)
            return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (fleetNum != null ? !fleetNum.equals(that.fleetNum) : that.fleetNum != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (secondaryPhone != null ? !secondaryPhone.equals(that.secondaryPhone) : that.secondaryPhone != null)
            return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (dob != null ? !dob.equals(that.dob) : that.dob != null) return false;
        if (nationality != null ? !nationality.equals(that.nationality) : that.nationality != null) return false;
        if (verificationCode != null ? !verificationCode.equals(that.verificationCode) : that.verificationCode != null)
            return false;
        if (profilePhoto != null ? !profilePhoto.equals(that.profilePhoto) : that.profilePhoto != null) return false;
        if (signature != null ? !signature.equals(that.signature) : that.signature != null) return false;
        if (driverLicense != null ? !driverLicense.equals(that.driverLicense) : that.driverLicense != null)
            return false;
        if (driverLicenseNum != null ? !driverLicenseNum.equals(that.driverLicenseNum) : that.driverLicenseNum != null)
            return false;
        if (driverLicenseClass != null ? !driverLicenseClass.equals(that.driverLicenseClass) : that.driverLicenseClass != null)
            return false;
        if (driverLicenseState != null ? !driverLicenseState.equals(that.driverLicenseState) : that.driverLicenseState != null)
            return false;
        if (driverLicenseStart != null ? !driverLicenseStart.equals(that.driverLicenseStart) : that.driverLicenseStart != null)
            return false;
        if (driverLicenseExpire != null ? !driverLicenseExpire.equals(that.driverLicenseExpire) : that.driverLicenseExpire != null)
            return false;
        if (driverTlcFhvLicense != null ? !driverTlcFhvLicense.equals(that.driverTlcFhvLicense) : that.driverTlcFhvLicense != null)
            return false;
        if (driverTlcFhvLicenseNum != null ? !driverTlcFhvLicenseNum.equals(that.driverTlcFhvLicenseNum) : that.driverTlcFhvLicenseNum != null)
            return false;
        if (driverTlcFhvLicenseStart != null ? !driverTlcFhvLicenseStart.equals(that.driverTlcFhvLicenseStart) : that.driverTlcFhvLicenseStart != null)
            return false;
        if (driverTlcFhvLicenseExpire != null ? !driverTlcFhvLicenseExpire.equals(that.driverTlcFhvLicenseExpire) : that.driverTlcFhvLicenseExpire != null)
            return false;
        if (backgroundCheck != null ? !backgroundCheck.equals(that.backgroundCheck) : that.backgroundCheck != null)
            return false;
        if (backgroundCheckStart != null ? !backgroundCheckStart.equals(that.backgroundCheckStart) : that.backgroundCheckStart != null)
            return false;
        if (backgroundCheckExpire != null ? !backgroundCheckExpire.equals(that.backgroundCheckExpire) : that.backgroundCheckExpire != null)
            return false;
        if (drivingRecord != null ? !drivingRecord.equals(that.drivingRecord) : that.drivingRecord != null)
            return false;
        if (drivingRecordStart != null ? !drivingRecordStart.equals(that.drivingRecordStart) : that.drivingRecordStart != null)
            return false;
        if (drivingRecordExpire != null ? !drivingRecordExpire.equals(that.drivingRecordExpire) : that.drivingRecordExpire != null)
            return false;
        if (drugScreen != null ? !drugScreen.equals(that.drugScreen) : that.drugScreen != null) return false;
        if (drugScreenStart != null ? !drugScreenStart.equals(that.drugScreenStart) : that.drugScreenStart != null)
            return false;
        if (drugScreenExpire != null ? !drugScreenExpire.equals(that.drugScreenExpire) : that.drugScreenExpire != null)
            return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (zipcode != null ? !zipcode.equals(that.zipcode) : that.zipcode != null) return false;
        if (appLanguage != null ? !appLanguage.equals(that.appLanguage) : that.appLanguage != null) return false;
        if (deviceToken != null ? !deviceToken.equals(that.deviceToken) : that.deviceToken != null) return false;
        if (deviceId != null ? !deviceId.equals(that.deviceId) : that.deviceId != null) return false;
        if (mobileOs != null ? !mobileOs.equals(that.mobileOs) : that.mobileOs != null) return false;
        if (objectId != null ? !objectId.equals(that.objectId) : that.objectId != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (merchantAccountId != null ? merchantAccountId.hashCode() : 0);
        result = 31 * result + baseId;
        result = 31 * result + companyId;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + driverType;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (fleetNum != null ? fleetNum.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (secondaryPhone != null ? secondaryPhone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + gender;
        result = 31 * result + (nationality != null ? nationality.hashCode() : 0);
        result = 31 * result + drivingExperience;
        result = 31 * result + (verificationCode != null ? verificationCode.hashCode() : 0);
        result = 31 * result + (profilePhoto != null ? profilePhoto.hashCode() : 0);
        result = 31 * result + (signature != null ? signature.hashCode() : 0);
        result = 31 * result + (driverLicense != null ? driverLicense.hashCode() : 0);
        result = 31 * result + (driverLicenseNum != null ? driverLicenseNum.hashCode() : 0);
        result = 31 * result + (driverLicenseClass != null ? driverLicenseClass.hashCode() : 0);
        result = 31 * result + (driverLicenseState != null ? driverLicenseState.hashCode() : 0);
        result = 31 * result + (driverLicenseStart != null ? driverLicenseStart.hashCode() : 0);
        result = 31 * result + (driverLicenseExpire != null ? driverLicenseExpire.hashCode() : 0);
        result = 31 * result + driverLicenseStatus;
        result = 31 * result + (driverTlcFhvLicense != null ? driverTlcFhvLicense.hashCode() : 0);
        result = 31 * result + (driverTlcFhvLicenseNum != null ? driverTlcFhvLicenseNum.hashCode() : 0);
        result = 31 * result + (driverTlcFhvLicenseStart != null ? driverTlcFhvLicenseStart.hashCode() : 0);
        result = 31 * result + (driverTlcFhvLicenseExpire != null ? driverTlcFhvLicenseExpire.hashCode() : 0);
        result = 31 * result + driverTlcFhvLicenseStatus;
        result = 31 * result + (backgroundCheck != null ? backgroundCheck.hashCode() : 0);
        result = 31 * result + (backgroundCheckStart != null ? backgroundCheckStart.hashCode() : 0);
        result = 31 * result + (backgroundCheckExpire != null ? backgroundCheckExpire.hashCode() : 0);
        result = 31 * result + backgroundCheckStatus;
        result = 31 * result + (drivingRecord != null ? drivingRecord.hashCode() : 0);
        result = 31 * result + (drivingRecordStart != null ? drivingRecordStart.hashCode() : 0);
        result = 31 * result + (drivingRecordExpire != null ? drivingRecordExpire.hashCode() : 0);
        result = 31 * result + drivingRecordStatus;
        result = 31 * result + (drugScreen != null ? drugScreen.hashCode() : 0);
        result = 31 * result + (drugScreenStart != null ? drugScreenStart.hashCode() : 0);
        result = 31 * result + (drugScreenExpire != null ? drugScreenExpire.hashCode() : 0);
        result = 31 * result + drugScreenStatus;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        result = 31 * result + vehicleId;
        result = 31 * result + allowPets;
        result = 31 * result + allowWheelchair;
        result = 31 * result + dutyStatus;
        result = 31 * result + (appLanguage != null ? appLanguage.hashCode() : 0);
        result = 31 * result + (deviceToken != null ? deviceToken.hashCode() : 0);
        result = 31 * result + (deviceId != null ? deviceId.hashCode() : 0);
        result = 31 * result + (mobileOs != null ? mobileOs.hashCode() : 0);
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + approvableMail;
        result = 31 * result + baseApproved;
        result = 31 * result + status;
        return result;
    }
}
