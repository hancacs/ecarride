package dev.interfaces;

import dev.models.TaxiDriver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Interface for TaxiDriverDAO.
 * 
 * @author MyEclipse Persistence Tools
 */
@Repository
@Transactional
public interface ITaxiDriverDAO extends CrudRepository<TaxiDriver, Integer> {
	/**
	 * Perform an initial save of a previously unsaved TaxiDriver entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * 
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiDriverDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiDriver entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public TaxiDriver save(TaxiDriver entity);
	public List<TaxiDriver> findAll();
	public TaxiDriver findById(int id);

	/**
	 * Delete a persistent TaxiDriver entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiDriverDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiDriver entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiDriver entity);

	/**
	 * Persist a previously saved TaxiDriver entity and return it or a copy of
	 * it to the sender. A copy of the TaxiDriver entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 *
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiDriverDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 *
	 * @param entity
	 *            TaxiDriver entity to update
	 * @return TaxiDriver the persisted TaxiDriver entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
//	public TaxiDriver update(TaxiDriver entity);

//	public TaxiDriver findById(Integer id);

//	/**
//	 * Find all TaxiDriver entities with a specific property value.
//	 *
//	 * @param propertyName
//	 *            the name of the TaxiDriver property to query
//	 * @param value
//	 *            the property value to match
//	 * @param rowStartIdxAndCount
//	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
//	 *            row index in the query result-set to begin collecting the
//	 *            results. rowStartIdxAndCount[1] specifies the the maximum
//	 *            count of results to return.
//	 * @return List<TaxiDriver> found by query
//	 */
//	public List<TaxiDriver> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByMerchantAccountId(Object merchantAccountId, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByGroupId(Object groupId, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByUsername(Object username, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByPassword(Object password, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByDriverType(Object driverType, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByFirstName(Object firstName, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByLastName(Object lastName, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByFleetNum(Object fleetNum, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByPhone(Object phone, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findBySecondaryPhone(Object secondaryPhone, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByEmail(Object email, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByGender(Object gender, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByNationality(Object nationality, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByDrivingExperience(Object drivingExperience, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByVerificationCode(Object verificationCode, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByProfilePhoto(Object profilePhoto, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findBySignature(Object signature, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByDriverLicense(Object driverLicense, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByDriverLicenseNum(Object driverLicenseNum, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByDriverLicenseClass(Object driverLicenseClass, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByDriverLicenseState(Object driverLicenseState, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByDriverLicenseStatus(Object driverLicenseStatus, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByDriverTlcFhvLicense(Object driverTlcFhvLicense, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByDriverTlcFhvLicenseNum(Object driverTlcFhvLicenseNum, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByDriverTlcFhvLicenseStatus(Object driverTlcFhvLicenseStatus,
//                                                            int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByBackgroundCheck(Object backgroundCheck, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByBackgroundCheckStatus(Object backgroundCheckStatus, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByDrivingRecord(Object drivingRecord, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByDrivingRecordStatus(Object drivingRecordStatus, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByDrugScreen(Object drugScreen, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByDrugScreenStatus(Object drugScreenStatus, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByAddress(Object address, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByCity(Object city, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByState(Object state, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByZipcode(Object zipcode, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByAllowPets(Object allowPets, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByAllowWheelchair(Object allowWheelchair, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByDutyStatus(Object dutyStatus, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByAppLanguage(Object appLanguage, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByDeviceToken(Object deviceToken, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByDeviceId(Object deviceId, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByMobileOs(Object mobileOs, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByObjectId(Object objectId, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByApprovableMail(Object approvableMail, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByBaseApproved(Object baseApproved, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findByStatus(Object status, int... rowStartIdxAndCount);
//
//	public List<TaxiDriver> findAll(int... rowStartIdxAndCount);

}