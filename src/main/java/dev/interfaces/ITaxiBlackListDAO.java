package dev.interfaces;

import dev.models.TaxiBlackList;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiBlackListDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiBlackListDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiBlackList entity. All
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
	 * ITaxiBlackListDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBlackList entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiBlackList entity);

	/**
	 * Delete a persistent TaxiBlackList entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiBlackListDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBlackList entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiBlackList entity);

	/**
	 * Persist a previously saved TaxiBlackList entity and return it or a copy
	 * of it to the sender. A copy of the TaxiBlackList entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiBlackListDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBlackList entity to update
	 * @return TaxiBlackList the persisted TaxiBlackList entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiBlackList update(TaxiBlackList entity);

	public TaxiBlackList findById(Integer id);

	/**
	 * Find all TaxiBlackList entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiBlackList property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiBlackList> found by query
	 */
	public List<TaxiBlackList> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiBlackList> findByType(Object type, int... rowStartIdxAndCount);

	public List<TaxiBlackList> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiBlackList entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiBlackList> all TaxiBlackList entities
	 */
	public List<TaxiBlackList> findAll(int... rowStartIdxAndCount);
}