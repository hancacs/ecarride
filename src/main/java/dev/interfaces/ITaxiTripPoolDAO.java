package dev.interfaces;

import dev.models.TaxiTripPool;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiTripPoolDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiTripPoolDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiTripPool entity. All
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
	 * ITaxiTripPoolDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripPool entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiTripPool entity);

	/**
	 * Delete a persistent TaxiTripPool entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiTripPoolDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripPool entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiTripPool entity);

	/**
	 * Persist a previously saved TaxiTripPool entity and return it or a copy of
	 * it to the sender. A copy of the TaxiTripPool entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiTripPoolDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripPool entity to update
	 * @return TaxiTripPool the persisted TaxiTripPool entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiTripPool update(TaxiTripPool entity);

	public TaxiTripPool findById(Integer id);

	/**
	 * Find all TaxiTripPool entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiTripPool property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiTripPool> found by query
	 */
	public List<TaxiTripPool> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiTripPool> findByPickupLat(Object pickupLat, int... rowStartIdxAndCount);

	public List<TaxiTripPool> findByPickupLng(Object pickupLng, int... rowStartIdxAndCount);

	public List<TaxiTripPool> findByPickupLocation(Object pickupLocation, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiTripPool entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiTripPool> all TaxiTripPool entities
	 */
	public List<TaxiTripPool> findAll(int... rowStartIdxAndCount);
}