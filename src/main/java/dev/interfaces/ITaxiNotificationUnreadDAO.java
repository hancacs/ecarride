package dev.interfaces;

import dev.models.TaxiNotificationUnread;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiNotificationUnreadDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiNotificationUnreadDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiNotificationUnread
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
	 * ITaxiNotificationUnreadDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiNotificationUnread entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiNotificationUnread entity);

	/**
	 * Delete a persistent TaxiNotificationUnread entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiNotificationUnreadDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiNotificationUnread entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiNotificationUnread entity);

	/**
	 * Persist a previously saved TaxiNotificationUnread entity and return it or
	 * a copy of it to the sender. A copy of the TaxiNotificationUnread entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiNotificationUnreadDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiNotificationUnread entity to update
	 * @return TaxiNotificationUnread the persisted TaxiNotificationUnread
	 *         entity instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiNotificationUnread update(TaxiNotificationUnread entity);

	public TaxiNotificationUnread findById(Integer id);

	/**
	 * Find all TaxiNotificationUnread entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiNotificationUnread property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiNotificationUnread> found by query
	 */
	public List<TaxiNotificationUnread> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiNotificationUnread> findByUserType(Object userType, int... rowStartIdxAndCount);

	public List<TaxiNotificationUnread> findByMobileOs(Object mobileOs, int... rowStartIdxAndCount);

	public List<TaxiNotificationUnread> findByNotification(Object notification, int... rowStartIdxAndCount);

	public List<TaxiNotificationUnread> findByResponse(Object response, int... rowStartIdxAndCount);

	public List<TaxiNotificationUnread> findByMessage(Object message, int... rowStartIdxAndCount);

	public List<TaxiNotificationUnread> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiNotificationUnread entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiNotificationUnread> all TaxiNotificationUnread entities
	 */
	public List<TaxiNotificationUnread> findAll(int... rowStartIdxAndCount);
}