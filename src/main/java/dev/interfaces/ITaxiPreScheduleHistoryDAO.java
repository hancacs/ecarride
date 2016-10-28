package dev.interfaces;

import dev.models.TaxiPreScheduleHistory;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiPreScheduleHistoryDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiPreScheduleHistoryDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiPreScheduleHistory
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
	 * ITaxiPreScheduleHistoryDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPreScheduleHistory entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiPreScheduleHistory entity);

	/**
	 * Delete a persistent TaxiPreScheduleHistory entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiPreScheduleHistoryDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPreScheduleHistory entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiPreScheduleHistory entity);

	/**
	 * Persist a previously saved TaxiPreScheduleHistory entity and return it or
	 * a copy of it to the sender. A copy of the TaxiPreScheduleHistory entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiPreScheduleHistoryDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPreScheduleHistory entity to update
	 * @return TaxiPreScheduleHistory the persisted TaxiPreScheduleHistory
	 *         entity instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiPreScheduleHistory update(TaxiPreScheduleHistory entity);

	public TaxiPreScheduleHistory findById(Integer id);

	/**
	 * Find all TaxiPreScheduleHistory entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiPreScheduleHistory property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiPreScheduleHistory> found by query
	 */
	public List<TaxiPreScheduleHistory> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiPreScheduleHistory> findByUpdateTimes(Object updateTimes, int... rowStartIdxAndCount);

	public List<TaxiPreScheduleHistory> findByCountTimes(Object countTimes, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiPreScheduleHistory entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiPreScheduleHistory> all TaxiPreScheduleHistory entities
	 */
	public List<TaxiPreScheduleHistory> findAll(int... rowStartIdxAndCount);
}