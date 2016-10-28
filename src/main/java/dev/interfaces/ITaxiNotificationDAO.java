package dev.interfaces;

import dev.models.TaxiNotification;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiNotificationDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiNotificationDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiNotification entity.
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
	 * ITaxiNotificationDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiNotification entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiNotification entity);

	/**
	 * Delete a persistent TaxiNotification entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiNotificationDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiNotification entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiNotification entity);

	/**
	 * Persist a previously saved TaxiNotification entity and return it or a
	 * copy of it to the sender. A copy of the TaxiNotification entity parameter
	 * is returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiNotificationDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiNotification entity to update
	 * @return TaxiNotification the persisted TaxiNotification entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiNotification update(TaxiNotification entity);

	public TaxiNotification findById(Integer id);

	/**
	 * Find all TaxiNotification entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiNotification property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiNotification> found by query
	 */
	public List<TaxiNotification> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiNotification> findByUserType(Object userType, int... rowStartIdxAndCount);

	public List<TaxiNotification> findByNotification(Object notification, int... rowStartIdxAndCount);

	public List<TaxiNotification> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiNotification entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiNotification> all TaxiNotification entities
	 */
	public List<TaxiNotification> findAll(int... rowStartIdxAndCount);
}