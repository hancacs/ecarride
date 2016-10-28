package dev.interfaces;

import dev.models.TaxiFavoriteList;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiFavoriteListDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiFavoriteListDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiFavoriteList entity.
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
	 * ITaxiFavoriteListDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiFavoriteList entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiFavoriteList entity);

	/**
	 * Delete a persistent TaxiFavoriteList entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiFavoriteListDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiFavoriteList entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiFavoriteList entity);

	/**
	 * Persist a previously saved TaxiFavoriteList entity and return it or a
	 * copy of it to the sender. A copy of the TaxiFavoriteList entity parameter
	 * is returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiFavoriteListDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiFavoriteList entity to update
	 * @return TaxiFavoriteList the persisted TaxiFavoriteList entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiFavoriteList update(TaxiFavoriteList entity);

	public TaxiFavoriteList findById(Integer id);

	/**
	 * Find all TaxiFavoriteList entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiFavoriteList property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiFavoriteList> found by query
	 */
	public List<TaxiFavoriteList> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiFavoriteList> findByUserConfirmed(Object userConfirmed, int... rowStartIdxAndCount);

	public List<TaxiFavoriteList> findByDriverConfirmed(Object driverConfirmed, int... rowStartIdxAndCount);

	public List<TaxiFavoriteList> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiFavoriteList entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiFavoriteList> all TaxiFavoriteList entities
	 */
	public List<TaxiFavoriteList> findAll(int... rowStartIdxAndCount);
}