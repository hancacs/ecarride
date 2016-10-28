package dev.interfaces;

import dev.models.TaxiDriverFilter;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiDriverFilterDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiDriverFilterDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiDriverFilter entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * 
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiDriverFilterDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiDriverFilter entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiDriverFilter entity);

	/**
	 * Delete a persistent TaxiDriverFilter entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiDriverFilterDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiDriverFilter entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiDriverFilter entity);

	/**
	 * Persist a previously saved TaxiDriverFilter entity and return it or a
	 * copy of it to the sender. A copy of the TaxiDriverFilter entity parameter
	 * is returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiDriverFilterDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiDriverFilter entity to update
	 * @return TaxiDriverFilter the persisted TaxiDriverFilter entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiDriverFilter update(TaxiDriverFilter entity);

	public TaxiDriverFilter findById(Integer id);

	/**
	 * Find all TaxiDriverFilter entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiDriverFilter property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiDriverFilter> found by query
	 */
	public List<TaxiDriverFilter> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiDriverFilter> findByDriverId(Object driverId, int... rowStartIdxAndCount);

	public List<TaxiDriverFilter> findByLat(Object lat, int... rowStartIdxAndCount);

	public List<TaxiDriverFilter> findByLng(Object lng, int... rowStartIdxAndCount);

	public List<TaxiDriverFilter> findByDirection(Object direction, int... rowStartIdxAndCount);

	public List<TaxiDriverFilter> findByGender(Object gender, int... rowStartIdxAndCount);

	public List<TaxiDriverFilter> findByLanguage(Object language, int... rowStartIdxAndCount);

	public List<TaxiDriverFilter> findByReservedZipcode(Object reservedZipcode, int... rowStartIdxAndCount);

	public List<TaxiDriverFilter> findByDrivingExperience(Object drivingExperience, int... rowStartIdxAndCount);

	public List<TaxiDriverFilter> findByNationality(Object nationality, int... rowStartIdxAndCount);

	public List<TaxiDriverFilter> findByVehicleBrand(Object vehicleBrand, int... rowStartIdxAndCount);

	public List<TaxiDriverFilter> findByDutyStatus(Object dutyStatus, int... rowStartIdxAndCount);

	public List<TaxiDriverFilter> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiDriverFilter entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiDriverFilter> all TaxiDriverFilter entities
	 */
	public List<TaxiDriverFilter> findAll(int... rowStartIdxAndCount);
}