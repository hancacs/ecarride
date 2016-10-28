package dev.interfaces;

import dev.models.TaxiPickup;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiPickupDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiPickupDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiPickup entity. All
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
	 * ITaxiPickupDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPickup entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiPickup entity);

	/**
	 * Delete a persistent TaxiPickup entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiPickupDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPickup entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiPickup entity);

	/**
	 * Persist a previously saved TaxiPickup entity and return it or a copy of
	 * it to the sender. A copy of the TaxiPickup entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiPickupDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPickup entity to update
	 * @return TaxiPickup the persisted TaxiPickup entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiPickup update(TaxiPickup entity);

	public TaxiPickup findById(Integer id);

	/**
	 * Find all TaxiPickup entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiPickup property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiPickup> found by query
	 */
	public List<TaxiPickup> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiPickup> findByBaseId(Object baseId, int... rowStartIdxAndCount);

	public List<TaxiPickup> findByCompanyId(Object companyId, int... rowStartIdxAndCount);

	public List<TaxiPickup> findByPickupLocation(Object pickupLocation, int... rowStartIdxAndCount);

	public List<TaxiPickup> findByDestinationLocation(Object destinationLocation, int... rowStartIdxAndCount);

	public List<TaxiPickup> findByLat(Object lat, int... rowStartIdxAndCount);

	public List<TaxiPickup> findByLng(Object lng, int... rowStartIdxAndCount);

	public List<TaxiPickup> findByUserId(Object userId, int... rowStartIdxAndCount);

	public List<TaxiPickup> findByDriverId(Object driverId, int... rowStartIdxAndCount);

	public List<TaxiPickup> findByWheelchair(Object wheelchair, int... rowStartIdxAndCount);

	public List<TaxiPickup> findByTaxiType(Object taxiType, int... rowStartIdxAndCount);

	public List<TaxiPickup> findByPickupStatus(Object pickupStatus, int... rowStartIdxAndCount);

	public List<TaxiPickup> findByComments(Object comments, int... rowStartIdxAndCount);

	public List<TaxiPickup> findByTime(Object time, int... rowStartIdxAndCount);

	public List<TaxiPickup> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiPickup entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiPickup> all TaxiPickup entities
	 */
	public List<TaxiPickup> findAll(int... rowStartIdxAndCount);
}