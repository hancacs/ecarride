package dev.interfaces;

import dev.models.TaxiVehicle;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Interface for TaxiVehicleDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiVehicleDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiVehicle entity. All
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
	 * ITaxiVehicleDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiVehicle entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiVehicle entity);

	/**
	 * Delete a persistent TaxiVehicle entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiVehicleDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiVehicle entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiVehicle entity);

	/**
	 * Persist a previously saved TaxiVehicle entity and return it or a copy of
	 * it to the sender. A copy of the TaxiVehicle entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiVehicleDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiVehicle entity to update
	 * @return TaxiVehicle the persisted TaxiVehicle entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiVehicle update(TaxiVehicle entity);

	public TaxiVehicle findById(Integer id);

	/**
	 * Find all TaxiVehicle entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiVehicle property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiVehicle> found by query
	 */
	public List<TaxiVehicle> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByDriverId(Object driverId, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByVin(Object vin, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByYear(Object year, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByBrand(Object brand, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByModel(Object model, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByVehicleLicenseState(Object vehicleLicenseState, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByProfilePhoto(Object profilePhoto, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByVehiclePlateNum(Object vehiclePlateNum, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByVehicleRegistration(Object vehicleRegistration, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByVehicleRegistrationStatus(Object vehicleRegistrationStatus,
                                                             int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByLiabilityInsurance(Object liabilityInsurance, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByLiabilityAmount(Object liabilityAmount, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByLiabilityEcarrideCertificateHolder(Object liabilityEcarrideCertificateHolder,
                                                                      int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByLiabilityEcarrideAdditionalInsured(Object liabilityEcarrideAdditionalInsured,
                                                                      int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByLiabilitySelfInsured(Object liabilitySelfInsured, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByLiabilityNameInsurer(Object liabilityNameInsurer, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByLiabilityInsuranceStatus(Object liabilityInsuranceStatus,
                                                            int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByExtraInsurance(Object extraInsurance, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByExtraInsuranceStatus(Object extraInsuranceStatus, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByVehicleTlcFhvLicense(Object vehicleTlcFhvLicense, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByVehicleTlcFhvLicenseNum(Object vehicleTlcFhvLicenseNum, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByVehicleTlcFhvLicenseStatus(Object vehicleTlcFhvLicenseStatus,
                                                              int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByVehicleInspection(Object vehicleInspection, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByVehicleInspectionStatus(Object vehicleInspectionStatus, int... rowStartIdxAndCount);

	public List<TaxiVehicle> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiVehicle entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiVehicle> all TaxiVehicle entities
	 */
	public List<TaxiVehicle> findAll(int... rowStartIdxAndCount);
}