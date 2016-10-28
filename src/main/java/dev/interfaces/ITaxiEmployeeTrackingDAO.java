package dev.interfaces;

import dev.models.TaxiEmployeeTracking;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Interface for TaxiEmployeeTrackingDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiEmployeeTrackingDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiEmployeeTracking
	 * entity. All subsequent persist actions of this entity should use the
	 * #update() method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * 
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiEmployeeTrackingDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiEmployeeTracking entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiEmployeeTracking entity);

	/**
	 * Delete a persistent TaxiEmployeeTracking entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiEmployeeTrackingDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiEmployeeTracking entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiEmployeeTracking entity);

	/**
	 * Persist a previously saved TaxiEmployeeTracking entity and return it or a
	 * copy of it to the sender. A copy of the TaxiEmployeeTracking entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiEmployeeTrackingDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiEmployeeTracking entity to update
	 * @return TaxiEmployeeTracking the persisted TaxiEmployeeTracking entity
	 *         instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiEmployeeTracking update(TaxiEmployeeTracking entity);

	public TaxiEmployeeTracking findById(Integer id);

	/**
	 * Find all TaxiEmployeeTracking entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiEmployeeTracking property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiEmployeeTracking> found by query
	 */
	public List<TaxiEmployeeTracking> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiEmployeeTracking> findByEmployeeId(Object employeeId, int... rowStartIdxAndCount);

	public List<TaxiEmployeeTracking> findByCheckHistory(Object checkHistory, int... rowStartIdxAndCount);

	public List<TaxiEmployeeTracking> findByWorkingHours(Object workingHours, int... rowStartIdxAndCount);

	public List<TaxiEmployeeTracking> findByWorkSummary(Object workSummary, int... rowStartIdxAndCount);

	public List<TaxiEmployeeTracking> findByRoutePhoto(Object routePhoto, int... rowStartIdxAndCount);

	public List<TaxiEmployeeTracking> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiEmployeeTracking entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiEmployeeTracking> all TaxiEmployeeTracking entities
	 */
	public List<TaxiEmployeeTracking> findAll(int... rowStartIdxAndCount);
}